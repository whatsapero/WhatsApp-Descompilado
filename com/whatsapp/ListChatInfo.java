package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.bm;
import java.util.ArrayList;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ListChatInfo extends DialogToastListActivity implements anq {
    private static final String[] z;
    private ListView i;
    private m8 j;
    private amd k;
    private fk l;
    private TextView m;
    private a85 n;
    private View o;
    private TextView p;
    private ArrayList q;
    private OnClickListener r;
    private ImageButton s;
    private m8 t;
    private TextView u;
    private final fc v;

    static {
        String[] strArr = new String[21];
        String str = "k3\u000bLJo;\fQGa5WYMcz\u001d@@t.\u0011VN'9\u0017V]f9\f\u0002\tf9\fQ_n.\u0001\u0018Gh.X^Fr4\u001c\u0014\tw(\u0017ZHe6\u0001\u0018]f8\u0014]]";
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
                        i3 = 7;
                        break;
                    case ay.f /*1*/:
                        i3 = 90;
                        break;
                    case ay.n /*2*/:
                        i3 = 120;
                        break;
                    case ay.p /*3*/:
                        i3 = 56;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "k3\u000bLJo;\fQGa5W[[b;\fQFiw\fQDbu\u001dJ[h(X";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "k3\u000bLvd2\u0019Lvn4\u001eW\u0006u?\u000bMEsu\u001bWGs;\u001bL\ti5\f\u0018Hc>\u001d\\";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "d5\u0016LHd.";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "k3\u000bLvd2\u0019Lvn4\u001eW\u0006u?\u000bMEsu\u000bS@wu\u001bWGs;\u001bL\ti5\f\u0018Hc>\u001d\\";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "G)VOAf.\u000bYYwt\u0016]]";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    str = "`3\u001c";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "t?\u0014]Js?\u001cgCn>";
                    obj = 7;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "k;\u0001W\\s\u0005\u0011VOk;\f][";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "k3\u000bLvd2\u0019Lvn4\u001eW\u0006d(\u001dY]b";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "k3\u000bLvd2\u0019Lvn4\u001eW\u0006c?\u000bL[h#";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "f4\u001cJFn>VQGs?\u0016L\u0007f9\fQFit1vzB\b,gfU\u0005=|`S";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "w2\u0017VLX.\u0001HL";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "q4\u001c\u0016Hi>\nW@ct\u001bM[t5\n\u0016@s?\u0015\u0017Jh4\fYJs";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "w2\u0017VL";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "`(\u0017MY'3\u0016^F(9\u0017V]b\"\f\u0018Z~)\f]D'9\u0017V]f9\f\u0018En)\f\u0018Jh/\u0014\\\ti5\f\u0018Oh/\u0016\\";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "f4\u001cJFn>VQGs?\u0016L\u0007f9\fQFit1vzB\b,";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "w2\u0017VL";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "t?\u0014]Js?\u001cgCn>";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "`3\u001c";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "`3\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static m8 c(ListChatInfo listChatInfo) {
        return listChatInfo.j;
    }

    private void e(String str) {
        bd.b(this.t.e, str);
        this.q.add(App.P.a(str));
        b();
    }

    static void b(ListChatInfo listChatInfo) {
        listChatInfo.e();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            if (this.j != null) {
                bundle.putString(z[19], this.j.e);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void a(Collection collection) {
    }

    static void f(ListChatInfo listChatInfo) {
        listChatInfo.h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.app.Dialog onCreateDialog(int r9) {
        /*
        r8_this = this;
        r5 = 2131624059; // 0x7f0e007b float:1.8875287E38 double:1.0531622174E-314;
        r4 = 2131624632; // 0x7f0e02b8 float:1.887645E38 double:1.0531625005E-314;
        r3 = 1;
        r6 = 0;
        switch(r9) {
            case 2: goto L_0x002e;
            case 4: goto L_0x00ca;
            case 6: goto L_0x0082;
            case 50: goto L_0x0010;
            default: goto L_0x000b;
        };
    L_0x000b:
        r0 = super.onCreateDialog(r9);
    L_0x000f:
        return r0;
    L_0x0010:
        r4 = new com.whatsapp.rq;
        r4.<init>(r8);
        r0 = new com.whatsapp.kc;
        r2 = 2131624253; // 0x7f0e013d float:1.887568E38 double:1.0531623132E-314;
        r1 = com.whatsapp.App.P;
        r3 = r8.t;
        r3 = r3.e;
        r1 = r1.f(r3);
        r3 = r1.N;
        r5 = com.whatsapp.ge.s;
        r1 = r8;
        r7 = r6;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        goto L_0x000f;
    L_0x002e:
        r0 = r8.t;
        r0 = r0.a(r8);
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0045;
    L_0x003a:
        r0 = 2131624234; // 0x7f0e012a float:1.8875642E38 double:1.053162304E-314;
        r0 = r8.getString(r0);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0056;
    L_0x0045:
        r0 = 2131624233; // 0x7f0e0129 float:1.887564E38 double:1.0531623034E-314;
        r1 = new java.lang.Object[r3];
        r2 = r8.t;
        r2 = r2.a(r8);
        r1[r6] = r2;
        r0 = r8.getString(r0, r1);
    L_0x0056:
        r1 = new android.app.AlertDialog$Builder;
        r1.<init>(r8);
        r2 = r8.getBaseContext();
        r0 = com.whatsapp.util.a5.d(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r3);
        r1 = new com.whatsapp.e7;
        r1.<init>(r8);
        r0 = r0.setNegativeButton(r5, r1);
        r1 = new com.whatsapp.a80;
        r1.<init>(r8);
        r0 = r0.setPositiveButton(r4, r1);
        r0 = r0.create();
        goto L_0x000f;
    L_0x0082:
        r0 = r8.j;
        if (r0 == 0) goto L_0x00c4;
    L_0x0086:
        r0 = 2131624796; // 0x7f0e035c float:1.8876782E38 double:1.0531625815E-314;
        r1 = new java.lang.Object[r3];
        r2 = r8.j;
        r2 = r2.a(r8);
        r1[r6] = r2;
        r0 = r8.getString(r0, r1);
        r1 = new android.app.AlertDialog$Builder;
        r1.<init>(r8);
        r2 = r8.getBaseContext();
        r0 = com.whatsapp.util.a5.d(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r3);
        r1 = new com.whatsapp.y9;
        r1.<init>(r8);
        r0 = r0.setNegativeButton(r5, r1);
        r1 = new com.whatsapp.nv;
        r1.<init>(r8);
        r0 = r0.setPositiveButton(r4, r1);
        r0 = r0.create();
        goto L_0x000f;
    L_0x00c4:
        r0 = super.onCreateDialog(r9);
        goto L_0x000f;
    L_0x00ca:
        r0 = z;
        r0 = r0[r6];
        com.whatsapp.util.Log.w(r0);
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131623970; // 0x7f0e0022 float:1.8875107E38 double:1.0531621734E-314;
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.lf;
        r1.<init>(r8);
        r0 = r0.setNeutralButton(r4, r1);
        r0 = r0.create();
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.onCreateDialog(int):android.app.Dialog");
    }

    static ArrayList e(ListChatInfo listChatInfo) {
        return listChatInfo.q;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        this.j = (m8) ((AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag();
        a(this.j, menuItem.getItemId());
        return true;
    }

    static void b(ListChatInfo listChatInfo, m8 m8Var) {
        listChatInfo.a(m8Var);
    }

    private void g() {
        try {
            Intent intent = new Intent(z[12]);
            intent.setType(z[14]);
            intent.putExtra(z[15], this.j.a((Context) this));
            intent.putExtra(z[13], 2);
            intent.setFlags(524288);
            startActivityForResult(intent, 11);
        } catch (ActivityNotFoundException e) {
            showDialog(4);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
        r4_this = this;
        r1 = com.whatsapp.App.az;
        r0 = r4.i;
        r2 = 0;
        r0 = r0.getChildAt(r2);
        if (r0 == 0) goto L_0x0052;
    L_0x000b:
        r2 = r4.i;	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r2.getWidth();	 Catch:{ NumberFormatException -> 0x0053 }
        r3 = r4.i;	 Catch:{ NumberFormatException -> 0x0053 }
        r3 = r3.getHeight();	 Catch:{ NumberFormatException -> 0x0053 }
        if (r2 <= r3) goto L_0x003e;
    L_0x0019:
        r2 = r4.i;	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r2.getFirstVisiblePosition();	 Catch:{ NumberFormatException -> 0x0053 }
        if (r2 != 0) goto L_0x0027;
    L_0x0021:
        r0 = r0.getTop();
        if (r1 == 0) goto L_0x0030;
    L_0x0027:
        r0 = r4.o;
        r0 = r0.getHeight();
        r0 = -r0;
        r0 = r0 + 1;
    L_0x0030:
        r2 = r4.o;	 Catch:{ NumberFormatException -> 0x0055 }
        r3 = r4.o;	 Catch:{ NumberFormatException -> 0x0055 }
        r3 = r3.getTop();	 Catch:{ NumberFormatException -> 0x0055 }
        r0 = r0 - r3;
        r2.offsetTopAndBottom(r0);	 Catch:{ NumberFormatException -> 0x0055 }
        if (r1 == 0) goto L_0x0052;
    L_0x003e:
        r0 = r4.o;	 Catch:{ NumberFormatException -> 0x0057 }
        r0 = r0.getTop();	 Catch:{ NumberFormatException -> 0x0057 }
        if (r0 == 0) goto L_0x0052;
    L_0x0046:
        r0 = r4.o;	 Catch:{ NumberFormatException -> 0x0057 }
        r1 = r4.o;	 Catch:{ NumberFormatException -> 0x0057 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.h():void");
    }

    static m8 d(ListChatInfo listChatInfo) {
        return listChatInfo.t;
    }

    static void a(ListChatInfo listChatInfo, ArrayList arrayList) {
        listChatInfo.a(arrayList);
    }

    public void a(String str) {
        if (!str.equals(App.af() + z[6])) {
            m8 a = App.P.a(str);
            if (a != null) {
                m8.a(this.q, new aty(a));
                this.n.notifyDataSetChanged();
            }
        }
    }

    public void d(String str) {
        if (!bd.b(str)) {
            m8 a = App.P.a(str);
            if (a != null) {
                m8.a(this.q, new atd(a));
                this.n.notifyDataSetChanged();
            }
        }
    }

    private void f() {
        try {
            String e = bm.e(this, Long.parseLong(this.t.s));
            this.m.setText(getResources().getString(R.string.group_creation_time, new Object[]{e}));
            this.m.setVisibility(0);
        } catch (NumberFormatException e2) {
            Log.e(z[2] + e2);
            this.m.setVisibility(8);
        }
        try {
            if (this.k != null) {
                this.k.cancel(true);
            }
            setSupportProgressBarIndeterminateVisibility(true);
            this.k = new amd(this, null);
            a5w.a(this.k, new Void[0]);
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public void b(String str) {
    }

    static fk a(ListChatInfo listChatInfo) {
        return listChatInfo.l;
    }

    static m8 a(ListChatInfo listChatInfo, m8 m8Var) {
        listChatInfo.j = m8Var;
        return m8Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateContextMenu(android.view.ContextMenu r10, android.view.View r11, android.view.ContextMenu.ContextMenuInfo r12) {
        /*
        r9_this = this;
        r8 = 1;
        super.onCreateContextMenu(r10, r11, r12);
        r12 = (android.widget.AdapterView.AdapterContextMenuInfo) r12;
        r0 = r12.targetView;
        r0 = r0.getTag();
        r0 = (com.whatsapp.m8) r0;
        if (r0 != 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r1 = 0;
        r2 = 1;
        r3 = 0;
        r4 = 2131624525; // 0x7f0e024d float:1.8876232E38 double:1.0531624476E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x009b }
        r6 = 0;
        r7 = r0.o();	 Catch:{ NumberFormatException -> 0x009b }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x009b }
        r4 = r9.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x009b }
        r10.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x009b }
        r1 = 0;
        r2 = 4;
        r3 = 0;
        r4 = 2131624048; // 0x7f0e0070 float:1.8875265E38 double:1.053162212E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x009b }
        r6 = 0;
        r7 = r0.o();	 Catch:{ NumberFormatException -> 0x009b }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x009b }
        r4 = r9.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x009b }
        r10.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x009b }
        r1 = r0.h;	 Catch:{ NumberFormatException -> 0x009b }
        if (r1 != 0) goto L_0x0061;
    L_0x0043:
        r1 = 0;
        r2 = 2;
        r3 = 0;
        r4 = 2131623974; // 0x7f0e0026 float:1.8875115E38 double:1.0531621754E-314;
        r4 = r9.getString(r4);	 Catch:{ NumberFormatException -> 0x009d }
        r10.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x009d }
        r1 = 0;
        r2 = 3;
        r3 = 0;
        r4 = 2131623977; // 0x7f0e0029 float:1.887512E38 double:1.053162177E-314;
        r4 = r9.getString(r4);	 Catch:{ NumberFormatException -> 0x009d }
        r10.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x009d }
        r1 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x009d }
        if (r1 == 0) goto L_0x0078;
    L_0x0061:
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 2131625076; // 0x7f0e0474 float:1.887735E38 double:1.05316272E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x009d }
        r6 = 0;
        r7 = r0.o();	 Catch:{ NumberFormatException -> 0x009d }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x009d }
        r4 = r9.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x009d }
        r10.add(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x009d }
    L_0x0078:
        r1 = r9.q;	 Catch:{ NumberFormatException -> 0x0099 }
        r1 = r1.size();	 Catch:{ NumberFormatException -> 0x0099 }
        if (r1 <= r8) goto L_0x0010;
    L_0x0080:
        r1 = 0;
        r2 = 5;
        r3 = 0;
        r4 = 2131624791; // 0x7f0e0357 float:1.8876772E38 double:1.053162579E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x0099 }
        r6 = 0;
        r0 = r0.o();	 Catch:{ NumberFormatException -> 0x0099 }
        r5[r6] = r0;	 Catch:{ NumberFormatException -> 0x0099 }
        r0 = r9.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x0099 }
        r10.add(r1, r2, r3, r0);	 Catch:{ NumberFormatException -> 0x0099 }
        goto L_0x0010;
    L_0x0099:
        r0 = move-exception;
        throw r0;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r5_this = this;
        r0 = com.whatsapp.ge.f;	 Catch:{ NumberFormatException -> 0x0053 }
        if (r0 != 0) goto L_0x0017;
    L_0x0004:
        r0 = r5.u;	 Catch:{ NumberFormatException -> 0x0055 }
        r1 = r5.q;	 Catch:{ NumberFormatException -> 0x0055 }
        r1 = r1.size();	 Catch:{ NumberFormatException -> 0x0055 }
        r1 = java.lang.Integer.toString(r1);	 Catch:{ NumberFormatException -> 0x0055 }
        r0.setText(r1);	 Catch:{ NumberFormatException -> 0x0055 }
        r0 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x0055 }
        if (r0 == 0) goto L_0x003c;
    L_0x0017:
        r0 = r5.u;	 Catch:{ NumberFormatException -> 0x0055 }
        r1 = 2131624640; // 0x7f0e02c0 float:1.8876465E38 double:1.0531625045E-314;
        r2 = 2;
        r2 = new java.lang.Object[r2];	 Catch:{ NumberFormatException -> 0x0055 }
        r3 = 0;
        r4 = r5.q;	 Catch:{ NumberFormatException -> 0x0055 }
        r4 = r4.size();	 Catch:{ NumberFormatException -> 0x0055 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ NumberFormatException -> 0x0055 }
        r2[r3] = r4;	 Catch:{ NumberFormatException -> 0x0055 }
        r3 = 1;
        r4 = com.whatsapp.ge.f;	 Catch:{ NumberFormatException -> 0x0055 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ NumberFormatException -> 0x0055 }
        r2[r3] = r4;	 Catch:{ NumberFormatException -> 0x0055 }
        r1 = r5.getString(r1, r2);	 Catch:{ NumberFormatException -> 0x0055 }
        r0.setText(r1);	 Catch:{ NumberFormatException -> 0x0055 }
    L_0x003c:
        r0 = r5.q;
        r1 = new com.whatsapp.a_u;
        r2 = r5.getApplicationContext();
        r1.<init>(r2);
        java.util.Collections.sort(r0, r1);
        r0 = r5.n;
        r0.notifyDataSetChanged();
        r5.d();
        return;
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.whatsapp.m8 r4, int r5) {
        /*
        r3_this = this;
        r2 = 1;
        switch(r5) {
            case 0: goto L_0x0005;
            case 1: goto L_0x0026;
            case 2: goto L_0x000f;
            case 3: goto L_0x0022;
            case 4: goto L_0x002e;
            case 5: goto L_0x0032;
            default: goto L_0x0004;
        };
    L_0x0004:
        return r2;
    L_0x0005:
        r0 = r4.h;	 Catch:{ NumberFormatException -> 0x000d }
        if (r0 == 0) goto L_0x0004;
    L_0x0009:
        com.whatsapp.ContactInfo.a(r4, r3);	 Catch:{ NumberFormatException -> 0x000d }
        goto L_0x0004;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        if (r4 != 0) goto L_0x001c;
    L_0x0011:
        r0 = 2131624360; // 0x7f0e01a8 float:1.8875898E38 double:1.053162366E-314;
        r1 = 0;
        com.whatsapp.App.b(r3, r0, r1);	 Catch:{ NumberFormatException -> 0x0020 }
        r0 = com.whatsapp.App.az;	 Catch:{ NumberFormatException -> 0x0020 }
        if (r0 == 0) goto L_0x0004;
    L_0x001c:
        r3.b(r4);	 Catch:{ NumberFormatException -> 0x0020 }
        goto L_0x0004;
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r3.g();
        goto L_0x0004;
    L_0x0026:
        r0 = com.whatsapp.Conversation.a(r4);
        r3.startActivity(r0);
        goto L_0x0004;
    L_0x002e:
        com.whatsapp.App.b(r4, r3);
        goto L_0x0004;
    L_0x0032:
        r0 = 6;
        r3.showDialog(r0);
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.a(com.whatsapp.m8, int):boolean");
    }

    static void h(ListChatInfo listChatInfo) {
        listChatInfo.f();
    }

    public void a() {
        int i = App.az;
        this.q.clear();
        for (String str : bd.i(this.t.e).j()) {
            m8 a = App.P.a(str);
            try {
                if (!this.q.contains(a)) {
                    this.q.add(a);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        b();
    }

    public ListChatInfo() {
        this.q = new ArrayList();
        this.l = new fk();
        this.r = new a1_(this);
        this.v = new g8(this);
    }

    private void b(m8 m8Var) {
        String a = m8Var.a();
        Intent intent = new Intent(z[17], Contacts.CONTENT_URI);
        try {
            intent.putExtra(z[18], a);
            intent.setComponent(intent.resolveActivity(getPackageManager()));
            if (intent.getComponent() != null) {
                startActivityForResult(intent, 10);
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            Log.i(z[16]);
            App.q();
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public void c(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
        r5_this = this;
        r4 = -1;
        r0 = com.whatsapp.App.az;
        switch(r6) {
            case 1: goto L_0x005a;
            case 10: goto L_0x0007;
            case 11: goto L_0x003b;
            default: goto L_0x0006;
        };
    L_0x0006:
        return;
    L_0x0007:
        if (r7 != r4) goto L_0x0031;
    L_0x0009:
        if (r8 == 0) goto L_0x001e;
    L_0x000b:
        r1 = r8.getData();	 Catch:{ NumberFormatException -> 0x0069 }
        if (r1 == 0) goto L_0x001e;
    L_0x0011:
        r1 = com.whatsapp.App.P;	 Catch:{ NumberFormatException -> 0x006b }
        r2 = r8.getData();	 Catch:{ NumberFormatException -> 0x006b }
        r3 = r5.j;	 Catch:{ NumberFormatException -> 0x006b }
        r1.a(r2, r3);	 Catch:{ NumberFormatException -> 0x006b }
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r1 = com.whatsapp.App.P;	 Catch:{ NumberFormatException -> 0x006b }
        r2 = r5.j;	 Catch:{ NumberFormatException -> 0x006b }
        r1.i(r2);	 Catch:{ NumberFormatException -> 0x006b }
    L_0x0025:
        r5.b();	 Catch:{ NumberFormatException -> 0x006d }
        r1 = r5.j;	 Catch:{ NumberFormatException -> 0x006d }
        r1 = r1.e;	 Catch:{ NumberFormatException -> 0x006d }
        com.whatsapp.Conversation.i(r1);	 Catch:{ NumberFormatException -> 0x006d }
        if (r0 == 0) goto L_0x0006;
    L_0x0031:
        r1 = z;	 Catch:{ NumberFormatException -> 0x006f }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x006f }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x006f }
        if (r0 == 0) goto L_0x0006;
    L_0x003b:
        if (r7 != r4) goto L_0x0050;
    L_0x003d:
        r1 = com.whatsapp.App.P;	 Catch:{ NumberFormatException -> 0x0073 }
        r2 = r5.j;	 Catch:{ NumberFormatException -> 0x0073 }
        r1.i(r2);	 Catch:{ NumberFormatException -> 0x0073 }
        r5.b();	 Catch:{ NumberFormatException -> 0x0073 }
        r1 = r5.j;	 Catch:{ NumberFormatException -> 0x0073 }
        r1 = r1.e;	 Catch:{ NumberFormatException -> 0x0073 }
        com.whatsapp.Conversation.i(r1);	 Catch:{ NumberFormatException -> 0x0073 }
        if (r0 == 0) goto L_0x0006;
    L_0x0050:
        r1 = z;	 Catch:{ NumberFormatException -> 0x0075 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0075 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NumberFormatException -> 0x0075 }
        if (r0 == 0) goto L_0x0006;
    L_0x005a:
        if (r7 != r4) goto L_0x0006;
    L_0x005c:
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        r0 = r8.getStringExtra(r0);
        r5.e(r0);
        goto L_0x0006;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ListChatInfo.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case ay.f /*1*/:
                    e();
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

    public void onCreate(Bundle bundle) {
        int i = App.az;
        Log.i(z[10]);
        super.onCreate(bundle);
        requestWindowFeature(5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.groupchat_info);
        this.t = App.P.a(getIntent().getStringExtra(z[7]));
        this.i = getListView();
        this.n = new a85(this, this, R.layout.participant_list_row, this.q);
        LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(z[9]);
        View a = b7.a(layoutInflater, R.layout.groupchat_info_footer, this.i, false);
        View a2 = b7.a(layoutInflater, R.layout.groupchat_info_header, this.i, false);
        this.i.addFooterView(a, null, false);
        this.i.addHeaderView(a2, null, false);
        this.o = findViewById(R.id.header);
        this.o.setClickable(true);
        this.i.setOnScrollListener(new vg(this));
        this.i.getViewTreeObserver().addOnGlobalLayoutListener(new u8(this));
        this.i.setOnItemClickListener(new wp(this));
        a2.setClickable(false);
        a2.setFocusable(false);
        OnClickListener r3Var = new r3(this);
        a = a.findViewById(R.id.add_participant_layout);
        ((TextView) a.findViewById(R.id.add_participant_text)).setText(R.string.add_broadcast_recipient);
        a.setVisibility(0);
        a.setOnClickListener(r3Var);
        a.setBackgroundResource(R.drawable.panel_bot);
        a2.findViewById(R.id.media_card).setVisibility(8);
        a2.findViewById(R.id.locations_card).setVisibility(8);
        findViewById(R.id.photo_btn).setVisibility(8);
        this.m = (TextView) findViewById(R.id.creation_tv);
        findViewById(R.id.creator_tv).setVisibility(8);
        ((TextView) findViewById(R.id.participants_title)).setText(R.string.recipients_title);
        OnClickListener ejVar = new ej(this);
        a2.findViewById(R.id.media_title).setOnClickListener(ejVar);
        a2.findViewById(R.id.media_info).setOnClickListener(ejVar);
        this.i.setAdapter(this.n);
        registerForContextMenu(this.i);
        this.p = (TextView) findViewById(R.id.subject_tv);
        this.s = (ImageButton) findViewById(R.id.change_subject_btn);
        this.s.setOnClickListener(this.r);
        this.u = (TextView) findViewById(R.id.participants_info);
        this.u.setText(getString(R.string.participants_count, new Object[]{Integer.valueOf(this.q.size()), Integer.valueOf(ge.f)}));
        Button button = (Button) findViewById(R.id.exit_group_btn);
        button.setText(R.string.delete_list);
        button.setOnClickListener(new h9(this));
        for (String string : bd.i(this.t.e).j()) {
            String string2;
            m8 a3 = App.P.a(string2);
            try {
                if (!this.q.contains(a3)) {
                    this.q.add(a3);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        d();
        f();
        b();
        App.aJ.b(this.v);
        App.b((anq) this);
        if (bundle != null) {
            string2 = bundle.getString(z[8]);
            if (string2 != null) {
                try {
                    this.j = App.P.a(string2);
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, (int) R.string.add_broadcast_recipient).setIcon((int) R.drawable.ic_action_add_person).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    private void a(m8 m8Var) {
        bd.a(this.t.e, m8Var.e);
        this.q.remove(m8Var);
        b();
    }

    static void g(ListChatInfo listChatInfo) {
        listChatInfo.d();
    }

    private void a(ArrayList arrayList) {
        try {
            String str;
            if (this.t == null) {
                str = null;
            } else {
                str = this.t.e;
            }
            ContactInfo.a(arrayList, str, (Activity) this);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void e() {
        if (this.q.size() < ge.f) {
            Intent intent = new Intent(this, ContactPicker.class);
            intent.putExtra(z[20], this.t.e);
            startActivityForResult(intent, 1);
            if (App.az == 0) {
                return;
            }
        }
        AlertDialog create = new Builder(this).create();
        create.setTitle(getString(R.string.alert));
        create.setMessage(getString(R.string.broadcast_reach_limit, new Object[]{Integer.valueOf(ge.f)}));
        create.setButton(getString(R.string.ok), new azt(this));
        create.show();
    }

    public static void a(m8 m8Var, Activity activity) {
        Intent intent = new Intent(activity, ListChatInfo.class);
        intent.putExtra(z[1], m8Var.e);
        activity.startActivity(intent);
    }

    private void d() {
        try {
            if (TextUtils.isEmpty(this.t.N)) {
                this.p.setText(String.format(App.aX.a(R.plurals.broadcast_n_recipients, this.q.size()), new Object[]{Integer.valueOf(this.q.size())}));
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            this.p.setText(a5.d(this.t.a((Context) this), getBaseContext()));
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public void onDestroy() {
        try {
            Log.i(z[11]);
            super.onDestroy();
            if (this.k != null) {
                this.k.cancel(true);
            }
            this.l.a();
            App.aJ.a(this.v);
            App.a((anq) this);
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
