package com.whatsapp.contact;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class e {
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "&!\u000flY4&\u000fi\u00131,\u0014]O?$?a]$-?rT9'\u0005q\u0013:.\u0005";
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
                        i3 = 86;
                        break;
                    case ay.f /*1*/:
                        i3 = 73;
                        break;
                    case ay.n /*2*/:
                        i3 = 96;
                        break;
                    case ay.p /*3*/:
                        i3 = 2;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ":.\u0005";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "31\u0003gL\" \u000fl\u001c!!\tnYv;\u0005vN?,\u0016kR1i\u0013kQv*\u0001pXv*\u000flH7*\u0014q\u0010v>\tnPv*\u000flH?'\u0015g\u001c! \u0014jS#=@vT3$@";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "8(\rg";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "5&\u000evY8=Z-\u0013?*\u0003-]2'";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "&!\u000flY4&\u000fi\u0013:&\u000fiI&f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "&!\u000flY4&\u000fi\u00131,\u0014]_9<\u000ev\u0013";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "&!\u000flY4&\u000fi\u00131,\u0014]L>&\u000egOy";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "8<\r`Y$";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static Set a(Context context) {
        Object e;
        Throwable th;
        boolean z = i.a;
        Set hashSet = new HashSet();
        if (Build.MANUFACTURER.equalsIgnoreCase(z[2])) {
            Log.i(z[0]);
            Cursor query;
            try {
                query = App.e.query(Uri.parse(z[5]), null, null, null, null);
                try {
                    int columnIndex = query.getColumnIndex(z[4]);
                    int columnIndex2 = query.getColumnIndex(z[1]);
                    while (query.moveToNext()) {
                        String string = query.getString(columnIndex);
                        String string2 = query.getString(columnIndex2);
                        if (string2 != null) {
                            j a = j.a(context, string, string2);
                            if (a != null) {
                                hashSet.add(a);
                            } else {
                                continue;
                            }
                        }
                        if (z) {
                            break;
                        }
                    }
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                } catch (Exception e22) {
                    throw e22;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                query = null;
                try {
                    Log.w(z[3] + e);
                    if (query != null) {
                        query.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e222) {
                            throw e222;
                        }
                    }
                    throw th;
                }
                return hashSet;
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        return hashSet;
    }

    private static Map a(Set set) {
        boolean z = i.a;
        Map hashMap = new HashMap();
        for (j jVar : set) {
            if (!hashMap.containsKey(jVar.a())) {
                hashMap.put(jVar.a(), new ArrayList());
            }
            ((List) hashMap.get(jVar.a())).add(jVar);
            if (z) {
                break;
            }
        }
        return hashMap;
    }

    public static Integer a(m mVar) {
        Cursor a;
        Throwable th;
        Integer num = null;
        try {
            a = j.a(mVar, z[7]);
            if (a != null) {
                try {
                    num = Integer.valueOf(a.getCount());
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
            return num;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            a = null;
            th = th4;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public static Set b(m mVar) {
        boolean z = i.a;
        Set hashSet = new HashSet();
        Cursor cursor = null;
        try {
            cursor = j.a(mVar, z[8]);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    j a = j.a(cursor);
                    if (a != null) {
                        hashSet.add(a);
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return hashSet;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static Map c(Context context) {
        Set hashSet = new HashSet();
        hashSet.addAll(b(context));
        hashSet.addAll(a(context));
        return a(hashSet);
    }

    public static j a(String str) {
        Cursor a;
        Throwable th;
        j jVar = null;
        if (str != null) {
            try {
                a = j.a(str, z[6]);
                try {
                    if (a.moveToNext()) {
                        jVar = j.a(a);
                    }
                    if (a != null) {
                        a.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                a = null;
                th = th4;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        }
        return jVar;
    }

    private static Set b(Context context) {
        return b(App.n(context) ? m.BOTH : m.VISIBLE_ONLY);
    }
}
