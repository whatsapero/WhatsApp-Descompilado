package de.greenrobot.event;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class j {
    private static final Map a;
    private static final String[] z;
    private final Map b;

    j(List list) {
        this.b = new ConcurrentHashMap();
        if (list != null) {
            for (Class cls : list) {
                this.b.put(cls, cls);
            }
        }
    }

    static {
        String[] strArr = new String[13];
        String str = "0fu\u007fo1|";
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
                        i3 = 95;
                        break;
                    case ay.f /*1*/:
                        i3 = 8;
                        break;
                    case ay.n /*2*/:
                        i3 = 48;
                        break;
                    case ay.p /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 10;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "5iFhrq";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u001e{Igi";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\fcYyz6fW)g:|Xfn\u007f ^f~\u007fxEkf6k\u001c)y+iD`i\u007fgB)k={D{k<|\u00193*";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u007f`Qz*1g\u0010y\u007f=dYj*2mDae;{\u0010jk3dUm*";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "5iFh$";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001diSbm-gEgn\u000b`Blk;";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    str = "\u0016d\\lm>d\u0010fd\u001a~Ug~\u007feU}b0l\u001c)i7mSb*9gB)~&x_z0\u007f";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = "\f}Rzi-aRlx\u007f";
                    i = 9;
                    strArr2 = strArr3;
                    obj = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    str = ">fT{e6l\u001e";
                    i = 10;
                    strArr2 = strArr3;
                    obj = 9;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "0fu\u007fo1|";
                    obj = 10;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "0fu\u007fo1|";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new HashMap();
                default:
                    strArr2[i] = str;
                    str = "\u0012iYg^7zUhn";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    List a(Class cls) {
        String name = cls.getName();
        synchronized (a) {
            List list = (List) a.get(name);
        }
        if (list != null) {
            return list;
        }
        List arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder();
        Class cls2 = cls;
        while (cls2 != null) {
            String name2 = cls2.getName();
            try {
                if (!(name2.startsWith(z[6]) || name2.startsWith(z[2]))) {
                    if (!name2.startsWith(z[10])) {
                        for (Method method : cls2.getDeclaredMethods()) {
                            String name3 = method.getName();
                            if (name3.startsWith(z[12])) {
                                int modifiers = method.getModifiers();
                                if ((modifiers & 1) == 0 || (modifiers & 5192) != 0) {
                                    try {
                                        if (!this.b.containsKey(cls2)) {
                                            Log.d(g.k, z[4] + cls2 + "." + name3);
                                        }
                                    } catch (e e) {
                                        throw e;
                                    }
                                }
                                Class[] parameterTypes = method.getParameterTypes();
                                if (parameterTypes.length == 1) {
                                    p pVar;
                                    name2 = name3.substring(z[11].length());
                                    if (name2.length() == 0) {
                                        pVar = p.PostThread;
                                    } else if (name2.equals(z[1])) {
                                        pVar = p.MainThread;
                                    } else if (name2.equals(z[7])) {
                                        pVar = p.BackgroundThread;
                                    } else if (name2.equals(z[3])) {
                                        pVar = p.Async;
                                    } else {
                                        try {
                                            if (!this.b.containsKey(cls2)) {
                                                throw new e(z[8] + method);
                                            }
                                        } catch (e e2) {
                                            throw e2;
                                        }
                                    }
                                    Class cls3 = parameterTypes[0];
                                    stringBuilder.setLength(0);
                                    stringBuilder.append(name3);
                                    stringBuilder.append('>').append(cls3.getName());
                                    try {
                                        if (hashSet.add(stringBuilder.toString())) {
                                            arrayList.add(new q(method, pVar, cls3));
                                        }
                                    } catch (e e22) {
                                        throw e22;
                                    }
                                }
                                continue;
                            }
                        }
                        cls2 = cls2.getSuperclass();
                    }
                }
            } catch (e e222) {
                throw e222;
            } catch (e e2222) {
                try {
                    throw e2222;
                } catch (e e22222) {
                    throw e22222;
                }
            }
        }
        try {
            break;
            if (arrayList.isEmpty()) {
                throw new e(z[9] + cls + z[5] + z[0]);
            }
            synchronized (a) {
                a.put(name, arrayList);
            }
            return arrayList;
        } catch (e e222222) {
            throw e222222;
        }
    }
}
