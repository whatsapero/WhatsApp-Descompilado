package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import com.google.android.gms.internal.jx;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager {
    private static TagManager atW;
    private final DataLayer aqn;
    private final r asD;
    private final a atT;
    private final cx atU;
    private final ConcurrentMap atV;
    private final Context mContext;

    interface a {
    }

    /* synthetic */ class AnonymousClass_4 {
        static final int[] atY;

        static {
            atY = new int[a.values().length];
            try {
                atY[a.asq.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                atY[a.asr.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                atY[a.ass.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    TagManager(Context context, a aVar, DataLayer dataLayer, cx cxVar) {
        int i = DataLayer.a;
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.mContext = context.getApplicationContext();
        this.atU = cxVar;
        this.atT = aVar;
        this.atV = new ConcurrentHashMap();
        this.aqn = dataLayer;
        this.aqn.a(new b() {
            final TagManager atX;

            {
                this.atX = r1;
            }

            public void C(Map map) {
                Object obj = map.get("event");
                if (obj != null) {
                    TagManager.a(this.atX, obj.toString());
                }
            }
        });
        this.aqn.a(new d(this.mContext));
        this.asD = new r();
        qP();
        if (i != 0) {
            jx.a++;
        }
    }

    static void a(TagManager tagManager, String str) {
        tagManager.cV(str);
    }

    private void cV(String str) {
        int i = DataLayer.a;
        for (n nVar : this.atV.keySet()) {
            nVar.cr(str);
            if (i != 0) {
                return;
            }
        }
    }

    public static TagManager getInstance(Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            try {
                if (atW == null) {
                    if (context == null) {
                        bh.T("TagManager.getInstance requires non-null context.");
                        throw new NullPointerException();
                    }
                    atW = new TagManager(context, new a() {
                    }, new DataLayer(new v(context)), cy.qN());
                }
                tagManager = atW;
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return tagManager;
    }

    private void qP() {
        try {
            if (VERSION.SDK_INT >= 14) {
                this.mContext.registerComponentCallbacks(new ComponentCallbacks2() {
                    final TagManager atX;

                    {
                        this.atX = r1;
                    }

                    public void onConfigurationChanged(Configuration configuration) {
                    }

                    public void onLowMemory() {
                    }

                    public void onTrimMemory(int i) {
                        if (i == 20) {
                            this.atX.dispatch();
                        }
                    }
                });
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    boolean b(n nVar) {
        try {
            return this.atV.remove(nVar) != null;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void dispatch() {
        this.atU.dispatch();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    synchronized boolean i(android.net.Uri r7) {
        /*
        r6_this = this;
        monitor-enter(r6);
        r1 = com.google.android.gms.tagmanager.DataLayer.a;	 Catch:{ all -> 0x008c }
        r2 = com.google.android.gms.tagmanager.ce.qa();	 Catch:{ all -> 0x008c }
        r0 = r2.i(r7);	 Catch:{ all -> 0x008c }
        if (r0 == 0) goto L_0x0095;
    L_0x000d:
        r3 = r2.getContainerId();	 Catch:{ all -> 0x008c }
        r0 = com.google.android.gms.tagmanager.TagManager.AnonymousClass_4.atY;	 Catch:{ all -> 0x008c }
        r4 = r2.qb();	 Catch:{ all -> 0x008c }
        r4 = r4.ordinal();	 Catch:{ all -> 0x008c }
        r0 = r0[r4];	 Catch:{ all -> 0x008c }
        switch(r0) {
            case 1: goto L_0x0023;
            case 2: goto L_0x004e;
            case 3: goto L_0x004e;
            default: goto L_0x0020;
        };
    L_0x0020:
        r0 = 1;
    L_0x0021:
        monitor-exit(r6);
        return r0;
    L_0x0023:
        r0 = r6.atV;	 Catch:{ all -> 0x008c }
        r0 = r0.keySet();	 Catch:{ all -> 0x008c }
        r4 = r0.iterator();	 Catch:{ all -> 0x008c }
    L_0x002d:
        r0 = r4.hasNext();	 Catch:{ all -> 0x008c }
        if (r0 == 0) goto L_0x004c;
    L_0x0033:
        r0 = r4.next();	 Catch:{ all -> 0x008c }
        r0 = (com.google.android.gms.tagmanager.n) r0;	 Catch:{ all -> 0x008c }
        r5 = r0.getContainerId();	 Catch:{ NullPointerException -> 0x008a }
        r5 = r5.equals(r3);	 Catch:{ NullPointerException -> 0x008a }
        if (r5 == 0) goto L_0x004a;
    L_0x0043:
        r5 = 0;
        r0.ct(r5);	 Catch:{ NullPointerException -> 0x008a }
        r0.refresh();	 Catch:{ NullPointerException -> 0x008a }
    L_0x004a:
        if (r1 == 0) goto L_0x002d;
    L_0x004c:
        if (r1 == 0) goto L_0x0020;
    L_0x004e:
        r0 = r6.atV;	 Catch:{ all -> 0x008c }
        r0 = r0.keySet();	 Catch:{ all -> 0x008c }
        r4 = r0.iterator();	 Catch:{ all -> 0x008c }
    L_0x0058:
        r0 = r4.hasNext();	 Catch:{ all -> 0x008c }
        if (r0 == 0) goto L_0x0020;
    L_0x005e:
        r0 = r4.next();	 Catch:{ all -> 0x008c }
        r0 = (com.google.android.gms.tagmanager.n) r0;	 Catch:{ all -> 0x008c }
        r5 = r0.getContainerId();	 Catch:{ NullPointerException -> 0x008f }
        r5 = r5.equals(r3);	 Catch:{ NullPointerException -> 0x008f }
        if (r5 == 0) goto L_0x007a;
    L_0x006e:
        r5 = r2.qc();	 Catch:{ NullPointerException -> 0x0091 }
        r0.ct(r5);	 Catch:{ NullPointerException -> 0x0091 }
        r0.refresh();	 Catch:{ NullPointerException -> 0x0091 }
        if (r1 == 0) goto L_0x0087;
    L_0x007a:
        r5 = r0.pl();	 Catch:{ NullPointerException -> 0x0093 }
        if (r5 == 0) goto L_0x0087;
    L_0x0080:
        r5 = 0;
        r0.ct(r5);	 Catch:{ NullPointerException -> 0x0093 }
        r0.refresh();	 Catch:{ NullPointerException -> 0x0093 }
    L_0x0087:
        if (r1 == 0) goto L_0x0058;
    L_0x0089:
        goto L_0x0020;
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0093 }
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008c }
    L_0x0095:
        r0 = 0;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.TagManager.i(android.net.Uri):boolean");
    }
}
