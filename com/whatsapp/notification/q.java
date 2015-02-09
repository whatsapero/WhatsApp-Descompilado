package com.whatsapp.notification;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.App;
import com.whatsapp.protocol.b;
import com.whatsapp.sg;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class q {
    private static q c;
    private static final String[] z;
    private final ConcurrentHashMap a;
    long b;
    private y d;
    private Handler e;

    static {
        String[] strArr = new String[11];
        String str = "j_:\u0013(MS/\u000e'K^=";
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
                        i3 = 36;
                        break;
                    case ay.f /*1*/:
                        i3 = 48;
                        break;
                    case ay.n /*2*/:
                        i3 = 78;
                        break;
                    case ay.p /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 78;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "G_#T9LQ:\t/T@\u0011\n<AV+\b+JS+\t";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\t\u0001";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "CB!\u000f>{^!\u000e'BI\u0011\n!TE>%#KT+";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "J_:\u0013(]o>\u0015>Q@";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\t\u0001";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "CB!\u000f>{^!\u000e'BI\u0011\n!TE>";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "CB!\u000f>{^!\u000e'BI\u0011\n!TE>%#KT+";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "J_:\u0013(]o>\u0015>Q@\u0011\u0017!@U";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "J_:\u0013(]o>\u0015>Q@\u0011\u0017!@U";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new q();
                default:
                    strArr2[i] = str;
                    str = "IU=\t/CU\u0000\u0015:MV'\u0019/PY!\u0014aVU=\u001f:iU=\t/CU=<!V~!\u000e'BY-\u001b:M_ U?V\u0010\"\u0013=P\u0010 \u000f\"H\u0010(\u0015<\u0004\u0015=";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private Handler b() {
        if (this.e == null) {
            HandlerThread handlerThread = new HandlerThread(z[0], 10);
            handlerThread.start();
            this.e = new Handler(handlerThread.getLooper());
        }
        return this.e;
    }

    public static q c() {
        return c;
    }

    public int a(SharedPreferences sharedPreferences, sg sgVar) {
        int parseInt;
        int i = 1;
        if (sgVar == sg.GROUP) {
            try {
                parseInt = Integer.parseInt(sharedPreferences.getString(z[8], z[3]));
            } catch (NumberFormatException e) {
                parseInt = 0;
            }
            if (parseInt == -1) {
                try {
                    if (sharedPreferences.getBoolean(z[7], false)) {
                        parseInt = 1;
                    } else {
                        parseInt = 0;
                    }
                    Editor edit = sharedPreferences.edit();
                    edit.putString(z[4], Integer.toString(parseInt));
                    edit.commit();
                } catch (NumberFormatException e2) {
                    throw e2;
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
            if (!PopupNotification.H) {
                return parseInt;
            }
        }
        try {
            parseInt = Integer.parseInt(sharedPreferences.getString(z[9], z[6]));
        } catch (NumberFormatException e3) {
            parseInt = 0;
        }
        if (parseInt != -1) {
            return parseInt;
        }
        try {
            if (!sharedPreferences.getBoolean(z[5], false)) {
                i = 0;
            }
            Editor edit2 = sharedPreferences.edit();
            edit2.putString(z[10], Integer.toString(i));
            edit2.commit();
            return i;
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r9, com.whatsapp.protocol.b r10) {
        /*
        r8_this = this;
        r7 = 7;
        r3 = 1;
        r2 = 0;
        r4 = com.whatsapp.notification.PopupNotification.H;
        r0 = r8.a;
        r0 = r0.containsKey(r9);
        if (r0 != 0) goto L_0x0039;
    L_0x000d:
        r0 = com.whatsapp.App.P;
        r0 = r0.a(r9);
        r1 = r0.a;
        if (r1 <= r3) goto L_0x0029;
    L_0x0017:
        r1 = com.whatsapp.App.aJ;
        r0 = r0.a;
        r0 = java.lang.Math.min(r0, r7);
        r0 = r1.a(r9, r0);
        r0 = java.util.Collections.synchronizedList(r0);
        if (r4 == 0) goto L_0x0032;
    L_0x0029:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = java.util.Collections.synchronizedList(r0);
    L_0x0032:
        r1 = r8.a;
        r1.put(r9, r0);
        if (r4 == 0) goto L_0x0083;
    L_0x0039:
        r0 = r8.a;
        r0 = r0.get(r9);
        r0 = (java.util.List) r0;
        r1 = r0;
    L_0x0042:
        r5 = r1.iterator();
    L_0x0046:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0081;
    L_0x004c:
        r0 = r5.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r0 = r0.e;
        r6 = r10.e;
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x007f;
    L_0x005c:
        if (r4 == 0) goto L_0x007d;
    L_0x005e:
        r0 = r3;
    L_0x005f:
        if (r4 == 0) goto L_0x007b;
    L_0x0061:
        if (r0 != 0) goto L_0x0078;
    L_0x0063:
        r0 = 0;
        r1.add(r0, r10);	 Catch:{ NumberFormatException -> 0x0079 }
    L_0x0067:
        r0 = r1.size();
        if (r0 <= r7) goto L_0x0078;
    L_0x006d:
        r0 = r1.size();
        r0 = r0 + -1;
        r1.remove(r0);
        if (r4 == 0) goto L_0x0067;
    L_0x0078:
        return;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r2 = r0;
        goto L_0x0046;
    L_0x007d:
        r0 = r3;
        goto L_0x0061;
    L_0x007f:
        r0 = r2;
        goto L_0x005f;
    L_0x0081:
        r0 = r2;
        goto L_0x0061;
    L_0x0083:
        r1 = r0;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.q.b(java.lang.String, com.whatsapp.protocol.b):void");
    }

    public void a() {
        b().post(new z(this));
    }

    public void c(String str) {
        b().post(new g(this, str));
    }

    public int a(sg sgVar) {
        return a(App.p.getSharedPreferences(z[2], 0), sgVar);
    }

    public void a(String str, b bVar) {
        boolean z = PopupNotification.H;
        if (bVar == null) {
            try {
                this.a.put(str, Collections.synchronizedList(new ArrayList()));
                if (!z) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        List list = (List) this.a.get(str);
        if (list != null) {
            int indexOf = list.indexOf(bVar);
            if (indexOf > -1) {
                try {
                    list.subList(indexOf, list.size()).clear();
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            if (!z) {
                return;
            }
        }
        try {
            Log.b(z[1], null, new Object[]{str});
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public q() {
        this.b = System.currentTimeMillis() - 200;
        this.a = new ConcurrentHashMap();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.util.List b(java.lang.String r4) {
        /*
        r3_this = this;
        r0 = r3.a;
        r0 = r0.containsKey(r4);
        if (r0 != 0) goto L_0x0036;
    L_0x0008:
        r0 = com.whatsapp.App.P;
        r0 = r0.a(r4);
        r1 = r0.a;
        if (r1 <= 0) goto L_0x0027;
    L_0x0012:
        r1 = com.whatsapp.App.aJ;
        r0 = r0.a;
        r2 = 7;
        r0 = java.lang.Math.min(r0, r2);
        r0 = r1.a(r4, r0);
        r0 = java.util.Collections.synchronizedList(r0);
        r1 = com.whatsapp.notification.PopupNotification.H;
        if (r1 == 0) goto L_0x0030;
    L_0x0027:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = java.util.Collections.synchronizedList(r0);
    L_0x0030:
        r1 = r3.a;
        r1.put(r4, r0);
    L_0x0035:
        return r0;
    L_0x0036:
        r0 = r3.a;
        r0 = r0.get(r4);
        r0 = (java.util.List) r0;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.q.b(java.lang.String):java.util.List");
    }

    public void a(String str) {
        a(str, null);
    }

    public void a(boolean z, boolean z2, boolean z3, boolean z4) {
        y yVar = new y(this, z, z2, z3, z4);
        try {
            if (this.d != null) {
                if (this.d.equals(yVar)) {
                    b().removeCallbacks(this.d);
                }
            }
            this.d = yVar;
            b().post(this.d);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }
}
