package com.whatsapp;

import android.content.Intent;
import android.content.SharedPreferences.Editor;
import com.whatsapp.protocol.cn;
import com.whatsapp.protocol.ct;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class lh implements ct {
    public static final lh b;
    private static final String[] z;
    private HashMap a;
    private final ArrayList c;
    private final Object d;
    private final HashMap e;
    private final ArrayList f;
    private Runnable g;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r6) {
        /*
        r5_this = this;
        r1 = r5.d;
        monitor-enter(r1);
        r0 = r5.a;	 Catch:{ all -> 0x0079 }
        if (r0 != 0) goto L_0x000a;
    L_0x0007:
        r5.b();	 Catch:{ all -> 0x0079 }
    L_0x000a:
        r0 = r5.a;	 Catch:{ all -> 0x0079 }
        r0 = r0.remove(r6);	 Catch:{ all -> 0x0079 }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x0079 }
        if (r0 != 0) goto L_0x0016;
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x0079 }
    L_0x0015:
        return;
    L_0x0016:
        r0 = com.whatsapp.App.p;	 Catch:{ all -> 0x0079 }
        r2 = z;	 Catch:{ all -> 0x0079 }
        r3 = 27;
        r2 = r2[r3];	 Catch:{ all -> 0x0079 }
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);	 Catch:{ all -> 0x0079 }
        r0 = r0.edit();	 Catch:{ all -> 0x0079 }
        r2 = r5.a();	 Catch:{ all -> 0x0079 }
        r3 = r5.a;	 Catch:{ all -> 0x0079 }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x0079 }
        if (r3 == 0) goto L_0x0040;
    L_0x0033:
        r3 = z;	 Catch:{ all -> 0x0079 }
        r4 = 25;
        r3 = r3[r4];	 Catch:{ all -> 0x0079 }
        r0.remove(r3);	 Catch:{ all -> 0x0079 }
        r3 = com.whatsapp.App.az;	 Catch:{ all -> 0x0079 }
        if (r3 == 0) goto L_0x0049;
    L_0x0040:
        r3 = z;	 Catch:{ all -> 0x0079 }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ all -> 0x0079 }
        r0.putString(r3, r2);	 Catch:{ all -> 0x0079 }
    L_0x0049:
        r0 = r0.commit();	 Catch:{ all -> 0x0079 }
        if (r0 != 0) goto L_0x0058;
    L_0x004f:
        r0 = z;	 Catch:{ all -> 0x0079 }
        r2 = 26;
        r0 = r0[r2];	 Catch:{ all -> 0x0079 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x0079 }
    L_0x0058:
        r0 = com.whatsapp.App.p;	 Catch:{ all -> 0x0079 }
        r0 = r0.U();	 Catch:{ all -> 0x0079 }
        r2 = new com.whatsapp.e_;	 Catch:{ all -> 0x0079 }
        r2.<init>(r5, r6);	 Catch:{ all -> 0x0079 }
        r0.post(r2);	 Catch:{ all -> 0x0079 }
        monitor-exit(r1);	 Catch:{ all -> 0x0079 }
        r5.c();
        r0 = com.whatsapp.App.p;
        r0 = r0.U();
        r1 = new com.whatsapp.zh;
        r1.<init>(r5, r6);
        r0.post(r1);
        goto L_0x0015;
    L_0x0079:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0079 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lh.b(java.lang.String):void");
    }

    private String a() {
        int i = App.az;
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : this.a.entrySet()) {
            String str = (String) entry.getKey();
            Long l = (Long) entry.getValue();
            if (stringBuilder.length() != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(str).append('#').append(l);
            if (i != 0) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    public void a(z6 z6Var) {
        if (!this.c.contains(z6Var)) {
            this.c.add(z6Var);
        }
    }

    private void c() {
        int i = App.az;
        App.p.U().removeCallbacks(this.g);
        Long l = null;
        synchronized (this.d) {
            Long l2;
            for (Entry entry : this.a.entrySet()) {
                l2 = (Long) entry.getValue();
                if (l != null && l2.longValue() >= l.longValue()) {
                    l2 = l;
                }
                if (i != 0) {
                    break;
                }
                l = l2;
            }
            l2 = l;
        }
        if (l2 != null && l2.longValue() > System.currentTimeMillis()) {
            App.p.U().postDelayed(this.g, l2.longValue() - System.currentTimeMillis());
        }
    }

    static ArrayList d(lh lhVar) {
        return lhVar.c;
    }

    public ArrayList c(String str) {
        ArrayList arrayList;
        int i = App.az;
        synchronized (this.e) {
            arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.e.get(str);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    cn cnVar = (cn) it.next();
                    if (cnVar.a() && cnVar.d + 7200000 > System.currentTimeMillis()) {
                        arrayList.add(cnVar);
                        continue;
                    }
                    if (i != 0) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r8, com.whatsapp.protocol.cn[] r9) {
        /*
        r7_this = this;
        r2 = com.whatsapp.App.az;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 22;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r1 = " ";
        r0 = r0.append(r1);
        r1 = r9.length;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r3 = r7.e;
        monitor-enter(r3);
        r0 = r7.e;	 Catch:{ all -> 0x00a5 }
        r0 = r0.get(r8);	 Catch:{ all -> 0x00a5 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x00a5 }
        if (r0 != 0) goto L_0x0040;
    L_0x0034:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x00a5 }
        r0.<init>();	 Catch:{ all -> 0x00a5 }
        r1 = r7.e;	 Catch:{ all -> 0x00a5 }
        r1.put(r8, r0);	 Catch:{ all -> 0x00a5 }
        if (r2 == 0) goto L_0x0043;
    L_0x0040:
        r0.clear();	 Catch:{ all -> 0x00a5 }
    L_0x0043:
        r1 = java.util.Arrays.asList(r9);	 Catch:{ all -> 0x00a5 }
        r0.addAll(r1);	 Catch:{ all -> 0x00a5 }
        r4 = r0.iterator();	 Catch:{ all -> 0x00a5 }
    L_0x004e:
        r0 = r4.hasNext();	 Catch:{ all -> 0x00a5 }
        if (r0 == 0) goto L_0x00a3;
    L_0x0054:
        r0 = r4.next();	 Catch:{ all -> 0x00a5 }
        r0 = (com.whatsapp.protocol.cn) r0;	 Catch:{ all -> 0x00a5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a5 }
        r1.<init>();	 Catch:{ all -> 0x00a5 }
        r5 = z;	 Catch:{ all -> 0x00a5 }
        r6 = 23;
        r5 = r5[r6];	 Catch:{ all -> 0x00a5 }
        r1 = r1.append(r5);	 Catch:{ all -> 0x00a5 }
        r5 = r0.h;	 Catch:{ all -> 0x00a5 }
        r1 = r1.append(r5);	 Catch:{ all -> 0x00a5 }
        r5 = " ";
        r1 = r1.append(r5);	 Catch:{ all -> 0x00a5 }
        r5 = r0.a();	 Catch:{ all -> 0x00a5 }
        r1 = r1.append(r5);	 Catch:{ all -> 0x00a5 }
        r1 = r1.toString();	 Catch:{ all -> 0x00a5 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x00a5 }
        r1 = r0.a();	 Catch:{ all -> 0x00a5 }
        if (r1 == 0) goto L_0x00a1;
    L_0x008a:
        r1 = r7.f;	 Catch:{ all -> 0x00a5 }
        r5 = r1.iterator();	 Catch:{ all -> 0x00a5 }
    L_0x0090:
        r1 = r5.hasNext();	 Catch:{ all -> 0x00a5 }
        if (r1 == 0) goto L_0x00a1;
    L_0x0096:
        r1 = r5.next();	 Catch:{ all -> 0x00a5 }
        r1 = (com.whatsapp.a3y) r1;	 Catch:{ all -> 0x00a5 }
        r1.a(r0);	 Catch:{ all -> 0x00a5 }
        if (r2 == 0) goto L_0x0090;
    L_0x00a1:
        if (r2 == 0) goto L_0x004e;
    L_0x00a3:
        monitor-exit(r3);	 Catch:{ all -> 0x00a5 }
        return;
    L_0x00a5:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00a5 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lh.a(java.lang.String, com.whatsapp.protocol.cn[]):void");
    }

    public void b(String str, String str2) {
        int i = App.az;
        Log.i(z[13] + str2 + z[12] + str);
        synchronized (this.e) {
            ArrayList arrayList;
            Object obj;
            ArrayList arrayList2 = (ArrayList) this.e.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.e.put(str, arrayList2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
            }
            Object obj2 = null;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((cn) it.next()).h.equals(str2)) {
                    obj = 1;
                    if (i == 0) {
                        break;
                    }
                }
                obj = obj2;
                if (i != 0) {
                    break;
                }
                obj2 = obj;
            }
            obj = obj2;
            if (obj == null) {
                cn cnVar = new cn();
                cnVar.h = str2;
                arrayList.add(cnVar);
            }
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((a3y) it2.next()).a(str, str2);
            if (i != 0) {
                return;
            }
        }
    }

    static void b(lh lhVar) {
        lhVar.c();
    }

    public void b(a3y com_whatsapp_a3y) {
        this.f.remove(com_whatsapp_a3y);
    }

    static Object c(lh lhVar) {
        return lhVar.d;
    }

    static HashMap a(lh lhVar) {
        return lhVar.a;
    }

    public int a(String str, long j) {
        Log.i(z[21] + str + z[16] + j);
        if (a(str)) {
            Intent intent = new Intent(App.p, LocationSharingService.class);
            intent.setAction(z[17]);
            intent.putExtra(z[18], j);
            App.p.startService(intent);
            return 0;
        }
        Log.w(z[20] + str + z[19]);
        return 401;
    }

    static {
        String[] strArr = new String[30];
        String str = "Z\\\u0015\u0004lQR\fYzIC'Zi\\U\u001dX~WP\u001dY";
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
                        i3 = 57;
                        break;
                    case ay.f /*1*/:
                        i3 = 51;
                        break;
                    case ay.n /*2*/:
                        i3 = 120;
                        break;
                    case ay.p /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "U\\\u001bKoP\\\u0016uhQR\nCu^";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "U\\\u001bKoP\\\u0016Yv^AWCuPG'Y~MG\u0011D|J\t";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "U\\\u001bKoP\\\u0016Yv^AWCuPG'Y~MG\u0011D|J\u0013\u001fXtLCXDtM\u0013\u001dRk\\P\fO\u007f";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "U\\\u001bKoP\\\u0016uhQR\nCu^";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "U\\\u001bKoP\\\u0016Yv^AW_k]R\fODJV\f^rWT\u000b\u0010";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "U\\\u001bKoP\\\u0016uhQR\nCu^";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "U\\\u001bKoP\\\u0016Yv^AWEuiR\n^rZZ\bKuM\u007f\u0017IzMZ\u0017D4";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Z\\\u0015\u0004lQR\fYzIC'Zi\\U\u001dX~WP\u001dY";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "U\\\u001bKoP\\\u0016uhQR\nCu^";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "U\\\u001bKoP\\\u0016Yv^AWY~MG\u0011D|J\u001c\u001eKrUV\u001c";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0019T\nEnI\t";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "U\\\u001bKoP\\\u0016Yv^AWEuiR\n^rZZ\bKuM`\fKiMV\u001cysXA\u0011D|u\\\u001bKoP\\\u0016\u0005";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "U\\\u001bKoP\\\u0016Yv^AWEuiR\n^rZZ\bKuM`\fEkIV\u001cysXA\u0011D|u\\\u001bKoP\\\u0016\u0005";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0019T\nEnI\t";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0019W\rXzMZ\u0017D!";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Z\\\u0015\u0004lQR\fYzICVysXA\u001dftZR\fCtW`\u001dXmPP\u001d\u0004Hmr*~";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "]F\nKoP\\\u0016";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0019W\u0011Yz[_\u001dN";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "U\\\u001bKoP\\\u0016Yv^AWEujG\u0019Xou\\\u001bKoP\\\u0016x~I\\\n^rWTW";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "U\\\u001bKoP\\\u0016Yv^AWEujG\u0019Xou\\\u001bKoP\\\u0016x~I\\\n^rWTW";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "U\\\u001bKoP\\\u0016Yv^AWEuiR\n^rZZ\bKuM@+BzKZ\u0016MWVP\u0019^rV]W";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "U\\\u001bKoP\\\u0016Yv^AWEuiR\n^rZZ\bKuM@+BzKZ\u0016MWVP\u0019^rV]W@r]\t";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "U\\\u001bKoP\\\u0016uhQR\nCu^";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "U\\\u001bKoP\\\u0016uhQR\nCu^";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "U\\\u001bKoP\\\u0016Yv^AWY~MG\u0011D|J\u001c\nOh\\GWLzP_\u001dN";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    str = "Z\\\u0015\u0004lQR\fYzIC'Zi\\U\u001dX~WP\u001dY";
                    obj = 26;
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    strArr2 = strArr3;
                    str = "Z\\\u0015\u0004lQR\fYzICVysXA\u001dftZR\fCtW`\u001dXmPP\u001d\u0004Hm|(";
                    obj = 27;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "U\\\u001bKoP\\\u0016Yv^AWEujG\u0017ZWVP\u0019^rV]*OkVA\fCu^";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new lh();
                default:
                    strArr2[i] = str;
                    str = "U\\\u001bKoP\\\u0016Yv^AW_k]R\fODJV\f^rWT\u000b\u0005}XZ\u0014O\u007f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(String str, String str2) {
        int i = App.az;
        Log.i(z[14] + str2 + z[15] + str);
        synchronized (this.e) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    cn cnVar = (cn) it.next();
                    if (cnVar.h.equals(str2)) {
                        arrayList.remove(cnVar);
                        if (i == 0) {
                            break;
                        }
                    }
                    if (i != 0) {
                        break;
                    }
                }
            }
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((a3y) it2.next()).b(str, str2);
            if (i != 0) {
                return;
            }
        }
    }

    public void a(String str, long j) {
        synchronized (this.d) {
            if (this.a == null) {
                b();
            }
            this.a.put(str, Long.valueOf(j));
            Editor edit = App.p.getSharedPreferences(z[9], 0).edit();
            edit.putString(z[10], a());
            if (!edit.commit()) {
                Log.e(z[11]);
            }
        }
        c();
        App.p.U().post(new t9(this, str));
    }

    public lh() {
        this.e = new HashMap();
        this.f = new ArrayList();
        this.c = new ArrayList();
        this.d = new Object();
        this.g = new p7(this);
    }

    public void a(cn cnVar) {
        int i = App.az;
        Log.i(z[8] + cnVar);
        synchronized (this.e) {
            for (ArrayList arrayList : this.e.values()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    cn cnVar2 = (cn) it.next();
                    if (cnVar2.h.equals(cnVar.h)) {
                        cnVar2.b = cnVar.b;
                        cnVar2.e = cnVar.e;
                        cnVar2.g = cnVar.g;
                        cnVar2.i = cnVar.i;
                        cnVar2.f = cnVar.f;
                        cnVar2.d = cnVar.d;
                        if (i == 0) {
                            break;
                            continue;
                        }
                    }
                    if (i != 0) {
                        break;
                        continue;
                    }
                }
                if (i != 0) {
                    break;
                }
            }
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((a3y) it2.next()).a(cnVar);
            if (i != 0) {
                return;
            }
        }
    }

    public boolean a(String str) {
        synchronized (this.d) {
            if (this.a == null) {
                b();
            }
            if (this.a.containsKey(str)) {
                long longValue = ((Long) this.a.get(str)).longValue();
                if (longValue == 0 || longValue > System.currentTimeMillis()) {
                    return true;
                }
                b(str);
            }
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r12_this = this;
        r1 = 1;
        r3 = 0;
        r4 = com.whatsapp.App.az;
        r0 = new java.util.HashMap;
        r0.<init>();
        r12.a = r0;
        r0 = com.whatsapp.App.p;
        r2 = z;
        r2 = r2[r3];
        r5 = r0.getSharedPreferences(r2, r3);
        r0 = z;
        r2 = 2;
        r0 = r0[r2];
        r2 = "";
        r0 = r5.getString(r0, r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = z;
        r7 = 3;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r0.length();
        if (r2 <= 0) goto L_0x00ee;
    L_0x003f:
        r2 = ",";
        r6 = r0.split(r2);
        r0 = r6.length;
        r0 = r0 + -1;
        r2 = r0;
        r0 = r3;
    L_0x004a:
        if (r2 < 0) goto L_0x00a4;
    L_0x004c:
        r7 = r6[r2];
        r8 = r7.length();
        if (r8 <= r1) goto L_0x00a0;
    L_0x0054:
        r8 = "#";
        r7 = r7.split(r8);
        r8 = com.whatsapp.App.P;
        r9 = r7[r3];
        r8 = r8.f(r9);
        if (r8 == 0) goto L_0x009f;
    L_0x0064:
        r8 = r12.a;
        r9 = r7[r3];
        r8 = r8.containsKey(r9);
        if (r8 == 0) goto L_0x008c;
    L_0x006e:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r8 = z;
        r9 = 4;
        r8 = r8[r9];
        r0 = r0.append(r8);
        r8 = r7[r3];
        r0 = r0.append(r8);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        if (r4 == 0) goto L_0x00f2;
    L_0x008b:
        r0 = r1;
    L_0x008c:
        r8 = r12.a;
        r9 = r7[r3];
        r7 = r7[r1];
        r10 = java.lang.Long.parseLong(r7);
        r7 = java.lang.Long.valueOf(r10);
        r8.put(r9, r7);
        if (r4 == 0) goto L_0x00a0;
    L_0x009f:
        r0 = r1;
    L_0x00a0:
        r2 = r2 + -1;
        if (r4 == 0) goto L_0x004a;
    L_0x00a4:
        if (r0 == 0) goto L_0x00ee;
    L_0x00a6:
        r0 = r5.edit();
        r2 = r12.a();
        r3 = r12.a;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x00c0;
    L_0x00b6:
        r3 = z;
        r5 = 7;
        r3 = r3[r5];
        r0.remove(r3);
        if (r4 == 0) goto L_0x00c8;
    L_0x00c0:
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r0.putString(r3, r2);
    L_0x00c8:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 6;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r0 = r0.commit();
        if (r0 != 0) goto L_0x00ee;
    L_0x00e7:
        r0 = z;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x00ee:
        r12.c();
        return;
    L_0x00f2:
        r0 = r1;
        goto L_0x00a0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lh.b():void");
    }

    public void a(a3y com_whatsapp_a3y) {
        if (!this.f.contains(com_whatsapp_a3y)) {
            this.f.add(com_whatsapp_a3y);
        }
    }

    public void a() {
        Log.i(z[29]);
        Intent intent = new Intent(App.p, LocationSharingService.class);
        intent.setAction(z[28]);
        App.p.startService(intent);
    }

    public void b(z6 z6Var) {
        this.c.remove(z6Var);
    }
}
