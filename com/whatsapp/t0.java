package com.whatsapp;

import android.backport.util.Base64;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class t0 extends HandlerThread {
    private static final al_ c;
    private static final String[] z;
    private String a;
    private Context b;
    private ArrayList d;
    private Handler e;
    private boolean f;
    private Map g;
    private boolean h;
    private Map i;
    private ArrayList j;
    private xa k;
    private Map l;
    private int m;

    private void a() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.whatsapp.t0.a():void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:223)
	at jadx.core.ProcessClass.process(ProcessClass.java:20)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
Caused by: java.lang.NullPointerException
*/
        /*
        r0_this = this;
        r4 = 0;
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r5.k;
        if (r0 == 0) goto L_0x0026;
        r0 = r5.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0024;
        r0 = r5.b;
        r1 = r5.k;
        r1 = r1.a;
        r0.unbindService(r1);
        r0 = r5.k;
        r0.a = r4;
        r0 = r5.k;
        r0.c = r4;
        r5.k = r4;
        r0 = 2;
        r5.m = r0;
        return;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t0.a():void");
    }

    private void a(ArrayList arrayList) {
        int i = App.az;
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(z[55], arrayList);
        try {
            bundle = this.k.c.getSkuDetails(3, this.a, z[56], bundle);
            if (bundle == null) {
                try {
                    Log.e(z[58]);
                    return;
                } catch (NullPointerException e) {
                    throw e;
                }
            }
            int a = a(bundle);
            try {
                switch (a) {
                    case aV.i /*6*/:
                        Log.e(z[53] + bundle);
                        if (i == 0) {
                            return;
                        }
                    case PBE.MD5 /*0*/:
                        if (bundle.containsKey(z[59])) {
                            Iterator it = bundle.getStringArrayList(z[57]).iterator();
                            while (it.hasNext()) {
                                xf xfVar = new xf((String) it.next());
                                this.g.put(xfVar.b(), xfVar);
                                this.i.put(xfVar.b(), xfVar.a());
                                if (i != 0) {
                                    if (i == 0) {
                                        break;
                                    }
                                    return;
                                }
                            }
                            if (i == 0) {
                                return;
                            }
                        } else {
                            Log.e(z[54] + bundle);
                            throw new IllegalStateException();
                        }
                }
                try {
                    Log.e(z[60] + a);
                    throw new IllegalStateException();
                } catch (NullPointerException e2) {
                    throw e2;
                }
            } catch (NullPointerException e22) {
                throw e22;
            } catch (NullPointerException e222) {
                throw e222;
            }
        } catch (NullPointerException e3) {
            Log.e(z[52]);
        }
    }

    static ArrayList f(t0 t0Var) {
        return t0Var.d;
    }

    static void d(t0 t0Var) {
        t0Var.d();
    }

    static int c(t0 t0Var) {
        return t0Var.m;
    }

    private int a(Intent intent) {
        return a(intent.getExtras().get(z[24]));
    }

    public void a(Integer num, String[] strArr) {
        c.a(num, strArr);
    }

    public void g() {
        try {
            if (e()) {
                try {
                    if (f()) {
                        this.e.post(new avk(this, new ng(this)));
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static al_ c() {
        return c;
    }

    private int a(Bundle bundle) {
        return a(bundle.get(z[2]));
    }

    public boolean f() {
        try {
            return !this.l.isEmpty();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void b(xg xgVar) {
        c.registerObserver(xgVar);
    }

    public t0(Context context) {
        super(z[26], 10);
        this.d = new ArrayList(3);
        this.l = new ConcurrentHashMap();
        this.i = new HashMap();
        this.g = new HashMap();
        this.j = new ArrayList();
        this.m = 2;
        this.f = false;
        this.h = false;
        this.d.add("1");
        this.d.add("3");
        this.d.add("5");
        this.i.put("1", z[27]);
        this.i.put("3", z[25]);
        this.i.put("5", z[28]);
        this.b = context.getApplicationContext();
        this.a = context.getPackageName();
        if (this.a == null) {
            Log.e(z[29]);
            App.o(z[30]);
            this.a = z[31];
        }
    }

    static void a(t0 t0Var) {
        t0Var.a();
    }

    static int a(t0 t0Var, int i) {
        t0Var.m = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(byte[] r7, com.whatsapp.hs r8) {
        /*
        r6_this = this;
        r0 = com.whatsapp.App.az;
        r1 = r8.c();
        r2 = r8.b();
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0044 }
        r3.<init>();	 Catch:{ RuntimeException -> 0x0044 }
        r4 = z;	 Catch:{ RuntimeException -> 0x0044 }
        r5 = 68;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x0044 }
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x0044 }
        r2 = r3.append(r2);	 Catch:{ RuntimeException -> 0x0044 }
        r3 = z;	 Catch:{ RuntimeException -> 0x0044 }
        r4 = 64;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x0044 }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x0044 }
        r2 = r2.append(r1);	 Catch:{ RuntimeException -> 0x0044 }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x0044 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ RuntimeException -> 0x0044 }
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ RuntimeException -> 0x0044 }
        if (r2 == 0) goto L_0x0046;
    L_0x0038:
        r0 = new java.lang.IllegalStateException;	 Catch:{ RuntimeException -> 0x0044 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0044 }
        r2 = 66;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0044 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0044 }
        throw r0;	 Catch:{ RuntimeException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r2 = r6.k;
        r2 = r2.c;
        r3 = 3;
        r4 = r6.a;
        r1 = r2.consumePurchase(r3, r4, r1);
        switch(r1) {
            case 0: goto L_0x0073;
            case 6: goto L_0x0089;
            case 8: goto L_0x007e;
            default: goto L_0x0054;
        };
    L_0x0054:
        r0 = new java.lang.IllegalStateException;	 Catch:{ RuntimeException -> 0x0071 }
        r2 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0071 }
        r2.<init>();	 Catch:{ RuntimeException -> 0x0071 }
        r3 = z;	 Catch:{ RuntimeException -> 0x0071 }
        r4 = 63;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x0071 }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x0071 }
        r1 = r2.append(r1);	 Catch:{ RuntimeException -> 0x0071 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0071 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0071 }
        throw r0;	 Catch:{ RuntimeException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r2 = z;	 Catch:{ RuntimeException -> 0x009f }
        r3 = 67;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x009f }
        com.whatsapp.util.Log.i(r2);	 Catch:{ RuntimeException -> 0x009f }
        if (r0 == 0) goto L_0x0094;
    L_0x007e:
        r2 = z;	 Catch:{ RuntimeException -> 0x00a1 }
        r3 = 62;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00a1 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ RuntimeException -> 0x00a1 }
        if (r0 == 0) goto L_0x0094;
    L_0x0089:
        r2 = z;	 Catch:{ RuntimeException -> 0x0071 }
        r3 = 65;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0071 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ RuntimeException -> 0x0071 }
        if (r0 != 0) goto L_0x0054;
    L_0x0094:
        r0 = r6.l;
        r0.remove(r7);
        r0 = c;
        r0.a(r8);
        return;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0071 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t0.a(byte[], com.whatsapp.hs):void");
    }

    public void a(atm com_whatsapp_atm) {
        Object a = com_whatsapp_atm.a();
        if (a == null) {
            try {
                throw new IllegalStateException();
            } catch (RuntimeException e) {
                throw e;
            }
        }
        hs hsVar = (hs) this.l.get(a);
        if (hsVar != null) {
            try {
                this.e.post(new avk(this, new j9(this, a, hsVar)));
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    public String a(String str) {
        String str2 = (String) this.i.get(str);
        if (str2 != null) {
            return str2;
        }
        try {
            throw new IllegalStateException();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static xa g(t0 t0Var) {
        return t0Var.k;
    }

    static {
        String[] strArr = new String[69];
        String str = " $\u0019`D>1M`@>$\u0007hS\u007f6\u0005\u007fW9&\u0005\"E96\u0003bO> \u0003y";
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
                        i3 = 80;
                        break;
                    case ay.f /*1*/:
                        i3 = 69;
                        break;
                    case ay.n /*2*/:
                        i3 = 96;
                        break;
                    case ay.p /*3*/:
                        i3 = 13;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0002\u00003]n\u001e\u0016%Rb\u001f\u0001%";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f7\u0005iD5(M}T\"&\blR5e";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0019\u000b!]q\u000f\u00155_b\u0018\u00043H~\u0014\u00044L~\u001c\f3Y";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "p5\u0015\u007fB8$\u0013h\u001c";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f\"\u0005y\f 0\u0012nI16\u0005~\u0001\" \u0013}N>6\u00050";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f4\u0015hS)h\u0010xS3-\u0001~D#j\u0016hS9#\tn@$,\u000fc\f6$\taD4e\u0010xS3-\u0001~Dm";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "p6\tjO11\u0015\u007fDm";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f5\u0012bB56\u0013 Q%7\u0003e@# \u0013\"S5!\u0005hL}5\u0015\u007fB8$\u0013h\u0001";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f\"\u0005y\f 0\u0012nI16\u0005~\u000e>0\fa";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f\"\u0005y\f 0\u0012nI16\u0005~\u000e2$\u0004 S56\u0010bO# ";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f \r}U)h\u0014bJ5+";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = "\u0019\u000b!]q\u000f\u00155_b\u0018\u00043H~\u0019\u0011%@~\u001c\f3Y";
                    obj = 12;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    strArr2 = strArr3;
                    str = "\u0019\u000b!]q\u000f\u0001!Y`\u000f\u0016)Jo\u0011\u00115_d\u000f\t)^u";
                    obj = 13;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0019\u000b!]q\u000f\u00155_b\u0018\u00043H~\u0019\u0011%@~\u001c\f3Y";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0019\u000b!]q\u000f\u0006/Cu\u0019\u000b5Lu\u0019\n.Ru\u001f\u000e%C";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0019\u000b!]q\u000f\u0001!Y`\u000f\u0016)Jo\u0011\u00115_d\u000f\t)^u";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f5\u0015\u007fB8$\u0013h\u0001";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0019\u000b!]q\u000f\u00155_b\u0018\u00043H~\u0014\u00044L~\u001c\f3Y";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "9+\u0001}Q";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f\"\u0005y\f 0\u0012nI16\u0005~\u000e\" \u0013}N>6\u00057\u0001";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f5\u0012bB56\u0013 Q%7\u0003e@# \u0013-R;0]";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "p6\tjO11\u0015\u007fDm";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0002\u00003]n\u001e\u0016%Rb\u001f\u0001%";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0005\u0016D?\u000ffr";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = " $\u0019`D>1";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0005\u0016D=\u000fi|";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0005\u0016D>\u000fgt";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f5\u0001nJ1\"\u0005 O1(\u0005\"O%)\f";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = ">0\fa\u0001 $\u0003f@7 @c@= ";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "3*\r#V8$\u0014~@ 5";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "9+\u0001}Q";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f'\taM9+\u0007 R%5\u0010bS$ \u0004";
                    obj = 32;
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    strArr2 = strArr3;
                    str = "3*\r#@>!\u0012bH4k\u0016hO4,\u000ej\u000f2,\faH>\"NDO\u00115\u0010OH<)\tcF\u0003 \u0012{H3 NOh\u001e\u0001";
                    obj = 33;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "3*\r#@>!\u0012bH4k\u0016hO4,\u000ej";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0005+\u0005uQ5&\u0014hEp1\u0019}Dp#\u000f\u007f\u00019+\u0014hO$e\u0012hR *\u000e~Dp&\u000fiDje";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f7\u0005~Q?+\u0013h\f3*\u0004h\u000e>0\fa\u000e?.";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f6\u0015nB56\u0013-E11\u00010";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f \u0012\u007fN\"j\u0015cJ>*\u0017c";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f&\u0001cB5)\u0005i";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "p \u0018yS16]";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f5\u0015\u007fB8$\u0013h\u000e#,\u0007c@$0\u0012h\u000e6$\taD4e\u0013fTm";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f*\u000e @31\t{H$<M\u007fD#0\fy\u00019+\u0014hO$x\u000exM<";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f*\u000e @31\t{H$<M\u007fD#0\fy\u0001\" \u0013}N>6\u00050";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f$\u0003yH&,\u0014t\f\" \u0013xM$e\u0012hR%)\u00140";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "p,\u000eyD>1]";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u0019\u000b!]q\u000f\u00155_b\u0018\u00043H~\u0014\u00044L";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "p6\tjO11\u0015\u007fDm";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f5\u0015\u007fB8$\u0013h\u000e#,\u0007c@$0\u0012h\u000e& \u0012dG9 \u0004";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0019\u000b!]q\u000f\u0001!Y`\u000f\u0016)Jo\u0011\u00115_d";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f,\u0013 C9)\fdO7h\u0013xQ *\u0012yD4e";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f\"\u0005y\f#.\u0015 E51\u0001dM#j\u000e}D";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f\"\u0005y\f#.\u0015 E51\u0001dM#j\u0005\u007fS?7@";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f\"\u0005y\f#.\u0015 E51\u0001dM#j\rdR#,\u000ej\f; \u0019-E51\u0001dM#x";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0019\u0011%@~\u0019\u0001?Ah\u0003\u0011";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "9+\u0001}Q";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0014\u00004Lh\u001c\u0016?Ah\u0003\u0011";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f\"\u0005y\f#.\u0015 E51\u0001dM#j\u000exM<";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u0014\u00004Lh\u001c\u0016?Ah\u0003\u0011";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f\"\u0005y\f#.\u0015 E51\u0001dM#e\u0012hR *\u000e~Dm";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f*\u000e M?*\u0010hS}5\u0012hQ17\u0005i";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f&\u000fcR%(\u0005\"R%&\u0003hR#h\u000ebU}*\u0017cD4";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f&\u000fcR%(\u0005\"D\"7\u000f\u007f\u0001\" \u0013}N>6\u00050";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "p1\u000ffD>x";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f&\u000fcR%(\u0005\"D\"7\u000f\u007f";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f&\u000fcR%(\u0005\"U?.\u0005c\f9+\u0016lM9!";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f&\u000fcR%(\u0005\"R%&\u0003hR#";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f&\u000fcR%(\u0005-R;0]";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new al_(null);
                default:
                    strArr2[i] = str;
                    str = " $\u0019`D>1M`@>$\u0007hS\u007f6\u0005\u007fW9&\u0005\"E96\u0003bO> \u0003y\u000e5=\u0003hQ$,\u000fc\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(hs hsVar) {
        Log.i(z[3] + hsVar);
        String a = hsVar.a();
        String d = hsVar.d();
        if (a != null) {
            try {
                if (a.length() > 0 && d != null) {
                    if (d.length() > 0) {
                        byte[] bytes = a.getBytes();
                        byte[] decode = Base64.decode(d, 0);
                        c.a();
                        this.l.put(bytes, hsVar);
                        App.b(bytes, decode);
                    }
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    protected void onLooperPrepared() {
        Log.i(z[61]);
        this.e = new j5(this);
        a(new avk(this, new p9(this)));
    }

    static xa a(t0 t0Var, xa xaVar) {
        t0Var.k = xaVar;
        return xaVar;
    }

    static int a(t0 t0Var, Bundle bundle) {
        return t0Var.a(bundle);
    }

    private int a(Object obj) {
        if (obj == null) {
            try {
                Log.e(z[37]);
                return 0;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        try {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            try {
                if (obj instanceof Long) {
                    return (int) ((Long) obj).longValue();
                }
                throw new RuntimeException(z[36] + obj.getClass().getName());
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    static void a(t0 t0Var, ArrayList arrayList) {
        t0Var.a(arrayList);
    }

    static String b(t0 t0Var) {
        return t0Var.a;
    }

    private void a(Runnable runnable) {
        ServiceConnection xzVar = new xz(this, runnable);
        this.b.bindService(new Intent(z[34]).setPackage(z[35]), xzVar, 1);
    }

    public void a(String str, String str2) {
        this.e.post(new avk(this, new a3g(this, str, str2)));
    }

    public void a(xg xgVar) {
        c.unregisterObserver(xgVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void b() {
        /*
        r12_this = this;
        r4 = com.whatsapp.App.az;
        r0 = 0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r12.j = r1;
    L_0x000a:
        r1 = r12.k;
        r1 = r1.c;
        r2 = 3;
        r3 = r12.a;
        r5 = z;
        r6 = 20;
        r5 = r5[r6];
        r5 = r1.getPurchases(r2, r3, r5, r0);
        if (r5 != 0) goto L_0x0027;
    L_0x001d:
        r0 = z;
        r1 = 10;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x0026:
        return;
    L_0x0027:
        r0 = r12.a(r5);
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0061 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0061 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0061 }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r1.append(r0);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0061 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0061 }
        if (r0 == 0) goto L_0x0063;
    L_0x0047:
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0061 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0061 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0061 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0061 }
        r0 = r1.append(r0);	 Catch:{ RuntimeException -> 0x0061 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0061 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x0061 }
        goto L_0x0026;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = z;	 Catch:{ RuntimeException -> 0x0092 }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0092 }
        r0 = r5.containsKey(r0);	 Catch:{ RuntimeException -> 0x0092 }
        if (r0 == 0) goto L_0x0086;
    L_0x006f:
        r0 = z;	 Catch:{ RuntimeException -> 0x0094 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0094 }
        r0 = r5.containsKey(r0);	 Catch:{ RuntimeException -> 0x0094 }
        if (r0 == 0) goto L_0x0086;
    L_0x007a:
        r0 = z;	 Catch:{ RuntimeException -> 0x0090 }
        r1 = 14;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0090 }
        r0 = r5.containsKey(r0);	 Catch:{ RuntimeException -> 0x0090 }
        if (r0 != 0) goto L_0x0096;
    L_0x0086:
        r0 = z;	 Catch:{ RuntimeException -> 0x0090 }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0090 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x0090 }
        goto L_0x0026;
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x0096:
        r0 = z;
        r1 = 15;
        r0 = r0[r1];
        r6 = r5.getStringArrayList(r0);
        r0 = z;
        r1 = 19;
        r0 = r0[r1];
        r7 = r5.getStringArrayList(r0);
        r0 = z;
        r1 = 17;
        r0 = r0[r1];
        r8 = r5.getStringArrayList(r0);
        r0 = 0;
        r3 = r0;
    L_0x00b6:
        r0 = r7.size();
        if (r3 >= r0) goto L_0x016f;
    L_0x00bc:
        r0 = r7.get(r3);
        r0 = (java.lang.String) r0;
        r1 = r8.get(r3);
        r1 = (java.lang.String) r1;
        r2 = r6.get(r3);
        r2 = (java.lang.String) r2;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = z;
        r11 = 22;
        r10 = r10[r11];
        r9 = r9.append(r10);
        r2 = r9.append(r2);
        r9 = z;
        r10 = 5;
        r9 = r9[r10];
        r2 = r2.append(r9);
        r2 = r2.append(r0);
        r9 = z;
        r10 = 8;
        r9 = r9[r10];
        r2 = r2.append(r9);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = com.whatsapp.ce.a;
        r2 = com.whatsapp.am7.a(r2, r0, r1);
        if (r2 == 0) goto L_0x0144;
    L_0x010b:
        r2 = new com.whatsapp.hs;
        r2.<init>(r0, r1);
        r9 = r2.c();	 Catch:{ RuntimeException -> 0x01b2 }
        r9 = android.text.TextUtils.isEmpty(r9);	 Catch:{ RuntimeException -> 0x01b2 }
        if (r9 == 0) goto L_0x013d;
    L_0x011a:
        r9 = z;	 Catch:{ RuntimeException -> 0x01b2 }
        r10 = 12;
        r9 = r9[r10];	 Catch:{ RuntimeException -> 0x01b2 }
        com.whatsapp.util.Log.e(r9);	 Catch:{ RuntimeException -> 0x01b2 }
        r9 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x01b2 }
        r9.<init>();	 Catch:{ RuntimeException -> 0x01b2 }
        r10 = z;	 Catch:{ RuntimeException -> 0x01b2 }
        r11 = 18;
        r10 = r10[r11];	 Catch:{ RuntimeException -> 0x01b2 }
        r9 = r9.append(r10);	 Catch:{ RuntimeException -> 0x01b2 }
        r9 = r9.append(r0);	 Catch:{ RuntimeException -> 0x01b2 }
        r9 = r9.toString();	 Catch:{ RuntimeException -> 0x01b2 }
        com.whatsapp.util.Log.i(r9);	 Catch:{ RuntimeException -> 0x01b2 }
    L_0x013d:
        r9 = r12.j;	 Catch:{ RuntimeException -> 0x01b4 }
        r9.add(r2);	 Catch:{ RuntimeException -> 0x01b4 }
        if (r4 == 0) goto L_0x016b;
    L_0x0144:
        r2 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x01b4 }
        r2.<init>();	 Catch:{ RuntimeException -> 0x01b4 }
        r9 = z;	 Catch:{ RuntimeException -> 0x01b4 }
        r10 = 7;
        r9 = r9[r10];	 Catch:{ RuntimeException -> 0x01b4 }
        r2 = r2.append(r9);	 Catch:{ RuntimeException -> 0x01b4 }
        r0 = r2.append(r0);	 Catch:{ RuntimeException -> 0x01b4 }
        r2 = z;	 Catch:{ RuntimeException -> 0x01b4 }
        r9 = 23;
        r2 = r2[r9];	 Catch:{ RuntimeException -> 0x01b4 }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x01b4 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x01b4 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x01b4 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x01b4 }
    L_0x016b:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x01b6;
    L_0x016f:
        r0 = z;
        r1 = 16;
        r0 = r0[r1];
        r0 = r5.getString(r0);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x000a;
    L_0x017f:
        r0 = r12.j;
        r1 = r0.iterator();
    L_0x0185:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0026;
    L_0x018b:
        r0 = r1.next();
        r0 = (com.whatsapp.hs) r0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r5 = 9;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r12.a(r0);
        if (r4 == 0) goto L_0x0185;
    L_0x01b0:
        goto L_0x0026;
    L_0x01b2:
        r0 = move-exception;
        throw r0;
    L_0x01b4:
        r0 = move-exception;
        throw r0;
    L_0x01b6:
        r3 = r0;
        goto L_0x00b6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t0.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean e() {
        /*
        r4_this = this;
        monitor-enter(r4);
        r0 = r4.f;	 Catch:{ RuntimeException -> 0x0026 }
        if (r0 == 0) goto L_0x002d;
    L_0x0005:
        r0 = r4.h;	 Catch:{ RuntimeException -> 0x0028 }
        if (r0 == 0) goto L_0x002d;
    L_0x0009:
        r0 = 1;
    L_0x000a:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002a }
        r1.<init>();	 Catch:{ all -> 0x002a }
        r2 = z;	 Catch:{ all -> 0x002a }
        r3 = 51;
        r2 = r2[r3];	 Catch:{ all -> 0x002a }
        r1 = r1.append(r2);	 Catch:{ all -> 0x002a }
        r1 = r1.append(r0);	 Catch:{ all -> 0x002a }
        r1 = r1.toString();	 Catch:{ all -> 0x002a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x002a }
        monitor-exit(r4);
        return r0;
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x002d:
        r0 = 0;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t0.e():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r8, android.content.Intent r9) {
        /*
        r7_this = this;
        r0 = com.whatsapp.App.az;
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0045 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0045 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0045 }
        r3 = 45;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0045 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0045 }
        r1 = r1.append(r8);	 Catch:{ RuntimeException -> 0x0045 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0045 }
        r3 = 46;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0045 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0045 }
        r1 = r1.append(r9);	 Catch:{ RuntimeException -> 0x0045 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0045 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0045 }
        switch(r8) {
            case -1: goto L_0x0035;
            case 0: goto L_0x010f;
            default: goto L_0x002d;
        };
    L_0x002d:
        r0 = new java.lang.IllegalStateException;	 Catch:{ RuntimeException -> 0x0033 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0033 }
        throw r0;	 Catch:{ RuntimeException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        if (r9 != 0) goto L_0x0047;
    L_0x0037:
        r0 = new java.lang.IllegalStateException;	 Catch:{ RuntimeException -> 0x0043 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0043 }
        r2 = 43;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0043 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0043 }
        throw r0;	 Catch:{ RuntimeException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0043 }
    L_0x0047:
        r1 = r7.a(r9);
        switch(r1) {
            case 0: goto L_0x006d;
            default: goto L_0x004e;
        };
    L_0x004e:
        r0 = new java.lang.IllegalStateException;	 Catch:{ RuntimeException -> 0x006b }
        r2 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x006b }
        r2.<init>();	 Catch:{ RuntimeException -> 0x006b }
        r3 = z;	 Catch:{ RuntimeException -> 0x006b }
        r4 = 44;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x006b }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x006b }
        r1 = r2.append(r1);	 Catch:{ RuntimeException -> 0x006b }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x006b }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x006b }
        throw r0;	 Catch:{ RuntimeException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r2 = z;
        r3 = 47;
        r2 = r2[r3];
        r2 = r9.getStringExtra(r2);
        r3 = z;
        r4 = 50;
        r3 = r3[r4];
        r3 = r9.getStringExtra(r3);
        r4 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00cd }
        r4.<init>();	 Catch:{ RuntimeException -> 0x00cd }
        r5 = z;	 Catch:{ RuntimeException -> 0x00cd }
        r6 = 38;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x00cd }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x00cd }
        r4 = r4.append(r2);	 Catch:{ RuntimeException -> 0x00cd }
        r5 = z;	 Catch:{ RuntimeException -> 0x00cd }
        r6 = 48;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x00cd }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x00cd }
        r4 = r4.append(r3);	 Catch:{ RuntimeException -> 0x00cd }
        r5 = z;	 Catch:{ RuntimeException -> 0x00cd }
        r6 = 41;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x00cd }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x00cd }
        r5 = r9.getExtras();	 Catch:{ RuntimeException -> 0x00cd }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x00cd }
        r4 = r4.toString();	 Catch:{ RuntimeException -> 0x00cd }
        com.whatsapp.util.Log.i(r4);	 Catch:{ RuntimeException -> 0x00cd }
        if (r2 == 0) goto L_0x00bf;
    L_0x00bd:
        if (r3 != 0) goto L_0x00cf;
    L_0x00bf:
        r0 = new java.lang.IllegalStateException;	 Catch:{ RuntimeException -> 0x00cb }
        r1 = z;	 Catch:{ RuntimeException -> 0x00cb }
        r2 = 39;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x00cb }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00cb }
        throw r0;	 Catch:{ RuntimeException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00cb }
    L_0x00cf:
        r4 = new com.whatsapp.hs;
        r4.<init>(r2, r3);
        r5 = r4.b();
        r6 = com.whatsapp.ce.a;	 Catch:{ RuntimeException -> 0x00fd }
        r2 = com.whatsapp.am7.a(r6, r2, r3);	 Catch:{ RuntimeException -> 0x00fd }
        if (r2 != 0) goto L_0x00ff;
    L_0x00e0:
        r0 = new java.lang.IllegalStateException;	 Catch:{ RuntimeException -> 0x00fd }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00fd }
        r1.<init>();	 Catch:{ RuntimeException -> 0x00fd }
        r2 = z;	 Catch:{ RuntimeException -> 0x00fd }
        r3 = 42;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00fd }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x00fd }
        r1 = r1.append(r5);	 Catch:{ RuntimeException -> 0x00fd }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x00fd }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x00fd }
        throw r0;	 Catch:{ RuntimeException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        throw r0;
    L_0x00ff:
        r2 = z;	 Catch:{ RuntimeException -> 0x006b }
        r3 = 49;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x006b }
        com.whatsapp.util.Log.i(r2);	 Catch:{ RuntimeException -> 0x006b }
        r7.a(r4);	 Catch:{ RuntimeException -> 0x006b }
        if (r0 != 0) goto L_0x004e;
    L_0x010d:
        if (r0 == 0) goto L_0x011a;
    L_0x010f:
        r1 = z;	 Catch:{ RuntimeException -> 0x0033 }
        r2 = 40;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0033 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0033 }
        if (r0 != 0) goto L_0x002d;
    L_0x011a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.t0.a(int, android.content.Intent):void");
    }

    static void a(t0 t0Var, Runnable runnable) {
        t0Var.a(runnable);
    }

    private void d() {
        int i = 3;
        try {
            i = this.k.c.isBillingSupported(3, this.a, z[32]);
        } catch (Throwable e) {
            Log.b(z[33], e);
        }
        synchronized (this) {
            boolean z;
            this.f = true;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.h = z;
        }
    }

    static Handler e(t0 t0Var) {
        return t0Var.e;
    }
}
