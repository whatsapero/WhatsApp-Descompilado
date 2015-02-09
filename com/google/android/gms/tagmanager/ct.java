package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.cr.e;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class ct {
    private static final bz atb;
    private final DataLayer aqn;
    private final ag atd;
    private final Map ate;
    private final Map atf;
    private final Map atg;
    private final k ath;
    private final k ati;
    private final Set atj;
    private final Map atk;
    private volatile String atl;
    private int atm;

    interface a {
        void a(e eVar, Set set, Set set2, cn cnVar);
    }

    class AnonymousClass_3 implements a {
        final ct atn;
        final Map ato;
        final Map atp;
        final Map atq;
        final Map atr;

        AnonymousClass_3(ct ctVar, Map map, Map map2, Map map3, Map map4) {
            this.atn = ctVar;
            this.ato = map;
            this.atp = map2;
            this.atq = map3;
            this.atr = map4;
        }

        public void a(e eVar, Set set, Set set2, cn cnVar) {
            List list = (List) this.ato.get(eVar);
            List list2 = (List) this.atp.get(eVar);
            if (list != null) {
                set.addAll(list);
                cnVar.pR().c(list, list2);
            }
            list = (List) this.atq.get(eVar);
            list2 = (List) this.atr.get(eVar);
            if (list != null) {
                set2.addAll(list);
                cnVar.pS().c(list, list2);
            }
        }
    }

    class b {
        private com.google.android.gms.internal.d.a asN;
        private bz ats;

        public b(bz bzVar, com.google.android.gms.internal.d.a aVar) {
            this.ats = bzVar;
            this.asN = aVar;
        }

        public bz qG() {
            return this.ats;
        }

        public com.google.android.gms.internal.d.a qm() {
            return this.asN;
        }
    }

    class c {
        private final Set atj;
        private final Map att;
        private final Map atu;
        private final Map atv;
        private final Map atw;
        private com.google.android.gms.tagmanager.cr.a atx;

        public c() {
            this.atj = new HashSet();
            this.att = new HashMap();
            this.atv = new HashMap();
            this.atu = new HashMap();
            this.atw = new HashMap();
        }

        public Set qH() {
            return this.atj;
        }

        public Map qI() {
            return this.att;
        }

        public Map qJ() {
            return this.atv;
        }

        public Map qK() {
            return this.atw;
        }

        public Map qL() {
            return this.atu;
        }

        public com.google.android.gms.tagmanager.cr.a qM() {
            return this.atx;
        }
    }

    static {
        atb = new bz(di.rb(), true);
    }

    private bz a(com.google.android.gms.internal.d.a aVar, Set set, dl dlVar) {
        int i = DataLayer.a;
        if (!aVar.gF) {
            return new bz(aVar, true);
        }
        com.google.android.gms.internal.d.a g;
        int i2;
        bz a;
        int i3;
        switch (aVar.type) {
            case ay.n /*2*/:
                g = cr.g(aVar);
                g.gw = new com.google.android.gms.internal.d.a[aVar.gw.length];
                i2 = 0;
                while (i2 < aVar.gw.length) {
                    a = a(aVar.gw[i2], set, dlVar.fK(i2));
                    if (a == atb) {
                        return atb;
                    }
                    g.gw[i2] = (com.google.android.gms.internal.d.a) a.getObject();
                    i3 = i2 + 1;
                    if (i != 0) {
                        return new bz(g, false);
                    }
                    i2 = i3;
                }
                return new bz(g, false);
            case ay.p /*3*/:
                g = cr.g(aVar);
                if (aVar.gx.length != aVar.gy.length) {
                    bh.T("Invalid serving value: " + aVar.toString());
                    return atb;
                }
                g.gx = new com.google.android.gms.internal.d.a[aVar.gx.length];
                g.gy = new com.google.android.gms.internal.d.a[aVar.gx.length];
                i2 = 0;
                while (i2 < aVar.gx.length) {
                    a = a(aVar.gx[i2], set, dlVar.fL(i2));
                    bz a2 = a(aVar.gy[i2], set, dlVar.fM(i2));
                    if (a == atb || a2 == atb) {
                        return atb;
                    }
                    g.gx[i2] = (com.google.android.gms.internal.d.a) a.getObject();
                    g.gy[i2] = (com.google.android.gms.internal.d.a) a2.getObject();
                    i3 = i2 + 1;
                    if (i != 0) {
                        return new bz(g, false);
                    }
                    i2 = i3;
                }
                return new bz(g, false);
            case aj.i /*4*/:
                if (set.contains(aVar.gz)) {
                    bh.T("Macro cycle detected.  Current macro reference: " + aVar.gz + "." + "  Previous macro references: " + set.toString() + ".");
                    return atb;
                }
                set.add(aVar.gz);
                a = dm.a(a(aVar.gz, set, dlVar.pW()), aVar.gE);
                set.remove(aVar.gz);
                return a;
            case a8.s /*7*/:
                g = cr.g(aVar);
                g.gD = new com.google.android.gms.internal.d.a[aVar.gD.length];
                i2 = 0;
                while (i2 < aVar.gD.length) {
                    a = a(aVar.gD[i2], set, dlVar.fN(i2));
                    if (a == atb) {
                        return atb;
                    }
                    g.gD[i2] = (com.google.android.gms.internal.d.a) a.getObject();
                    i3 = i2 + 1;
                    if (i != 0) {
                        return new bz(g, false);
                    }
                    i2 = i3;
                }
                return new bz(g, false);
            default:
                bh.T("Unknown type: " + aVar.type);
                return atb;
        }
    }

    private bz a(String str, Set set, bk bkVar) {
        this.atm++;
        b bVar = (b) this.ati.get(str);
        if (bVar == null || this.atd.pH()) {
            c cVar = (c) this.atk.get(str);
            if (cVar == null) {
                bh.T(qF() + "Invalid macro: " + str);
                this.atm--;
                return atb;
            }
            com.google.android.gms.tagmanager.cr.a qM;
            bz a = a(str, cVar.qH(), cVar.qI(), cVar.qJ(), cVar.qL(), cVar.qK(), set, bkVar.py());
            if (((Set) a.getObject()).isEmpty()) {
                qM = cVar.qM();
            } else {
                if (((Set) a.getObject()).size() > 1) {
                    bh.W(qF() + "Multiple macros active for macroName " + str);
                }
                qM = (com.google.android.gms.tagmanager.cr.a) ((Set) a.getObject()).iterator().next();
            }
            if (qM == null) {
                this.atm--;
                return atb;
            }
            bz a2 = a(this.atg, qM, set, bkVar.pN());
            boolean z = a.pX() && a2.pX();
            bz bzVar = a2 == atb ? atb : new bz(a2.getObject(), z);
            com.google.android.gms.internal.d.a qm = qM.qm();
            if (bzVar.pX()) {
                this.ati.e(str, new b(bzVar, qm));
            }
            a(qm, set);
            this.atm--;
            return bzVar;
        }
        a(bVar.qm(), set);
        this.atm--;
        return bVar.qG();
    }

    private bz a(Map map, com.google.android.gms.tagmanager.cr.a aVar, Set set, ck ckVar) {
        int i = DataLayer.a;
        com.google.android.gms.internal.d.a aVar2 = (com.google.android.gms.internal.d.a) aVar.ql().get(com.google.android.gms.internal.b.cU.toString());
        if (aVar2 == null) {
            bh.T("No function id in properties");
            return atb;
        }
        String str = aVar2.gA;
        aj ajVar = (aj) map.get(str);
        if (ajVar == null) {
            bh.T(str + " has no backing implementation.");
            return atb;
        }
        bz bzVar = (bz) this.ath.get(aVar);
        if (bzVar != null && !this.atd.pH()) {
            return bzVar;
        }
        Object obj;
        Map hashMap = new HashMap();
        Object obj2 = 1;
        for (Entry entry : aVar.ql().entrySet()) {
            bz a = a((com.google.android.gms.internal.d.a) entry.getValue(), set, ckVar.cJ((String) entry.getKey()).e((com.google.android.gms.internal.d.a) entry.getValue()));
            if (a != atb) {
                if (a.pX()) {
                    aVar.a((String) entry.getKey(), (com.google.android.gms.internal.d.a) a.getObject());
                    if (i == 0) {
                        obj = obj2;
                        hashMap.put(entry.getKey(), a.getObject());
                        if (i != 0) {
                            break;
                        }
                        obj2 = obj;
                    }
                }
                obj = null;
                hashMap.put(entry.getKey(), a.getObject());
                if (i != 0) {
                    break;
                }
                obj2 = obj;
            } else {
                return atb;
            }
        }
        obj = obj2;
        if (ajVar.a(hashMap.keySet())) {
            boolean z = obj != null && ajVar.pe();
            bz bzVar2 = new bz(ajVar.B(hashMap), z);
            if (z) {
                this.ath.e(aVar, bzVar2);
            }
            ckVar.d((com.google.android.gms.internal.d.a) bzVar2.getObject());
            return bzVar2;
        }
        bh.T("Incorrect keys for function " + str + " required " + ajVar.pJ() + " had " + hashMap.keySet());
        return atb;
    }

    private bz a(Set set, Set set2, a aVar, cs csVar) {
        boolean z;
        int i = DataLayer.a;
        Set hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        boolean z2 = true;
        for (e eVar : set) {
            cn pV = csVar.pV();
            bz a = a(eVar, set2, pV);
            if (((Boolean) a.getObject()).booleanValue()) {
                aVar.a(eVar, hashSet, hashSet2, pV);
            }
            z = z2 && a.pX();
            if (i != 0) {
                break;
            }
            z2 = z;
        }
        z = z2;
        hashSet.removeAll(hashSet2);
        csVar.b(hashSet);
        return new bz(hashSet, z);
    }

    private void a(com.google.android.gms.internal.d.a aVar, Set set) {
        int i = DataLayer.a;
        if (aVar != null) {
            bz a = a(aVar, set, new bx());
            if (a != atb) {
                Object o = di.o((com.google.android.gms.internal.d.a) a.getObject());
                if (o instanceof Map) {
                    this.aqn.push((Map) o);
                    if (i == 0) {
                        return;
                    }
                }
                if (o instanceof List) {
                    for (Object obj : (List) o) {
                        if (obj instanceof Map) {
                            this.aqn.push((Map) obj);
                            if (i == 0) {
                                continue;
                                if (i != 0) {
                                    break;
                                }
                            }
                        }
                        bh.W("pushAfterEvaluate: value not a Map");
                        continue;
                        if (i != 0) {
                            break;
                        }
                    }
                    if (i == 0) {
                        return;
                    }
                }
                bh.W("pushAfterEvaluate: value not a Map or List");
            }
        }
    }

    private String qF() {
        int i = DataLayer.a;
        if (this.atm <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.atm));
        int i2 = 2;
        while (i2 < this.atm) {
            stringBuilder.append(' ');
            i2++;
            if (i != 0) {
                break;
            }
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    bz a(com.google.android.gms.tagmanager.cr.a aVar, Set set, ck ckVar) {
        bz a = a(this.atf, aVar, set, ckVar);
        Boolean n = di.n((com.google.android.gms.internal.d.a) a.getObject());
        ckVar.d(di.u(n));
        return new bz(n, a.pX());
    }

    bz a(e eVar, Set set, cn cnVar) {
        boolean z;
        int i = DataLayer.a;
        boolean z2 = true;
        for (com.google.android.gms.tagmanager.cr.a aVar : eVar.qu()) {
            bz a = a(aVar, set, cnVar.pP());
            if (((Boolean) a.getObject()).booleanValue()) {
                cnVar.f(di.u(Boolean.valueOf(false)));
                return new bz(Boolean.valueOf(false), a.pX());
            }
            z = z2 && a.pX();
            if (i != 0) {
                break;
            }
            z2 = z;
        }
        z = z2;
        z2 = z;
        for (com.google.android.gms.tagmanager.cr.a aVar2 : eVar.qt()) {
            a = a(aVar2, set, cnVar.pQ());
            if (((Boolean) a.getObject()).booleanValue()) {
                z = z2 && a.pX();
                if (i != 0) {
                    break;
                }
                z2 = z;
            } else {
                cnVar.f(di.u(Boolean.valueOf(false)));
                return new bz(Boolean.valueOf(false), a.pX());
            }
        }
        z = z2;
        cnVar.f(di.u(Boolean.valueOf(true)));
        return new bz(Boolean.valueOf(true), z);
    }

    bz a(String str, Set set, Map map, Map map2, Map map3, Map map4, Set set2, cs csVar) {
        return a(set, set2, new AnonymousClass_3(this, map, map2, map3, map4), csVar);
    }

    bz a(Set set, cs csVar) {
        return a(set, new HashSet(), new a() {
            final ct atn;

            {
                this.atn = r1;
            }

            public void a(e eVar, Set set, Set set2, cn cnVar) {
                set.addAll(eVar.qv());
                set2.addAll(eVar.qw());
                cnVar.pT().c(eVar.qv(), eVar.qA());
                cnVar.pU().c(eVar.qw(), eVar.qB());
            }
        }, csVar);
    }

    synchronized void cU(String str) {
        this.atl = str;
    }

    public synchronized void cr(String str) {
        int i = DataLayer.a;
        cU(str);
        af cD = this.atd.cD(str);
        t pF = cD.pF();
        for (com.google.android.gms.tagmanager.cr.a aVar : (Set) a(this.atj, pF.py()).getObject()) {
            a(this.ate, aVar, new HashSet(), pF.px());
            if (i != 0) {
                break;
            }
        }
        cD.pG();
        cU(null);
    }
}
