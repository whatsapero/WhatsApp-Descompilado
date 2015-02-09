package com.whatsapp;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map.Entry;

public class w7 {
    private final Handler a;
    private final HashMap b;
    private final HashMap c;

    public void a(String str, String str2, int i) {
        akl com_whatsapp_akl;
        akl com_whatsapp_akl2 = (akl) this.b.get(str);
        if (com_whatsapp_akl2 == null) {
            com_whatsapp_akl2 = new akl(null);
            this.b.put(str, com_whatsapp_akl2);
            com_whatsapp_akl = com_whatsapp_akl2;
        } else {
            com_whatsapp_akl = com_whatsapp_akl2;
        }
        if (str2 != null && bd.b(str)) {
            if (com_whatsapp_akl.d == null) {
                com_whatsapp_akl.d = new HashMap();
            }
            ef efVar = (ef) com_whatsapp_akl.d.get(str2);
            if (efVar == null) {
                efVar = new ef(null);
                com_whatsapp_akl.d.put(str2, efVar);
            }
            efVar.a = System.currentTimeMillis();
            efVar.b = i;
        }
        com_whatsapp_akl.a = System.currentTimeMillis();
        com_whatsapp_akl.c = i;
        String str3 = str + str2;
        Runnable runnable = (jz) this.c.get(str3);
        if (runnable == null) {
            runnable = new jz(this, str, str2);
            this.c.put(str3, runnable);
        }
        this.a.removeCallbacks(runnable);
        this.a.postDelayed(runnable, 25000);
    }

    public long c(String str) {
        akl com_whatsapp_akl = (akl) this.b.get(str);
        return com_whatsapp_akl == null ? 0 : com_whatsapp_akl.e;
    }

    public l2 d(String str) {
        int i = App.az;
        akl com_whatsapp_akl = (akl) this.b.get(str);
        if (com_whatsapp_akl == null) {
            return null;
        }
        int i2;
        if (bd.b(str)) {
            if (com_whatsapp_akl.d == null) {
                return null;
            }
            String str2;
            Object obj;
            long j = 0;
            int i3 = -1;
            l2 l2Var = null;
            for (Entry entry : com_whatsapp_akl.d.entrySet()) {
                if (((ef) entry.getValue()).a > j) {
                    String str3 = (String) entry.getKey();
                    j = ((ef) entry.getValue()).a;
                    i2 = ((ef) entry.getValue()).b;
                    str2 = str3;
                } else {
                    i2 = i3;
                    obj = l2Var;
                }
                if (i != 0) {
                    break;
                }
                i3 = i2;
                Object obj2 = str2;
            }
            i2 = i3;
            obj = l2Var;
            if (a(j)) {
                return new l2(str2, i2);
            }
            if (i == 0) {
                return null;
            }
        }
        i2 = b(str, null);
        return i2 != -1 ? new l2(str, i2) : null;
    }

    public int b(String str, String str2) {
        akl com_whatsapp_akl = (akl) this.b.get(str);
        if (com_whatsapp_akl == null) {
            return -1;
        }
        if (str2 == null || !bd.b(str)) {
            return a(com_whatsapp_akl.a) ? com_whatsapp_akl.c : -1;
        } else {
            if (com_whatsapp_akl.d == null) {
                return -1;
            }
            ef efVar = (ef) com_whatsapp_akl.d.get(str2);
            if (efVar == null) {
                return -1;
            }
            return a(efVar.a) ? efVar.b : -1;
        }
    }

    private static boolean a(long j) {
        return j != 0 && 25000 + j > System.currentTimeMillis();
    }

    public void e(String str) {
        akl com_whatsapp_akl = (akl) this.b.get(str);
        if (com_whatsapp_akl == null) {
            com_whatsapp_akl = new akl(null);
            this.b.put(str, com_whatsapp_akl);
        }
        com_whatsapp_akl.e = 1;
    }

    public w7() {
        this.a = new Handler();
        this.c = new HashMap();
        this.b = new HashMap();
    }

    public void a() {
        int i = App.az;
        this.b.clear();
        for (jz jzVar : this.c.values()) {
            this.a.removeCallbacks(jzVar);
            if (i != 0) {
                break;
            }
        }
        this.c.clear();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r9, long r10) {
        /*
        r8_this = this;
        r2 = 0;
        r6 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r8.b;
        r0 = r0.get(r9);
        r0 = (com.whatsapp.akl) r0;
        if (r0 != 0) goto L_0x0019;
    L_0x000f:
        r0 = new com.whatsapp.akl;
        r0.<init>(r2);
        r3 = r8.b;
        r3.put(r9, r0);
    L_0x0019:
        r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0021;
    L_0x001d:
        r0.e = r6;
        if (r1 == 0) goto L_0x0023;
    L_0x0021:
        r0.e = r10;
    L_0x0023:
        r0.a = r6;
        r0 = r8.b;
        r0 = r0.entrySet();
        r3 = r0.iterator();
    L_0x002f:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0064;
    L_0x0035:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r1 = com.whatsapp.bd.b(r1);
        if (r1 == 0) goto L_0x002f;
    L_0x0047:
        r1 = r0.getValue();
        r1 = (com.whatsapp.akl) r1;
        r4 = r1.d;
        if (r4 == 0) goto L_0x002f;
    L_0x0051:
        r1 = r1.d;
        r1 = r1.get(r9);
        r1 = (com.whatsapp.ef) r1;
        if (r1 == 0) goto L_0x002f;
    L_0x005b:
        r1.a = r6;
        r0 = r0.getKey();
        r0 = (java.lang.String) r0;
    L_0x0063:
        return r0;
    L_0x0064:
        r0 = r2;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.w7.a(java.lang.String, long):java.lang.String");
    }

    public void a(String str, String str2) {
        akl com_whatsapp_akl;
        akl com_whatsapp_akl2 = (akl) this.b.get(str);
        if (com_whatsapp_akl2 == null) {
            com_whatsapp_akl2 = new akl(null);
            this.b.put(str, com_whatsapp_akl2);
            com_whatsapp_akl = com_whatsapp_akl2;
        } else {
            com_whatsapp_akl = com_whatsapp_akl2;
        }
        if (str2 != null && bd.b(str)) {
            if (com_whatsapp_akl.d == null) {
                com_whatsapp_akl.d = new HashMap();
            }
            ef efVar = (ef) com_whatsapp_akl.d.get(str2);
            if (efVar == null) {
                efVar = new ef(null);
                com_whatsapp_akl.d.put(str2, efVar);
            }
            efVar.a = 0;
        }
        com_whatsapp_akl.a = 0;
        jz jzVar = (jz) this.c.get(str + str2);
        if (jzVar != null) {
            this.a.removeCallbacks(jzVar);
        }
    }

    public boolean a(String str) {
        if (bd.b(str)) {
            return true;
        }
        akl com_whatsapp_akl = (akl) this.b.get(str);
        boolean z = com_whatsapp_akl == null ? false : com_whatsapp_akl.e == 1;
        return z;
    }

    public boolean b(String str) {
        akl com_whatsapp_akl = (akl) this.b.get(str);
        return com_whatsapp_akl == null ? false : com_whatsapp_akl.b;
    }

    public void a(String str, boolean z) {
        akl com_whatsapp_akl = (akl) this.b.get(str);
        if (com_whatsapp_akl == null) {
            com_whatsapp_akl = new akl(null);
            this.b.put(str, com_whatsapp_akl);
        }
        com_whatsapp_akl.b = z;
        if (!z) {
            com_whatsapp_akl.e = 0;
        }
    }

    static HashMap a(w7 w7Var) {
        return w7Var.b;
    }
}
