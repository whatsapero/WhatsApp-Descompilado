package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class a58 extends AsyncTask {
    private static final String[] z;
    final ArrayList a;
    final SharedPreferences b;

    static {
        String[] strArr = new String[6];
        String str = "\u0003/\u0003";
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
                        i3 = 115;
                        break;
                    case ay.f /*1*/:
                        i3 = 78;
                        break;
                    case ay.n /*2*/:
                        i3 = 46;
                        break;
                    case ay.p /*3*/:
                        i3 = 8;
                        break;
                    default:
                        i3 = 12;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0015>O%";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0014<A}|\u001e)\\'a\u001a)\\ix\u0016(\\ga\u0003<Kn\u007f\\<Kec\u0005+\u000e";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0015>O%";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0014<A}|\u001e)\\'a\u001a)\\ix\u0016(\\ga\u0003<Kn\u007f\\<Kec\u0005+\u000e";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0003/\u0003";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Void a(Void[] voidArr) {
        int i = App.az;
        App.aJ.a(this.a);
        Editor edit = this.b.edit();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            cs csVar = (cs) it.next();
            edit.remove(z[1] + cs.a(csVar));
            edit.remove(z[2] + cs.a(csVar));
            if (i != 0) {
                break;
            }
        }
        for (String str : this.b.getAll().keySet()) {
            if (str.startsWith(z[0]) && str.contains("@")) {
                Log.i(z[3] + str);
                edit.remove(str);
            }
            if (str.startsWith(z[4]) && str.contains("@")) {
                Log.i(z[5] + str);
                edit.remove(str);
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        edit.commit();
        return null;
    }

    a58(ArrayList arrayList, SharedPreferences sharedPreferences) {
        this.a = arrayList;
        this.b = sharedPreferences;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
