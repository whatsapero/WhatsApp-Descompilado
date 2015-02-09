package com.google.android.gms.tagmanager;

import android.net.Uri;

class ce {
    private static ce asm;
    private volatile String aqm;
    private volatile a asn;
    private volatile String aso;
    private volatile String asp;

    enum a {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG;
        public static final a asq;
        public static final a asr;
        public static final a ass;
        private static final a[] ast;

        static {
            asq = new a("NONE", 0);
            asr = new a("CONTAINER", 1);
            ass = new a("CONTAINER_DEBUG", 2);
            ast = new a[]{asq, asr, ass};
        }
    }

    ce() {
        clear();
    }

    private String cK(String str) {
        return str.split("&")[0].split("=")[1];
    }

    private String j(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    static ce qa() {
        ce ceVar;
        synchronized (ce.class) {
            if (asm == null) {
                asm = new ce();
            }
            ceVar = asm;
        }
        return ceVar;
    }

    void clear() {
        this.asn = a.asq;
        this.aso = null;
        this.aqm = null;
        this.asp = null;
    }

    String getContainerId() {
        return this.aqm;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    synchronized boolean i(android.net.Uri r7) {
        /*
        r6_this = this;
        r0 = 1;
        r1 = 0;
        monitor-enter(r6);
        r2 = com.google.android.gms.tagmanager.DataLayer.a;	 Catch:{ all -> 0x007f }
        r3 = r7.toString();	 Catch:{ UnsupportedEncodingException -> 0x007a }
        r4 = "UTF-8";
        r3 = java.net.URLDecoder.decode(r3, r4);	 Catch:{ UnsupportedEncodingException -> 0x007a }
        r4 = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$";
        r4 = r3.matches(r4);	 Catch:{ UnsupportedEncodingException -> 0x007d }
        if (r4 == 0) goto L_0x0041;
    L_0x0017:
        r4 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x007d }
        r4.<init>();	 Catch:{ UnsupportedEncodingException -> 0x007d }
        r5 = "Container preview url: ";
        r4 = r4.append(r5);	 Catch:{ UnsupportedEncodingException -> 0x007d }
        r4 = r4.append(r3);	 Catch:{ UnsupportedEncodingException -> 0x007d }
        r4 = r4.toString();	 Catch:{ UnsupportedEncodingException -> 0x007d }
        com.google.android.gms.tagmanager.bh.V(r4);	 Catch:{ UnsupportedEncodingException -> 0x007d }
        r4 = ".*?&gtm_debug=x$";
        r4 = r3.matches(r4);	 Catch:{ UnsupportedEncodingException -> 0x007d }
        if (r4 == 0) goto L_0x003b;
    L_0x0035:
        r4 = com.google.android.gms.tagmanager.ce.a.ass;	 Catch:{ UnsupportedEncodingException -> 0x0082 }
        r6.asn = r4;	 Catch:{ UnsupportedEncodingException -> 0x0082 }
        if (r2 == 0) goto L_0x00a4;
    L_0x003b:
        r4 = com.google.android.gms.tagmanager.ce.a.asr;	 Catch:{ UnsupportedEncodingException -> 0x0084 }
        r6.asn = r4;	 Catch:{ UnsupportedEncodingException -> 0x0084 }
        if (r2 == 0) goto L_0x00a4;
    L_0x0041:
        r2 = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$";
        r2 = r3.matches(r2);	 Catch:{ UnsupportedEncodingException -> 0x0086 }
        if (r2 == 0) goto L_0x008c;
    L_0x0049:
        r2 = r7.getQuery();	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r2 = r6.cK(r2);	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r3 = r6.aqm;	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r2 = r2.equals(r3);	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        if (r2 == 0) goto L_0x008a;
    L_0x0059:
        r1 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r1.<init>();	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r2 = "Exit preview mode for container: ";
        r1 = r1.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r2 = r6.aqm;	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r1 = r1.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r1 = r1.toString();	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        com.google.android.gms.tagmanager.bh.V(r1);	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r1 = com.google.android.gms.tagmanager.ce.a.asq;	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r6.asn = r1;	 Catch:{ UnsupportedEncodingException -> 0x0088 }
        r1 = 0;
        r6.aso = r1;	 Catch:{ UnsupportedEncodingException -> 0x0088 }
    L_0x0078:
        monitor-exit(r6);
        return r0;
    L_0x007a:
        r0 = move-exception;
        r0 = r1;
        goto L_0x0078;
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0084 }
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x007f }
    L_0x008a:
        r0 = r1;
        goto L_0x0078;
    L_0x008c:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x007f }
        r0.<init>();	 Catch:{ all -> 0x007f }
        r2 = "Invalid preview uri: ";
        r0 = r0.append(r2);	 Catch:{ all -> 0x007f }
        r0 = r0.append(r3);	 Catch:{ all -> 0x007f }
        r0 = r0.toString();	 Catch:{ all -> 0x007f }
        com.google.android.gms.tagmanager.bh.W(r0);	 Catch:{ all -> 0x007f }
        r0 = r1;
        goto L_0x0078;
    L_0x00a4:
        r1 = r6.j(r7);	 Catch:{ UnsupportedEncodingException -> 0x00d6 }
        r6.asp = r1;	 Catch:{ UnsupportedEncodingException -> 0x00d6 }
        r1 = r6.asn;	 Catch:{ UnsupportedEncodingException -> 0x00d6 }
        r2 = com.google.android.gms.tagmanager.ce.a.asr;	 Catch:{ UnsupportedEncodingException -> 0x00d6 }
        if (r1 == r2) goto L_0x00b6;
    L_0x00b0:
        r1 = r6.asn;	 Catch:{ UnsupportedEncodingException -> 0x00d8 }
        r2 = com.google.android.gms.tagmanager.ce.a.ass;	 Catch:{ UnsupportedEncodingException -> 0x00d8 }
        if (r1 != r2) goto L_0x00cd;
    L_0x00b6:
        r1 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x00d8 }
        r1.<init>();	 Catch:{ UnsupportedEncodingException -> 0x00d8 }
        r2 = "/r?";
        r1 = r1.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x00d8 }
        r2 = r6.asp;	 Catch:{ UnsupportedEncodingException -> 0x00d8 }
        r1 = r1.append(r2);	 Catch:{ UnsupportedEncodingException -> 0x00d8 }
        r1 = r1.toString();	 Catch:{ UnsupportedEncodingException -> 0x00d8 }
        r6.aso = r1;	 Catch:{ UnsupportedEncodingException -> 0x00d8 }
    L_0x00cd:
        r1 = r6.asp;	 Catch:{ all -> 0x007f }
        r1 = r6.cK(r1);	 Catch:{ all -> 0x007f }
        r6.aqm = r1;	 Catch:{ all -> 0x007f }
        goto L_0x0078;
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x007f }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.ce.i(android.net.Uri):boolean");
    }

    a qb() {
        return this.asn;
    }

    String qc() {
        return this.aso;
    }
}
