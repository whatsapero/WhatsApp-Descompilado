package com.whatsapp;

import android.backport.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class cs {
    private static final String[] z;
    private Map a;
    private final String b;
    private String c;

    static {
        String[] strArr = new String[6];
        String str = "H\u0006\u0018oL\u0000L";
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
                        i3 = 104;
                        break;
                    case ay.f /*1*/:
                        i3 = 118;
                        break;
                    case ay.n /*2*/:
                        i3 = 112;
                        break;
                    case ay.p /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = 63;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "YL";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u000f\u0004\u001f{O\u0005\u0011\u0002!L\u0011\u0018\u0013#M\r\u001b\u001fxZE\u0006\u0011|K\u0001\u0015\u0019~^\u0006\u0002J";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\t\u0012\u001dgQ";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000f\u0004\u001f{O\u0005\u0011\u0002!L\u0011\u0018\u0013#^\f\u0012]~^\u001a\u0002\u0019mV\u0018\u0017\u001ez\u0005";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ";>1?";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public cs(String str) {
        this.a = new ConcurrentHashMap();
        this.b = str;
    }

    public Collection b() {
        return this.a.values();
    }

    public l6 a(String str, boolean z, boolean z2) {
        l6 l6Var = (l6) this.a.get(str);
        if (l6Var != null) {
            try {
                l6Var.c = z;
                l6Var.a = z2;
                if (App.az == 0) {
                    return l6Var;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        l6Var = new l6(str, z, z2);
        l6Var.b = bd.e()[this.a.size() % bd.e().length];
        this.a.put(str, l6Var);
        d();
        return l6Var;
    }

    public boolean i() {
        int i = App.az;
        for (l6 l6Var : this.a.values()) {
            try {
                if (!l6Var.a()) {
                    if (i != 0) {
                        break;
                    }
                }
                return true;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return false;
    }

    public int h() {
        return this.a.size();
    }

    private void d() {
        this.c = a(j());
    }

    public String f() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public static String a(Collection collection) {
        int i = App.az;
        List<String> arrayList = new ArrayList(collection);
        Collections.sort(arrayList);
        try {
            MessageDigest instance = MessageDigest.getInstance(z[1]);
            for (String str : arrayList) {
                instance.update(str.getBytes());
                if (i != 0) {
                    break;
                }
            }
            Object obj = new Object[6];
            System.arraycopy(instance.digest(), 0, obj, 0, obj.length);
            return z[2] + Base64.encodeToString(obj, 2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList e() {
        int i = App.az;
        ArrayList arrayList = new ArrayList();
        for (l6 l6Var : this.a.values()) {
            try {
                if (l6Var.c) {
                    arrayList.add(l6Var);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return arrayList;
    }

    public Set j() {
        return this.a.keySet();
    }

    static String a(cs csVar) {
        return csVar.b;
    }

    public l6 b(String str) {
        return (l6) this.a.get(str);
    }

    public String toString() {
        return this.b + " " + Arrays.deepToString(Collections.list(Collections.enumeration(this.a.values())).toArray()) + z[0] + this.c;
    }

    public boolean a() {
        int i = App.az;
        for (l6 l6Var : this.a.values()) {
            try {
                if (!l6Var.a()) {
                    if (i != 0) {
                        break;
                    }
                }
                return l6Var.c;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return false;
    }

    public boolean a(Hashtable hashtable, boolean z) {
        int i = App.az;
        Vector vector = new Vector();
        for (String str : hashtable.keySet()) {
            String str2;
            try {
                if (!this.a.containsKey(str2)) {
                    Log.i(z[5] + str2);
                    vector.add(str2);
                }
                a(str2, z[4].equals(hashtable.get(str2)), false);
                if (i != 0) {
                    break;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        Vector vector2 = new Vector();
        for (String str22 : this.a.keySet()) {
            try {
                if (!hashtable.containsKey(str22)) {
                    Log.i(z[3] + str22);
                    vector2.add(str22);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        Iterator it = vector2.iterator();
        while (it.hasNext()) {
            a((String) it.next());
            if (i != 0) {
                break;
            }
        }
        if (z) {
            ArrayList e3 = e();
            try {
                if (!vector.isEmpty()) {
                    String str3 = this.b;
                    if (e3.size() == 1) {
                        str22 = ((l6) e3.get(0)).d;
                    } else {
                        str22 = null;
                    }
                    bd.a(1, bd.a(12, null, str3, str22, vector));
                }
                try {
                    if (!vector2.isEmpty()) {
                        bd.a(1, bd.a(13, null, this.b, null, vector2));
                    }
                } catch (RuntimeException e22) {
                    throw e22;
                }
            } catch (RuntimeException e222) {
                throw e222;
            } catch (RuntimeException e2222) {
                throw e2222;
            }
        }
        Collection arrayList = new ArrayList(1);
        arrayList.add(this);
        App.aJ.a(arrayList);
        try {
            boolean z2;
            if (vector.isEmpty()) {
                if (vector2.isEmpty()) {
                    z2 = false;
                    if (z2) {
                        try {
                            d();
                        } catch (RuntimeException e22222) {
                            throw e22222;
                        }
                    }
                    return z2;
                }
            }
            z2 = true;
            if (z2) {
                d();
            }
            return z2;
        } catch (RuntimeException e222222) {
            throw e222222;
        } catch (RuntimeException e2222222) {
            throw e2222222;
        }
    }

    public void g() {
        int i = App.az;
        this.a = App.aJ.n(this.b);
        d();
        int i2 = 0;
        for (l6 l6Var : this.a.values()) {
            l6Var.b = bd.e()[i2 % bd.e().length];
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public l6 a(String str) {
        l6 l6Var = (l6) this.a.remove(str);
        if (l6Var != null) {
            try {
                d();
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return l6Var;
    }
}
