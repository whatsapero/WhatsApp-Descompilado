package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class g {
    private static final Map j;
    public static String k;
    private static final f m;
    public static int o;
    static volatile g q;
    private static final String[] z;
    private final m a;
    private final d b;
    private final Map c;
    private final Map d;
    private final boolean e;
    private final boolean f;
    private final c g;
    private final boolean h;
    private final boolean i;
    private final boolean l;
    private final j n;
    private final ExecutorService p;
    private final boolean r;
    private final Map s;
    private final ThreadLocal t;

    private void a(h hVar, Object obj, Throwable th) {
        try {
            if (!(obj instanceof b)) {
                try {
                    if (this.h) {
                        throw new e(z[9], th);
                    }
                    try {
                        if (this.l) {
                            Log.e(k, z[12] + obj.getClass() + z[10] + hVar.a.getClass(), th);
                        }
                        if (this.r) {
                            b(new b(this, th, obj, hVar.a));
                        }
                    } catch (e e) {
                        throw e;
                    }
                } catch (e e2) {
                    throw e2;
                }
            } else if (this.l) {
                Log.e(k, z[7] + hVar.a.getClass() + z[8], th);
                b bVar = (b) obj;
                Log.e(k, z[11] + bVar.d + z[13] + bVar.c, bVar.a);
            }
        } catch (e e22) {
            throw e22;
        }
    }

    public void c(Object obj) {
        synchronized (this.s) {
            this.s.put(obj.getClass(), obj);
        }
        b(obj);
    }

    private void a(Object obj, q qVar, boolean z, int i) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        Class cls = qVar.b;
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) this.d.get(cls);
        h hVar = new h(obj, qVar, i);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            this.d.put(cls, copyOnWriteArrayList2);
            copyOnWriteArrayList = copyOnWriteArrayList2;
        } else {
            try {
                if (copyOnWriteArrayList2.contains(hVar)) {
                    throw new e(z[1] + obj.getClass() + z[0] + cls);
                }
                copyOnWriteArrayList = copyOnWriteArrayList2;
            } catch (e e) {
                throw e;
            }
        }
        int size = copyOnWriteArrayList.size();
        int i2 = 0;
        while (i2 <= size) {
            try {
                if (i2 != size) {
                    if (hVar.d <= ((h) copyOnWriteArrayList.get(i2)).d) {
                        i2++;
                    }
                }
                copyOnWriteArrayList.add(i2, hVar);
                break;
            } catch (e e2) {
                throw e2;
            } catch (e e22) {
                throw e22;
            }
        }
        List list = (List) this.c.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.c.put(obj, list);
        }
        list.add(cls);
        if (z) {
            Object obj2;
            synchronized (this.s) {
                obj2 = this.s.get(cls);
            }
            if (obj2 != null) {
                try {
                    boolean z2;
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a(hVar, obj2, z2);
                } catch (e e222) {
                    throw e222;
                }
            }
        }
    }

    void a(h hVar, Object obj) {
        try {
            hVar.c.d.invoke(hVar.a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            a(hVar, obj, e.getCause());
        } catch (Throwable e2) {
            throw new IllegalStateException(z[3], e2);
        }
    }

    void a(i iVar) {
        Object obj = iVar.a;
        h hVar = iVar.b;
        try {
            i.a(iVar);
            if (hVar.b) {
                a(hVar, obj);
            }
        } catch (e e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[14];
        String str = "(znU?i\u007f{\u0007(m|kT.migCz|t\"B,muv\u0007";
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
                        i3 = 8;
                        break;
                    case ay.f /*1*/:
                        i3 = 27;
                        break;
                    case ay.n /*2*/:
                        i3 = 2;
                        break;
                    case ay.p /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "Ft\"T/jhaU3j~pTzz~eN)|~pB>(}mUzmmgI.(";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "]ug_*mxvB>(~zD?xokH4";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "]uiI5\u007fu\"S2z~cCzetfB`(";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "[n`T9zr`B((om\u0007/fig@3{ogUz\u007fzq\u00074go\"U?orqS?z~f\u00078m}mU?2;";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "AuvB(fzn\u0007?zimUt(Z`H(|;qS;|~\"P;{;lH.(igT?|";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "[n`T9zr`B(McaB*|rmI\u001f~~lSz{n`T9zr`B((";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "(ojU?\u007f;cIzmcaB*|rmI";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "AutH1aue\u0007)}yqD(aygUznzkK?l";
                    obj = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "(om\u0007)}yqD(aykI=(xnF){;";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "AukS3iw\"B,muv\u0007";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "KtwK>(umSzlrqW;|xj\u0007?~~lS`(";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "(xcR)m\u007f\"B\"k~rS3gu\"N4(";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "MmgI.".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case PBE.MD5 /*0*/:
                                i5 = 8;
                                break;
                            case ay.f /*1*/:
                                i5 = 27;
                                break;
                            case ay.n /*2*/:
                                i5 = 2;
                                break;
                            case ay.p /*3*/:
                                i5 = 39;
                                break;
                            default:
                                i5 = 90;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    k = new String(cArr2).intern();
                    m = new f();
                    j = new HashMap();
                default:
                    strArr2[i] = str;
                    str = "[n`T9zr`B((";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Object obj) {
        a(obj, false, 0);
    }

    public void e(Object obj) {
        a(obj, true, 0);
    }

    private void a(h hVar, Object obj, boolean z) {
        try {
            switch (k.a[hVar.c.c.ordinal()]) {
                case ay.f /*1*/:
                    a(hVar, obj);
                    return;
                case ay.n /*2*/:
                    if (z) {
                        try {
                            a(hVar, obj);
                            return;
                        } catch (e e) {
                            throw e;
                        }
                    }
                    this.a.a(hVar, obj);
                    return;
                case ay.p /*3*/:
                    if (z) {
                        try {
                            this.b.a(hVar, obj);
                            return;
                        } catch (e e2) {
                            throw e2;
                        }
                    }
                    a(hVar, obj);
                    return;
                case aj.i /*4*/:
                    this.g.a(hVar, obj);
                    return;
                default:
                    throw new IllegalStateException(z[4] + hVar.c.c);
            }
        } catch (e e22) {
            throw e22;
        }
        throw e22;
    }

    ExecutorService a() {
        return this.p;
    }

    public void b(Object obj) {
        boolean z = true;
        l lVar = (l) this.t.get();
        List list = lVar.e;
        try {
            list.add(obj);
            if (!lVar.b) {
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    z = false;
                }
                try {
                    lVar.d = z;
                    lVar.b = true;
                    if (lVar.c) {
                        throw new e(z[6]);
                    }
                    while (!list.isEmpty()) {
                        try {
                            a(list.remove(0), lVar);
                        } finally {
                            lVar.b = false;
                            lVar.d = false;
                        }
                    }
                } catch (e e) {
                    throw e;
                }
            }
        } catch (e e2) {
            throw e2;
        } catch (e e22) {
            throw e22;
        }
    }

    static void a(List list, Class[] clsArr) {
        int length = clsArr.length;
        int i = 0;
        while (i < length) {
            Class cls = clsArr[i];
            try {
                if (!list.contains(cls)) {
                    list.add(cls);
                    a(list, cls.getInterfaces());
                }
                i++;
            } catch (e e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void d(java.lang.Object r5) {
        /*
        r4_this = this;
        monitor-enter(r4);
        r1 = de.greenrobot.event.p.a;	 Catch:{ all -> 0x004c }
        r0 = r4.c;	 Catch:{ all -> 0x004c }
        r0 = r0.get(r5);	 Catch:{ all -> 0x004c }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0029;
    L_0x000d:
        r2 = r0.iterator();	 Catch:{ all -> 0x004c }
    L_0x0011:
        r0 = r2.hasNext();	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0022;
    L_0x0017:
        r0 = r2.next();	 Catch:{ all -> 0x004c }
        r0 = (java.lang.Class) r0;	 Catch:{ all -> 0x004c }
        r4.a(r5, r0);	 Catch:{ all -> 0x004c }
        if (r1 == 0) goto L_0x0011;
    L_0x0022:
        r0 = r4.c;	 Catch:{ e -> 0x004a }
        r0.remove(r5);	 Catch:{ e -> 0x004a }
        if (r1 == 0) goto L_0x0048;
    L_0x0029:
        r0 = k;	 Catch:{ e -> 0x004a }
        r1 = new java.lang.StringBuilder;	 Catch:{ e -> 0x004a }
        r1.<init>();	 Catch:{ e -> 0x004a }
        r2 = z;	 Catch:{ e -> 0x004a }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ e -> 0x004a }
        r1 = r1.append(r2);	 Catch:{ e -> 0x004a }
        r2 = r5.getClass();	 Catch:{ e -> 0x004a }
        r1 = r1.append(r2);	 Catch:{ e -> 0x004a }
        r1 = r1.toString();	 Catch:{ e -> 0x004a }
        android.util.Log.w(r0, r1);	 Catch:{ e -> 0x004a }
    L_0x0048:
        monitor-exit(r4);
        return;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.g.d(java.lang.Object):void");
    }

    private boolean a(java.lang.Object r6, de.greenrobot.event.l r7, java.lang.Class r8) {
        /* JADX: method processing error */
/*
        Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:419)
	at jadx.core.dex.visitors.typeinference.PostTypeInference.process(PostTypeInference.java:92)
	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r5_this = this;
        r1 = 0;
        r4 = 0;
        monitor-enter(r5);
        r0 = r5.d;	 Catch:{ all -> 0x0039 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x0039 }
        r0 = (java.util.concurrent.CopyOnWriteArrayList) r0;	 Catch:{ all -> 0x0039 }
        monitor-exit(r5);	 Catch:{ all -> 0x0039 }
        if (r0 == 0) goto L_0x0046;
    L_0x000e:
        r2 = r0.isEmpty();	 Catch:{ e -> 0x003c }
        if (r2 != 0) goto L_0x0046;
    L_0x0014:
        r2 = r0.iterator();
    L_0x0018:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0037;
    L_0x001e:
        r0 = r2.next();
        r0 = (de.greenrobot.event.h) r0;
        r7.a = r6;
        r7.f = r0;
        r3 = r7.d;	 Catch:{ all -> 0x003e }
        r5.a(r0, r6, r3);	 Catch:{ all -> 0x003e }
        r0 = r7.c;	 Catch:{ all -> 0x003e }
        r7.a = r4;
        r7.f = r4;
        r7.c = r1;
        if (r0 == 0) goto L_0x0018;
    L_0x0037:
        r0 = 1;
    L_0x0038:
        return r0;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0039 }
        throw r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r0 = move-exception;
        r7.a = r4;
        r7.f = r4;
        r7.c = r1;
        throw r0;
    L_0x0046:
        r0 = r1;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.g.a(java.lang.Object, de.greenrobot.event.l, java.lang.Class):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.Object r7, de.greenrobot.event.l r8) {
        /*
        r6_this = this;
        r0 = 0;
        r3 = r7.getClass();
        r1 = r6.e;
        if (r1 == 0) goto L_0x005b;
    L_0x0009:
        r4 = r6.a(r3);
        r5 = r4.size();
        r2 = r0;
        r1 = r0;
    L_0x0013:
        if (r2 >= r5) goto L_0x0024;
    L_0x0015:
        r0 = r4.get(r2);
        r0 = (java.lang.Class) r0;
        r0 = r6.a(r7, r8, r0);
        r1 = r1 | r0;
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0013;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        if (r0 != 0) goto L_0x005a;
    L_0x0027:
        r0 = r6.f;	 Catch:{ e -> 0x0060 }
        if (r0 == 0) goto L_0x0046;
    L_0x002b:
        r0 = k;	 Catch:{ e -> 0x0060 }
        r1 = new java.lang.StringBuilder;	 Catch:{ e -> 0x0060 }
        r1.<init>();	 Catch:{ e -> 0x0060 }
        r2 = z;	 Catch:{ e -> 0x0060 }
        r4 = 2;
        r2 = r2[r4];	 Catch:{ e -> 0x0060 }
        r1 = r1.append(r2);	 Catch:{ e -> 0x0060 }
        r1 = r1.append(r3);	 Catch:{ e -> 0x0060 }
        r1 = r1.toString();	 Catch:{ e -> 0x0060 }
        android.util.Log.d(r0, r1);	 Catch:{ e -> 0x0060 }
    L_0x0046:
        r0 = r6.i;	 Catch:{ e -> 0x0062 }
        if (r0 == 0) goto L_0x005a;
    L_0x004a:
        r0 = de.greenrobot.event.o.class;
        if (r3 == r0) goto L_0x005a;
    L_0x004e:
        r0 = de.greenrobot.event.b.class;
        if (r3 == r0) goto L_0x005a;
    L_0x0052:
        r0 = new de.greenrobot.event.o;	 Catch:{ e -> 0x0066 }
        r0.<init>(r6, r7);	 Catch:{ e -> 0x0066 }
        r6.b(r0);	 Catch:{ e -> 0x0066 }
    L_0x005a:
        return;
    L_0x005b:
        r0 = r6.a(r7, r8, r3);
        goto L_0x0025;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ e -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ e -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.g.a(java.lang.Object, de.greenrobot.event.l):void");
    }

    private void a(Object obj, Class cls) {
        int i = 0;
        boolean z = p.a;
        List list = (List) this.d.get(cls);
        if (list != null) {
            int size = list.size();
            while (i < size) {
                h hVar = (h) list.get(i);
                try {
                    int i2;
                    if (hVar.a == obj) {
                        hVar.b = false;
                        list.remove(i);
                        i2 = i - 1;
                        i = size - 1;
                    } else {
                        i2 = i;
                        i = size;
                    }
                    i2++;
                    if (!z) {
                        size = i;
                        i = i2;
                    } else {
                        return;
                    }
                } catch (e e) {
                    throw e;
                }
            }
        }
    }

    public Object b(Class cls) {
        Object cast;
        synchronized (this.s) {
            cast = cls.cast(this.s.get(cls));
        }
        return cast;
    }

    private List a(Class cls) {
        List list;
        synchronized (j) {
            list = (List) j.get(cls);
            if (list == null) {
                list = new ArrayList();
                for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    a(list, cls2.getInterfaces());
                }
                j.put(cls, list);
            }
        }
        return list;
    }

    private synchronized void a(Object obj, boolean z, int i) {
        for (q qVar : this.n.a(obj.getClass())) {
            a(obj, qVar, z, i);
        }
    }

    g(f fVar) {
        this.t = new n(this);
        this.d = new HashMap();
        this.c = new HashMap();
        this.s = new ConcurrentHashMap();
        this.a = new m(this, Looper.getMainLooper(), 10);
        this.b = new d(this);
        this.g = new c(this);
        this.n = new j(fVar.g);
        this.l = fVar.f;
        this.f = fVar.c;
        this.r = fVar.d;
        this.i = fVar.e;
        this.h = fVar.a;
        this.e = fVar.i;
        this.p = fVar.h;
    }

    public static g b() {
        if (q == null) {
            synchronized (g.class) {
                if (q == null) {
                    q = new g();
                }
            }
        }
        return q;
    }

    public g() {
        this(m);
    }
}
