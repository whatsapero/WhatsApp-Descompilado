package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract.Contacts;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class GroupChatInfo extends DialogToastListActivity implements anq {
    private static final String[] H;
    private static GroupChatInfo u;
    private View A;
    private m8 B;
    private View C;
    private String D;
    private ListView E;
    private hc F;
    private m8 G;
    private TextView i;
    private ji j;
    private ImageView k;
    private TextView l;
    private ArrayList m;
    private TextView n;
    private fk o;
    private z6 p;
    private TextView q;
    private View r;
    private HashMap s;
    private TextView t;
    private ImageButton v;
    private TextView w;
    private final Handler x;
    private final fc y;
    OnCheckedChangeListener z;

    static {
        String[] strArr = new String[25];
        String str = "\u000fzH";
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
                        i3 = 19;
                        break;
                    case ay.n /*2*/:
                        i3 = 44;
                        break;
                    case ay.p /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\rkE$\u001a\u000faC%57yE4";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "(`\u0002'-\tg_15\u0018=B51";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u000faC%57zB6*GwI#1\u001a|U";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u001bv@5&\u001cvH\u000f/\u0001w";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\t}H\"*\u0001w\u00029+\u001cvB$k\tpX9*\u0006=e\u001e\u0016-Ax";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000faC%5HzB6*GpC>1\rkXp6\u0011`X5(HpC>1\tpXp)\u0001`Xp&\u0007f@4e\u0006|Xp#\u0007fB4";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0018{C> ";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u000fzH";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u000faC%5\u000b{M$,\u0006uC\u007f&\u001avM$,\u0007}\u0001$,\u0005v\u000357\u001a|^p";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u000faC%5\u000b{M$,\u0006uC\u007f$\fw\f5=\u0001`X9+\u000f3O?+\u001crO$\u007fHrO$,\u001ezX)e\u0006|Xp#\u0007fB4iHc^?'\tq@)e\u001crN< \u001c";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\r}H\u000f\"\u001a|Y \u001a\u0002zH";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0018{C> ";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\t}H\"*\u0001w\u00029+\u001cvB$k\tpX9*\u0006=e\u001e\u0016-Ax\u000f\n:Li\u0014\f<";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0018{C> 7gU  ";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u001e}H~$\u0006w^?,\f=O%7\u001b|^~,\u001cvA\u007f&\u0007}X1&\u001c";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u000faC%57zB6*Gp^5$\u001cv";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u000fzH";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    str = "\u001bv@5&\u001cvH\u000f/\u0001w";
                    obj = 18;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "\u0004rU?0\u001cLE>#\u0004rX57";
                    obj = 19;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u000faC%57zB6*GaI#0\u0004g\u0003#.\u0001c\u00033*\u0006gM31H}C$e\twH5!H";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u000faC%57zB6*GaI#0\u0004g\u00033*\u0006gM31H}C$e\twH5!H";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0001`s\" \u001bvX";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u000b|B$$\u000bg";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    H = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u000faC%57zB6*GpD1+\u000fv\f#0\nyI31R";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void m(GroupChatInfo groupChatInfo) {
        groupChatInfo.k();
    }

    private void a(ArrayList arrayList, String str) {
        int i = App.az;
        for (l6 l6Var : bd.i(str).b()) {
            m8 a = App.P.a(l6Var.d);
            try {
                if (!arrayList.contains(a)) {
                    arrayList.add(a);
                }
                try {
                    if (l6Var.a) {
                        this.s.put(a.e, a);
                        continue;
                    }
                    if (i != 0) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        Collections.sort(arrayList, new af1(getApplicationContext()));
    }

    private void p() {
        try {
            Intent intent = new Intent(H[14]);
            intent.setType(H[16]);
            intent.putExtra(H[13], this.B.a((Context) this));
            intent.putExtra(H[15], 2);
            intent.setFlags(524288);
            startActivityForResult(intent, 11);
        } catch (ActivityNotFoundException e) {
            showDialog(4);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h(java.lang.String r9) {
        /*
        r8_this = this;
        r1 = 0;
        r7 = com.whatsapp.App.az;
        r0 = r8.G;	 Catch:{ NumberFormatException -> 0x0082 }
        r0 = r0.a(r8);	 Catch:{ NumberFormatException -> 0x0082 }
        r0 = r0.equals(r9);	 Catch:{ NumberFormatException -> 0x0082 }
        if (r0 != 0) goto L_0x0081;
    L_0x000f:
        r0 = com.whatsapp.App.a();	 Catch:{ NumberFormatException -> 0x0082 }
        if (r0 == 0) goto L_0x0076;
    L_0x0015:
        r0 = r9.length();
        r0 = r9.codePointCount(r1, r0);
        r1 = com.whatsapp.ge.s;	 Catch:{ NumberFormatException -> 0x0084 }
        if (r0 > r1) goto L_0x0059;
    L_0x0021:
        r0 = r8.C;	 Catch:{ NumberFormatException -> 0x0086 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0086 }
        r0 = r8.v;	 Catch:{ NumberFormatException -> 0x0086 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ NumberFormatException -> 0x0086 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0086 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0086 }
        r1 = H;	 Catch:{ NumberFormatException -> 0x0086 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0086 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x0086 }
        r0 = r0.append(r9);	 Catch:{ NumberFormatException -> 0x0086 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0086 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0086 }
        r0 = new com.whatsapp.mu;	 Catch:{ NumberFormatException -> 0x0086 }
        r2 = r8.D;	 Catch:{ NumberFormatException -> 0x0086 }
        r4 = 0;
        r5 = 15;
        r6 = 0;
        r1 = r8;
        r3 = r9;
        r0.<init>(r1, r2, r3, r4, r5, r6);	 Catch:{ NumberFormatException -> 0x0086 }
        com.whatsapp.App.e(r0);	 Catch:{ NumberFormatException -> 0x0086 }
        if (r7 == 0) goto L_0x0074;
    L_0x0059:
        r0 = 2131624962; // 0x7f0e0402 float:1.8877119E38 double:1.0531626635E-314;
        r0 = r8.getString(r0);	 Catch:{ NumberFormatException -> 0x0086 }
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ NumberFormatException -> 0x0086 }
        r2 = 0;
        r3 = com.whatsapp.ge.s;	 Catch:{ NumberFormatException -> 0x0086 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NumberFormatException -> 0x0086 }
        r1[r2] = r3;	 Catch:{ NumberFormatException -> 0x0086 }
        r0 = java.lang.String.format(r0, r1);	 Catch:{ NumberFormatException -> 0x0086 }
        r1 = 0;
        com.whatsapp.App.a(r8, r0, r1);	 Catch:{ NumberFormatException -> 0x0086 }
    L_0x0074:
        if (r7 == 0) goto L_0x0081;
    L_0x0076:
        r0 = r8.getBaseContext();	 Catch:{ NumberFormatException -> 0x0088 }
        r1 = 2131624620; // 0x7f0e02ac float:1.8876425E38 double:1.0531624946E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ NumberFormatException -> 0x0088 }
    L_0x0081:
        return;
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;
    L_0x0088:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.h(java.lang.String):void");
    }

    public void a(Collection collection) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r3_this = this;
        r0 = 2131427834; // 0x7f0b01fa float:1.8477295E38 double:1.0530652694E-314;
        r0 = r3.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0030 }
        r2 = 14;
        if (r1 < r2) goto L_0x001a;
    L_0x000f:
        r1 = new android.widget.Switch;	 Catch:{ NumberFormatException -> 0x0032 }
        r1.<init>(r3);	 Catch:{ NumberFormatException -> 0x0032 }
        r3.l = r1;	 Catch:{ NumberFormatException -> 0x0032 }
        r1 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x0032 }
        if (r1 == 0) goto L_0x0021;
    L_0x001a:
        r1 = new android.widget.ToggleButton;	 Catch:{ NumberFormatException -> 0x0032 }
        r1.<init>(r3);	 Catch:{ NumberFormatException -> 0x0032 }
        r3.l = r1;	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0021:
        r1 = r3.l;
        r1 = (android.widget.CompoundButton) r1;
        r2 = r3.z;
        r1.setOnCheckedChangeListener(r2);
        r1 = r3.l;
        r0.addView(r1);
        return;
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.i():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
        r9_this = this;
        r8 = 2131624380; // 0x7f0e01bc float:1.8875938E38 double:1.053162376E-314;
        r7 = 1;
        r6 = 0;
        r0 = r9.w;
        r1 = r9.G;
        r1 = r1.a(r9);
        r1 = com.whatsapp.util.a5.d(r1, r9);
        r0.setText(r1);
        r0 = r9.G;	 Catch:{ NumberFormatException -> 0x0088 }
        r0 = r0.s;	 Catch:{ NumberFormatException -> 0x0088 }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0088 }
        r0 = com.whatsapp.App.c(r0);	 Catch:{ NumberFormatException -> 0x0088 }
        r0 = com.whatsapp.util.bm.e(r9, r0);	 Catch:{ NumberFormatException -> 0x0088 }
        r1 = r9.n;	 Catch:{ NumberFormatException -> 0x0088 }
        r2 = r9.getResources();	 Catch:{ NumberFormatException -> 0x0088 }
        r3 = 2131624380; // 0x7f0e01bc float:1.8875938E38 double:1.053162376E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x0088 }
        r5 = 0;
        r4[r5] = r0;	 Catch:{ NumberFormatException -> 0x0088 }
        r0 = r2.getString(r3, r4);	 Catch:{ NumberFormatException -> 0x0088 }
        r1.setText(r0);	 Catch:{ NumberFormatException -> 0x0088 }
    L_0x003a:
        r0 = r9.G;
        r0 = r0.f();
        r1 = com.whatsapp.App.P;	 Catch:{ NumberFormatException -> 0x00bd }
        r1 = r1.h(r0);	 Catch:{ NumberFormatException -> 0x00bd }
        if (r1 == 0) goto L_0x0058;
    L_0x0048:
        r1 = r9.i;	 Catch:{ NumberFormatException -> 0x00bf }
        r2 = 2131624382; // 0x7f0e01be float:1.8875942E38 double:1.053162377E-314;
        r2 = r9.getString(r2);	 Catch:{ NumberFormatException -> 0x00bf }
        r1.setText(r2);	 Catch:{ NumberFormatException -> 0x00bf }
        r1 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x00bf }
        if (r1 == 0) goto L_0x0074;
    L_0x0058:
        r1 = r9.i;	 Catch:{ NumberFormatException -> 0x00bf }
        r2 = 2131624381; // 0x7f0e01bd float:1.887594E38 double:1.0531623765E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ NumberFormatException -> 0x00bf }
        r4 = 0;
        r5 = com.whatsapp.App.P;	 Catch:{ NumberFormatException -> 0x00bf }
        r0 = r5.a(r0);	 Catch:{ NumberFormatException -> 0x00bf }
        r0 = r0.d();	 Catch:{ NumberFormatException -> 0x00bf }
        r3[r4] = r0;	 Catch:{ NumberFormatException -> 0x00bf }
        r0 = r9.getString(r2, r3);	 Catch:{ NumberFormatException -> 0x00bf }
        r1.setText(r0);	 Catch:{ NumberFormatException -> 0x00bf }
    L_0x0074:
        r0 = 2131427513; // 0x7f0b00b9 float:1.8476644E38 double:1.053065111E-314;
        r0 = r9.findViewById(r0);
        r1 = r0.getViewTreeObserver();
        r2 = new com.whatsapp.uv;
        r2.<init>(r9, r0);
        r1.addOnGlobalLayoutListener(r2);
        return;
    L_0x0088:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = H;
        r3 = 10;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r9.n;
        r1 = r9.getResources();
        r2 = new java.lang.Object[r7];
        r3 = 2131625039; // 0x7f0e044f float:1.8877275E38 double:1.0531627016E-314;
        r3 = r9.getString(r3);
        r2[r6] = r3;
        r1 = r1.getString(r8, r2);
        r0.setText(r1);
        goto L_0x003a;
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.m():void");
    }

    static void a(GroupChatInfo groupChatInfo, int i) {
        groupChatInfo.b(i);
    }

    static ArrayList l(GroupChatInfo groupChatInfo) {
        return groupChatInfo.m;
    }

    static void a(GroupChatInfo groupChatInfo) {
        groupChatInfo.d();
    }

    static TextView r(GroupChatInfo groupChatInfo) {
        return groupChatInfo.l;
    }

    private void a(ArrayList arrayList) {
        ContactInfo.a(arrayList, this.D, (Activity) this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.ArrayList r14) {
        /*
        r13_this = this;
        r12 = 12;
        r5 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r14.size();
        r1 = 2131427836; // 0x7f0b01fc float:1.84773E38 double:1.0530652704E-314;
        r1 = r13.findViewById(r1);
        if (r0 != 0) goto L_0x0020;
    L_0x0012:
        r2 = r13.t;	 Catch:{ NumberFormatException -> 0x0128 }
        r4 = 8;
        r2.setVisibility(r4);	 Catch:{ NumberFormatException -> 0x0128 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x0128 }
        if (r3 == 0) goto L_0x0127;
    L_0x0020:
        r2 = r13.t;
        r0 = java.lang.Integer.toString(r0);
        r2.setText(r0);
        r0 = r13.t;
        r0.setVisibility(r5);
        r1.setVisibility(r5);
        r0 = 2131427841; // 0x7f0b0201 float:1.847731E38 double:1.053065273E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r1 = new com.whatsapp.i5;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        r0.removeAllViews();
        r1 = r13.getResources();
        r2 = 2131361864; // 0x7f0a0048 float:1.8343492E38 double:1.053032676E-314;
        r4 = r1.getDimensionPixelSize(r2);
        r1 = r13.getResources();
        r2 = 2131361865; // 0x7f0a0049 float:1.8343494E38 double:1.0530326764E-314;
        r5 = r1.getDimensionPixelSize(r2);
        r6 = new android.widget.ImageView;
        r6.<init>(r13);
        r1 = 2130839096; // 0x7f020638 float:1.7283193E38 double:1.052774394E-314;
        r6.setBackgroundResource(r1);	 Catch:{ NumberFormatException -> 0x012a }
        r6.setPadding(r4, r4, r4, r4);	 Catch:{ NumberFormatException -> 0x012a }
        r1 = new com.whatsapp.ava;	 Catch:{ NumberFormatException -> 0x012a }
        r1.<init>(r13);	 Catch:{ NumberFormatException -> 0x012a }
        r6.setOnClickListener(r1);	 Catch:{ NumberFormatException -> 0x012a }
        r1 = new com.whatsapp.util.bd;	 Catch:{ NumberFormatException -> 0x012a }
        r2 = r13.getResources();	 Catch:{ NumberFormatException -> 0x012a }
        r7 = 2130838771; // 0x7f0204f3 float:1.7282534E38 double:1.0527742336E-314;
        r2 = r2.getDrawable(r7);	 Catch:{ NumberFormatException -> 0x012a }
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x012a }
        r6.setImageDrawable(r1);	 Catch:{ NumberFormatException -> 0x012a }
        r1 = android.widget.ImageView.ScaleType.CENTER;	 Catch:{ NumberFormatException -> 0x012a }
        r6.setScaleType(r1);	 Catch:{ NumberFormatException -> 0x012a }
        r1 = com.whatsapp.App.as();	 Catch:{ NumberFormatException -> 0x012a }
        if (r1 != 0) goto L_0x0098;
    L_0x008f:
        r1 = r14.size();	 Catch:{ NumberFormatException -> 0x012c }
        if (r1 < r12) goto L_0x0098;
    L_0x0095:
        r0.addView(r6);	 Catch:{ NumberFormatException -> 0x012c }
    L_0x0098:
        r1 = r13.getResources();
        r2 = 2131361863; // 0x7f0a0047 float:1.834349E38 double:1.0530326754E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r7 = (float) r1;
        r8 = r14.iterator();
    L_0x00a8:
        r1 = r8.hasNext();
        if (r1 == 0) goto L_0x0101;
    L_0x00ae:
        r1 = r8.next();
        r1 = (com.whatsapp.protocol.b) r1;
        r9 = new com.whatsapp.ThumbnailTextButton;
        r9.<init>(r13);
        r2 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r9.setScaleType(r2);
        r2 = new android.view.ViewGroup$LayoutParams;
        r10 = r5 + r4;
        r11 = r5 + r4;
        r2.<init>(r10, r11);
        r9.setLayoutParams(r2);
        r9.setPadding(r4, r4, r4, r4);
        r9.setRadius(r7);
        r2 = r5 / 6;
        r2 = (float) r2;
        r9.setTextSize(r2);
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9.setBorderSize(r2);
        r2 = 1711276032; // 0x66000000 float:1.5111573E23 double:8.45482698E-315;
        r9.setBorderColor(r2);
        r2 = com.whatsapp.util.bo.b(r1);
        if (r2 != 0) goto L_0x00ea;
    L_0x00e6:
        r2 = com.whatsapp.util.b0.f(r13);
    L_0x00ea:
        r9.setImageBitmap(r2);
        r2 = com.whatsapp.App.P;
        r1 = r1.F;
        r1 = r2.a(r1);
        r1 = r1.o();
        r9.setText(r1);
        r0.addView(r9);
        if (r3 == 0) goto L_0x00a8;
    L_0x0101:
        r1 = com.whatsapp.App.as();	 Catch:{ NumberFormatException -> 0x012e }
        if (r1 == 0) goto L_0x0112;
    L_0x0107:
        r1 = r14.size();	 Catch:{ NumberFormatException -> 0x0130 }
        if (r1 < r12) goto L_0x0127;
    L_0x010d:
        r0.addView(r6);	 Catch:{ NumberFormatException -> 0x0130 }
        if (r3 == 0) goto L_0x0127;
    L_0x0112:
        r0 = 2131427840; // 0x7f0b0200 float:1.8477308E38 double:1.0530652723E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.HorizontalScrollView) r0;
        r1 = r0.getViewTreeObserver();
        r2 = new com.whatsapp.a1d;
        r2.<init>(r13, r0);
        r1.addOnGlobalLayoutListener(r2);
    L_0x0127:
        return;
    L_0x0128:
        r0 = move-exception;
        throw r0;
    L_0x012a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x012c }
    L_0x012c:
        r0 = move-exception;
        throw r0;
    L_0x012e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0130 }
    L_0x0130:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.b(java.util.ArrayList):void");
    }

    static ListView f(GroupChatInfo groupChatInfo) {
        return groupChatInfo.E;
    }

    private void k() {
        try {
            if (!isFinishing()) {
                this.E.postDelayed(new t8(this), 300);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void k(GroupChatInfo groupChatInfo) {
        groupChatInfo.o();
    }

    public static void a(m8 m8Var, Activity activity) {
        Intent intent = new Intent(activity, GroupChatInfo.class);
        intent.putExtra(H[9], m8Var.e);
        activity.startActivity(intent);
    }

    static fk s(GroupChatInfo groupChatInfo) {
        return groupChatInfo.o;
    }

    private void n() {
        try {
            if (App.az()) {
                runOnUiThread(new c0(this));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void e(String str) {
        try {
            try {
                if (u == null) {
                    return;
                }
                if (u.D.equals(str)) {
                    u.g();
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static View i(GroupChatInfo groupChatInfo) {
        return groupChatInfo.C;
    }

    public void a(String str) {
        if (str != null) {
            try {
                if (str.equals(App.af() + H[3])) {
                    this.F.notifyDataSetChanged();
                    if (App.az == 0) {
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        m8 a = App.P.a(str);
        if (a != null) {
            m8.a(this.m, new aty(a));
            this.F.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
        r11_this = this;
        r10 = 2131427830; // 0x7f0b01f6 float:1.8477287E38 double:1.0530652674E-314;
        r9 = 2131427618; // 0x7f0b0122 float:1.8476857E38 double:1.0530651627E-314;
        r2 = 1;
        r3 = 8;
        r1 = 0;
        r5 = com.whatsapp.App.az;
        r0 = H;
        r4 = 17;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r12);
        r0 = com.whatsapp.fieldstats.au.GROUP_INFO;
        com.whatsapp.ak4.a(r0);
        r6 = 5;
        r11.requestWindowFeature(r6);
        r0 = r11.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r2);
        r0 = 2130903150; // 0x7f03006e float:1.741311E38 double:1.052806041E-314;
        r11.setContentView(r0);
        r0 = r11.getIntent();
        r4 = H;
        r6 = 18;
        r4 = r4[r6];
        r0 = r0.getStringExtra(r4);
        r11.D = r0;
        r0 = com.whatsapp.App.P;
        r4 = r11.D;
        r0 = r0.a(r4);
        r11.G = r0;
        r0 = r11.s;
        r0.clear();
        r0 = r11.m;
        r4 = r11.D;
        r11.a(r0, r4);
        r0 = r11.getListView();
        r11.E = r0;
        r0 = new com.whatsapp.hc;
        r4 = r11.m;
        r0.<init>(r11, r11, r4);
        r11.F = r0;
        r0 = r11.getBaseContext();
        r4 = H;
        r6 = 20;
        r4 = r4[r6];
        r0 = r0.getSystemService(r4);
        r0 = (android.view.LayoutInflater) r0;
        r4 = 2130903151; // 0x7f03006f float:1.7413112E38 double:1.0528060415E-314;
        r6 = r11.E;
        r4 = com.whatsapp.b7.a(r0, r4, r6, r1);
        r6 = 2130903152; // 0x7f030070 float:1.7413114E38 double:1.052806042E-314;
        r7 = r11.E;
        r6 = com.whatsapp.b7.a(r0, r6, r7, r1);
        r0 = r11.E;
        r7 = 0;
        r0.addFooterView(r4, r7, r1);
        r0 = r11.E;
        r7 = 0;
        r0.addHeaderView(r6, r7, r1);
        r0 = 2131427513; // 0x7f0b00b9 float:1.8476644E38 double:1.053065111E-314;
        r0 = r11.findViewById(r0);
        r11.r = r0;
        r0 = r11.r;
        r0.setClickable(r2);
        r0 = r11.E;
        r7 = new com.whatsapp.a52;
        r7.<init>(r11);
        r0.setOnScrollListener(r7);
        r0 = r11.E;
        r0 = r0.getViewTreeObserver();
        r7 = new com.whatsapp.br;
        r7.<init>(r11);
        r0.addOnGlobalLayoutListener(r7);
        r0 = r11.E;
        r7 = new com.whatsapp.z9;
        r7.<init>(r11);
        r0.setOnItemClickListener(r7);
        r0 = r11.findViewById(r9);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        r0 = 2131427837; // 0x7f0b01fd float:1.8477302E38 double:1.053065271E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        r0 = 2131427843; // 0x7f0b0203 float:1.8477314E38 double:1.053065274E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        r0 = 2131427833; // 0x7f0b01f9 float:1.8477293E38 double:1.053065269E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        r6.setClickable(r1);
        r6.setFocusable(r1);
        r7 = new com.whatsapp.b;
        r7.<init>(r11);
        r0 = 2131427827; // 0x7f0b01f3 float:1.8477281E38 double:1.053065266E-314;
        r8 = r4.findViewById(r0);
        r0 = r11.D;	 Catch:{ NumberFormatException -> 0x02fa }
        r0 = com.whatsapp.bd.e(r0);	 Catch:{ NumberFormatException -> 0x02fa }
        if (r0 == 0) goto L_0x02fc;
    L_0x0109:
        r0 = r1;
    L_0x010a:
        r8.setVisibility(r0);	 Catch:{ NumberFormatException -> 0x02ff }
        r8.setOnClickListener(r7);	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = 2130839001; // 0x7f0205d9 float:1.7283E38 double:1.052774347E-314;
        r8.setBackgroundResource(r0);	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = 2131427617; // 0x7f0b0121 float:1.8476855E38 double:1.053065162E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x02ff }
        r7 = 8;
        r0.setVisibility(r7);	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = 2131427838; // 0x7f0b01fe float:1.8477304E38 double:1.0530652713E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x02ff }
        r11.t = r0;	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = 2131427836; // 0x7f0b01fc float:1.84773E38 double:1.0530652704E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x02ff }
        r7 = 8;
        r0.setVisibility(r7);	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = 2131427823; // 0x7f0b01ef float:1.8477273E38 double:1.053065264E-314;
        r0 = r11.findViewById(r0);	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x02ff }
        r11.n = r0;	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = 2131427824; // 0x7f0b01f0 float:1.8477275E38 double:1.0530652644E-314;
        r0 = r11.findViewById(r0);	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x02ff }
        r11.i = r0;	 Catch:{ NumberFormatException -> 0x02ff }
        r7 = r11.D;	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = r11.G;	 Catch:{ NumberFormatException -> 0x02ff }
        r0 = r0.h();	 Catch:{ NumberFormatException -> 0x02ff }
        if (r0 != 0) goto L_0x0163;
    L_0x0159:
        r0 = r11.G;	 Catch:{ NumberFormatException -> 0x0301 }
        r0 = r0.s;	 Catch:{ NumberFormatException -> 0x0301 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x0301 }
        if (r0 == 0) goto L_0x0303;
    L_0x0163:
        r0 = r2;
    L_0x0164:
        com.whatsapp.App.b(r7, r0);
        r11.h();
        r0 = r4.findViewById(r10);
        r7 = new com.whatsapp.w8;
        r7.<init>(r11);
        r0.setOnClickListener(r7);
        r0 = 2131427831; // 0x7f0b01f7 float:1.847729E38 double:1.053065268E-314;
        r0 = r4.findViewById(r0);
        r4 = new com.whatsapp.zx;
        r4.<init>(r11);
        r0.setOnClickListener(r4);
        r0 = new com.whatsapp.a5e;
        r0.<init>(r11);
        r4 = r6.findViewById(r9);
        r4.setOnClickListener(r0);
        r4 = 2131427619; // 0x7f0b0123 float:1.847686E38 double:1.053065163E-314;
        r4 = r6.findViewById(r4);
        r4.setOnClickListener(r0);
        r0 = 2131427839; // 0x7f0b01ff float:1.8477306E38 double:1.053065272E-314;
        r0 = r6.findViewById(r0);
        r4 = new com.whatsapp.i0;
        r4.<init>(r11);
        r0.setOnClickListener(r4);
        r0 = 2131427593; // 0x7f0b0109 float:1.8476807E38 double:1.0530651503E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r11.k = r0;
        r0 = new com.whatsapp.fs;
        r0.<init>(r11);
        r4 = r11.k;	 Catch:{ NumberFormatException -> 0x0306 }
        r4.setOnClickListener(r0);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = 2131427592; // 0x7f0b0108 float:1.8476805E38 double:1.05306515E-314;
        r0 = r11.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0306 }
        r11.A = r0;	 Catch:{ NumberFormatException -> 0x0306 }
        r11.f();	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = r11.E;	 Catch:{ NumberFormatException -> 0x0306 }
        r4 = r11.F;	 Catch:{ NumberFormatException -> 0x0306 }
        r0.setAdapter(r4);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = r11.E;	 Catch:{ NumberFormatException -> 0x0306 }
        r11.registerForContextMenu(r0);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = 2131427822; // 0x7f0b01ee float:1.8477271E38 double:1.0530652634E-314;
        r0 = r11.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x0306 }
        r11.w = r0;	 Catch:{ NumberFormatException -> 0x0306 }
        r11.m();	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = 2131427826; // 0x7f0b01f2 float:1.847728E38 double:1.0530652654E-314;
        r0 = r11.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = (android.widget.ImageButton) r0;	 Catch:{ NumberFormatException -> 0x0306 }
        r11.v = r0;	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = 2131427825; // 0x7f0b01f1 float:1.8477277E38 double:1.053065265E-314;
        r0 = r11.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0306 }
        r11.C = r0;	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = r11.v;	 Catch:{ NumberFormatException -> 0x0306 }
        r4 = new com.whatsapp._l;	 Catch:{ NumberFormatException -> 0x0306 }
        r4.<init>(r11);	 Catch:{ NumberFormatException -> 0x0306 }
        r0.setOnClickListener(r4);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = 2131427844; // 0x7f0b0204 float:1.8477316E38 double:1.0530652743E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x0306 }
        r11.q = r0;	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = r11.q;	 Catch:{ NumberFormatException -> 0x0306 }
        r4 = 2131624640; // 0x7f0e02c0 float:1.8876465E38 double:1.0531625045E-314;
        r7 = 2;
        r7 = new java.lang.Object[r7];	 Catch:{ NumberFormatException -> 0x0306 }
        r8 = 0;
        r9 = r11.m;	 Catch:{ NumberFormatException -> 0x0306 }
        r9 = r9.size();	 Catch:{ NumberFormatException -> 0x0306 }
        r10 = com.whatsapp.ge.e;	 Catch:{ NumberFormatException -> 0x0306 }
        r9 = java.lang.Math.min(r9, r10);	 Catch:{ NumberFormatException -> 0x0306 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ NumberFormatException -> 0x0306 }
        r7[r8] = r9;	 Catch:{ NumberFormatException -> 0x0306 }
        r8 = 1;
        r9 = com.whatsapp.ge.e;	 Catch:{ NumberFormatException -> 0x0306 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ NumberFormatException -> 0x0306 }
        r7[r8] = r9;	 Catch:{ NumberFormatException -> 0x0306 }
        r4 = r11.getString(r4, r7);	 Catch:{ NumberFormatException -> 0x0306 }
        r0.setText(r4);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = r11.D;	 Catch:{ NumberFormatException -> 0x0306 }
        com.whatsapp.util.bo.c(r0);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = 2131427842; // 0x7f0b0202 float:1.8477312E38 double:1.0530652733E-314;
        r4 = r11.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = r11.D;	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = com.whatsapp.bd.i(r0);	 Catch:{ NumberFormatException -> 0x0306 }
        r0 = r0.h();	 Catch:{ NumberFormatException -> 0x0306 }
        if (r0 <= 0) goto L_0x0308;
    L_0x0251:
        r0 = r1;
    L_0x0252:
        r4.setVisibility(r0);	 Catch:{ NumberFormatException -> 0x030b }
        r0 = 2131427830; // 0x7f0b01f6 float:1.8477287E38 double:1.0530652674E-314;
        r0 = r11.findViewById(r0);	 Catch:{ NumberFormatException -> 0x030b }
        r0 = (android.widget.TextView) r0;	 Catch:{ NumberFormatException -> 0x030b }
        r4 = r11.D;	 Catch:{ NumberFormatException -> 0x030b }
        r4 = com.whatsapp.bd.f(r4);	 Catch:{ NumberFormatException -> 0x030b }
        if (r4 == 0) goto L_0x030d;
    L_0x0266:
        r4 = 2131624309; // 0x7f0e0175 float:1.8875794E38 double:1.053162341E-314;
    L_0x0269:
        r0.setText(r4);	 Catch:{ NumberFormatException -> 0x0312 }
        r0 = 2131427680; // 0x7f0b0160 float:1.8476983E38 double:1.0530651933E-314;
        r4 = r11.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0312 }
        r0 = r11.D;	 Catch:{ NumberFormatException -> 0x0312 }
        r0 = com.whatsapp.bd.f(r0);	 Catch:{ NumberFormatException -> 0x0312 }
        if (r0 == 0) goto L_0x0314;
    L_0x027b:
        r0 = r3;
    L_0x027c:
        r4.setVisibility(r0);	 Catch:{ NumberFormatException -> 0x0317 }
        r0 = 2131427831; // 0x7f0b01f7 float:1.847729E38 double:1.053065268E-314;
        r0 = r11.findViewById(r0);	 Catch:{ NumberFormatException -> 0x0317 }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ NumberFormatException -> 0x0317 }
        r0 = com.whatsapp.App.az();	 Catch:{ NumberFormatException -> 0x0317 }
        if (r0 == 0) goto L_0x02ac;
    L_0x0291:
        r0 = r11.D;	 Catch:{ NumberFormatException -> 0x0319 }
        r0 = com.whatsapp.bd.f(r0);	 Catch:{ NumberFormatException -> 0x0319 }
        if (r0 == 0) goto L_0x02ac;
    L_0x0299:
        r0 = 2131427832; // 0x7f0b01f8 float:1.8477291E38 double:1.0530652684E-314;
        r0 = r6.findViewById(r0);	 Catch:{ NumberFormatException -> 0x031b }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ NumberFormatException -> 0x031b }
        if (r5 == 0) goto L_0x02b6;
    L_0x02a6:
        r0 = com.whatsapp.DialogToastActivity.i;	 Catch:{ NumberFormatException -> 0x031d }
        if (r0 == 0) goto L_0x031f;
    L_0x02aa:
        com.whatsapp.DialogToastActivity.i = r1;
    L_0x02ac:
        r0 = 2131427832; // 0x7f0b01f8 float:1.8477291E38 double:1.0530652684E-314;
        r0 = r6.findViewById(r0);
        r0.setVisibility(r3);
    L_0x02b6:
        r0 = com.whatsapp.App.az();
        if (r0 == 0) goto L_0x02d7;
    L_0x02bc:
        r0 = 2131427833; // 0x7f0b01f9 float:1.8477293E38 double:1.053065269E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = new com.whatsapp.gu;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r11.i();
        r0 = com.whatsapp.lh.b;
        r1 = r11.p;
        r0.a(r1);
    L_0x02d7:
        r0 = com.whatsapp.App.aJ;
        r1 = r11.y;
        r0.b(r1);
        com.whatsapp.App.b(r11);
        if (r12 == 0) goto L_0x02f7;
    L_0x02e3:
        r0 = H;
        r1 = 19;
        r0 = r0[r1];
        r0 = r12.getString(r0);
        if (r0 == 0) goto L_0x02f7;
    L_0x02ef:
        r1 = com.whatsapp.App.P;	 Catch:{ NumberFormatException -> 0x0321 }
        r0 = r1.a(r0);	 Catch:{ NumberFormatException -> 0x0321 }
        r11.B = r0;	 Catch:{ NumberFormatException -> 0x0321 }
    L_0x02f7:
        u = r11;
        return;
    L_0x02fa:
        r0 = move-exception;
        throw r0;
    L_0x02fc:
        r0 = r3;
        goto L_0x010a;
    L_0x02ff:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0301 }
    L_0x0301:
        r0 = move-exception;
        throw r0;
    L_0x0303:
        r0 = r1;
        goto L_0x0164;
    L_0x0306:
        r0 = move-exception;
        throw r0;
    L_0x0308:
        r0 = r3;
        goto L_0x0252;
    L_0x030b:
        r0 = move-exception;
        throw r0;
    L_0x030d:
        r4 = 2131624230; // 0x7f0e0126 float:1.8875634E38 double:1.053162302E-314;
        goto L_0x0269;
    L_0x0312:
        r0 = move-exception;
        throw r0;
    L_0x0314:
        r0 = r1;
        goto L_0x027c;
    L_0x0317:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0319 }
    L_0x0319:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x031b }
    L_0x031b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x031d }
    L_0x031d:
        r0 = move-exception;
        throw r0;
    L_0x031f:
        r1 = r2;
        goto L_0x02aa;
    L_0x0321:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l() {
        /*
        r4_this = this;
        r1 = com.whatsapp.App.az;
        r0 = r4.E;
        r2 = 0;
        r0 = r0.getChildAt(r2);
        if (r0 == 0) goto L_0x0052;
    L_0x000b:
        r2 = r4.E;	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r2.getWidth();	 Catch:{ NumberFormatException -> 0x0053 }
        r3 = r4.E;	 Catch:{ NumberFormatException -> 0x0053 }
        r3 = r3.getHeight();	 Catch:{ NumberFormatException -> 0x0053 }
        if (r2 <= r3) goto L_0x003e;
    L_0x0019:
        r2 = r4.E;	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r2.getFirstVisiblePosition();	 Catch:{ NumberFormatException -> 0x0053 }
        if (r2 != 0) goto L_0x0027;
    L_0x0021:
        r0 = r0.getTop();
        if (r1 == 0) goto L_0x0030;
    L_0x0027:
        r0 = r4.r;
        r0 = r0.getHeight();
        r0 = -r0;
        r0 = r0 + 1;
    L_0x0030:
        r2 = r4.r;	 Catch:{ NumberFormatException -> 0x0055 }
        r3 = r4.r;	 Catch:{ NumberFormatException -> 0x0055 }
        r3 = r3.getTop();	 Catch:{ NumberFormatException -> 0x0055 }
        r0 = r0 - r3;
        r2.offsetTopAndBottom(r0);	 Catch:{ NumberFormatException -> 0x0055 }
        if (r1 == 0) goto L_0x0052;
    L_0x003e:
        r0 = r4.r;	 Catch:{ NumberFormatException -> 0x0057 }
        r0 = r0.getTop();	 Catch:{ NumberFormatException -> 0x0057 }
        if (r0 == 0) goto L_0x0052;
    L_0x0046:
        r0 = r4.r;	 Catch:{ NumberFormatException -> 0x0057 }
        r1 = r4.r;	 Catch:{ NumberFormatException -> 0x0057 }
        r1 = r1.getTop();	 Catch:{ NumberFormatException -> 0x0057 }
        r1 = -r1;
        r0.offsetTopAndBottom(r1);	 Catch:{ NumberFormatException -> 0x0057 }
    L_0x0052:
        return;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.l():void");
    }

    static void b(GroupChatInfo groupChatInfo, String str) {
        groupChatInfo.k(str);
    }

    public GroupChatInfo() {
        this.m = new ArrayList();
        this.s = new HashMap();
        this.o = new fk();
        this.p = new _p(this);
        this.z = new an0(this);
        this.x = new Handler(new as0(this));
        this.y = new gs(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case ay.f /*1*/:
                    o();
                    return true;
                case 16908332:
                    finish();
                    return true;
                default:
                    return false;
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static HashMap p(GroupChatInfo groupChatInfo) {
        return groupChatInfo.s;
    }

    private void o() {
        if (this.m.size() < ge.e) {
            Intent intent = new Intent(this, ContactPicker.class);
            intent.putExtra(H[0], this.D);
            startActivityForResult(intent, 1);
            if (App.az == 0) {
                return;
            }
        }
        AlertDialog create = new Builder(this).create();
        create.setTitle(getString(R.string.alert));
        create.setMessage(getString(R.string.groupchat_reach_limit, new Object[]{Integer.valueOf(ge.e)}));
        create.setButton(getString(R.string.ok), new am6(this));
        create.show();
    }

    static void o(GroupChatInfo groupChatInfo) {
        groupChatInfo.l();
    }

    static void b(GroupChatInfo groupChatInfo, ArrayList arrayList) {
        groupChatInfo.b(arrayList);
    }

    static void a(GroupChatInfo groupChatInfo, ArrayList arrayList) {
        groupChatInfo.a(arrayList);
    }

    static void h(GroupChatInfo groupChatInfo) {
        groupChatInfo.h();
    }

    public void a() {
        this.m.clear();
        this.G = App.P.f(this.D);
        a(this.m, this.D);
        this.F.notifyDataSetChanged();
    }

    static void c(GroupChatInfo groupChatInfo, String str) {
        groupChatInfo.i(str);
    }

    private void b() {
        try {
            if (App.a()) {
                a(R.string.participant_removing, R.string.register_wait_message);
                App.c(new m0(this, this.D, null, null, 14));
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            App.b(getBaseContext(), (int) R.string.failed_to_leave_group, 0);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private void d() {
        try {
            if (App.a()) {
                startActivity(new Intent(App.p.getApplicationContext(), Main.b()).putExtra(H[12], this.G.e).addFlags(603979776));
                if (App.az == 0) {
                    return;
                }
            }
            App.b(getBaseContext(), (int) R.string.failed_to_leave_group, 0);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void e(GroupChatInfo groupChatInfo) {
        groupChatInfo.e();
    }

    public void c(String str) {
    }

    private void i(String str) {
        try {
            if (App.a()) {
                a(R.string.participant_adding, R.string.register_wait_message);
                Vector vector = new Vector();
                vector.add(str);
                App.b(new mq(this, this.D, null, vector, 13));
                if (App.az == 0) {
                    return;
                }
            }
            App.b(getBaseContext(), (int) R.string.network_required, 0);
            g();
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void onResume() {
        super.onResume();
        n();
    }

    static String b(GroupChatInfo groupChatInfo) {
        return groupChatInfo.D;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
        r7_this = this;
        r2 = 8;
        r1 = 0;
        r0 = com.whatsapp.App.P;
        r3 = r7.D;
        r0 = r0.a(r3);
        r7.G = r0;
        r7.m();
        r7.f();
        r0 = r7.m;
        r0.clear();
        r0 = r7.m;
        r3 = r7.D;
        r7.a(r0, r3);
        r0 = r7.C;
        r0.setVisibility(r2);
        r0 = r7.v;
        r0.setVisibility(r1);
        r0 = r7.q;
        r3 = 2131624640; // 0x7f0e02c0 float:1.8876465E38 double:1.0531625045E-314;
        r4 = 2;
        r4 = new java.lang.Object[r4];
        r5 = r7.m;
        r5 = r5.size();
        r6 = com.whatsapp.ge.e;
        r5 = java.lang.Math.min(r5, r6);
        r5 = java.lang.Integer.valueOf(r5);
        r4[r1] = r5;
        r5 = 1;
        r6 = com.whatsapp.ge.e;
        r6 = java.lang.Integer.valueOf(r6);
        r4[r5] = r6;
        r3 = r7.getString(r3, r4);
        r0.setText(r3);
        r0 = r7.D;
        r4 = com.whatsapp.bd.f(r0);
        r0 = r7.D;
        r5 = com.whatsapp.bd.e(r0);
        r0 = com.whatsapp.App.az();	 Catch:{ NumberFormatException -> 0x00db }
        if (r0 == 0) goto L_0x0079;
    L_0x0065:
        if (r4 == 0) goto L_0x0079;
    L_0x0067:
        r0 = 2131427832; // 0x7f0b01f8 float:1.8477291E38 double:1.0530652684E-314;
        r0 = r7.findViewById(r0);	 Catch:{ NumberFormatException -> 0x00df }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ NumberFormatException -> 0x00df }
        r7.n();	 Catch:{ NumberFormatException -> 0x00df }
        r0 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x00df }
        if (r0 == 0) goto L_0x0085;
    L_0x0079:
        r0 = 2131427832; // 0x7f0b01f8 float:1.8477291E38 double:1.0530652684E-314;
        r0 = r7.findViewById(r0);	 Catch:{ NumberFormatException -> 0x00df }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ NumberFormatException -> 0x00df }
    L_0x0085:
        r0 = 2131427842; // 0x7f0b0202 float:1.8477312E38 double:1.0530652733E-314;
        r3 = r7.findViewById(r0);	 Catch:{ NumberFormatException -> 0x00e1 }
        r0 = r7.D;	 Catch:{ NumberFormatException -> 0x00e1 }
        r0 = com.whatsapp.bd.i(r0);	 Catch:{ NumberFormatException -> 0x00e1 }
        r0 = r0.h();	 Catch:{ NumberFormatException -> 0x00e1 }
        if (r0 <= 0) goto L_0x00e3;
    L_0x0098:
        r0 = r1;
    L_0x0099:
        r3.setVisibility(r0);
        r0 = 2131427830; // 0x7f0b01f6 float:1.8477287E38 double:1.0530652674E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.Button) r0;
        if (r4 == 0) goto L_0x00e5;
    L_0x00a7:
        r3 = 2131624309; // 0x7f0e0175 float:1.8875794E38 double:1.053162341E-314;
    L_0x00aa:
        r0.setText(r3);	 Catch:{ NumberFormatException -> 0x00e9 }
        r0 = 2131427831; // 0x7f0b01f7 float:1.847729E38 double:1.053065268E-314;
        r0 = r7.findViewById(r0);	 Catch:{ NumberFormatException -> 0x00e9 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ NumberFormatException -> 0x00e9 }
        r0 = 2131427827; // 0x7f0b01f3 float:1.8477281E38 double:1.053065266E-314;
        r3 = r7.findViewById(r0);	 Catch:{ NumberFormatException -> 0x00e9 }
        if (r5 == 0) goto L_0x00eb;
    L_0x00c2:
        r0 = r1;
    L_0x00c3:
        r3.setVisibility(r0);	 Catch:{ NumberFormatException -> 0x00ed }
        r0 = 2131427680; // 0x7f0b0160 float:1.8476983E38 double:1.0530651933E-314;
        r0 = r7.findViewById(r0);	 Catch:{ NumberFormatException -> 0x00ed }
        if (r4 == 0) goto L_0x00ef;
    L_0x00cf:
        r0.setVisibility(r2);
        r7.invalidateOptionsMenu();
        r0 = r7.F;
        r0.notifyDataSetChanged();
        return;
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00dd }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r0 = r2;
        goto L_0x0099;
    L_0x00e5:
        r3 = 2131624230; // 0x7f0e0126 float:1.8875634E38 double:1.053162302E-314;
        goto L_0x00aa;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = r2;
        goto L_0x00c3;
    L_0x00ed:
        r0 = move-exception;
        throw r0;
    L_0x00ef:
        r2 = r1;
        goto L_0x00cf;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.g():void");
    }

    static Handler g(GroupChatInfo groupChatInfo) {
        return groupChatInfo.x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
        r5_this = this;
        r4 = 0;
        r0 = com.whatsapp.App.az;
        r1 = r5.A;	 Catch:{ NumberFormatException -> 0x0058 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x0058 }
        r1 = r5.G;	 Catch:{ NumberFormatException -> 0x0058 }
        r1 = r1.e;	 Catch:{ NumberFormatException -> 0x0058 }
        r1 = com.whatsapp.a89.a(r1);	 Catch:{ NumberFormatException -> 0x0058 }
        if (r1 == 0) goto L_0x0022;
    L_0x0014:
        r1 = r5.A;	 Catch:{ NumberFormatException -> 0x0058 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x0058 }
        r1 = r5.k;	 Catch:{ NumberFormatException -> 0x0058 }
        r2 = 4;
        r1.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x0058 }
        if (r0 == 0) goto L_0x0057;
    L_0x0022:
        r1 = r5.getResources();
        r2 = 2131361867; // 0x7f0a004b float:1.8343498E38 double:1.0530326773E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r2 = r5.getResources();
        r3 = 2131361866; // 0x7f0a004a float:1.8343496E38 double:1.053032677E-314;
        r2 = r2.getDimension(r3);
        r3 = r5.G;
        r1 = r3.a(r1, r2, r4);
        if (r1 != 0) goto L_0x004d;
    L_0x0040:
        r2 = r5.k;	 Catch:{ NumberFormatException -> 0x005a }
        r3 = r5.G;	 Catch:{ NumberFormatException -> 0x005a }
        r3 = r3.j();	 Catch:{ NumberFormatException -> 0x005a }
        r2.setImageBitmap(r3);	 Catch:{ NumberFormatException -> 0x005a }
        if (r0 == 0) goto L_0x0052;
    L_0x004d:
        r0 = r5.k;	 Catch:{ NumberFormatException -> 0x005a }
        r0.setImageBitmap(r1);	 Catch:{ NumberFormatException -> 0x005a }
    L_0x0052:
        r0 = r5.k;
        r0.setVisibility(r4);
    L_0x0057:
        return;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.f():void");
    }

    private void j(String str) {
        try {
            if (App.a()) {
                a(R.string.participant_removing, R.string.register_wait_message);
                Vector vector = new Vector();
                vector.add(str);
                App.g(new mg(this, this.D, null, vector, 89));
                if (App.az == 0) {
                    return;
                }
            }
            App.b(getBaseContext(), (int) R.string.network_required, 0);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void onDestroy() {
        try {
            Log.i(H[4]);
            super.onDestroy();
            if (this.j != null) {
                this.j.cancel(true);
            }
            lh.b.b(this.p);
            App.aJ.a(this.y);
            App.a((anq) this);
            this.o.a();
            bo.a(this.D);
            u = null;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void b(String str) {
    }

    private void e() {
        startActivity(new Intent(App.p.getApplicationContext(), Main.b()).putExtra(H[2], this.G.e).addFlags(603979776));
    }

    static void a(GroupChatInfo groupChatInfo, String str) {
        groupChatInfo.h(str);
    }

    private void k(String str) {
        int i = App.az;
        try {
            if (this.s.containsKey(str)) {
                new Vector().add(str);
                if (i == 0) {
                    return;
                }
            }
            try {
                if (App.a()) {
                    a(R.string.participant_removing, R.string.register_wait_message);
                    Vector vector = new Vector();
                    vector.add(str);
                    App.a(new m6(this, this.D, null, vector, 28));
                    if (i == 0) {
                        return;
                    }
                }
                App.b(getBaseContext(), (int) R.string.network_required, 0);
                g();
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private void b(int i) {
        try {
            switch (i) {
                case 400:
                case 401:
                case 404:
                    break;
                case 406:
                    App.a(App.p.getApplicationContext(), App.p.getApplicationContext().getString(R.string.subject_reach_limit, new Object[]{Integer.valueOf(ge.s)}), 0);
                    App.I();
                    if (App.az == 0) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            App.b(App.p.getApplicationContext(), (int) R.string.subject_change_failed, 0);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void j() {
        String a = this.B.a();
        Intent intent = new Intent(H[6], Contacts.CONTENT_URI);
        try {
            intent.putExtra(H[8], a);
            intent.setComponent(intent.resolveActivity(getPackageManager()));
            if (intent.getComponent() != null) {
                startActivityForResult(intent, 10);
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            Log.i(H[7]);
            App.q();
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static m8 d(GroupChatInfo groupChatInfo) {
        return groupChatInfo.G;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (bd.e(this.D)) {
                menu.add(0, 1, 0, (int) R.string.add_group_participant).setIcon((int) R.drawable.ic_action_add_person).setShowAsAction(2);
            }
            return super.onCreateOptionsMenu(menu);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateContextMenu(android.view.ContextMenu r11, android.view.View r12, android.view.ContextMenu.ContextMenuInfo r13) {
        /*
        r10_this = this;
        r9 = 1;
        r8 = 0;
        super.onCreateContextMenu(r11, r12, r13);
        r13 = (android.widget.AdapterView.AdapterContextMenuInfo) r13;
        r0 = r13.targetView;
        r0 = r0.getTag();
        r0 = (com.whatsapp.m8) r0;
        if (r0 != 0) goto L_0x0012;
    L_0x0011:
        return;
    L_0x0012:
        r1 = r10.s;	 Catch:{ NumberFormatException -> 0x00c5 }
        r2 = r0.e;	 Catch:{ NumberFormatException -> 0x00c5 }
        r1 = r1.containsKey(r2);	 Catch:{ NumberFormatException -> 0x00c5 }
        if (r1 != 0) goto L_0x0011;
    L_0x001c:
        r1 = 0;
        r2 = 1;
        r3 = 0;
        r4 = 2131624525; // 0x7f0e024d float:1.8876232E38 double:1.0531624476E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00c7 }
        r6 = 0;
        r7 = r0.o();	 Catch:{ NumberFormatException -> 0x00c7 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x00c7 }
        r4 = r10.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00c7 }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00c7 }
        r1 = 0;
        r2 = 4;
        r3 = 0;
        r4 = 2131624048; // 0x7f0e0070 float:1.8875265E38 double:1.053162212E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00c7 }
        r6 = 0;
        r7 = r0.o();	 Catch:{ NumberFormatException -> 0x00c7 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x00c7 }
        r4 = r10.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00c7 }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00c7 }
        r1 = r0.h;	 Catch:{ NumberFormatException -> 0x00c7 }
        if (r1 != 0) goto L_0x006c;
    L_0x004e:
        r1 = 0;
        r2 = 2;
        r3 = 0;
        r4 = 2131623974; // 0x7f0e0026 float:1.8875115E38 double:1.0531621754E-314;
        r4 = r10.getString(r4);	 Catch:{ NumberFormatException -> 0x00c9 }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00c9 }
        r1 = 0;
        r2 = 3;
        r3 = 0;
        r4 = 2131623977; // 0x7f0e0029 float:1.887512E38 double:1.053162177E-314;
        r4 = r10.getString(r4);	 Catch:{ NumberFormatException -> 0x00c9 }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00c9 }
        r1 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x00c9 }
        if (r1 == 0) goto L_0x0083;
    L_0x006c:
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 2131625076; // 0x7f0e0474 float:1.887735E38 double:1.05316272E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00c9 }
        r6 = 0;
        r7 = r0.o();	 Catch:{ NumberFormatException -> 0x00c9 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x00c9 }
        r4 = r10.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00c9 }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00c9 }
    L_0x0083:
        r1 = r10.D;	 Catch:{ NumberFormatException -> 0x00cb }
        r1 = com.whatsapp.bd.e(r1);	 Catch:{ NumberFormatException -> 0x00cb }
        if (r1 == 0) goto L_0x0011;
    L_0x008b:
        r1 = 0;
        r2 = 5;
        r3 = 0;
        r4 = 2131624790; // 0x7f0e0356 float:1.887677E38 double:1.0531625786E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x00cd }
        r6 = 0;
        r7 = r0.o();	 Catch:{ NumberFormatException -> 0x00cd }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x00cd }
        r4 = r10.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x00cd }
        r11.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x00cd }
        r1 = com.whatsapp.ge.q;	 Catch:{ NumberFormatException -> 0x00cd }
        if (r1 == 0) goto L_0x0011;
    L_0x00a6:
        r1 = r10.D;	 Catch:{ NumberFormatException -> 0x00cf }
        r2 = r0.e;	 Catch:{ NumberFormatException -> 0x00cf }
        r1 = com.whatsapp.bd.c(r1, r2);	 Catch:{ NumberFormatException -> 0x00cf }
        if (r1 != 0) goto L_0x0011;
    L_0x00b0:
        r1 = 6;
        r2 = 2131623976; // 0x7f0e0028 float:1.8875119E38 double:1.0531621764E-314;
        r3 = new java.lang.Object[r9];
        r0 = r0.o();
        r3[r8] = r0;
        r0 = r10.getString(r2, r3);
        r11.add(r8, r1, r8, r0);
        goto L_0x0011;
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    private void g(String str) {
        try {
            if (App.a()) {
                a(R.string.participant_adding, R.string.register_wait_message);
                Vector vector = new Vector();
                vector.add(str);
                App.f(new mr(this, this.D, null, vector, 88));
                if (App.az == 0) {
                    return;
                }
            }
            App.b(getBaseContext(), (int) R.string.network_required, 0);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
        r5_this = this;
        r4 = -1;
        r0 = com.whatsapp.App.az;
        switch(r6) {
            case 1: goto L_0x008a;
            case 2: goto L_0x0006;
            case 3: goto L_0x0006;
            case 4: goto L_0x0006;
            case 5: goto L_0x0006;
            case 6: goto L_0x0006;
            case 7: goto L_0x0006;
            case 8: goto L_0x0006;
            case 9: goto L_0x0006;
            case 10: goto L_0x0007;
            case 11: goto L_0x0053;
            case 12: goto L_0x009b;
            case 13: goto L_0x00c8;
            case 14: goto L_0x00f0;
            default: goto L_0x0006;
        };
    L_0x0006:
        return;
    L_0x0007:
        if (r7 != r4) goto L_0x0035;
    L_0x0009:
        r1 = r5.B;	 Catch:{ NumberFormatException -> 0x00f7 }
        if (r1 == 0) goto L_0x0035;
    L_0x000d:
        if (r8 == 0) goto L_0x0022;
    L_0x000f:
        r1 = r8.getData();	 Catch:{ NumberFormatException -> 0x00fb }
        if (r1 == 0) goto L_0x0022;
    L_0x0015:
        r1 = com.whatsapp.App.P;	 Catch:{ NumberFormatException -> 0x00fd }
        r2 = r8.getData();	 Catch:{ NumberFormatException -> 0x00fd }
        r3 = r5.B;	 Catch:{ NumberFormatException -> 0x00fd }
        r1.a(r2, r3);	 Catch:{ NumberFormatException -> 0x00fd }
        if (r0 == 0) goto L_0x0029;
    L_0x0022:
        r1 = com.whatsapp.App.P;	 Catch:{ NumberFormatException -> 0x00fd }
        r2 = r5.B;	 Catch:{ NumberFormatException -> 0x00fd }
        r1.i(r2);	 Catch:{ NumberFormatException -> 0x00fd }
    L_0x0029:
        r5.g();	 Catch:{ NumberFormatException -> 0x00ff }
        r1 = r5.B;	 Catch:{ NumberFormatException -> 0x00ff }
        r1 = r1.e;	 Catch:{ NumberFormatException -> 0x00ff }
        com.whatsapp.Conversation.i(r1);	 Catch:{ NumberFormatException -> 0x00ff }
        if (r0 == 0) goto L_0x0006;
    L_0x0035:
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0101 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x0101 }
        r2 = H;	 Catch:{ NumberFormatException -> 0x0101 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0101 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0101 }
        r2 = r5.B;	 Catch:{ NumberFormatException -> 0x0101 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0101 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x0101 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0101 }
        if (r0 == 0) goto L_0x0006;
    L_0x0053:
        if (r7 != r4) goto L_0x006c;
    L_0x0055:
        r1 = r5.B;	 Catch:{ NumberFormatException -> 0x0105 }
        if (r1 == 0) goto L_0x006c;
    L_0x0059:
        r1 = com.whatsapp.App.P;	 Catch:{ NumberFormatException -> 0x0107 }
        r2 = r5.B;	 Catch:{ NumberFormatException -> 0x0107 }
        r1.i(r2);	 Catch:{ NumberFormatException -> 0x0107 }
        r5.g();	 Catch:{ NumberFormatException -> 0x0107 }
        r1 = r5.B;	 Catch:{ NumberFormatException -> 0x0107 }
        r1 = r1.e;	 Catch:{ NumberFormatException -> 0x0107 }
        com.whatsapp.Conversation.i(r1);	 Catch:{ NumberFormatException -> 0x0107 }
        if (r0 == 0) goto L_0x0006;
    L_0x006c:
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0109 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x0109 }
        r2 = H;	 Catch:{ NumberFormatException -> 0x0109 }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0109 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0109 }
        r2 = r5.B;	 Catch:{ NumberFormatException -> 0x0109 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x0109 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x0109 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0109 }
        if (r0 == 0) goto L_0x0006;
    L_0x008a:
        if (r7 != r4) goto L_0x0006;
    L_0x008c:
        r1 = H;
        r2 = 24;
        r1 = r1[r2];
        r1 = r8.getStringExtra(r1);
        r5.i(r1);	 Catch:{ NumberFormatException -> 0x010b }
        if (r0 == 0) goto L_0x0006;
    L_0x009b:
        if (r7 != r4) goto L_0x0006;
    L_0x009d:
        if (r8 == 0) goto L_0x00bf;
    L_0x009f:
        r1 = H;	 Catch:{ NumberFormatException -> 0x0111 }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0111 }
        r2 = 0;
        r1 = r8.getBooleanExtra(r1, r2);	 Catch:{ NumberFormatException -> 0x0111 }
        if (r1 == 0) goto L_0x00bf;
    L_0x00ac:
        r1 = r5.A;	 Catch:{ NumberFormatException -> 0x0113 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x0113 }
        r1 = r5.k;	 Catch:{ NumberFormatException -> 0x0113 }
        r2 = 4;
        r1.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x0113 }
        r1 = r5.G;	 Catch:{ NumberFormatException -> 0x0113 }
        com.whatsapp.zv.a(r1, r5);	 Catch:{ NumberFormatException -> 0x0113 }
        if (r0 == 0) goto L_0x0006;
    L_0x00bf:
        r1 = r5.G;	 Catch:{ NumberFormatException -> 0x0115 }
        r2 = 13;
        com.whatsapp.zv.a(r8, r1, r5, r2, r5);	 Catch:{ NumberFormatException -> 0x0115 }
        if (r0 == 0) goto L_0x0006;
    L_0x00c8:
        r1 = com.whatsapp.zv.b();	 Catch:{ NumberFormatException -> 0x0117 }
        r1.delete();	 Catch:{ NumberFormatException -> 0x0117 }
        if (r7 != r4) goto L_0x00e7;
    L_0x00d1:
        r1 = r5.G;	 Catch:{ NumberFormatException -> 0x0119 }
        r1 = com.whatsapp.zv.b(r1, r5);	 Catch:{ NumberFormatException -> 0x0119 }
        if (r1 == 0) goto L_0x0006;
    L_0x00d9:
        r1 = r5.A;	 Catch:{ NumberFormatException -> 0x011b }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x011b }
        r1 = r5.k;	 Catch:{ NumberFormatException -> 0x011b }
        r2 = 4;
        r1.setVisibility(r2);	 Catch:{ NumberFormatException -> 0x011b }
        if (r0 == 0) goto L_0x0006;
    L_0x00e7:
        if (r7 != 0) goto L_0x0006;
    L_0x00e9:
        if (r8 == 0) goto L_0x0006;
    L_0x00eb:
        com.whatsapp.zv.a(r8, r5);	 Catch:{ NumberFormatException -> 0x00f5 }
        if (r0 == 0) goto L_0x0006;
    L_0x00f0:
        r5.f();	 Catch:{ NumberFormatException -> 0x00f5 }
        goto L_0x0006;
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f9 }
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        throw r0;
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0101 }
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0103 }
    L_0x0103:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0105 }
    L_0x0105:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0107 }
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0109 }
    L_0x0109:
        r0 = move-exception;
        throw r0;
    L_0x010b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x010d }
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0111 }
    L_0x0111:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0113 }
    L_0x0113:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0115 }
    L_0x0115:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0117 }
    L_0x0117:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0119 }
    L_0x0119:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x011b }
    L_0x011b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x011d }
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x011f }
    L_0x011f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00f5 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatInfo.onActivityResult(int, int, android.content.Intent):void");
    }

    private void h() {
        try {
            if (this.j != null) {
                this.j.cancel(true);
            }
            setSupportProgressBarIndeterminateVisibility(true);
            this.j = new ji(this);
            a5w.a(this.j, new Void[0]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void d(String str) {
        try {
            if (!bd.b(str)) {
                m8 a = App.P.a(str);
                if (a != null) {
                    m8.a(this.m, new atd(a));
                    this.F.notifyDataSetChanged();
                }
                if (App.az == 0) {
                    return;
                }
            }
            if (str.equals(this.D)) {
                this.A.setVisibility(8);
                this.G.c();
                f();
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static m8 a(GroupChatInfo groupChatInfo, m8 m8Var) {
        groupChatInfo.B = m8Var;
        return m8Var;
    }

    static ImageButton c(GroupChatInfo groupChatInfo) {
        return groupChatInfo.v;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            if (this.B != null) {
                bundle.putString(H[5], this.B.e);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.f /*1*/:
                return new Builder(this).setMessage(a5.d(getString(R.string.delete_group_dialog_title, new Object[]{this.G.a((Context) this)}), getBaseContext())).setCancelable(true).setNegativeButton(R.string.cancel, new e6(this)).setPositiveButton(R.string.delete, new at3(this)).create();
            case ay.n /*2*/:
                return new Builder(this).setMessage(a5.d(getString(R.string.exit_group_dialog_title, new Object[]{this.G.a((Context) this)}), getBaseContext())).setCancelable(true).setNegativeButton(R.string.cancel, new pp(this)).setPositiveButton(R.string.exit, new wf(this)).create();
            case ay.p /*3*/:
                return new Builder(this).setMessage(a5.d(getString(R.string.end_group_dialog_title, new Object[]{this.G.a((Context) this)}), getBaseContext())).setCancelable(true).setNegativeButton(R.string.cancel, new fu(this)).setPositiveButton(R.string.ok, new js(this)).create();
            case aj.i /*4*/:
                Log.w(H[11]);
                return new Builder(this).setMessage(R.string.activity_not_found).setNeutralButton(R.string.ok, new kt(this)).create();
            case aV.i /*6*/:
                if (this.B == null) {
                    return super.onCreateDialog(i);
                }
                return new Builder(this).setMessage(a5.d(getString(R.string.remove_participant_dialog_title, new Object[]{this.B.a((Context) this), this.G.a((Context) this)}), getBaseContext())).setCancelable(true).setNegativeButton(R.string.cancel, new afq(this)).setPositiveButton(R.string.ok, new a3q(this)).create();
            case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                return new kc(this, R.string.edit_group_subject_dialog_title, App.P.f(this.G.e).a((Context) this), new ne(this), ge.s, R.string.small_case_subject, R.string.no_emtpy_subject);
            default:
                return super.onCreateDialog(i);
        }
    }

    private boolean a(int i) {
        try {
            if (this.B != null) {
                switch (i) {
                    case PBE.MD5 /*0*/:
                        try {
                            if (this.B.h != null) {
                                ContactInfo.a(this.B, (Activity) this);
                                break;
                            }
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                        break;
                    case ay.f /*1*/:
                        startActivity(Conversation.a(this.B));
                        break;
                    case ay.n /*2*/:
                        j();
                        break;
                    case ay.p /*3*/:
                        p();
                        break;
                    case aj.i /*4*/:
                        App.b(this.B, (Activity) this);
                        break;
                    case aV.r /*5*/:
                        showDialog(6);
                        break;
                    case aV.i /*6*/:
                        g(this.B.e);
                        break;
                    case a8.s /*7*/:
                        j(this.B.e);
                        break;
                    default:
                        break;
                }
            }
            return true;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static void q(GroupChatInfo groupChatInfo) {
        groupChatInfo.b();
    }

    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        this.B = (m8) ((AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag();
        a(menuItem.getItemId());
        return true;
    }

    static m8 n(GroupChatInfo groupChatInfo) {
        return groupChatInfo.B;
    }

    static void j(GroupChatInfo groupChatInfo) {
        groupChatInfo.n();
    }
}
