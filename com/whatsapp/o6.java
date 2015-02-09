package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import com.actionbarsherlock.R;
import com.whatsapp.contact.e;
import com.whatsapp.contact.m;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class o6 extends AsyncTask {
    private static final String[] z;
    String a;
    Activity b;
    boolean c;
    ho d;
    boolean e;
    HashMap f;

    static {
        String[] strArr = new String[19];
        String str = "\u0004<5Y}\u0014-#Ns\n'$[b\u0012'\u007fTyJ'5H`\u0002&}Ib\u0006 %I";
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
                        i3 = 103;
                        break;
                    case ay.f /*1*/:
                        i3 = 84;
                        break;
                    case ay.n /*2*/:
                        i3 = 80;
                        break;
                    case ay.p /*3*/:
                        i3 = 58;
                        break;
                    default:
                        i3 = 22;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u00111\"I\u007f\b:";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "J!>Qx\b#>";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0004<1N";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000291Sz";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0004<5Y}\u0014-#Ns\n'$[b\u0012'\u007fTyJ7?Tx\u00027$S`\u000e )";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0004<5Y}\u0014-#Ns\n'$[b\u0012'\u007f_d\u0015;\"\u001a";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "G|";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u00066?ObH7?Tb\u00067$I9\u0004;%TbG";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0004<5Y}\u0014-#Ns\n'$[b\u0012'\u007fSy\u0002&\"UdG";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0012:;Ty\u0010:";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u00066?ObH#9\\\u007f\u001485_fH:?N;\u0001;%Tr";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0010=6SI\u001485_f8$?V\u007f\u0004-";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\t1&_d";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u00066?ObH#9\\\u007f\u001485_fH1\"Hy\u0015t";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u000316[c\u000b ";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u00066?ObH#9\\\u007f\u001485_fH";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\t1&_dJ#8Sz\u0002y Vc\u000035^";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001517";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((Integer) obj);
    }

    protected void onPreExecute() {
        this.b.showDialog(122);
    }

    protected void a(Integer num) {
        Boolean bool;
        Integer num2 = null;
        int i = App.az;
        this.b.removeDialog(122);
        if (!App.a()) {
            Log.i(z[6]);
            this.d.f(this.b.getString(R.string.register_check_connectivity, new Object[]{this.b.getString(R.string.connectivity_self_help_instructions)}));
            if (i == 0) {
                return;
            }
        }
        if (this.f == null || this.f.size() == 0) {
            Log.i(z[0]);
            if (this.c) {
                if (!this.b.isFinishing()) {
                    this.b.showDialog(123);
                    if (i == 0) {
                        return;
                    }
                }
                return;
            }
            UserFeedbackActivity.a(this.b, this.a, (this.e ? z[4] : z[1]) + z[3], this.e ? Integer.valueOf(1) : null);
            if (i == 0) {
                return;
            }
        }
        Boolean bool2 = Boolean.TRUE;
        Boolean bool3 = Boolean.TRUE;
        ArrayList arrayList = new ArrayList();
        Boolean bool4 = bool2;
        bool2 = bool3;
        for (String str : this.f.keySet()) {
            if (z[2].equals(str)) {
                bool2 = (Boolean) this.f.get(str);
                if (i == 0) {
                    bool3 = bool2;
                    bool2 = bool4;
                    if (i == 0) {
                        bool = bool3;
                        bool4 = bool2;
                        break;
                    }
                    bool4 = bool2;
                    bool2 = bool3;
                }
            }
            bool = bool2;
            if (z[5].equals(str)) {
                bool2 = (Boolean) this.f.get(str);
                if (i == 0) {
                    bool3 = bool;
                    if (i == 0) {
                        bool = bool3;
                        bool4 = bool2;
                        break;
                    }
                    bool4 = bool2;
                    bool2 = bool3;
                } else {
                    bool4 = bool2;
                }
            }
            if (!((Boolean) this.f.get(str)).booleanValue()) {
                arrayList.add(str);
            }
            bool3 = bool;
            bool2 = bool4;
            if (i == 0) {
                bool = bool3;
                bool4 = bool2;
                break;
            }
            bool4 = bool2;
            bool2 = bool3;
        }
        bool = bool2;
        if (arrayList.size() == 0 && bool.booleanValue() && !this.c) {
            Integer valueOf;
            Context context = this.b;
            String str2 = this.a;
            if (this.e) {
                valueOf = Integer.valueOf(1);
            } else {
                valueOf = null;
            }
            UserFeedbackActivity.a(context, str2, null, valueOf);
            if (i == 0) {
                return;
            }
        }
        Context context2 = this.b;
        String str3 = this.a;
        if (this.e) {
            num2 = Integer.valueOf(1);
        }
        SystemStatusActivity.a(context2, str3, num2, bool4.booleanValue(), bool.booleanValue(), arrayList, this.c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a() {
        /*
        r4_this = this;
        r1 = com.whatsapp.App.az;
        r0 = r4.b;	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r0 = r0.getContentResolver();	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r2 = z;	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r0 = android.provider.Settings.System.getInt(r0, r2);	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        switch(r0) {
            case 0: goto L_0x0036;
            case 1: goto L_0x0046;
            case 2: goto L_0x003e;
            default: goto L_0x0015;
        };	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
    L_0x0015:
        r0 = z;	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
    L_0x001b:
        r1 = new java.lang.StringBuilder;	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r1.<init>();	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r2 = z;	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r1 = r1.append(r2);	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r0 = r1.append(r0);	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r0 = r0.toString();	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
    L_0x0035:
        return;
    L_0x0036:
        r0 = z;	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r2 = 16;
        r0 = r0[r2];	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        if (r1 == 0) goto L_0x001b;
    L_0x003e:
        r0 = z;	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r2 = 14;
        r0 = r0[r2];	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        if (r1 == 0) goto L_0x001b;
    L_0x0046:
        r0 = z;	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        r2 = 18;
        r0 = r0[r2];	 Catch:{ SettingNotFoundException -> 0x004f, Exception -> 0x005a }
        if (r1 == 0) goto L_0x001b;
    L_0x004e:
        goto L_0x0015;
    L_0x004f:
        r0 = move-exception;
        r0 = z;
        r1 = 12;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        goto L_0x0035;
    L_0x005a:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 15;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.o6.a():void");
    }

    public o6(Activity activity, ho hoVar, boolean z, boolean z2, String str) {
        this.c = false;
        this.b = activity;
        this.d = hoVar;
        this.c = z;
        this.e = z2;
        this.a = str;
    }

    protected Integer a(String[] strArr) {
        try {
            this.f = fm.a();
            if (!this.c) {
                a();
                Log.i(z[9] + e.a(m.INVISIBLE_ONLY) + "/" + e.a(m.BOTH) + z[8] + App.n(App.p) + ")");
            }
            return Integer.valueOf(0);
        } catch (IOException e) {
            Log.w(z[10] + e.toString());
            this.f = null;
            return Integer.valueOf(-1);
        } catch (Exception e2) {
            Log.w(z[7] + e2.toString());
            this.f = null;
            return Integer.valueOf(-1);
        }
    }
}
