package com.whatsapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlarmManager;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.location.Location;
import android.media.AsyncPlayer;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.util.LruCache;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import com.actionbarsherlock.R;
import com.amazon.device.messaging.ADM;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.fieldstats.a3;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.z;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.au;
import com.whatsapp.messaging.bt;
import com.whatsapp.notification.q;
import com.whatsapp.protocol.b9;
import com.whatsapp.protocol.c5;
import com.whatsapp.protocol.c7;
import com.whatsapp.protocol.cd;
import com.whatsapp.protocol.cn;
import com.whatsapp.protocol.cs;
import com.whatsapp.protocol.cz;
import com.whatsapp.protocol.m;
import com.whatsapp.protocol.t;
import com.whatsapp.util.Log;
import com.whatsapp.util.aq;
import com.whatsapp.util.at;
import com.whatsapp.util.b7;
import com.whatsapp.util.br;
import com.whatsapp.util.c;
import com.whatsapp.util.d;
import com.whatsapp.util.dns.b;
import com.whatsapp.util.y;
import de.greenrobot.event.g;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class App extends Application implements bt {
    private static boolean A;
    public static b C;
    public static final b7 D;
    private static Handler E;
    private static final boolean F;
    public static final int G;
    private static at4 H;
    private static final ArrayList I;
    static boolean J;
    private static boolean K;
    static boolean L;
    static atf M;
    public static final b7 N;
    static boolean O;
    public static ok P;
    public static LruCache R;
    public static boolean S;
    static boolean T;
    static int U;
    public static final AsyncPlayer V;
    private static long W;
    static Date X;
    private static final ArrayList Y;
    public static bd Z;
    public static d a;
    public static final wj a0;
    public static boolean a1;
    private static long a2;
    public static TelephonyManager a3;
    private static final ServiceConnection a4;
    static final boolean a5;
    public static boolean a7;
    private static final Handler a8;
    public static c aB;
    static int aC;
    static int aD;
    static int aE;
    public static boolean aF;
    public static boolean aG;
    public static Handler aH;
    static final Handler aI;
    public static l7 aJ;
    private static boolean aL;
    static ArrayList aM;
    static boolean aN;
    private static final ArrayList aO;
    private static final Uri aQ;
    static final ArrayList aR;
    public static w7 aT;
    static boolean aU;
    public static int aV;
    public static com.whatsapp.contact.c aW;
    public static w0 aX;
    static boolean aY;
    private static boolean aZ;
    public static final int aa;
    static final Handler ab;
    private static boolean ac;
    public static boolean ae;
    static boolean af;
    private static final Handler ag;
    public static ConnectivityManager ah;
    public static long ai;
    public static File aj;
    private static final HashMap ak;
    private static boolean al;
    public static Handler am;
    public static Me an;
    public static final File ao;
    private static final HashMap ap;
    private static long aq;
    static long ar;
    public static String as;
    static final Hashtable at;
    private static final ArrayList au;
    public static long av;
    private static final Handler aw;
    static boolean ax;
    private static long ay;
    public static int az;
    private static boolean b;
    private static final String[] bb;
    private static final ArrayList c;
    public static boolean d;
    public static ContentResolver e;
    private static final Object g;
    private static ho h;
    public static final b7 i;
    private static File j;
    public static t0 k;
    private static MessageService l;
    public static long m;
    static final Handler n;
    public static boolean o;
    public static App p;
    public static boolean q;
    public static c r;
    private static final y s;
    static final Handler t;
    public static final Object u;
    public static byte[] v;
    public static ActivityManager w;
    public static long x;
    public final DelayedRegistrationBroadcastReceiver B;
    final Set Q;
    public final f_ a6;
    private final jg aA;
    private final mo aK;
    private final AvailabilityTimeoutAlarmBroadcastReceiver aP;
    private HandlerThread aS;
    private Handler ad;
    final Set f;
    private WakeLock y;
    private final ale z;

    public class Me implements Serializable {
        private static final long serialVersionUID = -1952119322404952662L;
        public final String cc;
        public String jabber_id;
        public final String number;

        Me(String str, String str2) {
            this.cc = str;
            this.number = str2;
            this.jabber_id = null;
        }
    }

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 69;
                    break;
                case ay.f /*1*/:
                    i2 = 93;
                    break;
                case ay.n /*2*/:
                    i2 = 46;
                    break;
                case ay.p /*3*/:
                    i2 = 76;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }

    public static void e(String str, String str2, String str3) {
        try {
            if (ac) {
                l.b(au.f(str, str2, str3));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(Activity activity) {
        int i;
        int i2 = az;
        Iterator it = v.b().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            m8 b = v.b((String) it.next());
            try {
                i = 1;
                if (i2 == 0) {
                    i3 = i;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
            if (!b.e.contains(bb[127])) {
                a(b, activity);
                if (i2 == 0) {
                    i = i3;
                    if (i2 == 0) {
                        i3 = i;
                    }
                    break;
                }
            }
            break;
        }
        i = i3;
        try {
            break;
            aJ.b();
            activity.runOnUiThread(new amk());
            if (i != 0) {
                bd.h();
            }
            a(1, null);
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean o(com.whatsapp.protocol.b r4) {
        /*
        r0 = r4.e;	 Catch:{ NumberFormatException -> 0x001c }
        r0 = r0.c;	 Catch:{ NumberFormatException -> 0x001c }
        r0 = E(r0);	 Catch:{ NumberFormatException -> 0x001c }
        if (r0 == 0) goto L_0x0022;
    L_0x000a:
        r0 = r4.D;	 Catch:{ NumberFormatException -> 0x001e }
        r2 = com.whatsapp.ge.p;	 Catch:{ NumberFormatException -> 0x001e }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x0022;
    L_0x0012:
        r0 = com.whatsapp.ge.p;	 Catch:{ NumberFormatException -> 0x0020 }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0022;
    L_0x001a:
        r0 = 1;
    L_0x001b:
        return r0;
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = 0;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.o(com.whatsapp.protocol.b):boolean");
    }

    public static void a(Context context, String str, PlaceInfo placeInfo) {
        m8 b = v.b(str);
        com.whatsapp.protocol.b bVar = new com.whatsapp.protocol.b(b.e, (byte[]) null, new MediaData());
        try {
            bVar.D = a2();
            bVar.O = 1;
            bVar.j = (byte) 5;
            bVar.a = 1;
            bVar.K = placeInfo.lat;
            bVar.G = placeInfo.lon;
            bVar.t = placeInfo.url;
            bVar.H = placeInfo.name;
            if (placeInfo.address != null) {
                bVar.H += "\n" + placeInfo.address;
            }
            a(bVar, b);
            aJ.c(bVar, 2);
            a5w.a(new uk(context, bVar, placeInfo), new Void[0]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void d() {
        Log.i(bb[179]);
        aC();
    }

    static void a(String str, com.whatsapp.protocol.b bVar) {
        Log.i(str + bVar.e.a + " " + an.jabber_id + " " + bVar.e.c + " " + bVar.F);
    }

    public Handler U() {
        return aw;
    }

    void a7() {
        Log.w(bb[386]);
        getApplicationContext().stopService(new Intent(this, MessageService.class));
    }

    public static void a(int i, List list, boolean z, boolean z2, ConditionVariable conditionVariable, ConditionVariable conditionVariable2) {
        a(null, list, i, z, z2, conditionVariable, conditionVariable2);
    }

    private static Intent a(PackageManager packageManager, String str, String str2, String str3, Uri uri) {
        int i = az;
        HashSet hashSet = new HashSet();
        Intent intent = new Intent(bb[162]);
        intent.setType(bb[166]);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        int i2 = 0;
        while (i2 < size) {
            hashSet.add(((ResolveInfo) queryIntentActivities.get(i2)).activityInfo.name);
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        Intent intent2 = new Intent(bb[150]);
        intent2.setType(str3);
        List queryIntentActivities2 = packageManager.queryIntentActivities(intent2, 0);
        int size2 = queryIntentActivities2.size();
        ArrayList arrayList = new ArrayList();
        Intent intent3 = null;
        size = 0;
        while (size < size2) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivities2.get(size);
            if (!resolveInfo.activityInfo.name.contains(bb[163])) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                Log.i(activityInfo.applicationInfo.packageName + bb[158] + activityInfo.name);
                if (!hashSet.contains(activityInfo.name)) {
                    ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2 = new Intent(bb[157]);
                    try {
                        intent2.setType(str3);
                        intent2.setComponent(componentName);
                    } catch (NumberFormatException e) {
                        throw e;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                    if (resolveInfo.activityInfo.packageName.contains(bb[148]) && i == 0) {
                        intent = intent3;
                        intent3 = intent2;
                        i2 = size + 1;
                        if (i == 0) {
                            break;
                        }
                        size = i2;
                        intent2 = intent3;
                        intent3 = intent;
                    } else {
                        intent2.putExtra(bb[149], str);
                        intent2.putExtra(bb[165], str);
                        intent2.putExtra(bb[152], str2);
                        intent2.putExtra(bb[167], uri);
                        arrayList.add(intent2);
                    }
                }
                if (resolveInfo.activityInfo.name.equals(bb[155])) {
                    intent = intent2;
                    intent3 = intent2;
                    i2 = size + 1;
                    if (i == 0) {
                        break;
                    }
                    size = i2;
                    intent2 = intent3;
                    intent3 = intent;
                }
            }
            intent = intent3;
            intent3 = intent2;
            i2 = size + 1;
            if (i == 0) {
                break;
            }
            size = i2;
            intent2 = intent3;
            intent3 = intent;
        }
        intent = intent3;
        String replace = Build.MANUFACTURER.replace(' ', '_');
        replace = replace + "-" + Build.MODEL.replace(' ', '_');
        try {
            Log.i(bb[153] + replace);
            if (replace.equals(bb[154])) {
                Log.i(bb[159]);
                return intent;
            }
            Parcelable[] parcelableArr = new Parcelable[arrayList.size()];
            i2 = 0;
            while (i2 < parcelableArr.length) {
                parcelableArr[i2] = (Parcelable) arrayList.get(i2);
                i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            intent = new Intent(bb[156]);
            intent.setType(bb[161]);
            intent.putExtra(bb[160], str);
            intent.putExtra(bb[151], str2);
            intent.putExtra(bb[164], uri);
            intent = Intent.createChooser(intent, null);
            intent.putExtra(bb[168], parcelableArr);
            return intent;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    static void a(com.whatsapp.protocol.b bVar, int i, byte[] bArr) {
        try {
            if (ac) {
                l.b(au.a(bVar, i, bArr));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void au() {
        int i = az;
        Iterator it = aO.iterator();
        while (it.hasNext()) {
            ((s4) it.next()).a();
            if (i != 0) {
                return;
            }
        }
    }

    public static void b(Context context, String str, int i) {
        try {
            if (h != null) {
                h.f(str);
                try {
                    if (az == 0) {
                        return;
                    }
                }
            }
            a(context, str, i);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(String str, List list) {
        a(str, list, -1, true, false, null, null);
    }

    static void a(String str, String str2, String str3, boolean z) {
        m8 d = P.d(str3);
        try {
            if (d != null) {
                try {
                    if (d.q != z) {
                        d.q = z;
                        P.b(d);
                    }
                    l.b(au.a(str2, true, str));
                    if (az == 0) {
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            l.b(au.a(str2, false, str));
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void i(com.whatsapp.protocol.b bVar) {
        try {
            if (ac) {
                l.b(au.d(bVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.protocol.m r2, int r3) {
        /*
        r0 = ac;	 Catch:{ NumberFormatException -> 0x0017 }
        if (r0 == 0) goto L_0x0016;
    L_0x0004:
        r0 = com.whatsapp.a12.n();	 Catch:{ NumberFormatException -> 0x0019 }
        if (r0 == 0) goto L_0x0016;
    L_0x000a:
        switch(r3) {
            case 5: goto L_0x001b;
            case 8: goto L_0x001b;
            case 13: goto L_0x001b;
            default: goto L_0x000d;
        };
    L_0x000d:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0033 }
        r1 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0033 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0033 }
    L_0x0016:
        return;
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;
    L_0x001b:
        r0 = new com.whatsapp.a15;
        r1 = new com.whatsapp.ay;
        r1.<init>(r2, r3);
        r0.<init>(r1);
        r1 = l;	 Catch:{ NumberFormatException -> 0x0033 }
        r0 = com.whatsapp.messaging.au.a(r2, r3, r0);	 Catch:{ NumberFormatException -> 0x0033 }
        r1.b(r0);	 Catch:{ NumberFormatException -> 0x0033 }
        r0 = az;	 Catch:{ NumberFormatException -> 0x0033 }
        if (r0 == 0) goto L_0x0016;
    L_0x0032:
        goto L_0x000d;
    L_0x0033:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.protocol.m, int):void");
    }

    private static void s() {
        a5w.a(new akq(), new Void[0]);
    }

    private long b(long j) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(p.getFilesDir(), bb[325])));
            objectOutputStream.writeLong(j);
            objectOutputStream.close();
        } catch (IOException e) {
            Log.e(bb[326] + e.toString());
        }
        return j;
    }

    public static void g(com.whatsapp.protocol.b bVar) {
        int i = az;
        Iterator it = I.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).a(bVar);
            if (i != 0) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r5, java.util.Collection r6, int r7) {
        /*
        r1 = az;
        r0 = ac;	 Catch:{ NumberFormatException -> 0x0017 }
        if (r0 == 0) goto L_0x0016;
    L_0x0006:
        r0 = com.whatsapp.a12.n();	 Catch:{ NumberFormatException -> 0x0019 }
        if (r0 == 0) goto L_0x0016;
    L_0x000c:
        if (r5 == 0) goto L_0x0016;
    L_0x000e:
        if (r6 == 0) goto L_0x0016;
    L_0x0010:
        r0 = r6.size();	 Catch:{ NumberFormatException -> 0x001f }
        if (r0 != 0) goto L_0x0021;
    L_0x0016:
        return;
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;
    L_0x0021:
        r2 = new com.whatsapp.a15;
        r0 = new com.whatsapp.ad;
        r0.<init>(r5, r6, r7);
        r2.<init>(r0);
        r3 = new java.util.ArrayList;
        r0 = r6.size();
        r3.<init>(r0);
        r4 = r6.iterator();
    L_0x0038:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x004b;
    L_0x003e:
        r0 = r4.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r0 = r0.e;
        r3.add(r0);
        if (r1 == 0) goto L_0x0038;
    L_0x004b:
        r0 = l;
        r1 = com.whatsapp.messaging.au.a(r5, r3, r7, r2);
        r0.b(r1);
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.lang.String, java.util.Collection, int):void");
    }

    private static boolean g(Context context) {
        return context.getSharedPreferences(bb[348], 0).getBoolean(bb[347], false);
    }

    public static boolean aI() {
        try {
            return aa >= 2;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static int h(Context context) {
        return context.getSharedPreferences(bb[299], 0).getInt(bb[300], 6);
    }

    public static String r(Context context) {
        return context.getSharedPreferences(bb[364], 0).getString(bb[365], "");
    }

    public static void ae() {
        try {
            if (ac) {
                Log.i(bb[131]);
                l.b(au.l());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void g(String str) {
        if (ac) {
            Log.i(bb[349]);
            l.b(au.a(new mz(str, null, null, 57, null)));
        }
    }

    private void aE() {
        Editor edit = getSharedPreferences(bb[403], 0).edit();
        edit.remove(bb[402]);
        edit.remove(bb[404]);
        edit.commit();
    }

    public static long aB() {
        long v = aJ.v();
        return v != -1 ? v : v;
    }

    public static File m(String str) {
        File d = yf.d();
        if (str == null) {
            return d;
        }
        try {
            return new File(d, str);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static String e(String str) {
        String str2 = (String) ap.get(str);
        if (str2 != null) {
            return str2;
        }
        ap.put(str, str);
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(boolean r4) {
        /*
        r1 = 1;
        r2 = 0;
        r0 = de.greenrobot.event.g.b();
        r3 = com.whatsapp.nd.class;
        r0 = r0.b(r3);
        r0 = (com.whatsapp.nd) r0;
        if (r0 == 0) goto L_0x002a;
    L_0x0010:
        r0 = r0.a();	 Catch:{ NumberFormatException -> 0x0028 }
        if (r0 == 0) goto L_0x002a;
    L_0x0016:
        r0 = r1;
    L_0x0017:
        r3 = J;	 Catch:{ NumberFormatException -> 0x002c }
        if (r3 == 0) goto L_0x0036;
    L_0x001b:
        if (r4 == 0) goto L_0x0036;
    L_0x001d:
        r3 = aF;	 Catch:{ NumberFormatException -> 0x0030 }
        if (r3 != 0) goto L_0x0036;
    L_0x0021:
        r3 = d;	 Catch:{ NumberFormatException -> 0x0032 }
        if (r3 != 0) goto L_0x0036;
    L_0x0025:
        if (r0 == 0) goto L_0x0036;
    L_0x0027:
        return r1;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = r2;
        goto L_0x0017;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r1 = r2;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(boolean):boolean");
    }

    public static void b(Collection collection) {
        int i = az;
        String[] strArr = new String[collection.size()];
        int i2 = 0;
        for (m8 m8Var : collection) {
            int i3 = i2 + 1;
            strArr[i2] = m8Var.e;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        b(strArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r6, java.util.List r7, int r8, boolean r9, boolean r10, android.os.ConditionVariable r11, android.os.ConditionVariable r12) {
        /*
        r2 = new com.whatsapp.l3;
        r2.<init>(r11, r12, r8);
        r0 = ac;	 Catch:{ Exception -> 0x0021 }
        if (r0 == 0) goto L_0x001d;
    L_0x0009:
        if (r6 != 0) goto L_0x0015;
    L_0x000b:
        if (r7 == 0) goto L_0x001d;
    L_0x000d:
        r0 = r7.size();	 Catch:{ Exception -> 0x0025 }
        if (r0 != 0) goto L_0x0015;
    L_0x0013:
        if (r8 != 0) goto L_0x001d;
    L_0x0015:
        r0 = com.whatsapp.a12.n();	 Catch:{ Exception -> 0x0029 }
        if (r0 != 0) goto L_0x002f;
    L_0x001b:
        if (r10 != 0) goto L_0x002f;
    L_0x001d:
        r2.a();	 Catch:{ Exception -> 0x002d }
    L_0x0020:
        return;
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = new com.whatsapp.a_h;
        r1 = r7;
        r3 = r6;
        r4 = r8;
        r5 = r10;
        r0.<init>(r1, r2, r3, r4, r5);
        if (r9 == 0) goto L_0x0041;
    L_0x003a:
        r0.run();	 Catch:{ Exception -> 0x0068 }
        r1 = az;	 Catch:{ Exception -> 0x0068 }
        if (r1 == 0) goto L_0x0020;
    L_0x0041:
        com.whatsapp.util.br.a(r0);	 Catch:{ Exception -> 0x0045 }
        goto L_0x0020;
    L_0x0045:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = bb;
        r4 = 329; // 0x149 float:4.61E-43 double:1.625E-321;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r2.a();
        goto L_0x0020;
    L_0x0068:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.lang.String, java.util.List, int, boolean, boolean, android.os.ConditionVariable, android.os.ConditionVariable):void");
    }

    public static void b(mz mzVar) {
        try {
            if (ac) {
                Log.i(bb[369]);
                l.b(au.c(mzVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void onTerminate() {
        Log.i(bb[370]);
        super.onTerminate();
    }

    public static void a(String str, c5 c5Var, int i) {
        List arrayList = new ArrayList(1);
        arrayList.add(c5Var);
        a(str, arrayList, i);
    }

    public static void a(h2 h2Var) {
        try {
            if (ac) {
                Log.i(bb[270] + h2Var.a + "/" + h2Var.d);
                l.b(au.a(h2Var));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static boolean av() {
        return F();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r7, boolean r8, java.lang.String r9) {
        /*
        r0 = ac;
        if (r0 == 0) goto L_0x0029;
    L_0x0004:
        r4 = new java.util.Hashtable;
        r0 = at;
        r4.<init>(r0);
        if (r8 == 0) goto L_0x0014;
    L_0x000d:
        r4.put(r9, r9);	 Catch:{ NumberFormatException -> 0x002a }
        r0 = az;	 Catch:{ NumberFormatException -> 0x002a }
        if (r0 == 0) goto L_0x0017;
    L_0x0014:
        r4.remove(r9);	 Catch:{ NumberFormatException -> 0x002a }
    L_0x0017:
        r6 = l;
        r0 = new com.whatsapp.hm;
        r3 = 2;
        r1 = r7;
        r2 = r9;
        r5 = r8;
        r0.<init>(r1, r2, r3, r4, r5);
        r0 = com.whatsapp.messaging.au.a(r0);
        r6.b(r0);
    L_0x0029:
        return;
    L_0x002a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.app.Activity, boolean, java.lang.String):void");
    }

    public void onEvent(nd ndVar) {
        a(ndVar, (ky) g.b().b(ky.class));
    }

    public static void W() {
        int i = az;
        Iterator it = Y.iterator();
        while (it.hasNext()) {
            ((_2) it.next()).b();
            if (i != 0) {
                return;
            }
        }
    }

    private static void a(nd ndVar, ky kyVar) {
        try {
            if (ac) {
                try {
                    if (!a12.n()) {
                        return;
                    }
                    if (ndVar == null) {
                        try {
                            Log.w(bb[499]);
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    } else if (kyVar == null) {
                        try {
                            Log.w(bb[500]);
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    } else {
                        double d = ndVar.d();
                        if (d != Double.NaN) {
                            n2 a = a12.a((int) d, ndVar.b(), kyVar.a());
                            if (a != null) {
                                try {
                                    l.b(au.a(a));
                                } catch (NumberFormatException e22) {
                                    throw e22;
                                }
                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(com.whatsapp.m8 r6, android.app.Activity r7) {
        /*
        r0 = az;
        r1 = aR();	 Catch:{ ActivityNotFoundException -> 0x00bc }
        if (r1 == 0) goto L_0x008e;
    L_0x0008:
        r1 = r6.q;	 Catch:{ ActivityNotFoundException -> 0x00bc }
        if (r1 == 0) goto L_0x008e;
    L_0x000c:
        r1 = com.whatsapp.Voip.f();	 Catch:{ ActivityNotFoundException -> 0x00be }
        if (r1 == 0) goto L_0x0047;
    L_0x0012:
        r1 = r6.e;	 Catch:{ ActivityNotFoundException -> 0x00c0 }
        r2 = com.whatsapp.Voip.getPeerJid();	 Catch:{ ActivityNotFoundException -> 0x00c0 }
        r1 = r1.equals(r2);	 Catch:{ ActivityNotFoundException -> 0x00c0 }
        if (r1 == 0) goto L_0x0035;
    L_0x001e:
        r1 = new android.content.Intent;
        r2 = com.whatsapp.VoipActivity.class;
        r1.<init>(r7, r2);
        r2 = bb;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r3 = 395; // 0x18b float:5.54E-43 double:1.95E-321;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r3 = r6.e;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1.putExtra(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r7.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        if (r0 == 0) goto L_0x00bb;
    L_0x0035:
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r2 = 398; // 0x18e float:5.58E-43 double:1.966E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        r1 = 2131624277; // 0x7f0e0155 float:1.887573E38 double:1.053162325E-314;
        r2 = 0;
        b(r7, r1, r2);	 Catch:{ ActivityNotFoundException -> 0x00c2 }
        if (r0 == 0) goto L_0x00bb;
    L_0x0047:
        r1 = r6.C;	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        r2 = com.whatsapp.ar.ALLOW;	 Catch:{ ActivityNotFoundException -> 0x00c4 }
        if (r1 != r2) goto L_0x0077;
    L_0x004d:
        r1 = com.whatsapp.ge.l;	 Catch:{ ActivityNotFoundException -> 0x00c6 }
        r2 = r6.e;	 Catch:{ ActivityNotFoundException -> 0x00c6 }
        r1 = r1.a(r2);	 Catch:{ ActivityNotFoundException -> 0x00c6 }
        if (r1 == 0) goto L_0x0077;
    L_0x0057:
        r1 = new android.content.Intent;
        r2 = bb;
        r3 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        r2 = r2[r3];
        r3 = 0;
        r4 = p;
        r5 = com.whatsapp.VoiceService.class;
        r1.<init>(r2, r3, r4, r5);
        r2 = bb;
        r3 = 396; // 0x18c float:5.55E-43 double:1.956E-321;
        r2 = r2[r3];
        r3 = r6.e;
        r1.putExtra(r2, r3);
        r7.startService(r1);
        if (r0 == 0) goto L_0x00bb;
    L_0x0077:
        r1 = new android.content.Intent;
        r2 = com.whatsapp.VoipNotAllowedActivity.class;
        r1.<init>(r7, r2);
        r2 = bb;	 Catch:{ NumberFormatException -> 0x00c8 }
        r3 = 397; // 0x18d float:5.56E-43 double:1.96E-321;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00c8 }
        r3 = r6.e;	 Catch:{ NumberFormatException -> 0x00c8 }
        r1.putExtra(r2, r3);	 Catch:{ NumberFormatException -> 0x00c8 }
        r7.startActivity(r1);	 Catch:{ NumberFormatException -> 0x00c8 }
        if (r0 == 0) goto L_0x00bb;
    L_0x008e:
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r1 = bb;	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r2 = 394; // 0x18a float:5.52E-43 double:1.947E-321;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r2 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r3 = bb;	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r2 = r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r3 = r6.a();	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r2 = r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r2 = r2.toString();	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r2 = android.net.Uri.parse(r2);	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r0.<init>(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r7.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x00ca }
    L_0x00bb:
        return;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        throw r0;
    L_0x00ca:
        r0 = move-exception;
        r0 = bb;
        r1 = 399; // 0x18f float:5.59E-43 double:1.97E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        X();
        goto L_0x00bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(com.whatsapp.m8, android.app.Activity):void");
    }

    public static void d(Context context, int i) {
        Editor edit = context.getSharedPreferences(bb[318], 0).edit();
        try {
            edit.putInt(bb[319], i);
            if (!edit.commit()) {
                Log.e(bb[320]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static void am() {
        try {
            if (y() == null || !y().e()) {
                Log.i(bb[287]);
                Intent intent = new Intent(p.getApplicationContext(), OverlayAlert.class);
                intent.putExtra(bb[288], R.string.login_failure_password);
                intent.setFlags(268697600);
                p.startActivity(intent);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static String af() {
        try {
            return an == null ? null : an.jabber_id;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean H() {
        try {
            if (!aU()) {
                return false;
            }
            try {
                return ((ActivityManager) p.getSystemService(bb[313])).getDeviceConfigurationInfo().reqGlEsVersion >= 131072;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static int q(Context context) {
        return context.getSharedPreferences(bb[380], 0).getInt(bb[379], 6);
    }

    static void X() {
        b(p, (int) R.string.view_contact_unsupport, 0);
    }

    public static void A(String str) {
        try {
            if (ac) {
                l.b(au.f(str));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(vr vrVar) {
        try {
            if (ac) {
                Log.i(bb[502] + vrVar.a);
                l.b(au.a(vrVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void D(String str) {
        b(str, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(int r6) {
        /*
        r1 = 0;
        r3 = az;
        switch(r6) {
            case 0: goto L_0x002c;
            case 1: goto L_0x0012;
            case 2: goto L_0x001b;
            case 3: goto L_0x0024;
            default: goto L_0x0006;
        };
    L_0x0006:
        r0 = new java.lang.IllegalArgumentException;
        r1 = bb;
        r2 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0012:
        r0 = bb;
        r2 = 267; // 0x10b float:3.74E-43 double:1.32E-321;
        r2 = r0[r2];
        r0 = 7;
        if (r3 == 0) goto L_0x002f;
    L_0x001b:
        r0 = bb;
        r2 = 263; // 0x107 float:3.69E-43 double:1.3E-321;
        r2 = r0[r2];
        r0 = 1;
        if (r3 == 0) goto L_0x002f;
    L_0x0024:
        r0 = bb;
        r2 = 264; // 0x108 float:3.7E-43 double:1.304E-321;
        r0 = r0[r2];
        if (r3 == 0) goto L_0x002d;
    L_0x002c:
        return r1;
    L_0x002d:
        r2 = r0;
        r0 = r1;
    L_0x002f:
        r3 = p;
        r4 = bb;
        r5 = 265; // 0x109 float:3.71E-43 double:1.31E-321;
        r4 = r4[r5];
        r1 = r3.getSharedPreferences(r4, r1);
        r1 = r1.getInt(r2, r0);
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.c(int):int");
    }

    public static void a(String str, String str2, String str3, String[] strArr, int[] iArr, byte[][] bArr, int[] iArr2, byte[] bArr2, byte[] bArr3) {
        try {
            if (ac) {
                Log.i(bb[384]);
                l.b(au.a(str, str2, str3, strArr, iArr, bArr, iArr2, bArr2, bArr3));
                try {
                    if (az == 0) {
                        return;
                    }
                }
            }
            Log.e(bb[385]);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void I() {
        try {
            if (ac) {
                Log.w(bb[504]);
                l.b(au.j());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void h(String str) {
        try {
            if (!m8.d(str)) {
                try {
                    if (bd.b(str)) {
                        if (!ge.q) {
                            return;
                        }
                    }
                    try {
                        if (!P.h(str)) {
                            boolean a = aT.a(str);
                            try {
                                int i;
                                Handler handler = ab;
                                if (a) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                handler.obtainMessage(1, i, 0, e(str)).sendToTarget();
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                } catch (NumberFormatException e22) {
                    throw e22;
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            }
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r5, int r6) {
        /*
        r4_this = this;
        r0 = r4.y;	 Catch:{ NumberFormatException -> 0x000e }
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.acquire(r2);	 Catch:{ NumberFormatException -> 0x000e }
        r0 = com.whatsapp.m8.d(r5);	 Catch:{ NumberFormatException -> 0x000e }
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        return;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = com.whatsapp.bd.b(r5);	 Catch:{ NumberFormatException -> 0x0047 }
        if (r0 == 0) goto L_0x0027;
    L_0x0016:
        r0 = com.whatsapp.ge.q;	 Catch:{ NumberFormatException -> 0x0049 }
        if (r0 == 0) goto L_0x000d;
    L_0x001a:
        r0 = P;	 Catch:{ NumberFormatException -> 0x004b }
        r0 = r0.a(r5);	 Catch:{ NumberFormatException -> 0x004b }
        b(r0);	 Catch:{ NumberFormatException -> 0x004b }
        r0 = az;	 Catch:{ NumberFormatException -> 0x004b }
        if (r0 != 0) goto L_0x000d;
    L_0x0027:
        r0 = P;	 Catch:{ NumberFormatException -> 0x004d }
        r0 = r0.h(r5);	 Catch:{ NumberFormatException -> 0x004d }
        if (r0 != 0) goto L_0x000d;
    L_0x002f:
        r0 = aT;
        r0 = r0.a(r5);
        r1 = ab;	 Catch:{ NumberFormatException -> 0x004f }
        r2 = 3;
        if (r0 == 0) goto L_0x0051;
    L_0x003a:
        r0 = 1;
    L_0x003b:
        r3 = e(r5);
        r0 = r1.obtainMessage(r2, r0, r6, r3);
        r0.sendToTarget();
        goto L_0x000d;
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = 0;
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(java.lang.String, int):void");
    }

    public static boolean aT() {
        boolean z = true;
        if (VERSION.SDK_INT >= 9) {
            try {
                z = Environment.isExternalStorageRemovable();
            } catch (Exception e) {
                Log.w(bb[93] + e.toString());
            }
        }
        return z;
    }

    public static void aw() {
        try {
            if (ac) {
                Log.i(bb[115]);
                l.b(au.d());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public App() {
        this.aP = new AvailabilityTimeoutAlarmBroadcastReceiver();
        this.a6 = new f_(this);
        this.B = new DelayedRegistrationBroadcastReceiver();
        this.f = new HashSet();
        this.Q = new HashSet();
        this.aA = new jg(this);
        this.aK = new mo(this);
        this.z = new ale(this);
    }

    public static void e(Context context, String str) {
        Editor edit = context.getSharedPreferences(bb[279], 0).edit();
        try {
            edit.putString(bb[278], str);
            if (!edit.commit()) {
                Log.e(bb[277]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(Context context, File file, int i) {
        a(context, a(context.getPackageManager(), context.getString(R.string.share_email_subject, new Object[]{p(p), b(i)}), bb[280] + p.getString(R.string.share_email_body), a(i), Uri.fromFile(file)));
    }

    public static void a(int i, String str, long j) {
        try {
            if (ac) {
                try {
                    if (a12.n()) {
                        c7 c7Var = new c7(str, i, j);
                        l.b(au.a(c7Var, new a15(new aw(c7Var))));
                    }
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void f(mz mzVar) {
        try {
            if (ac) {
                Log.i(bb[178]);
                l.b(au.h(mzVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(com.whatsapp.protocol.bj r4) {
        /*
        r0 = r4.d;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x000e;
    L_0x0008:
        r0 = r4.d;
        r1 = az;
        if (r1 == 0) goto L_0x000f;
    L_0x000e:
        r0 = 0;
    L_0x000f:
        r1 = r4.b;
        r2 = r4.a;
        r3 = r4.e;
        b(r1, r2, r0, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(com.whatsapp.protocol.bj):void");
    }

    public void c() {
        int i = az;
        try {
            Log.i(bb[16]);
            ac = true;
            if (this.aS == null || !this.aS.isAlive()) {
                this.aS = new HandlerThread(bb[11]);
                this.aS.start();
            }
            long j = getSharedPreferences(bb[13], 0).getLong(bb[14], 0);
            try {
                if (86400000 + j < System.currentTimeMillis() || System.currentTimeMillis() < j) {
                    I();
                }
                try {
                    Iterator it;
                    if (g((Context) this)) {
                        ae();
                    }
                    synchronized (au) {
                        Log.i(bb[12] + au.size());
                        it = au.iterator();
                        while (it.hasNext()) {
                            l.b((Message) it.next());
                            if (i != 0) {
                                break;
                            }
                        }
                        au.clear();
                    }
                    synchronized (ak) {
                        Log.i(bb[15] + ak.size());
                        for (Message message : ak.values()) {
                            l.b(message);
                            if (i != 0) {
                                break;
                            }
                        }
                        ak.clear();
                    }
                    synchronized (u) {
                        if (aW != null) {
                            br.a(new t1(this, aW));
                            aW = null;
                        }
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    public static boolean aR() {
        return ge.n;
    }

    public static void a(byte[] bArr, byte[] bArr2, byte b, cz[] czVarArr, cz czVar) {
        if (ac) {
            String str = af() + bb[376];
            try {
                if (!p.f.contains(str)) {
                    l.b(au.a(bArr, bArr2, b, czVarArr, czVar));
                    p.f.add(str);
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    private static void h() {
        ADM adm = new ADM(p);
        try {
            if (adm.getRegistrationId() == null) {
                adm.startRegister();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static String b(int i) {
        switch (i) {
            case ay.f /*1*/:
                return p.getResources().getString(R.string.lowercase_image);
            case ay.n /*2*/:
                try {
                    return p.getResources().getString(R.string.lowercase_audio);
                } catch (NumberFormatException e) {
                    throw e;
                }
            case ay.p /*3*/:
                return p.getResources().getString(R.string.lowercase_video);
            default:
                return p.getResources().getString(R.string.file);
        }
    }

    public static void a(com.whatsapp.protocol.b bVar, m8 m8Var) {
        int i = az;
        if (m8Var.l()) {
            bVar.l = true;
            cs i2 = bd.i(m8Var.e);
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : i2.j()) {
                try {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append(str);
                    if (i != 0) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            bVar.J = m8Var.N;
            bVar.F = stringBuilder.toString();
        }
        try {
            if (!m8Var.w()) {
                if (!m8Var.l()) {
                    return;
                }
            }
            bVar.y = Integer.MAX_VALUE;
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static boolean aQ() {
        try {
            aC = ac.a(p);
            return aC > 0;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, String str2, String str3) {
        b(str, str2, null, str3);
    }

    public static void d(com.whatsapp.protocol.b bVar) {
        int i = az;
        Events$Call events$Call = new Events$Call();
        events$Call.callResult = Double.valueOf((double) z.MISSED.getCode());
        events$Call.callSide = Double.valueOf((double) a3.CALLEE.getCode());
        ak4.a(p, events$Call);
        Iterator it = I.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).c(bVar);
            if (i != 0) {
                return;
            }
        }
    }

    public void onEvent(bz bzVar) {
        try {
            if (b(bzVar.a())) {
                a5w.a(new jw(false), new Void[0]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(mz mzVar) {
        try {
            if (ac) {
                Log.i(bb[47]);
                l.b(au.i(mzVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean a(String str, long j, Messenger messenger) {
        try {
            if (!ac) {
                return false;
            }
            l.b(au.a(str, j, messenger));
            return true;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void c(String str, String str2, String str3, String str4) {
        try {
            if (ac) {
                Log.i(bb[284]);
                l.b(au.a(str, str2, str3, str4));
                try {
                    if (az == 0) {
                        return;
                    }
                }
            }
            Log.e(bb[285]);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static long B() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static void c(m8 m8Var) {
        List arrayList = new ArrayList(1);
        arrayList.add(m8Var);
        a(arrayList);
    }

    public static void a(Runnable runnable) {
        l.b(au.a(runnable));
    }

    static boolean h(boolean z) {
        ac = z;
        return z;
    }

    public void d(long j) {
        a2 = b(j);
    }

    private static boolean ac() {
        return aZ;
    }

    private static void a(Context context, String str, Location location, int i) {
        m8 b = v.b(str);
        com.whatsapp.protocol.b bVar = new com.whatsapp.protocol.b(b.e, (byte[]) null, new MediaData());
        try {
            bVar.D = a2();
            bVar.O = 1;
            bVar.j = (byte) 5;
            bVar.a = 1;
            if (location != null) {
                bVar.K = location.getLatitude();
                bVar.G = location.getLongitude();
            }
            a(bVar, b);
            aJ.c(bVar, 2);
            AsyncTask usVar = new us(context, bVar);
            usVar.k = i;
            a5w.a(usVar, new Void[0]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, String str2, String str3, int i) {
        a(str, str2, str3, null, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date aN() {
        /*
        r0 = -1;
        r1 = an;	 Catch:{ NumberFormatException -> 0x0043 }
        if (r1 == 0) goto L_0x0020;
    L_0x0005:
        r1 = an;	 Catch:{ NumberFormatException -> 0x0043 }
        r1 = r1.number;	 Catch:{ NumberFormatException -> 0x0043 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NumberFormatException -> 0x0043 }
        if (r1 != 0) goto L_0x0020;
    L_0x000f:
        r1 = an;	 Catch:{ NumberFormatException -> 0x0045 }
        r1 = r1.number;	 Catch:{ NumberFormatException -> 0x0045 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ NumberFormatException -> 0x0045 }
        r2 = r1.longValue();	 Catch:{ NumberFormatException -> 0x0045 }
        r4 = 7;
        r0 = r2 % r4;
        r0 = (int) r0;
    L_0x0020:
        r1 = aa;	 Catch:{ NumberFormatException -> 0x0065 }
        if (r1 != 0) goto L_0x0034;
    L_0x0024:
        if (r0 < 0) goto L_0x0034;
    L_0x0026:
        r1 = 6;
        if (r0 > r1) goto L_0x0034;
    L_0x0029:
        r0 = r0 + -3;
        r0 = (long) r0;
        r2 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r0 = r0 * r2;
        r2 = az;
        if (r2 == 0) goto L_0x0036;
    L_0x0034:
        r0 = 0;
    L_0x0036:
        r2 = new java.util.Date;
        r3 = com.whatsapp.d8.b;
        r4 = r3.getTime();
        r0 = r0 + r4;
        r2.<init>(r0);
        return r2;
    L_0x0043:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0045 }
    L_0x0045:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = an;
        r2 = r2.number;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x0020;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.aN():java.util.Date");
    }

    public static void b(m8 m8Var) {
        try {
            if (!m8.d(m8Var.e)) {
                try {
                    if (!m8Var.e.equals(bb[105])) {
                        try {
                            if (m8Var.w()) {
                                if (!ge.q) {
                                    return;
                                }
                            }
                            try {
                                if (!aT.b(m8Var.e)) {
                                    if (ac) {
                                        l.b(au.i(m8Var.e));
                                        aT.a(m8Var.e, true);
                                    }
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        } catch (NumberFormatException e22) {
                            throw e22;
                        } catch (NumberFormatException e222) {
                            throw e222;
                        }
                    }
                }
            }
        } catch (NumberFormatException e2222) {
            throw e2222;
        } catch (NumberFormatException e22222) {
            throw e22222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void C() {
        /*
        r1 = az;
        r0 = ah;
        r2 = r0.getAllNetworkInfo();
        r3 = new java.lang.StringBuilder;
        r0 = bb;
        r4 = 314; // 0x13a float:4.4E-43 double:1.55E-321;
        r0 = r0[r4];
        r3.<init>(r0);
        if (r2 == 0) goto L_0x0059;
    L_0x0015:
        r4 = r2.length;
        r0 = 0;
    L_0x0017:
        if (r0 >= r4) goto L_0x0050;
    L_0x0019:
        r5 = r2[r0];
        r6 = "\n";
        r6 = r3.append(r6);
        r7 = r5.toString();
        r6 = r6.append(r7);
        r7 = bb;
        r8 = 315; // 0x13b float:4.41E-43 double:1.556E-321;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r7 = r5.getType();
        r6 = r6.append(r7);
        r7 = bb;
        r8 = 316; // 0x13c float:4.43E-43 double:1.56E-321;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r5 = r5.getSubtype();
        r6.append(r5);
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0017;
    L_0x0050:
        r0 = r3.toString();	 Catch:{ NumberFormatException -> 0x0063 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0063 }
        if (r1 == 0) goto L_0x0062;
    L_0x0059:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0063 }
        r1 = 317; // 0x13d float:4.44E-43 double:1.566E-321;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0063 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0063 }
    L_0x0062:
        return;
    L_0x0063:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.C():void");
    }

    static Handler P() {
        return a8;
    }

    public static void v(String str) {
        try {
            if (aa == 3) {
                aw.post(new j2(str));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void r(com.whatsapp.protocol.b bVar) {
        a(bVar, 4);
    }

    public void e() {
        Log.i(bb[286]);
        g();
    }

    public static Me aq() {
        ClassNotFoundException e;
        IOException e2;
        Log.i(bb[44]);
        Me me;
        try {
            if (!new File(p.getFilesDir(), bb[46]).exists()) {
                return null;
            }
            ObjectInputStream objectInputStream = new ObjectInputStream(p.openFileInput(bb[43]));
            me = (Me) objectInputStream.readObject();
            try {
                objectInputStream.close();
                return me;
            } catch (ClassNotFoundException e3) {
                e = e3;
            } catch (IOException e4) {
                e2 = e4;
                Log.e(bb[45] + e2.toString());
                return me;
            }
        } catch (ClassNotFoundException e5) {
            ClassNotFoundException classNotFoundException = e5;
            me = null;
            e = classNotFoundException;
            Log.w(bb[42] + e.toString());
            return me;
        } catch (IOException e6) {
            IOException iOException = e6;
            me = null;
            e2 = iOException;
            Log.e(bb[45] + e2.toString());
            return me;
        }
    }

    public static void a(ho hoVar, String str) {
        try {
            if (hoVar != null) {
                hoVar.f(str);
                if (az == 0) {
                    return;
                }
            }
            b(p.getApplicationContext(), str, 0);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r5, com.whatsapp.protocol.b r6) {
        /*
        r4 = 0;
        r0 = az;
        r1 = android.os.Environment.getExternalStorageState();
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0046 }
        r3 = 91;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0046 }
        r2 = r1.equals(r2);	 Catch:{ NumberFormatException -> 0x0046 }
        if (r2 == 0) goto L_0x0020;
    L_0x0013:
        r2 = r5.isFinishing();	 Catch:{ NumberFormatException -> 0x0048 }
        if (r2 != 0) goto L_0x0045;
    L_0x0019:
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r5.showDialog(r2);	 Catch:{ NumberFormatException -> 0x004a }
        if (r0 == 0) goto L_0x0045;
    L_0x0020:
        r2 = bb;	 Catch:{ NumberFormatException -> 0x004c }
        r3 = 92;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x004c }
        r1 = r1.equals(r2);	 Catch:{ NumberFormatException -> 0x004c }
        if (r1 != 0) goto L_0x0039;
    L_0x002c:
        r1 = r5.isFinishing();	 Catch:{ NumberFormatException -> 0x004e }
        if (r1 != 0) goto L_0x0045;
    L_0x0032:
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r5.showDialog(r1);	 Catch:{ NumberFormatException -> 0x004e }
        if (r0 == 0) goto L_0x0045;
    L_0x0039:
        r0 = com.whatsapp.t7.a(r6, r4, r5);
        if (r0 == 0) goto L_0x0045;
    L_0x003f:
        r1 = 0;
        r1 = new java.lang.Void[r1];	 Catch:{ NumberFormatException -> 0x0050 }
        com.whatsapp.a5w.a(r0, r1);	 Catch:{ NumberFormatException -> 0x0050 }
    L_0x0045:
        return;
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
        throw r0;
    L_0x0050:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.app.Activity, com.whatsapp.protocol.b):void");
    }

    void O() {
        Calendar instance = Calendar.getInstance();
        try {
            if (instance.get(11) >= 4) {
                instance.add(5, 1);
            }
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 4);
            long timeInMillis = instance.getTimeInMillis();
            Log.i(bb[107] + new Date(timeInMillis).toString());
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(bb[108]).setPackage(bb[110]), 134217728);
            AlarmManager alarmManager = (AlarmManager) getSystemService(bb[109]);
            try {
                if (VERSION.SDK_INT >= 19) {
                    alarmManager.setExact(0, timeInMillis, broadcast);
                    if (az == 0) {
                        return;
                    }
                }
                alarmManager.set(0, timeInMillis, broadcast);
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String[] r6) {
        /*
        r1 = az;
        r0 = ac;
        if (r0 == 0) goto L_0x0045;
    L_0x0006:
        r2 = new java.util.ArrayList;
        r0 = r6.length;
        r2.<init>(r0);
        r3 = r6.length;
        r0 = 0;
    L_0x000e:
        if (r0 >= r3) goto L_0x002a;
    L_0x0010:
        r4 = r6[r0];
        r5 = p;	 Catch:{ NumberFormatException -> 0x0046 }
        r5 = r5.f;	 Catch:{ NumberFormatException -> 0x0046 }
        r5 = r5.contains(r4);	 Catch:{ NumberFormatException -> 0x0046 }
        if (r5 != 0) goto L_0x0026;
    L_0x001c:
        r2.add(r4);	 Catch:{ NumberFormatException -> 0x0046 }
        r5 = p;	 Catch:{ NumberFormatException -> 0x0046 }
        r5 = r5.f;	 Catch:{ NumberFormatException -> 0x0046 }
        r5.add(r4);	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x0026:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000e;
    L_0x002a:
        r0 = r2.isEmpty();	 Catch:{ NumberFormatException -> 0x0048 }
        if (r0 != 0) goto L_0x0045;
    L_0x0030:
        r1 = l;	 Catch:{ NumberFormatException -> 0x0048 }
        r0 = r2.size();	 Catch:{ NumberFormatException -> 0x0048 }
        r0 = new java.lang.String[r0];	 Catch:{ NumberFormatException -> 0x0048 }
        r0 = r2.toArray(r0);	 Catch:{ NumberFormatException -> 0x0048 }
        r0 = (java.lang.String[]) r0;	 Catch:{ NumberFormatException -> 0x0048 }
        r0 = com.whatsapp.messaging.au.c(r0);	 Catch:{ NumberFormatException -> 0x0048 }
        r1.b(r0);	 Catch:{ NumberFormatException -> 0x0048 }
    L_0x0045:
        return;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.lang.String[]):void");
    }

    public static void a(int i, String str) {
        a(i, str, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.String r4, int r5) {
        /*
        r1 = 0;
        r0 = com.whatsapp.m8.d(r4);	 Catch:{ NumberFormatException -> 0x0008 }
        if (r0 == 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = com.whatsapp.bd.b(r4);	 Catch:{ NumberFormatException -> 0x0040 }
        if (r0 == 0) goto L_0x0021;
    L_0x0010:
        r0 = com.whatsapp.ge.q;	 Catch:{ NumberFormatException -> 0x0042 }
        if (r0 == 0) goto L_0x0007;
    L_0x0014:
        r0 = P;	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = r0.a(r4);	 Catch:{ NumberFormatException -> 0x0044 }
        b(r0);	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = az;	 Catch:{ NumberFormatException -> 0x0044 }
        if (r0 != 0) goto L_0x0007;
    L_0x0021:
        r0 = P;	 Catch:{ NumberFormatException -> 0x0046 }
        r0 = r0.h(r4);	 Catch:{ NumberFormatException -> 0x0046 }
        if (r0 != 0) goto L_0x0007;
    L_0x0029:
        r0 = aT;
        r0 = r0.a(r4);
        r2 = ab;	 Catch:{ NumberFormatException -> 0x0048 }
        if (r0 == 0) goto L_0x004a;
    L_0x0033:
        r0 = 1;
    L_0x0034:
        r3 = e(r4);
        r0 = r2.obtainMessage(r1, r0, r5, r3);
        r0.sendToTarget();
        goto L_0x0007;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = r1;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.c(java.lang.String, int):void");
    }

    public static boolean a(int i, com.whatsapp.protocol.b bVar) {
        boolean z = false;
        int c = c(i);
        try {
            switch (bVar.j) {
                case PBE.MD5 /*0*/:
                case ay.f /*1*/:
                    return (c & 1) != 0;
                case ay.n /*2*/:
                    if ((c & 2) != 0) {
                        return true;
                    }
                    try {
                        if (bVar.w == 1) {
                            if (bVar.k <= 524288 || i == 1) {
                                z = true;
                            }
                            return z;
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    } catch (NumberFormatException e2) {
                        try {
                            throw e2;
                        } catch (NumberFormatException e22) {
                            throw e22;
                        }
                    }
                    break;
                case ay.p /*3*/:
                    return (c & 4) != 0;
            }
            return false;
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void c(java.lang.String r3, boolean r4) {
        /*
        r0 = P;
        r0 = r0.d(r3);
        r1 = aJ;	 Catch:{ NumberFormatException -> 0x0057 }
        r1.f(r3);	 Catch:{ NumberFormatException -> 0x0057 }
        if (r0 == 0) goto L_0x0056;
    L_0x000d:
        r1 = r0.w();	 Catch:{ NumberFormatException -> 0x0059 }
        if (r1 != 0) goto L_0x0019;
    L_0x0013:
        r1 = r0.l();	 Catch:{ NumberFormatException -> 0x005b }
        if (r1 == 0) goto L_0x001e;
    L_0x0019:
        r1 = P;	 Catch:{ NumberFormatException -> 0x005b }
        r1.k(r0);	 Catch:{ NumberFormatException -> 0x005b }
    L_0x001e:
        r1 = r0.w();	 Catch:{ NumberFormatException -> 0x005d }
        if (r1 == 0) goto L_0x002e;
    L_0x0024:
        r1 = p;	 Catch:{ NumberFormatException -> 0x005d }
        com.whatsapp.notification.t.d(r1, r3);	 Catch:{ NumberFormatException -> 0x005d }
        r1 = com.whatsapp.lh.b;	 Catch:{ NumberFormatException -> 0x005d }
        r1.b(r3);	 Catch:{ NumberFormatException -> 0x005d }
    L_0x002e:
        r1 = 1;
        r2 = 1;
        a(r0, r1, r2);	 Catch:{ NumberFormatException -> 0x005f }
        r1 = 0;
        r2 = 0;
        a(r1, r2);	 Catch:{ NumberFormatException -> 0x005f }
        r1 = r0.h;	 Catch:{ NumberFormatException -> 0x005f }
        if (r1 == 0) goto L_0x0048;
    L_0x003c:
        r1 = r0.w();	 Catch:{ NumberFormatException -> 0x0061 }
        if (r1 != 0) goto L_0x0048;
    L_0x0042:
        r1 = r0.l();	 Catch:{ NumberFormatException -> 0x0063 }
        if (r1 == 0) goto L_0x0050;
    L_0x0048:
        r1 = new com.whatsapp.e9;	 Catch:{ NumberFormatException -> 0x0063 }
        r1.<init>(r0);	 Catch:{ NumberFormatException -> 0x0063 }
        b(r1);	 Catch:{ NumberFormatException -> 0x0063 }
    L_0x0050:
        if (r4 == 0) goto L_0x0056;
    L_0x0052:
        r0 = 2;
        a(r0, r3);	 Catch:{ NumberFormatException -> 0x0065 }
    L_0x0056:
        return;
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.c(java.lang.String, boolean):void");
    }

    public static void a(String str, boolean z) {
        int i = az;
        Iterator it = Y.iterator();
        while (it.hasNext()) {
            ((_2) it.next()).a(str, z);
            if (i != 0) {
                return;
            }
        }
    }

    public static void a(String str, long j) {
        int i = az;
        if (str == null) {
            try {
                Log.e(bb[94]);
                return;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        Iterator it = I.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).a(str, j);
            if (i != 0) {
                return;
            }
        }
    }

    public static void b(byte[] bArr, byte[] bArr2) {
        try {
            if (ac) {
                l.b(au.a(bArr, bArr2));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean u(android.content.Context r6) {
        /*
        r0 = new java.io.File;
        r1 = r6.getFilesDir();
        r2 = bb;
        r3 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r2 = r2[r3];
        r0.<init>(r1, r2);
        r0 = r0.exists();
        if (r0 == 0) goto L_0x0036;
    L_0x0015:
        r1 = 0;
        r0 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x0045, all -> 0x005b }
        r2 = p;	 Catch:{ IOException -> 0x0045, all -> 0x005b }
        r3 = bb;	 Catch:{ IOException -> 0x0045, all -> 0x005b }
        r4 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0045, all -> 0x005b }
        r2 = r2.openFileInput(r3);	 Catch:{ IOException -> 0x0045, all -> 0x005b }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0045, all -> 0x005b }
        r1 = r0.readBoolean();	 Catch:{ IOException -> 0x006f }
        aL = r1;	 Catch:{ IOException -> 0x006f }
        if (r0 == 0) goto L_0x0032;
    L_0x002f:
        r0.close();	 Catch:{ IOException -> 0x0066 }
    L_0x0032:
        r0 = az;	 Catch:{ IOException -> 0x0064 }
        if (r0 == 0) goto L_0x0042;
    L_0x0036:
        r0 = bb;	 Catch:{ IOException -> 0x0064 }
        r1 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0064 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0064 }
        r0 = 0;
        aL = r0;	 Catch:{ IOException -> 0x0064 }
    L_0x0042:
        r0 = aL;
        return r0;
    L_0x0045:
        r0 = move-exception;
        r0 = r1;
    L_0x0047:
        r1 = bb;	 Catch:{ all -> 0x006a }
        r2 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r1 = r1[r2];	 Catch:{ all -> 0x006a }
        com.whatsapp.util.Log.w(r1);	 Catch:{ all -> 0x006a }
        r1 = 0;
        aL = r1;	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x0032;
    L_0x0055:
        r0.close();	 Catch:{ IOException -> 0x0059 }
        goto L_0x0032;
    L_0x0059:
        r0 = move-exception;
        goto L_0x0032;
    L_0x005b:
        r0 = move-exception;
    L_0x005c:
        if (r1 == 0) goto L_0x0061;
    L_0x005e:
        r1.close();	 Catch:{ IOException -> 0x0068, NumberFormatException -> 0x0062 }
    L_0x0061:
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = move-exception;
        goto L_0x0032;
    L_0x0068:
        r1 = move-exception;
        goto L_0x0061;
    L_0x006a:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x005c;
    L_0x006f:
        r1 = move-exception;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.u(android.content.Context):boolean");
    }

    public static void d(Context context, boolean z) {
        Editor edit = context.getSharedPreferences(bb[132], 0).edit();
        try {
            edit.putBoolean(bb[133], z);
            if (!edit.commit()) {
                Log.e(bb[134]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.m8 r6, boolean r7, boolean r8, com.whatsapp.protocol.m r9, int r10) {
        /*
        r0 = 0;
        r4 = 0;
        r1 = az;
        r2 = r6.a;	 Catch:{ NumberFormatException -> 0x005e }
        if (r2 > 0) goto L_0x000a;
    L_0x0008:
        if (r7 == 0) goto L_0x005d;
    L_0x000a:
        if (r10 >= 0) goto L_0x0010;
    L_0x000c:
        r6.a = r4;
        if (r1 == 0) goto L_0x0068;
    L_0x0010:
        r2 = aJ;
        r3 = r6.e;
        r2 = r2.B(r3);
        if (r2 == 0) goto L_0x0026;
    L_0x001a:
        r2 = r2.e;	 Catch:{ NumberFormatException -> 0x0062 }
        r2 = r2.equals(r9);	 Catch:{ NumberFormatException -> 0x0062 }
        if (r2 == 0) goto L_0x0026;
    L_0x0022:
        r6.a = r4;
        if (r1 == 0) goto L_0x0068;
    L_0x0026:
        r0 = aJ;
        r0 = r0.b(r9);
        if (r0 == 0) goto L_0x0039;
    L_0x002e:
        r2 = r6.a;	 Catch:{ NumberFormatException -> 0x0064 }
        if (r2 <= r10) goto L_0x0039;
    L_0x0032:
        r2 = r6.a;	 Catch:{ NumberFormatException -> 0x0066 }
        r2 = r2 - r10;
        r6.a = r2;	 Catch:{ NumberFormatException -> 0x0066 }
        if (r1 == 0) goto L_0x0068;
    L_0x0039:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0066 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0066 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0066 }
        r2 = 37;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0066 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0066 }
        r0 = r0.append(r9);	 Catch:{ NumberFormatException -> 0x0066 }
        r1 = " ";
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0066 }
        r0 = r0.append(r10);	 Catch:{ NumberFormatException -> 0x0066 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0066 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0066 }
    L_0x005d:
        return;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r1 = r6.a;	 Catch:{ NumberFormatException -> 0x0096 }
        if (r1 != 0) goto L_0x0075;
    L_0x006c:
        r1 = com.whatsapp.notification.q.c();	 Catch:{ NumberFormatException -> 0x0096 }
        r2 = r6.e;	 Catch:{ NumberFormatException -> 0x0096 }
        r1.c(r2);	 Catch:{ NumberFormatException -> 0x0096 }
    L_0x0075:
        r1 = com.whatsapp.notification.q.c();	 Catch:{ NumberFormatException -> 0x0094 }
        r2 = r6.e;	 Catch:{ NumberFormatException -> 0x0094 }
        r1.a(r2, r0);	 Catch:{ NumberFormatException -> 0x0094 }
        r1 = p;	 Catch:{ NumberFormatException -> 0x0094 }
        r1 = r1.U();	 Catch:{ NumberFormatException -> 0x0094 }
        r2 = new com.whatsapp.atn;	 Catch:{ NumberFormatException -> 0x0094 }
        r2.<init>(r6, r0);	 Catch:{ NumberFormatException -> 0x0094 }
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r1.postDelayed(r2, r4);	 Catch:{ NumberFormatException -> 0x0094 }
        if (r8 == 0) goto L_0x005d;
    L_0x0090:
        a(r6);	 Catch:{ NumberFormatException -> 0x0094 }
        goto L_0x005d;
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.m8, boolean, boolean, com.whatsapp.protocol.m, int):void");
    }

    public void a(Message message) {
        au.a(message, this.aA, Voip.h(), this.aK, this.z);
    }

    public static void an() {
        Message c = au.c();
        try {
            if (!bd.e) {
                bd.e = true;
                if (ac) {
                    Log.i(bb[282]);
                    l.b(c);
                    if (az == 0) {
                        return;
                    }
                }
                Log.i(bb[283]);
                synchronized (au) {
                    au.add(c);
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static boolean a(String str, cs csVar, cd cdVar, t tVar, b9 b9Var) {
        try {
            if (!ac) {
                return false;
            }
            l.b(au.a(str, csVar, cdVar, tVar, b9Var));
            return true;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a1() {
        try {
            if (ac) {
                Log.i(bb[533]);
                l.b(au.k());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void c(String str, String str2, String str3) {
        try {
            if (ac) {
                l.b(au.c(str, str2, str3));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(boolean z) {
        try {
            try {
                if (!ac) {
                    return;
                }
                if (a12.n()) {
                    l.b(au.a(z));
                    a(null, null, z, a12.k, a12.g, 0, null);
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.List r1) {
        /*
        r0 = ac;	 Catch:{ NumberFormatException -> 0x0013 }
        if (r0 == 0) goto L_0x0012;
    L_0x0004:
        r0 = com.whatsapp.a12.n();	 Catch:{ NumberFormatException -> 0x0015 }
        if (r0 == 0) goto L_0x0012;
    L_0x000a:
        if (r1 == 0) goto L_0x0012;
    L_0x000c:
        r0 = r1.size();	 Catch:{ NumberFormatException -> 0x0019 }
        if (r0 != 0) goto L_0x001b;
    L_0x0012:
        return;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;
    L_0x001b:
        r0 = new com.whatsapp.ez;
        r0.<init>(r1);
        com.whatsapp.util.br.a(r0);
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.util.List):void");
    }

    private static void b(com.whatsapp.contact.c cVar) {
        br.a(new ia(cVar));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void V() {
        /*
        r4 = 0;
        r0 = p;	 Catch:{ NumberFormatException -> 0x0051 }
        r0 = r0.E();	 Catch:{ NumberFormatException -> 0x0051 }
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0053;
    L_0x000c:
        r0 = 1;
    L_0x000d:
        r1 = an;	 Catch:{ NumberFormatException -> 0x0055 }
        if (r1 == 0) goto L_0x0050;
    L_0x0011:
        r1 = p;	 Catch:{ NumberFormatException -> 0x0057 }
        r1 = e(r1);	 Catch:{ NumberFormatException -> 0x0057 }
        r2 = 3;
        if (r1 != r2) goto L_0x0050;
    L_0x001a:
        r1 = p;	 Catch:{ NumberFormatException -> 0x0059 }
        r2 = r1.E();	 Catch:{ NumberFormatException -> 0x0059 }
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 < 0) goto L_0x0039;
    L_0x0024:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x005b }
        r1 = p;	 Catch:{ NumberFormatException -> 0x005b }
        r4 = r1.E();	 Catch:{ NumberFormatException -> 0x005b }
        r2 = r2 - r4;
        r1 = p;	 Catch:{ NumberFormatException -> 0x005b }
        r4 = com.whatsapp.contact.i.c(r1);	 Catch:{ NumberFormatException -> 0x005b }
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 < 0) goto L_0x0050;
    L_0x0039:
        r1 = com.whatsapp.contact.c.BACKGROUND_FULL;	 Catch:{ NumberFormatException -> 0x005d }
        b(r1);	 Catch:{ NumberFormatException -> 0x005d }
        if (r0 == 0) goto L_0x0050;
    L_0x0040:
        r0 = p;	 Catch:{ NumberFormatException -> 0x005d }
        com.whatsapp.accountsync.PerformSyncManager.c(r0);	 Catch:{ NumberFormatException -> 0x005d }
        r0 = p;	 Catch:{ NumberFormatException -> 0x005d }
        com.whatsapp.accountsync.PerformSyncManager.a(r0);	 Catch:{ NumberFormatException -> 0x005d }
        ae();	 Catch:{ NumberFormatException -> 0x005d }
        aw();	 Catch:{ NumberFormatException -> 0x005d }
    L_0x0050:
        return;
    L_0x0051:
        r0 = move-exception;
        throw r0;
    L_0x0053:
        r0 = 0;
        goto L_0x000d;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.V():void");
    }

    static void a(com.whatsapp.contact.c cVar) {
        b(cVar);
    }

    public static HashSet j() {
        ObjectInputStream objectInputStream;
        Throwable e;
        File file = new File(p.getFilesDir(), bb[268]);
        try {
            if (file.exists() && file.canRead()) {
                ObjectInputStream objectInputStream2 = null;
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    try {
                        Log.c(e);
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (Throwable e3) {
                                Log.c(e3);
                            }
                        }
                    } catch (Throwable th) {
                        e3 = th;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (Throwable e4) {
                                Log.c(e4);
                            } catch (ClassNotFoundException e5) {
                                throw e5;
                            }
                        }
                        throw e3;
                    }
                    return new HashSet();
                } catch (IOException e6) {
                    e3 = e6;
                    objectInputStream = null;
                    objectInputStream2 = objectInputStream;
                    Log.c(e3);
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    return new HashSet();
                }
                try {
                    HashSet hashSet = (HashSet) objectInputStream.readObject();
                    if (objectInputStream == null) {
                        return hashSet;
                    }
                    try {
                        objectInputStream.close();
                        return hashSet;
                    } catch (Throwable e42) {
                        Log.c(e42);
                        return hashSet;
                    } catch (ClassNotFoundException e52) {
                        throw e52;
                    }
                } catch (ClassNotFoundException e7) {
                    e3 = e7;
                    objectInputStream2 = objectInputStream;
                    Log.c(e3);
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    return new HashSet();
                } catch (IOException e8) {
                    e3 = e8;
                    objectInputStream2 = objectInputStream;
                    Log.c(e3);
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    return new HashSet();
                } catch (Throwable th2) {
                    e3 = th2;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    throw e3;
                }
            }
            return new HashSet();
        } catch (IOException e9) {
            throw e9;
        }
    }

    public void onEvent(ky kyVar) {
        a((nd) g.b().b(nd.class), kyVar);
    }

    static boolean n(com.whatsapp.protocol.b bVar) {
        m8 b = v.b(bVar.e.c);
        try {
            m8 a = b.w() ? bVar.F != null ? P.a(bVar.F) : null : b;
            return a(bVar, b, a);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static String t(Context context) {
        return context.getSharedPreferences(bb[247], 0).getString(bb[248], null);
    }

    public static void e(boolean z) {
        try {
            if (aL != z) {
                aL = z;
                M();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void d(boolean z) {
        try {
            if (ac) {
                a7 = z;
                l.b(au.c(z));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static boolean aV() {
        return ac;
    }

    private static boolean z() {
        try {
            Class.forName(bb[503]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void d(String str) {
        try {
            if (ac) {
                l.b(au.c(str));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static void S() {
        try {
            try {
                Intent intent;
                if (!ag() && G == 2) {
                    intent = new Intent(p, IncorrectAppReleaseVersionActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra(bb[7], 1);
                    p.startActivity(intent);
                    if (az == 0) {
                        return;
                    }
                }
                if (ag() && G != 2) {
                    intent = new Intent(p, IncorrectAppReleaseVersionActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra(bb[6], 2);
                    p.startActivity(intent);
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void b(int i, String str) {
        a(i, str, null);
    }

    public static void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e(bb[281] + e.toString());
            b(context, (int) R.string.activity_not_found, 0);
        }
    }

    private static void aM() {
        int i = az;
        try {
            PackageManager packageManager = p.getPackageManager();
            if (packageManager != null) {
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(1152);
                if (installedApplications != null) {
                    StringBuilder stringBuilder = new StringBuilder(bb[296]);
                    Object arrayList = new ArrayList();
                    for (ApplicationInfo applicationInfo : installedApplications) {
                        arrayList.add(applicationInfo.packageName);
                        if (i != 0) {
                            break;
                        }
                    }
                    Collections.sort(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        stringBuilder.append(" ").append((String) it.next());
                        if (i != 0) {
                            return;
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.e(bb[295] + e.toString());
        }
    }

    private static boolean m(Context context) {
        return context.getSharedPreferences(bb[332], 0).getBoolean(bb[333], false);
    }

    public static boolean a() {
        try {
            if (ah == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = ah.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            try {
                return activeNetworkInfo.isConnected();
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void D() {
        /*
        r0 = az;
        r1 = an;	 Catch:{ NumberFormatException -> 0x002c }
        if (r1 == 0) goto L_0x0016;
    L_0x0006:
        r1 = P;	 Catch:{ NumberFormatException -> 0x002e }
        r1 = r1.j();	 Catch:{ NumberFormatException -> 0x002e }
        if (r1 == 0) goto L_0x0016;
    L_0x000e:
        com.whatsapp.b1.h();	 Catch:{ NumberFormatException -> 0x0030 }
        v();	 Catch:{ NumberFormatException -> 0x0030 }
        if (r0 == 0) goto L_0x002b;
    L_0x0016:
        r1 = an;	 Catch:{ NumberFormatException -> 0x0032 }
        if (r1 == 0) goto L_0x0028;
    L_0x001a:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0034 }
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0034 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0034 }
        com.whatsapp.b1.d();	 Catch:{ NumberFormatException -> 0x0034 }
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        com.whatsapp.b1.h();	 Catch:{ NumberFormatException -> 0x0034 }
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.D():void");
    }

    private static void ap() {
        try {
            if (ac) {
                if (!(al || a12.a())) {
                    PowerManager powerManager = (PowerManager) p.getSystemService(bb[273]);
                    if (powerManager != null) {
                        WakeLock newWakeLock = powerManager.newWakeLock(1, bb[271]);
                        if (newWakeLock != null) {
                            try {
                                newWakeLock.acquire(3000);
                                Log.i(bb[272]);
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                    }
                    l.p();
                }
            }
            v.i();
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void a(com.whatsapp.protocol.b bVar) {
        try {
            if (bVar.j != null) {
                bVar.A = new MediaData();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean a(HashSet hashSet) {
        ObjectOutputStream objectOutputStream;
        Throwable e;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(p.getFilesDir(), bb[135])));
            try {
                objectOutputStream.writeObject(hashSet);
                if (objectOutputStream == null) {
                    return true;
                }
                try {
                    objectOutputStream.close();
                    return true;
                } catch (Throwable e2) {
                    Log.c(e2);
                    return true;
                } catch (NumberFormatException e3) {
                    throw e3;
                }
            } catch (IOException e4) {
                e = e4;
                try {
                    Log.c(e);
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable e5) {
                            Log.c(e5);
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    e5 = th;
                    objectOutputStream2 = objectOutputStream;
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (Throwable e22) {
                            Log.c(e22);
                        } catch (NumberFormatException e32) {
                            throw e32;
                        }
                    }
                    throw e5;
                }
            }
        } catch (IOException e6) {
            e5 = e6;
            objectOutputStream = null;
            Log.c(e5);
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            return false;
        } catch (Throwable th2) {
            e5 = th2;
            if (objectOutputStream2 != null) {
                objectOutputStream2.close();
            }
            throw e5;
        }
    }

    public static void b(String str, String str2, String str3, boolean z) {
        try {
            if (ac) {
                Log.i(bb[390]);
                l.b(au.a(str, str2, str3, z));
                try {
                    if (az == 0) {
                        return;
                    }
                }
            }
            Log.e(bb[391]);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(Context context, boolean z) {
        Editor edit = context.getSharedPreferences(bb[505], 0).edit();
        try {
            edit.putBoolean(bb[507], z);
            if (!edit.commit()) {
                Log.e(bb[506]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void f(boolean r2) {
        /*
        r1 = 1;
        r0 = aE;	 Catch:{ NumberFormatException -> 0x0039 }
        if (r0 == r1) goto L_0x0038;
    L_0x0005:
        r0 = aE;	 Catch:{ NumberFormatException -> 0x003b }
        r1 = 2;
        if (r0 != r1) goto L_0x001a;
    L_0x000a:
        r0 = p;	 Catch:{ NumberFormatException -> 0x003d }
        r0 = r0.aP;	 Catch:{ NumberFormatException -> 0x003d }
        r1 = p;	 Catch:{ NumberFormatException -> 0x003d }
        r0.c(r1);	 Catch:{ NumberFormatException -> 0x003d }
        r0 = 1;
        aE = r0;	 Catch:{ NumberFormatException -> 0x003d }
        r0 = az;	 Catch:{ NumberFormatException -> 0x003d }
        if (r0 == 0) goto L_0x0038;
    L_0x001a:
        if (r2 == 0) goto L_0x0038;
    L_0x001c:
        r0 = 1;
        aE = r0;	 Catch:{ NumberFormatException -> 0x0041 }
        r0 = aG;	 Catch:{ NumberFormatException -> 0x0041 }
        if (r0 == 0) goto L_0x0043;
    L_0x0023:
        r0 = a1;	 Catch:{ NumberFormatException -> 0x0047 }
        if (r0 != 0) goto L_0x0038;
    L_0x0027:
        r0 = ac;	 Catch:{ NumberFormatException -> 0x0049 }
        if (r0 == 0) goto L_0x0038;
    L_0x002b:
        r0 = new com.whatsapp.messaging.bm;	 Catch:{ NumberFormatException -> 0x0049 }
        r1 = p;	 Catch:{ NumberFormatException -> 0x0049 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0049 }
        r1 = 0;
        r1 = new java.lang.Void[r1];	 Catch:{ NumberFormatException -> 0x0049 }
        com.whatsapp.a5w.a(r0, r1);	 Catch:{ NumberFormatException -> 0x0049 }
    L_0x0038:
        return;
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        aA();
        goto L_0x0023;
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.f(boolean):void");
    }

    public void f(String str) {
        try {
            this.y.release();
            if (!m8.d(str)) {
                boolean a = aT.a(str);
                try {
                    int i;
                    Handler handler = ab;
                    if (a) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    handler.obtainMessage(4, i, 0, e(str)).sendToTarget();
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void c(mz mzVar) {
        try {
            if (ac) {
                Log.i(bb[117]);
                l.b(au.b(mzVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void b(anq com_whatsapp_anq) {
        try {
            if (!c.contains(com_whatsapp_anq)) {
                c.add(com_whatsapp_anq);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static File aK() {
        return j;
    }

    public static void k() {
        f(false);
    }

    public static void a5() {
        MemoryInfo memoryInfo = new MemoryInfo();
        w.getMemoryInfo(memoryInfo);
        Log.i(bb[31] + Formatter.formatFileSize(p.getApplicationContext(), memoryInfo.availMem) + bb[21] + Formatter.formatFileSize(p.getApplicationContext(), memoryInfo.threshold) + bb[19] + memoryInfo.lowMemory);
        long freeMemory = Runtime.getRuntime().freeMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        long j = totalMemory - freeMemory;
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        long j2 = nativeHeapFreeSize + nativeHeapAllocatedSize;
        Log.i(bb[18] + (Runtime.getRuntime().maxMemory() / 1024) + bb[22] + w.getMemoryClass() + bb[27]);
        Log.i(bb[29] + (j2 / 1024) + bb[24] + (nativeHeapAllocatedSize / 1024) + bb[26] + (nativeHeapFreeSize / 1024) + bb[20]);
        Log.i(bb[25] + (totalMemory / 1024) + bb[23] + (j / 1024) + bb[30] + (freeMemory / 1024) + bb[28]);
    }

    public static boolean at() {
        boolean z = true;
        try {
            if (w == null) {
                return false;
            }
            try {
                List runningTasks = w.getRunningTasks(1);
                try {
                    boolean z2;
                    if (runningTasks != null) {
                        if (runningTasks.size() > 0) {
                            if (((RunningTaskInfo) runningTasks.get(0)).baseActivity.toString().contains(bb[126])) {
                                z2 = true;
                                return z2;
                            }
                        }
                    }
                    z2 = false;
                    return z2;
                } catch (NullPointerException e) {
                    throw e;
                } catch (NullPointerException e2) {
                    try {
                        throw e2;
                    } catch (NullPointerException e22) {
                        throw e22;
                    }
                }
            } catch (NullPointerException e3) {
                try {
                    if (aE != 1) {
                        z = false;
                    }
                    return z;
                } catch (NullPointerException e222) {
                    throw e222;
                }
            }
        } catch (NullPointerException e2222) {
            throw e2222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r7, android.net.Uri r8, java.lang.String r9) {
        /*
        r6 = 0;
        r1 = az;
        r2 = new android.content.Intent;
        r0 = bb;
        r3 = 98;
        r0 = r0[r3];
        r2.<init>(r0);
        r2.setData(r8);
        r0 = r7.getPackageManager();
        r3 = r0.queryIntentActivities(r2, r6);
        r0 = r3.isEmpty();	 Catch:{ NumberFormatException -> 0x0090 }
        if (r0 != 0) goto L_0x0086;
    L_0x001f:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0090 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0090 }
        r4 = bb;	 Catch:{ NumberFormatException -> 0x0090 }
        r5 = 96;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0090 }
        r4 = r3.size();	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0090 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0090 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0090 }
        r4 = 19;
        if (r0 < r4) goto L_0x0063;
    L_0x0043:
        r0 = android.provider.Telephony.Sms.getDefaultSmsPackage(r7);
        r4 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x0092 }
        if (r4 != 0) goto L_0x0052;
    L_0x004d:
        r2.setPackage(r0);	 Catch:{ NumberFormatException -> 0x0092 }
        if (r1 == 0) goto L_0x0061;
    L_0x0052:
        r0 = r3.get(r6);
        r0 = (android.content.pm.ResolveInfo) r0;
        r0 = r0.activityInfo;
        r4 = r0.packageName;
        r0 = r0.name;
        r2.setClassName(r4, r0);
    L_0x0061:
        if (r1 == 0) goto L_0x0072;
    L_0x0063:
        r0 = r3.get(r6);
        r0 = (android.content.pm.ResolveInfo) r0;
        r0 = r0.activityInfo;
        r3 = r0.packageName;
        r0 = r0.name;
        r2.setClassName(r3, r0);
    L_0x0072:
        r0 = android.text.TextUtils.isEmpty(r9);	 Catch:{ NumberFormatException -> 0x0094 }
        if (r0 != 0) goto L_0x0081;
    L_0x0078:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0094 }
        r3 = 97;
        r0 = r0[r3];	 Catch:{ NumberFormatException -> 0x0094 }
        r2.putExtra(r0, r9);	 Catch:{ NumberFormatException -> 0x0094 }
    L_0x0081:
        r7.startActivity(r2);	 Catch:{ NumberFormatException -> 0x0096 }
        if (r1 == 0) goto L_0x008f;
    L_0x0086:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0096 }
        r1 = 95;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0096 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0096 }
    L_0x008f:
        return;
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.app.Activity, android.net.Uri, java.lang.String):void");
    }

    public static boolean G() {
        return true;
    }

    public static void a(av4 com_whatsapp_av4) {
        try {
            if (ac) {
                l.b(au.a(com_whatsapp_av4));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void b(_2 _2) {
        Y.remove(_2);
    }

    public static boolean ax() {
        try {
            if (T) {
                return true;
            }
            T = new Date().after(aN());
            return T;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static Me d(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(bb[337], 0);
        return new Me(sharedPreferences.getString(bb[338], null), sharedPreferences.getString(bb[339], null));
    }

    public static void b(ho hoVar) {
        h = hoVar;
    }

    static void u(String str) {
        int i = az;
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((anq) it.next()).b(str);
            if (i != 0) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(java.lang.String r3, boolean r4) {
        /*
        r0 = ac;	 Catch:{ NumberFormatException -> 0x0015 }
        if (r0 == 0) goto L_0x0014;
    L_0x0004:
        r0 = com.whatsapp.a12.n();	 Catch:{ NumberFormatException -> 0x0017 }
        if (r0 != 0) goto L_0x000c;
    L_0x000a:
        if (r4 == 0) goto L_0x0014;
    L_0x000c:
        if (r3 == 0) goto L_0x0014;
    L_0x000e:
        r0 = com.whatsapp.m8.d(r3);	 Catch:{ NumberFormatException -> 0x001d }
        if (r0 != 0) goto L_0x001f;
    L_0x0014:
        return;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;
    L_0x001f:
        r0 = new java.util.ArrayList;
        r1 = com.whatsapp.bd.i(r3);
        r1 = r1.j();
        r0.<init>(r1);
        r1 = new com.whatsapp.a15;
        r2 = new com.whatsapp.a0;
        r2.<init>(r3, r4);
        r1.<init>(r2);
        r2 = l;
        r0 = com.whatsapp.messaging.au.a(r3, r0, r1);
        r2.b(r0);
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.d(java.lang.String, boolean):void");
    }

    public static void b(String str, String str2) {
        try {
            if (ac) {
                Log.i(bb[530] + str + " " + str2);
                l.b(au.l(str, str2));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean a(com.whatsapp.contact.c cVar, String str, int i, boolean z, ArrayList arrayList) {
        try {
            if (!ac) {
                return false;
            }
            l.b(au.a(cVar, str, i, z, arrayList));
            return true;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static boolean p() {
        boolean z;
        bz bzVar = (bz) g.b().b(bz.class);
        if (bzVar != null) {
            try {
            } catch (NumberFormatException e) {
                throw e;
            }
            if (bzVar.a()) {
                z = true;
                return b(z);
            }
        }
        z = false;
        return b(z);
    }

    public static void a(String str, String str2, b9 b9Var) {
        e(new mz(str, str2, null, 15, b9Var));
    }

    static void b(asm com_whatsapp_asm) {
        I.remove(com_whatsapp_asm);
    }

    public static void r() {
        try {
            if (aE == 1) {
                aE = 2;
                p.aP.b(p);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static void a(String str, String str2, String str3, String str4, int i) {
        try {
            if (ac) {
                if (!(a12.n() || str == null)) {
                    int d;
                    boolean z;
                    String o = a12.o();
                    String country = Locale.getDefault().getCountry();
                    String language = Locale.getDefault().getLanguage();
                    boolean is24HourFormat = DateFormat.is24HourFormat(p);
                    nd ndVar = (nd) g.b().b(nd.class);
                    ky kyVar = (ky) g.b().b(ky.class);
                    if (ndVar != null) {
                        try {
                            d = (int) ndVar.d();
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                    d = 0;
                    if (ndVar != null) {
                        try {
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                        if (ndVar.b()) {
                            z = true;
                            l.b(au.a(str, str2, str4, str3, o, i, d, z, kyVar.a(), country, language, is24HourFormat));
                        }
                    }
                    z = false;
                    l.b(au.a(str, str2, str4, str3, o, i, d, z, kyVar.a(), country, language, is24HourFormat));
                }
            }
            if (i == 0 || i == 1) {
                try {
                    a12.f(str2);
                    y(null);
                    b(null);
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    public static boolean t() {
        try {
            Class.forName(bb[147]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static void q() {
        b(p, (int) R.string.unimplemented, 0);
    }

    private static void v() {
        SharedPreferences sharedPreferences = p.getSharedPreferences(bb[254], 0);
        try {
            if (sharedPreferences != null) {
                int i = sharedPreferences.getInt(bb[256], 0);
                try {
                    Log.i(bb[255] + i);
                    if (i == 1) {
                        Log.i(bb[253]);
                        b(com.whatsapp.contact.c.INTERACTIVE_FULL);
                        if (az == 0) {
                            return;
                        }
                    }
                    br.a(new fx());
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        }
    }

    public static void a8() {
        int i = az;
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((anq) it.next()).a();
            if (i != 0) {
                return;
            }
        }
    }

    public static void ao() {
        Log.i(bb[102]);
        new File(p.getFilesDir(), bb[103]).delete();
    }

    public static void i() {
        try {
            if (ac) {
                l.b(au.g());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, int i) {
        try {
            if (i == 500 || i == 501 || i == 503) {
                try {
                    aq = System.currentTimeMillis() + 3600000;
                    if (az == 0) {
                        return;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            if (i == 401 && str != null) {
                l(str);
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public static void s(String str) {
        as = str;
        aY = true;
        q(af() + bb[358]);
    }

    public static void a(Context context, String str, int i) {
        Toast makeText = Toast.makeText(context.getApplicationContext(), str, i);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8, java.lang.String r9, long r10, java.lang.String r12) {
        /*
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0074 }
        r1 = 343; // 0x157 float:4.8E-43 double:1.695E-321;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0074 }
        r1 = 0;
        r2 = 3;
        r2 = new java.lang.Object[r2];	 Catch:{ NumberFormatException -> 0x0074 }
        r3 = 0;
        r2[r3] = r8;	 Catch:{ NumberFormatException -> 0x0074 }
        r3 = 1;
        r4 = com.whatsapp.a12.k;	 Catch:{ NumberFormatException -> 0x0074 }
        r2[r3] = r4;	 Catch:{ NumberFormatException -> 0x0074 }
        r3 = 2;
        r4 = java.lang.Boolean.valueOf(r7);	 Catch:{ NumberFormatException -> 0x0074 }
        r2[r3] = r4;	 Catch:{ NumberFormatException -> 0x0074 }
        com.whatsapp.util.Log.a(r0, r1, r2);	 Catch:{ NumberFormatException -> 0x0074 }
        r0 = com.whatsapp.a12.n();	 Catch:{ NumberFormatException -> 0x0074 }
        if (r0 == 0) goto L_0x003f;
    L_0x0022:
        r0 = com.whatsapp.a12.k;	 Catch:{ NumberFormatException -> 0x0076 }
        r0 = r0.equals(r8);	 Catch:{ NumberFormatException -> 0x0076 }
        if (r0 == 0) goto L_0x003f;
    L_0x002a:
        r0 = ab;	 Catch:{ NumberFormatException -> 0x0076 }
        r1 = 5;
        r0.removeMessages(r1);	 Catch:{ NumberFormatException -> 0x0076 }
        r0 = ab;	 Catch:{ NumberFormatException -> 0x0076 }
        r1 = 3;
        r0.removeMessages(r1);	 Catch:{ NumberFormatException -> 0x0076 }
        r0 = ab;	 Catch:{ NumberFormatException -> 0x0076 }
        r1 = 4;
        r0.removeMessages(r1);	 Catch:{ NumberFormatException -> 0x0076 }
        com.whatsapp.a12.b(r7);	 Catch:{ NumberFormatException -> 0x0076 }
    L_0x003f:
        if (r8 == 0) goto L_0x0054;
    L_0x0041:
        r0 = com.whatsapp.a12.k;	 Catch:{ NumberFormatException -> 0x0078 }
        r0 = r8.equals(r0);	 Catch:{ NumberFormatException -> 0x0078 }
        if (r0 != 0) goto L_0x0054;
    L_0x0049:
        if (r9 == 0) goto L_0x0054;
    L_0x004b:
        if (r7 == 0) goto L_0x0054;
    L_0x004d:
        com.whatsapp.a12.g(r9);	 Catch:{ NumberFormatException -> 0x007e }
        r0 = az;	 Catch:{ NumberFormatException -> 0x007e }
        if (r0 == 0) goto L_0x005f;
    L_0x0054:
        if (r8 != 0) goto L_0x005f;
    L_0x0056:
        if (r12 == 0) goto L_0x005f;
    L_0x0058:
        if (r9 == 0) goto L_0x005f;
    L_0x005a:
        if (r7 == 0) goto L_0x005f;
    L_0x005c:
        com.whatsapp.a12.c(r9, r12);	 Catch:{ NumberFormatException -> 0x0086 }
    L_0x005f:
        if (r9 == 0) goto L_0x006a;
    L_0x0061:
        r0 = 0;
        r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x006a;
    L_0x0067:
        com.whatsapp.a12.a(r10, r9);	 Catch:{ NumberFormatException -> 0x0088 }
    L_0x006a:
        r0 = bb;
        r1 = 344; // 0x158 float:4.82E-43 double:1.7E-321;
        r0 = r0[r1];
        a(r6, r5, r0);
        return;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;
    L_0x0088:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, long, java.lang.String):void");
    }

    private static void a(Context context, boolean z, long j) {
        Editor edit = context.getSharedPreferences(bb[113], 0).edit();
        try {
            edit.putBoolean(bb[111], z);
            edit.putLong(bb[112], j);
            if (!edit.commit()) {
                Log.e(bb[114]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static Object ay() {
        return g;
    }

    public static void K() {
        try {
            if (ac) {
                l.b(au.e());
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static boolean aU() {
        try {
            if (VERSION.SDK_INT > 7) {
                if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(p) == 0) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(String str, byte[] bArr) {
        try {
            if (l != null) {
                l.a(str, bArr);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(Context context, String str) {
        Editor edit = context.getSharedPreferences(bb[527], 0).edit();
        try {
            edit.putString(bb[525], str);
            if (!edit.commit()) {
                Log.e(bb[526]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void d(String str, String str2, String str3) {
        m8 b = v.b(str);
        com.whatsapp.protocol.b bVar = new com.whatsapp.protocol.b(b.e, str3, null);
        bVar.D = a2();
        bVar.O = 0;
        bVar.j = (byte) 4;
        bVar.H = str2;
        a(bVar, b);
        aJ.f(bVar);
    }

    void ar() {
        Log.i(bb[374]);
        try {
            if (new File(getFilesDir(), bb[373]).exists()) {
                ObjectInputStream objectInputStream = new ObjectInputStream(openFileInput(bb[371]));
                an = (Me) objectInputStream.readObject();
                objectInputStream.close();
            }
        } catch (ClassNotFoundException e) {
            Log.w(bb[372] + e.toString());
        } catch (IOException e2) {
            Log.e(bb[375] + e2.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(com.whatsapp.protocol.b r6, com.whatsapp.m8 r7, com.whatsapp.m8 r8) {
        /*
        r3 = 2;
        r1 = 0;
        r2 = 1;
        r0 = r6.j;	 Catch:{ NumberFormatException -> 0x000c }
        if (r0 != r3) goto L_0x0010;
    L_0x0007:
        r0 = r6.w;	 Catch:{ NumberFormatException -> 0x000e }
        if (r0 != r2) goto L_0x0010;
    L_0x000b:
        return r2;
    L_0x000c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x000e }
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = r6.j;	 Catch:{ NumberFormatException -> 0x006b }
        if (r0 == r2) goto L_0x001d;
    L_0x0014:
        r0 = r6.j;	 Catch:{ NumberFormatException -> 0x006d }
        if (r0 == r3) goto L_0x001d;
    L_0x0018:
        r0 = r6.j;	 Catch:{ NumberFormatException -> 0x006f }
        r3 = 3;
        if (r0 != r3) goto L_0x008c;
    L_0x001d:
        r0 = r7.w();	 Catch:{ NumberFormatException -> 0x006f }
        if (r0 == 0) goto L_0x0084;
    L_0x0023:
        r0 = P;
        r3 = r7.f();
        r3 = r0.a(r3);
        r0 = an;	 Catch:{ NumberFormatException -> 0x0071 }
        if (r0 == 0) goto L_0x0073;
    L_0x0031:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0071 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0071 }
        r4 = an;	 Catch:{ NumberFormatException -> 0x0071 }
        r4 = r4.jabber_id;	 Catch:{ NumberFormatException -> 0x0071 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0071 }
        r4 = bb;	 Catch:{ NumberFormatException -> 0x0071 }
        r5 = 67;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0071 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0071 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0071 }
    L_0x004c:
        r4 = r7.e;	 Catch:{ NumberFormatException -> 0x0076 }
        r4 = com.whatsapp.bd.a(r4);	 Catch:{ NumberFormatException -> 0x0076 }
        if (r4 != 0) goto L_0x0068;
    L_0x0054:
        if (r3 == 0) goto L_0x0062;
    L_0x0056:
        r4 = r3.h;	 Catch:{ NumberFormatException -> 0x007a }
        if (r4 != 0) goto L_0x0068;
    L_0x005a:
        r3 = r3.e;	 Catch:{ NumberFormatException -> 0x007c }
        r0 = r0.equals(r3);	 Catch:{ NumberFormatException -> 0x007c }
        if (r0 != 0) goto L_0x0068;
    L_0x0062:
        if (r8 == 0) goto L_0x0082;
    L_0x0064:
        r0 = r8.h;	 Catch:{ NumberFormatException -> 0x0080 }
        if (r0 == 0) goto L_0x0082;
    L_0x0068:
        r0 = r2;
    L_0x0069:
        r2 = r0;
        goto L_0x000b;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = "";
        goto L_0x004c;
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = r1;
        goto L_0x0069;
    L_0x0084:
        r0 = r7.h;	 Catch:{ NumberFormatException -> 0x008a }
        if (r0 != 0) goto L_0x000b;
    L_0x0088:
        r2 = r1;
        goto L_0x000b;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r2 = r1;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.protocol.b, com.whatsapp.m8, com.whatsapp.m8):boolean");
    }

    public static void aJ() {
        J = true;
    }

    public static void d(Context context, String str) {
        a(context, str, (Location) null);
    }

    public static void b(String str, String str2, String str3) {
        try {
            if (ac) {
                l.b(au.j(str, str2, str3));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void d(mz mzVar) {
        try {
            if (ac) {
                Log.i(bb[269]);
                l.b(au.d(mzVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void w() {
        try {
            if (ag()) {
                H.a();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void g(mz mzVar) {
        try {
            if (ac) {
                Log.i(bb[17]);
                l.b(au.f(mzVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public boolean x() {
        boolean z = true;
        try {
            if (X == null) {
                Date date = new Date();
                if (date.before(new Date((d8.b.getTime() - 10368000000L) - 172800000))) {
                    try {
                        X = date;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                z = date.after(new Date(d8.b.getTime() + 31536000000L));
                if (z) {
                    try {
                        X = date;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
            }
            return z;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    String L() {
        String string = getSharedPreferences(bb[356], 0).getString(bb[355], null);
        if (string == null) {
            return null;
        }
        String[] split = string.split(bb[357]);
        try {
            if (split.length != 2) {
                Log.c(bb[353], null, new Object[]{string});
                a((Context) this, null, 0);
                return null;
            }
            try {
                if (Long.parseLong(split[1]) > System.currentTimeMillis()) {
                    return split[0];
                }
                a((Context) this, null, 0);
                return null;
            } catch (NumberFormatException e) {
                Log.c(bb[354], null, new Object[]{split[1]});
                a((Context) this, null, 0);
                return null;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void c(android.app.Activity r19) {
        /*
        r4 = az;
        r5 = r19.getPackageManager();
        r6 = new java.util.ArrayList;
        r6.<init>();
        r7 = new java.util.HashSet;
        r7.<init>();
        r1 = new android.content.Intent;
        r2 = bb;
        r3 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r2 = r2[r3];
        r1.<init>(r2);
        r2 = bb;
        r3 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r2 = r2[r3];
        r1 = r1.setType(r2);
        r2 = bb;
        r3 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;
        r2 = r2[r3];
        r3 = 2131625017; // 0x7f0e0439 float:1.887723E38 double:1.0531626907E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];
        r9 = 0;
        r10 = bb;
        r11 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r10 = r10[r11];
        r8[r9] = r10;
        r0 = r19;
        r3 = r0.getString(r3, r8);
        r1 = r1.putExtra(r2, r3);
        r2 = new android.content.Intent;
        r3 = bb;
        r8 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r3 = r3[r8];
        r2.<init>(r3);
        r3 = bb;
        r8 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r3 = r3[r8];
        r2 = r2.setType(r3);
        r3 = bb;
        r8 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r3 = r3[r8];
        r8 = " ";
        r2 = r2.putExtra(r3, r8);
        r3 = bb;
        r8 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        r3 = r3[r8];
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = 2131625015; // 0x7f0e0437 float:1.8877226E38 double:1.0531626897E-314;
        r10 = 1;
        r10 = new java.lang.Object[r10];
        r11 = 0;
        r12 = bb;
        r13 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r12 = r12[r13];
        r10[r11] = r12;
        r0 = r19;
        r9 = r0.getString(r9, r10);
        r8 = r8.append(r9);
        r9 = bb;
        r10 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r8 = r8.toString();
        r2 = r2.putExtra(r3, r8);
        r3 = bb;
        r8 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r3 = r3[r8];
        r8 = 2131625016; // 0x7f0e0438 float:1.8877228E38 double:1.05316269E-314;
        r0 = r19;
        r8 = r0.getString(r8);
        r2 = r2.putExtra(r3, r8);
        r3 = 2;
        r8 = new android.content.Intent[r3];
        r3 = 0;
        r8[r3] = r1;
        r1 = 1;
        r8[r1] = r2;
        r2 = 0;
        r1 = 0;
        r3 = r1;
        r1 = r2;
    L_0x00bb:
        r2 = r8.length;
        if (r3 >= r2) goto L_0x044a;
    L_0x00be:
        r9 = r8[r3];
        r2 = 0;
        r2 = r5.queryIntentActivities(r9, r2);
        if (r2 == 0) goto L_0x0342;
    L_0x00c7:
        r10 = r2.iterator();
        r2 = r1;
    L_0x00cc:
        r1 = r10.hasNext();
        if (r1 == 0) goto L_0x0343;
    L_0x00d2:
        r1 = r10.next();
        r1 = (android.content.pm.ResolveInfo) r1;
        r1 = r1.activityInfo;
        r11 = r1.name;
        r1 = r1.applicationInfo;
        r12 = r1.packageName;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r13 = bb;
        r14 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r13 = r13[r14];
        r1 = r1.append(r13);
        r1 = r1.append(r3);
        r13 = bb;
        r14 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r13 = r13[r14];
        r1 = r1.append(r13);
        r1 = r1.append(r12);
        r13 = bb;
        r14 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r13 = r13[r14];
        r1 = r1.append(r13);
        r1 = r1.append(r11);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = bb;
        r13 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r1 = r1[r13];
        r1 = r12.contains(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0122:
        r1 = bb;
        r13 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x012e:
        r1 = bb;
        r13 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x013a:
        r1 = bb;
        r13 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0146:
        r1 = bb;
        r13 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0152:
        r1 = bb;
        r13 = 246; // 0xf6 float:3.45E-43 double:1.215E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x015e:
        r1 = bb;
        r13 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x016a:
        r1 = bb;
        r13 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0176:
        r1 = bb;
        r13 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0182:
        r1 = bb;
        r13 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x018e:
        r1 = bb;
        r13 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x019a:
        r1 = bb;
        r13 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x01a6:
        r1 = bb;
        r13 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x01b2:
        r1 = bb;
        r13 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x01be:
        r1 = bb;
        r13 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x01ca:
        r1 = bb;
        r13 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x01d6:
        r1 = bb;
        r13 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x01e2:
        r1 = bb;
        r13 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x01ee:
        r1 = bb;
        r13 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x01fa:
        r1 = bb;
        r13 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0206:
        r1 = bb;
        r13 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0212:
        r1 = bb;
        r13 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x021e:
        r1 = bb;
        r13 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x022a:
        r1 = bb;
        r13 = 245; // 0xf5 float:3.43E-43 double:1.21E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0236:
        r1 = bb;
        r13 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0242:
        r1 = bb;
        r13 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x024e:
        r1 = bb;
        r13 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x025a:
        r1 = bb;
        r13 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0266:
        r1 = bb;
        r13 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r1 = r1[r13];
        r1 = r12.equals(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x0272:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0428 }
        r13 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r1 = r1[r13];	 Catch:{ NumberFormatException -> 0x0428 }
        r1 = r12.equals(r1);	 Catch:{ NumberFormatException -> 0x0428 }
        if (r1 == 0) goto L_0x0280;
    L_0x027e:
        if (r4 == 0) goto L_0x00cc;
    L_0x0280:
        r1 = r9.clone();
        r1 = (android.content.Intent) r1;
        r1.setClassName(r12, r11);	 Catch:{ NumberFormatException -> 0x042a }
        r1.setPackage(r12);	 Catch:{ NumberFormatException -> 0x042a }
        r13 = bb;	 Catch:{ NumberFormatException -> 0x042a }
        r14 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x042a }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x042a }
        if (r13 != 0) goto L_0x02ec;
    L_0x0298:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x042c }
        r14 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x042c }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x042c }
        if (r13 != 0) goto L_0x02ec;
    L_0x02a4:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x042e }
        r14 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x042e }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x042e }
        if (r13 != 0) goto L_0x02ec;
    L_0x02b0:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0430 }
        r14 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0430 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0430 }
        if (r13 != 0) goto L_0x02ec;
    L_0x02bc:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0432 }
        r14 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0432 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0432 }
        if (r13 != 0) goto L_0x02ec;
    L_0x02c8:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0434 }
        r14 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0434 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0434 }
        if (r13 != 0) goto L_0x02ec;
    L_0x02d4:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0436 }
        r14 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0436 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0436 }
        if (r13 != 0) goto L_0x02ec;
    L_0x02e0:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x0438 }
        r14 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x0438 }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x0438 }
        if (r13 == 0) goto L_0x030d;
    L_0x02ec:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x043a }
        r14 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x043a }
        r14 = 2131625017; // 0x7f0e0439 float:1.887723E38 double:1.0531626907E-314;
        r15 = 1;
        r15 = new java.lang.Object[r15];	 Catch:{ NumberFormatException -> 0x043a }
        r16 = 0;
        r17 = bb;	 Catch:{ NumberFormatException -> 0x043a }
        r18 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r17 = r17[r18];	 Catch:{ NumberFormatException -> 0x043a }
        r15[r16] = r17;	 Catch:{ NumberFormatException -> 0x043a }
        r0 = r19;
        r14 = r0.getString(r14, r15);	 Catch:{ NumberFormatException -> 0x043a }
        r1.putExtra(r13, r14);	 Catch:{ NumberFormatException -> 0x043a }
        if (r4 == 0) goto L_0x0328;
    L_0x030d:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x043c }
        r14 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x043c }
        r13 = r12.equals(r13);	 Catch:{ NumberFormatException -> 0x043c }
        if (r13 == 0) goto L_0x0328;
    L_0x0319:
        r13 = bb;	 Catch:{ NumberFormatException -> 0x043c }
        r14 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r13 = r13[r14];	 Catch:{ NumberFormatException -> 0x043c }
        r14 = bb;	 Catch:{ NumberFormatException -> 0x043c }
        r15 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r14 = r14[r15];	 Catch:{ NumberFormatException -> 0x043c }
        r1.putExtra(r13, r14);	 Catch:{ NumberFormatException -> 0x043c }
    L_0x0328:
        r13 = r7.contains(r12);	 Catch:{ NumberFormatException -> 0x043e }
        if (r13 != 0) goto L_0x0451;
    L_0x032e:
        r6.add(r1);	 Catch:{ NumberFormatException -> 0x043e }
        r7.add(r12);	 Catch:{ NumberFormatException -> 0x043e }
        r12 = bb;	 Catch:{ NumberFormatException -> 0x043e }
        r13 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r12 = r12[r13];	 Catch:{ NumberFormatException -> 0x043e }
        r11 = r11.equals(r12);	 Catch:{ NumberFormatException -> 0x043e }
        if (r11 == 0) goto L_0x0451;
    L_0x0340:
        if (r4 == 0) goto L_0x0454;
    L_0x0342:
        r2 = r1;
    L_0x0343:
        r1 = r3 + 1;
        if (r4 == 0) goto L_0x044d;
    L_0x0347:
        r1 = r6.size();	 Catch:{ NumberFormatException -> 0x0440 }
        if (r1 != 0) goto L_0x0367;
    L_0x034d:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0440 }
        r3 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x0440 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ NumberFormatException -> 0x0440 }
        r1 = p;	 Catch:{ NumberFormatException -> 0x0440 }
        r3 = p;	 Catch:{ NumberFormatException -> 0x0440 }
        r5 = 2131624286; // 0x7f0e015e float:1.8875747E38 double:1.0531623296E-314;
        r3 = r3.getString(r5);	 Catch:{ NumberFormatException -> 0x0440 }
        r5 = 0;
        b(r1, r3, r5);	 Catch:{ NumberFormatException -> 0x0440 }
        if (r4 == 0) goto L_0x0427;
    L_0x0367:
        r1 = android.os.Build.MANUFACTURER;
        r3 = 32;
        r5 = 95;
        r1 = r1.replace(r3, r5);
        r3 = android.os.Build.MODEL;
        r5 = 32;
        r7 = 95;
        r3 = r3.replace(r5, r7);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r1 = r5.append(r1);
        r5 = "-";
        r1 = r1.append(r5);
        r1 = r1.append(r3);
        r1 = r1.toString();
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0442 }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x0442 }
        r5 = bb;	 Catch:{ NumberFormatException -> 0x0442 }
        r7 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r5 = r5[r7];	 Catch:{ NumberFormatException -> 0x0442 }
        r3 = r3.append(r5);	 Catch:{ NumberFormatException -> 0x0442 }
        r3 = r3.append(r1);	 Catch:{ NumberFormatException -> 0x0442 }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x0442 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ NumberFormatException -> 0x0442 }
        r3 = bb;	 Catch:{ NumberFormatException -> 0x0442 }
        r5 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r3 = r3[r5];	 Catch:{ NumberFormatException -> 0x0442 }
        r1 = r1.equals(r3);	 Catch:{ NumberFormatException -> 0x0442 }
        if (r1 == 0) goto L_0x03e4;
    L_0x03b8:
        if (r2 != 0) goto L_0x03d4;
    L_0x03ba:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0446 }
        r3 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x0446 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ NumberFormatException -> 0x0446 }
        r1 = p;	 Catch:{ NumberFormatException -> 0x0446 }
        r3 = p;	 Catch:{ NumberFormatException -> 0x0446 }
        r5 = 2131624286; // 0x7f0e015e float:1.8875747E38 double:1.0531623296E-314;
        r3 = r3.getString(r5);	 Catch:{ NumberFormatException -> 0x0446 }
        r5 = 0;
        b(r1, r3, r5);	 Catch:{ NumberFormatException -> 0x0446 }
        if (r4 == 0) goto L_0x0427;
    L_0x03d4:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0446 }
        r3 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x0446 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0446 }
        r0 = r19;
        r0.startActivity(r2);	 Catch:{ NumberFormatException -> 0x0446 }
        if (r4 == 0) goto L_0x0427;
    L_0x03e4:
        r1 = r6.size();
        r1 = r1 + -1;
        r1 = r6.get(r1);
        r1 = (android.content.Intent) r1;
        r2 = 2131625018; // 0x7f0e043a float:1.8877232E38 double:1.053162691E-314;
        r0 = r19;
        r2 = r0.getString(r2);
        r2 = android.content.Intent.createChooser(r1, r2);
        r1 = r6.size();	 Catch:{ NumberFormatException -> 0x0448 }
        r3 = 1;
        if (r1 <= r3) goto L_0x0422;
    L_0x0404:
        r1 = r6.size();	 Catch:{ NumberFormatException -> 0x0448 }
        r1 = r1 + -1;
        r6.remove(r1);	 Catch:{ NumberFormatException -> 0x0448 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0448 }
        r3 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r3 = r1[r3];	 Catch:{ NumberFormatException -> 0x0448 }
        r1 = r6.size();	 Catch:{ NumberFormatException -> 0x0448 }
        r1 = new android.content.Intent[r1];	 Catch:{ NumberFormatException -> 0x0448 }
        r1 = r6.toArray(r1);	 Catch:{ NumberFormatException -> 0x0448 }
        r1 = (android.os.Parcelable[]) r1;	 Catch:{ NumberFormatException -> 0x0448 }
        r2.putExtra(r3, r1);	 Catch:{ NumberFormatException -> 0x0448 }
    L_0x0422:
        r0 = r19;
        r0.startActivity(r2);
    L_0x0427:
        return;
    L_0x0428:
        r1 = move-exception;
        throw r1;
    L_0x042a:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x042c }
    L_0x042c:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x042e }
    L_0x042e:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0430 }
    L_0x0430:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0432 }
    L_0x0432:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0434 }
    L_0x0434:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0436 }
    L_0x0436:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0438 }
    L_0x0438:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x043a }
    L_0x043a:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x043c }
    L_0x043c:
        r1 = move-exception;
        throw r1;
    L_0x043e:
        r1 = move-exception;
        throw r1;
    L_0x0440:
        r1 = move-exception;
        throw r1;
    L_0x0442:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0444 }
    L_0x0444:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x0446 }
    L_0x0446:
        r1 = move-exception;
        throw r1;
    L_0x0448:
        r1 = move-exception;
        throw r1;
    L_0x044a:
        r2 = r1;
        goto L_0x0347;
    L_0x044d:
        r3 = r1;
        r1 = r2;
        goto L_0x00bb;
    L_0x0451:
        r1 = r2;
        goto L_0x0340;
    L_0x0454:
        r2 = r1;
        goto L_0x00cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.c(android.app.Activity):void");
    }

    private static boolean o(Context context) {
        return context.getSharedPreferences(bb[366], 0).getBoolean(bb[367], false);
    }

    private static void a(m8 m8Var, Activity activity) {
        try {
            if (m8Var.a > 0) {
                m8Var.a = 0;
                q.c().a(m8Var.e);
                P.e(m8Var);
                activity.runOnUiThread(new afk(m8Var));
                a(m8Var);
                WidgetProvider.a(p);
                w();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static int v(Context context) {
        return context.getSharedPreferences(bb[382], 0).getInt(bb[383], 0);
    }

    static void b(s4 s4Var) {
        aO.remove(s4Var);
    }

    private static void M() {
        Throwable th;
        DataOutputStream dataOutputStream = null;
        DataOutputStream dataOutputStream2;
        try {
            dataOutputStream2 = new DataOutputStream(p.openFileOutput(bb[408], 0));
            try {
                dataOutputStream2.writeBoolean(aL);
                if (dataOutputStream2 != null) {
                    try {
                        dataOutputStream2.close();
                    } catch (IOException e) {
                    }
                }
            } catch (IOException e2) {
                try {
                    Log.w(bb[407]);
                    if (dataOutputStream2 != null) {
                        try {
                            dataOutputStream2.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    dataOutputStream = dataOutputStream2;
                    th = th3;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e4) {
                        } catch (NumberFormatException e5) {
                            throw e5;
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e6) {
            dataOutputStream2 = null;
            Log.w(bb[407]);
            if (dataOutputStream2 != null) {
                dataOutputStream2.close();
            }
        } catch (Throwable th4) {
            th = th4;
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            throw th;
        }
    }

    void a(m mVar) {
        c(new re(this, mVar));
    }

    public static void r(String str) {
        int i = az;
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((anq) it.next()).c(str);
            if (i != 0) {
                return;
            }
        }
    }

    public static boolean u() {
        try {
            if (ay != -1) {
                if (System.currentTimeMillis() - ay < 86400000) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a0() {
        at.clear();
        ay = System.currentTimeMillis();
    }

    public static boolean a(String str, String str2, cs csVar, cd cdVar) {
        try {
            if (!ac) {
                return false;
            }
            l.b(au.a(str, str2, csVar, cdVar));
            return true;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void n(String str) {
        d(str, false);
    }

    public static void o(String str) {
        try {
            if (aa <= 1) {
                Log.b(bb[501], new RuntimeException(str));
                a(p, false, false, false);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static long aP() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException e) {
            Log.w(bb[381]);
            return 0;
        }
    }

    public static void ai() {
        ay = -1;
    }

    public static void a(hj hjVar) {
        try {
            if (ac) {
                Log.i(bb[294] + hjVar.a);
                l.b(au.a(hjVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void l(com.whatsapp.protocol.b bVar) {
        try {
            if (ac) {
                String str;
                if (bb[351].equals(bVar.u)) {
                    str = bb[352];
                } else {
                    str = null;
                }
                bVar.u = str;
                l.b(au.e(bVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static boolean N() {
        try {
            return ge.g > 0;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static ho a6() {
        return h;
    }

    public static Bitmap k(com.whatsapp.protocol.b bVar) {
        int i = az;
        MediaData mediaData = (MediaData) bVar.A;
        try {
            if (mediaData.transferred && mediaData.file != null) {
                if (mediaData.file.exists()) {
                    try {
                        Display defaultDisplay = ((WindowManager) p.getSystemService(bb[350])).getDefaultDisplay();
                        int width = defaultDisplay.getWidth();
                        int height = defaultDisplay.getHeight();
                        Options options = new Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(mediaData.file.getAbsolutePath(), options);
                        width *= height;
                        height = options.outWidth * options.outHeight;
                        options.inSampleSize = 1;
                        if (width != 0) {
                            while (height > width) {
                                options.inSampleSize *= 2;
                                height /= 4;
                                if (i != 0) {
                                    break;
                                }
                            }
                        }
                        options.inJustDecodeBounds = false;
                        return BitmapFactory.decodeFile(mediaData.file.getAbsolutePath(), options);
                    } catch (OutOfMemoryError e) {
                        throw e;
                    } catch (OutOfMemoryError e2) {
                        return null;
                    }
                }
            }
            return null;
        } catch (OutOfMemoryError e3) {
            throw e3;
        } catch (OutOfMemoryError e32) {
            throw e32;
        }
    }

    public static ho y() {
        return h;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(android.content.Context r3) {
        /*
        r2 = 9;
        r0 = com.whatsapp.c2dm.C2DMRegistrar.b(r3);	 Catch:{ NumberFormatException -> 0x0038 }
        if (r0 != 0) goto L_0x0019;
    L_0x0008:
        r0 = aW();	 Catch:{ NumberFormatException -> 0x003a }
        if (r0 == 0) goto L_0x0046;
    L_0x000e:
        r0 = new com.amazon.device.messaging.ADM;	 Catch:{ NumberFormatException -> 0x003a }
        r0.<init>(r3);	 Catch:{ NumberFormatException -> 0x003a }
        r0 = r0.getRegistrationId();	 Catch:{ NumberFormatException -> 0x003a }
        if (r0 == 0) goto L_0x0046;
    L_0x0019:
        r0 = ah;	 Catch:{ NumberFormatException -> 0x003c }
        r0 = r0.getBackgroundDataSetting();	 Catch:{ NumberFormatException -> 0x003c }
        if (r0 == 0) goto L_0x0046;
    L_0x0021:
        r0 = w(r3);	 Catch:{ NumberFormatException -> 0x003e }
        r1 = 3;
        if (r0 >= r1) goto L_0x0046;
    L_0x0028:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0040 }
        if (r0 < r2) goto L_0x0036;
    L_0x002c:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0042 }
        if (r0 < r2) goto L_0x0046;
    L_0x0030:
        r0 = o(r3);	 Catch:{ NumberFormatException -> 0x0044 }
        if (r0 != 0) goto L_0x0046;
    L_0x0036:
        r0 = 1;
    L_0x0037:
        return r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = 0;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.f(android.content.Context):boolean");
    }

    static void a(atf com_whatsapp_atf, int i, long j) {
        try {
            ac.c(i);
            ac.a(i);
            if (j != 0) {
                ac.a(com_whatsapp_atf, 1000 * j, false, aR);
            }
            aR.clear();
            O = false;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static int e(Context context) {
        return context.getSharedPreferences(bb[423], 0).getInt(bb[422], 0);
    }

    public static boolean az() {
        return ge.m;
    }

    public static boolean aX() {
        try {
            return aE != 3;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void ah() {
        Log.i(bb[359]);
        ac = false;
        MessageService.b(p);
    }

    long E() {
        try {
            if (a2 == -1) {
                a2 = A();
            }
            return a2;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean ag() {
        return F;
    }

    public static File a(String str, byte b, int i, boolean z) {
        return new File(yf.a(b, i, z), str);
    }

    public static void e(mz mzVar) {
        try {
            if (ac) {
                Log.i(bb[32]);
                l.b(au.e(mzVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static int w(Context context) {
        return context.getSharedPreferences(bb[297], 0).getInt(bb[298], 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r4, int r5) {
        /*
        r1 = az;
        r0 = c(r4);
        if (r0 != r5) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        switch(r4) {
            case 1: goto L_0x001a;
            case 2: goto L_0x0022;
            case 3: goto L_0x002a;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ NumberFormatException -> 0x0018 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0018 }
        r2 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0018 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0018 }
        throw r0;	 Catch:{ NumberFormatException -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
        throw r0;
    L_0x001a:
        r0 = bb;
        r2 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0032;
    L_0x0022:
        r0 = bb;
        r2 = 305; // 0x131 float:4.27E-43 double:1.507E-321;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0032;
    L_0x002a:
        r0 = bb;
        r2 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        r0 = r0[r2];
        if (r1 != 0) goto L_0x000c;
    L_0x0032:
        r1 = p;
        r2 = bb;
        r3 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        r2 = r2[r3];
        r3 = 0;
        r1 = r1.getSharedPreferences(r2, r3);
        r1 = r1.edit();
        r0 = r1.putInt(r0, r5);
        r0.commit();
        r0 = com.whatsapp.s3.a();
        r0.b();
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void x(android.content.Context r4) {
        /*
        r3 = 1;
        r0 = aF;	 Catch:{ NumberFormatException -> 0x0006 }
        if (r0 == 0) goto L_0x0008;
    L_0x0005:
        return;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        r0 = new com.whatsapp.util.y;
        r0.<init>();
        r1 = bb;	 Catch:{ NumberFormatException -> 0x006f }
        r2 = 413; // 0x19d float:5.79E-43 double:2.04E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x006f }
        r0.a(r1);	 Catch:{ NumberFormatException -> 0x006f }
        r1 = d;	 Catch:{ NumberFormatException -> 0x006f }
        if (r1 != 0) goto L_0x0020;
    L_0x001a:
        com.whatsapp.yf.e();	 Catch:{ NumberFormatException -> 0x006f }
        com.whatsapp.a54.t();	 Catch:{ NumberFormatException -> 0x006f }
    L_0x0020:
        r1 = d;	 Catch:{ NumberFormatException -> 0x0071 }
        if (r1 != 0) goto L_0x0047;
    L_0x0024:
        r1 = K;	 Catch:{ NumberFormatException -> 0x0073 }
        if (r1 != 0) goto L_0x0047;
    L_0x0028:
        r1 = 1;
        K = r1;	 Catch:{ NumberFormatException -> 0x0075 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0075 }
        r2 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0075 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0075 }
        r1 = A;	 Catch:{ NumberFormatException -> 0x0075 }
        if (r1 == 0) goto L_0x0042;
    L_0x0038:
        r1 = aa;	 Catch:{ NumberFormatException -> 0x0077 }
        if (r1 > r3) goto L_0x0042;
    L_0x003c:
        r1 = 1;
        r2 = 0;
        r3 = 1;
        a(r4, r1, r2, r3);	 Catch:{ NumberFormatException -> 0x0077 }
    L_0x0042:
        r1 = aB;
        r1.a();
    L_0x0047:
        r1 = b;	 Catch:{ NumberFormatException -> 0x0079 }
        if (r1 != 0) goto L_0x004e;
    L_0x004b:
        r1 = 1;
        b = r1;	 Catch:{ NumberFormatException -> 0x0079 }
    L_0x004e:
        com.whatsapp.SettingsChat.b();	 Catch:{ NumberFormatException -> 0x007b }
        r1 = p();	 Catch:{ NumberFormatException -> 0x007b }
        if (r1 == 0) goto L_0x0063;
    L_0x0057:
        r1 = new com.whatsapp.jw;	 Catch:{ NumberFormatException -> 0x007b }
        r2 = 0;
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x007b }
        r2 = 0;
        r2 = new java.lang.Void[r2];	 Catch:{ NumberFormatException -> 0x007b }
        com.whatsapp.a5w.a(r1, r2);	 Catch:{ NumberFormatException -> 0x007b }
    L_0x0063:
        r1 = new com.whatsapp.wr;
        r1.<init>();
        com.whatsapp.util.br.a(r1);
        r0.c();
        goto L_0x0005;
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.x(android.content.Context):void");
    }

    public static String p(Context context) {
        String string = context.getSharedPreferences(bb[377], 0).getString(bb[378], "*");
        try {
            return TextUtils.isEmpty(string) ? "*" : string;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static String w(String str) {
        String L = p.L();
        if (L == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return parse.buildUpon().authority(L).path(parse.getHost()).appendEncodedPath(parse.getEncodedPath()).build().toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
        r5_this = this;
        r4 = 0;
        r2 = 3;
        r3 = 0;
        S();
        r0 = s;
        r0.b();
        aG = r3;
        r0 = 1;
        a1 = r0;
        o = r3;
        aN = r3;
        af = r3;
        r0 = r5.Q;
        r0.clear();
        r0 = r5.f;
        r0.clear();
        a4();
        r0 = an;
        r0 = r0.jabber_id;
        r0 = k(r0);
        r1 = com.whatsapp.a54.c(r0);	 Catch:{ UnsatisfiedLinkError -> 0x00df }
        if (r1 != 0) goto L_0x0038;
    L_0x0031:
        r1 = com.whatsapp.a54.e();	 Catch:{ UnsatisfiedLinkError -> 0x00df }
        a(r1, r0);	 Catch:{ UnsatisfiedLinkError -> 0x00df }
    L_0x0038:
        r0 = S;	 Catch:{ UnsatisfiedLinkError -> 0x00e1 }
        if (r0 == 0) goto L_0x0042;
    L_0x003c:
        com.whatsapp.avq.j();	 Catch:{ UnsatisfiedLinkError -> 0x00e1 }
        aF();	 Catch:{ UnsatisfiedLinkError -> 0x00e1 }
    L_0x0042:
        r0 = aE;	 Catch:{ UnsatisfiedLinkError -> 0x00e3 }
        if (r0 == r2) goto L_0x0055;
    L_0x0046:
        r0 = com.whatsapp.Conversation.r();	 Catch:{ UnsatisfiedLinkError -> 0x00e3 }
        if (r0 == 0) goto L_0x0055;
    L_0x004c:
        r0 = com.whatsapp.Conversation.t();	 Catch:{ UnsatisfiedLinkError -> 0x00e5 }
        r0 = r0.r;	 Catch:{ UnsatisfiedLinkError -> 0x00e5 }
        b(r0);	 Catch:{ UnsatisfiedLinkError -> 0x00e5 }
    L_0x0055:
        r0 = ac();	 Catch:{ UnsatisfiedLinkError -> 0x00e7 }
        r1 = aX();	 Catch:{ UnsatisfiedLinkError -> 0x00e7 }
        if (r0 == r1) goto L_0x0073;
    L_0x005f:
        r0 = aX();	 Catch:{ UnsatisfiedLinkError -> 0x00e7 }
        if (r0 == 0) goto L_0x006c;
    L_0x0065:
        aA();	 Catch:{ UnsatisfiedLinkError -> 0x00e9 }
        r0 = az;	 Catch:{ UnsatisfiedLinkError -> 0x00e9 }
        if (r0 == 0) goto L_0x0073;
    L_0x006c:
        r0 = aE;	 Catch:{ UnsatisfiedLinkError -> 0x00eb }
        if (r0 != r2) goto L_0x0073;
    L_0x0070:
        ak();	 Catch:{ UnsatisfiedLinkError -> 0x00ed }
    L_0x0073:
        com.whatsapp.Voip.onNetworkChange();	 Catch:{ UnsatisfiedLinkError -> 0x00ef }
    L_0x0076:
        r0 = k;
        r0.g();
        r5.Y();
        r0 = new com.whatsapp.oz;
        r0.<init>(r5);
        r5.c(r0);
        r0 = bb;
        r1 = 59;
        r0 = r0[r1];
        r0 = r5.getSharedPreferences(r0, r3);
        r1 = bb;	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r2 = 64;
        r1 = r1[r2];	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r2 = 0;
        r1 = r0.getBoolean(r1, r2);	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        if (r1 == 0) goto L_0x00de;
    L_0x009d:
        r1 = bb;	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r2 = 66;
        r1 = r1[r2];	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r1 = bb;	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r2 = 60;
        r1 = r1[r2];	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        I();	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r1 = bb;	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r2 = 62;
        r1 = r1[r2];	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r1 = P;	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r1 = r1.e();	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        b(r1);	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r1 = bb;	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r2 = 61;
        r1 = r1[r2];	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r0 = r0.edit();	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r1 = bb;	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r2 = 65;
        r1 = r1[r2];	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r0 = r0.remove(r1);	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        r0.commit();	 Catch:{ UnsatisfiedLinkError -> 0x010a }
    L_0x00de:
        return;
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        throw r0;
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x00eb }
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsatisfiedLinkError -> 0x00ed }
    L_0x00ed:
        r0 = move-exception;
        throw r0;
    L_0x00ef:
        r0 = move-exception;
        r1 = bb;
        r2 = 63;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.CorruptInstallationActivity.class;
        r0.<init>(r4, r4, r5, r1);
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.setFlags(r1);
        r5.startActivity(r0);
        goto L_0x0076;
    L_0x010a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
        r3_this = this;
        r0 = a1;
        r1 = 0;
        aG = r1;	 Catch:{ NumberFormatException -> 0x003e }
        r1 = 0;
        a1 = r1;	 Catch:{ NumberFormatException -> 0x003e }
        a4();	 Catch:{ NumberFormatException -> 0x003e }
        C();	 Catch:{ NumberFormatException -> 0x003e }
        com.whatsapp.v.i();	 Catch:{ NumberFormatException -> 0x003e }
        if (r0 == 0) goto L_0x0022;
    L_0x0013:
        r1 = i;	 Catch:{ NumberFormatException -> 0x003e }
        r1.b();	 Catch:{ NumberFormatException -> 0x003e }
        r1 = D;	 Catch:{ NumberFormatException -> 0x003e }
        r1.b();	 Catch:{ NumberFormatException -> 0x003e }
        r1 = N;	 Catch:{ NumberFormatException -> 0x003e }
        r1.b();	 Catch:{ NumberFormatException -> 0x003e }
    L_0x0022:
        r1 = aE;	 Catch:{ NumberFormatException -> 0x0040 }
        r2 = 2;
        if (r1 != r2) goto L_0x0033;
    L_0x0027:
        r1 = r3.aP;	 Catch:{ NumberFormatException -> 0x0042 }
        r1.c(r3);	 Catch:{ NumberFormatException -> 0x0042 }
        r1 = 3;
        aE = r1;	 Catch:{ NumberFormatException -> 0x0042 }
        r1 = az;	 Catch:{ NumberFormatException -> 0x0042 }
        if (r1 == 0) goto L_0x003d;
    L_0x0033:
        r1 = aE;	 Catch:{ NumberFormatException -> 0x0044 }
        r2 = 1;
        if (r1 != r2) goto L_0x003d;
    L_0x0038:
        if (r0 == 0) goto L_0x003d;
    L_0x003a:
        aA();	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x003d:
        return;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.f():void");
    }

    private static void a(byte[] bArr, String str) {
        if (ac) {
            l.b(au.a(Pair.create(bArr, new h4(bArr, str))));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r10, byte[] r11, com.whatsapp.MediaData r12, byte r13, int r14, java.lang.String r15, android.net.Uri r16) {
        /*
        r0 = az;
        r1 = com.whatsapp.v.b(r10);
        r2 = new com.whatsapp.protocol.b;
        r3 = r1.e;
        r2.<init>(r3, r11, r12);
        r4 = a2();	 Catch:{ NumberFormatException -> 0x00c3 }
        r2.D = r4;	 Catch:{ NumberFormatException -> 0x00c3 }
        r3 = 1;
        r2.O = r3;	 Catch:{ NumberFormatException -> 0x00c3 }
        r2.j = r13;	 Catch:{ NumberFormatException -> 0x00c3 }
        r2.w = r14;	 Catch:{ NumberFormatException -> 0x00c3 }
        if (r15 == 0) goto L_0x002d;
    L_0x001c:
        r3 = r15.trim();	 Catch:{ NumberFormatException -> 0x00c5 }
        r2.v = r3;	 Catch:{ NumberFormatException -> 0x00c5 }
        r3 = r2.v;	 Catch:{ NumberFormatException -> 0x00c5 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ NumberFormatException -> 0x00c5 }
        if (r3 == 0) goto L_0x002d;
    L_0x002a:
        r3 = 0;
        r2.v = r3;	 Catch:{ NumberFormatException -> 0x00c5 }
    L_0x002d:
        r3 = r12.file;	 Catch:{ NumberFormatException -> 0x00c7 }
        if (r3 != 0) goto L_0x003d;
    L_0x0031:
        r3 = r16.toString();	 Catch:{ NumberFormatException -> 0x00c9 }
        r2.H = r3;	 Catch:{ NumberFormatException -> 0x00c9 }
        r4 = 0;
        r2.k = r4;	 Catch:{ NumberFormatException -> 0x00c9 }
        if (r0 == 0) goto L_0x004d;
    L_0x003d:
        r3 = r12.file;	 Catch:{ NumberFormatException -> 0x00c9 }
        r3 = r3.getName();	 Catch:{ NumberFormatException -> 0x00c9 }
        r2.H = r3;	 Catch:{ NumberFormatException -> 0x00c9 }
        r3 = r12.file;	 Catch:{ NumberFormatException -> 0x00c9 }
        r4 = r3.length();	 Catch:{ NumberFormatException -> 0x00c9 }
        r2.k = r4;	 Catch:{ NumberFormatException -> 0x00c9 }
    L_0x004d:
        r3 = 2;
        if (r13 == r3) goto L_0x0053;
    L_0x0050:
        r3 = 3;
        if (r13 != r3) goto L_0x0078;
    L_0x0053:
        r4 = r12.trimFrom;	 Catch:{ NumberFormatException -> 0x00cb }
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 > 0) goto L_0x0063;
    L_0x005b:
        r4 = r12.trimTo;	 Catch:{ NumberFormatException -> 0x00cd }
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x0070;
    L_0x0063:
        r4 = r12.trimTo;	 Catch:{ NumberFormatException -> 0x00cf }
        r6 = r12.trimFrom;	 Catch:{ NumberFormatException -> 0x00cf }
        r4 = r4 - r6;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 / r6;
        r3 = (int) r4;	 Catch:{ NumberFormatException -> 0x00cf }
        r2.p = r3;	 Catch:{ NumberFormatException -> 0x00cf }
        if (r0 == 0) goto L_0x0078;
    L_0x0070:
        r3 = r12.file;	 Catch:{ NumberFormatException -> 0x00cf }
        r3 = com.whatsapp.util.f.b(r3);	 Catch:{ NumberFormatException -> 0x00cf }
        r2.p = r3;	 Catch:{ NumberFormatException -> 0x00cf }
    L_0x0078:
        r3 = 1;
        r2.a = r3;	 Catch:{ NumberFormatException -> 0x00d1 }
        r4 = r2.k;	 Catch:{ NumberFormatException -> 0x00d1 }
        r12.fileSize = r4;	 Catch:{ NumberFormatException -> 0x00d1 }
        r3 = 1;
        r12.autodownloadRetryEnabled = r3;	 Catch:{ NumberFormatException -> 0x00d1 }
        a(r2, r1);	 Catch:{ NumberFormatException -> 0x00d1 }
        r1 = aJ;	 Catch:{ NumberFormatException -> 0x00d1 }
        r3 = 1;
        r1.c(r2, r3);	 Catch:{ NumberFormatException -> 0x00d1 }
        r1 = 3;
        if (r13 != r1) goto L_0x00b4;
    L_0x008e:
        r4 = r2.k;	 Catch:{ NumberFormatException -> 0x00d3 }
        r1 = com.whatsapp.ge.k;	 Catch:{ NumberFormatException -> 0x00d3 }
        r6 = (long) r1;
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r6 = r6 * r8;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 > 0) goto L_0x00ab;
    L_0x009b:
        r4 = r12.trimFrom;	 Catch:{ NumberFormatException -> 0x00d5 }
        r6 = 0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 > 0) goto L_0x00ab;
    L_0x00a3:
        r4 = r12.trimTo;	 Catch:{ NumberFormatException -> 0x00d7 }
        r6 = 0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x00b4;
    L_0x00ab:
        r1 = com.whatsapp.j_.a();	 Catch:{ NumberFormatException -> 0x00d9 }
        r1.a(r2);	 Catch:{ NumberFormatException -> 0x00d9 }
        if (r0 == 0) goto L_0x00c2;
    L_0x00b4:
        r0 = new com.whatsapp.avq;	 Catch:{ NumberFormatException -> 0x00d9 }
        r4 = 0;
        r0.<init>(r2, r4);	 Catch:{ NumberFormatException -> 0x00d9 }
        r12.uploader = r0;	 Catch:{ NumberFormatException -> 0x00d9 }
        r0 = r12.uploader;	 Catch:{ NumberFormatException -> 0x00d9 }
        r0.b();	 Catch:{ NumberFormatException -> 0x00d9 }
    L_0x00c2:
        return;
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00d3 }
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00d5 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00d7 }
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00d9 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.lang.String, byte[], com.whatsapp.MediaData, byte, int, java.lang.String, android.net.Uri):void");
    }

    public static boolean c(Context context) {
        try {
            if (((AudioManager) context.getSystemService(bb[48])).getStreamVolume(3) == 0) {
                if (System.currentTimeMillis() - W > 2000) {
                    W = System.currentTimeMillis();
                    b(context, (int) R.string.please_turn_volume_up, 0);
                }
                return false;
            }
            try {
                return true;
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void aa() {
        /*
        r8_this = this;
        r0 = 0;
        r1 = az;
        r2 = 4;
        r2 = new java.io.File[r2];	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r3 = 0;
        r4 = p;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r4 = r4.getFilesDir();	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r4 = r4.getParentFile();	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r2[r3] = r4;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r3 = 1;
        r4 = p;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r4 = r4.getFilesDir();	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r2[r3] = r4;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r3 = 2;
        r4 = new java.io.File;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r5 = p;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r5 = r5.getFilesDir();	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r6 = bb;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r7 = 430; // 0x1ae float:6.03E-43 double:2.124E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r4.<init>(r5, r6);	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r2[r3] = r4;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r3 = 3;
        r4 = bb;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r5 = 436; // 0x1b4 float:6.11E-43 double:2.154E-321;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r4 = r8.getDatabasePath(r4);	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r4 = r4.getParentFile();	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r2[r3] = r4;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r3 = r2.length;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
    L_0x0042:
        if (r0 >= r3) goto L_0x00b8;
    L_0x0044:
        r4 = r2[r0];	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r5.<init>();	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r6 = bb;	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r7 = 435; // 0x1b3 float:6.1E-43 double:2.15E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r6 = r4.getName();	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r6 = bb;	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r7 = 433; // 0x1b1 float:6.07E-43 double:2.14E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r6 = r4.canWrite();	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r5 = r5.toString();	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        com.whatsapp.util.Log.i(r5);	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r5 = r4.canWrite();	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        if (r5 != 0) goto L_0x00b4;
    L_0x007c:
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x00b9, NoSuchMethodError -> 0x00dd }
        r6 = 9;
        if (r5 < r6) goto L_0x00b4;
    L_0x0082:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r5.<init>();	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r6 = bb;	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r7 = 438; // 0x1b6 float:6.14E-43 double:2.164E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r6 = r4.getName();	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r6 = bb;	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r7 = 437; // 0x1b5 float:6.12E-43 double:2.16E-321;
        r6 = r6[r7];	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r6 = 1;
        r7 = 1;
        r4 = r4.setWritable(r6, r7);	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        r4 = r4.toString();	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
        com.whatsapp.util.Log.i(r4);	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
    L_0x00b4:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0042;
    L_0x00b8:
        return;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00bb, NoSuchMethodError -> 0x00dd }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00bd, NoSuchMethodError -> 0x00dd }
    L_0x00bd:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 434; // 0x1b2 float:6.08E-43 double:2.144E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x00b8;
    L_0x00dd:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 431; // 0x1af float:6.04E-43 double:2.13E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r1 = bb;
        r2 = 432; // 0x1b0 float:6.05E-43 double:2.134E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = r0.append(r1);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x00b8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.aa():void");
    }

    public static void a(Collection collection) {
        int i = az;
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((anq) it.next()).a(collection);
            if (i != 0) {
                return;
            }
        }
    }

    static List b(List list, List list2, boolean z) {
        return a(list, list2, z);
    }

    public static void a(String str, String str2, String str3, byte[] bArr, int i) {
        try {
            if (ac) {
                Log.i(bb[328]);
                l.b(au.a(str, str2, str3, bArr, i));
                try {
                    if (az == 0) {
                        return;
                    }
                }
            }
            Log.e(bb[327]);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static void j(com.whatsapp.protocol.b bVar) {
        try {
            ab.removeMessages(0);
            ab.removeMessages(1);
            ab.removeMessages(2);
            try {
                if (!ac) {
                    return;
                }
                if (!p.Q.contains(bVar.e)) {
                    p.Q.add(bVar.e);
                    p.c(new _e(bVar));
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.app.Activity r8) {
        /*
        r2 = az;
        r1 = com.whatsapp.v.b();
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0 = 0;
        r4 = r1.iterator();
        r1 = r0;
    L_0x0011:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0070;
    L_0x0017:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r0 = com.whatsapp.v.b(r0);
        if (r0 == 0) goto L_0x006e;
    L_0x0023:
        r5 = r0.e;	 Catch:{ NumberFormatException -> 0x0064 }
        r6 = bb;	 Catch:{ NumberFormatException -> 0x0064 }
        r7 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x0064 }
        r5 = r5.contains(r6);	 Catch:{ NumberFormatException -> 0x0064 }
        if (r5 != 0) goto L_0x0043;
    L_0x0031:
        a(r0, r8);	 Catch:{ NumberFormatException -> 0x0066 }
        r5 = r0.w();	 Catch:{ NumberFormatException -> 0x0066 }
        if (r5 != 0) goto L_0x006e;
    L_0x003a:
        r5 = r0.h;	 Catch:{ NumberFormatException -> 0x0068 }
        if (r5 != 0) goto L_0x006e;
    L_0x003e:
        r3.add(r0);	 Catch:{ NumberFormatException -> 0x0068 }
        if (r2 == 0) goto L_0x006e;
    L_0x0043:
        r1 = 1;
        r0 = r1;
    L_0x0045:
        if (r2 == 0) goto L_0x006c;
    L_0x0047:
        r1 = P;	 Catch:{ NumberFormatException -> 0x006a }
        r1.a(r3);	 Catch:{ NumberFormatException -> 0x006a }
        r1 = aJ;	 Catch:{ NumberFormatException -> 0x006a }
        r1.x();	 Catch:{ NumberFormatException -> 0x006a }
        r1 = new com.whatsapp.akx;	 Catch:{ NumberFormatException -> 0x006a }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x006a }
        r8.runOnUiThread(r1);	 Catch:{ NumberFormatException -> 0x006a }
        if (r0 == 0) goto L_0x005e;
    L_0x005b:
        com.whatsapp.bd.h();	 Catch:{ NumberFormatException -> 0x006a }
    L_0x005e:
        r0 = 2;
        r1 = 0;
        a(r0, r1);
        return;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = move-exception;
        throw r0;
    L_0x006c:
        r1 = r0;
        goto L_0x0011;
    L_0x006e:
        r0 = r1;
        goto L_0x0045;
    L_0x0070:
        r0 = r1;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(android.app.Activity):void");
    }

    public static void a(Context context, int i) {
        Editor edit = context.getSharedPreferences(bb[334], 0).edit();
        try {
            edit.putInt(bb[335], i);
            if (!edit.commit()) {
                Log.e(bb[336]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void d(List list) {
        int i = az;
        if (list != null) {
            Log.i(bb[258] + Process.myPid() + " " + list.size());
            int i2 = 0;
            for (RunningAppProcessInfo runningAppProcessInfo : list) {
                try {
                    if (runningAppProcessInfo.processName != null) {
                        if (runningAppProcessInfo.processName.startsWith(bb[260])) {
                            Log.i(bb[259] + runningAppProcessInfo.processName + " " + runningAppProcessInfo.pid + " " + runningAppProcessInfo.importance);
                            i2++;
                        }
                    }
                    try {
                        if (runningAppProcessInfo.pid == Process.myPid()) {
                            try {
                                Log.i(bb[262] + (runningAppProcessInfo.processName == null ? "?" : runningAppProcessInfo.processName) + " " + runningAppProcessInfo.importance + " " + runningAppProcessInfo.importanceReasonCode + " " + (runningAppProcessInfo.importanceReasonComponent == null ? "?" : runningAppProcessInfo.importanceReasonComponent.flattenToString()));
                                continue;
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                } catch (NumberFormatException e222) {
                    throw e222;
                } catch (NumberFormatException e2222) {
                    throw e2222;
                }
            }
            if (i2 == 0) {
                Log.w(bb[261]);
                for (RunningAppProcessInfo runningAppProcessInfo2 : list) {
                    try {
                        if (runningAppProcessInfo2.processName != null) {
                            Log.w(runningAppProcessInfo2.processName + bb[257] + runningAppProcessInfo2.pid + ")");
                            continue;
                        }
                        if (i != 0) {
                            return;
                        }
                    } catch (NumberFormatException e22222) {
                        throw e22222;
                    }
                }
            }
        }
    }

    static void a(String str, boolean z, boolean z2) {
        b(str, z, z2);
    }

    public static void a(Context context, String str, String str2) {
        Editor edit = context.getSharedPreferences(bb[72], 0).edit();
        try {
            edit.putInt(bb[70], 2);
            edit.putString(bb[69], str);
            edit.putString(bb[71], str2);
            if (!edit.commit()) {
                Log.e(bb[68]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void m(com.whatsapp.protocol.b bVar) {
        a(bVar, 3);
    }

    public void a(long j) {
        if (j >= 60000) {
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(bb[419]).setPackage(bb[420]), 0);
            AlarmManager alarmManager = (AlarmManager) getSystemService(bb[418]);
            try {
                if (VERSION.SDK_INT >= 19) {
                    alarmManager.setExact(0, System.currentTimeMillis() + j, broadcast);
                    if (az == 0) {
                        return;
                    }
                }
                alarmManager.set(0, System.currentTimeMillis() + j, broadcast);
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
    }

    public static boolean a(m8[] m8VarArr) {
        try {
            if (!ac) {
                return false;
            }
            l.b(au.a(m8VarArr));
            return true;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(java.lang.String r2, int r3) {
        /*
        r0 = ac;	 Catch:{ NumberFormatException -> 0x000d }
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        r0 = com.whatsapp.a12.n();	 Catch:{ NumberFormatException -> 0x000f }
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        if (r2 != 0) goto L_0x0013;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r0 = l;
        r1 = com.whatsapp.messaging.au.b(r2, r3);
        r0.b(r1);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.d(java.lang.String, int):void");
    }

    public static void a(com.whatsapp.protocol.b bVar, int i) {
        try {
            if (!ac) {
                return;
            }
            if (a12.n() && bVar != null) {
                List arrayList = new ArrayList(1);
                arrayList.add(bVar);
                a(i, arrayList, false, false, null, null);
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(String str, String str2, String str3, String str4, int i, byte[][] bArr, int[] iArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i2) {
        try {
            if (ac) {
                Log.i(bb[409]);
                l.b(au.a(str, str2, str3, str4, i, bArr, iArr, bArr2, bArr3, bArr4, i2));
                try {
                    if (az == 0) {
                        return;
                    }
                }
            }
            Log.e(bb[410]);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.protocol.bj r2) {
        /*
        r0 = ac;	 Catch:{ NumberFormatException -> 0x0040 }
        if (r0 == 0) goto L_0x003f;
    L_0x0004:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0042 }
        r1 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0042 }
        r1 = r2.c;	 Catch:{ NumberFormatException -> 0x0042 }
        r0 = r0.equals(r1);	 Catch:{ NumberFormatException -> 0x0042 }
        if (r0 == 0) goto L_0x0036;
    L_0x0012:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = r2.e;	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = r0.equals(r1);	 Catch:{ NumberFormatException -> 0x0044 }
        if (r0 == 0) goto L_0x0036;
    L_0x0020:
        r1 = l;	 Catch:{ NumberFormatException -> 0x0046 }
        r0 = r2.a;	 Catch:{ NumberFormatException -> 0x0046 }
        r0 = E(r0);	 Catch:{ NumberFormatException -> 0x0046 }
        if (r0 != 0) goto L_0x0048;
    L_0x002a:
        r0 = 1;
    L_0x002b:
        r0 = com.whatsapp.messaging.au.a(r2, r0);	 Catch:{ NumberFormatException -> 0x004a }
        r1.b(r0);	 Catch:{ NumberFormatException -> 0x004a }
        r0 = az;	 Catch:{ NumberFormatException -> 0x004a }
        if (r0 == 0) goto L_0x003f;
    L_0x0036:
        r0 = l;	 Catch:{ NumberFormatException -> 0x004a }
        r1 = com.whatsapp.messaging.au.a(r2);	 Catch:{ NumberFormatException -> 0x004a }
        r0.b(r1);	 Catch:{ NumberFormatException -> 0x004a }
    L_0x003f:
        return;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = 0;
        goto L_0x002b;
    L_0x004a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.protocol.bj):void");
    }

    public static void a(Context context, com.whatsapp.protocol.b bVar) {
        a5w.a(new us(context, bVar), new Void[0]);
    }

    static void a(_2 _2) {
        try {
            if (!Y.contains(_2)) {
                Y.add(_2);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void aF() {
        a5w.a(new x_(), new Void[0]);
    }

    public static void c(Context context, boolean z) {
        Editor edit = context.getSharedPreferences(bb[291], 0).edit();
        try {
            edit.putBoolean(bb[292], z);
            if (!edit.commit()) {
                Log.e(bb[293]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void i(String str) {
        if (ac) {
            Log.i(bb[368]);
            l.b(au.g(new mz(str, null, null, 90, null)));
        }
    }

    static boolean aW() {
        try {
            Class.forName(bb[524]);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r3, int r4, int r5) {
        /*
        r0 = 1;
        r1 = com.whatsapp.m8.d(r3);	 Catch:{ NumberFormatException -> 0x0008 }
        if (r1 == 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        if (r3 != 0) goto L_0x0020;
    L_0x000c:
        r1 = G;	 Catch:{ NumberFormatException -> 0x001e }
        if (r1 != r0) goto L_0x0007;
    L_0x0010:
        r0 = new java.lang.NullPointerException;	 Catch:{ NumberFormatException -> 0x001c }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x001c }
        r2 = 523; // 0x20b float:7.33E-43 double:2.584E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x001c }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x001c }
        throw r0;	 Catch:{ NumberFormatException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x001c }
    L_0x0020:
        r1 = r3.length();	 Catch:{ NumberFormatException -> 0x0044 }
        if (r1 == 0) goto L_0x0032;
    L_0x0026:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0044 }
        r2 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = r1.equals(r3);	 Catch:{ NumberFormatException -> 0x0044 }
        if (r1 == 0) goto L_0x0048;
    L_0x0032:
        r1 = G;	 Catch:{ NumberFormatException -> 0x0046 }
        if (r1 != r0) goto L_0x0007;
    L_0x0036:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ NumberFormatException -> 0x0042 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0042 }
        r2 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0042 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0042 }
        throw r0;	 Catch:{ NumberFormatException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0042 }
    L_0x0048:
        r1 = aZ();
        if (r1 == 0) goto L_0x0007;
    L_0x004e:
        r1 = 0;
        r2 = r5 & 1;
        if (r2 == 0) goto L_0x005c;
    L_0x0053:
        r2 = D;	 Catch:{ NumberFormatException -> 0x00f9 }
        r2 = r2.b(r3);	 Catch:{ NumberFormatException -> 0x00f9 }
        if (r2 == 0) goto L_0x005c;
    L_0x005b:
        r1 = r0;
    L_0x005c:
        r2 = r5 & 2;
        if (r2 == 0) goto L_0x0101;
    L_0x0060:
        r2 = N;	 Catch:{ NumberFormatException -> 0x00fb }
        r2 = r2.b(r3);	 Catch:{ NumberFormatException -> 0x00fb }
        if (r2 == 0) goto L_0x0101;
    L_0x0068:
        if (r0 == 0) goto L_0x0007;
    L_0x006a:
        r0 = ac;	 Catch:{ NumberFormatException -> 0x00fd }
        if (r0 == 0) goto L_0x00b1;
    L_0x006e:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00ff }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x00ff }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x00ff }
        r2 = 517; // 0x205 float:7.24E-43 double:2.554E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x00ff }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x00ff }
        r2 = 521; // 0x209 float:7.3E-43 double:2.574E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r5);	 Catch:{ NumberFormatException -> 0x00ff }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x00ff }
        r2 = 515; // 0x203 float:7.22E-43 double:2.544E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.append(r3);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x00ff }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = l;	 Catch:{ NumberFormatException -> 0x00ff }
        r1 = com.whatsapp.messaging.au.a(r3, r4, r5);	 Catch:{ NumberFormatException -> 0x00ff }
        r0.b(r1);	 Catch:{ NumberFormatException -> 0x00ff }
        r0 = az;	 Catch:{ NumberFormatException -> 0x00ff }
        if (r0 == 0) goto L_0x0007;
    L_0x00b1:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r2 = 522; // 0x20a float:7.31E-43 double:2.58E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r1 = bb;
        r2 = 518; // 0x206 float:7.26E-43 double:2.56E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r5);
        r1 = bb;
        r2 = 516; // 0x204 float:7.23E-43 double:2.55E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r1 = ak;
        monitor-enter(r1);
        r0 = ak;	 Catch:{ all -> 0x00f6 }
        r2 = com.whatsapp.messaging.au.a(r3, r4, r5);	 Catch:{ all -> 0x00f6 }
        r0.put(r3, r2);	 Catch:{ all -> 0x00f6 }
        monitor-exit(r1);	 Catch:{ all -> 0x00f6 }
        goto L_0x0007;
    L_0x00f6:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00f6 }
        throw r0;
    L_0x00f9:
        r0 = move-exception;
        throw r0;
    L_0x00fb:
        r0 = move-exception;
        throw r0;
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;
    L_0x0101:
        r0 = r1;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.lang.String, int, int):void");
    }

    public static void a(Context context, String str, Location location) {
        a(context, str, location, us.g);
    }

    public static boolean b(com.whatsapp.protocol.b bVar) {
        return a(aY(), bVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r4, java.lang.String r5, long r6) {
        /*
        r0 = bb;
        r1 = 362; // 0x16a float:5.07E-43 double:1.79E-321;
        r0 = r0[r1];
        r1 = 0;
        r0 = r4.getSharedPreferences(r0, r1);
        r0 = r0.edit();
        if (r5 == 0) goto L_0x0035;
    L_0x0011:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x004e }
        r2 = 363; // 0x16b float:5.09E-43 double:1.793E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x004e }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x004e }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x004e }
        r2 = r2.append(r5);	 Catch:{ NumberFormatException -> 0x004e }
        r3 = "|";
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x004e }
        r2 = r2.append(r6);	 Catch:{ NumberFormatException -> 0x004e }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x004e }
        r0.putString(r1, r2);	 Catch:{ NumberFormatException -> 0x004e }
        r1 = az;	 Catch:{ NumberFormatException -> 0x004e }
        if (r1 == 0) goto L_0x003e;
    L_0x0035:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x004e }
        r2 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x004e }
        r0.remove(r1);	 Catch:{ NumberFormatException -> 0x004e }
    L_0x003e:
        r0 = r0.commit();	 Catch:{ NumberFormatException -> 0x0050 }
        if (r0 != 0) goto L_0x004d;
    L_0x0044:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0050 }
        r1 = 361; // 0x169 float:5.06E-43 double:1.784E-321;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0050 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0050 }
    L_0x004d:
        return;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.content.Context, java.lang.String, long):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r1 = -1;
        r4 = 2;
        r5 = 3;
        r3 = 1;
        r2 = 0;
        r0 = 538; // 0x21a float:7.54E-43 double:2.66E-321;
        r6 = new java.lang.String[r0];
        r0 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r7 = r2;
        r8 = r6;
        r9 = r6;
        r6 = r0;
        r0 = r1;
    L_0x0010:
        r6 = z(r6);
        r6 = z(r6);
        switch(r0) {
            case 0: goto L_0x0024;
            case 1: goto L_0x002d;
            case 2: goto L_0x0036;
            case 3: goto L_0x0040;
            case 4: goto L_0x0048;
            case 5: goto L_0x0050;
            case 6: goto L_0x0058;
            case 7: goto L_0x0061;
            case 8: goto L_0x006b;
            case 9: goto L_0x0075;
            case 10: goto L_0x007f;
            case 11: goto L_0x0089;
            case 12: goto L_0x0094;
            case 13: goto L_0x009f;
            case 14: goto L_0x00aa;
            case 15: goto L_0x00b5;
            case 16: goto L_0x00c0;
            case 17: goto L_0x00cb;
            case 18: goto L_0x00d6;
            case 19: goto L_0x00e1;
            case 20: goto L_0x00ec;
            case 21: goto L_0x00f7;
            case 22: goto L_0x0102;
            case 23: goto L_0x010d;
            case 24: goto L_0x0118;
            case 25: goto L_0x0123;
            case 26: goto L_0x012e;
            case 27: goto L_0x0139;
            case 28: goto L_0x0144;
            case 29: goto L_0x014f;
            case 30: goto L_0x015a;
            case 31: goto L_0x0165;
            case 32: goto L_0x0170;
            case 33: goto L_0x017b;
            case 34: goto L_0x0186;
            case 35: goto L_0x0191;
            case 36: goto L_0x019c;
            case 37: goto L_0x01a7;
            case 38: goto L_0x01b2;
            case 39: goto L_0x01bd;
            case 40: goto L_0x01c8;
            case 41: goto L_0x01d3;
            case 42: goto L_0x01de;
            case 43: goto L_0x01e9;
            case 44: goto L_0x01f4;
            case 45: goto L_0x01ff;
            case 46: goto L_0x020a;
            case 47: goto L_0x0215;
            case 48: goto L_0x0220;
            case 49: goto L_0x022b;
            case 50: goto L_0x0236;
            case 51: goto L_0x0241;
            case 52: goto L_0x024c;
            case 53: goto L_0x0257;
            case 54: goto L_0x0262;
            case 55: goto L_0x026d;
            case 56: goto L_0x0278;
            case 57: goto L_0x0283;
            case 58: goto L_0x028e;
            case 59: goto L_0x0299;
            case 60: goto L_0x02a4;
            case 61: goto L_0x02af;
            case 62: goto L_0x02ba;
            case 63: goto L_0x02c5;
            case 64: goto L_0x02d0;
            case 65: goto L_0x02db;
            case 66: goto L_0x02e6;
            case 67: goto L_0x02f1;
            case 68: goto L_0x02fc;
            case 69: goto L_0x0307;
            case 70: goto L_0x0312;
            case 71: goto L_0x031d;
            case 72: goto L_0x0328;
            case 73: goto L_0x0333;
            case 74: goto L_0x033e;
            case 75: goto L_0x0349;
            case 76: goto L_0x0354;
            case 77: goto L_0x035f;
            case 78: goto L_0x036a;
            case 79: goto L_0x0375;
            case 80: goto L_0x0380;
            case 81: goto L_0x038b;
            case 82: goto L_0x0396;
            case 83: goto L_0x03a1;
            case 84: goto L_0x03ac;
            case 85: goto L_0x03b7;
            case 86: goto L_0x03c2;
            case 87: goto L_0x03cd;
            case 88: goto L_0x03d8;
            case 89: goto L_0x03e3;
            case 90: goto L_0x03ee;
            case 91: goto L_0x03f9;
            case 92: goto L_0x0404;
            case 93: goto L_0x040f;
            case 94: goto L_0x041a;
            case 95: goto L_0x0425;
            case 96: goto L_0x0430;
            case 97: goto L_0x043b;
            case 98: goto L_0x0446;
            case 99: goto L_0x0451;
            case 100: goto L_0x045c;
            case 101: goto L_0x0467;
            case 102: goto L_0x0472;
            case 103: goto L_0x047d;
            case 104: goto L_0x0488;
            case 105: goto L_0x0493;
            case 106: goto L_0x049e;
            case 107: goto L_0x04a9;
            case 108: goto L_0x04b4;
            case 109: goto L_0x04bf;
            case 110: goto L_0x04ca;
            case 111: goto L_0x04d5;
            case 112: goto L_0x04e0;
            case 113: goto L_0x04eb;
            case 114: goto L_0x04f6;
            case 115: goto L_0x0501;
            case 116: goto L_0x050c;
            case 117: goto L_0x0517;
            case 118: goto L_0x0522;
            case 119: goto L_0x052d;
            case 120: goto L_0x0538;
            case 121: goto L_0x0543;
            case 122: goto L_0x054e;
            case 123: goto L_0x0559;
            case 124: goto L_0x0564;
            case 125: goto L_0x056f;
            case 126: goto L_0x057a;
            case 127: goto L_0x0585;
            case 128: goto L_0x0590;
            case 129: goto L_0x059b;
            case 130: goto L_0x05a6;
            case 131: goto L_0x05b1;
            case 132: goto L_0x05bc;
            case 133: goto L_0x05c7;
            case 134: goto L_0x05d2;
            case 135: goto L_0x05dd;
            case 136: goto L_0x05e8;
            case 137: goto L_0x05f3;
            case 138: goto L_0x05fe;
            case 139: goto L_0x0609;
            case 140: goto L_0x0614;
            case 141: goto L_0x061f;
            case 142: goto L_0x062a;
            case 143: goto L_0x0635;
            case 144: goto L_0x0640;
            case 145: goto L_0x064b;
            case 146: goto L_0x0656;
            case 147: goto L_0x0661;
            case 148: goto L_0x066c;
            case 149: goto L_0x0677;
            case 150: goto L_0x0682;
            case 151: goto L_0x068d;
            case 152: goto L_0x0698;
            case 153: goto L_0x06a3;
            case 154: goto L_0x06ae;
            case 155: goto L_0x06b9;
            case 156: goto L_0x06c4;
            case 157: goto L_0x06cf;
            case 158: goto L_0x06da;
            case 159: goto L_0x06e5;
            case 160: goto L_0x06f0;
            case 161: goto L_0x06fb;
            case 162: goto L_0x0706;
            case 163: goto L_0x0711;
            case 164: goto L_0x071c;
            case 165: goto L_0x0727;
            case 166: goto L_0x0732;
            case 167: goto L_0x073d;
            case 168: goto L_0x0748;
            case 169: goto L_0x0753;
            case 170: goto L_0x075e;
            case 171: goto L_0x0769;
            case 172: goto L_0x0774;
            case 173: goto L_0x077f;
            case 174: goto L_0x078a;
            case 175: goto L_0x0795;
            case 176: goto L_0x07a0;
            case 177: goto L_0x07ab;
            case 178: goto L_0x07b6;
            case 179: goto L_0x07c1;
            case 180: goto L_0x07cc;
            case 181: goto L_0x07d7;
            case 182: goto L_0x07e2;
            case 183: goto L_0x07ed;
            case 184: goto L_0x07f8;
            case 185: goto L_0x0803;
            case 186: goto L_0x080e;
            case 187: goto L_0x0819;
            case 188: goto L_0x0824;
            case 189: goto L_0x082f;
            case 190: goto L_0x083a;
            case 191: goto L_0x0845;
            case 192: goto L_0x0850;
            case 193: goto L_0x085b;
            case 194: goto L_0x0866;
            case 195: goto L_0x0871;
            case 196: goto L_0x087c;
            case 197: goto L_0x0887;
            case 198: goto L_0x0892;
            case 199: goto L_0x089d;
            case 200: goto L_0x08a8;
            case 201: goto L_0x08b3;
            case 202: goto L_0x08be;
            case 203: goto L_0x08c9;
            case 204: goto L_0x08d4;
            case 205: goto L_0x08df;
            case 206: goto L_0x08ea;
            case 207: goto L_0x08f5;
            case 208: goto L_0x0900;
            case 209: goto L_0x090b;
            case 210: goto L_0x0916;
            case 211: goto L_0x0921;
            case 212: goto L_0x092c;
            case 213: goto L_0x0937;
            case 214: goto L_0x0942;
            case 215: goto L_0x094d;
            case 216: goto L_0x0958;
            case 217: goto L_0x0963;
            case 218: goto L_0x096e;
            case 219: goto L_0x0979;
            case 220: goto L_0x0984;
            case 221: goto L_0x098f;
            case 222: goto L_0x099a;
            case 223: goto L_0x09a5;
            case 224: goto L_0x09b0;
            case 225: goto L_0x09bb;
            case 226: goto L_0x09c6;
            case 227: goto L_0x09d1;
            case 228: goto L_0x09dc;
            case 229: goto L_0x09e7;
            case 230: goto L_0x09f2;
            case 231: goto L_0x09fd;
            case 232: goto L_0x0a08;
            case 233: goto L_0x0a13;
            case 234: goto L_0x0a1e;
            case 235: goto L_0x0a29;
            case 236: goto L_0x0a34;
            case 237: goto L_0x0a3f;
            case 238: goto L_0x0a4a;
            case 239: goto L_0x0a55;
            case 240: goto L_0x0a60;
            case 241: goto L_0x0a6b;
            case 242: goto L_0x0a76;
            case 243: goto L_0x0a81;
            case 244: goto L_0x0a8c;
            case 245: goto L_0x0a97;
            case 246: goto L_0x0aa2;
            case 247: goto L_0x0aad;
            case 248: goto L_0x0ab8;
            case 249: goto L_0x0ac3;
            case 250: goto L_0x0ace;
            case 251: goto L_0x0ad9;
            case 252: goto L_0x0ae4;
            case 253: goto L_0x0aef;
            case 254: goto L_0x0afa;
            case 255: goto L_0x0b05;
            case 256: goto L_0x0b10;
            case 257: goto L_0x0b1b;
            case 258: goto L_0x0b26;
            case 259: goto L_0x0b31;
            case 260: goto L_0x0b3c;
            case 261: goto L_0x0b47;
            case 262: goto L_0x0b52;
            case 263: goto L_0x0b5d;
            case 264: goto L_0x0b68;
            case 265: goto L_0x0b73;
            case 266: goto L_0x0b7e;
            case 267: goto L_0x0b89;
            case 268: goto L_0x0b94;
            case 269: goto L_0x0b9f;
            case 270: goto L_0x0baa;
            case 271: goto L_0x0bb5;
            case 272: goto L_0x0bc0;
            case 273: goto L_0x0bcb;
            case 274: goto L_0x0bd6;
            case 275: goto L_0x0be1;
            case 276: goto L_0x0bec;
            case 277: goto L_0x0bf7;
            case 278: goto L_0x0c02;
            case 279: goto L_0x0c0d;
            case 280: goto L_0x0c18;
            case 281: goto L_0x0c23;
            case 282: goto L_0x0c2e;
            case 283: goto L_0x0c39;
            case 284: goto L_0x0c44;
            case 285: goto L_0x0c4f;
            case 286: goto L_0x0c5a;
            case 287: goto L_0x0c65;
            case 288: goto L_0x0c70;
            case 289: goto L_0x0c7b;
            case 290: goto L_0x0c86;
            case 291: goto L_0x0c91;
            case 292: goto L_0x0c9c;
            case 293: goto L_0x0ca7;
            case 294: goto L_0x0cb2;
            case 295: goto L_0x0cbd;
            case 296: goto L_0x0cc8;
            case 297: goto L_0x0cd3;
            case 298: goto L_0x0cde;
            case 299: goto L_0x0ce9;
            case 300: goto L_0x0cf4;
            case 301: goto L_0x0cff;
            case 302: goto L_0x0d0a;
            case 303: goto L_0x0d15;
            case 304: goto L_0x0d20;
            case 305: goto L_0x0d2b;
            case 306: goto L_0x0d36;
            case 307: goto L_0x0d41;
            case 308: goto L_0x0d4c;
            case 309: goto L_0x0d57;
            case 310: goto L_0x0d62;
            case 311: goto L_0x0d6d;
            case 312: goto L_0x0d78;
            case 313: goto L_0x0d83;
            case 314: goto L_0x0d8e;
            case 315: goto L_0x0d99;
            case 316: goto L_0x0da4;
            case 317: goto L_0x0daf;
            case 318: goto L_0x0dba;
            case 319: goto L_0x0dc5;
            case 320: goto L_0x0dd0;
            case 321: goto L_0x0ddb;
            case 322: goto L_0x0de6;
            case 323: goto L_0x0df1;
            case 324: goto L_0x0dfc;
            case 325: goto L_0x0e07;
            case 326: goto L_0x0e12;
            case 327: goto L_0x0e1d;
            case 328: goto L_0x0e28;
            case 329: goto L_0x0e33;
            case 330: goto L_0x0e3e;
            case 331: goto L_0x0e49;
            case 332: goto L_0x0e54;
            case 333: goto L_0x0e5f;
            case 334: goto L_0x0e6a;
            case 335: goto L_0x0e75;
            case 336: goto L_0x0e80;
            case 337: goto L_0x0e8b;
            case 338: goto L_0x0e96;
            case 339: goto L_0x0ea1;
            case 340: goto L_0x0eac;
            case 341: goto L_0x0eb7;
            case 342: goto L_0x0ec2;
            case 343: goto L_0x0ecd;
            case 344: goto L_0x0ed8;
            case 345: goto L_0x0ee3;
            case 346: goto L_0x0eee;
            case 347: goto L_0x0ef9;
            case 348: goto L_0x0f04;
            case 349: goto L_0x0f0f;
            case 350: goto L_0x0f1a;
            case 351: goto L_0x0f25;
            case 352: goto L_0x0f30;
            case 353: goto L_0x0f3b;
            case 354: goto L_0x0f46;
            case 355: goto L_0x0f51;
            case 356: goto L_0x0f5c;
            case 357: goto L_0x0f67;
            case 358: goto L_0x0f72;
            case 359: goto L_0x0f7d;
            case 360: goto L_0x0f88;
            case 361: goto L_0x0f93;
            case 362: goto L_0x0f9e;
            case 363: goto L_0x0fa9;
            case 364: goto L_0x0fb4;
            case 365: goto L_0x0fbf;
            case 366: goto L_0x0fca;
            case 367: goto L_0x0fd5;
            case 368: goto L_0x0fe0;
            case 369: goto L_0x0feb;
            case 370: goto L_0x0ff6;
            case 371: goto L_0x1001;
            case 372: goto L_0x100c;
            case 373: goto L_0x1017;
            case 374: goto L_0x1022;
            case 375: goto L_0x102d;
            case 376: goto L_0x1038;
            case 377: goto L_0x1043;
            case 378: goto L_0x104e;
            case 379: goto L_0x1059;
            case 380: goto L_0x1064;
            case 381: goto L_0x106f;
            case 382: goto L_0x107a;
            case 383: goto L_0x1085;
            case 384: goto L_0x1090;
            case 385: goto L_0x109b;
            case 386: goto L_0x10a6;
            case 387: goto L_0x10b1;
            case 388: goto L_0x10bc;
            case 389: goto L_0x10c7;
            case 390: goto L_0x10d2;
            case 391: goto L_0x10dd;
            case 392: goto L_0x10e8;
            case 393: goto L_0x10f3;
            case 394: goto L_0x10fe;
            case 395: goto L_0x1109;
            case 396: goto L_0x1114;
            case 397: goto L_0x111f;
            case 398: goto L_0x112a;
            case 399: goto L_0x1135;
            case 400: goto L_0x1140;
            case 401: goto L_0x114b;
            case 402: goto L_0x1156;
            case 403: goto L_0x1161;
            case 404: goto L_0x116c;
            case 405: goto L_0x1177;
            case 406: goto L_0x1182;
            case 407: goto L_0x118d;
            case 408: goto L_0x1198;
            case 409: goto L_0x11a3;
            case 410: goto L_0x11ae;
            case 411: goto L_0x11b9;
            case 412: goto L_0x11c4;
            case 413: goto L_0x11cf;
            case 414: goto L_0x11da;
            case 415: goto L_0x11e5;
            case 416: goto L_0x11f0;
            case 417: goto L_0x11fb;
            case 418: goto L_0x1206;
            case 419: goto L_0x1211;
            case 420: goto L_0x121c;
            case 421: goto L_0x1227;
            case 422: goto L_0x1232;
            case 423: goto L_0x123d;
            case 424: goto L_0x1248;
            case 425: goto L_0x1253;
            case 426: goto L_0x125e;
            case 427: goto L_0x1269;
            case 428: goto L_0x1274;
            case 429: goto L_0x127f;
            case 430: goto L_0x128a;
            case 431: goto L_0x1295;
            case 432: goto L_0x12a0;
            case 433: goto L_0x12ab;
            case 434: goto L_0x12b6;
            case 435: goto L_0x12c1;
            case 436: goto L_0x12cc;
            case 437: goto L_0x12d7;
            case 438: goto L_0x12e2;
            case 439: goto L_0x12ed;
            case 440: goto L_0x12f8;
            case 441: goto L_0x1303;
            case 442: goto L_0x130e;
            case 443: goto L_0x1319;
            case 444: goto L_0x1324;
            case 445: goto L_0x132f;
            case 446: goto L_0x133a;
            case 447: goto L_0x1345;
            case 448: goto L_0x1350;
            case 449: goto L_0x135b;
            case 450: goto L_0x1366;
            case 451: goto L_0x1371;
            case 452: goto L_0x137c;
            case 453: goto L_0x1387;
            case 454: goto L_0x1392;
            case 455: goto L_0x139d;
            case 456: goto L_0x13a8;
            case 457: goto L_0x13b3;
            case 458: goto L_0x13be;
            case 459: goto L_0x13c9;
            case 460: goto L_0x13d4;
            case 461: goto L_0x13df;
            case 462: goto L_0x13ea;
            case 463: goto L_0x13f5;
            case 464: goto L_0x1400;
            case 465: goto L_0x140b;
            case 466: goto L_0x1416;
            case 467: goto L_0x1421;
            case 468: goto L_0x142c;
            case 469: goto L_0x1437;
            case 470: goto L_0x1442;
            case 471: goto L_0x144d;
            case 472: goto L_0x1458;
            case 473: goto L_0x1463;
            case 474: goto L_0x146e;
            case 475: goto L_0x1479;
            case 476: goto L_0x1484;
            case 477: goto L_0x148f;
            case 478: goto L_0x149a;
            case 479: goto L_0x14a5;
            case 480: goto L_0x14b0;
            case 481: goto L_0x14bb;
            case 482: goto L_0x14c6;
            case 483: goto L_0x14d1;
            case 484: goto L_0x14dc;
            case 485: goto L_0x14e7;
            case 486: goto L_0x14f2;
            case 487: goto L_0x14fd;
            case 488: goto L_0x1508;
            case 489: goto L_0x1513;
            case 490: goto L_0x151e;
            case 491: goto L_0x1529;
            case 492: goto L_0x1534;
            case 493: goto L_0x153f;
            case 494: goto L_0x154a;
            case 495: goto L_0x1555;
            case 496: goto L_0x1560;
            case 497: goto L_0x156b;
            case 498: goto L_0x1576;
            case 499: goto L_0x1581;
            case 500: goto L_0x158c;
            case 501: goto L_0x1597;
            case 502: goto L_0x15a2;
            case 503: goto L_0x15ad;
            case 504: goto L_0x15b8;
            case 505: goto L_0x15c3;
            case 506: goto L_0x15ce;
            case 507: goto L_0x15d9;
            case 508: goto L_0x15e4;
            case 509: goto L_0x15ef;
            case 510: goto L_0x15fa;
            case 511: goto L_0x1605;
            case 512: goto L_0x1610;
            case 513: goto L_0x161b;
            case 514: goto L_0x1626;
            case 515: goto L_0x1631;
            case 516: goto L_0x163c;
            case 517: goto L_0x1647;
            case 518: goto L_0x1652;
            case 519: goto L_0x165d;
            case 520: goto L_0x1668;
            case 521: goto L_0x1673;
            case 522: goto L_0x167e;
            case 523: goto L_0x1689;
            case 524: goto L_0x1694;
            case 525: goto L_0x169f;
            case 526: goto L_0x16aa;
            case 527: goto L_0x16b5;
            case 528: goto L_0x16c0;
            case 529: goto L_0x16cb;
            case 530: goto L_0x16d6;
            case 531: goto L_0x16e1;
            case 532: goto L_0x16ec;
            case 533: goto L_0x16f7;
            case 534: goto L_0x1702;
            case 535: goto L_0x170d;
            case 536: goto L_0x1718;
            default: goto L_0x001b;
        };
    L_0x001b:
        r8[r7] = r6;
        r0 = "$-^c~ )\\)j/4Jck$4B)i";
        r6 = r0;
        r7 = r3;
        r8 = r9;
        r0 = r2;
        goto L_0x0010;
    L_0x0024:
        r8[r7] = r6;
        r0 = "78I%~1/O8d*3q&d!";
        r6 = r0;
        r7 = r4;
        r8 = r9;
        r0 = r3;
        goto L_0x0010;
    L_0x002d:
        r8[r7] = r6;
        r0 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r6 = r0;
        r7 = r5;
        r8 = r9;
        r0 = r4;
        goto L_0x0010;
    L_0x0036:
        r8[r7] = r6;
        r6 = 4;
        r0 = "$-^c~ )B#j,3M#x+)Y%y-0]+~j;O%a 9";
        r7 = r6;
        r8 = r9;
        r6 = r0;
        r0 = r5;
        goto L_0x0010;
    L_0x0040:
        r8[r7] = r6;
        r7 = 5;
        r6 = ")2I%c6\u0002Y%y-\u0002C)~6<I)~";
        r0 = 4;
        r8 = r9;
        goto L_0x0010;
    L_0x0048:
        r8[r7] = r6;
        r7 = 6;
        r6 = "1$^)";
        r0 = 5;
        r8 = r9;
        goto L_0x0010;
    L_0x0050:
        r8[r7] = r6;
        r7 = 7;
        r6 = "1$^)";
        r0 = 6;
        r8 = r9;
        goto L_0x0010;
    L_0x0058:
        r8[r7] = r6;
        r7 = 8;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 7;
        r8 = r9;
        goto L_0x0010;
    L_0x0061:
        r8[r7] = r6;
        r7 = 9;
        r6 = "65A;R$1B\u0013n*3Z-n1.";
        r0 = 8;
        r8 = r9;
        goto L_0x0010;
    L_0x006b:
        r8[r7] = r6;
        r7 = 10;
        r6 = "$-^c~ )O a&2@8l&)]ck$4B)i";
        r0 = 9;
        r8 = r9;
        goto L_0x0010;
    L_0x0075:
        r8[r7] = r6;
        r7 = 11;
        r6 = "\u0004%A b11";
        r0 = 10;
        r8 = r9;
        goto L_0x0010;
    L_0x007f:
        r8[r7] = r6;
        r7 = 12;
        r6 = "=0^<\"68\\:d&8\u0001>h$9Wc~ 3Ja} 3J%c\"p\\)|08]8~\u007f}";
        r0 = 11;
        r8 = r9;
        goto L_0x0010;
    L_0x0089:
        r8[r7] = r6;
        r7 = 13;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 12;
        r8 = r9;
        goto L_0x0010;
    L_0x0094:
        r8[r7] = r6;
        r7 = 14;
        r6 = "\"/A9}6\u0002])\u007f38\\\u0013}72^?R)<]8R78H>h65q8d(8";
        r0 = 13;
        r8 = r9;
        goto L_0x0010;
    L_0x009f:
        r8[r7] = r6;
        r7 = 15;
        r6 = "=0^<\"68\\:d&8\u0001>h$9Wc~ 3Jly-(C.-78_9h6)]v-";
        r0 = 14;
        r8 = r9;
        goto L_0x0010;
    L_0x00aa:
        r8[r7] = r6;
        r7 = 16;
        r6 = "=0^<\"68\\:d&8\u0001>h$9W";
        r0 = 15;
        r8 = r9;
        goto L_0x0010;
    L_0x00b5:
        r8[r7] = r6;
        r7 = 17;
        r6 = "$-^c~ 3J\u001eh(2X)L!0G\"~";
        r0 = 16;
        r8 = r9;
        goto L_0x0010;
    L_0x00c0:
        r8[r7] = r6;
        r7 = 18;
        r6 = "!8X%n rC)`*/Wc`$%\u000e";
        r0 = 17;
        r8 = r9;
        goto L_0x0010;
    L_0x00cb:
        r8[r7] = r6;
        r7 = 19;
        r6 = "l}B#z\b8C#\u007f<`";
        r0 = 18;
        r8 = r9;
        goto L_0x0010;
    L_0x00d6:
        r8[r7] = r6;
        r7 = 20;
        r6 = "e6l";
        r0 = 19;
        r8 = r9;
        goto L_0x0010;
    L_0x00e1:
        r8[r7] = r6;
        r7 = 21;
        r6 = "eu";
        r0 = 20;
        r8 = r9;
        goto L_0x0010;
    L_0x00ec:
        r8[r7] = r6;
        r7 = 22;
        r6 = "e6ll%;";
        r0 = 21;
        r8 = r9;
        goto L_0x0010;
    L_0x00f7:
        r8[r7] = r6;
        r7 = 23;
        r6 = "e6lcl)1A/l18Jl";
        r0 = 22;
        r8 = r9;
        goto L_0x0010;
    L_0x0102:
        r8[r7] = r6;
        r7 = 24;
        r6 = "e6lcl)1A/l18Jl";
        r0 = 23;
        r8 = r9;
        goto L_0x0010;
    L_0x010d:
        r8[r7] = r6;
        r7 = 25;
        r6 = "!8X%n rC)`*/Wci$1X%fj.G6he";
        r0 = 24;
        r8 = r9;
        goto L_0x0010;
    L_0x0118:
        r8[r7] = r6;
        r7 = 26;
        r6 = "e6lck78Kl";
        r0 = 25;
        r8 = r9;
        goto L_0x0010;
    L_0x0123:
        r8[r7] = r6;
        r7 = 27;
        r6 = "e\u0010le";
        r0 = 26;
        r8 = r9;
        goto L_0x0010;
    L_0x012e:
        r8[r7] = r6;
        r7 = 28;
        r6 = "e6l";
        r0 = 27;
        r8 = r9;
        goto L_0x0010;
    L_0x0139:
        r8[r7] = r6;
        r7 = 29;
        r6 = "!8X%n rC)`*/Wcc$)G:hj.G6he";
        r0 = 28;
        r8 = r9;
        goto L_0x0010;
    L_0x0144:
        r8[r7] = r6;
        r7 = 30;
        r6 = "e6lck78Kl";
        r0 = 29;
        r8 = r9;
        goto L_0x0010;
    L_0x014f:
        r8[r7] = r6;
        r7 = 31;
        r6 = "!8X%n rC)`*/Wc~<.Z)`j<X-d)<L he";
        r0 = 30;
        r8 = r9;
        goto L_0x0010;
    L_0x015a:
        r8[r7] = r6;
        r7 = 32;
        r6 = "$-^c~ 3J\u001fh1\u001a\\#x5\u000e[.g >Z";
        r0 = 31;
        r8 = r9;
        goto L_0x0010;
    L_0x0165:
        r8[r7] = r6;
        r7 = 33;
        r6 = "$-^c~ 3J b&<Z%b+r";
        r0 = 32;
        r8 = r9;
        goto L_0x0010;
    L_0x0170:
        r8[r7] = r6;
        r7 = 34;
        r6 = "k)C<";
        r0 = 33;
        r8 = r9;
        goto L_0x0010;
    L_0x017b:
        r8[r7] = r6;
        r7 = 35;
        r6 = "$-^ci**@ b$9C)i,<\u0001\"b\u001a(\\ ";
        r0 = 34;
        r8 = r9;
        goto L_0x0010;
    L_0x0186:
        r8[r7] = r6;
        r7 = 36;
        r6 = "(8";
        r0 = 35;
        r8 = r9;
        goto L_0x0010;
    L_0x0191:
        r8[r7] = r6;
        r7 = 37;
        r6 = "$-^c~ )m#c38\\?l14A\"^ 8@c|7}G\"{$1G(-.8Wcn*(@8-";
        r0 = 36;
        r8 = r9;
        goto L_0x0010;
    L_0x019c:
        r8[r7] = r6;
        r7 = 38;
        r6 = "68\\:h7}M#c+8M8h!";
        r0 = 37;
        r8 = r9;
        goto L_0x0010;
    L_0x01a7:
        r8[r7] = r6;
        r7 = 39;
        r6 = " %^%\u007f<\u0002G\"R68M#c!.";
        r0 = 38;
        r8 = r9;
        goto L_0x0010;
    L_0x01b2:
        r8[r7] = r6;
        r7 = 40;
        r6 = "68\\:h7}J%~&2@\"h&)K(";
        r0 = 39;
        r8 = r9;
        goto L_0x0010;
    L_0x01bd:
        r8[r7] = r6;
        r7 = 41;
        r6 = "68\\:h7}M#c+8M8d+:";
        r0 = 40;
        r8 = r9;
        goto L_0x0010;
    L_0x01c8:
        r8[r7] = r6;
        r7 = 42;
        r6 = "$-^cn78O8hj/K-i\u001a0Kc~ /G-a,'O8d*3q)\u007f72\\";
        r0 = 41;
        r8 = r9;
        goto L_0x0010;
    L_0x01d3:
        r8[r7] = r6;
        r7 = 43;
        r6 = "(8q#a!";
        r0 = 42;
        r8 = r9;
        goto L_0x0010;
    L_0x01de:
        r8[r7] = r6;
        r7 = 44;
        r6 = "$-^cj )A i(8";
        r0 = 43;
        r8 = r9;
        goto L_0x0010;
    L_0x01e9:
        r8[r7] = r6;
        r7 = 45;
        r6 = "$-^cn78O8hj/K-i\u001a0Kcd*\u0002K>\u007f*/";
        r0 = 44;
        r8 = r9;
        goto L_0x0010;
    L_0x01f4:
        r8[r7] = r6;
        r7 = 46;
        r6 = "(8q#a!";
        r0 = 45;
        r8 = r9;
        goto L_0x0010;
    L_0x01ff:
        r8[r7] = r6;
        r7 = 47;
        r6 = "$-^c~ 3J\u001eh(2X)]$/Z%n,-O\"y6";
        r0 = 46;
        r8 = r9;
        goto L_0x0010;
    L_0x020a:
        r8[r7] = r6;
        r7 = 48;
        r6 = "$(J%b";
        r0 = 47;
        r8 = r9;
        goto L_0x0010;
    L_0x0215:
        r8[r7] = r6;
        r7 = 49;
        r6 = "$-^c\u007f )\\5` 9G-x51A-ij9[<a,>O8h";
        r0 = 48;
        r8 = r9;
        goto L_0x0010;
    L_0x0220:
        r8[r7] = r6;
        r7 = 50;
        r6 = "#<";
        r0 = 49;
        r8 = r9;
        goto L_0x0010;
    L_0x022b:
        r8[r7] = r6;
        r7 = 51;
        r6 = "-8";
        r0 = 50;
        r8 = r9;
        goto L_0x0010;
    L_0x0236:
        r8[r7] = r6;
        r7 = 52;
        r6 = ",*";
        r0 = 51;
        r8 = r9;
        goto L_0x0010;
    L_0x0241:
        r8[r7] = r6;
        r7 = 53;
        r6 = "$/";
        r0 = 52;
        r8 = r9;
        goto L_0x0010;
    L_0x024c:
        r8[r7] = r6;
        r7 = 54;
        r6 = "6$@/\"-<]/x7/K\"y6$@/\"1$^)0";
        r0 = 53;
        r8 = r9;
        goto L_0x0010;
    L_0x0257:
        r8[r7] = r6;
        r7 = 55;
        r6 = "&2Cbz-<Z?l5-";
        r0 = 54;
        r8 = r9;
        goto L_0x0010;
    L_0x0262:
        r8[r7] = r6;
        r7 = 56;
        r6 = "&2Cbl+9\\#d!sM#c1<M8~";
        r0 = 55;
        r8 = r9;
        goto L_0x0010;
    L_0x026d:
        r8[r7] = r6;
        r7 = 57;
        r6 = "(8q#a!";
        r0 = 56;
        r8 = r9;
        goto L_0x0010;
    L_0x0278:
        r8[r7] = r6;
        r7 = 58;
        r6 = "$-^c~$+K#a!0K";
        r0 = 57;
        r8 = r9;
        goto L_0x0010;
    L_0x0283:
        r8[r7] = r6;
        r7 = 59;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 58;
        r8 = r9;
        goto L_0x0010;
    L_0x028e:
        r8[r7] = r6;
        r7 = 60;
        r6 = "78_9h6)G\"je.K>{ /\u000e<\u007f*-K>y,8]";
        r0 = 59;
        r8 = r9;
        goto L_0x0010;
    L_0x0299:
        r8[r7] = r6;
        r7 = 61;
        r6 = "&2C<a )K(-&2@\"h&)K(-0-I>l!8\u000e?n74^8";
        r0 = 60;
        r8 = r9;
        goto L_0x0010;
    L_0x02a4:
        r8[r7] = r6;
        r7 = 62;
        r6 = "78_9h6)G\"je>O a$?G d1$\u000e#ce<B -&2@8l&)]";
        r0 = 61;
        r8 = r9;
        goto L_0x0010;
    L_0x02af:
        r8[r7] = r6;
        r7 = 63;
        r6 = "32G<-+8Z;b76\u000e/e$3I)-)4@'- /\\#\u007f";
        r0 = 62;
        r8 = r9;
        goto L_0x0010;
    L_0x02ba:
        r8[r7] = r6;
        r7 = 64;
        r6 = "&1G)c1\u0002X)\u007f64A\"R0-I>l!8J";
        r0 = 63;
        r8 = r9;
        goto L_0x0010;
    L_0x02c5:
        r8[r7] = r6;
        r7 = 65;
        r6 = "&1G)c1\u0002X)\u007f64A\"R0-I>l!8J";
        r0 = 64;
        r8 = r9;
        goto L_0x0010;
    L_0x02d0:
        r8[r7] = r6;
        r7 = 66;
        r6 = "7(@\"d+:\u000e/b+3K/y 9\u000e9}\"/O(he.M>d5)";
        r0 = 65;
        r8 = r9;
        goto L_0x0010;
    L_0x02db:
        r8[r7] = r6;
        r7 = 67;
        r6 = "\u0005.\u0000;e$)]-}5s@)y";
        r0 = 66;
        r8 = r9;
        goto L_0x0010;
    L_0x02e6:
        r8[r7] = r6;
        r7 = 68;
        r6 = "$-^c~ )\\)j38\\%k,8Jck$4B)i";
        r0 = 67;
        r8 = r9;
        goto L_0x0010;
    L_0x02f1:
        r8[r7] = r6;
        r7 = 69;
        r6 = "&>";
        r0 = 68;
        r8 = r9;
        goto L_0x0010;
    L_0x02fc:
        r8[r7] = r6;
        r7 = 70;
        r6 = "78I%~1/O8d*3q?y$)K";
        r0 = 69;
        r8 = r9;
        goto L_0x0010;
    L_0x0307:
        r8[r7] = r6;
        r7 = 71;
        r6 = "55";
        r0 = 70;
        r8 = r9;
        goto L_0x0010;
    L_0x0312:
        r8[r7] = r6;
        r7 = 72;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 71;
        r8 = r9;
        goto L_0x0010;
    L_0x031d:
        r8[r7] = r6;
        r7 = 73;
        r6 = "&/O?eh1A+\"#<G h!";
        r0 = 72;
        r8 = r9;
        goto L_0x0010;
    L_0x0328:
        r8[r7] = r6;
        r7 = 74;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 73;
        r8 = r9;
        goto L_0x0010;
    L_0x0333:
        r8[r7] = r6;
        r7 = 75;
        r6 = "5(]$R+<C)";
        r0 = 74;
        r8 = r9;
        goto L_0x0010;
    L_0x033e:
        r8[r7] = r6;
        r7 = 76;
        r6 = "\u0019\n";
        r0 = 75;
        r8 = r9;
        goto L_0x0010;
    L_0x0349:
        r8[r7] = r6;
        r7 = 77;
        r6 = "to\u001dx8s";
        r0 = 76;
        r8 = r9;
        goto L_0x0010;
    L_0x0354:
        r8[r7] = r6;
        r7 = 78;
        r6 = "+8Ya";
        r0 = 77;
        r8 = r9;
        goto L_0x0010;
    L_0x035f:
        r8[r7] = r6;
        r7 = 79;
        r6 = "ti\u001et8ph\u001f|=u";
        r0 = 78;
        r8 = r9;
        goto L_0x0010;
    L_0x036a:
        r8[r7] = r6;
        r7 = 80;
        r6 = "$3J>b,9q%i";
        r0 = 79;
        r8 = r9;
        goto L_0x0010;
    L_0x0375:
        r8[r7] = r6;
        r7 = 81;
        r6 = "ti\u001et8ph\u001f|=u";
        r0 = 80;
        r8 = r9;
        goto L_0x0010;
    L_0x0380:
        r8[r7] = r6;
        r7 = 82;
        r6 = "$-^c~ 3J\u001fx'.M>d'8b#n$)G#c6r";
        r0 = 81;
        r8 = r9;
        goto L_0x0010;
    L_0x038b:
        r8[r7] = r6;
        r7 = 83;
        r6 = "\n/G)c1<Z%b+";
        r0 = 82;
        r8 = r9;
        goto L_0x0010;
    L_0x0396:
        r8[r7] = r6;
        r7 = 84;
        r6 = "0.K>L&)G#c\u00032\\;l79c)~6<I)\"*/G+d+<B\u0013~,'Kv";
        r0 = 83;
        r8 = r9;
        goto L_0x0010;
    L_0x03a1:
        r8[r7] = r6;
        r7 = 85;
        r6 = "0.K>L&)G#c\u00032\\;l79c)~6<I)\"(8J%l\u001a9O8le4]lc01B";
        r0 = 84;
        r8 = r9;
        goto L_0x0010;
    L_0x03ac:
        r8[r7] = r6;
        r7 = 86;
        r6 = "0.K>L&)G#c\u00032\\;l79c)~6<I)\"'<]);qpJ)n*9Kch7/A>";
        r0 = 85;
        r8 = r9;
        goto L_0x0010;
    L_0x03b7:
        r8[r7] = r6;
        r7 = 87;
        r6 = "0.K>L&)G#c\u00032\\;l79c)~6<I)";
        r0 = 86;
        r8 = r9;
        goto L_0x0010;
    L_0x03c2:
        r8[r7] = r6;
        r7 = 88;
        r6 = "e;G h\u001a1K\"j15\u0014";
        r0 = 87;
        r8 = r9;
        goto L_0x0010;
    L_0x03cd:
        r8[r7] = r6;
        r7 = 89;
        r6 = "0.K>L&)G#c\u00032\\;l79c)~6<I)\"(8J%l\u001a9O8lk;G he4]lc01B";
        r0 = 88;
        r8 = r9;
        goto L_0x0010;
    L_0x03d8:
        r8[r7] = r6;
        r7 = 90;
        r6 = " 0^8te7G(~e1G?ye4@l\u007f ,[)~18Jln$-O.d)4Z5-4(K>t~}]'d5-G\"j";
        r0 = 89;
        r8 = r9;
        goto L_0x0010;
    L_0x03e3:
        r8[r7] = r6;
        r7 = 91;
        r6 = "(2[\"y 9q>b";
        r0 = 90;
        r8 = r9;
        goto L_0x0010;
    L_0x03ee:
        r8[r7] = r6;
        r7 = 92;
        r6 = "(2[\"y 9";
        r0 = 91;
        r8 = r9;
        goto L_0x0010;
    L_0x03f9:
        r8[r7] = r6;
        r7 = 93;
        r6 = "$-^cn-8M'd#/K!b3<L hj8\\>b7}";
        r0 = 92;
        r8 = r9;
        goto L_0x0010;
    L_0x0404:
        r8[r7] = r6;
        r7 = 94;
        r6 = "32G<\"+(B R/4J";
        r0 = 93;
        r8 = r9;
        goto L_0x0010;
    L_0x040f:
        r8[r7] = r6;
        r7 = 95;
        r6 = "$-^c~(.\u0001\"be<M8d34Z%h6";
        r0 = 94;
        r8 = r9;
        goto L_0x0010;
    L_0x041a:
        r8[r7] = r6;
        r7 = 96;
        r6 = "$-^c~(.\u000e";
        r0 = 95;
        r8 = r9;
        goto L_0x0010;
    L_0x0425:
        r8[r7] = r6;
        r7 = 97;
        r6 = "60]\u0013o*9W";
        r0 = 96;
        r8 = r9;
        goto L_0x0010;
    L_0x0430:
        r8[r7] = r6;
        r7 = 98;
        r6 = "$3J>b,9\u0000%c18@8#$>Z%b+s}\tC\u0001\ta";
        r0 = 97;
        r8 = r9;
        goto L_0x0010;
    L_0x043b:
        r8[r7] = r6;
        r7 = 99;
        r6 = "$-^c~ )\\)j5/G/hj;O%a 9";
        r0 = 98;
        r8 = r9;
        goto L_0x0010;
    L_0x0446:
        r8[r7] = r6;
        r7 = 100;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 99;
        r8 = r9;
        goto L_0x0010;
    L_0x0451:
        r8[r7] = r6;
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r6 = "78I%~1/O8d*3q<\u007f,>K";
        r0 = 100;
        r8 = r9;
        goto L_0x0010;
    L_0x045c:
        r8[r7] = r6;
        r7 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r6 = "$-^ci 1K8h*1J!h";
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0467:
        r8[r7] = r6;
        r7 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = "(8q#a!";
        r0 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0472:
        r8[r7] = r6;
        r7 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r6 = "$-^cx59O8h&0O\"i!0Y#\u007f.8\\ci'\u0002G\"d1";
        r0 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x047d:
        r8[r7] = r6;
        r7 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r6 = "\u00168\\:h7\u001d]bz-<Z?l5-\u0000\"h1";
        r0 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0488:
        r8[r7] = r6;
        r7 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r6 = "\"/A9}\u001a3A8d&8n8h(-";
        r0 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0493:
        r8[r7] = r6;
        r7 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r6 = "$-^cl)<\\!\"!?L-n.(^c~1<\\8-";
        r0 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x049e:
        r8[r7] = r6;
        r7 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r6 = "&2Cbz-<Z?l5-\u0000-a$/Cb@\u0000\u000e}\rJ\u0000\u000eq\bO\u001a\u001fo\u000fF\u0010\r";
        r0 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x04a9:
        r8[r7] = r6;
        r7 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r6 = "$1O>`";
        r0 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x04b4:
        r8[r7] = r6;
        r7 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r6 = "&2Cbz-<Z?l5-";
        r0 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x04bf:
        r8[r7] = r6;
        r7 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r6 = "6-O!R'<@\"h!";
        r0 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x04ca:
        r8[r7] = r6;
        r7 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r6 = "6-O!R'<@\"h!\u0002K4},/W\u0013y,0K?y$0^";
        r0 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x04d5:
        r8[r7] = r6;
        r7 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x04e0:
        r8[r7] = r6;
        r7 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r6 = "$-^c~ )]<l(?O\"c 9\u0001*l,1K(";
        r0 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x04eb:
        r8[r7] = r6;
        r7 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r6 = "$-^c~ 3J+h1-\\%{$>W?h1)G\"j6";
        r0 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x04f6:
        r8[r7] = r6;
        r7 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r6 = "=0^<\"68\\:d&8\u0001.d+9";
        r0 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0501:
        r8[r7] = r6;
        r7 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r6 = "$-^c~ 3J\u0000h$+K\u000b\u007f*(^";
        r0 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x050c:
        r8[r7] = r6;
        r7 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r6 = "$-^cu(-^c~ 3Jc|7\u0002C?j\u001a.Z-y0.\u000e%c3<B%ie.Z-y0.";
        r0 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0517:
        r8[r7] = r6;
        r7 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0522:
        r8[r7] = r6;
        r7 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r6 = "78I%~1/O8d*3q&d!";
        r0 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x052d:
        r8[r7] = r6;
        r7 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r6 = "$-^c\u007f <J l6)H9a).W\"n#/A!k,1Kcd*8\\>b7}";
        r0 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0538:
        r8[r7] = r6;
        r7 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r6 = "$-^c\u007f <J l6)H9a).W\"n#/A!k,1Kcd*8\\>b7}";
        r0 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0543:
        r8[r7] = r6;
        r7 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r6 = "#(B ~<3Mbi$)";
        r0 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x054e:
        r8[r7] = r6;
        r7 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r6 = "$-^c\u007f <J l6)H9a).W\"n#/A!k,1Kcd*8\\>b7}";
        r0 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0559:
        r8[r7] = r6;
        r7 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r6 = "$-^c\u007f <J l6)H9a).W\"n#/A!k,1Kck$4Bl";
        r0 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0564:
        r8[r7] = r6;
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r6 = "&2Cbz-<Z?l5-";
        r0 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x056f:
        r8[r7] = r6;
        r7 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r6 = "\"/A9}\u001a3A8d&8n8h(-";
        r0 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x057a:
        r8[r7] = r6;
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = "&2Cbz-<Z?l5-\u0000-a$/Cb_\u0000\u001ag\u001fY\u0017\u001cz\u0005B\u000b\u0002|\tY\u0017\u0004";
        r0 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0585:
        r8[r7] = r6;
        r7 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r6 = "&2Cbz-<Z?l5-";
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0590:
        r8[r7] = r6;
        r7 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r6 = "$1O>`";
        r0 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x059b:
        r8[r7] = r6;
        r7 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r6 = "$-^c~ 3J\u000bh1\u001f\\#l!>O?y\t4]8~";
        r0 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x05a6:
        r8[r7] = r6;
        r7 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x05b1:
        r8[r7] = r6;
        r7 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r6 = ",3^9y\u001a8@8h7\u0002])c!";
        r0 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x05bc:
        r8[r7] = r6;
        r7 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r6 = "$-^c~ )K\"y /\u0003%~h.K\"ij;O%a 9";
        r0 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x05c7:
        r8[r7] = r6;
        r7 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r6 = ",3X-a,9q\"x(?K>~";
        r0 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x05d2:
        r8[r7] = r6;
        r7 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r6 = "$-^c~ )X#d&8M#i 1K\"j15\u0001*l,1K(";
        r0 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x05dd:
        r8[r7] = r6;
        r7 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x05e8:
        r8[r7] = r6;
        r7 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r6 = "78I%~1/O8d*3q:b,>K\u0013n*9K\u0013a 3I8e";
        r0 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x05f3:
        r8[r7] = r6;
        r7 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r6 = "\t2I?";
        r0 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x05fe:
        r8[r7] = r6;
        r7 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r6 = "(2[\"y 9";
        r0 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0609:
        r8[r7] = r6;
        r7 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r6 = "$-^cn78O8hj1A+k,1Kch7/A>-";
        r0 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0614:
        r8[r7] = r6;
        r7 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r6 = "$-^ck$4B)ie1A+d+\u0002H-d)8J";
        r0 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x061f:
        r8[r7] = r6;
        r7 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r6 = ")2I%c\u001a;O%a 9";
        r0 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x062a:
        r8[r7] = r6;
        r7 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r6 = "$-^ca*<J b\"4@*l,1K(\"+2@)";
        r0 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0635:
        r8[r7] = r6;
        r7 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r6 = ")2I%c\u001a;O%a 9";
        r0 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0640:
        r8[r7] = r6;
        r7 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r6 = "+(C.h7}H#\u007f(<Zlc*)\u000e:l)4Jv-";
        r0 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x064b:
        r8[r7] = r6;
        r7 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r6 = "&2Cbj*2I hk<@(\u007f*4Jb`$-]b@$-o/y,+G8t";
        r0 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0656:
        r8[r7] = r6;
        r7 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r6 = "$3J>b,9\u0000+`";
        r0 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0661:
        r8[r7] = r6;
        r7 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\u000e{\u000eG\u0000\u001ez";
        r0 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x066c:
        r8[r7] = r6;
        r7 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r6 = "$3J>b,9\u0000%c18@8#$>Z%b+s}\tC\u0001";
        r0 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0677:
        r8[r7] = r6;
        r7 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\tk\u0014Y";
        r0 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0682:
        r8[r7] = r6;
        r7 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\tk\u0014Y";
        r0 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x068d:
        r8[r7] = r6;
        r7 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r6 = "$-^c}$>E-j 9G\"y 3Z?\"!8X%n }";
        r0 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0698:
        r8[r7] = r6;
        r7 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r6 = "\t\u001akaA\u0010o\u001d|=";
        r0 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x06a3:
        r8[r7] = r6;
        r7 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r6 = "&2Cba\"8\u0000!h6.O+hk<M8d34Z5#&2C<b68\u0000\u000fb(-A?h\b8]?l\"8o/y,+G8t";
        r0 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x06ae:
        r8[r7] = r6;
        r7 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r6 = "$3J>b,9\u0000%c18@8#$>Z%b+s}\tC\u0001";
        r0 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x06b9:
        r8[r7] = r6;
        r7 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r6 = "$3J>b,9\u0000%c18@8#$>Z%b+s}\tC\u0001";
        r0 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x06c4:
        r8[r7] = r6;
        r7 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r6 = "e!\u000e";
        r0 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x06cf:
        r8[r7] = r6;
        r7 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r6 = "$-^c}$>E-j 9G\"y 3Z?\"*+K>\u007f,9K";
        r0 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x06da:
        r8[r7] = r6;
        r7 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\u000e{\u000eG\u0000\u001ez";
        r0 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x06e5:
        r8[r7] = r6;
        r7 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r6 = "(8]?l\"8\u0001>k&e\u001c~";
        r0 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x06f0:
        r8[r7] = r6;
        r7 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r6 = "$3J>b,9\u0000%c18@8#$>Z%b+s}\tC\u0001";
        r0 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x06fb:
        r8[r7] = r6;
        r7 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r6 = "(0]";
        r0 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0706:
        r8[r7] = r6;
        r7 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\u000ez\u001eH\u0004\u0010";
        r0 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0711:
        r8[r7] = r6;
        r7 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r6 = "60]\u0013o*9W";
        r0 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x071c:
        r8[r7] = r6;
        r7 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r6 = "(8]?l\"8\u0001>k&e\u001c~";
        r0 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0727:
        r8[r7] = r6;
        r7 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\u000ez\u001eH\u0004\u0010";
        r0 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0732:
        r8[r7] = r6;
        r7 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\u0014`\u0005Y\f\u001cb\u0013D\u000b\tk\u0002Y\u0016";
        r0 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x073d:
        r8[r7] = r6;
        r7 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r6 = "$-^cy,0Kl~ /X)\u007f\u007f";
        r0 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0748:
        r8[r7] = r6;
        r7 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r6 = "&1G)c1\u0002])\u007f38\\\u0013y,0K\u0013i,;H";
        r0 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0753:
        r8[r7] = r6;
        r7 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r6 = "e>[>\u007f 3Zan)4K\"y\u007f";
        r0 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x075e:
        r8[r7] = r6;
        r7 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0769:
        r8[r7] = r6;
        r7 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r6 = "e>B%h+)\u0014";
        r0 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0774:
        r8[r7] = r6;
        r7 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r6 = "e>[>\u007f 3Za~ /X)\u007f\u007f";
        r0 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x077f:
        r8[r7] = r6;
        r7 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r6 = "$-^ca**C)`*/W";
        r0 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x078a:
        r8[r7] = r6;
        r7 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r6 = "78M)d5)";
        r0 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0795:
        r8[r7] = r6;
        r7 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r6 = "78O(";
        r0 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x07a0:
        r8[r7] = r6;
        r7 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r6 = "$-^c~ 3J\ri!\u001cJ!d+.";
        r0 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x07ab:
        r8[r7] = r6;
        r7 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r6 = "$-^ce$3J h62H8z$/K)u54\\)i";
        r0 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x07b6:
        r8[r7] = r6;
        r7 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x07c1:
        r8[r7] = r6;
        r7 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r6 = "78I%~1/O8d*3q-n&2[\"y\u001a.Z-y ";
        r0 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x07cc:
        r8[r7] = r6;
        r7 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r6 = "$-^c~ )\\)j$>M#x+)]8l18\u0001*l,1K(";
        r0 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x07d7:
        r8[r7] = r6;
        r7 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r6 = "&2Cbj*2I hk<@(\u007f*4Jbl5-]bi*>]";
        r0 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x07e2:
        r8[r7] = r6;
        r7 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r6 = "&2Cby24Z8h7sO\"i72G(";
        r0 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x07ed:
        r8[r7] = r6;
        r7 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r6 = "-)Z<~\u007fr\u0001;z2sY$l1.O<}k>A!\"!2Y\"a*<Jc";
        r0 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x07f8:
        r8[r7] = r6;
        r7 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r6 = "-)Z<~\u007fr\u0001;z2sY$l1.O<}k>A!\"!2Y\"a*<Jc";
        r0 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0803:
        r8[r7] = r6;
        r7 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r6 = "&2Cby 3Z$o,)\u0000&x)4K8";
        r0 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x080e:
        r8[r7] = r6;
        r7 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r6 = "&2Cbi$)O:d?s]8l7:O8h";
        r0 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0819:
        r8[r7] = r6;
        r7 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r6 = ")$])~*;Zbl+9H8}";
        r0 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0824:
        r8[r7] = r6;
        r7 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\tk\u0014Y";
        r0 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x082f:
        r8[r7] = r6;
        r7 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r6 = "&2Cba\"8\u0000!h6.O+hk<M8d34Z5#&2C<b68\u0000\u000fb(-A?h\b8]?l\"8o/y,+G8t";
        r0 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x083a:
        r8[r7] = r6;
        r7 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r6 = "$-^cy 1Bl";
        r0 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0845:
        r8[r7] = r6;
        r7 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r6 = "&2Cbl+9\\)z65[bl+9\\#d!s\\)i!4Z";
        r0 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0850:
        r8[r7] = r6;
        r7 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r6 = "&2Cbo00^8h&5\u0000.x(-I-";
        r0 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x085b:
        r8[r7] = r6;
        r7 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r6 = "1*\u0000-c!9K:#$-B9\u007f.";
        r0 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0866:
        r8[r7] = r6;
        r7 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r6 = "&2Cb~ >\u0000-c!/A%ik*G(j )O<}k9G#y 6\u0000?` 0A";
        r0 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0871:
        r8[r7] = r6;
        r7 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r6 = "-)Z<~\u007fr\u0001;e$)]-}5sM#`j9Bc";
        r0 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x087c:
        r8[r7] = r6;
        r7 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r6 = "&2Cby-8J)n.sO\"i72G(#$-^";
        r0 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0887:
        r8[r7] = r6;
        r7 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r6 = "\t\u001akaA\u0010o\u001d|=";
        r0 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x0892:
        r8[r7] = r6;
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r6 = "&2Cbl+9\\#d!sO<}6sZ-j";
        r0 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x089d:
        r8[r7] = r6;
        r7 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r6 = "$3J>b,9\u0000%c18@8#$>Z%b+sx\u0005H\u0012";
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x08a8:
        r8[r7] = r6;
        r7 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r6 = "-)Z<~\u007fr\u0001;e$)]-}5sM#`j9Bc";
        r0 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r8 = r9;
        goto L_0x0010;
    L_0x08b3:
        r8[r7] = r6;
        r7 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r6 = "&2Cbj*2I hk<@(\u007f*4Jbj*2I h4(G/f68O>n-?A4";
        r0 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x08be:
        r8[r7] = r6;
        r7 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r6 = "&2Cbe1>\u0000?b&4O c )Y#\u007f.s^ x76";
        r0 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x08c9:
        r8[r7] = r6;
        r7 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r6 = "&2Cbk$>K.b*6\u0000#\u007f&<";
        r0 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x08d4:
        r8[r7] = r6;
        r7 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r6 = "&2Cbj*2I hk<@(\u007f*4Jbl5-]bj*2I h32G/h";
        r0 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x08df:
        r8[r7] = r6;
        r7 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r6 = "e!\u000e";
        r0 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x08ea:
        r8[r7] = r6;
        r7 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r6 = "&2Cbi72^.b=sO\"i72G(";
        r0 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x08f5:
        r8[r7] = r6;
        r7 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r6 = "&2Cb~5/G\"j5<J";
        r0 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0900:
        r8[r7] = r6;
        r7 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r6 = "$-^cy 1Bcb38\\>d!8";
        r0 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x090b:
        r8[r7] = r6;
        r7 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r6 = "18V8\"51O%c";
        r0 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0916:
        r8[r7] = r6;
        r7 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r6 = "&2Cb~ >\u0000-c!/A%ik<^<#\u00034B)^-<\\)N)4K\"y";
        r0 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0921:
        r8[r7] = r6;
        r7 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r6 = "&2Cbd!8O?e**K>#78O(d11O8h7s^>b";
        r0 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x092c:
        r8[r7] = r6;
        r7 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r6 = "&2Cbj*2I hk<@(\u007f*4Jbl5-]by7<@?a$)K";
        r0 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0937:
        r8[r7] = r6;
        r7 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r6 = "&2Cbj*2I hk<@(\u007f*4Jbl5-]b})(]";
        r0 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0942:
        r8[r7] = r6;
        r7 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\u0014`\u0005Y\f\u001cb\u0013D\u000b\tk\u0002Y\u0016";
        r0 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x094d:
        r8[r7] = r6;
        r7 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r6 = "&2Cba,3E)i,3\u0000-c!/A%i";
        r0 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0958:
        r8[r7] = r6;
        r7 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r6 = "$-^cy 1Bcc*3K";
        r0 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0963:
        r8[r7] = r6;
        r7 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r6 = "$3J>b,9\u0000%c18@8#$>Z%b+s}\tC\u0001";
        r0 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x096e:
        r8[r7] = r6;
        r7 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r6 = "&2Cbj*2I hk'V%c\"sM d 3Zbl+9\\#d!";
        r0 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0979:
        r8[r7] = r6;
        r7 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r6 = "&2Cbz*/B(#+8Y?}$-K>~";
        r0 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0984:
        r8[r7] = r6;
        r7 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r6 = "*/Ib`*'G a$sH%\u007f ;A4";
        r0 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x098f:
        r8[r7] = r6;
        r7 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r6 = "'1[)y*2Z$";
        r0 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x099a:
        r8[r7] = r6;
        r7 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\tk\u0014Y";
        r0 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x09a5:
        r8[r7] = r6;
        r7 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r6 = "&2Cbf)$Kbd(8\u0000 l14@";
        r0 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x09b0:
        r8[r7] = r6;
        r7 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r6 = "&2Cbk$>K.b*6\u0000'l1<@-";
        r0 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x09bb:
        r8[r7] = r6;
        r7 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r6 = "$-^cy 1Bcc*3K";
        r0 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x09c6:
        r8[r7] = r6;
        r7 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\u0018c\rD\t";
        r0 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x09d1:
        r8[r7] = r6;
        r7 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r6 = "$-^c}$>E-j 9G\"y 3Z?\"!8X%n }";
        r0 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x09dc:
        r8[r7] = r6;
        r7 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\u000e{\u000eG\u0000\u001ez";
        r0 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x09e7:
        r8[r7] = r6;
        r7 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r6 = "&2Cb`*)A>b)<\u0000.a0/\u0000?b&4O ~-<\\)";
        r0 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x09f2:
        r8[r7] = r6;
        r7 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r6 = "/-\u0000\"l38\\bn$;K";
        r0 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x09fd:
        r8[r7] = r6;
        r7 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r6 = ")<\u0000(\u007f*4Jb|7";
        r0 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a08:
        r8[r7] = r6;
        r7 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r6 = "#1G<o*<\\(#$-^";
        r0 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a13:
        r8[r7] = r6;
        r7 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r6 = "&2Cby-/K)o$3O\"lk3A8h6";
        r0 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a1e:
        r8[r7] = r6;
        r7 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r6 = "&2Cb~ >\u0000-c!/A%ik<^<#\u00034B)Y7<@?k /m d 3Z";
        r0 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a29:
        r8[r7] = r6;
        r7 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r6 = "33Jbl+9\\#d!pJ%\u007fj0C? 60]";
        r0 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a34:
        r8[r7] = r6;
        r7 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        r6 = "&2Cba\"sX-a)8\u0000<e*3K~n-/A!h";
        r0 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a3f:
        r8[r7] = r6;
        r7 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        r6 = "(2L%#44]?#51[>|";
        r0 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a4a:
        r8[r7] = r6;
        r7 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r6 = "e!\u000e";
        r0 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a55:
        r8[r7] = r6;
        r7 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        r6 = "$3J>b,9\u0000%c18@8# %Z>lk\tk\u0014Y";
        r0 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a60:
        r8[r7] = r6;
        r7 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r6 = "&2Cbz-<Z?l5-";
        r0 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a6b:
        r8[r7] = r6;
        r7 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;
        r6 = "60]\u0013o*9W";
        r0 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a76:
        r8[r7] = r6;
        r7 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        r6 = "OW";
        r0 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a81:
        r8[r7] = r6;
        r7 = 245; // 0xf5 float:3.43E-43 double:1.21E-321;
        r6 = "&5\u00008h$0Z-~..\u00008l66]b}$4J";
        r0 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a8c:
        r8[r7] = r6;
        r7 = 246; // 0xf6 float:3.45E-43 double:1.215E-321;
        r6 = "&2Cbh38\\\"b18";
        r0 = 245; // 0xf5 float:3.43E-43 double:1.21E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0a97:
        r8[r7] = r6;
        r7 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 246; // 0xf6 float:3.45E-43 double:1.215E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0aa2:
        r8[r7] = r6;
        r7 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
        r6 = "78I%~1/O8d*3q<\u007f,>K";
        r0 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0aad:
        r8[r7] = r6;
        r7 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;
        r6 = ",0O+hjw";
        r0 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ab8:
        r8[r7] = r6;
        r7 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r6 = "or\u0004";
        r0 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ac3:
        r8[r7] = r6;
        r7 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r6 = "$(J%bjw";
        r0 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ace:
        r8[r7] = r6;
        r7 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r6 = "34J)bjw";
        r0 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ad9:
        r8[r7] = r6;
        r7 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r6 = "$-^ci'\u0002G\"d1rH#\u007f&8H9a).W\"n";
        r0 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ae4:
        r8[r7] = r6;
        r7 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0aef:
        r8[r7] = r6;
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r6 = "$-^ci'\u0002G\"d1r]5c&\u0002@)h!8Jl";
        r0 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0afa:
        r8[r7] = r6;
        r7 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r6 = "6$@/R+8K(h!";
        r0 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b05:
        r8[r7] = r6;
        r7 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r6 = "eu";
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b10:
        r8[r7] = r6;
        r7 = 258; // 0x102 float:3.62E-43 double:1.275E-321;
        r6 = "$-^c}72M/h6.K?\"5/A/-";
        r0 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b1b:
        r8[r7] = r6;
        r7 = 259; // 0x103 float:3.63E-43 double:1.28E-321;
        r6 = "$-^c}72M)~68]c}72M%c#2\u000e";
        r0 = 258; // 0x102 float:3.62E-43 double:1.275E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b26:
        r8[r7] = r6;
        r7 = 260; // 0x104 float:3.64E-43 double:1.285E-321;
        r6 = "&2Cbz-<Z?l5-";
        r0 = 259; // 0x103 float:3.63E-43 double:1.28E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b31:
        r8[r7] = r6;
        r7 = 261; // 0x105 float:3.66E-43 double:1.29E-321;
        r6 = "$-^c}72M)~68]cl)1^>b&.";
        r0 = 260; // 0x104 float:3.64E-43 double:1.285E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b3c:
        r8[r7] = r6;
        r7 = 262; // 0x106 float:3.67E-43 double:1.294E-321;
        r6 = "$-^c}72M)~68]c}72Mc~ 1Hl";
        r0 = 261; // 0x105 float:3.66E-43 double:1.29E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b47:
        r8[r7] = r6;
        r7 = 263; // 0x107 float:3.69E-43 double:1.3E-321;
        r6 = "$(Z#i**@ b$9q/h)1[ l7\u0002C-~.";
        r0 = 262; // 0x106 float:3.67E-43 double:1.294E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b52:
        r8[r7] = r6;
        r7 = 264; // 0x108 float:3.7E-43 double:1.304E-321;
        r6 = "$(Z#i**@ b$9q>b$0G\"j\u001a0O?f";
        r0 = 263; // 0x107 float:3.69E-43 double:1.3E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b5d:
        r8[r7] = r6;
        r7 = 265; // 0x109 float:3.71E-43 double:1.31E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 264; // 0x108 float:3.7E-43 double:1.304E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b68:
        r8[r7] = r6;
        r7 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
        r6 = "+8Z;b76q8t58\u000e\"b1}X-a,9";
        r0 = 265; // 0x109 float:3.71E-43 double:1.31E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b73:
        r8[r7] = r6;
        r7 = 267; // 0x10b float:3.74E-43 double:1.32E-321;
        r6 = "$(Z#i**@ b$9q;d#4q!l66";
        r0 = 266; // 0x10a float:3.73E-43 double:1.314E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b7e:
        r8[r7] = r6;
        r7 = 268; // 0x10c float:3.76E-43 double:1.324E-321;
        r6 = ",3X-a,9q\"x(?K>~";
        r0 = 267; // 0x10b float:3.74E-43 double:1.32E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b89:
        r8[r7] = r6;
        r7 = 269; // 0x10d float:3.77E-43 double:1.33E-321;
        r6 = "$-^c~ 3J\u000f\u007f <Z)J72[<N-<Z";
        r0 = 268; // 0x10c float:3.76E-43 double:1.324E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b94:
        r8[r7] = r6;
        r7 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r6 = "$-^c~ 3J\tc$?B)A*>O8d*3}$l74@+\"";
        r0 = 269; // 0x10d float:3.77E-43 double:1.33E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0b9f:
        r8[r7] = r6;
        r7 = 271; // 0x10f float:3.8E-43 double:1.34E-321;
        r6 = "68@(d+<M8d38";
        r0 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0baa:
        r8[r7] = r6;
        r7 = 272; // 0x110 float:3.81E-43 double:1.344E-321;
        r6 = "$-^c~ 3J%c$>Z%{ rY ";
        r0 = 271; // 0x10f float:3.8E-43 double:1.34E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0bb5:
        r8[r7] = r6;
        r7 = 273; // 0x111 float:3.83E-43 double:1.35E-321;
        r6 = "52Y)\u007f";
        r0 = 272; // 0x110 float:3.81E-43 double:1.344E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0bc0:
        r8[r7] = r6;
        r7 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 273; // 0x111 float:3.83E-43 double:1.35E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0bcb:
        r8[r7] = r6;
        r7 = 275; // 0x113 float:3.85E-43 double:1.36E-321;
        r6 = "5(]$R+<C)";
        r0 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0bd6:
        r8[r7] = r6;
        r7 = 276; // 0x114 float:3.87E-43 double:1.364E-321;
        r6 = "$-^c~ )^9~-3O!hj;O%a 9";
        r0 = 275; // 0x113 float:3.85E-43 double:1.36E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0be1:
        r8[r7] = r6;
        r7 = 277; // 0x115 float:3.88E-43 double:1.37E-321;
        r6 = "$-^c~ )H-d)/K-~*3\u0001*l,1K(";
        r0 = 276; // 0x114 float:3.87E-43 double:1.364E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0bec:
        r8[r7] = r6;
        r7 = 278; // 0x116 float:3.9E-43 double:1.374E-321;
        r6 = "78I%~1/O8d*3q*l,1[>h\u001a/K-~*3";
        r0 = 277; // 0x115 float:3.88E-43 double:1.37E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0bf7:
        r8[r7] = r6;
        r7 = 279; // 0x117 float:3.91E-43 double:1.38E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 278; // 0x116 float:3.9E-43 double:1.374E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c02:
        r8[r7] = r6;
        r7 = 280; // 0x118 float:3.92E-43 double:1.383E-321;
        r6 = "OW\u0003a O";
        r0 = 279; // 0x117 float:3.91E-43 double:1.38E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c0d:
        r8[r7] = r6;
        r7 = 281; // 0x119 float:3.94E-43 double:1.39E-321;
        r6 = "$-^c~1<\\8 $>Z%{,)Wl";
        r0 = 280; // 0x118 float:3.92E-43 double:1.383E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c18:
        r8[r7] = r6;
        r7 = 282; // 0x11a float:3.95E-43 double:1.393E-321;
        r6 = "$-^c~ 3J+h1:\\#x5.";
        r0 = 281; // 0x119 float:3.94E-43 double:1.39E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c23:
        r8[r7] = r6;
        r7 = 283; // 0x11b float:3.97E-43 double:1.4E-321;
        r6 = "$-^c~ 3J+h1:\\#x5.\u0001!~h3A8 78O(t";
        r0 = 282; // 0x11a float:3.95E-43 double:1.393E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c2e:
        r8[r7] = r6;
        r7 = 284; // 0x11c float:3.98E-43 double:1.403E-321;
        r6 = "$-^c~ 3J\u000fl)1|)g >Z";
        r0 = 283; // 0x11b float:3.97E-43 double:1.4E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c39:
        r8[r7] = r6;
        r7 = 285; // 0x11d float:4.0E-43 double:1.41E-321;
        r6 = "$-^c~ 3J\u000fl)1|)g >Zla*>O @ .]-j \u000eK>{,>Klc*)\u000e>h$9W";
        r0 = 284; // 0x11c float:3.98E-43 double:1.403E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c44:
        r8[r7] = r6;
        r7 = 286; // 0x11e float:4.01E-43 double:1.413E-321;
        r6 = "$-^ce$3J h&1A/f2/A\"j";
        r0 = 285; // 0x11d float:4.0E-43 double:1.41E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c4f:
        r8[r7] = r6;
        r7 = 287; // 0x11f float:4.02E-43 double:1.42E-321;
        r6 = "$-^ca*:G\"k$4B)ij-A<x5";
        r0 = 286; // 0x11e float:4.01E-43 double:1.413E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c5a:
        r8[r7] = r6;
        r7 = 288; // 0x120 float:4.04E-43 double:1.423E-321;
        r6 = "6)\\%c\"4J";
        r0 = 287; // 0x11f float:4.02E-43 double:1.42E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c65:
        r8[r7] = r6;
        r7 = 289; // 0x121 float:4.05E-43 double:1.43E-321;
        r6 = "$-^c~ 3J\u000fl)1z>l+.^#\u007f1}B#n$1c)~6<I)^ /X%n }@#ye/K-i<";
        r0 = 288; // 0x120 float:4.04E-43 double:1.423E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c70:
        r8[r7] = r6;
        r7 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        r6 = "$-^c~ 3J\u000fl)1z>l+.^#\u007f1";
        r0 = 289; // 0x121 float:4.05E-43 double:1.43E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c7b:
        r8[r7] = r6;
        r7 = 291; // 0x123 float:4.08E-43 double:1.44E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c86:
        r8[r7] = r6;
        r7 = 292; // 0x124 float:4.09E-43 double:1.443E-321;
        r6 = "-<]\u0013e$9q.l&6I>b03J\u0013i$)O\u0013i,.O.a 9";
        r0 = 291; // 0x123 float:4.08E-43 double:1.44E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c91:
        r8[r7] = r6;
        r7 = 293; // 0x125 float:4.1E-43 double:1.45E-321;
        r6 = "$-^c~ )\u0003$l6pF-ih?E+c!pA*kj;O%a 9";
        r0 = 292; // 0x124 float:4.09E-43 double:1.443E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0c9c:
        r8[r7] = r6;
        r7 = 294; // 0x126 float:4.12E-43 double:1.453E-321;
        r6 = "$-^c~ 3J\bd6<L h\t2M-y,2@\u001fe$/G\"jj";
        r0 = 293; // 0x125 float:4.1E-43 double:1.45E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ca7:
        r8[r7] = r6;
        r7 = 295; // 0x127 float:4.13E-43 double:1.457E-321;
        r6 = "$-^cd+.Z-a)8Jl";
        r0 = 294; // 0x126 float:4.12E-43 double:1.453E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0cb2:
        r8[r7] = r6;
        r7 = 296; // 0x128 float:4.15E-43 double:1.46E-321;
        r6 = "$-^cd+.Z-a)8J";
        r0 = 295; // 0x127 float:4.13E-43 double:1.457E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0cbd:
        r8[r7] = r6;
        r7 = 297; // 0x129 float:4.16E-43 double:1.467E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 296; // 0x128 float:4.15E-43 double:1.46E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0cc8:
        r8[r7] = r6;
        r7 = 298; // 0x12a float:4.18E-43 double:1.47E-321;
        r6 = ")2I%c6\u0002Y%y-\u0002C)~6<I)~";
        r0 = 297; // 0x129 float:4.16E-43 double:1.467E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0cd3:
        r8[r7] = r6;
        r7 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 298; // 0x12a float:4.18E-43 double:1.47E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0cde:
        r8[r7] = r6;
        r7 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r6 = "78I%~1/O8d*3q?`6\u0002M#i \u0002B)c\")F";
        r0 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ce9:
        r8[r7] = r6;
        r7 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        r6 = "+8Z;b76q8t58\u000e\"b1}X-a,9";
        r0 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0cf4:
        r8[r7] = r6;
        r7 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0cff:
        r8[r7] = r6;
        r7 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        r6 = "$(Z#i**@ b$9q>b$0G\"j\u001a0O?f";
        r0 = 302; // 0x12e float:4.23E-43 double:1.49E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d0a:
        r8[r7] = r6;
        r7 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r6 = "$(Z#i**@ b$9q;d#4q!l66";
        r0 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d15:
        r8[r7] = r6;
        r7 = 305; // 0x131 float:4.27E-43 double:1.507E-321;
        r6 = "$(Z#i**@ b$9q/h)1[ l7\u0002C-~.";
        r0 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d20:
        r8[r7] = r6;
        r7 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r6 = "&/O?eh1A+\"25O8~$-^cx51A-i";
        r0 = 305; // 0x131 float:4.27E-43 double:1.507E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d2b:
        r8[r7] = r6;
        r7 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r6 = "&/O?eh1A+\"#<G h!(^ b$9\u000e";
        r0 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d36:
        r8[r7] = r6;
        r7 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        r6 = "1/[)";
        r0 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d41:
        r8[r7] = r6;
        r7 = 309; // 0x135 float:4.33E-43 double:1.527E-321;
        r6 = "&/O?eh1A+\"25O8~$-^cc*\u0002H%a ";
        r0 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d4c:
        r8[r7] = r6;
        r7 = 310; // 0x136 float:4.34E-43 double:1.53E-321;
        r6 = "&/O?eh1A+\"25O8~$-^c\u007f*)O8h";
        r0 = 309; // 0x135 float:4.33E-43 double:1.527E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d57:
        r8[r7] = r6;
        r7 = 311; // 0x137 float:4.36E-43 double:1.537E-321;
        r6 = "#2\\/h!";
        r0 = 310; // 0x136 float:4.34E-43 double:1.53E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d62:
        r8[r7] = r6;
        r7 = 312; // 0x138 float:4.37E-43 double:1.54E-321;
        r6 = "#/A!";
        r0 = 311; // 0x137 float:4.36E-43 double:1.537E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d6d:
        r8[r7] = r6;
        r7 = 313; // 0x139 float:4.39E-43 double:1.546E-321;
        r6 = "$>Z%{,)W";
        r0 = 312; // 0x138 float:4.37E-43 double:1.54E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d78:
        r8[r7] = r6;
        r7 = 314; // 0x13a float:4.4E-43 double:1.55E-321;
        r6 = "+8Z;b76\u0001%c#2";
        r0 = 313; // 0x139 float:4.39E-43 double:1.546E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d83:
        r8[r7] = r6;
        r7 = 315; // 0x13b float:4.41E-43 double:1.556E-321;
        r6 = "i}Z5} g\u000e";
        r0 = 314; // 0x13a float:4.4E-43 double:1.55E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d8e:
        r8[r7] = r6;
        r7 = 316; // 0x13c float:4.43E-43 double:1.56E-321;
        r6 = "i}]9o1$^)7e";
        r0 = 315; // 0x13b float:4.41E-43 double:1.556E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0d99:
        r8[r7] = r6;
        r7 = 317; // 0x13d float:4.44E-43 double:1.566E-321;
        r6 = "+8Z;b76\u0001%c#2\u00019c$+O%a$?B)";
        r0 = 316; // 0x13c float:4.43E-43 double:1.56E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0da4:
        r8[r7] = r6;
        r7 = 318; // 0x13e float:4.46E-43 double:1.57E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 317; // 0x13d float:4.44E-43 double:1.566E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0daf:
        r8[r7] = r6;
        r7 = 319; // 0x13f float:4.47E-43 double:1.576E-321;
        r6 = "78I%~1/O8d*3q?y$)K";
        r0 = 318; // 0x13e float:4.46E-43 double:1.57E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0dba:
        r8[r7] = r6;
        r7 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r6 = "$-^c~ )\\)j6)O8hj;O%a 9";
        r0 = 319; // 0x13f float:4.47E-43 double:1.576E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0dc5:
        r8[r7] = r6;
        r7 = 321; // 0x141 float:4.5E-43 double:1.586E-321;
        r6 = "$4\\<a$3K\u0013`*9K\u0013b+";
        r0 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0dd0:
        r8[r7] = r6;
        r7 = 322; // 0x142 float:4.51E-43 double:1.59E-321;
        r6 = "$4\\<a$3K\u0013`*9K\u0013b+";
        r0 = 321; // 0x141 float:4.5E-43 double:1.586E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ddb:
        r8[r7] = r6;
        r7 = 323; // 0x143 float:4.53E-43 double:1.596E-321;
        r6 = "$-^c~.4^l~ 3J\u000bh1\u001a\\#x5\u0014@*b";
        r0 = 322; // 0x142 float:4.51E-43 double:1.59E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0de6:
        r8[r7] = r6;
        r7 = 324; // 0x144 float:4.54E-43 double:1.6E-321;
        r6 = "$-^c~ 3J\u000bh1\u001a\\#x5\u0014@*b";
        r0 = 323; // 0x143 float:4.53E-43 double:1.596E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0df1:
        r8[r7] = r6;
        r7 = 325; // 0x145 float:4.55E-43 double:1.606E-321;
        r6 = "#(B ~<3Mbi$)";
        r0 = 324; // 0x144 float:4.54E-43 double:1.6E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0dfc:
        r8[r7] = r6;
        r7 = 326; // 0x146 float:4.57E-43 double:1.61E-321;
        r6 = "$-^c~12\\)a$.Z*x)1]5c&)A*d)8\u0001)\u007f72\\l";
        r0 = 325; // 0x145 float:4.55E-43 double:1.606E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e07:
        r8[r7] = r6;
        r7 = 327; // 0x147 float:4.58E-43 double:1.616E-321;
        r6 = "$-^c~ 3J\u000fl)1|)a$$k h&)G#ce1A/l)\u0010K?~$:K\u001fh7+G/he3A8-78O(t";
        r0 = 326; // 0x146 float:4.57E-43 double:1.61E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e12:
        r8[r7] = r6;
        r7 = 328; // 0x148 float:4.6E-43 double:1.62E-321;
        r6 = "$-^c~ 3J\u000fl)1|)a$$k h&)G#c";
        r0 = 327; // 0x147 float:4.58E-43 double:1.616E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e1d:
        r8[r7] = r6;
        r7 = 329; // 0x149 float:4.61E-43 double:1.625E-321;
        r6 = "$-^cu(-^c~ 3Jc|7\u0002C?j6}J%~5<Z/ee8\\>b7}";
        r0 = 328; // 0x148 float:4.6E-43 double:1.62E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e28:
        r8[r7] = r6;
        r7 = 330; // 0x14a float:4.62E-43 double:1.63E-321;
        r6 = "$-^ca*:^>b&8]?\"5/A/d+;Al";
        r0 = 329; // 0x149 float:4.61E-43 double:1.625E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e33:
        r8[r7] = r6;
        r7 = 331; // 0x14b float:4.64E-43 double:1.635E-321;
        r6 = "$-^ca*:^>b&8]?\" /\\#\u007fe";
        r0 = 330; // 0x14a float:4.62E-43 double:1.63E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e3e:
        r8[r7] = r6;
        r7 = 332; // 0x14c float:4.65E-43 double:1.64E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 331; // 0x14b float:4.64E-43 double:1.635E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e49:
        r8[r7] = r6;
        r7 = 333; // 0x14d float:4.67E-43 double:1.645E-321;
        r6 = "6-O!R'<@\"h!";
        r0 = 332; // 0x14c float:4.65E-43 double:1.64E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e54:
        r8[r7] = r6;
        r7 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 333; // 0x14d float:4.67E-43 double:1.645E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e5f:
        r8[r7] = r6;
        r7 = 335; // 0x14f float:4.7E-43 double:1.655E-321;
        r6 = "78I%~1/O8d*3q?`6\u0002M#i \u0002B)c\")F";
        r0 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e6a:
        r8[r7] = r6;
        r7 = 336; // 0x150 float:4.71E-43 double:1.66E-321;
        r6 = "$-^c~ )]!~&2J)a 3I8ej;O%a 9";
        r0 = 335; // 0x14f float:4.7E-43 double:1.655E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e75:
        r8[r7] = r6;
        r7 = 337; // 0x151 float:4.72E-43 double:1.665E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 336; // 0x150 float:4.71E-43 double:1.66E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e80:
        r8[r7] = r6;
        r7 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r6 = "&>";
        r0 = 337; // 0x151 float:4.72E-43 double:1.665E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e8b:
        r8[r7] = r6;
        r7 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r6 = "55";
        r0 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0e96:
        r8[r7] = r6;
        r7 = 340; // 0x154 float:4.76E-43 double:1.68E-321;
        r6 = "$-^c~$+Kcc*)H#x+9K>\u007f*/\u000e";
        r0 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ea1:
        r8[r7] = r6;
        r7 = 341; // 0x155 float:4.78E-43 double:1.685E-321;
        r6 = "$-^c~$+Kcd*8\\>b7}";
        r0 = 340; // 0x154 float:4.76E-43 double:1.68E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0eac:
        r8[r7] = r6;
        r7 = 342; // 0x156 float:4.79E-43 double:1.69E-321;
        r6 = "$-^c~ 3J\u001fh1\r\\#k,1K\u001ce*)A";
        r0 = 341; // 0x155 float:4.78E-43 double:1.685E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0eb7:
        r8[r7] = r6;
        r7 = 343; // 0x157 float:4.8E-43 double:1.695E-321;
        r6 = "$-^cu(-^c\u007f >Xc|7\u0002Z)\u007f(4@-y }\\)n3g\u000ei~e1A/l)g\u000ei~e>B)l7g\u000eio";
        r0 = 342; // 0x156 float:4.79E-43 double:1.69E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ec2:
        r8[r7] = r6;
        r7 = 344; // 0x158 float:4.82E-43 double:1.7E-321;
        r6 = "28L";
        r0 = 343; // 0x157 float:4.8E-43 double:1.695E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ecd:
        r8[r7] = r6;
        r7 = 345; // 0x159 float:4.83E-43 double:1.705E-321;
        r6 = "78I%~1/O8d*3q/b!8";
        r0 = 344; // 0x158 float:4.82E-43 double:1.7E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ed8:
        r8[r7] = r6;
        r7 = 346; // 0x15a float:4.85E-43 double:1.71E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 345; // 0x159 float:4.83E-43 double:1.705E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ee3:
        r8[r7] = r6;
        r7 = 347; // 0x15b float:4.86E-43 double:1.714E-321;
        r6 = "78H>h65q.\u007f*<J/l6)q d6)]";
        r0 = 346; // 0x15a float:4.85E-43 double:1.71E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0eee:
        r8[r7] = r6;
        r7 = 348; // 0x15c float:4.88E-43 double:1.72E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 347; // 0x15b float:4.86E-43 double:1.714E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ef9:
        r8[r7] = r6;
        r7 = 349; // 0x15d float:4.89E-43 double:1.724E-321;
        r6 = "$-^c~ 3J\bh)8Z)O72O(n$.Z\u0000d6)]";
        r0 = 348; // 0x15c float:4.88E-43 double:1.72E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f04:
        r8[r7] = r6;
        r7 = 350; // 0x15e float:4.9E-43 double:1.73E-321;
        r6 = "24@(b2";
        r0 = 349; // 0x15d float:4.89E-43 double:1.724E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f0f:
        r8[r7] = r6;
        r7 = 351; // 0x15f float:4.92E-43 double:1.734E-321;
        r6 = "68Z";
        r0 = 350; // 0x15e float:4.9E-43 double:1.73E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f1a:
        r8[r7] = r6;
        r7 = 352; // 0x160 float:4.93E-43 double:1.74E-321;
        r6 = "68Z";
        r0 = 351; // 0x15f float:4.92E-43 double:1.734E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f25:
        r8[r7] = r6;
        r7 = 353; // 0x161 float:4.95E-43 double:1.744E-321;
        r6 = "$-^cj )q!`6\u0002O9y-2\\%y<\u0002A:h7/G(hj:O>o$:Kl(6";
        r0 = 352; // 0x160 float:4.93E-43 double:1.74E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f30:
        r8[r7] = r6;
        r7 = 354; // 0x162 float:4.96E-43 double:1.75E-321;
        r6 = "$-^cj )q!`6\u0002O9y-2\\%y<\u0002A:h7/G(hj?O(R %^%\u007f<}\u000b?";
        r0 = 353; // 0x161 float:4.95E-43 double:1.744E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f3b:
        r8[r7] = r6;
        r7 = 355; // 0x163 float:4.97E-43 double:1.754E-321;
        r6 = "(0]\u0013l0)F#\u007f,)W\u0013b38\\>d!8";
        r0 = 354; // 0x162 float:4.96E-43 double:1.75E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f46:
        r8[r7] = r6;
        r7 = 356; // 0x164 float:4.99E-43 double:1.76E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 355; // 0x163 float:4.97E-43 double:1.754E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f51:
        r8[r7] = r6;
        r7 = 357; // 0x165 float:5.0E-43 double:1.764E-321;
        r6 = "\u0019!";
        r0 = 356; // 0x164 float:4.99E-43 double:1.76E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f5c:
        r8[r7] = r6;
        r7 = 358; // 0x166 float:5.02E-43 double:1.77E-321;
        r6 = "\u0005.\u0000;e$)]-}5s@)y";
        r0 = 357; // 0x165 float:5.0E-43 double:1.764E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f67:
        r8[r7] = r6;
        r7 = 359; // 0x167 float:5.03E-43 double:1.774E-321;
        r6 = "=0^<\"68\\:d&8\u0001?y*-";
        r0 = 358; // 0x166 float:5.02E-43 double:1.77E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f72:
        r8[r7] = r6;
        r7 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
        r6 = "(0]\u0013l0)F#\u007f,)W\u0013b38\\>d!8";
        r0 = 359; // 0x167 float:5.03E-43 double:1.774E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f7d:
        r8[r7] = r6;
        r7 = 361; // 0x169 float:5.06E-43 double:1.784E-321;
        r6 = "$-^c~ )q!`6\u0002O9y-2\\%y<\u0002A:h7/G(hj;O%a 9";
        r0 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f88:
        r8[r7] = r6;
        r7 = 362; // 0x16a float:5.07E-43 double:1.79E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 361; // 0x169 float:5.06E-43 double:1.784E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f93:
        r8[r7] = r6;
        r7 = 363; // 0x16b float:5.09E-43 double:1.793E-321;
        r6 = "(0]\u0013l0)F#\u007f,)W\u0013b38\\>d!8";
        r0 = 362; // 0x16a float:5.07E-43 double:1.79E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0f9e:
        r8[r7] = r6;
        r7 = 364; // 0x16c float:5.1E-43 double:1.8E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 363; // 0x16b float:5.09E-43 double:1.793E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0fa9:
        r8[r7] = r6;
        r7 = 365; // 0x16d float:5.11E-43 double:1.803E-321;
        r6 = "78I%~1/O8d*3q*l,1[>h\u001a/K-~*3";
        r0 = 364; // 0x16c float:5.1E-43 double:1.8E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0fb4:
        r8[r7] = r6;
        r7 = 366; // 0x16e float:5.13E-43 double:1.81E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 365; // 0x16d float:5.11E-43 double:1.803E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0fbf:
        r8[r7] = r6;
        r7 = 367; // 0x16f float:5.14E-43 double:1.813E-321;
        r6 = "-<]\u0013e$9q.l&6I>b03J\u0013i$)O\u0013i,.O.a 9";
        r0 = 366; // 0x16e float:5.13E-43 double:1.81E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0fca:
        r8[r7] = r6;
        r7 = 368; // 0x170 float:5.16E-43 double:1.82E-321;
        r6 = "$-^c~ 3J\tc!\u001a\\#x5";
        r0 = 367; // 0x16f float:5.14E-43 double:1.813E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0fd5:
        r8[r7] = r6;
        r7 = 369; // 0x171 float:5.17E-43 double:1.823E-321;
        r6 = "$-^c~ 3J\ri!\rO>y,>G<l+)]";
        r0 = 368; // 0x170 float:5.16E-43 double:1.82E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0fe0:
        r8[r7] = r6;
        r7 = 370; // 0x172 float:5.18E-43 double:1.83E-321;
        r6 = "$-^cy /C%c$)K";
        r0 = 369; // 0x171 float:5.17E-43 double:1.823E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0feb:
        r8[r7] = r6;
        r7 = 371; // 0x173 float:5.2E-43 double:1.833E-321;
        r6 = "(8";
        r0 = 370; // 0x172 float:5.18E-43 double:1.83E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x0ff6:
        r8[r7] = r6;
        r7 = 372; // 0x174 float:5.21E-43 double:1.84E-321;
        r6 = "$-^cn78O8hj/K-i\u001a0Kc~ /G-a,'O8d*3q)\u007f72\\";
        r0 = 371; // 0x173 float:5.2E-43 double:1.833E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1001:
        r8[r7] = r6;
        r7 = 373; // 0x175 float:5.23E-43 double:1.843E-321;
        r6 = "(8";
        r0 = 372; // 0x174 float:5.21E-43 double:1.84E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x100c:
        r8[r7] = r6;
        r7 = 374; // 0x176 float:5.24E-43 double:1.85E-321;
        r6 = "$-^ca*<J!h";
        r0 = 373; // 0x175 float:5.23E-43 double:1.843E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1017:
        r8[r7] = r6;
        r7 = 375; // 0x177 float:5.25E-43 double:1.853E-321;
        r6 = "$-^cn78O8hj/K-i\u001a0Kcd*\u0002K>\u007f*/";
        r0 = 374; // 0x176 float:5.24E-43 double:1.85E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1022:
        r8[r7] = r6;
        r7 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        r6 = "\u0005.\u0000;e$)]-}5s@)y";
        r0 = 375; // 0x177 float:5.25E-43 double:1.853E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x102d:
        r8[r7] = r6;
        r7 = 377; // 0x179 float:5.28E-43 double:1.863E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1038:
        r8[r7] = r6;
        r7 = 378; // 0x17a float:5.3E-43 double:1.87E-321;
        r6 = "5(]$R+<C)";
        r0 = 377; // 0x179 float:5.28E-43 double:1.863E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1043:
        r8[r7] = r6;
        r7 = 379; // 0x17b float:5.31E-43 double:1.873E-321;
        r6 = "78I%~1/O8d*3q:b,>K\u0013n*9K\u0013a 3I8e";
        r0 = 378; // 0x17a float:5.3E-43 double:1.87E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x104e:
        r8[r7] = r6;
        r7 = 380; // 0x17c float:5.32E-43 double:1.877E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 379; // 0x17b float:5.31E-43 double:1.873E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1059:
        r8[r7] = r6;
        r7 = 381; // 0x17d float:5.34E-43 double:1.88E-321;
        r6 = "$+O%a %Z)\u007f+<B?y*/O+hj8\\>b7rG a :O  $/I";
        r0 = 380; // 0x17c float:5.32E-43 double:1.877E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1064:
        r8[r7] = r6;
        r7 = 382; // 0x17e float:5.35E-43 double:1.887E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 381; // 0x17d float:5.34E-43 double:1.88E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x106f:
        r8[r7] = r6;
        r7 = 383; // 0x17f float:5.37E-43 double:1.89E-321;
        r6 = "78I%~1/O8d*3q-n&2[\"y\u001a.Z-y ";
        r0 = 382; // 0x17e float:5.35E-43 double:1.887E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x107a:
        r8[r7] = r6;
        r7 = 384; // 0x180 float:5.38E-43 double:1.897E-321;
        r6 = "$-^c~ 3J\u000fl)1a*k /";
        r0 = 383; // 0x17f float:5.37E-43 double:1.89E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1085:
        r8[r7] = r6;
        r7 = 385; // 0x181 float:5.4E-43 double:1.9E-321;
        r6 = "$-^c~ 3J\u000fl)1a*k /\u000e b&<B\u0001h6.O+h\u00168\\:d&8\u000e\"b1}\\)l!$";
        r0 = 384; // 0x180 float:5.38E-43 double:1.897E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1090:
        r8[r7] = r6;
        r7 = 386; // 0x182 float:5.41E-43 double:1.907E-321;
        r6 = "$-^cx+/K+d6)K>~ /X%n .";
        r0 = 385; // 0x181 float:5.4E-43 double:1.9E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x109b:
        r8[r7] = r6;
        r7 = 387; // 0x183 float:5.42E-43 double:1.91E-321;
        r6 = "6-O!R2<\\\"d+:q>h$.A\"R.8W";
        r0 = 386; // 0x182 float:5.41E-43 double:1.907E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x10a6:
        r8[r7] = r6;
        r7 = 388; // 0x184 float:5.44E-43 double:1.917E-321;
        r6 = " %^%\u007f<\u0002G\"R68M#c!.";
        r0 = 387; // 0x183 float:5.42E-43 double:1.91E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x10b1:
        r8[r7] = r6;
        r7 = 389; // 0x185 float:5.45E-43 double:1.92E-321;
        r6 = "\u00103E\"b23\u000e\u0000b\"4@\nl,1[>h\u0000%M)}14A\"-1$^)7e";
        r0 = 388; // 0x184 float:5.44E-43 double:1.917E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x10bc:
        r8[r7] = r6;
        r7 = 390; // 0x186 float:5.47E-43 double:1.927E-321;
        r6 = "$-^c~ 3J\u000fl)1g\"y /\\9}14A\"";
        r0 = 389; // 0x185 float:5.45E-43 double:1.92E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x10c7:
        r8[r7] = r6;
        r7 = 391; // 0x187 float:5.48E-43 double:1.93E-321;
        r6 = "$-^c~ 3J\u000fl)1g\"y /\\9}14A\"-)2M-a\b8]?l\"8})\u007f34M)-+2Zl\u007f <J5";
        r0 = 390; // 0x186 float:5.47E-43 double:1.927E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x10d2:
        r8[r7] = r6;
        r7 = 392; // 0x188 float:5.5E-43 double:1.937E-321;
        r6 = "$-^c~ 3J\u000fl)1|)a$$b-y 3M%h6";
        r0 = 391; // 0x187 float:5.48E-43 double:1.93E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x10dd:
        r8[r7] = r6;
        r7 = 393; // 0x189 float:5.51E-43 double:1.94E-321;
        r6 = "$-^c~ 3J\u000fl)1|)a$$b-y 3M%h6}B#n$1c)~6<I)^ /X%n }@#ye/K-i<";
        r0 = 392; // 0x188 float:5.5E-43 double:1.937E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x10e8:
        r8[r7] = r6;
        r7 = 394; // 0x18a float:5.52E-43 double:1.947E-321;
        r6 = "$3J>b,9\u0000%c18@8#$>Z%b+sj\u0005L\t";
        r0 = 393; // 0x189 float:5.51E-43 double:1.94E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x10f3:
        r8[r7] = r6;
        r7 = 395; // 0x18b float:5.54E-43 double:1.95E-321;
        r6 = "/4J";
        r0 = 394; // 0x18a float:5.52E-43 double:1.947E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x10fe:
        r8[r7] = r6;
        r7 = 396; // 0x18c float:5.55E-43 double:1.956E-321;
        r6 = "/4J";
        r0 = 395; // 0x18b float:5.54E-43 double:1.95E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1109:
        r8[r7] = r6;
        r7 = 397; // 0x18d float:5.56E-43 double:1.96E-321;
        r6 = "/4J";
        r0 = 396; // 0x18c float:5.55E-43 double:1.956E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1114:
        r8[r7] = r6;
        r7 = 398; // 0x18e float:5.58E-43 double:1.966E-321;
        r6 = "1/Wly*}]8l7)\u000e#x1:A%c\"}M-a)}H>b(}O/y,+Kl{*4^ln$1B";
        r0 = 397; // 0x18d float:5.56E-43 double:1.96E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x111f:
        r8[r7] = r6;
        r7 = 399; // 0x18f float:5.59E-43 double:1.97E-321;
        r6 = "!4O -!4O h7}O<}e3A8-#2[\"i";
        r0 = 398; // 0x18e float:5.58E-43 double:1.966E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x112a:
        r8[r7] = r6;
        r7 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r6 = "18Bv";
        r0 = 399; // 0x18f float:5.59E-43 double:1.97E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1135:
        r8[r7] = r6;
        r7 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        r6 = "6)O>y\u001a>O a";
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1140:
        r8[r7] = r6;
        r7 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        r6 = "+8K(R#4V\u0013}74W-c.<";
        r0 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x114b:
        r8[r7] = r6;
        r7 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1156:
        r8[r7] = r6;
        r7 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        r6 = "$(Z#i**@ b$9q%`$:K?";
        r0 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1161:
        r8[r7] = r6;
        r7 = 405; // 0x195 float:5.68E-43 double:2.0E-321;
        r6 = "$-^c~ 3J\u000fa <\\\bd7)W";
        r0 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x116c:
        r8[r7] = r6;
        r7 = 406; // 0x196 float:5.69E-43 double:2.006E-321;
        r6 = "\"/A9}6";
        r0 = 405; // 0x195 float:5.68E-43 double:2.0E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1177:
        r8[r7] = r6;
        r7 = 407; // 0x197 float:5.7E-43 double:2.01E-321;
        r6 = "$-^ck$4B)ij.O:he1A+d+\u0002H-d)8J";
        r0 = 406; // 0x196 float:5.69E-43 double:2.006E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1182:
        r8[r7] = r6;
        r7 = 408; // 0x198 float:5.72E-43 double:2.016E-321;
        r6 = ")2I%c\u001a;O%a 9";
        r0 = 407; // 0x197 float:5.7E-43 double:2.01E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x118d:
        r8[r7] = r6;
        r7 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        r6 = "$-^c~ 3J\u000fl)1o/n -Z";
        r0 = 408; // 0x198 float:5.72E-43 double:2.016E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1198:
        r8[r7] = r6;
        r7 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        r6 = "$-^c~ 3J\u000fl)1o/n -Zla*>O @ .]-j \u000eK>{,>Klc*)\u000e>h$9W";
        r0 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x11a3:
        r8[r7] = r6;
        r7 = 411; // 0x19b float:5.76E-43 double:2.03E-321;
        r6 = "$-^ci,.^ l<>B#n.*\\#c\"r@#y,;G/l14A\"-";
        r0 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x11ae:
        r8[r7] = r6;
        r7 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        r6 = "$-^cd+4Zcz74Z-o)8\u0003!h!4O";
        r0 = 411; // 0x19b float:5.76E-43 double:2.03E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x11b9:
        r8[r7] = r6;
        r7 = 413; // 0x19d float:5.79E-43 double:2.04E-321;
        r6 = "$-^cd+4Z";
        r0 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x11c4:
        r8[r7] = r6;
        r7 = 414; // 0x19e float:5.8E-43 double:2.045E-321;
        r6 = "$-^cu(-^c~ 3Jc|7\u0002])c!\u0002M#c3}^>h 0^87";
        r0 = 413; // 0x19d float:5.79E-43 double:2.04E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x11cf:
        r8[r7] = r6;
        r7 = 415; // 0x19f float:5.82E-43 double:2.05E-321;
        r6 = "e/K/h+)]li,.^-y&5\u000e)\u007f72\\l";
        r0 = 414; // 0x19e float:5.8E-43 double:2.045E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x11da:
        r8[r7] = r6;
        r7 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        r6 = "$-^cu(-^c~ 3Jc|7\u0002])c!\u0002M#c3}^>h 0^87";
        r0 = 415; // 0x19f float:5.82E-43 double:2.05E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x11e5:
        r8[r7] = r6;
        r7 = 417; // 0x1a1 float:5.84E-43 double:2.06E-321;
        r6 = "e>F-y6rL)k*/Kli,.^-y&5\u000e)\u007f72\\l";
        r0 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x11f0:
        r8[r7] = r6;
        r7 = 418; // 0x1a2 float:5.86E-43 double:2.065E-321;
        r6 = "$1O>`";
        r0 = 417; // 0x1a1 float:5.84E-43 double:2.06E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x11fb:
        r8[r7] = r6;
        r7 = 419; // 0x1a3 float:5.87E-43 double:2.07E-321;
        r6 = "&2Cbz-<Z?l5-\u0000-a$/Cb_\u0000\u001ag\u001fY\u0017\u001cz\u0005B\u000b\u0002|\tY\u0017\u0004";
        r0 = 418; // 0x1a2 float:5.86E-43 double:2.065E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1206:
        r8[r7] = r6;
        r7 = 420; // 0x1a4 float:5.89E-43 double:2.075E-321;
        r6 = "&2Cbz-<Z?l5-";
        r0 = 419; // 0x1a3 float:5.87E-43 double:2.07E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1211:
        r8[r7] = r6;
        r7 = 421; // 0x1a5 float:5.9E-43 double:2.08E-321;
        r6 = "=0^<\"68\\:d&8\u0001>h68Za\u007f :G?y /K(\"0-J-y -O>l(.";
        r0 = 420; // 0x1a4 float:5.89E-43 double:2.075E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x121c:
        r8[r7] = r6;
        r7 = 422; // 0x1a6 float:5.91E-43 double:2.085E-321;
        r6 = "78I%~1/O8d*3q?y$)K";
        r0 = 421; // 0x1a5 float:5.9E-43 double:2.08E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1227:
        r8[r7] = r6;
        r7 = 423; // 0x1a7 float:5.93E-43 double:2.09E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 422; // 0x1a6 float:5.91E-43 double:2.085E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1232:
        r8[r7] = r6;
        r7 = 424; // 0x1a8 float:5.94E-43 double:2.095E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 423; // 0x1a7 float:5.93E-43 double:2.09E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x123d:
        r8[r7] = r6;
        r7 = 425; // 0x1a9 float:5.96E-43 double:2.1E-321;
        r6 = "65A;R$1B\u0013n*3Z-n1.";
        r0 = 424; // 0x1a8 float:5.94E-43 double:2.095E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1248:
        r8[r7] = r6;
        r7 = 426; // 0x1aa float:5.97E-43 double:2.105E-321;
        r6 = "$-^c~ 3J/\u007f <Z)n,-F)\u007f.8W";
        r0 = 425; // 0x1a9 float:5.96E-43 double:2.1E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1253:
        r8[r7] = r6;
        r7 = 427; // 0x1ab float:5.98E-43 double:2.11E-321;
        r6 = "78O(R78M)d5)]\u0013h+<L h!";
        r0 = 426; // 0x1aa float:5.97E-43 double:2.105E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x125e:
        r8[r7] = r6;
        r7 = 428; // 0x1ac float:6.0E-43 double:2.115E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 427; // 0x1ab float:5.98E-43 double:2.11E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1269:
        r8[r7] = r6;
        r7 = 429; // 0x1ad float:6.01E-43 double:2.12E-321;
        r6 = "\u001buu}:\u0018!\u001c\u0017=r\u0000R\u007fVul\u001c\u007f9sds09\u001em\u001f\u007f9pk\u0019t4\u0018!\u001b\u0017<wn\u001ay;res0;\u001em\u001f~>qh\u0018\u0011q}\u0006\u001f~9s\u0000RuVul\u001c\u007f9pes0Q!&\u001d1$\u00199\u0004s%\u00199Ux!s \u0007h";
        r0 = 428; // 0x1ac float:6.0E-43 double:2.115E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1274:
        r8[r7] = r6;
        r7 = 430; // 0x1ae float:6.03E-43 double:2.124E-321;
        r6 = "\t2I?";
        r0 = 429; // 0x1ad float:6.01E-43 double:2.12E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x127f:
        r8[r7] = r6;
        r7 = 431; // 0x1af float:6.04E-43 double:2.13E-321;
        r6 = "$-^cn-8M'} /C%~64A\"~j3A!h15A(-";
        r0 = 430; // 0x1ae float:6.03E-43 double:2.124E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x128a:
        r8[r7] = r6;
        r7 = 432; // 0x1b0 float:6.05E-43 double:2.134E-321;
        r6 = "eu";
        r0 = 431; // 0x1af float:6.04E-43 double:2.13E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1295:
        r8[r7] = r6;
        r7 = 433; // 0x1b1 float:6.07E-43 double:2.14E-321;
        r6 = "e*\u0013";
        r0 = 432; // 0x1b0 float:6.05E-43 double:2.134E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x12a0:
        r8[r7] = r6;
        r7 = 434; // 0x1b2 float:6.08E-43 double:2.144E-321;
        r6 = "$-^cn-8M'} /C%~64A\"~j8\\>b7}";
        r0 = 433; // 0x1b1 float:6.07E-43 double:2.14E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x12ab:
        r8[r7] = r6;
        r7 = 435; // 0x1b3 float:6.1E-43 double:2.15E-321;
        r6 = "$-^c} /C%~64A\"~j";
        r0 = 434; // 0x1b2 float:6.08E-43 double:2.144E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x12b6:
        r8[r7] = r6;
        r7 = 436; // 0x1b4 float:6.11E-43 double:2.154E-321;
        r6 = "(.I?y*/Kbi'";
        r0 = 435; // 0x1b3 float:6.1E-43 double:2.15E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x12c1:
        r8[r7] = r6;
        r7 = 437; // 0x1b5 float:6.12E-43 double:2.16E-321;
        r6 = "e.K8-2`";
        r0 = 436; // 0x1b4 float:6.11E-43 double:2.154E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x12cc:
        r8[r7] = r6;
        r7 = 438; // 0x1b6 float:6.14E-43 double:2.164E-321;
        r6 = "$-^c} /C%~64A\"~j";
        r0 = 437; // 0x1b5 float:6.12E-43 double:2.16E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x12d7:
        r8[r7] = r6;
        r7 = 439; // 0x1b7 float:6.15E-43 double:2.17E-321;
        r6 = "$-^c~1<\\8\u007f,3I8b+8\u0001/a*.K?y78O!-";
        r0 = 438; // 0x1b6 float:6.14E-43 double:2.164E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x12e2:
        r8[r7] = r6;
        r7 = 440; // 0x1b8 float:6.17E-43 double:2.174E-321;
        r6 = "$-^c~1<\\8\u007f,3I8b+8\u0001%a)8I-a6)O8he";
        r0 = 439; // 0x1b7 float:6.15E-43 double:2.17E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x12ed:
        r8[r7] = r6;
        r7 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        r6 = "$-^c~1<\\8\u007f,3I8b+8\u0001/a*.K?y78O!-";
        r0 = 440; // 0x1b8 float:6.17E-43 double:2.174E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x12f8:
        r8[r7] = r6;
        r7 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        r6 = "$-^c~1<\\8\u007f,3I8b+8\u0001/a*.K?y78O!-";
        r0 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1303:
        r8[r7] = r6;
        r7 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r6 = "$-^c~1<\\8\u007f,3I8b+8\u0001/a*.K?y78O!-";
        r0 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x130e:
        r8[r7] = r6;
        r7 = 444; // 0x1bc float:6.22E-43 double:2.194E-321;
        r6 = "$-^c~1<\\8\u007f,3I8b+8\u0001*d)8@#y#2[\"ie";
        r0 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1319:
        r8[r7] = r6;
        r7 = 445; // 0x1bd float:6.24E-43 double:2.2E-321;
        r6 = "#4B)";
        r0 = 444; // 0x1bc float:6.22E-43 double:2.194E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1324:
        r8[r7] = r6;
        r7 = 446; // 0x1be float:6.25E-43 double:2.204E-321;
        r6 = "$(J%b";
        r0 = 445; // 0x1bd float:6.24E-43 double:2.2E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x132f:
        r8[r7] = r6;
        r7 = 447; // 0x1bf float:6.26E-43 double:2.21E-321;
        r6 = "6-O!R'<@\"h!\u0002K4},/W\u0013y,0K?y$0^";
        r0 = 446; // 0x1be float:6.25E-43 double:2.204E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x133a:
        r8[r7] = r6;
        r7 = 448; // 0x1c0 float:6.28E-43 double:2.213E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 447; // 0x1bf float:6.26E-43 double:2.21E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1345:
        r8[r7] = r6;
        r7 = 449; // 0x1c1 float:6.29E-43 double:2.22E-321;
        r6 = "&2Cbz-<Z?l5-";
        r0 = 448; // 0x1c0 float:6.28E-43 double:2.213E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1350:
        r8[r7] = r6;
        r7 = 450; // 0x1c2 float:6.3E-43 double:2.223E-321;
        r6 = "*3";
        r0 = 449; // 0x1c1 float:6.29E-43 double:2.22E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x135b:
        r8[r7] = r6;
        r7 = 451; // 0x1c3 float:6.32E-43 double:2.23E-321;
        r6 = "\u001a5O?R68Z\u0013i ;O9a1\u0002X-a08]";
        r0 = 450; // 0x1c2 float:6.3E-43 double:2.223E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1366:
        r8[r7] = r6;
        r7 = 452; // 0x1c4 float:6.33E-43 double:2.233E-321;
        r6 = "$-^c~ )Z%c\"rL-n.:\\#x+9\u0003(l1<\u000e";
        r0 = 451; // 0x1c3 float:6.32E-43 double:2.23E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1371:
        r8[r7] = r6;
        r7 = 453; // 0x1c5 float:6.35E-43 double:2.24E-321;
        r6 = "38\\?d*3\u000e9}!<Z)-#<G h!";
        r0 = 452; // 0x1c4 float:6.33E-43 double:2.233E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x137c:
        r8[r7] = r6;
        r7 = 454; // 0x1c6 float:6.36E-43 double:2.243E-321;
        r6 = "ws\u001f}#pm\u001b";
        r0 = 453; // 0x1c5 float:6.35E-43 double:2.24E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1387:
        r8[r7] = r6;
        r7 = 455; // 0x1c7 float:6.38E-43 double:2.25E-321;
        r6 = "&2Cbz-<Z?l5-";
        r0 = 454; // 0x1c6 float:6.36E-43 double:2.243E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1392:
        r8[r7] = r6;
        r7 = 456; // 0x1c8 float:6.39E-43 double:2.253E-321;
        r6 = "$>Z%{,)W";
        r0 = 455; // 0x1c7 float:6.38E-43 double:2.25E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x139d:
        r8[r7] = r6;
        r7 = 457; // 0x1c9 float:6.4E-43 double:2.26E-321;
        r6 = "(2[\"y 9";
        r0 = 456; // 0x1c8 float:6.39E-43 double:2.253E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x13a8:
        r8[r7] = r6;
        r7 = 458; // 0x1ca float:6.42E-43 double:2.263E-321;
        r6 = "us\u001eb=";
        r0 = 457; // 0x1c9 float:6.4E-43 double:2.26E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x13b3:
        r8[r7] = r6;
        r7 = 459; // 0x1cb float:6.43E-43 double:2.27E-321;
        r6 = "38\\?d*3";
        r0 = 458; // 0x1ca float:6.42E-43 double:2.263E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x13be:
        r8[r7] = r6;
        r7 = 460; // 0x1cc float:6.45E-43 double:2.273E-321;
        r6 = "&1G)c1\u0002])\u007f38\\\u0013y,0K\u0013i,;H";
        r0 = 459; // 0x1cb float:6.43E-43 double:2.27E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x13c9:
        r8[r7] = r6;
        r7 = 461; // 0x1cd float:6.46E-43 double:2.28E-321;
        r6 = "*;H";
        r0 = 460; // 0x1cc float:6.45E-43 double:2.273E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x13d4:
        r8[r7] = r6;
        r7 = 462; // 0x1ce float:6.47E-43 double:2.283E-321;
        r6 = "$-^cn78O8hj1A+d+;O%a 9";
        r0 = 461; // 0x1cd float:6.46E-43 double:2.28E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x13df:
        r8[r7] = r6;
        r7 = 463; // 0x1cf float:6.49E-43 double:2.288E-321;
        r6 = "(8J%lj/K-ih2@ t";
        r0 = 462; // 0x1ce float:6.47E-43 double:2.283E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x13ea:
        r8[r7] = r6;
        r7 = 464; // 0x1d0 float:6.5E-43 double:2.29E-321;
        r6 = "&/O?e\u001a4@\u0013{,9K#R68@8d+8B";
        r0 = 463; // 0x1cf float:6.49E-43 double:2.288E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x13f5:
        r8[r7] = r6;
        r7 = 465; // 0x1d1 float:6.52E-43 double:2.297E-321;
        r6 = "$-^cn78O8hj3A8`$4@l";
        r0 = 464; // 0x1d0 float:6.5E-43 double:2.29E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1400:
        r8[r7] = r6;
        r7 = 466; // 0x1d2 float:6.53E-43 double:2.3E-321;
        r6 = "!?q;\u007f,)Kl%";
        r0 = 465; // 0x1d1 float:6.52E-43 double:2.297E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x140b:
        r8[r7] = r6;
        r7 = 467; // 0x1d3 float:6.54E-43 double:2.307E-321;
        r6 = "\u00128LlN)4K\"y";
        r0 = 466; // 0x1d2 float:6.53E-43 double:2.3E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1416:
        r8[r7] = r6;
        r7 = 468; // 0x1d4 float:6.56E-43 double:2.31E-321;
        r6 = ",3]8l)1q\"b+\u0002C-\u007f.8Z\u0013l5-]";
        r0 = 467; // 0x1d3 float:6.54E-43 double:2.307E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1421:
        r8[r7] = r6;
        r7 = 469; // 0x1d5 float:6.57E-43 double:2.317E-321;
        r6 = "ws\u001f}#pm\u001b";
        r0 = 468; // 0x1d4 float:6.56E-43 double:2.31E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x142c:
        r8[r7] = r6;
        r7 = 470; // 0x1d6 float:6.59E-43 double:2.32E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 469; // 0x1d5 float:6.57E-43 double:2.317E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1437:
        r8[r7] = r6;
        r7 = 471; // 0x1d7 float:6.6E-43 double:2.327E-321;
        r6 = "&2@\"h&)G:d1$";
        r0 = 470; // 0x1d6 float:6.59E-43 double:2.32E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1442:
        r8[r7] = r6;
        r7 = 472; // 0x1d8 float:6.61E-43 double:2.33E-321;
        r6 = "38\\?d*3";
        r0 = 471; // 0x1d7 float:6.6E-43 double:2.327E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x144d:
        r8[r7] = r6;
        r7 = 473; // 0x1d9 float:6.63E-43 double:2.337E-321;
        r6 = "\u0010\u0013m\rX\u0002\u0015zlH\u001d\u001ek\u001cY\f\u0012`";
        r0 = 472; // 0x1d8 float:6.61E-43 double:2.33E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1458:
        r8[r7] = r6;
        r7 = 474; // 0x1da float:6.64E-43 double:2.34E-321;
        r6 = "5/A/h6.\u000e'd)1K(";
        r0 = 473; // 0x1d9 float:6.63E-43 double:2.337E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1463:
        r8[r7] = r6;
        r7 = 475; // 0x1db float:6.66E-43 double:2.347E-321;
        r6 = "ws\u001f}#pm\u001b";
        r0 = 474; // 0x1da float:6.64E-43 double:2.34E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x146e:
        r8[r7] = r6;
        r7 = 476; // 0x1dc float:6.67E-43 double:2.35E-321;
        r6 = "55A\"h";
        r0 = 475; // 0x1db float:6.66E-43 double:2.347E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1479:
        r8[r7] = r6;
        r7 = 477; // 0x1dd float:6.68E-43 double:2.357E-321;
        r6 = "&2Cbz-<Z?l5-\u0000-a$/Cb_\u0000\u001ag\u001fY\u0017\u001cz\u0005B\u000b\u0002z\rF\f\u0013i\u0013Y\n\u0012q\u0000B\u000b\u001aq\u0018D\b\u0018a\u0019Y";
        r0 = 476; // 0x1dc float:6.67E-43 double:2.35E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1484:
        r8[r7] = r6;
        r7 = 478; // 0x1de float:6.7E-43 double:2.36E-321;
        r6 = "52Y)\u007f";
        r0 = 477; // 0x1dd float:6.68E-43 double:2.357E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x148f:
        r8[r7] = r6;
        r7 = 479; // 0x1df float:6.71E-43 double:2.367E-321;
        r6 = "(8J%lj(@-{$4B-o)8\u000e";
        r0 = 478; // 0x1de float:6.7E-43 double:2.36E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x149a:
        r8[r7] = r6;
        r7 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r6 = "ws\u001f}#pm\u001b";
        r0 = 479; // 0x1df float:6.71E-43 double:2.367E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x14a5:
        r8[r7] = r6;
        r7 = 481; // 0x1e1 float:6.74E-43 double:2.376E-321;
        r6 = "&/O?e\u001a.K\"y,3K ";
        r0 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x14b0:
        r8[r7] = r6;
        r7 = 482; // 0x1e2 float:6.75E-43 double:2.38E-321;
        r6 = "(2[\"y 9q>b";
        r0 = 481; // 0x1e1 float:6.74E-43 double:2.376E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x14bb:
        r8[r7] = r6;
        r7 = 483; // 0x1e3 float:6.77E-43 double:2.386E-321;
        r6 = "k)\\-~-";
        r0 = 482; // 0x1e2 float:6.75E-43 double:2.38E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x14c6:
        r8[r7] = r6;
        r7 = 484; // 0x1e4 float:6.78E-43 double:2.39E-321;
        r6 = "\u001a5O?R68Z\u0013i ;O9a1\u0002X-a08]";
        r0 = 483; // 0x1e3 float:6.77E-43 double:2.386E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x14d1:
        r8[r7] = r6;
        r7 = 485; // 0x1e5 float:6.8E-43 double:2.396E-321;
        r6 = "k)\\-~-";
        r0 = 484; // 0x1e4 float:6.78E-43 double:2.39E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x14dc:
        r8[r7] = r6;
        r7 = 486; // 0x1e6 float:6.81E-43 double:2.4E-321;
        r6 = "$-^cn78O8hj/K+y*2B#c\"rC%~68Jal)<\\!\"&<B  (<@9l)1W";
        r0 = 485; // 0x1e5 float:6.8E-43 double:2.396E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x14e7:
        r8[r7] = r6;
        r7 = 487; // 0x1e7 float:6.82E-43 double:2.406E-321;
        r6 = "$-^cb+>\\)l18\u0001\"b1\u0002C-d+\u0002^>b&8]?\"6)A<R-8\\)#k";
        r0 = 486; // 0x1e6 float:6.81E-43 double:2.4E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x14f2:
        r8[r7] = r6;
        r7 = 488; // 0x1e8 float:6.84E-43 double:2.41E-321;
        r6 = "$-^c`6:]8b78J.\"-8O y-$";
        r0 = 487; // 0x1e7 float:6.82E-43 double:2.406E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x14fd:
        r8[r7] = r6;
        r7 = 489; // 0x1e9 float:6.85E-43 double:2.416E-321;
        r6 = "24@(b2";
        r0 = 488; // 0x1e8 float:6.84E-43 double:2.41E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1508:
        r8[r7] = r6;
        r7 = 490; // 0x1ea float:6.87E-43 double:2.42E-321;
        r6 = "&1G)c1\u0002X)\u007f64A\"R0-I>l!8J";
        r0 = 489; // 0x1e9 float:6.85E-43 double:2.416E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1513:
        r8[r7] = r6;
        r7 = 491; // 0x1eb float:6.88E-43 double:2.426E-321;
        r6 = "78I%~1/O8d*3q?y$/Z\u0013y,0K";
        r0 = 490; // 0x1ea float:6.87E-43 double:2.42E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x151e:
        r8[r7] = r6;
        r7 = 492; // 0x1ec float:6.9E-43 double:2.43E-321;
        r6 = " /\\#\u007fe-O>~,3Il`&>\u0001!c&";
        r0 = 491; // 0x1eb float:6.88E-43 double:2.426E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1529:
        r8[r7] = r6;
        r7 = 493; // 0x1ed float:6.91E-43 double:2.436E-321;
        r6 = "$-^cl)1M#c1<M8~j";
        r0 = 492; // 0x1ec float:6.9E-43 double:2.43E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1534:
        r8[r7] = r6;
        r7 = 494; // 0x1ee float:6.92E-43 double:2.44E-321;
        r6 = "$-^cb+>\\)l18\u0001?n78K\"\"";
        r0 = 493; // 0x1ed float:6.91E-43 double:2.436E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x153f:
        r8[r7] = r6;
        r7 = 495; // 0x1ef float:6.94E-43 double:2.446E-321;
        r6 = "$-^ d&<Z%b+}A\"N78O8he>O a 9\u000e-k18\\ll5-B%n$)G#ce<B>h$9Wl~1<\\8h!";
        r0 = 494; // 0x1ee float:6.92E-43 double:2.44E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x154a:
        r8[r7] = r6;
        r7 = 496; // 0x1f0 float:6.95E-43 double:2.45E-321;
        r6 = "$-^cd+)K>c$1]8b7<I)\"$+O%ae";
        r0 = 495; // 0x1ef float:6.94E-43 double:2.446E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1555:
        r8[r7] = r6;
        r7 = 497; // 0x1f1 float:6.96E-43 double:2.456E-321;
        r6 = "34J)be)\\-c6>A(d+:\u000e*l1<Blk$4B9\u007f g\u000e";
        r0 = 496; // 0x1f0 float:6.95E-43 double:2.45E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1560:
        r8[r7] = r6;
        r7 = 498; // 0x1f2 float:6.98E-43 double:2.46E-321;
        r6 = "$-^ci,.^ l<.A*y2<\\)h=-G>h!r@#y,;G/l14A\"-";
        r0 = 497; // 0x1f1 float:6.96E-43 double:2.456E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x156b:
        r8[r7] = r6;
        r7 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        r6 = "+(B -'<Z8h7$\u000e/e$3I)- +K\"y~}M-c+2Zl~ 3Jlz ?\u000e.l1)K>te(^(l18";
        r0 = 498; // 0x1f2 float:6.98E-43 double:2.46E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1576:
        r8[r7] = r6;
        r7 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r6 = "+(B -52Y)\u007fe.O:he0A(he8X)c1f\u000e/l+3A8-68@(-28Llo$)Z)\u007f<}[<i$)K";
        r0 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1581:
        r8[r7] = r6;
        r7 = 501; // 0x1f5 float:7.02E-43 double:2.475E-321;
        r6 = "\u0010\u0013m\rX\u0002\u0015zlH\u001d\u001ek\u001cY\f\u0012`";
        r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x158c:
        r8[r7] = r6;
        r7 = 502; // 0x1f6 float:7.03E-43 double:2.48E-321;
        r6 = "$-^c~ 3J\u0019c6(L?n74L)A*>O8d*3]c";
        r0 = 501; // 0x1f5 float:7.02E-43 double:2.475E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1597:
        r8[r7] = r6;
        r7 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        r6 = "&2Cbl(<T#ck9K:d&8\u0000$b(8\u0000\u0004b(8c-c$:K>";
        r0 = 502; // 0x1f6 float:7.03E-43 double:2.48E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x15a2:
        r8[r7] = r6;
        r7 = 504; // 0x1f8 float:7.06E-43 double:2.49E-321;
        r6 = "$-^c~ 3J\u000bh1\u000eK>{ /~>b5.";
        r0 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x15ad:
        r8[r7] = r6;
        r7 = 505; // 0x1f9 float:7.08E-43 double:2.495E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 504; // 0x1f8 float:7.06E-43 double:2.49E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x15b8:
        r8[r7] = r6;
        r7 = 506; // 0x1fa float:7.09E-43 double:2.5E-321;
        r6 = "$-^c~ )]$b01J>h#/K?e'/A-i&<]8a,.Z?\"#<G h!";
        r0 = 505; // 0x1f9 float:7.08E-43 double:2.495E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x15c3:
        r8[r7] = r6;
        r7 = 507; // 0x1fb float:7.1E-43 double:2.505E-321;
        r6 = "78H>h65q.\u007f*<J/l6)q d6)]";
        r0 = 506; // 0x1fa float:7.09E-43 double:2.5E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x15ce:
        r8[r7] = r6;
        r7 = 508; // 0x1fc float:7.12E-43 double:2.51E-321;
        r6 = "&2Cbz-<Z?l5-\u0000-a$/Cb_\u0000\u001ag\u001fY\u0017\u001cz\u0005B\u000b\u0002|\tY\u0017\u0004";
        r0 = 507; // 0x1fb float:7.1E-43 double:2.505E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x15d9:
        r8[r7] = r6;
        r7 = 509; // 0x1fd float:7.13E-43 double:2.515E-321;
        r6 = "$3J>b,9\u0000\"h1sM#c+sl\rN\u000e\u001a|\u0003X\u000b\u0019q\bL\u0011\u001cq\u001fH\u0011\tg\u0002J\u001a\u001ef\rC\u0002\u0018j";
        r0 = 508; // 0x1fc float:7.12E-43 double:2.51E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x15e4:
        r8[r7] = r6;
        r7 = 510; // 0x1fe float:7.15E-43 double:2.52E-321;
        r6 = "&2Cbz-<Z?l5-\u0000<h70G?~,2@bO\u0017\u0012o\bN\u0004\u000ez";
        r0 = 509; // 0x1fd float:7.13E-43 double:2.515E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x15ef:
        r8[r7] = r6;
        r7 = 511; // 0x1ff float:7.16E-43 double:2.525E-321;
        r6 = "&2Cbz-<Z?l5-\u0000-a$/Cb_\u0000\u001ag\u001fY\u0017\u001cz\u0005B\u000b\u0002z\rF\f\u0013i\u0013Y\n\u0012q\u0000B\u000b\u001aq\u0018D\b\u0018a\u0019Y";
        r0 = 510; // 0x1fe float:7.15E-43 double:2.52E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x15fa:
        r8[r7] = r6;
        r7 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r6 = "&2Cbz-<Z?l5-\u0000<h70G?~,2@bO\u0017\u0012o\bN\u0004\u000ez";
        r0 = 511; // 0x1ff float:7.16E-43 double:2.525E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1605:
        r8[r7] = r6;
        r7 = 513; // 0x201 float:7.19E-43 double:2.535E-321;
        r6 = "&2Cbz-<Z?l5-\u0000<h70G?~,2@bO\u0017\u0012o\bN\u0004\u000ez";
        r0 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1610:
        r8[r7] = r6;
        r7 = 514; // 0x202 float:7.2E-43 double:2.54E-321;
        r6 = "&2Cbz-<Z?l5-\u0000-a$/CbN\t\u0014k\u0002Y\u001a\rg\u0002J\u001a\tg\u0001H\n\bz";
        r0 = 513; // 0x201 float:7.19E-43 double:2.535E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x161b:
        r8[r7] = r6;
        r7 = 515; // 0x203 float:7.22E-43 double:2.544E-321;
        r6 = "e7G(7";
        r0 = 514; // 0x202 float:7.2E-43 double:2.54E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1626:
        r8[r7] = r6;
        r7 = 516; // 0x204 float:7.23E-43 double:2.55E-321;
        r6 = "e7G(7";
        r0 = 515; // 0x203 float:7.22E-43 double:2.544E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1631:
        r8[r7] = r6;
        r7 = 517; // 0x205 float:7.24E-43 double:2.554E-321;
        r6 = "$-^c~ 3J\u000bh1\r\\#k,1K\u001ce*)Al}-2Z#R,9\u0014";
        r0 = 516; // 0x204 float:7.23E-43 double:2.55E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x163c:
        r8[r7] = r6;
        r7 = 518; // 0x206 float:7.26E-43 double:2.56E-321;
        r6 = "e)W<h\u007f";
        r0 = 517; // 0x205 float:7.24E-43 double:2.554E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1647:
        r8[r7] = r6;
        r7 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r6 = "/4Jl`0.Zlc*)\u000e.he8C<y<";
        r0 = 518; // 0x206 float:7.26E-43 double:2.56E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1652:
        r8[r7] = r6;
        r7 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r6 = "\u0005.\u0000;e$)]-}5s@)y";
        r0 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x165d:
        r8[r7] = r6;
        r7 = 521; // 0x209 float:7.3E-43 double:2.574E-321;
        r6 = "e)W<h\u007f";
        r0 = 520; // 0x208 float:7.29E-43 double:2.57E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1668:
        r8[r7] = r6;
        r7 = 522; // 0x20a float:7.31E-43 double:2.58E-321;
        r6 = "$-^c~ 3J\u000bh1\r\\#k,1K\u001ce*)Ad` .]-j \u0002])\u007f34M)R\u000b\u0012z\u0013\u007f <J5$e-F#y*\u0002G(7";
        r0 = 521; // 0x209 float:7.3E-43 double:2.574E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1673:
        r8[r7] = r6;
        r7 = 523; // 0x20b float:7.33E-43 double:2.584E-321;
        r6 = "/4Jl`0.Zlc*)\u000e.he3[ a";
        r0 = 522; // 0x20a float:7.31E-43 double:2.58E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x167e:
        r8[r7] = r6;
        r7 = 524; // 0x20c float:7.34E-43 double:2.59E-321;
        r6 = "&2Cbl(<T#ck9K:d&8\u0000!h6.O+d+:\u0000\rI\b";
        r0 = 523; // 0x20b float:7.33E-43 double:2.584E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1689:
        r8[r7] = r6;
        r7 = 525; // 0x20d float:7.36E-43 double:2.594E-321;
        r6 = "78I%~1/O8d*3q/b!8";
        r0 = 524; // 0x20c float:7.34E-43 double:2.59E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1694:
        r8[r7] = r6;
        r7 = 526; // 0x20e float:7.37E-43 double:2.6E-321;
        r6 = "$-^c~ )\\)j&2J)\"#<G h!";
        r0 = 525; // 0x20d float:7.36E-43 double:2.594E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x169f:
        r8[r7] = r6;
        r7 = 527; // 0x20f float:7.38E-43 double:2.604E-321;
        r6 = "&2Cbz-<Z?l5-q<\u007f ;K>h+>K?";
        r0 = 526; // 0x20e float:7.37E-43 double:2.6E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x16aa:
        r8[r7] = r6;
        r7 = 528; // 0x210 float:7.4E-43 double:2.61E-321;
        r6 = "$-^c~ 3J+h1>G<e /E)t";
        r0 = 527; // 0x20f float:7.38E-43 double:2.604E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x16b5:
        r8[r7] = r6;
        r7 = 529; // 0x211 float:7.41E-43 double:2.614E-321;
        r6 = "$-^c~ 3J+h1>G<e /E)tj0]ac*)\u0003>h$9W";
        r0 = 528; // 0x210 float:7.4E-43 double:2.61E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x16c0:
        r8[r7] = r6;
        r7 = 530; // 0x212 float:7.43E-43 double:2.62E-321;
        r6 = "$-^c~ 3J?h1-\\%{$>W?h1)G\"j6}";
        r0 = 529; // 0x211 float:7.41E-43 double:2.614E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x16cb:
        r8[r7] = r6;
        r7 = 531; // 0x213 float:7.44E-43 double:2.623E-321;
        r6 = "$-^c~ 3J\u000fl)1z)\u007f(4@-y }B#n$1c)~6<I)^ /X%n }@#ye/K-i<";
        r0 = 530; // 0x212 float:7.43E-43 double:2.62E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x16d6:
        r8[r7] = r6;
        r7 = 532; // 0x214 float:7.45E-43 double:2.63E-321;
        r6 = "$-^c~ 3J\u000fl)1z)\u007f(4@-y ";
        r0 = 531; // 0x213 float:7.44E-43 double:2.623E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x16e1:
        r8[r7] = r6;
        r7 = 533; // 0x215 float:7.47E-43 double:2.633E-321;
        r6 = "$-^c~ 3J>h(2X)l&>A9c1";
        r0 = 532; // 0x214 float:7.45E-43 double:2.63E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x16ec:
        r8[r7] = r6;
        r7 = 534; // 0x216 float:7.48E-43 double:2.64E-321;
        r6 = "\f3X-a,9\u000e.x,1Jly<-K";
        r0 = 533; // 0x215 float:7.47E-43 double:2.633E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x16f7:
        r8[r7] = r6;
        r7 = 535; // 0x217 float:7.5E-43 double:2.643E-321;
        r6 = "\u0004.W\"n\u00151O5h7";
        r0 = 534; // 0x216 float:7.48E-43 double:2.64E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1702:
        r8[r7] = r6;
        r7 = 536; // 0x218 float:7.51E-43 double:2.65E-321;
        r6 = "\u00125O8~\u0004-^";
        r0 = 535; // 0x217 float:7.5E-43 double:2.643E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x170d:
        r8[r7] = r6;
        r7 = 537; // 0x219 float:7.52E-43 double:2.653E-321;
        r6 = "\f3X-a,9\u000e(d6)\\%o0)G#ce;B-{*/";
        r0 = 536; // 0x218 float:7.51E-43 double:2.65E-321;
        r8 = r9;
        goto L_0x0010;
    L_0x1718:
        r8[r7] = r6;
        bb = r9;
        r0 = com.whatsapp.App.class;
        r0 = r0.desiredAssertionStatus();	 Catch:{ NumberFormatException -> 0x17ad }
        if (r0 != 0) goto L_0x17af;
    L_0x1724:
        r0 = r3;
    L_0x1725:
        a5 = r0;
        r0 = new org.spongycastle.jce.provider.BouncyCastleProvider;
        r0.<init>();
        java.security.Security.insertProviderAt(r0, r3);
        r0 = new com.whatsapp.wj;
        r0.<init>();
        a0 = r0;
        r0 = new android.os.Handler;
        r0.<init>();
        aw = r0;
        aY = r2;
        r0 = new java.io.File;
        r6 = android.os.Environment.getExternalStorageDirectory();
        r7 = bb;
        r8 = 536; // 0x218 float:7.51E-43 double:2.65E-321;
        r7 = r7[r8];
        r0.<init>(r6, r7);
        ao = r0;
        r0 = "78B)l68";
        r0 = z(r0);
        r6 = z(r0);
        r0 = r6.hashCode();	 Catch:{ NumberFormatException -> 0x17b2 }
        switch(r0) {
            case 3020272: goto L_0x17c2;
            case 92909918: goto L_0x17b4;
            case 95458899: goto L_0x1795;
            case 1090594823: goto L_0x17d0;
            default: goto L_0x1761;
        };
    L_0x1761:
        r0 = r1;
    L_0x1762:
        switch(r0) {
            case 0: goto L_0x1771;
            case 1: goto L_0x17e0;
            case 2: goto L_0x17e3;
            case 3: goto L_0x17e6;
            default: goto L_0x1765;
        };
    L_0x1765:
        r0 = new java.lang.IllegalStateException;
        r1 = bb;
        r2 = 534; // 0x216 float:7.48E-43 double:2.64E-321;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x1771:
        r0 = 3;
        aa = r0;	 Catch:{ NumberFormatException -> 0x17de }
    L_0x1774:
        r0 = "51O5";
        r0 = z(r0);
        r7 = z(r0);
        r0 = r7.hashCode();	 Catch:{ NumberFormatException -> 0x17f6 }
        switch(r0) {
            case -1414265340: goto L_0x1811;
            case 3443508: goto L_0x17f8;
            case 344200471: goto L_0x1804;
            case 1224335515: goto L_0x17e9;
            default: goto L_0x1785;
        };
    L_0x1785:
        r0 = r1;
    L_0x1786:
        switch(r0) {
            case 0: goto L_0x181e;
            case 1: goto L_0x1950;
            case 2: goto L_0x1954;
            case 3: goto L_0x1958;
            default: goto L_0x1789;
        };
    L_0x1789:
        r0 = new java.lang.IllegalStateException;
        r1 = bb;
        r2 = 537; // 0x219 float:7.52E-43 double:2.653E-321;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x1795:
        r0 = "!8L9j";
        r7 = r6;
        r6 = r0;
        r0 = r1;
    L_0x179a:
        r6 = z(r6);
        r6 = z(r6);
        switch(r0) {
            case 0: goto L_0x17ba;
            case 1: goto L_0x17c8;
            case 2: goto L_0x17d6;
            case 3: goto L_0x17ee;
            case 4: goto L_0x17fc;
            case 5: goto L_0x1808;
            case 6: goto L_0x1815;
            default: goto L_0x17a5;
        };
    L_0x17a5:
        r0 = r7.equals(r6);	 Catch:{ NumberFormatException -> 0x17b2 }
        if (r0 == 0) goto L_0x1761;
    L_0x17ab:
        r0 = r2;
        goto L_0x1762;
    L_0x17ad:
        r0 = move-exception;
        throw r0;
    L_0x17af:
        r0 = r2;
        goto L_0x1725;
    L_0x17b2:
        r0 = move-exception;
        throw r0;
    L_0x17b4:
        r0 = "$1^$l";
        r7 = r6;
        r6 = r0;
        r0 = r2;
        goto L_0x179a;
    L_0x17ba:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1761;
    L_0x17c0:
        r0 = r3;
        goto L_0x1762;
    L_0x17c2:
        r0 = "'8Z-";
        r7 = r6;
        r6 = r0;
        r0 = r3;
        goto L_0x179a;
    L_0x17c8:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1761;
    L_0x17ce:
        r0 = r4;
        goto L_0x1762;
    L_0x17d0:
        r0 = "78B)l68";
        r7 = r6;
        r6 = r0;
        r0 = r4;
        goto L_0x179a;
    L_0x17d6:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1761;
    L_0x17dc:
        r0 = r5;
        goto L_0x1762;
    L_0x17de:
        r0 = move-exception;
        throw r0;
    L_0x17e0:
        aa = r4;
        goto L_0x1774;
    L_0x17e3:
        aa = r3;
        goto L_0x1774;
    L_0x17e6:
        aa = r2;
        goto L_0x1774;
    L_0x17e9:
        r0 = "28L?d18";
        r6 = r0;
        r0 = r5;
        goto L_0x179a;
    L_0x17ee:
        r0 = r7.equals(r6);	 Catch:{ NumberFormatException -> 0x17f6 }
        if (r0 == 0) goto L_0x1785;
    L_0x17f4:
        r0 = r2;
        goto L_0x1786;
    L_0x17f6:
        r0 = move-exception;
        throw r0;
    L_0x17f8:
        r6 = "51O5";
        r0 = 4;
        goto L_0x179a;
    L_0x17fc:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1785;
    L_0x1802:
        r0 = r3;
        goto L_0x1786;
    L_0x1804:
        r6 = "$(Z#`$)G#c";
        r0 = 5;
        goto L_0x179a;
    L_0x1808:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1785;
    L_0x180e:
        r0 = r4;
        goto L_0x1786;
    L_0x1811:
        r6 = "$0O6b+";
        r0 = 6;
        goto L_0x179a;
    L_0x1815:
        r0 = r7.equals(r6);
        if (r0 == 0) goto L_0x1785;
    L_0x181b:
        r0 = r5;
        goto L_0x1786;
    L_0x181e:
        r0 = 1;
        G = r0;	 Catch:{ NumberFormatException -> 0x194e }
    L_0x1821:
        aC = r1;
        A = r2;
        U = r2;
        al = r2;
        aL = r2;
        r0 = 0;
        X = r0;
        aE = r5;
        aZ = r2;
        a7 = r3;
        S = r2;
        r0 = "";
        r0 = android.net.Uri.parse(r0);
        aQ = r0;
        r4 = -1;
        a2 = r4;
        J = r2;
        r0 = 0;
        h = r0;
        q = r2;
        r0 = new com.whatsapp.util.b7;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r0.<init>(r4);
        i = r0;
        r0 = new com.whatsapp.util.b7;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r0.<init>(r4);
        D = r0;
        r0 = new com.whatsapp.util.b7;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r0.<init>(r4);
        N = r0;
        r0 = new java.util.HashMap;
        r0.<init>();
        ak = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        au = r0;
        r0 = new java.lang.Object;
        r0.<init>();
        u = r0;
        O = r2;
        r4 = -1;
        ar = r4;
        aD = r1;
        r0 = com.whatsapp.atf.WHATSAPP_INITIATED;
        M = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        aR = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        aM = r0;
        L = r2;
        r0 = new com.whatsapp.af3;
        r0.<init>();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r0);
        r0 = z();
        F = r0;
        aU = r2;
        K = r2;
        b = r2;
        r0 = new com.whatsapp.util.y;
        r0.<init>(r3);
        s = r0;
        aV = r2;
        o = r2;
        aN = r2;
        af = r2;
        r0 = new java.util.Hashtable;
        r0.<init>();
        at = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        c = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        Y = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        aO = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        I = r0;
        r0 = -1;
        ay = r0;
        r0 = new com.whatsapp.a1u;
        r0.<init>();
        ag = r0;
        r0 = new com.whatsapp.akb;
        r0.<init>();
        aH = r0;
        r0 = new com.whatsapp.avv;
        r0.<init>();
        a8 = r0;
        r0 = new com.whatsapp.gd;
        r0.<init>();
        t = r0;
        r0 = new java.util.HashMap;
        r0.<init>();
        ap = r0;
        r0 = new com.whatsapp.pt;
        r0.<init>();
        ab = r0;
        r0 = 0;
        p = r0;
        r0 = new java.lang.Object;
        r0.<init>();
        g = r0;
        r0 = new android.media.AsyncPlayer;
        r1 = bb;
        r2 = 535; // 0x217 float:7.5E-43 double:2.643E-321;
        r1 = r1[r2];
        r0.<init>(r1);
        V = r0;
        r0 = new android.os.Handler;
        r1 = new com.whatsapp.ast;
        r1.<init>();
        r0.<init>(r1);
        aI = r0;
        r0 = new android.os.Handler;
        r1 = new com.whatsapp.xt;
        r1.<init>();
        r0.<init>(r1);
        n = r0;
        r0 = new com.whatsapp.an7;
        r0.<init>();
        a4 = r0;
        r0 = new com.whatsapp.hn;
        r0.<init>();
        am = r0;
        r0 = 0;
        W = r0;
        return;
    L_0x194e:
        r0 = move-exception;
        throw r0;
    L_0x1950:
        G = r2;
        goto L_0x1821;
    L_0x1954:
        G = r5;
        goto L_0x1821;
    L_0x1958:
        G = r4;
        goto L_0x1821;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.<clinit>():void");
    }

    public static String b(Context context) {
        return context.getSharedPreferences(bb[346], 0).getString(bb[345], null);
    }

    private static void b(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                l.b(au.c(str, str2, str3, str4));
            } catch (NumberFormatException e) {
                throw e;
            }
        }
    }

    private void aS() {
        a5w.a(new a1m(this), new Void[0]);
    }

    public static void c(com.whatsapp.protocol.b bVar) {
        aJ.a(bVar, true, 4);
    }

    public void Y() {
        try {
            if (ac && !Voip.f()) {
                Context applicationContext = getApplicationContext();
                al.r(applicationContext);
                if (al.e(applicationContext)) {
                    l.b(au.a(al.q(applicationContext), new gz(this, applicationContext)));
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void p(String str) {
        int i = az;
        Iterator it = Y.iterator();
        while (it.hasNext()) {
            ((_2) it.next()).e(str);
            if (i != 0) {
                return;
            }
        }
    }

    static void j(String str) {
        int i = az;
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((anq) it.next()).d(str);
            if (i != 0) {
                return;
            }
        }
    }

    public void x(String str) {
        Editor edit = getSharedPreferences(bb[274], 0).edit();
        try {
            edit.putString(bb[275], str);
            if (!edit.commit()) {
                Log.e(bb[276]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(m8 m8Var, boolean z, boolean z2) {
        a(m8Var, z, z2, null, -1);
    }

    public static void a(com.whatsapp.protocol.b bVar, boolean z) {
        Collection arrayList = new ArrayList();
        arrayList.add(bVar);
        a(bVar.e.c, arrayList, z);
    }

    public static void a(String str, List list, int i, boolean z) {
        try {
            if (!ac) {
                return;
            }
            if (a12.n() || z) {
                l.b(au.b(str, list, i, new a15(new ap(str, list, i, z))));
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.String r2, boolean r3) {
        /*
        r0 = ac;	 Catch:{ NumberFormatException -> 0x002c }
        if (r0 == 0) goto L_0x002b;
    L_0x0004:
        r0 = i;	 Catch:{ NumberFormatException -> 0x002e }
        r0 = r0.b(r2);	 Catch:{ NumberFormatException -> 0x002e }
        if (r0 != 0) goto L_0x0019;
    L_0x000c:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0030 }
        r1 = 323; // 0x143 float:4.53E-43 double:1.596E-321;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0030 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0030 }
        r0 = az;	 Catch:{ NumberFormatException -> 0x0030 }
        if (r0 == 0) goto L_0x002b;
    L_0x0019:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0030 }
        r1 = 324; // 0x144 float:4.54E-43 double:1.6E-321;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0030 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0030 }
        r0 = l;	 Catch:{ NumberFormatException -> 0x0030 }
        r1 = com.whatsapp.messaging.au.a(r2, r3);	 Catch:{ NumberFormatException -> 0x0030 }
        r0.b(r1);	 Catch:{ NumberFormatException -> 0x0030 }
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(java.lang.String, boolean):void");
    }

    private long A() {
        Long valueOf;
        IOException e;
        Long l;
        Throwable th;
        Long valueOf2 = Long.valueOf(-1);
        File file = new File(getFilesDir(), bb[123]);
        try {
            if (!file.exists()) {
                return -1;
            }
            ObjectInputStream objectInputStream = null;
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(file));
                try {
                    valueOf = Long.valueOf(objectInputStream2.readLong());
                } catch (IOException e2) {
                    e = e2;
                    objectInputStream = objectInputStream2;
                    l = valueOf2;
                    try {
                        Log.e(bb[125] + e.toString());
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e3) {
                                Log.e(bb[124] + e3.toString());
                            }
                        }
                        return l.longValue();
                    } catch (Throwable th2) {
                        th = th2;
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (NumberFormatException e4) {
                                throw e4;
                            } catch (IOException e5) {
                                Log.e(bb[122] + e5.toString());
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
                try {
                    long longValue = valueOf.longValue();
                    if (objectInputStream2 == null) {
                        return longValue;
                    }
                    try {
                        objectInputStream2.close();
                        return longValue;
                    } catch (NumberFormatException e6) {
                        throw e6;
                    } catch (IOException e7) {
                        Log.e(bb[121] + e7.toString());
                        return longValue;
                    }
                } catch (IOException e8) {
                    e3 = e8;
                    ObjectInputStream objectInputStream3 = objectInputStream2;
                    l = valueOf;
                    objectInputStream = objectInputStream3;
                    Log.e(bb[125] + e3.toString());
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return l.longValue();
                } catch (Throwable th32) {
                    th = th32;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e3 = e9;
                l = valueOf2;
                Log.e(bb[125] + e3.toString());
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                return l.longValue();
            }
        } catch (IOException e32) {
            throw e32;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File q(com.whatsapp.protocol.b r5) {
        /*
        r1 = az;
        r0 = r5.z;
        if (r0 == 0) goto L_0x0029;
    L_0x0006:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = r5.z;
        r3 = 47;
        r4 = 45;
        r2 = r2.replace(r3, r4);
        r0 = r0.append(r2);
        r2 = bb;
        r3 = 34;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.toString();
        if (r1 == 0) goto L_0x0049;
    L_0x0029:
        r0 = r5.t;	 Catch:{ NumberFormatException -> 0x0045 }
        if (r0 == 0) goto L_0x003a;
    L_0x002d:
        r0 = new java.io.File;
        r2 = r5.t;
        r0.<init>(r2);
        r0 = r0.getName();
        if (r1 == 0) goto L_0x0049;
    L_0x003a:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0047 }
        r1 = 35;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0047 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0047 }
        r0 = 0;
    L_0x0044:
        return r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r0 = t(r0);
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.q(com.whatsapp.protocol.b):java.io.File");
    }

    public static boolean c(String[] strArr) {
        try {
            if (!ac) {
                return false;
            }
            l.b(au.b(strArr));
            return true;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static void aA() {
        al = true;
        aj();
    }

    public static void a(String str, byte[] bArr, MediaData mediaData, byte b, int i) {
        a(str, bArr, mediaData, b, i, null, null);
    }

    public static void n() {
        try {
            if (an != null) {
                Log.i(bb[421]);
                v = a54.a(an.jabber_id);
                a(an.jabber_id, v);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void T() {
        f(true);
    }

    static void s(Context context) {
        MessageService.b(context, true);
        MessageService.a(context, true);
    }

    public static void p(com.whatsapp.protocol.b bVar) {
        int i = az;
        Iterator it = I.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).b(bVar);
            if (i != 0) {
                return;
            }
        }
    }

    public static void a(boolean z, boolean z2, boolean z3, boolean z4) {
        q.c().a(z, z2, z3, z4);
    }

    public static String a(int i) {
        switch (i) {
            case ay.f /*1*/:
                return bb[249];
            case ay.n /*2*/:
                try {
                    return bb[251];
                } catch (NumberFormatException e) {
                    throw e;
                }
            case ay.p /*3*/:
                return bb[252];
            default:
                return bb[250];
        }
    }

    public static void ad() {
        try {
            if (ac) {
                Log.i(bb[405]);
                l.b(au.g(bb[406]));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static int aY() {
        try {
            if (ah == null) {
                return 0;
            }
            try {
                if (a3 == null) {
                    return 0;
                }
                NetworkInfo activeNetworkInfo = ah.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return 0;
                }
                try {
                    if (activeNetworkInfo.getType() == 1) {
                        return 1;
                    }
                    if (activeNetworkInfo.isRoaming()) {
                        return 3;
                    }
                    if (a3.isNetworkRoaming()) {
                        return 3;
                    }
                    Object simCountryIso = a3.getSimCountryIso();
                    try {
                        if (TextUtils.isEmpty(simCountryIso)) {
                            return 3;
                        }
                        CharSequence simOperator = a3.getSimOperator();
                        try {
                            if (TextUtils.isEmpty(simOperator)) {
                                return 3;
                            }
                            if (a3.getPhoneType() != 2) {
                                CharSequence networkCountryIso = a3.getNetworkCountryIso();
                                try {
                                    if (TextUtils.isEmpty(networkCountryIso)) {
                                        return 3;
                                    }
                                    try {
                                        if (!simCountryIso.equals(networkCountryIso)) {
                                            return 3;
                                        }
                                        simCountryIso = a3.getNetworkOperator();
                                        try {
                                            if (TextUtils.isEmpty(simCountryIso)) {
                                                return 3;
                                            }
                                            try {
                                                if (!simCountryIso.equals(simOperator)) {
                                                    return 3;
                                                }
                                            } catch (NumberFormatException e) {
                                                throw e;
                                            }
                                        } catch (NumberFormatException e2) {
                                            throw e2;
                                        }
                                    } catch (NumberFormatException e22) {
                                        throw e22;
                                    }
                                } catch (NumberFormatException e222) {
                                    throw e222;
                                }
                            }
                            return 2;
                        } catch (NumberFormatException e2222) {
                            throw e2222;
                        }
                    } catch (NumberFormatException e22222) {
                        throw e22222;
                    }
                } catch (NumberFormatException e222222) {
                    throw e222222;
                }
            } catch (NumberFormatException e2222222) {
                throw e2222222;
            }
        } catch (NumberFormatException e22222222) {
            throw e22222222;
        }
    }

    static void aO() {
        am();
    }

    private static long k(Context context) {
        return context.getSharedPreferences(bb[448], 0).getLong(bb[447], -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(com.whatsapp.protocol.b r11, com.whatsapp.m8 r12) {
        /*
        r10 = 2;
        r9 = 3;
        r8 = 1;
        r3 = az;
        r0 = r11.j;	 Catch:{ IOException -> 0x003d }
        if (r0 != r8) goto L_0x0049;
    L_0x0009:
        r0 = r11.A;	 Catch:{ IOException -> 0x003d }
        if (r0 == 0) goto L_0x0049;
    L_0x000d:
        r0 = r11.A;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r0.file;
        if (r1 == 0) goto L_0x0049;
    L_0x0015:
        r1 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        r2 = r0.file;	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        r2 = r2.getAbsolutePath();	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        r1.<init>(r2);	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        r2 = bb;	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        r4 = 83;
        r2 = r2[r4];	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        r4 = 1;
        r1 = r1.getAttributeInt(r2, r4);	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        if (r1 == r8) goto L_0x0049;
    L_0x002d:
        if (r1 == 0) goto L_0x0049;
    L_0x002f:
        r1 = p;	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        r2 = r12.e;	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        r0 = r0.file;	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        r0 = android.net.Uri.fromFile(r0);	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
        com.whatsapp.util.f.a(r1, r2, r0);	 Catch:{ IOException -> 0x01d7, OutOfMemoryError -> 0x01d4, bx -> 0x003f, SecurityException -> 0x01da }
    L_0x003c:
        return;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = move-exception;
    L_0x0040:
        r1 = bb;
        r2 = 87;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
    L_0x0049:
        r0 = 0;
        r1 = r11.A;	 Catch:{ IOException -> 0x0193 }
        if (r1 == 0) goto L_0x01dd;
    L_0x004e:
        r1 = r11.A;	 Catch:{ IOException -> 0x0193 }
        r1 = r1 instanceof com.whatsapp.MediaData;	 Catch:{ IOException -> 0x0193 }
        if (r1 == 0) goto L_0x01dd;
    L_0x0054:
        r1 = new com.whatsapp.MediaData;
        r0 = r11.A;
        r0 = (com.whatsapp.MediaData) r0;
        r1.<init>(r0);
        r0 = r11.j;	 Catch:{ IOException -> 0x0195 }
        r2 = 5;
        if (r0 != r2) goto L_0x0065;
    L_0x0062:
        r0 = 1;
        r1.transferred = r0;	 Catch:{ IOException -> 0x0195 }
    L_0x0065:
        r1.forward = r8;
    L_0x0067:
        r4 = new com.whatsapp.protocol.b;
        r0 = r12.e;
        r2 = r11.c();
        r4.<init>(r0, r2, r1);
        r6 = a2();	 Catch:{ IOException -> 0x0197 }
        r4.D = r6;	 Catch:{ IOException -> 0x0197 }
        r0 = r11.j;	 Catch:{ IOException -> 0x0197 }
        if (r0 == r10) goto L_0x0084;
    L_0x007c:
        r0 = r11.j;	 Catch:{ IOException -> 0x0197 }
        if (r0 == r8) goto L_0x0084;
    L_0x0080:
        r0 = r11.j;	 Catch:{ IOException -> 0x0199 }
        if (r0 != r9) goto L_0x0089;
    L_0x0084:
        r0 = 1;
        r4.a = r0;	 Catch:{ IOException -> 0x019b }
        if (r3 == 0) goto L_0x008c;
    L_0x0089:
        r0 = 0;
        r4.a = r0;	 Catch:{ IOException -> 0x019d }
    L_0x008c:
        r0 = r11.O;	 Catch:{ IOException -> 0x019f }
        r4.O = r0;	 Catch:{ IOException -> 0x019f }
        r0 = r11.t;	 Catch:{ IOException -> 0x019f }
        r4.t = r0;	 Catch:{ IOException -> 0x019f }
        r0 = r11.j;	 Catch:{ IOException -> 0x019f }
        r4.j = r0;	 Catch:{ IOException -> 0x019f }
        r0 = r11.s;	 Catch:{ IOException -> 0x019f }
        r4.s = r0;	 Catch:{ IOException -> 0x019f }
        r6 = r11.k;	 Catch:{ IOException -> 0x019f }
        r4.k = r6;	 Catch:{ IOException -> 0x019f }
        r0 = r11.H;	 Catch:{ IOException -> 0x019f }
        r4.H = r0;	 Catch:{ IOException -> 0x019f }
        r0 = r11.z;	 Catch:{ IOException -> 0x019f }
        r4.z = r0;	 Catch:{ IOException -> 0x019f }
        r6 = r11.K;	 Catch:{ IOException -> 0x019f }
        r4.K = r6;	 Catch:{ IOException -> 0x019f }
        r6 = r11.G;	 Catch:{ IOException -> 0x019f }
        r4.G = r6;	 Catch:{ IOException -> 0x019f }
        a(r4, r12);	 Catch:{ IOException -> 0x019f }
        r0 = r4.j;	 Catch:{ IOException -> 0x019f }
        if (r0 == r8) goto L_0x00c0;
    L_0x00b7:
        r0 = r4.j;	 Catch:{ IOException -> 0x019f }
        if (r0 == r9) goto L_0x00c0;
    L_0x00bb:
        r0 = r4.j;	 Catch:{ IOException -> 0x01a1 }
        r2 = 5;
        if (r0 != r2) goto L_0x00d8;
    L_0x00c0:
        r0 = r4.O;	 Catch:{ IOException -> 0x01a3 }
        if (r0 != 0) goto L_0x00d8;
    L_0x00c4:
        r0 = r4.f();	 Catch:{ IOException -> 0x01a5 }
        if (r0 == 0) goto L_0x00d6;
    L_0x00ca:
        r0 = r4.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x01a7, StringIndexOutOfBoundsException -> 0x01ce, IllegalArgumentException -> 0x01d1 }
        r2 = 0;
        r0 = android.backport.util.Base64.decode(r0, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x01a7, StringIndexOutOfBoundsException -> 0x01ce, IllegalArgumentException -> 0x01d1 }
        r4.b(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x01a7, StringIndexOutOfBoundsException -> 0x01ce, IllegalArgumentException -> 0x01d1 }
    L_0x00d6:
        r4.O = r8;
    L_0x00d8:
        r0 = r11.j;	 Catch:{ IOException -> 0x01ba }
        if (r0 == r10) goto L_0x00e4;
    L_0x00dc:
        r0 = r11.j;	 Catch:{ IOException -> 0x01bc }
        if (r0 == r8) goto L_0x00e4;
    L_0x00e0:
        r0 = r11.j;	 Catch:{ IOException -> 0x01be }
        if (r0 != r9) goto L_0x018a;
    L_0x00e4:
        if (r1 != 0) goto L_0x0100;
    L_0x00e6:
        r0 = bb;	 Catch:{ IOException -> 0x01c2 }
        r2 = 85;
        r0 = r0[r2];	 Catch:{ IOException -> 0x01c2 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x01c2 }
        r0 = p;	 Catch:{ IOException -> 0x01c2 }
        r2 = p;	 Catch:{ IOException -> 0x01c2 }
        r5 = 2131624532; // 0x7f0e0254 float:1.8876246E38 double:1.053162451E-314;
        r2 = r2.getString(r5);	 Catch:{ IOException -> 0x01c2 }
        r5 = 1;
        b(r0, r2, r5);	 Catch:{ IOException -> 0x01c2 }
        if (r3 == 0) goto L_0x003c;
    L_0x0100:
        r0 = r1.file;	 Catch:{ IOException -> 0x01c4 }
        if (r0 != 0) goto L_0x011e;
    L_0x0104:
        r0 = bb;	 Catch:{ IOException -> 0x01c6 }
        r2 = 89;
        r0 = r0[r2];	 Catch:{ IOException -> 0x01c6 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x01c6 }
        r0 = p;	 Catch:{ IOException -> 0x01c6 }
        r2 = p;	 Catch:{ IOException -> 0x01c6 }
        r5 = 2131624532; // 0x7f0e0254 float:1.8876246E38 double:1.053162451E-314;
        r2 = r2.getString(r5);	 Catch:{ IOException -> 0x01c6 }
        r5 = 1;
        b(r0, r2, r5);	 Catch:{ IOException -> 0x01c6 }
        if (r3 == 0) goto L_0x003c;
    L_0x011e:
        r6 = r1.fileSize;	 Catch:{ IOException -> 0x01c8 }
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x0173;
    L_0x0126:
        r6 = r1.fileSize;	 Catch:{ IOException -> 0x01ca }
        r0 = r1.file;	 Catch:{ IOException -> 0x01ca }
        r8 = r0.length();	 Catch:{ IOException -> 0x01ca }
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x0173;
    L_0x0132:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01cc }
        r0.<init>();	 Catch:{ IOException -> 0x01cc }
        r2 = bb;	 Catch:{ IOException -> 0x01cc }
        r5 = 84;
        r2 = r2[r5];	 Catch:{ IOException -> 0x01cc }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x01cc }
        r6 = r1.fileSize;	 Catch:{ IOException -> 0x01cc }
        r0 = r0.append(r6);	 Catch:{ IOException -> 0x01cc }
        r2 = bb;	 Catch:{ IOException -> 0x01cc }
        r5 = 88;
        r2 = r2[r5];	 Catch:{ IOException -> 0x01cc }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x01cc }
        r2 = r1.file;	 Catch:{ IOException -> 0x01cc }
        r6 = r2.length();	 Catch:{ IOException -> 0x01cc }
        r0 = r0.append(r6);	 Catch:{ IOException -> 0x01cc }
        r0 = r0.toString();	 Catch:{ IOException -> 0x01cc }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x01cc }
        r0 = p;	 Catch:{ IOException -> 0x01cc }
        r2 = p;	 Catch:{ IOException -> 0x01cc }
        r5 = 2131624532; // 0x7f0e0254 float:1.8876246E38 double:1.053162451E-314;
        r2 = r2.getString(r5);	 Catch:{ IOException -> 0x01cc }
        r5 = 1;
        b(r0, r2, r5);	 Catch:{ IOException -> 0x01cc }
        if (r3 == 0) goto L_0x003c;
    L_0x0173:
        r0 = aJ;	 Catch:{ IOException -> 0x0191 }
        r2 = 1;
        r0.c(r4, r2);	 Catch:{ IOException -> 0x0191 }
        r0 = new com.whatsapp.avq;	 Catch:{ IOException -> 0x0191 }
        r0.<init>(r4);	 Catch:{ IOException -> 0x0191 }
        r1.uploader = r0;	 Catch:{ IOException -> 0x0191 }
        r0 = 1;
        r1.autodownloadRetryEnabled = r0;	 Catch:{ IOException -> 0x0191 }
        r0 = r1.uploader;	 Catch:{ IOException -> 0x0191 }
        r0.b();	 Catch:{ IOException -> 0x0191 }
        if (r3 == 0) goto L_0x003c;
    L_0x018a:
        r0 = aJ;	 Catch:{ IOException -> 0x0191 }
        r0.f(r4);	 Catch:{ IOException -> 0x0191 }
        goto L_0x003c;
    L_0x0191:
        r0 = move-exception;
        throw r0;
    L_0x0193:
        r0 = move-exception;
        throw r0;
    L_0x0195:
        r0 = move-exception;
        throw r0;
    L_0x0197:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0199 }
    L_0x0199:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x019b }
    L_0x019b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x019d }
    L_0x019d:
        r0 = move-exception;
        throw r0;
    L_0x019f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01a1 }
    L_0x01a1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01a3 }
    L_0x01a3:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01a5 }
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = move-exception;
        r2 = r0;
    L_0x01a9:
        r0 = 0;
        r0 = (byte[]) r0;
        r4.b(r0);
        r0 = bb;
        r5 = 86;
        r0 = r0[r5];
        com.whatsapp.util.Log.b(r0, r2);
        goto L_0x00d6;
    L_0x01ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01bc }
    L_0x01bc:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01be }
    L_0x01be:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01c0 }
    L_0x01c0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01c2 }
    L_0x01c2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01c4 }
    L_0x01c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01c6 }
    L_0x01c6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01c8 }
    L_0x01c8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01ca }
    L_0x01ca:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01cc }
    L_0x01cc:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0191 }
    L_0x01ce:
        r0 = move-exception;
        r2 = r0;
        goto L_0x01a9;
    L_0x01d1:
        r0 = move-exception;
        r2 = r0;
        goto L_0x01a9;
    L_0x01d4:
        r0 = move-exception;
        goto L_0x0040;
    L_0x01d7:
        r0 = move-exception;
        goto L_0x0040;
    L_0x01da:
        r0 = move-exception;
        goto L_0x0040;
    L_0x01dd:
        r1 = r0;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(com.whatsapp.protocol.b, com.whatsapp.m8):void");
    }

    public static boolean b(Me me) {
        return a(me, bb[36]);
    }

    public static boolean c(String str) {
        return at.contains(str);
    }

    static void b(Runnable runnable) {
        E.post(runnable);
    }

    public static String k(String str) {
        Matcher matcher = Pattern.compile(bb[429]).matcher(str);
        if (!matcher.find()) {
            return str;
        }
        String group = matcher.group(1);
        return group + matcher.group(2);
    }

    public static void e(Context context, int i) {
        Editor edit = context.getSharedPreferences(bb[137], 0).edit();
        try {
            edit.putInt(bb[138], i);
            if (!edit.commit()) {
                Log.e(bb[136]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str) {
        c(str, true);
    }

    public static File a(String str, byte b, boolean z) {
        return a(str, b, 0, z);
    }

    public static void a(String str, String str2, String str3, String str4) {
        try {
            if (ac) {
                Log.i(bb[532]);
                l.b(au.b(str, str2, str3, str4));
                try {
                    if (az == 0) {
                        return;
                    }
                }
            }
            Log.e(bb[531]);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private static boolean a(Me me, String str) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(p.openFileOutput(str, 0));
            objectOutputStream.writeObject(me);
            objectOutputStream.close();
            return true;
        } catch (Throwable e) {
            Log.b(bb[340] + str, e);
            return false;
        } catch (Throwable e2) {
            Log.b(bb[341] + str, e2);
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.lang.String r6, boolean r7, boolean r8) {
        /*
        r1 = new com.whatsapp.util.y;
        r1.<init>();
        r0 = bb;
        r2 = 310; // 0x136 float:4.34E-43 double:1.53E-321;
        r0 = r0[r2];
        r1.a(r0);
        r0 = com.whatsapp.util.Log.h();
        if (r0 == 0) goto L_0x007d;
    L_0x0014:
        r0 = com.whatsapp.util.Log.g();	 Catch:{ Exception -> 0x005a }
        if (r0 == 0) goto L_0x004f;
    L_0x001a:
        r2 = bb;	 Catch:{ Exception -> 0x005a }
        r3 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r2 = r2[r3];	 Catch:{ Exception -> 0x005a }
        r1.b(r2);	 Catch:{ Exception -> 0x005a }
        r2 = new com.whatsapp.va;	 Catch:{ Exception -> 0x005a }
        r3 = new java.net.URL;	 Catch:{ Exception -> 0x005a }
        r4 = com.whatsapp.ce.r;	 Catch:{ Exception -> 0x005a }
        r3.<init>(r4);	 Catch:{ Exception -> 0x005a }
        r4 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r5 = 0;
        r2.<init>(r3, r0, r4, r5);	 Catch:{ Exception -> 0x005a }
        r0 = bb;	 Catch:{ Exception -> 0x0058 }
        r3 = 312; // 0x138 float:4.37E-43 double:1.54E-321;
        r0 = r0[r3];	 Catch:{ Exception -> 0x0058 }
        r2.a(r0, r6);	 Catch:{ Exception -> 0x0058 }
        if (r8 == 0) goto L_0x004c;
    L_0x003d:
        r0 = bb;	 Catch:{ Exception -> 0x0058 }
        r3 = 311; // 0x137 float:4.36E-43 double:1.537E-321;
        r0 = r0[r3];	 Catch:{ Exception -> 0x0058 }
        r3 = bb;	 Catch:{ Exception -> 0x0058 }
        r4 = 308; // 0x134 float:4.32E-43 double:1.52E-321;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0058 }
        r2.a(r0, r3);	 Catch:{ Exception -> 0x0058 }
    L_0x004c:
        r2.b();	 Catch:{ Exception -> 0x005a }
    L_0x004f:
        if (r7 == 0) goto L_0x0054;
    L_0x0051:
        com.whatsapp.util.Log.j();	 Catch:{ Exception -> 0x0089 }
    L_0x0054:
        r1.c();
        return;
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0087 }
        r2.<init>();	 Catch:{ Exception -> 0x0087 }
        r3 = bb;	 Catch:{ Exception -> 0x0087 }
        r4 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0087 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0087 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0087 }
        r0 = r2.append(r0);	 Catch:{ Exception -> 0x0087 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0087 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x0087 }
        r0 = az;	 Catch:{ Exception -> 0x0087 }
        if (r0 == 0) goto L_0x0054;
    L_0x007d:
        r0 = bb;	 Catch:{ Exception -> 0x0087 }
        r2 = 309; // 0x135 float:4.33E-43 double:1.527E-321;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0087 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x0087 }
        goto L_0x0054;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x005a }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.b(java.lang.String, boolean, boolean):void");
    }

    public static void b(Context context, int i) {
        Editor edit = context.getSharedPreferences(bb[180], 0).edit();
        try {
            edit.putInt(bb[181], i);
            if (!edit.commit()) {
                Log.e(bb[182]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void J() {
        ap();
    }

    public static void b(String str, String str2, String str3, byte[][] bArr, int[] iArr) {
        try {
            if (ac) {
                Log.i(bb[290]);
                l.b(au.b(str, str2, str3, bArr, iArr));
                try {
                    if (az == 0) {
                        return;
                    }
                }
            }
            Log.e(bb[289]);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(ho hoVar) {
        try {
            if (h == hoVar) {
                h = null;
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void aC() {
        /*
        r1 = az;
        r0 = y();	 Catch:{ NumberFormatException -> 0x006e }
        if (r0 == 0) goto L_0x0012;
    L_0x0008:
        r0 = y();	 Catch:{ NumberFormatException -> 0x0070 }
        r0 = r0.a();	 Catch:{ NumberFormatException -> 0x0070 }
        if (r0 != 0) goto L_0x006d;
    L_0x0012:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0072 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0072 }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0072 }
        r3 = 498; // 0x1f2 float:6.98E-43 double:2.46E-321;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0072 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0072 }
        r2 = new java.util.Date;	 Catch:{ NumberFormatException -> 0x0072 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0072 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0072 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0072 }
        r2 = " ";
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0072 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0072 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0072 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0072 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0072 }
        r0 = G;	 Catch:{ NumberFormatException -> 0x0072 }
        r2 = 2;
        if (r0 != r2) goto L_0x0053;
    L_0x0048:
        r0 = ag();	 Catch:{ NumberFormatException -> 0x0072 }
        if (r0 == 0) goto L_0x0053;
    L_0x004e:
        r0 = 2131624927; // 0x7f0e03df float:1.8877048E38 double:1.0531626462E-314;
        if (r1 == 0) goto L_0x005f;
    L_0x0053:
        r0 = G;	 Catch:{ NumberFormatException -> 0x0074 }
        if (r0 != 0) goto L_0x005c;
    L_0x0057:
        r0 = 2131624929; // 0x7f0e03e1 float:1.8877052E38 double:1.053162647E-314;
        if (r1 == 0) goto L_0x005f;
    L_0x005c:
        r0 = 2131624926; // 0x7f0e03de float:1.8877045E38 double:1.053162646E-314;
    L_0x005f:
        r1 = p;
        r2 = p;
        r0 = r2.getString(r0);
        com.whatsapp.util.aq.a(r1, r0);
        r0 = 1;
        q = r0;
    L_0x006d:
        return;
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.aC():void");
    }

    public static void a(cn cnVar) {
        try {
            if (ac) {
                Log.i(bb[33] + cnVar);
                l.b(au.a(cnVar));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, String str2, boolean z) {
        try {
            if (ac) {
                l.b(au.a(str, str2, z));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void l(Context context) {
        try {
            if (an != null) {
                Log.i(bb[116]);
                context.bindService(new Intent(context, MessageService.class), a4, 1);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static boolean aZ() {
        try {
            return aq < System.currentTimeMillis();
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean al() {
        return aL;
    }

    public static void b(Context context, String str) {
        Editor edit = context.getSharedPreferences(bb[100], 0).edit();
        try {
            edit.putString(bb[101], str);
            if (!edit.commit()) {
                Log.e(bb[99]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void y(java.lang.String r8) {
        /*
        r2 = az;
        if (r8 != 0) goto L_0x0045;
    L_0x0004:
        r3 = 1;
    L_0x0005:
        r4 = new android.os.ConditionVariable;
        r4.<init>();
        r5 = new android.os.ConditionVariable;
        r5.<init>();
        r1 = new java.util.HashMap;
        r1.<init>();
        r0 = com.whatsapp.v.b();
        r6 = r0.iterator();
    L_0x001c:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0033;
    L_0x0022:
        r0 = r6.next();
        r0 = (java.lang.String) r0;
        r7 = aJ;
        r7 = r7.B(r0);
        r1.put(r0, r7);
        if (r2 == 0) goto L_0x001c;
    L_0x0033:
        r0 = new com.whatsapp.a3r;	 Catch:{ Exception -> 0x0047 }
        r0.<init>(r1, r3, r4, r5);	 Catch:{ Exception -> 0x0047 }
        com.whatsapp.util.br.a(r0);	 Catch:{ Exception -> 0x0047 }
    L_0x003b:
        r0 = new com.whatsapp.go;	 Catch:{ Exception -> 0x0078 }
        r2 = r8;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x0078 }
        com.whatsapp.util.br.a(r0);	 Catch:{ Exception -> 0x0078 }
    L_0x0044:
        return;
    L_0x0045:
        r3 = 0;
        goto L_0x0005;
    L_0x0047:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = bb;
        r7 = 414; // 0x19e float:5.8E-43 double:2.045E-321;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r2 = r2.append(r3);
        r6 = bb;
        r7 = 415; // 0x19f float:5.82E-43 double:2.05E-321;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r0 = r0.toString();
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r5.open();
        goto L_0x003b;
    L_0x0078:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r5 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        r2 = r2[r5];
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r2 = bb;
        r3 = 417; // 0x1a1 float:5.84E-43 double:2.06E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r4.open();
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.y(java.lang.String):void");
    }

    public static void l(String str) {
        b(new a3l(P.a(str)));
    }

    private void a3() {
        registerReceiver(new BroadcastReceiver() {
            private static final String[] z;
            final App a;

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
                r2 = "o]QA;oNJ\t+aXO\ntjLU\u000fvkC@\f5kI\u0001";
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
                r0 = "mBL@>aBF\u0002< ]S\u0001:k^R@>o]Q\u001d";
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
                r2 = 89;
            L_0x0038:
                r2 = r2 ^ r9;
                r2 = (char) r2;
                r6[r8] = r2;
                r2 = r8 + 1;
                r8 = r2;
                goto L_0x0012;
            L_0x0040:
                r2 = 14;
                goto L_0x0038;
            L_0x0043:
                r2 = 45;
                goto L_0x0038;
            L_0x0046:
                r2 = 33;
                goto L_0x0038;
            L_0x0049:
                r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
                goto L_0x0038;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.AnonymousClass_23.<clinit>():void");
            }

            public void onReceive(Context context, Intent intent) {
                boolean backgroundDataSetting = ah.getBackgroundDataSetting();
                Log.i(z[0] + backgroundDataSetting);
                if (!backgroundDataSetting) {
                    App.c(context, true);
                    App.s(context);
                }
                App.B(z[1]);
            }

            {
                this.a = r1;
            }
        }, new IntentFilter(bb[509]));
        DeviceInfoAlarmBroadcastReceiver deviceInfoAlarmBroadcastReceiver = new DeviceInfoAlarmBroadcastReceiver();
        deviceInfoAlarmBroadcastReceiver.a((Context) this);
        deviceInfoAlarmBroadcastReceiver.b(this);
        LogRotationBroadcastReceiver logRotationBroadcastReceiver = new LogRotationBroadcastReceiver();
        logRotationBroadcastReceiver.a(this);
        logRotationBroadcastReceiver.b(this);
        new DbBackupAlarmBroadcastReceiver(this).a((Context) this);
        new HeadsetPlugBroadcastReceiver().a(this);
        new ShutdownBroadcastReceiver().a(this);
        this.aP.c(this);
        this.aP.a(this);
        registerReceiver(new BroadcastReceiver() {
            private static final String[] z;
            final App a;

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
                r2 = "7H\u0014k\u0006?V\u00030\u001f;]\u000b1\u0002y]\u001c4\u001f$]\u0000k\u0005=Q\u0014";
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
                r0 = "7H\u0014k\u0006?V\u00030\u001f;]\u000b1\u0002y]\u001c4\u001f$]\u0000";
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
                r2 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
            L_0x0038:
                r2 = r2 ^ r9;
                r2 = (char) r2;
                r6[r8] = r2;
                r2 = r8 + 1;
                r8 = r2;
                goto L_0x0012;
            L_0x0040:
                r2 = 86;
                goto L_0x0038;
            L_0x0043:
                r2 = 56;
                goto L_0x0038;
            L_0x0046:
                r2 = 100;
                goto L_0x0038;
            L_0x0049:
                r2 = 68;
                goto L_0x0038;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.AnonymousClass_24.<clinit>():void");
            }

            {
                this.a = r1;
            }

            public void onReceive(Context context, Intent intent) {
                Log.i(z[1]);
                if (App.Q() == null) {
                    Log.i(z[0]);
                    if (az == 0) {
                        return;
                    }
                }
                App.Q().t();
            }
        }, new IntentFilter(bb[514]), bb[510], null);
        registerReceiver(new BroadcastReceiver() {
            private static final String[] z;
            final App a;

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
                r2 = "z\ttO\u0004~\u001em\u0013\u0002i\u0018p\t\u0019u\u000ba\u0014\u0004bVr\u0005\u0004r\u001fm\u0005\u0012";
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
                r0 = "z\ttO\u0004~\u001em\u0013\u0002i\u0018p\t\u0019u\u000ba\u0014\u0004bVp\t\u001b~\u0016q\u0014";
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
                    case 3: goto L_0x0048;
                    default: goto L_0x0036;
                };
            L_0x0036:
                r2 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
            L_0x0038:
                r2 = r2 ^ r9;
                r2 = (char) r2;
                r6[r8] = r2;
                r2 = r8 + 1;
                r8 = r2;
                goto L_0x0012;
            L_0x0040:
                r2 = 27;
                goto L_0x0038;
            L_0x0043:
                r2 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
                goto L_0x0038;
            L_0x0046:
                r2 = 4;
                goto L_0x0038;
            L_0x0048:
                r2 = 96;
                goto L_0x0038;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.AnonymousClass_25.<clinit>():void");
            }

            public void onReceive(Context context, Intent intent) {
                Log.i(z[1]);
                if (App.e(p) != 3) {
                    long currentTimeMillis = System.currentTimeMillis();
                    CharSequence string = this.a.getString(R.string.verification_retry_headline);
                    CharSequence string2 = this.a.getString(R.string.verification_retry_title);
                    CharSequence string3 = this.a.getString(R.string.verification_retry_message);
                    Notification notification = new Notification(R.drawable.notifybar, string, currentTimeMillis);
                    notification.defaults = 3;
                    notification.flags = 16;
                    Context applicationContext = this.a.getApplicationContext();
                    notification.setLatestEventInfo(applicationContext, string2, string3, PendingIntent.getActivity(applicationContext, 0, new Intent(applicationContext, Main.class), 268435456));
                    NotificationManagerCompat.from(this.a).notify(1, notification);
                    if (az == 0) {
                        return;
                    }
                }
                Log.i(z[0]);
            }

            {
                this.a = r1;
            }
        }, new IntentFilter(bb[508]), bb[512], null);
        registerReceiver(this.B, new IntentFilter(bb[511]), bb[513], null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Z() {
        /*
        r3_this = this;
        r0 = java.util.Locale.getDefault();
        r0 = r0.getLanguage();
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0040 }
        r2 = 53;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0040 }
        r1 = r1.equals(r0);	 Catch:{ NumberFormatException -> 0x0040 }
        if (r1 != 0) goto L_0x0038;
    L_0x0014:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0042 }
        r2 = 50;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0042 }
        r1 = r1.equals(r0);	 Catch:{ NumberFormatException -> 0x0042 }
        if (r1 != 0) goto L_0x0038;
    L_0x0020:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0044 }
        r2 = 52;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = r1.equals(r0);	 Catch:{ NumberFormatException -> 0x0044 }
        if (r1 != 0) goto L_0x0038;
    L_0x002c:
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0046 }
        r2 = 51;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0046 }
        r0 = r1.equals(r0);	 Catch:{ NumberFormatException -> 0x0046 }
        if (r0 == 0) goto L_0x0048;
    L_0x0038:
        r0 = 1;
    L_0x0039:
        ax = r0;
        r0 = ax;
        com.actionbarsherlock.ActionBarSherlock.isRtl = r0;
        return;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = 0;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.Z():void");
    }

    static Handler aD() {
        return aw;
    }

    public static void a(m8 m8Var, String str) {
        com.whatsapp.protocol.b bVar = new com.whatsapp.protocol.b(m8Var.e, str, null);
        bVar.D = a2();
        a(bVar, m8Var);
        aJ.f(bVar);
    }

    public static void a(int i, String str, String str2) {
        try {
            if (ac && str != null) {
                l.b(au.a(i, str, str2));
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void g(boolean z) {
        aZ = z;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Z();
        am1.d();
    }

    public static void a(b6 b6Var) {
        try {
            if (ac) {
                l.b(au.a(b6Var));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.m8 r3) {
        /*
        r0 = ac;	 Catch:{ NumberFormatException -> 0x000d }
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        if (r3 == 0) goto L_0x000c;
    L_0x0006:
        r0 = com.whatsapp.a12.n();	 Catch:{ NumberFormatException -> 0x0011 }
        if (r0 != 0) goto L_0x0013;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r0 = new com.whatsapp.a15;
        r1 = new com.whatsapp.a7;
        r1.<init>(r3);
        r0.<init>(r1);
        r1 = l;
        r2 = r3.e;
        r0 = com.whatsapp.messaging.au.a(r2, r0);
        r1.b(r0);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.m8):void");
    }

    private static void l() {
        a5w.a(new gh(), new Void[0]);
    }

    public static void a(a89 com_whatsapp_a89) {
        try {
            try {
                if (!ac) {
                    return;
                }
                if (aZ()) {
                    Log.w(bb[342]);
                    l.b(au.a(com_whatsapp_a89));
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        try {
            if (ac) {
                Log.i(bb[426]);
                l.b(au.b(bArr, bArr2));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static long f(com.whatsapp.protocol.b bVar) {
        return c(bVar.D);
    }

    static MessageService a(MessageService messageService) {
        l = messageService;
        return messageService;
    }

    static void R() {
        l();
    }

    public static long c(long j) {
        return (System.currentTimeMillis() + j) - a2();
    }

    static List b(List list) {
        return c(list);
    }

    public static boolean o() {
        return p.getSharedPreferences(bb[428], 0).getBoolean(bb[427], true);
    }

    static MessageService Q() {
        return l;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void aj() {
        /*
        r0 = ac;	 Catch:{ NumberFormatException -> 0x001e }
        if (r0 == 0) goto L_0x000e;
    L_0x0004:
        r0 = al;	 Catch:{ NumberFormatException -> 0x0020 }
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        r0 = com.whatsapp.a12.a();	 Catch:{ NumberFormatException -> 0x0022 }
        if (r0 == 0) goto L_0x0018;
    L_0x000e:
        r0 = com.whatsapp.a12.a();	 Catch:{ NumberFormatException -> 0x0024 }
        if (r0 == 0) goto L_0x001d;
    L_0x0014:
        r0 = al;	 Catch:{ NumberFormatException -> 0x0026 }
        if (r0 != 0) goto L_0x001d;
    L_0x0018:
        r0 = l;	 Catch:{ NumberFormatException -> 0x0026 }
        r0.c();	 Catch:{ NumberFormatException -> 0x0026 }
    L_0x001d:
        return;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.aj():void");
    }

    public static void a(alq com_whatsapp_alq) {
        try {
            if (ac) {
                Log.i(bb[82] + com_whatsapp_alq.b + "/" + com_whatsapp_alq.a);
                l.b(au.a(com_whatsapp_alq));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List a(java.util.List r8, java.util.List r9, boolean r10) {
        /*
        r2 = 0;
        r3 = az;
        r4 = r8.iterator();
    L_0x0007:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0068;
    L_0x000d:
        r0 = r4.next();
        r0 = (com.whatsapp.m8) r0;
        r5 = new com.whatsapp.protocol.c5;
        r5.<init>();
        r1 = r0.e;	 Catch:{ NumberFormatException -> 0x0069 }
        r5.b = r1;	 Catch:{ NumberFormatException -> 0x0069 }
        r1 = r0.N;	 Catch:{ NumberFormatException -> 0x0069 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NumberFormatException -> 0x0069 }
        if (r1 == 0) goto L_0x006b;
    L_0x0024:
        r1 = r2;
    L_0x0025:
        r5.s = r1;	 Catch:{ NumberFormatException -> 0x006e }
        r1 = r0.Q;	 Catch:{ NumberFormatException -> 0x006e }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ NumberFormatException -> 0x006e }
        if (r1 != 0) goto L_0x0033;
    L_0x002f:
        r1 = r0.h;	 Catch:{ NumberFormatException -> 0x0070 }
        if (r1 != 0) goto L_0x0072;
    L_0x0033:
        r1 = r2;
    L_0x0034:
        r5.o = r1;	 Catch:{ NumberFormatException -> 0x0075 }
        r1 = r0.q;	 Catch:{ NumberFormatException -> 0x0075 }
        r5.g = r1;	 Catch:{ NumberFormatException -> 0x0075 }
        if (r10 == 0) goto L_0x0045;
    L_0x003c:
        r1 = r5.s;	 Catch:{ NumberFormatException -> 0x0077 }
        if (r1 == 0) goto L_0x0066;
    L_0x0040:
        r9.add(r5);	 Catch:{ NumberFormatException -> 0x0077 }
        if (r3 == 0) goto L_0x0066;
    L_0x0045:
        r1 = r0.e;
        r1 = com.whatsapp.v.b(r1);
        r6 = r0.e;	 Catch:{ NumberFormatException -> 0x0079 }
        r6 = com.whatsapp.m8.d(r6);	 Catch:{ NumberFormatException -> 0x0079 }
        if (r6 != 0) goto L_0x0063;
    L_0x0053:
        r6 = r1.N;	 Catch:{ NumberFormatException -> 0x007b }
        r7 = r0.N;	 Catch:{ NumberFormatException -> 0x007b }
        r6 = android.text.TextUtils.equals(r6, r7);	 Catch:{ NumberFormatException -> 0x007b }
        if (r6 == 0) goto L_0x0063;
    L_0x005d:
        r1 = r1.q;	 Catch:{ NumberFormatException -> 0x007d }
        r0 = r0.q;	 Catch:{ NumberFormatException -> 0x007d }
        if (r1 == r0) goto L_0x0066;
    L_0x0063:
        r9.add(r5);	 Catch:{ NumberFormatException -> 0x007d }
    L_0x0066:
        if (r3 == 0) goto L_0x0007;
    L_0x0068:
        return r9;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r1 = r0.N;
        goto L_0x0025;
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r1 = r0.Q;
        goto L_0x0034;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(java.util.List, java.util.List, boolean):java.util.List");
    }

    public static void a(a5j com_whatsapp_a5j) {
        try {
            if (ac) {
                l.b(au.a(com_whatsapp_a5j));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void m() {
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(bb[128]).setPackage(bb[129]), 536870912);
        if (broadcast != null) {
            ((AlarmManager) getSystemService(bb[130])).cancel(broadcast);
        }
    }

    public static boolean a(Me me) {
        Log.i(bb[58]);
        return a(me, bb[57]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean F() {
        /*
        r0 = 1;
        r1 = 0;
        r3 = az;
        r2 = p;
        r2 = r2.getApplicationContext();
        r2 = android.accounts.AccountManager.get(r2);
        r4 = r2.getAccounts();
        r5 = r4.length;
        r2 = r1;
    L_0x0014:
        if (r2 >= r5) goto L_0x0061;
    L_0x0016:
        r6 = r4[r2];
        r7 = r6.type;	 Catch:{ NumberFormatException -> 0x0055 }
        r8 = bb;	 Catch:{ NumberFormatException -> 0x0055 }
        r9 = 55;
        r8 = r8[r9];	 Catch:{ NumberFormatException -> 0x0055 }
        r7 = r7.equals(r8);	 Catch:{ NumberFormatException -> 0x0055 }
        if (r7 != 0) goto L_0x005d;
    L_0x0026:
        r7 = bb;	 Catch:{ NumberFormatException -> 0x0057 }
        r8 = 56;
        r7 = r7[r8];	 Catch:{ NumberFormatException -> 0x0057 }
        r7 = android.content.ContentResolver.isSyncActive(r6, r7);	 Catch:{ NumberFormatException -> 0x0057 }
        if (r7 == 0) goto L_0x005d;
    L_0x0032:
        r1 = aa;	 Catch:{ NumberFormatException -> 0x0059 }
        if (r1 < r0) goto L_0x0038;
    L_0x0036:
        if (r3 == 0) goto L_0x0054;
    L_0x0038:
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x005b }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x005b }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x005b }
        r3 = 54;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x005b }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x005b }
        r2 = r6.type;	 Catch:{ NumberFormatException -> 0x005b }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x005b }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x005b }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x005b }
    L_0x0054:
        return r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x0014;
    L_0x0061:
        r0 = r1;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.F():boolean");
    }

    static void aG() {
        aj();
    }

    public static void a(anq com_whatsapp_anq) {
        c.remove(com_whatsapp_anq);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.net.Uri r6) {
        /*
        r0 = 0;
        r1 = aQ;	 Catch:{ IOException -> 0x000a }
        r1 = r6.compareTo(r1);	 Catch:{ IOException -> 0x000a }
        if (r1 != 0) goto L_0x000c;
    L_0x0009:
        return;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r1 = bb;	 Catch:{ IOException -> 0x009d }
        r2 = 445; // 0x1bd float:6.24E-43 double:2.2E-321;
        r1 = r1[r2];	 Catch:{ IOException -> 0x009d }
        r2 = r6.getScheme();	 Catch:{ IOException -> 0x009d }
        r1 = r1.equals(r2);	 Catch:{ IOException -> 0x009d }
        if (r1 != 0) goto L_0x002c;
    L_0x001c:
        r1 = r6.toString();	 Catch:{ IOException -> 0x009d }
        r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;	 Catch:{ IOException -> 0x009d }
        r2 = r2.toString();	 Catch:{ IOException -> 0x009d }
        r1 = r1.startsWith(r2);	 Catch:{ IOException -> 0x009d }
        if (r1 == 0) goto L_0x0038;
    L_0x002c:
        r2 = 0;
        r1 = e;	 Catch:{ FileNotFoundException -> 0x00c2, IllegalStateException -> 0x010d }
        r1 = r1.openInputStream(r6);	 Catch:{ FileNotFoundException -> 0x00c2, IllegalStateException -> 0x010d }
        if (r1 == 0) goto L_0x0038;
    L_0x0035:
        r1.close();	 Catch:{ IOException -> 0x00a1, IllegalStateException -> 0x009f }
    L_0x0038:
        r1 = ag;	 Catch:{ IOException -> 0x018f }
        r2 = 99;
        r1.removeMessages(r2);	 Catch:{ IOException -> 0x018f }
        r1 = ag;	 Catch:{ IOException -> 0x018f }
        r2 = 99;
        r4 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r1.sendEmptyMessageDelayed(r2, r4);	 Catch:{ IOException -> 0x018f }
        r1 = V;	 Catch:{ IOException -> 0x018f }
        r1.stop();	 Catch:{ IOException -> 0x018f }
        r1 = com.whatsapp.Conversation.r();	 Catch:{ IOException -> 0x018f }
        if (r1 == 0) goto L_0x005e;
    L_0x0053:
        r1 = com.whatsapp.Conversation.t();	 Catch:{ IOException -> 0x0191 }
        r1 = r1.s();	 Catch:{ IOException -> 0x0191 }
        if (r1 == 0) goto L_0x005e;
    L_0x005d:
        r0 = 1;
    L_0x005e:
        if (r0 != 0) goto L_0x0009;
    L_0x0060:
        r0 = ae;	 Catch:{ IOException -> 0x0193 }
        if (r0 == 0) goto L_0x008c;
    L_0x0064:
        r0 = p;
        r1 = bb;
        r2 = 446; // 0x1be float:6.25E-43 double:2.204E-321;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.media.AudioManager) r0;
        if (r0 == 0) goto L_0x007b;
    L_0x0074:
        r1 = 5;
        r0 = r0.getStreamVolume(r1);	 Catch:{ IOException -> 0x0195 }
        if (r0 <= 0) goto L_0x0088;
    L_0x007b:
        r0 = V;	 Catch:{ IOException -> 0x0195 }
        r1 = p;	 Catch:{ IOException -> 0x0195 }
        r1 = r1.getApplicationContext();	 Catch:{ IOException -> 0x0195 }
        r2 = 0;
        r3 = 3;
        r0.play(r1, r6, r2, r3);	 Catch:{ IOException -> 0x0195 }
    L_0x0088:
        r0 = az;	 Catch:{ IOException -> 0x009b }
        if (r0 == 0) goto L_0x0009;
    L_0x008c:
        r0 = V;	 Catch:{ IOException -> 0x009b }
        r1 = p;	 Catch:{ IOException -> 0x009b }
        r1 = r1.getApplicationContext();	 Catch:{ IOException -> 0x009b }
        r2 = 0;
        r3 = 5;
        r0.play(r1, r6, r2, r3);	 Catch:{ IOException -> 0x009b }
        goto L_0x0009;
    L_0x009b:
        r0 = move-exception;
        throw r0;
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0038;
    L_0x00c2:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0166 }
        r1.<init>();	 Catch:{ all -> 0x0166 }
        r3 = bb;	 Catch:{ all -> 0x0166 }
        r4 = 444; // 0x1bc float:6.22E-43 double:2.194E-321;
        r3 = r3[r4];	 Catch:{ all -> 0x0166 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0166 }
        r3 = r6.toString();	 Catch:{ all -> 0x0166 }
        r1 = r1.append(r3);	 Catch:{ all -> 0x0166 }
        r1 = r1.toString();	 Catch:{ all -> 0x0166 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x0166 }
        r6 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;	 Catch:{ all -> 0x0166 }
        if (r2 == 0) goto L_0x0038;
    L_0x00e5:
        r2.close();	 Catch:{ IOException -> 0x00ea, IllegalStateException -> 0x010b }
        goto L_0x0038;
    L_0x00ea:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0038;
    L_0x010b:
        r0 = move-exception;
        throw r0;
    L_0x010d:
        r1 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0166 }
        r3.<init>();	 Catch:{ all -> 0x0166 }
        r4 = bb;	 Catch:{ all -> 0x0166 }
        r5 = 440; // 0x1b8 float:6.17E-43 double:2.174E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0166 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0166 }
        r4 = r6.toString();	 Catch:{ all -> 0x0166 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0166 }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0166 }
        r1 = r1.toString();	 Catch:{ all -> 0x0166 }
        r1 = r3.append(r1);	 Catch:{ all -> 0x0166 }
        r1 = r1.toString();	 Catch:{ all -> 0x0166 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x0166 }
        r6 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;	 Catch:{ all -> 0x0166 }
        if (r2 == 0) goto L_0x0038;
    L_0x013e:
        r2.close();	 Catch:{ IOException -> 0x0143, IllegalStateException -> 0x0164 }
        goto L_0x0038;
    L_0x0143:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 439; // 0x1b7 float:6.15E-43 double:2.17E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0038;
    L_0x0164:
        r0 = move-exception;
        throw r0;
    L_0x0166:
        r0 = move-exception;
        if (r2 == 0) goto L_0x016c;
    L_0x0169:
        r2.close();	 Catch:{ IOException -> 0x016f, IllegalStateException -> 0x016d }
    L_0x016c:
        throw r0;
    L_0x016d:
        r0 = move-exception;
        throw r0;
    L_0x016f:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r4 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x016c;
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        throw r0;
    L_0x0193:
        r0 = move-exception;
        throw r0;
    L_0x0195:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.net.Uri):void");
    }

    public static void C(String str) {
        d(str, 501);
    }

    static void ak() {
        al = false;
        ap();
    }

    public static long ab() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException e) {
            return 0;
        }
    }

    private void aH() {
        FileChannel fileChannel = null;
        int i = az;
        File[] listFiles = new File(p.getFilesDir(), bb[139]).listFiles();
        int length = listFiles.length;
        int i2 = 0;
        while (i2 < length) {
            File file = listFiles[i2];
            i2++;
            if (i != 0) {
                break;
            }
        }
        if (Environment.getExternalStorageState().equals(bb[140])) {
            int length2 = listFiles.length;
            length = 0;
            WritableByteChannel writableByteChannel = null;
            while (length < length2) {
                File file2 = listFiles[length];
                try {
                    if (!ao.exists()) {
                        ao.mkdirs();
                    }
                    try {
                        writableByteChannel = Channels.newChannel(new com.whatsapp.util.al(aB, new File(ao, file2.getName())));
                        fileChannel = new FileInputStream(file2).getChannel();
                        at.a(fileChannel, writableByteChannel);
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        if (writableByteChannel != null) {
                            writableByteChannel.close();
                        }
                    } catch (IOException e) {
                        throw e;
                    } catch (IOException e2) {
                        throw e2;
                    } catch (IOException e22) {
                        throw e22;
                    } catch (IOException e222) {
                        Log.w(bb[141] + e222.toString());
                    } catch (Throwable th) {
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        if (writableByteChannel != null) {
                            writableByteChannel.close();
                        }
                    }
                    int i3 = length + 1;
                    if (i == 0) {
                        length = i3;
                    } else {
                        return;
                    }
                } catch (IOException e2222) {
                    throw e2222;
                }
            }
        }
    }

    public static void b(Context context, boolean z) {
        Editor edit = context.getSharedPreferences(bb[8], 0).edit();
        try {
            edit.putBoolean(bb[9], z);
            if (!edit.commit()) {
                Log.e(bb[10]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.c3 r9) {
        /*
        r8_this = this;
        r6 = 0;
        r2 = 1;
        r0 = az;
        r1 = r9.b;	 Catch:{ NumberFormatException -> 0x007f }
        if (r1 != 0) goto L_0x0011;
    L_0x0008:
        r1 = 1;
        e(r1);	 Catch:{ NumberFormatException -> 0x0081 }
        am();	 Catch:{ NumberFormatException -> 0x0081 }
        if (r0 == 0) goto L_0x007e;
    L_0x0011:
        r1 = r9.b;	 Catch:{ NumberFormatException -> 0x0083 }
        if (r1 != r2) goto L_0x0024;
    L_0x0015:
        r1 = 1;
        com.whatsapp.ac.g = r1;	 Catch:{ NumberFormatException -> 0x0085 }
        r1 = com.whatsapp.atf.WHATSAPP_INITIATED;	 Catch:{ NumberFormatException -> 0x0085 }
        r2 = r9.d;	 Catch:{ NumberFormatException -> 0x0085 }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r4;
        com.whatsapp.ac.a(r1, r2);	 Catch:{ NumberFormatException -> 0x0085 }
        if (r0 == 0) goto L_0x007e;
    L_0x0024:
        r1 = r9.b;	 Catch:{ NumberFormatException -> 0x0085 }
        r2 = 2;
        if (r1 != r2) goto L_0x0062;
    L_0x0029:
        r1 = new android.content.Intent;
        r2 = p;
        r3 = com.whatsapp.SpamWarningActivity.class;
        r1.<init>(r6, r6, r2, r3);
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r1.setFlags(r2);	 Catch:{ NumberFormatException -> 0x0087 }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0087 }
        r3 = 387; // 0x183 float:5.42E-43 double:1.91E-321;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0087 }
        r3 = r9.g;	 Catch:{ NumberFormatException -> 0x0087 }
        r1.putExtra(r2, r3);	 Catch:{ NumberFormatException -> 0x0087 }
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0087 }
        r3 = 388; // 0x184 float:5.44E-43 double:1.917E-321;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0087 }
        r3 = r9.e;	 Catch:{ NumberFormatException -> 0x0087 }
        r1.putExtra(r2, r3);	 Catch:{ NumberFormatException -> 0x0087 }
        r2 = 1;
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0087 }
        r3 = r9.e;	 Catch:{ NumberFormatException -> 0x0087 }
        r3 = r3 * 1000;
        r6 = (long) r3;	 Catch:{ NumberFormatException -> 0x0087 }
        r4 = r4 + r6;
        a(r8, r2, r4);	 Catch:{ NumberFormatException -> 0x0087 }
        r2 = p;	 Catch:{ NumberFormatException -> 0x0087 }
        r2.startActivity(r1);	 Catch:{ NumberFormatException -> 0x0087 }
        if (r0 == 0) goto L_0x007e;
    L_0x0062:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0087 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0087 }
        r1 = bb;	 Catch:{ NumberFormatException -> 0x0087 }
        r2 = 389; // 0x185 float:5.45E-43 double:1.92E-321;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0087 }
        r1 = r9.b;	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0087 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0087 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0087 }
    L_0x007e:
        return;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;
    L_0x0087:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(com.whatsapp.protocol.c3):void");
    }

    public static void c(Context context, int i) {
        Editor edit = context.getSharedPreferences(bb[3], 0).edit();
        try {
            edit.putInt(bb[5], i);
            if (!edit.commit()) {
                Log.e(bb[4]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static boolean E(String str) {
        try {
            if (!bd.b(str)) {
                if (!o()) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void c(boolean z) {
        try {
            int i;
            aJ.a(z);
            if (z) {
                i = 3;
            } else {
                i = 4;
            }
            a(i, null);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(com.whatsapp.protocol.b r10) {
        /*
        r8 = 0;
        r0 = com.whatsapp.avq.a(r10);	 Catch:{ NumberFormatException -> 0x0012 }
        if (r0 == 0) goto L_0x0014;
    L_0x0008:
        r0 = bb;	 Catch:{ NumberFormatException -> 0x0012 }
        r1 = 49;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0012 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x0012 }
    L_0x0011:
        return;
    L_0x0012:
        r0 = move-exception;
        throw r0;
    L_0x0014:
        r0 = r10.A;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r0.autodownloadRetryEnabled;	 Catch:{ NumberFormatException -> 0x0067 }
        if (r1 != 0) goto L_0x0026;
    L_0x001c:
        r1 = 1;
        r0.autodownloadRetryEnabled = r1;	 Catch:{ NumberFormatException -> 0x0067 }
        r1 = aJ;	 Catch:{ NumberFormatException -> 0x0067 }
        r2 = 1;
        r3 = -1;
        r1.a(r10, r2, r3);	 Catch:{ NumberFormatException -> 0x0067 }
    L_0x0026:
        r1 = r10.j;	 Catch:{ NumberFormatException -> 0x0069 }
        r2 = 3;
        if (r1 != r2) goto L_0x0053;
    L_0x002b:
        r1 = r0.transcoded;	 Catch:{ NumberFormatException -> 0x006b }
        if (r1 != 0) goto L_0x0053;
    L_0x002f:
        r2 = r10.k;	 Catch:{ NumberFormatException -> 0x006d }
        r1 = com.whatsapp.ge.k;	 Catch:{ NumberFormatException -> 0x006d }
        r4 = (long) r1;
        r6 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r4 = r4 * r6;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 > 0) goto L_0x0048;
    L_0x003c:
        r2 = r0.trimFrom;	 Catch:{ NumberFormatException -> 0x006f }
        r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r1 > 0) goto L_0x0048;
    L_0x0042:
        r2 = r0.trimTo;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x0053;
    L_0x0048:
        r1 = com.whatsapp.j_.a();	 Catch:{ NumberFormatException -> 0x0065 }
        r1.a(r10);	 Catch:{ NumberFormatException -> 0x0065 }
        r1 = az;	 Catch:{ NumberFormatException -> 0x0065 }
        if (r1 == 0) goto L_0x0011;
    L_0x0053:
        r1 = new com.whatsapp.avq;	 Catch:{ NumberFormatException -> 0x0065 }
        r1.<init>(r10);	 Catch:{ NumberFormatException -> 0x0065 }
        r0.uploader = r1;	 Catch:{ NumberFormatException -> 0x0065 }
        r1 = r0.uploader;	 Catch:{ NumberFormatException -> 0x0065 }
        r1.c();	 Catch:{ NumberFormatException -> 0x0065 }
        r0 = r0.uploader;	 Catch:{ NumberFormatException -> 0x0065 }
        r0.b();	 Catch:{ NumberFormatException -> 0x0065 }
        goto L_0x0011;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0065 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.e(com.whatsapp.protocol.b):void");
    }

    public static boolean j(Context context) {
        try {
            try {
                if (VERSION.SDK_INT < 17) {
                    return System.getInt(context.getContentResolver(), bb[322], 0) != 0;
                } else {
                    try {
                        return Global.getInt(context.getContentResolver(), bb[321], 0) != 0;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public void a() {
        aG = true;
        aV++;
        a4();
        O = false;
        L = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a4() {
        /*
        r8 = 0;
        r0 = -1;
        r5 = 0;
        r2 = az;
        r3 = a1;	 Catch:{ NumberFormatException -> 0x007a }
        if (r3 == 0) goto L_0x001e;
    L_0x000b:
        r3 = bb;	 Catch:{ NumberFormatException -> 0x007c }
        r4 = 38;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x007c }
        v(r3);	 Catch:{ NumberFormatException -> 0x007c }
        r3 = p;	 Catch:{ NumberFormatException -> 0x007c }
        r4 = 0;
        r6 = 0;
        a(r3, r4, r6);	 Catch:{ NumberFormatException -> 0x007c }
        if (r2 == 0) goto L_0x0079;
    L_0x001e:
        r3 = aG;	 Catch:{ NumberFormatException -> 0x007e }
        if (r3 == 0) goto L_0x0031;
    L_0x0022:
        r3 = bb;	 Catch:{ NumberFormatException -> 0x0080 }
        r4 = 41;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0080 }
        v(r3);	 Catch:{ NumberFormatException -> 0x0080 }
        r3 = 1;
        com.whatsapp.SpamWarningActivity.a(r3);	 Catch:{ NumberFormatException -> 0x0080 }
        if (r2 == 0) goto L_0x0079;
    L_0x0031:
        r2 = bb;	 Catch:{ NumberFormatException -> 0x0080 }
        r3 = 40;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0080 }
        v(r2);	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = 0;
        com.whatsapp.SpamWarningActivity.a(r2);	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = p;	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = m(r2);	 Catch:{ NumberFormatException -> 0x0080 }
        if (r2 == 0) goto L_0x0079;
    L_0x0046:
        r4 = new android.content.Intent;
        r2 = p;
        r3 = com.whatsapp.SpamWarningActivity.class;
        r4.<init>(r5, r5, r2, r3);
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r4.setFlags(r2);
        r2 = p;
        r2 = k(r2);
        r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r5 == 0) goto L_0x0066;
    L_0x005e:
        r6 = java.lang.System.currentTimeMillis();
        r2 = r2 - r6;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 / r6;
    L_0x0066:
        r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r5 > 0) goto L_0x0082;
    L_0x006a:
        r2 = bb;
        r3 = 39;
        r2 = r2[r3];
        r0 = (int) r0;
        r4.putExtra(r2, r0);
        r0 = p;
        r0.startActivity(r4);
    L_0x0079:
        return;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = r2;
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a4():void");
    }

    public static and z(String str) {
        and j = a12.j(str);
        if (j == null) {
            return null;
        }
        try {
            if (a12.n()) {
                a(false);
            }
            String a = a12.a(j.c, j.b);
            if (a == null) {
                return null;
            }
            try {
                a(j.a, j.e, j.d, a, 0);
                return j;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static String a(Context context) {
        return context.getSharedPreferences(bb[119], 0).getString(bb[120], null);
    }

    public static void b(Context context, int i, int i2) {
        Toast makeText = Toast.makeText(context.getApplicationContext(), context.getString(i), i2);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public void onLowMemory() {
        Log.w(bb[175]);
        super.onLowMemory();
    }

    public static boolean as() {
        try {
            return !ax;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void a(s4 s4Var) {
        try {
            if (!aO.contains(s4Var)) {
                aO.add(s4Var);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r4, boolean r5, boolean r6, boolean r7) {
        /*
        r0 = an;	 Catch:{ Exception -> 0x008e }
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        r0 = an;	 Catch:{ Exception -> 0x008e }
        r0 = r0.jabber_id;	 Catch:{ Exception -> 0x008e }
        r1 = az;	 Catch:{ Exception -> 0x008e }
        if (r1 == 0) goto L_0x0083;
    L_0x000c:
        r0 = bb;	 Catch:{ Exception -> 0x008e }
        r1 = 74;
        r0 = r0[r1];	 Catch:{ Exception -> 0x008e }
        r1 = 0;
        r0 = r4.getSharedPreferences(r0, r1);	 Catch:{ Exception -> 0x008e }
        r1 = bb;	 Catch:{ Exception -> 0x008e }
        r2 = 75;
        r1 = r1[r2];	 Catch:{ Exception -> 0x008e }
        r2 = bb;	 Catch:{ Exception -> 0x008e }
        r3 = 81;
        r2 = r2[r3];	 Catch:{ Exception -> 0x008e }
        r0 = r0.getString(r1, r2);	 Catch:{ Exception -> 0x008e }
        r0 = r0.toLowerCase();	 Catch:{ Exception -> 0x008e }
        r1 = bb;	 Catch:{ Exception -> 0x008e }
        r2 = 76;
        r1 = r1[r2];	 Catch:{ Exception -> 0x008e }
        r2 = "-";
        r0 = r0.replaceAll(r1, r2);	 Catch:{ Exception -> 0x008e }
        r1 = bb;	 Catch:{ Exception -> 0x008e }
        r2 = 79;
        r1 = r1[r2];	 Catch:{ Exception -> 0x008e }
        r1 = r0.equals(r1);	 Catch:{ Exception -> 0x008e }
        if (r1 == 0) goto L_0x0083;
    L_0x0043:
        r0 = e;	 Catch:{ Exception -> 0x008e }
        r1 = bb;	 Catch:{ Exception -> 0x008e }
        r2 = 80;
        r1 = r1[r2];	 Catch:{ Exception -> 0x008e }
        r0 = android.provider.Settings.Secure.getString(r0, r1);	 Catch:{ Exception -> 0x008e }
        if (r0 == 0) goto L_0x0058;
    L_0x0051:
        r1 = r0.length();	 Catch:{ Exception -> 0x008c }
        r2 = 6;
        if (r1 >= r2) goto L_0x005e;
    L_0x0058:
        r0 = bb;	 Catch:{ Exception -> 0x008e }
        r1 = 77;
        r0 = r0[r1];	 Catch:{ Exception -> 0x008e }
    L_0x005e:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008e }
        r1.<init>();	 Catch:{ Exception -> 0x008e }
        r2 = bb;	 Catch:{ Exception -> 0x008e }
        r3 = 78;
        r2 = r2[r3];	 Catch:{ Exception -> 0x008e }
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x008e }
        r2 = r0.length();	 Catch:{ Exception -> 0x008e }
        r2 = r2 + -6;
        r3 = r0.length();	 Catch:{ Exception -> 0x008e }
        r0 = r0.substring(r2, r3);	 Catch:{ Exception -> 0x008e }
        r0 = r1.append(r0);	 Catch:{ Exception -> 0x008e }
        r0 = r0.toString();	 Catch:{ Exception -> 0x008e }
    L_0x0083:
        r1 = new com.whatsapp.up;	 Catch:{ Exception -> 0x008e }
        r1.<init>(r7, r0, r5, r6);	 Catch:{ Exception -> 0x008e }
        com.whatsapp.util.br.a(r1);	 Catch:{ Exception -> 0x008e }
    L_0x008b:
        return;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        r1 = bb;
        r2 = 73;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x008b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.a(android.content.Context, boolean, boolean, boolean):void");
    }

    public static void i(Context context) {
        d(context, 0);
        an = null;
        context.startActivity(new Intent(context, EULA.class));
    }

    static void aL() {
        s();
    }

    public static void c(Context context, String str) {
        Log.e(str);
        Toast makeText = Toast.makeText(context.getApplicationContext(), context.getString(R.string.error_unexpected), 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public static void a(String str, List list, int i) {
        a(str, list, i, false);
    }

    void c(Runnable runnable) {
        try {
            if (!a5) {
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    throw new AssertionError();
                }
            }
            try {
                if (this.ad == null) {
                    this.ad = new Handler(this.aS.getLooper());
                }
                this.ad.post(runnable);
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    static void B(String str) {
        int i = az;
        try {
            List<RunningAppProcessInfo> runningAppProcesses = w.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    try {
                        if (TextUtils.equals(runningAppProcessInfo.processName, str)) {
                            Log.i(bb[330] + runningAppProcessInfo.processName + " " + runningAppProcessInfo.pid);
                            if (i == 0) {
                                return;
                            }
                        }
                        if (i != 0) {
                            return;
                        }
                    } catch (Exception e) {
                        throw e;
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
        } catch (Exception e22) {
            Log.w(bb[331] + e22.toString());
        }
    }

    public static boolean n(Context context) {
        return context.getSharedPreferences(bb[424], 0).getBoolean(bb[425], false);
    }

    public static void a(String str, String str2, String str3, byte[][] bArr, int[] iArr) {
        try {
            if (ac) {
                Log.i(bb[392]);
                l.b(au.a(str, str2, str3, bArr, iArr));
                try {
                    if (az == 0) {
                        return;
                    }
                }
            }
            Log.e(bb[393]);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(boolean z, boolean z2) {
        a(z, z2, q, false);
    }

    public static boolean a(String str, cs csVar, cd cdVar, t tVar) {
        return a(str, csVar, cdVar, tVar, null);
    }

    public static void f(Context context, String str) {
        Editor edit = context.getSharedPreferences(bb[0], 0).edit();
        try {
            edit.putString(bb[2], str);
            if (!edit.commit()) {
                Log.e(bb[1]);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static long a2() {
        try {
            return av != 0 ? av + (SystemClock.elapsedRealtime() - m) : System.currentTimeMillis() - ai;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void b(String[] strArr) {
        try {
            if (strArr != null) {
                if (strArr.length != 0) {
                    try {
                        if (ac) {
                            l.b(au.d(strArr));
                            return;
                        }
                        return;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            Log.w(bb[90]);
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(String str, Collection collection, boolean z) {
        aJ.a(collection, z);
    }

    public static void q(String str) {
        int i = az;
        Iterator it = c.iterator();
        while (it.hasNext()) {
            ((anq) it.next()).a(str);
            if (i != 0) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(com.whatsapp.protocol.b r2) {
        /*
        r0 = r2.b();	 Catch:{ NumberFormatException -> 0x0029 }
        if (r0 != 0) goto L_0x0019;
    L_0x0006:
        r0 = r2.a;	 Catch:{ NumberFormatException -> 0x002b }
        r1 = 13;
        if (r0 != r1) goto L_0x0019;
    L_0x000c:
        r0 = o(r2);	 Catch:{ NumberFormatException -> 0x002d }
        if (r0 == 0) goto L_0x0019;
    L_0x0012:
        com.whatsapp.av4.a(r2);	 Catch:{ NumberFormatException -> 0x002f }
        r0 = az;	 Catch:{ NumberFormatException -> 0x002f }
        if (r0 == 0) goto L_0x0028;
    L_0x0019:
        r0 = r2.b();	 Catch:{ NumberFormatException -> 0x0031 }
        if (r0 != 0) goto L_0x0028;
    L_0x001f:
        r0 = l;	 Catch:{ NumberFormatException -> 0x0031 }
        r1 = com.whatsapp.messaging.au.a(r2);	 Catch:{ NumberFormatException -> 0x0031 }
        r0.b(r1);	 Catch:{ NumberFormatException -> 0x0031 }
    L_0x0028:
        return;
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.h(com.whatsapp.protocol.b):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
        r11_this = this;
        r3 = az;
        r4 = java.lang.System.currentTimeMillis();
        super.onCreate();	 Catch:{ IOException -> 0x0017 }
        r0 = p;	 Catch:{ IOException -> 0x0017 }
        if (r0 == 0) goto L_0x0019;
    L_0x000d:
        r0 = bb;	 Catch:{ IOException -> 0x0017 }
        r1 = 495; // 0x1ef float:6.94E-43 double:2.446E-321;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0017 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0017 }
    L_0x0016:
        return;
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        p = r11;
        r0 = de.greenrobot.event.g.b();
        r0.a(r11);
        r0 = new com.whatsapp.BatteryReceiver;
        r0.<init>();
        r0.a(r11);
        r0 = new com.whatsapp.ConnectivityReceiver;
        r0.<init>();
        r0.a(r11);
        r0 = new com.whatsapp.ScreenLockReceiver;
        r0.<init>();
        r0.a(r11);
        r0 = bb;
        r1 = 478; // 0x1de float:6.7E-43 double:2.36E-321;
        r0 = r0[r1];
        r0 = r11.getSystemService(r0);
        r0 = (android.os.PowerManager) r0;
        r1 = 1;
        r2 = bb;	 Catch:{ IOException -> 0x02f7 }
        r6 = 467; // 0x1d3 float:6.54E-43 double:2.307E-321;
        r2 = r2[r6];	 Catch:{ IOException -> 0x02f7 }
        r1 = r0.newWakeLock(r1, r2);	 Catch:{ IOException -> 0x02f7 }
        r11.y = r1;	 Catch:{ IOException -> 0x02f7 }
        r1 = r11.y;	 Catch:{ IOException -> 0x02f7 }
        r2 = 0;
        r1.setReferenceCounted(r2);	 Catch:{ IOException -> 0x02f7 }
        r1 = 2131624950; // 0x7f0e03f6 float:1.8877094E38 double:1.0531626576E-314;
        r1 = r11.getString(r1);	 Catch:{ IOException -> 0x02f7 }
        as = r1;	 Catch:{ IOException -> 0x02f7 }
        r1 = r11.getApplicationContext();	 Catch:{ IOException -> 0x02f7 }
        com.whatsapp.util.Log.a(r1);	 Catch:{ IOException -> 0x02f7 }
        com.whatsapp.ak9.a(r11);	 Catch:{ IOException -> 0x02f7 }
        r1 = new java.io.File;	 Catch:{ IOException -> 0x02f7 }
        r2 = r11.getFilesDir();	 Catch:{ IOException -> 0x02f7 }
        r6 = bb;	 Catch:{ IOException -> 0x02f7 }
        r7 = 481; // 0x1e1 float:6.74E-43 double:2.376E-321;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02f7 }
        r1.<init>(r2, r6);	 Catch:{ IOException -> 0x02f7 }
        j = r1;	 Catch:{ IOException -> 0x02f7 }
        r1 = new java.io.File;	 Catch:{ IOException -> 0x02f7 }
        r2 = r11.getFilesDir();	 Catch:{ IOException -> 0x02f7 }
        r6 = bb;	 Catch:{ IOException -> 0x02f7 }
        r7 = 464; // 0x1d0 float:6.5E-43 double:2.29E-321;
        r6 = r6[r7];	 Catch:{ IOException -> 0x02f7 }
        r1.<init>(r2, r6);	 Catch:{ IOException -> 0x02f7 }
        aj = r1;	 Catch:{ IOException -> 0x02f7 }
        com.whatsapp.am1.a(r11);	 Catch:{ IOException -> 0x02f7 }
        r11.Z();	 Catch:{ IOException -> 0x02f7 }
        com.b.c();	 Catch:{ IOException -> 0x02f7 }
        r1 = com.whatsapp.util.WhatsAppLibLoader.a(r11);	 Catch:{ IOException -> 0x02f7 }
        if (r1 == 0) goto L_0x0016;
    L_0x009d:
        r1 = new com.whatsapp.wz;	 Catch:{ IOException -> 0x02f9 }
        r2 = java.lang.Runtime.getRuntime();	 Catch:{ IOException -> 0x02f9 }
        r6 = r2.maxMemory();	 Catch:{ IOException -> 0x02f9 }
        r8 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r6 = r6 / r8;
        r2 = (int) r6;	 Catch:{ IOException -> 0x02f9 }
        r1.<init>(r11, r2);	 Catch:{ IOException -> 0x02f9 }
        R = r1;	 Catch:{ IOException -> 0x02f9 }
        r1 = new com.whatsapp.util.c;	 Catch:{ IOException -> 0x02f9 }
        r2 = new java.io.File;	 Catch:{ IOException -> 0x02f9 }
        r6 = ao;	 Catch:{ IOException -> 0x02f9 }
        r7 = bb;	 Catch:{ IOException -> 0x02f9 }
        r8 = 485; // 0x1e5 float:6.8E-43 double:2.396E-321;
        r7 = r7[r8];	 Catch:{ IOException -> 0x02f9 }
        r2.<init>(r6, r7);	 Catch:{ IOException -> 0x02f9 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x02f9 }
        aB = r1;	 Catch:{ IOException -> 0x02f9 }
        r1 = new com.whatsapp.util.c;	 Catch:{ IOException -> 0x02f9 }
        r2 = new java.io.File;	 Catch:{ IOException -> 0x02f9 }
        r6 = r11.getFilesDir();	 Catch:{ IOException -> 0x02f9 }
        r7 = bb;	 Catch:{ IOException -> 0x02f9 }
        r8 = 483; // 0x1e3 float:6.77E-43 double:2.386E-321;
        r7 = r7[r8];	 Catch:{ IOException -> 0x02f9 }
        r2.<init>(r6, r7);	 Catch:{ IOException -> 0x02f9 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x02f9 }
        r = r1;	 Catch:{ IOException -> 0x02f9 }
        r1 = aa;	 Catch:{ IOException -> 0x02f9 }
        r2 = 2;
        if (r1 != r2) goto L_0x00e7;
    L_0x00df:
        r1 = G;	 Catch:{ IOException -> 0x02f9 }
        r2 = 1;
        if (r1 != r2) goto L_0x00e7;
    L_0x00e4:
        r11.aH();	 Catch:{ IOException -> 0x02fb }
    L_0x00e7:
        r1 = new com.whatsapp.w0;
        r2 = r11.getResources();
        r1.<init>(r2);
        aX = r1;
        r1 = android.os.Environment.getExternalStorageState();
        r2 = bb;	 Catch:{ IOException -> 0x02fd }
        r6 = 457; // 0x1c9 float:6.4E-43 double:2.26E-321;
        r2 = r2[r6];	 Catch:{ IOException -> 0x02fd }
        r2 = r2.equals(r1);	 Catch:{ IOException -> 0x02fd }
        if (r2 == 0) goto L_0x010a;
    L_0x0102:
        r2 = 0;
        aF = r2;	 Catch:{ IOException -> 0x02fd }
        r2 = 0;
        d = r2;	 Catch:{ IOException -> 0x02fd }
        if (r3 == 0) goto L_0x0147;
    L_0x010a:
        r2 = bb;	 Catch:{ IOException -> 0x02ff }
        r6 = 482; // 0x1e2 float:6.75E-43 double:2.38E-321;
        r2 = r2[r6];	 Catch:{ IOException -> 0x02ff }
        r2 = r2.equals(r1);	 Catch:{ IOException -> 0x02ff }
        if (r2 == 0) goto L_0x0127;
    L_0x0116:
        r2 = 0;
        aF = r2;	 Catch:{ IOException -> 0x0301 }
        r2 = 1;
        d = r2;	 Catch:{ IOException -> 0x0301 }
        r2 = bb;	 Catch:{ IOException -> 0x0301 }
        r6 = 463; // 0x1cf float:6.49E-43 double:2.288E-321;
        r2 = r2[r6];	 Catch:{ IOException -> 0x0301 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x0301 }
        if (r3 == 0) goto L_0x0147;
    L_0x0127:
        r2 = 1;
        aF = r2;	 Catch:{ IOException -> 0x0303 }
        r2 = 0;
        d = r2;	 Catch:{ IOException -> 0x0303 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0303 }
        r2.<init>();	 Catch:{ IOException -> 0x0303 }
        r6 = bb;	 Catch:{ IOException -> 0x0303 }
        r7 = 479; // 0x1df float:6.71E-43 double:2.367E-321;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0303 }
        r2 = r2.append(r6);	 Catch:{ IOException -> 0x0303 }
        r1 = r2.append(r1);	 Catch:{ IOException -> 0x0303 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0303 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x0303 }
    L_0x0147:
        r1 = aa;	 Catch:{ IOException -> 0x031f }
        switch(r1) {
            case 0: goto L_0x0305;
            case 1: goto L_0x030b;
            case 2: goto L_0x0311;
            case 3: goto L_0x0317;
            default: goto L_0x014c;
        };
    L_0x014c:
        r1 = 5;
        com.whatsapp.util.Log.a(r1);	 Catch:{ IOException -> 0x0327 }
    L_0x0150:
        r1 = bb;
        r2 = 470; // 0x1d6 float:6.59E-43 double:2.32E-321;
        r1 = r1[r2];
        r2 = 0;
        r6 = r11.getSharedPreferences(r1, r2);
        if (r6 == 0) goto L_0x01d6;
    L_0x015d:
        r1 = bb;
        r2 = 459; // 0x1cb float:6.43E-43 double:2.27E-321;
        r1 = r1[r2];
        r2 = bb;
        r7 = 458; // 0x1ca float:6.42E-43 double:2.263E-321;
        r2 = r2[r7];
        r1 = r6.getString(r1, r2);
        r1 = com.whatsapp.avf.a(r1);
        if (r1 == 0) goto L_0x01c8;
    L_0x0173:
        r2 = bb;
        r7 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r2 = r2[r7];
        r2 = com.whatsapp.avf.a(r2);
        if (r2 == 0) goto L_0x01c8;
    L_0x017f:
        r1 = r2.a(r1);	 Catch:{ IOException -> 0x0329 }
        U = r1;	 Catch:{ IOException -> 0x0329 }
        r1 = U;	 Catch:{ IOException -> 0x0329 }
        if (r1 == 0) goto L_0x01c8;
    L_0x0189:
        com.whatsapp.st.b();
        r1 = r6.edit();
        r2 = bb;	 Catch:{ IOException -> 0x032b }
        r7 = 472; // 0x1d8 float:6.61E-43 double:2.33E-321;
        r2 = r2[r7];	 Catch:{ IOException -> 0x032b }
        r7 = bb;	 Catch:{ IOException -> 0x032b }
        r8 = 454; // 0x1c6 float:6.36E-43 double:2.243E-321;
        r7 = r7[r8];	 Catch:{ IOException -> 0x032b }
        r2 = r1.putString(r2, r7);	 Catch:{ IOException -> 0x032b }
        r2 = r2.commit();	 Catch:{ IOException -> 0x032b }
        if (r2 != 0) goto L_0x01af;
    L_0x01a6:
        r2 = bb;	 Catch:{ IOException -> 0x032b }
        r7 = 453; // 0x1c5 float:6.35E-43 double:2.24E-321;
        r2 = r2[r7];	 Catch:{ IOException -> 0x032b }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x032b }
    L_0x01af:
        r2 = e(r11);
        r7 = 3;
        if (r2 >= r7) goto L_0x01ba;
    L_0x01b6:
        r2 = 0;
        d(r11, r2);	 Catch:{ IOException -> 0x032d }
    L_0x01ba:
        r2 = bb;
        r7 = 490; // 0x1ea float:6.87E-43 double:2.42E-321;
        r2 = r2[r7];
        r7 = 1;
        r1 = r1.putBoolean(r2, r7);
        r1.commit();
    L_0x01c8:
        r1 = bb;
        r2 = 460; // 0x1cc float:6.45E-43 double:2.273E-321;
        r1 = r1[r2];
        r8 = ai;
        r8 = r6.getLong(r1, r8);
        ai = r8;
    L_0x01d6:
        r1 = j;	 Catch:{ IOException -> 0x032f }
        r1 = r1.exists();	 Catch:{ IOException -> 0x032f }
        if (r1 == 0) goto L_0x01ea;
    L_0x01de:
        r1 = U;	 Catch:{ IOException -> 0x032f }
        if (r1 != 0) goto L_0x0333;
    L_0x01e2:
        r1 = 1;
    L_0x01e3:
        A = r1;
        r1 = j;
        r1.delete();
    L_0x01ea:
        r1 = aj;	 Catch:{ IOException -> 0x0336 }
        r1 = r1.exists();	 Catch:{ IOException -> 0x0336 }
        if (r1 == 0) goto L_0x0246;
    L_0x01f2:
        r1 = A;	 Catch:{ IOException -> 0x0336 }
        if (r1 != 0) goto L_0x0241;
    L_0x01f6:
        r1 = U;	 Catch:{ IOException -> 0x0338 }
        if (r1 != 0) goto L_0x0241;
    L_0x01fa:
        r1 = 1;
        A = r1;
        r2 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x033a }
        r1 = new java.io.FileReader;	 Catch:{ IOException -> 0x033a }
        r7 = aj;	 Catch:{ IOException -> 0x033a }
        r1.<init>(r7);	 Catch:{ IOException -> 0x033a }
        r2.<init>(r1);	 Catch:{ IOException -> 0x033a }
        r1 = r2.readLine();	 Catch:{ IOException -> 0x033a }
        r2.close();	 Catch:{ IOException -> 0x033a }
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IOException -> 0x033a }
        if (r2 == 0) goto L_0x021c;
    L_0x0216:
        r1 = bb;	 Catch:{ IOException -> 0x033a }
        r2 = 474; // 0x1da float:6.64E-43 double:2.34E-321;
        r1 = r1[r2];	 Catch:{ IOException -> 0x033a }
    L_0x021c:
        r2 = bb;
        r7 = 473; // 0x1d9 float:6.63E-43 double:2.337E-321;
        r2 = r2[r7];
        r7 = new java.lang.RuntimeException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = bb;
        r10 = 497; // 0x1f1 float:6.96E-43 double:2.456E-321;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r1 = r8.append(r1);
        r1 = r1.toString();
        r7.<init>(r1);
        com.whatsapp.util.Log.b(r2, r7);
    L_0x0241:
        r1 = aj;
        r1.delete();
    L_0x0246:
        r11.aa();
        r1 = bb;
        r2 = 456; // 0x1c8 float:6.39E-43 double:2.253E-321;
        r1 = r1[r2];
        r1 = r11.getSystemService(r1);
        r1 = (android.app.ActivityManager) r1;
        w = r1;
        r1 = bb;
        r2 = 476; // 0x1dc float:6.67E-43 double:2.35E-321;
        r1 = r1[r2];
        r1 = r11.getSystemService(r1);
        r1 = (android.telephony.TelephonyManager) r1;
        a3 = r1;
        r1 = bb;
        r2 = 471; // 0x1d7 float:6.6E-43 double:2.327E-321;
        r1 = r1[r2];
        r1 = r11.getSystemService(r1);
        r1 = (android.net.ConnectivityManager) r1;
        ah = r1;
        r1 = r11.getContentResolver();
        e = r1;
        r1 = new com.whatsapp.util.dns.b;
        r2 = r11.getApplicationContext();
        r1.<init>(r2);
        C = r1;
        r1 = C;
        r1.a();
        r1 = de.greenrobot.event.g.b();
        r2 = C;
        r1.a(r2);
        r1 = w;
        r7 = r1.getRunningAppProcesses();
        r1 = 1;
        if (r7 == 0) goto L_0x02e3;
    L_0x029b:
        r8 = r7.iterator();
        r2 = r1;
    L_0x02a0:
        r1 = r8.hasNext();
        if (r1 == 0) goto L_0x0749;
    L_0x02a6:
        r1 = r8.next();
        r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1;
        r9 = android.os.Process.myPid();	 Catch:{ IOException -> 0x0341 }
        r10 = r1.pid;	 Catch:{ IOException -> 0x0341 }
        if (r9 != r10) goto L_0x0746;
    L_0x02b4:
        r9 = bb;	 Catch:{ IOException -> 0x0341 }
        r10 = 455; // 0x1c7 float:6.38E-43 double:2.25E-321;
        r9 = r9[r10];	 Catch:{ IOException -> 0x0341 }
        r10 = r1.processName;	 Catch:{ IOException -> 0x0341 }
        r9 = r9.equals(r10);	 Catch:{ IOException -> 0x0341 }
        if (r9 != 0) goto L_0x0746;
    L_0x02c2:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r9 = bb;
        r10 = 465; // 0x1d1 float:6.52E-43 double:2.297E-321;
        r9 = r9[r10];
        r2 = r2.append(r9);
        r1 = r1.processName;
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = 0;
        if (r3 == 0) goto L_0x02e3;
    L_0x02e1:
        if (r3 == 0) goto L_0x0743;
    L_0x02e3:
        if (r1 == 0) goto L_0x02ea;
    L_0x02e5:
        d(r7);	 Catch:{ IOException -> 0x0343 }
        if (r3 == 0) goto L_0x0345;
    L_0x02ea:
        r0 = bb;	 Catch:{ IOException -> 0x02f5 }
        r1 = 487; // 0x1e7 float:6.82E-43 double:2.406E-321;
        r0 = r0[r1];	 Catch:{ IOException -> 0x02f5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x02f5 }
        goto L_0x0016;
    L_0x02f5:
        r0 = move-exception;
        throw r0;
    L_0x02f7:
        r0 = move-exception;
        throw r0;
    L_0x02f9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02fb }
    L_0x02fb:
        r0 = move-exception;
        throw r0;
    L_0x02fd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02ff }
    L_0x02ff:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0301 }
    L_0x0301:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0303 }
    L_0x0303:
        r0 = move-exception;
        throw r0;
    L_0x0305:
        r1 = 3;
        com.whatsapp.util.Log.a(r1);	 Catch:{ IOException -> 0x031f }
        if (r3 == 0) goto L_0x0150;
    L_0x030b:
        r1 = 4;
        com.whatsapp.util.Log.a(r1);	 Catch:{ IOException -> 0x0321 }
        if (r3 == 0) goto L_0x0150;
    L_0x0311:
        r1 = 4;
        com.whatsapp.util.Log.a(r1);	 Catch:{ IOException -> 0x0323 }
        if (r3 == 0) goto L_0x0150;
    L_0x0317:
        r1 = 5;
        com.whatsapp.util.Log.a(r1);	 Catch:{ IOException -> 0x0325 }
        if (r3 == 0) goto L_0x0150;
    L_0x031d:
        goto L_0x014c;
    L_0x031f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0321 }
    L_0x0321:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0323 }
    L_0x0323:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0325 }
    L_0x0325:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0327 }
    L_0x0327:
        r0 = move-exception;
        throw r0;
    L_0x0329:
        r0 = move-exception;
        throw r0;
    L_0x032b:
        r0 = move-exception;
        throw r0;
    L_0x032d:
        r0 = move-exception;
        throw r0;
    L_0x032f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0331 }
    L_0x0331:
        r0 = move-exception;
        throw r0;
    L_0x0333:
        r1 = 0;
        goto L_0x01e3;
    L_0x0336:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0338 }
    L_0x0338:
        r0 = move-exception;
        throw r0;
    L_0x033a:
        r1 = move-exception;
        r1 = r1.toString();
        goto L_0x021c;
    L_0x0341:
        r0 = move-exception;
        throw r0;
    L_0x0343:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02f5 }
    L_0x0345:
        r11.aE();
        com.whatsapp.fieldstats.al.d(r11);
        r1 = a3;
        r1 = r1.getPhoneType();
        r2 = 1;
        if (r1 != r2) goto L_0x0387;
    L_0x0354:
        r1 = a3;
        r1 = r1.getNetworkOperator();
        if (r1 == 0) goto L_0x0387;
    L_0x035c:
        r2 = r1.length();	 Catch:{ IOException -> 0x06f7 }
        r3 = 5;
        if (r2 < r3) goto L_0x0387;
    L_0x0363:
        r2 = r1.length();	 Catch:{ IOException -> 0x06f9 }
        r3 = 6;
        if (r2 > r3) goto L_0x0387;
    L_0x036a:
        r2 = 0;
        r3 = 3;
        r2 = r1.substring(r2, r3);
        r3 = 3;
        r1 = r1.substring(r3);
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ NumberFormatException -> 0x06fb }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NumberFormatException -> 0x06fb }
    L_0x037d:
        r3 = com.whatsapp.fieldstats.y.MCC;
        com.whatsapp.fieldstats.al.a(r11, r3, r2);
        r2 = com.whatsapp.fieldstats.y.MNC;
        com.whatsapp.fieldstats.al.a(r11, r2, r1);
    L_0x0387:
        r1 = com.whatsapp.fieldstats.aw.ANDROID;	 Catch:{ IOException -> 0x0709 }
        com.whatsapp.fieldstats.al.a(r11, r1);	 Catch:{ IOException -> 0x0709 }
        r1 = com.whatsapp.fieldstats.y.APP_VERSION;	 Catch:{ IOException -> 0x0709 }
        r2 = bb;	 Catch:{ IOException -> 0x0709 }
        r3 = 469; // 0x1d5 float:6.57E-43 double:2.317E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0709 }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x0709 }
        r1 = com.whatsapp.fieldstats.y.OS_VERSION;	 Catch:{ IOException -> 0x0709 }
        r2 = android.os.Build.VERSION.RELEASE;	 Catch:{ IOException -> 0x0709 }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x0709 }
        r1 = com.whatsapp.fieldstats.y.DEVICE_NAME;	 Catch:{ IOException -> 0x0709 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0709 }
        r2.<init>();	 Catch:{ IOException -> 0x0709 }
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ IOException -> 0x0709 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0709 }
        r3 = "-";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0709 }
        r3 = android.os.Build.MODEL;	 Catch:{ IOException -> 0x0709 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0709 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0709 }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x0709 }
        r1 = com.whatsapp.fieldstats.y.DEVICE_MANUFACTURER;	 Catch:{ IOException -> 0x0709 }
        r2 = android.os.Build.MANUFACTURER;	 Catch:{ IOException -> 0x0709 }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x0709 }
        r1 = com.whatsapp.fieldstats.y.DEVICE_MODEL;	 Catch:{ IOException -> 0x0709 }
        r2 = android.os.Build.MODEL;	 Catch:{ IOException -> 0x0709 }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x0709 }
        r1 = com.whatsapp.fieldstats.y.OS_BUILD_NUMBER;	 Catch:{ IOException -> 0x0709 }
        r2 = android.os.Build.DISPLAY;	 Catch:{ IOException -> 0x0709 }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x0709 }
        r2 = com.whatsapp.fieldstats.y.APP_IS_BETA_RELEASE;	 Catch:{ IOException -> 0x0709 }
        r1 = G;	 Catch:{ IOException -> 0x0709 }
        r3 = 1;
        if (r1 != r3) goto L_0x070b;
    L_0x03da:
        r1 = 1;
    L_0x03db:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ IOException -> 0x070e }
        com.whatsapp.fieldstats.al.a(r11, r2, r1);	 Catch:{ IOException -> 0x070e }
        r1 = com.whatsapp.fieldstats.y.LANGUAGE_CODE;	 Catch:{ IOException -> 0x070e }
        r2 = com.whatsapp.azl.a();	 Catch:{ IOException -> 0x070e }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x070e }
        r1 = com.whatsapp.fieldstats.y.LOCATION_CODE;	 Catch:{ IOException -> 0x070e }
        r2 = com.whatsapp.azl.b();	 Catch:{ IOException -> 0x070e }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x070e }
        r1 = com.whatsapp.fieldstats.y.RECEIPTS_ENABLED;	 Catch:{ IOException -> 0x070e }
        r2 = o();	 Catch:{ IOException -> 0x070e }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ IOException -> 0x070e }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x070e }
        r1 = aa;	 Catch:{ IOException -> 0x070e }
        r2 = 1;
        if (r1 < r2) goto L_0x040e;
    L_0x0406:
        r1 = new com.whatsapp.akz;	 Catch:{ IOException -> 0x070e }
        r1.<init>(r11);	 Catch:{ IOException -> 0x070e }
        com.whatsapp.util.br.a(r1);	 Catch:{ IOException -> 0x070e }
    L_0x040e:
        r1 = new android.os.HandlerThread;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = bb;
        r7 = 466; // 0x1d2 float:6.53E-43 double:2.3E-321;
        r3 = r3[r7];
        r2 = r2.append(r3);
        r3 = com.whatsapp.util.Log.d();
        r2 = r2.append(r3);
        r3 = 41;
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = 10;
        r1.<init>(r2, r3);
        r1.start();	 Catch:{ IOException -> 0x0710 }
        r2 = new android.os.Handler;	 Catch:{ IOException -> 0x0710 }
        r1 = r1.getLooper();	 Catch:{ IOException -> 0x0710 }
        r2.<init>(r1);	 Catch:{ IOException -> 0x0710 }
        E = r2;	 Catch:{ IOException -> 0x0710 }
        r1 = aa;	 Catch:{ IOException -> 0x0710 }
        r2 = 1;
        if (r1 == r2) goto L_0x044e;
    L_0x0449:
        r1 = aa;	 Catch:{ IOException -> 0x0710 }
        r2 = 2;
        if (r1 != r2) goto L_0x0451;
    L_0x044e:
        aM();	 Catch:{ IOException -> 0x0712 }
    L_0x0451:
        C();	 Catch:{ IOException -> 0x0714 }
        r1 = a3;	 Catch:{ IOException -> 0x0714 }
        r2 = new com.whatsapp.a5c;	 Catch:{ IOException -> 0x0714 }
        r2.<init>(r11);	 Catch:{ IOException -> 0x0714 }
        r3 = 32;
        r1.listen(r2, r3);	 Catch:{ IOException -> 0x0714 }
        r11.ar();	 Catch:{ IOException -> 0x0714 }
        ax();	 Catch:{ IOException -> 0x0714 }
        r1 = an;	 Catch:{ IOException -> 0x0714 }
        if (r1 == 0) goto L_0x047a;
    L_0x046a:
        r1 = an;	 Catch:{ IOException -> 0x0714 }
        r1 = r1.jabber_id;	 Catch:{ IOException -> 0x0714 }
        if (r1 == 0) goto L_0x047a;
    L_0x0470:
        r1 = an;	 Catch:{ IOException -> 0x0716 }
        r1 = r1.jabber_id;	 Catch:{ IOException -> 0x0716 }
        r1 = com.whatsapp.a54.a(r1);	 Catch:{ IOException -> 0x0716 }
        v = r1;	 Catch:{ IOException -> 0x0716 }
    L_0x047a:
        r1 = r11.getFilesDir();
        com.whatsapp.d7.a(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = bb;
        r3 = 496; // 0x1f0 float:6.95E-43 double:2.45E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = B();
        r2 = android.text.format.Formatter.formatFileSize(r11, r2);
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        x(r11);
        r1 = new android.content.Intent;
        r2 = bb;
        r3 = 477; // 0x1dd float:6.68E-43 double:2.357E-321;
        r2 = r2[r3];
        r1.<init>(r2);
        r2 = bb;
        r3 = 449; // 0x1c1 float:6.29E-43 double:2.22E-321;
        r2 = r2[r3];
        r1 = r1.setPackage(r2);
        r2 = bb;	 Catch:{ IOException -> 0x0718 }
        r3 = 491; // 0x1eb float:6.88E-43 double:2.426E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0718 }
        r8 = -1;
        r2 = r6.getLong(r2, r8);	 Catch:{ IOException -> 0x0718 }
        r6 = 0;
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x04e5;
    L_0x04cd:
        r2 = 0;
        r3 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r1 = android.app.PendingIntent.getBroadcast(r11, r2, r1, r3);	 Catch:{ IOException -> 0x0718 }
        if (r1 != 0) goto L_0x04e5;
    L_0x04d6:
        r1 = bb;	 Catch:{ IOException -> 0x071a }
        r2 = 486; // 0x1e6 float:6.81E-43 double:2.4E-321;
        r1 = r1[r2];	 Catch:{ IOException -> 0x071a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x071a }
        r1 = r11.B;	 Catch:{ IOException -> 0x071a }
        r2 = 0;
        r1.onReceive(r11, r2);	 Catch:{ IOException -> 0x071a }
    L_0x04e5:
        r1 = new com.whatsapp.l7;	 Catch:{ IOException -> 0x071c }
        r1.<init>(r11);	 Catch:{ IOException -> 0x071c }
        aJ = r1;	 Catch:{ IOException -> 0x071c }
        r1 = e(r11);	 Catch:{ IOException -> 0x071c }
        r2 = 6;
        if (r1 != r2) goto L_0x04f6;
    L_0x04f3:
        com.whatsapp.DeleteAccountConfirmation.b();	 Catch:{ IOException -> 0x071c }
    L_0x04f6:
        r1 = new com.whatsapp.bd;	 Catch:{ IOException -> 0x071e }
        r1.<init>();	 Catch:{ IOException -> 0x071e }
        Z = r1;	 Catch:{ IOException -> 0x071e }
        com.whatsapp.v.f();	 Catch:{ IOException -> 0x071e }
        r1 = aJ;	 Catch:{ IOException -> 0x071e }
        r2 = new com.whatsapp.gn;	 Catch:{ IOException -> 0x071e }
        r2.<init>();	 Catch:{ IOException -> 0x071e }
        r1.b(r2);	 Catch:{ IOException -> 0x071e }
        r1 = new com.whatsapp.ok;	 Catch:{ IOException -> 0x071e }
        r1.<init>(r11);	 Catch:{ IOException -> 0x071e }
        P = r1;	 Catch:{ IOException -> 0x071e }
        r1 = new com.whatsapp.w7;	 Catch:{ IOException -> 0x071e }
        r1.<init>();	 Catch:{ IOException -> 0x071e }
        aT = r1;	 Catch:{ IOException -> 0x071e }
        r1 = an;	 Catch:{ IOException -> 0x071e }
        if (r1 == 0) goto L_0x053e;
    L_0x051c:
        r1 = aJ;	 Catch:{ IOException -> 0x071e }
        r1 = r1.i();	 Catch:{ IOException -> 0x071e }
        if (r1 == 0) goto L_0x053e;
    L_0x0524:
        r1 = bb;	 Catch:{ IOException -> 0x0720 }
        r2 = 488; // 0x1e8 float:6.84E-43 double:2.41E-321;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0720 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x0720 }
        r1 = aJ;	 Catch:{ IOException -> 0x0720 }
        r1.j();	 Catch:{ IOException -> 0x0720 }
        l(r11);	 Catch:{ IOException -> 0x0720 }
        com.whatsapp.messaging.MessageService.a(r11);	 Catch:{ IOException -> 0x0720 }
        D();	 Catch:{ IOException -> 0x0720 }
        r11.O();	 Catch:{ IOException -> 0x0720 }
    L_0x053e:
        r1 = new com.whatsapp.t0;
        r1.<init>(r11);
        k = r1;
        r1 = k;
        r1.start();
        com.whatsapp.VideoTranscodeService.a();
        r1 = bb;
        r2 = 484; // 0x1e4 float:6.78E-43 double:2.39E-321;
        r1 = r1[r2];
        r2 = 0;
        r1 = r11.getSharedPreferences(r1, r2);
        if (r1 == 0) goto L_0x058a;
    L_0x055a:
        r2 = bb;	 Catch:{ IOException -> 0x0722 }
        r3 = 451; // 0x1c3 float:6.32E-43 double:2.23E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0722 }
        r3 = 0;
        r1 = r1.getBoolean(r2, r3);	 Catch:{ IOException -> 0x0722 }
        if (r1 != 0) goto L_0x058a;
    L_0x0567:
        r1 = 2131034116; // 0x7f050004 float:1.767874E38 double:1.052870747E-314;
        r2 = 1;
        android.preference.PreferenceManager.setDefaultValues(r11, r1, r2);	 Catch:{ IOException -> 0x0724 }
        r1 = 2131034117; // 0x7f050005 float:1.7678742E38 double:1.0528707473E-314;
        r2 = 1;
        android.preference.PreferenceManager.setDefaultValues(r11, r1, r2);	 Catch:{ IOException -> 0x0724 }
        r1 = 2131034119; // 0x7f050007 float:1.7678747E38 double:1.0528707483E-314;
        r2 = 1;
        android.preference.PreferenceManager.setDefaultValues(r11, r1, r2);	 Catch:{ IOException -> 0x0724 }
        r1 = 2131034120; // 0x7f050008 float:1.7678749E38 double:1.052870749E-314;
        r2 = 1;
        android.preference.PreferenceManager.setDefaultValues(r11, r1, r2);	 Catch:{ IOException -> 0x0724 }
        r1 = 2131034123; // 0x7f05000b float:1.7678755E38 double:1.0528707503E-314;
        r2 = 1;
        android.preference.PreferenceManager.setDefaultValues(r11, r1, r2);	 Catch:{ IOException -> 0x0724 }
    L_0x058a:
        r1 = r11.getContentResolver();
        r2 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r3 = 1;
        r6 = a0;
        r1.registerContentObserver(r2, r3, r6);
        r11.aS();
        r1 = android.support.v4.app.NotificationManagerCompat.from(r11);
        r2 = 2;
        r1.cancel(r2);
        r11.a3();
        r1 = r;
        r1.a();
        r1 = ah;
        r1 = r1.getBackgroundDataSetting();
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0726 }
        r2.<init>();	 Catch:{ IOException -> 0x0726 }
        r3 = bb;	 Catch:{ IOException -> 0x0726 }
        r6 = 452; // 0x1c4 float:6.33E-43 double:2.233E-321;
        r3 = r3[r6];	 Catch:{ IOException -> 0x0726 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0726 }
        r2 = r2.append(r1);	 Catch:{ IOException -> 0x0726 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0726 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x0726 }
        if (r1 != 0) goto L_0x05cf;
    L_0x05cb:
        r1 = 1;
        c(r11, r1);	 Catch:{ IOException -> 0x0726 }
    L_0x05cf:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0728 }
        r1.<init>();	 Catch:{ IOException -> 0x0728 }
        r2 = bb;	 Catch:{ IOException -> 0x0728 }
        r3 = 493; // 0x1ed float:6.91E-43 double:2.436E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0728 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0728 }
        r2 = n(r11);	 Catch:{ IOException -> 0x0728 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0728 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0728 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x0728 }
        r1 = G;	 Catch:{ IOException -> 0x0728 }
        r2 = 1;
        if (r1 != r2) goto L_0x0619;
    L_0x05f2:
        r1 = an;	 Catch:{ IOException -> 0x0728 }
        if (r1 == 0) goto L_0x05fd;
    L_0x05f6:
        r1 = an;	 Catch:{ IOException -> 0x072a }
        r1 = r1.jabber_id;	 Catch:{ IOException -> 0x072a }
        com.whatsapp.st.a(r1);	 Catch:{ IOException -> 0x072a }
    L_0x05fd:
        r1 = e;	 Catch:{ SettingNotFoundException -> 0x072e }
        if (r1 == 0) goto L_0x0619;
    L_0x0601:
        r1 = e;	 Catch:{ SettingNotFoundException -> 0x072e }
        r2 = bb;	 Catch:{ SettingNotFoundException -> 0x072e }
        r3 = 468; // 0x1d4 float:6.56E-43 double:2.31E-321;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x072e }
        r1 = android.provider.Settings.Secure.getInt(r1, r2);	 Catch:{ SettingNotFoundException -> 0x072e }
        r2 = 1;
        if (r1 != r2) goto L_0x0619;
    L_0x0610:
        r1 = bb;	 Catch:{ IOException -> 0x072c }
        r2 = 475; // 0x1db float:6.66E-43 double:2.347E-321;
        r1 = r1[r2];	 Catch:{ IOException -> 0x072c }
        com.whatsapp.st.a(r11, r1);	 Catch:{ IOException -> 0x072c }
    L_0x0619:
        r1 = new com.whatsapp.util.d;	 Catch:{ IOException -> 0x0731 }
        r2 = r11.getApplicationContext();	 Catch:{ IOException -> 0x0731 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x0731 }
        a = r1;	 Catch:{ IOException -> 0x0731 }
        r1 = a;	 Catch:{ IOException -> 0x0731 }
        com.whatsapp.util.br.a(r1);	 Catch:{ IOException -> 0x0731 }
        com.whatsapp.a54.b(r11);	 Catch:{ IOException -> 0x0731 }
        r1 = com.whatsapp.fieldstats.y.LIBC_QEMU_PRESENT;	 Catch:{ IOException -> 0x0731 }
        r2 = com.whatsapp.a54.D();	 Catch:{ IOException -> 0x0731 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ IOException -> 0x0731 }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x0731 }
        r1 = com.whatsapp.fieldstats.y.IS_ROOTED;	 Catch:{ IOException -> 0x0731 }
        r2 = com.whatsapp.a54.p();	 Catch:{ IOException -> 0x0731 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ IOException -> 0x0731 }
        com.whatsapp.fieldstats.al.a(r11, r1, r2);	 Catch:{ IOException -> 0x0731 }
        r2 = com.whatsapp.fieldstats.y.IS_USING_CUSTOM_ROM;	 Catch:{ IOException -> 0x0731 }
        r1 = com.whatsapp.a54.z();	 Catch:{ IOException -> 0x0731 }
        if (r1 == 0) goto L_0x0733;
    L_0x064e:
        r1 = 1;
    L_0x064f:
        r1 = java.lang.Boolean.valueOf(r1);
        com.whatsapp.fieldstats.al.a(r11, r2, r1);
        u(r11);
        r1 = al();
        if (r1 == 0) goto L_0x0677;
    L_0x065f:
        r1 = bb;
        r2 = 462; // 0x1ce float:6.47E-43 double:2.283E-321;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = new android.os.Handler;
        r1.<init>();
        r2 = new com.whatsapp.mj;
        r2.<init>(r11);
        r6 = 2600; // 0xa28 float:3.643E-42 double:1.2846E-320;
        r1.postDelayed(r2, r6);
    L_0x0677:
        r1 = aa;
        r2 = 3;
        if (r1 != r2) goto L_0x0694;
    L_0x067c:
        r2 = new android.util.DisplayMetrics;
        r2.<init>();
        r1 = bb;
        r3 = 489; // 0x1e9 float:6.85E-43 double:2.416E-321;
        r1 = r1[r3];
        r1 = r11.getSystemService(r1);
        r1 = (android.view.WindowManager) r1;
        r1 = r1.getDefaultDisplay();
        r1.getMetrics(r2);
    L_0x0694:
        r1 = new com.whatsapp.Voip$DefaultCryptoCallback;	 Catch:{ IOException -> 0x0736 }
        r1.<init>();	 Catch:{ IOException -> 0x0736 }
        com.whatsapp.Voip.registerCryptoCallback(r1);	 Catch:{ IOException -> 0x0736 }
        r1 = new com.whatsapp.Voip$DefaultSignalingCallback;	 Catch:{ IOException -> 0x0736 }
        r1.<init>();	 Catch:{ IOException -> 0x0736 }
        com.whatsapp.Voip.registerSignalingCallback(r1);	 Catch:{ IOException -> 0x0736 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0736 }
        r1.<init>();	 Catch:{ IOException -> 0x0736 }
        r2 = bb;	 Catch:{ IOException -> 0x0736 }
        r3 = 494; // 0x1ee float:6.92E-43 double:2.44E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0736 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0736 }
        r0 = r0.isScreenOn();	 Catch:{ IOException -> 0x0736 }
        if (r0 == 0) goto L_0x0738;
    L_0x06b9:
        r0 = bb;	 Catch:{ IOException -> 0x0736 }
        r2 = 450; // 0x1c2 float:6.3E-43 double:2.223E-321;
        r0 = r0[r2];	 Catch:{ IOException -> 0x0736 }
    L_0x06bf:
        r0 = r1.append(r0);	 Catch:{ IOException -> 0x073f }
        r0 = r0.toString();	 Catch:{ IOException -> 0x073f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x073f }
        r0 = aW();	 Catch:{ IOException -> 0x073f }
        if (r0 == 0) goto L_0x06d3;
    L_0x06d0:
        h();	 Catch:{ IOException -> 0x073f }
    L_0x06d3:
        r0 = ag();	 Catch:{ IOException -> 0x0741 }
        if (r0 == 0) goto L_0x06e0;
    L_0x06d9:
        r0 = new com.whatsapp.at4;	 Catch:{ IOException -> 0x0741 }
        r0.<init>(r11);	 Catch:{ IOException -> 0x0741 }
        H = r0;	 Catch:{ IOException -> 0x0741 }
    L_0x06e0:
        r0 = java.lang.System.currentTimeMillis();
        r0 = r0 - r4;
        r2 = p;
        r2 = r2.getApplicationContext();
        r3 = com.whatsapp.fieldstats.b.APP_LAUNCH_T;
        r0 = (double) r0;
        r0 = java.lang.Double.valueOf(r0);
        com.whatsapp.fieldstats.al.a(r2, r3, r0);
        goto L_0x0016;
    L_0x06f7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x06f9 }
    L_0x06f9:
        r0 = move-exception;
        throw r0;
    L_0x06fb:
        r1 = move-exception;
        r2 = bb;
        r3 = 492; // 0x1ec float:6.9E-43 double:2.43E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.c(r2, r1);
        r2 = 0;
        r1 = 0;
        goto L_0x037d;
    L_0x0709:
        r0 = move-exception;
        throw r0;
    L_0x070b:
        r1 = 0;
        goto L_0x03db;
    L_0x070e:
        r0 = move-exception;
        throw r0;
    L_0x0710:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0712 }
    L_0x0712:
        r0 = move-exception;
        throw r0;
    L_0x0714:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0716 }
    L_0x0716:
        r0 = move-exception;
        throw r0;
    L_0x0718:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x071a }
    L_0x071a:
        r0 = move-exception;
        throw r0;
    L_0x071c:
        r0 = move-exception;
        throw r0;
    L_0x071e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0720 }
    L_0x0720:
        r0 = move-exception;
        throw r0;
    L_0x0722:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0724 }
    L_0x0724:
        r0 = move-exception;
        throw r0;
    L_0x0726:
        r0 = move-exception;
        throw r0;
    L_0x0728:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x072a }
    L_0x072a:
        r0 = move-exception;
        throw r0;
    L_0x072c:
        r1 = move-exception;
        throw r1;	 Catch:{ SettingNotFoundException -> 0x072e }
    L_0x072e:
        r1 = move-exception;
        goto L_0x0619;
    L_0x0731:
        r0 = move-exception;
        throw r0;
    L_0x0733:
        r1 = 0;
        goto L_0x064f;
    L_0x0736:
        r0 = move-exception;
        throw r0;
    L_0x0738:
        r0 = bb;
        r2 = 461; // 0x1cd float:6.46E-43 double:2.28E-321;
        r0 = r0[r2];
        goto L_0x06bf;
    L_0x073f:
        r0 = move-exception;
        throw r0;
    L_0x0741:
        r0 = move-exception;
        throw r0;
    L_0x0743:
        r2 = r1;
        goto L_0x02a0;
    L_0x0746:
        r1 = r2;
        goto L_0x02e1;
    L_0x0749:
        r1 = r2;
        goto L_0x02e3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.onCreate():void");
    }

    private static void g() {
        try {
            if (y() != null) {
                try {
                    if (y().d()) {
                        return;
                    }
                }
            }
            Log.w(bb[411] + new Date().toString() + " " + System.currentTimeMillis());
            aq.a(p, p.getString(R.string.clock_wrong));
            q = true;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(String str, String str2) {
        try {
            if (ac) {
                l.b(au.c(str, str2));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void a(asm com_whatsapp_asm) {
        try {
            if (!I.contains(com_whatsapp_asm)) {
                I.add(com_whatsapp_asm);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void a(String str, byte[] bArr, byte[] bArr2, Runnable runnable) {
        Message a = au.a(str, bArr, bArr2, runnable);
        try {
            if (ac) {
                Log.i(bb[528]);
                l.b(a);
                if (az == 0) {
                    return;
                }
            }
            Log.i(bb[529]);
            synchronized (au) {
                au.add(a);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static List c(List list) {
        return a(list, new ArrayList(list.size()), false);
    }

    public static void a(Context context, int i, int i2) {
        try {
            if (h != null) {
                h.a(i);
                try {
                    if (az == 0) {
                        return;
                    }
                }
            }
            b(context, i, i2);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File t(java.lang.String r3) {
        /*
        r1 = com.whatsapp.yf.f();
        r0 = 0;
        r2 = r1.exists();	 Catch:{ NumberFormatException -> 0x002c }
        if (r2 == 0) goto L_0x001f;
    L_0x000b:
        r2 = r1.isFile();	 Catch:{ NumberFormatException -> 0x002e }
        if (r2 == 0) goto L_0x0018;
    L_0x0011:
        r1.delete();	 Catch:{ NumberFormatException -> 0x0030 }
        r2 = az;	 Catch:{ NumberFormatException -> 0x0030 }
        if (r2 == 0) goto L_0x001f;
    L_0x0018:
        r2 = r1.isDirectory();	 Catch:{ NumberFormatException -> 0x0030 }
        if (r2 == 0) goto L_0x001f;
    L_0x001e:
        r0 = 1;
    L_0x001f:
        if (r0 != 0) goto L_0x0024;
    L_0x0021:
        r1.mkdirs();	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0024:
        if (r3 == 0) goto L_0x0036;
    L_0x0026:
        r0 = new java.io.File;	 Catch:{ NumberFormatException -> 0x0034 }
        r0.<init>(r1, r3);	 Catch:{ NumberFormatException -> 0x0034 }
    L_0x002b:
        return r0;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = r1;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.App.t(java.lang.String):java.io.File");
    }

    public static void a(String str, b9 b9Var) {
        c(new mz(str, null, null, 14, b9Var));
    }

    static void b(String str) {
        boolean z;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        br.a(new wu(str, z));
    }

    public static void a(long j, long j2) {
        Log.i(bb[169] + j + bb[173] + j2 + bb[171] + DateUtils.formatDateTime(p, System.currentTimeMillis(), 17) + bb[174] + DateUtils.formatDateTime(p, c(a2()), 17));
        av = j;
        x = j2;
        ai = x - av;
        m = SystemClock.elapsedRealtime();
        p.getSharedPreferences(bb[172], 0).edit().putLong(bb[170], ai).commit();
    }
}
