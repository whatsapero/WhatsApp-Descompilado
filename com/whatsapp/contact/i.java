package com.whatsapp.contact;

import android.content.Context;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.Voip;
import com.whatsapp.ac;
import com.whatsapp.ak4;
import com.whatsapp.m8;
import com.whatsapp.protocol.bh;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class i {
    public static boolean a;
    private static final Map b;
    private static final ConditionVariable c;
    private static final AtomicLong d;
    private static final AtomicLong e;
    private static final ConditionVariable f;
    private static final AtomicBoolean g;
    private static final Map h;
    private static final String[] z;

    private static boolean b(Context context, c cVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f a = a(context, z[18]);
            f.close();
            if (!App.a(cVar, c(z[22]), 0, true, a.e())) {
                synchronized (App.u) {
                    App.aW = c.combine(App.aW, cVar);
                }
                return false;
            } else if (f.block(64000)) {
                a(a.c(), null);
                a(a.g(), null);
                Collection arrayList = new ArrayList();
                a(a.a(), arrayList);
                c.close();
                m8[] d = a.d();
                if (d.length > 0) {
                    if (App.a(d)) {
                        App.b(Arrays.asList(d));
                        if (!c.block(64000)) {
                            Log.w(z[19]);
                            return false;
                        }
                    }
                    synchronized (App.u) {
                        App.aW = c.combine(App.aW, cVar);
                    }
                    return false;
                }
                b(a.c(), null);
                b(a.g(), null);
                Collection arrayList2 = new ArrayList();
                b(a.a(), arrayList2);
                if (!a.c().isEmpty()) {
                    App.P.c(a.c());
                }
                if (!a.g().isEmpty()) {
                    App.P.b(a.g());
                }
                if (!arrayList.isEmpty()) {
                    App.P.b(arrayList);
                }
                if (!arrayList2.isEmpty()) {
                    App.P.b(arrayList2);
                }
                if (!a.f().isEmpty()) {
                    App.P.e(a.f());
                }
                try {
                    Log.a(z[24], null, new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                    if (!(a.h() && arrayList.isEmpty())) {
                        App.aH.sendEmptyMessage(1);
                    }
                    App.am.sendEmptyMessage(0);
                    return true;
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                Log.w(z[23]);
                return false;
            }
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw e222;
        } catch (Exception e2222) {
            throw e2222;
        } catch (Exception e22222) {
            throw e22222;
        } catch (Exception e222222) {
            throw e222222;
        } catch (Exception e2222222) {
            throw e2222222;
        } catch (Throwable e3) {
            Log.b(z[20], e3);
            Log.a(z[21], null, new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
            return false;
        } catch (Throwable th) {
        }
    }

    private static boolean c() {
        return ac.a(true) == 0;
    }

    public static void a(String str, int i, d[] dVarArr) {
        int i2 = 0;
        boolean z = a;
        Log.a(z[15], null, new Object[]{str, Integer.valueOf(i), Integer.valueOf(dVarArr.length)});
        int length = dVarArr.length;
        while (i2 < length) {
            d dVar = dVarArr[i2];
            h.put(dVar.a().c, dVar.a());
            i2++;
            if (z) {
                return;
            }
        }
    }

    public static void b(Context context) {
        d.set(0);
        a(context, 0, z[35]);
    }

    public static void a(Context context, String str, int i, int i2, long j) {
        Log.b(z[4], null, new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j)});
        if (j > 0) {
            long currentTimeMillis = System.currentTimeMillis() + j;
            d.set(currentTimeMillis);
            a(context, currentTimeMillis, z[3]);
        }
        f.open();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(android.content.Context r8, java.lang.String r9, long r10) {
        /*
        r1 = 0;
        r0 = new java.io.ObjectInputStream;	 Catch:{ FileNotFoundException -> 0x0014, StreamCorruptedException -> 0x001e, IOException -> 0x0036 }
        r2 = r8.openFileInput(r9);	 Catch:{ FileNotFoundException -> 0x0014, StreamCorruptedException -> 0x001e, IOException -> 0x0036 }
        r0.<init>(r2);	 Catch:{ FileNotFoundException -> 0x0014, StreamCorruptedException -> 0x001e, IOException -> 0x0036 }
        r10 = r0.readLong();	 Catch:{ FileNotFoundException -> 0x0069, StreamCorruptedException -> 0x0066, IOException -> 0x0061, all -> 0x005c }
        if (r0 == 0) goto L_0x0013;
    L_0x0010:
        r0.close();	 Catch:{ IOException -> 0x0058 }
    L_0x0013:
        return r10;
    L_0x0014:
        r0 = move-exception;
        r0 = r1;
    L_0x0016:
        if (r0 == 0) goto L_0x0013;
    L_0x0018:
        r0.close();	 Catch:{ IOException -> 0x001c }
        goto L_0x0013;
    L_0x001c:
        r0 = move-exception;
        goto L_0x0013;
    L_0x001e:
        r0 = move-exception;
    L_0x001f:
        r0 = z;	 Catch:{ all -> 0x0051 }
        r2 = 6;
        r0 = r0[r2];	 Catch:{ all -> 0x0051 }
        r2 = 0;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0051 }
        r4 = 0;
        r3[r4] = r9;	 Catch:{ all -> 0x0051 }
        com.whatsapp.util.Log.c(r0, r2, r3);	 Catch:{ all -> 0x0051 }
        if (r1 == 0) goto L_0x0013;
    L_0x0030:
        r1.close();	 Catch:{ IOException -> 0x0034 }
        goto L_0x0013;
    L_0x0034:
        r0 = move-exception;
        goto L_0x0013;
    L_0x0036:
        r0 = move-exception;
    L_0x0037:
        r2 = z;	 Catch:{ all -> 0x0051 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ all -> 0x0051 }
        r3 = 0;
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0051 }
        r5 = 0;
        r4[r5] = r0;	 Catch:{ all -> 0x0051 }
        r0 = 1;
        r4[r0] = r9;	 Catch:{ all -> 0x0051 }
        com.whatsapp.util.Log.c(r2, r3, r4);	 Catch:{ all -> 0x0051 }
        if (r1 == 0) goto L_0x0013;
    L_0x004b:
        r1.close();	 Catch:{ IOException -> 0x004f }
        goto L_0x0013;
    L_0x004f:
        r0 = move-exception;
        goto L_0x0013;
    L_0x0051:
        r0 = move-exception;
    L_0x0052:
        if (r1 == 0) goto L_0x0057;
    L_0x0054:
        r1.close();	 Catch:{ IOException -> 0x005a }
    L_0x0057:
        throw r0;
    L_0x0058:
        r0 = move-exception;
        goto L_0x0013;
    L_0x005a:
        r1 = move-exception;
        goto L_0x0057;
    L_0x005c:
        r1 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0052;
    L_0x0061:
        r1 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x0066:
        r1 = move-exception;
        r1 = r0;
        goto L_0x001f;
    L_0x0069:
        r1 = move-exception;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.i.a(android.content.Context, java.lang.String, long):long");
    }

    public static void a(Context context, String str, String str2, long j) {
        boolean z = a;
        Log.a(z[16], null, new Object[]{str, str2, Long.valueOf(j)});
        if (j > 0) {
            e.set(j);
            a(context, j, z[17]);
        }
        HashSet j2 = App.j();
        for (Entry entry : h.entrySet()) {
            bh bhVar = (bh) entry.getValue();
            if (bhVar.b == 2) {
                j2.add(bhVar.c);
                continue;
            }
            if (z) {
                break;
            }
        }
        App.a(j2);
        f.open();
        if (DialogToastActivity.i) {
            a = !z;
        }
    }

    public static boolean a() {
        return g.compareAndSet(false, true);
    }

    private static String c(String str) {
        return str + '_' + UUID.randomUUID().toString();
    }

    private static void a(Context context, long j, String str) {
        Throwable th;
        IOException iOException;
        ObjectOutputStream objectOutputStream = null;
        ObjectOutputStream objectOutputStream2;
        try {
            objectOutputStream2 = new ObjectOutputStream(context.openFileOutput(str, 0));
            try {
                objectOutputStream2.writeLong(j);
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                    }
                }
            } catch (FileNotFoundException e2) {
                try {
                    Log.b(z[2], null, new Object[]{str});
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    objectOutputStream = objectOutputStream2;
                    th = th3;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                IOException iOException2 = e5;
                objectOutputStream = objectOutputStream2;
                iOException = iOException2;
                try {
                    Log.c(z[1], null, new Object[]{iOException, str});
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    throw th;
                }
            }
        } catch (FileNotFoundException e7) {
            objectOutputStream2 = null;
            Log.b(z[2], null, new Object[]{str});
            if (objectOutputStream2 != null) {
                objectOutputStream2.close();
            }
        } catch (IOException e8) {
            iOException = e8;
            Log.c(z[1], null, new Object[]{iOException, str});
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
        }
    }

    public static void b(String str) {
        b.put(str, new p(0, null));
    }

    public static void a(String str, long j, String str2) {
        b.put(str, new p(j, str2));
    }

    static {
        String[] strArr = new String[57];
        String str = "3O:7p3O:7\u0000!Z8{2)E'=1'i&1,0Y:':o\u0013'";
        boolean z = true;
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
                        i3 = 64;
                        break;
                    case ay.f /*1*/:
                        i3 = 54;
                        break;
                    case ay.n /*2*/:
                        i3 = 84;
                        break;
                    case ay.p /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "&_81\u007feEt:04\u00162;*.Rt202\u0016#&64_:3q`W$$\u007f$_&1<4Y&-\u007f.Y t(2_ 5=,Sku`a\t";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "3O:7\u0000\"W7?0&P";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "3O:7p%D&;-`E=0beEt=1$S,iz$\u00167;;%\u000bq0\u007f\"W7?0&Piq;";
                    z = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\ty\u0011,<%F =0.\u0016q'\u007f2S506.Qt2-/[tq,l\u0016&1+5D:=1'\u0016019!C8 \u007f,W' \u007f7W= \u007f4_91";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "#Y&&*0Bt26,Stq,l\u0016&1+5D:=1'\u0016019!C8 \u007f,W' \u007f7W= \u007f4_91";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "2S9;)%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "5F05+%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "!R0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "5X7<>.Q10";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "!R0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "5X7<>.Q10";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "5F05+%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "2S9;)%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "3O:7p2S'!34\u0016'=;}\u0013't6.R1,beRt!,%D'\u000b</C: beR";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "3O:7p#Y9$3%B1t,)Riq,`@1&,)Y:iz3\u0016#564\u000bq0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "&C88\u00003O:7\u00007W= ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "3O:7p3O:7\u0000!Z8{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "3O:7p3O:7\u0000!Z8{,4W !,\u001fD1$39i =2%Y! ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "3O:7p3O:7\u0000!Z8{:2D;&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "3O:7p3O:7\u0000!Z8{+)[1{z$\u0016|1-2Y&}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "3O:7\u00003_0\u000b95Z8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "3O:7p3O:7\u0000!Z8{,9X7\u000b-%F8-\u00004_9105B";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "3O:7p3O:7\u0000!Z8{+)[1{z$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "&C88\u00003O:7\u00007W= ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "3O:7p3B5 *3\u001b&1,0Y:':mU;9/,S 1\u007f%D&;-}\u00130";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "3O:7p3B5 *3\u001b&1,0Y:':mU;9/,S 1p*_0'r3B5 *3S't2)E95+#^t>6$Ewiz$\u0016' >4C'1,c\u000bq0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "3O:7p3O:7\u0000$S8 >o";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "3O:7\u00003_0\u000b;%Z 5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "3O:7p3O:7\u0000$S8 >oE 5+5E\u000b&:0Z-\u000b+)[1;*4";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "3O:7p3O:7\u0000$S8 >oE-:<\u001fD1$39i =2%Y! ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "3O:7p3O:7\u0000$S8 >oB=9:o\u00130tw%D&;-i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "3O:7p3O:7\u0000$S8 >oB=9:o\u00130";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "3O:7p3O:7\u0000$S8 >oS&&02";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "3O:7\u0000\"W7?0&P";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "3O:7\u0000\"W7?0&P";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "3O:7p3]=$p.S #02]\u000b!1!@5=3!T81";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "3O:7p\"C3{,9X7\u000b9,W3\u000b>,B1&:$i#<6,S\u000b'&.U\u000b=1\u001fF&;82S''";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "3O:7p3]=$p%N$=-%R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "3O:7p3_.1\u007feR";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "3O:7p\"C3{,9X7\u000b9,W3\u000b>,B1&:$i#<6,S\u000b'&.U\u000b=1\u001fF&;82S''";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "3O:7p3]=$p!Z&1>$O\u000b=1\u001fF&;82S''";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "3O:7p\"C3{,9X7\u000b9,W3\u000b>,B1&:$i#<6,S\u000b'&.U\u000b=1\u001fF&;82S''";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "3O:7p3]=$p\"W7?0&Ptq;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "3O:7p3_.1\u007feR";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "3O:7p3_.1\u007feR";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "3O:7p\"C3{,9X7\u000b9,W3\u000b>,B1&:$i#<6,S\u000b'&.U\u000b=1\u001fF&;82S''";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "3O:7p3_.1\u007feR";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "3O:7p3]=$p6Y=$\u0000#W88";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "3O:7p3O:7\u00003_:33%i7;14W7 p%D&;-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "3O:7p3O:7\u00003_:33%i7;14W7 p3O:7\u00002S$8&\u001fB=9:/C ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "3O:7p3O:7\u00003_:33%i7;14W7 p4_91peRt|:2D;&v";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "3O:7p3O:7\u00003_:33%i7;14W7 p3B5 *3i&1/,O\u000b 6-S;!+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    str = "3O:7p3O:7\u00003_:33%i7;14W7 p.C88\u0000+S-t";
                    z = true;
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    strArr2 = strArr3;
                    str = "3O:7p3O:7\u00003_:33%i7;14W7 p4_91peR";
                    z = true;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "3O:7\u00003_0\u000b,)X38:\u001fU;:+!U ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    z = strArr3;
                    g = new AtomicBoolean(false);
                    f = new ConditionVariable();
                    h = new HashMap();
                    c = new ConditionVariable();
                    b = new HashMap();
                    d = new AtomicLong(-1);
                    e = new AtomicLong(-1);
                default:
                    strArr2[i] = str;
                    str = "\ty\u0011,<%F =0.\u0016q'\u007f7D= 6.Qt 0`\u0013'";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    private static k a(Context context, c cVar, boolean z) {
        if (c()) {
            Log.i(z[39]);
            return k.USER_IS_EXPIRED;
        } else if (!App.a()) {
            Log.i(z[37]);
            return k.NETWORK_UNAVAILABLE;
        } else if (!z && !a()) {
            Log.i(z[42]);
            return k.IN_PROGRESS;
        } else if (Voip.f()) {
            Log.i(z[49]);
            return k.DELAYED;
        } else {
            try {
                k kVar;
                if (a(context) > System.currentTimeMillis()) {
                    Log.a(z[44], null, new Object[]{Long.valueOf(r0)});
                    kVar = k.DELAYED;
                    Log.a(z[45], null, new Object[]{Integer.valueOf(h.size())});
                    h.clear();
                    b.clear();
                    if (z || b()) {
                        return kVar;
                    }
                    Log.e(z[41]);
                    return kVar;
                }
                boolean b;
                int l = App.P.l();
                if (cVar.isFullSync()) {
                    b = b(context, cVar);
                } else {
                    b = a(context, cVar);
                }
                if (b) {
                    App.a0.a(l);
                    kVar = k.UP_TO_DATE;
                    Log.a(z[48], null, new Object[]{Integer.valueOf(h.size())});
                    h.clear();
                    b.clear();
                    if (z || b()) {
                        return kVar;
                    }
                    Log.e(z[38]);
                    return kVar;
                }
                kVar = k.FAILED;
                Log.a(z[46], null, new Object[]{Integer.valueOf(h.size())});
                h.clear();
                b.clear();
                if (z || b()) {
                    return kVar;
                }
                Log.e(z[43]);
                return kVar;
            } catch (Throwable th) {
                Log.a(z[40], null, new Object[]{Integer.valueOf(h.size())});
                h.clear();
                b.clear();
                if (!(z || b())) {
                    Log.e(z[47]);
                }
            }
        }
    }

    private static boolean a(Context context, c cVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f a = a(context, z[28]);
            ArrayList i = a.i();
            if (!i.isEmpty()) {
                f.close();
                if (!App.a(cVar, c(z[29]), 0, true, i)) {
                    synchronized (App.u) {
                        App.aW = c.combine(App.aW, cVar);
                    }
                    return false;
                } else if (!f.block(64000)) {
                    Log.w(z[31]);
                    return false;
                }
            }
            a(a.c(), null);
            c.close();
            m8[] b = a.b();
            if (b.length > 0) {
                if (App.a(b)) {
                    App.b(Arrays.asList(b));
                    if (!c.block(64000)) {
                        Log.w(z[30]);
                        return false;
                    }
                }
                synchronized (App.u) {
                    App.aW = c.combine(App.aW, cVar);
                }
                return false;
            }
            b(a.c(), null);
            if (!a.c().isEmpty()) {
                App.P.c(a.c());
            }
            if (!a.g().isEmpty()) {
                App.P.b(a.g());
            }
            if (!a.f().isEmpty()) {
                App.P.e(a.f());
            }
            Log.a(z[33], null, new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
            if (!a.h()) {
                App.aH.sendEmptyMessage(1);
            }
            App.am.sendEmptyMessage(0);
            return true;
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw e222;
        } catch (Exception e2222) {
            throw e2222;
        } catch (Exception e22222) {
            throw e22222;
        } catch (Throwable e3) {
            Log.b(z[34], e3);
            Log.a(z[32], null, new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
            return false;
        } catch (Throwable th) {
            while (true) {
                break;
            }
        }
    }

    private static long a(Context context) {
        long j = d.get();
        if (j != -1) {
            return j;
        }
        d.compareAndSet(-1, a(context, z[36], 0));
        return d.get();
    }

    public static k c(Context context, c cVar) {
        boolean z = true;
        long currentTimeMillis = System.currentTimeMillis();
        k a = a(context, cVar, true);
        if (cVar != c.REGISTRATION_FULL) {
            z = false;
        }
        ak4.a(context, z, a, System.currentTimeMillis() - currentTimeMillis);
        return a;
    }

    public static boolean b() {
        return g.compareAndSet(true, false);
    }

    public static long c(Context context) {
        long j = e.get();
        if (j != -1) {
            return j;
        }
        e.compareAndSet(-1, a(context, z[25], 85800000));
        return e.get();
    }

    private static f a(Context context, String str) {
        boolean z = a;
        Map c = e.c(context);
        Map g = App.P.g();
        f fVar = new f(null);
        HashSet j = App.j();
        for (Entry entry : c.entrySet()) {
            m8 m8Var;
            j jVar = (j) ((List) entry.getValue()).get(0);
            if (((List) entry.getValue()).size() > 1) {
                m8Var = (m8) g.get(entry.getKey());
            } else {
                m8Var = (m8) g.get(entry.getKey());
            }
            if (m8Var != null) {
                if (m8Var.a(jVar)) {
                    fVar.a(m8Var);
                    if (!z) {
                        continue;
                        if (z) {
                            break;
                        }
                    }
                }
                fVar.b(m8Var);
                if (!z) {
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            if (j.contains(entry.getKey())) {
                fVar.b(new m8(jVar));
                if (!z) {
                    continue;
                    if (z) {
                        break;
                    }
                }
            }
            fVar.c(new m8(jVar));
            continue;
            if (z) {
                break;
            }
        }
        for (Entry entry2 : g.entrySet()) {
            if (!c.containsKey(entry2.getKey())) {
                fVar.d((m8) entry2.getValue());
                continue;
            }
            if (z) {
                break;
            }
        }
        m8.a(fVar.c(), str + z[11], z[9]);
        m8.a(fVar.g(), str + z[8], z[13]);
        m8.a(fVar.f(), str + z[14], z[7]);
        m8.a(fVar.a(), str + z[10], z[12]);
        return fVar;
    }

    public static boolean a(m8 m8Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (m8Var.h == null) {
                Log.w(z[54] + m8Var);
                return false;
            }
            Collection arrayList = new ArrayList(1);
            arrayList.add(m8Var);
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(m8Var.h.a());
            f.close();
            if (!App.a(c.INTERACTIVE_DELTA, c(z[56]), 0, true, arrayList2)) {
                return false;
            }
            if (f.block(64000)) {
                a((List) arrayList, null);
                c.close();
                if (!App.a(new m8[]{m8Var})) {
                    return false;
                }
                App.b(new String[]{m8Var.e});
                if (c.block(64000)) {
                    b((List) arrayList, null);
                    App.P.b(arrayList);
                    Log.a(z[55], null, new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                    return true;
                }
                Log.w(z[53]);
                return false;
            }
            Log.w(z[51]);
            return false;
        } catch (Throwable e) {
            Log.b(z[50], e);
            Log.a(z[52], null, new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Integer r11, java.lang.String[] r12, java.lang.String[] r13) {
        /*
        r10 = 0;
        r9 = 1;
        r1 = 0;
        r2 = a;
        if (r11 == 0) goto L_0x0014;
    L_0x0007:
        r0 = z;
        r3 = 26;
        r0 = r0[r3];
        r3 = new java.lang.Object[r9];
        r3[r1] = r11;
        com.whatsapp.util.Log.b(r0, r10, r3);
    L_0x0014:
        if (r12 == 0) goto L_0x0060;
    L_0x0016:
        if (r13 == 0) goto L_0x0060;
    L_0x0018:
        r0 = r12.length;
        r3 = r13.length;
        if (r0 != r3) goto L_0x0046;
    L_0x001c:
        r0 = r1;
    L_0x001d:
        r3 = r12.length;
        if (r0 >= r3) goto L_0x0044;
    L_0x0020:
        r3 = r12[r0];
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x0040;
    L_0x0028:
        r3 = r13[r0];
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x0040;
    L_0x0030:
        r3 = b;
        r4 = r12[r0];
        r5 = new com.whatsapp.contact.p;
        r6 = 0;
        r8 = r13[r0];
        r5.<init>(r6, r8);
        r3.put(r4, r5);
    L_0x0040:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x001d;
    L_0x0044:
        if (r2 == 0) goto L_0x0060;
    L_0x0046:
        r0 = z;
        r2 = 27;
        r0 = r0[r2];
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r3 = r12.length;
        r3 = java.lang.Integer.valueOf(r3);
        r2[r1] = r3;
        r1 = r13.length;
        r1 = java.lang.Integer.valueOf(r1);
        r2[r9] = r1;
        com.whatsapp.util.Log.b(r0, r10, r2);
    L_0x0060:
        r0 = c;
        r0.open();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.i.a(java.lang.Integer, java.lang.String[], java.lang.String[]):void");
    }

    private static void a(List list, Collection collection) {
        boolean z = a;
        for (m8 m8Var : list) {
            boolean z2;
            bh bhVar = (bh) h.get(m8Var.h.a());
            if (bhVar == null) {
                Log.c(z[0], null, new Object[]{m8Var.h.a()});
                if (!z) {
                    continue;
                }
            }
            if (bhVar.b == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object obj = bhVar.a;
            if (!(m8Var.q == z2 && TextUtils.equals(m8Var.e, obj))) {
                m8Var.q = z2;
                m8Var.e = obj;
                if (collection != null) {
                    collection.add(m8Var);
                }
            }
            if (z) {
                return;
            }
        }
    }

    public static k d(Context context, c cVar) {
        boolean z = false;
        long currentTimeMillis = System.currentTimeMillis();
        k a = a(context, cVar, false);
        if (cVar == c.REGISTRATION_FULL) {
            z = true;
        }
        ak4.a(context, z, a, System.currentTimeMillis() - currentTimeMillis);
        return a;
    }

    private static void b(List list, Collection collection) {
        boolean z = a;
        for (m8 m8Var : list) {
            p pVar = (p) b.get(m8Var.e);
            if (!(pVar == null || (TextUtils.equals(pVar.a, m8Var.b) && pVar.b == m8Var.c))) {
                m8Var.b = pVar.a;
                m8Var.c = pVar.b;
                if (collection != null) {
                    collection.add(m8Var);
                    continue;
                } else {
                    continue;
                }
            }
            if (z) {
                return;
            }
        }
    }

    public static boolean d() {
        return g.get();
    }

    public static void a(String str) {
    }
}
