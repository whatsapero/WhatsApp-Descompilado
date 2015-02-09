package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataLayer {
    public static final Object OBJECT_NOT_PRESENT;
    public static int a;
    static final String[] aqQ;
    private static final Pattern aqR;
    private final ConcurrentHashMap aqS;
    private final Map aqT;
    private final ReentrantLock aqU;
    private final LinkedList aqV;
    private final c aqW;
    private final CountDownLatch aqX;

    interface c {

        public interface a {
            void h(List list);
        }

        void a(a aVar);

        void a(List list, long j);
    }

    final class a {
        public final String KP;
        public final Object wF;

        a(String str, Object obj) {
            this.KP = str;
            this.wF = obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.KP.equals(aVar.KP) && this.wF.equals(aVar.wF);
        }

        public int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.KP.hashCode()), Integer.valueOf(this.wF.hashCode())});
        }

        public String toString() {
            return "Key: " + this.KP + " value: " + this.wF.toString();
        }
    }

    interface b {
        void C(Map map);
    }

    static {
        OBJECT_NOT_PRESENT = new Object();
        aqQ = "gtm.lifetime".toString().split("\\.");
        aqR = Pattern.compile("(\\d+)\\s*([smhd]?)");
    }

    DataLayer() {
        this(new c() {
            public void a(com.google.android.gms.tagmanager.DataLayer.c.a aVar) {
                aVar.h(new ArrayList());
            }

            public void a(List list, long j) {
            }
        });
    }

    DataLayer(c cVar) {
        int i = a;
        this.aqW = cVar;
        this.aqS = new ConcurrentHashMap();
        this.aqT = new HashMap();
        this.aqU = new ReentrantLock();
        this.aqV = new LinkedList();
        this.aqX = new CountDownLatch(1);
        pv();
        if (jx.a != 0) {
            a = i + 1;
        }
    }

    private void E(Map map) {
        this.aqU.lock();
        try {
            this.aqV.offer(map);
            if (this.aqU.getHoldCount() == 1) {
                pw();
            }
            F(map);
        } finally {
            this.aqU.unlock();
        }
    }

    private void F(Map map) {
        Long G = G(map);
        if (G != null) {
            List I = I(map);
            I.remove("gtm.lifetime");
            this.aqW.a(I, G.longValue());
        }
    }

    private Long G(Map map) {
        Object H = H(map);
        return H == null ? null : cy(H.toString());
    }

    private Object H(Map map) {
        int i = a;
        String[] strArr = aqQ;
        int length = strArr.length;
        int i2 = 0;
        Object obj = map;
        while (i2 < length) {
            Object obj2 = strArr[i2];
            try {
                if (!(obj instanceof Map)) {
                    return null;
                }
                obj = ((Map) obj).get(obj2);
                i2++;
                if (i != 0) {
                    return obj;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return obj;
    }

    private List I(Map map) {
        Object arrayList = new ArrayList();
        a(map, "", arrayList);
        return arrayList;
    }

    private void J(Map map) {
        int i = a;
        synchronized (this.aqT) {
            for (String str : map.keySet()) {
                a(c(str, map.get(str)), this.aqT);
                if (i != 0) {
                    break;
                }
            }
        }
        K(map);
    }

    private void K(Map map) {
        int i = a;
        for (b bVar : this.aqS.keySet()) {
            bVar.C(map);
            if (i != 0) {
                return;
            }
        }
    }

    static CountDownLatch a(DataLayer dataLayer) {
        return dataLayer.aqX;
    }

    static void a(DataLayer dataLayer, Map map) {
        dataLayer.E(map);
    }

    private void a(java.util.Map r6, java.lang.String r7, java.util.Collection r8) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
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
        r2 = a;
        r0 = r6.entrySet();
        r3 = r0.iterator();
    L_0x000a:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0062;
    L_0x0010:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = r1.append(r7);
        r1 = r7.length();
        if (r1 != 0) goto L_0x0063;
    L_0x0025:
        r1 = "";
    L_0x0027:
        r4 = r4.append(r1);
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r1 = r4.append(r1);
        r4 = r1.toString();
        r1 = r0.getValue();
        r1 = r1 instanceof java.util.Map;
        if (r1 == 0) goto L_0x004c;
    L_0x0041:
        r1 = r0.getValue();
        r1 = (java.util.Map) r1;
        r5.a(r1, r4, r8);	 Catch:{ NumberFormatException -> 0x0066 }
        if (r2 == 0) goto L_0x0060;
    L_0x004c:
        r1 = "gtm.lifetime";	 Catch:{ NumberFormatException -> 0x0068 }
        r1 = r4.equals(r1);	 Catch:{ NumberFormatException -> 0x0068 }
        if (r1 != 0) goto L_0x0060;	 Catch:{ NumberFormatException -> 0x0068 }
    L_0x0054:
        r1 = new com.google.android.gms.tagmanager.DataLayer$a;	 Catch:{ NumberFormatException -> 0x0068 }
        r0 = r0.getValue();	 Catch:{ NumberFormatException -> 0x0068 }
        r1.<init>(r4, r0);	 Catch:{ NumberFormatException -> 0x0068 }
        r8.add(r1);	 Catch:{ NumberFormatException -> 0x0068 }
    L_0x0060:
        if (r2 == 0) goto L_0x000a;
    L_0x0062:
        return;
    L_0x0063:
        r1 = ".";
        goto L_0x0027;
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.DataLayer.a(java.util.Map, java.lang.String, java.util.Collection):void");
    }

    static Long cy(String str) {
        Matcher matcher = aqR.matcher(str);
        try {
            if (matcher.matches()) {
                long parseLong;
                try {
                    parseLong = Long.parseLong(matcher.group(1));
                } catch (NumberFormatException e) {
                    bh.W("illegal number in _lifetime value: " + str);
                    parseLong = 0;
                }
                if (parseLong <= 0) {
                    try {
                        bh.U("non-positive _lifetime: " + str);
                        return null;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                String group = matcher.group(2);
                try {
                    if (group.length() == 0) {
                        return Long.valueOf(parseLong);
                    }
                    try {
                        switch (group.charAt(0)) {
                            case 'd':
                                return Long.valueOf((((parseLong * 1000) * 60) * 60) * 24);
                            case 'h':
                                return Long.valueOf(((parseLong * 1000) * 60) * 60);
                            case 'm':
                                return Long.valueOf((parseLong * 1000) * 60);
                            case 's':
                                return Long.valueOf(parseLong * 1000);
                            default:
                                bh.W("unknown units in _lifetime: " + str);
                                return null;
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                    throw e22;
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            }
            bh.U("unknown _lifetime: " + str);
            return null;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    private void pv() {
        this.aqW.a(new a() {
            final DataLayer aqY;

            {
                this.aqY = r1;
            }

            public void h(List list) {
                int i = a;
                for (a aVar : list) {
                    DataLayer.a(this.aqY, this.aqY.c(aVar.KP, aVar.wF));
                    if (i != 0) {
                        break;
                    }
                }
                DataLayer.a(this.aqY).countDown();
            }
        });
    }

    private void pw() {
        int i = 0;
        while (true) {
            Map map = (Map) this.aqV.poll();
            if (map != null) {
                J(map);
                int i2 = i + 1;
                if (i2 > 500) {
                    break;
                }
                i = i2;
            } else {
                return;
            }
        }
        this.aqV.clear();
        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
    }

    void a(b bVar) {
        this.aqS.put(bVar, Integer.valueOf(0));
    }

    void a(java.util.Map r7, java.util.Map r8) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
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
        r6_this = this;
        r4 = a;
        r0 = r7.keySet();
        r5 = r0.iterator();
    L_0x000a:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0063;
    L_0x0010:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r2 = r7.get(r0);
        r1 = r2 instanceof java.util.List;	 Catch:{ NumberFormatException -> 0x0064 }
        if (r1 == 0) goto L_0x003c;
    L_0x001e:
        r1 = r8.get(r0);	 Catch:{ NumberFormatException -> 0x0066 }
        r1 = r1 instanceof java.util.List;	 Catch:{ NumberFormatException -> 0x0066 }
        if (r1 != 0) goto L_0x002e;	 Catch:{ NumberFormatException -> 0x0066 }
    L_0x0026:
        r1 = new java.util.ArrayList;	 Catch:{ NumberFormatException -> 0x0066 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x0066 }
        r8.put(r0, r1);	 Catch:{ NumberFormatException -> 0x0066 }
    L_0x002e:
        r1 = r2;
        r1 = (java.util.List) r1;
        r3 = r8.get(r0);
        r3 = (java.util.List) r3;
        r6.b(r1, r3);	 Catch:{ NumberFormatException -> 0x0068 }
        if (r4 == 0) goto L_0x0061;
    L_0x003c:
        r1 = r2 instanceof java.util.Map;	 Catch:{ NumberFormatException -> 0x006a }
        if (r1 == 0) goto L_0x005e;
    L_0x0040:
        r1 = r8.get(r0);	 Catch:{ NumberFormatException -> 0x006c }
        r1 = r1 instanceof java.util.Map;	 Catch:{ NumberFormatException -> 0x006c }
        if (r1 != 0) goto L_0x0050;	 Catch:{ NumberFormatException -> 0x006c }
    L_0x0048:
        r1 = new java.util.HashMap;	 Catch:{ NumberFormatException -> 0x006c }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x006c }
        r8.put(r0, r1);	 Catch:{ NumberFormatException -> 0x006c }
    L_0x0050:
        r1 = r2;
        r1 = (java.util.Map) r1;
        r3 = r8.get(r0);
        r3 = (java.util.Map) r3;
        r6.a(r1, r3);	 Catch:{ NumberFormatException -> 0x006e }
        if (r4 == 0) goto L_0x0061;	 Catch:{ NumberFormatException -> 0x006e }
    L_0x005e:
        r8.put(r0, r2);	 Catch:{ NumberFormatException -> 0x006e }
    L_0x0061:
        if (r4 == 0) goto L_0x000a;
    L_0x0063:
        return;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.DataLayer.a(java.util.Map, java.util.Map):void");
    }

    void b(java.util.List r6, java.util.List r7) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
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
        r4 = a;
    L_0x0002:
        r0 = r7.size();
        r1 = r6.size();
        if (r0 >= r1) goto L_0x0012;
    L_0x000c:
        r0 = 0;
        r7.add(r0);
        if (r4 == 0) goto L_0x0002;
    L_0x0012:
        r0 = 0;
        r3 = r0;
    L_0x0014:
        r0 = r6.size();
        if (r3 >= r0) goto L_0x006d;
    L_0x001a:
        r1 = r6.get(r3);
        r0 = r1 instanceof java.util.List;	 Catch:{ NumberFormatException -> 0x006e }
        if (r0 == 0) goto L_0x0040;
    L_0x0022:
        r0 = r7.get(r3);	 Catch:{ NumberFormatException -> 0x0070 }
        r0 = r0 instanceof java.util.List;	 Catch:{ NumberFormatException -> 0x0070 }
        if (r0 != 0) goto L_0x0032;	 Catch:{ NumberFormatException -> 0x0070 }
    L_0x002a:
        r0 = new java.util.ArrayList;	 Catch:{ NumberFormatException -> 0x0070 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0070 }
        r7.set(r3, r0);	 Catch:{ NumberFormatException -> 0x0070 }
    L_0x0032:
        r0 = r1;
        r0 = (java.util.List) r0;
        r2 = r7.get(r3);
        r2 = (java.util.List) r2;
        r5.b(r0, r2);	 Catch:{ NumberFormatException -> 0x0072 }
        if (r4 == 0) goto L_0x0069;
    L_0x0040:
        r0 = r1 instanceof java.util.Map;	 Catch:{ NumberFormatException -> 0x0074 }
        if (r0 == 0) goto L_0x0062;
    L_0x0044:
        r0 = r7.get(r3);	 Catch:{ NumberFormatException -> 0x0076 }
        r0 = r0 instanceof java.util.Map;	 Catch:{ NumberFormatException -> 0x0076 }
        if (r0 != 0) goto L_0x0054;	 Catch:{ NumberFormatException -> 0x0076 }
    L_0x004c:
        r0 = new java.util.HashMap;	 Catch:{ NumberFormatException -> 0x0076 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0076 }
        r7.set(r3, r0);	 Catch:{ NumberFormatException -> 0x0076 }
    L_0x0054:
        r0 = r1;
        r0 = (java.util.Map) r0;
        r2 = r7.get(r3);
        r2 = (java.util.Map) r2;
        r5.a(r0, r2);	 Catch:{ NumberFormatException -> 0x0078 }
        if (r4 == 0) goto L_0x0069;
    L_0x0062:
        r0 = OBJECT_NOT_PRESENT;	 Catch:{ NumberFormatException -> 0x007a }
        if (r1 == r0) goto L_0x0069;	 Catch:{ NumberFormatException -> 0x007a }
    L_0x0066:
        r7.set(r3, r1);	 Catch:{ NumberFormatException -> 0x007a }
    L_0x0069:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x007c;
    L_0x006d:
        return;
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0074 }
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
        throw r0;
    L_0x007c:
        r3 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.DataLayer.b(java.util.List, java.util.List):void");
    }

    Map c(String str, Object obj) {
        Map hashMap;
        int i = a;
        Map hashMap2 = new HashMap();
        String[] split = str.toString().split("\\.");
        int i2 = 0;
        Map map = hashMap2;
        while (i2 < split.length - 1) {
            hashMap = new HashMap();
            map.put(split[i2], hashMap);
            i2++;
            if (i != 0) {
                break;
            }
            map = hashMap;
        }
        hashMap = map;
        hashMap.put(split[split.length - 1], obj);
        return hashMap2;
    }

    public void push(Map map) {
        try {
            this.aqX.await();
        } catch (InterruptedException e) {
            bh.W("DataLayer.push: unexpected InterruptedException");
        }
        E(map);
    }

    public String toString() {
        String toString;
        int i = a;
        synchronized (this.aqT) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Entry entry : this.aqT.entrySet()) {
                stringBuilder.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[]{entry.getKey(), entry.getValue()}));
                if (i != 0) {
                    break;
                }
            }
            toString = stringBuilder.toString();
        }
        return toString;
    }
}
