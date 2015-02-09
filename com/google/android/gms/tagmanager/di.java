package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class di {
    private static final Object auc;
    private static Long aud;
    private static Double aue;
    private static dh auf;
    private static String aug;
    private static Boolean auh;
    private static List aui;
    private static Map auj;
    private static a auk;

    static {
        auc = null;
        aud = new Long(0);
        aue = new Double(0.0d);
        auf = dh.z(0);
        aug = new String("");
        auh = new Boolean(false);
        aui = new ArrayList(0);
        auj = new HashMap();
        auk = u(aug);
    }

    private static Boolean dd(String str) {
        return "true".equalsIgnoreCase(str) ? Boolean.TRUE : "false".equalsIgnoreCase(str) ? Boolean.FALSE : auh;
    }

    public static String j(a aVar) {
        return p(o(aVar));
    }

    public static Boolean n(a aVar) {
        return t(o(aVar));
    }

    public static Object o(a aVar) {
        int i = 0;
        int i2 = DataLayer.a;
        if (aVar == null) {
            return auc;
        }
        a[] aVarArr;
        int length;
        switch (aVar.type) {
            case ay.f /*1*/:
                return aVar.gv;
            case ay.n /*2*/:
                ArrayList arrayList = new ArrayList(aVar.gw.length);
                aVarArr = aVar.gw;
                length = aVarArr.length;
                while (i < length) {
                    Object o = o(aVarArr[i]);
                    if (o == auc) {
                        return auc;
                    }
                    arrayList.add(o);
                    i++;
                    if (i2 != 0) {
                        return arrayList;
                    }
                }
                return arrayList;
            case ay.p /*3*/:
                if (aVar.gx.length != aVar.gy.length) {
                    bh.T("Converting an invalid value to object: " + aVar.toString());
                    return auc;
                }
                Map hashMap = new HashMap(aVar.gy.length);
                while (i < aVar.gx.length) {
                    Object o2 = o(aVar.gx[i]);
                    Object o3 = o(aVar.gy[i]);
                    if (o2 == auc || o3 == auc) {
                        return auc;
                    }
                    hashMap.put(o2, o3);
                    i++;
                    if (i2 != 0) {
                        return hashMap;
                    }
                }
                return hashMap;
            case aj.i /*4*/:
                bh.T("Trying to convert a macro reference to object");
                return auc;
            case aV.r /*5*/:
                bh.T("Trying to convert a function id to object");
                return auc;
            case aV.i /*6*/:
                return Long.valueOf(aVar.gB);
            case a8.s /*7*/:
                StringBuffer stringBuffer = new StringBuffer();
                aVarArr = aVar.gD;
                length = aVarArr.length;
                while (i < length) {
                    String j = j(aVarArr[i]);
                    if (j == aug) {
                        return auc;
                    }
                    stringBuffer.append(j);
                    i++;
                    if (i2 != 0) {
                        return stringBuffer.toString();
                    }
                }
                return stringBuffer.toString();
            case a8.n /*8*/:
                return Boolean.valueOf(aVar.gC);
            default:
                bh.T("Failed to convert a value of type: " + aVar.type);
                return auc;
        }
    }

    public static String p(Object obj) {
        return obj == null ? aug : obj.toString();
    }

    public static a rb() {
        return auk;
    }

    public static Boolean t(Object obj) {
        return obj instanceof Boolean ? (Boolean) obj : dd(p(obj));
    }

    public static a u(Object obj) {
        boolean z = false;
        a aVar = new a();
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj instanceof String) {
            aVar.type = 1;
            aVar.gv = (String) obj;
        } else if (obj instanceof List) {
            aVar.type = 2;
            List<Object> list = (List) obj;
            arrayList = new ArrayList(list.size());
            r1 = false;
            for (Object obj2 : list) {
                a u = u(obj2);
                if (u == auk) {
                    return auk;
                }
                r0 = r1 || u.gF;
                arrayList.add(u);
                r1 = r0;
            }
            aVar.gw = (a[]) arrayList.toArray(new a[0]);
            z = r1;
        } else if (obj instanceof Map) {
            aVar.type = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            arrayList = new ArrayList(entrySet.size());
            List arrayList = new ArrayList(entrySet.size());
            r1 = false;
            for (Entry entry : entrySet) {
                a u2 = u(entry.getKey());
                a u3 = u(entry.getValue());
                if (u2 == auk || u3 == auk) {
                    return auk;
                }
                r0 = r1 || u2.gF || u3.gF;
                arrayList.add(u2);
                arrayList.add(u3);
                r1 = r0;
            }
            aVar.gx = (a[]) arrayList.toArray(new a[0]);
            aVar.gy = (a[]) arrayList.toArray(new a[0]);
            z = r1;
        } else if (v(obj)) {
            aVar.type = 1;
            aVar.gv = obj.toString();
        } else if (w(obj)) {
            aVar.type = 6;
            aVar.gB = x(obj);
        } else if (obj instanceof Boolean) {
            aVar.type = 8;
            aVar.gC = ((Boolean) obj).booleanValue();
        } else {
            bh.T("Converting to Value from unknown object type: " + (obj == null ? "null" : obj.getClass().toString()));
            return auk;
        }
        aVar.gF = z;
        return aVar;
    }

    private static boolean v(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof dh) && ((dh) obj).qQ());
    }

    private static boolean w(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof dh) && ((dh) obj).qR());
    }

    private static long x(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        bh.T("getInt64 received non-Number");
        return 0;
    }
}
