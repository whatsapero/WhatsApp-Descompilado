package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.contact.i;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ContactPicker extends VerifyMessageStoreActivity implements anq {
    private static boolean C;
    private static final m8 M;
    private static final m8 X;
    private static final String[] Y;
    private static final m8 q;
    private Callback A;
    private ts B;
    private String D;
    private ArrayList E;
    private boolean F;
    private boolean G;
    private boolean H;
    private Intent I;
    private ArrayList J;
    private ts K;
    private boolean L;
    private boolean N;
    private Handler O;
    private ViewPager P;
    private String Q;
    private MenuItem R;
    private final Object S;
    private ArrayList T;
    private HashMap U;
    private m8 V;
    private boolean W;
    private boolean k;
    private String l;
    private String m;
    private Set n;
    private ArrayList o;
    private ts p;
    private boolean r;
    private String s;
    private boolean t;
    private ArrayList u;
    private fk v;
    private String w;
    private byte x;
    private ActionMode y;
    private boolean z;

    static ts w(ContactPicker contactPicker) {
        return contactPicker.B;
    }

    private void f() {
        int i = App.az;
        ArrayList b = v.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m8 a = App.P.a(str);
            if (a != null) {
                try {
                    if (a.h != null) {
                        continue;
                    } else if (str.endsWith(Y[87])) {
                        arrayList.add(a.e);
                        continue;
                    } else {
                        continue;
                    }
                } catch (SecurityException e) {
                    throw e;
                } catch (SecurityException e2) {
                    throw e2;
                }
            }
            if (i != 0) {
                break;
            }
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = App.P.e((String) it.next()).iterator();
            while (it2.hasNext()) {
                m8 m8Var = (m8) it2.next();
                if (i != 0) {
                    break;
                    continue;
                }
            }
            if (i != 0) {
                break;
            }
        }
        if (arrayList.size() > 0) {
            str = (String) arrayList.get(0);
            ArrayList f = App.P.f();
            it2 = f.iterator();
            while (it2.hasNext()) {
                m8 m8Var2 = (m8) it2.next();
                try {
                    if (m8Var2.e != null && !m8Var2.e.startsWith(str)) {
                        if (i != 0) {
                            break;
                        }
                    } else if (i != 0) {
                        break;
                    }
                } catch (SecurityException e22) {
                    throw e22;
                }
            }
            f.clear();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
        r5_this = this;
        r0 = r5.y;	 Catch:{ SecurityException -> 0x003e }
        if (r0 == 0) goto L_0x003d;
    L_0x0004:
        r0 = r5.U;	 Catch:{ SecurityException -> 0x0040 }
        r0 = r0.size();	 Catch:{ SecurityException -> 0x0040 }
        if (r0 != 0) goto L_0x0015;
    L_0x000c:
        r0 = r5.y;	 Catch:{ SecurityException -> 0x0042 }
        r0.finish();	 Catch:{ SecurityException -> 0x0042 }
        r0 = com.whatsapp.App.az;	 Catch:{ SecurityException -> 0x0042 }
        if (r0 == 0) goto L_0x003d;
    L_0x0015:
        r0 = r5.y;	 Catch:{ SecurityException -> 0x0042 }
        r1 = com.whatsapp.App.aX;	 Catch:{ SecurityException -> 0x0042 }
        r2 = 2131558430; // 0x7f0d001e float:1.8742176E38 double:1.0531297924E-314;
        r3 = r5.U;	 Catch:{ SecurityException -> 0x0042 }
        r3 = r3.size();	 Catch:{ SecurityException -> 0x0042 }
        r1 = r1.a(r2, r3);	 Catch:{ SecurityException -> 0x0042 }
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ SecurityException -> 0x0042 }
        r3 = 0;
        r4 = r5.U;	 Catch:{ SecurityException -> 0x0042 }
        r4 = r4.size();	 Catch:{ SecurityException -> 0x0042 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ SecurityException -> 0x0042 }
        r2[r3] = r4;	 Catch:{ SecurityException -> 0x0042 }
        r1 = java.lang.String.format(r1, r2);	 Catch:{ SecurityException -> 0x0042 }
        r0.setTitle(r1);	 Catch:{ SecurityException -> 0x0042 }
    L_0x003d:
        return;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.h():void");
    }

    static String a(ContactPicker contactPicker, String str) {
        contactPicker.Q = str;
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.whatsapp.m8 r10) {
        /*
        r9_this = this;
        r6 = -1;
        r8 = 335544320; // 0x14000000 float:6.4623485E-27 double:1.65780921E-315;
        r0 = 0;
        r2 = 1;
        r3 = com.whatsapp.App.az;
        r1 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x002a }
        r1.<init>();	 Catch:{ SecurityException -> 0x002a }
        r4 = Y;	 Catch:{ SecurityException -> 0x002a }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x002a }
        r1 = r1.append(r4);	 Catch:{ SecurityException -> 0x002a }
        r4 = r10.e;	 Catch:{ SecurityException -> 0x002a }
        r1 = r1.append(r4);	 Catch:{ SecurityException -> 0x002a }
        r1 = r1.toString();	 Catch:{ SecurityException -> 0x002a }
        com.whatsapp.util.Log.i(r1);	 Catch:{ SecurityException -> 0x002a }
        r1 = c(r10);	 Catch:{ SecurityException -> 0x002a }
        if (r1 == 0) goto L_0x002c;
    L_0x0029:
        return r2;
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r1 = r10.e;	 Catch:{ SecurityException -> 0x004f }
        r1 = com.whatsapp.App.c(r1);	 Catch:{ SecurityException -> 0x004f }
        if (r1 != 0) goto L_0x0029;
    L_0x0034:
        r1 = r10.e;
        r9.V = r10;	 Catch:{ SecurityException -> 0x0051 }
        r4 = r9.z;	 Catch:{ SecurityException -> 0x0051 }
        if (r4 == 0) goto L_0x0055;
    L_0x003c:
        r4 = r9.N;	 Catch:{ SecurityException -> 0x0053 }
        if (r4 == 0) goto L_0x0055;
    L_0x0040:
        r4 = r9.s;	 Catch:{ SecurityException -> 0x004d }
        r4 = com.whatsapp.m8.b(r4);	 Catch:{ SecurityException -> 0x004d }
        if (r4 != 0) goto L_0x0055;
    L_0x0048:
        r0 = 0;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x004d }
        goto L_0x0029;
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x004d }
    L_0x0055:
        r4 = r9.t;	 Catch:{ SecurityException -> 0x0071 }
        if (r4 == 0) goto L_0x0073;
    L_0x0059:
        r0 = Y;	 Catch:{ SecurityException -> 0x0071 }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ SecurityException -> 0x0071 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SecurityException -> 0x0071 }
        r0 = -1;
        r1 = com.whatsapp.App.P;	 Catch:{ SecurityException -> 0x0071 }
        r3 = 1;
        r1 = r1.a(r10, r3);	 Catch:{ SecurityException -> 0x0071 }
        r9.setResult(r0, r1);	 Catch:{ SecurityException -> 0x0071 }
        r9.finish();	 Catch:{ SecurityException -> 0x0071 }
        goto L_0x0029;
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r4 = r9.o;
        if (r4 == 0) goto L_0x0112;
    L_0x0077:
        r4 = new android.content.Intent;
        r5 = com.whatsapp.Conversation.class;
        r4.<init>(r9, r5);
        r9.I = r4;
        r4 = r9.I;
        r5 = Y;
        r6 = 13;
        r5 = r5[r6];
        r4.putExtra(r5, r1);
        r1 = r9.I;
        r4 = Y;
        r5 = 21;
        r4 = r4[r5];
        r5 = r9.x;
        r1.putExtra(r4, r5);
        r1 = r9.I;
        r4 = Y;
        r5 = 19;
        r4 = r4[r5];
        r1.putExtra(r4, r2);
        r1 = r9.I;
        r4 = Y;
        r5 = 23;
        r4 = r4[r5];
        r5 = r9.getIntent();
        r6 = Y;
        r7 = 16;
        r6 = r6[r7];
        r5 = r5.getBooleanExtra(r6, r0);
        r1.putExtra(r4, r5);
        r1 = r9.I;
        r4 = Y;
        r5 = 5;
        r4 = r4[r5];
        r5 = r9.o;
        r1.putParcelableArrayListExtra(r4, r5);
        r1 = r9.I;
        r1.addFlags(r8);
        r1 = r9.getIntent();
        r4 = Y;
        r5 = 11;
        r4 = r4[r5];
        r0 = r1.getBooleanExtra(r4, r0);
        if (r0 != 0) goto L_0x00fb;
    L_0x00dd:
        r1 = r9.o;
        r4 = r1.iterator();
        r1 = r0;
    L_0x00e4:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0241;
    L_0x00ea:
        r0 = r4.next();
        r0 = (android.net.Uri) r0;
        r0 = com.whatsapp.util.f.a(r0);
        if (r0 == r2) goto L_0x023e;
    L_0x00f6:
        if (r3 == 0) goto L_0x023b;
    L_0x00f8:
        r0 = r2;
    L_0x00f9:
        if (r3 == 0) goto L_0x0238;
    L_0x00fb:
        if (r0 == 0) goto L_0x0103;
    L_0x00fd:
        r0 = 1;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x0110 }
        if (r3 == 0) goto L_0x0029;
    L_0x0103:
        r0 = 1;
        com.whatsapp.Conversation.ah = r0;	 Catch:{ SecurityException -> 0x0110 }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x0110 }
        r9.startActivity(r0);	 Catch:{ SecurityException -> 0x0110 }
        r9.finish();	 Catch:{ SecurityException -> 0x0110 }
        goto L_0x0029;
    L_0x0110:
        r0 = move-exception;
        throw r0;
    L_0x0112:
        r4 = r9.l;	 Catch:{ SecurityException -> 0x0188 }
        if (r4 == 0) goto L_0x0190;
    L_0x0116:
        r4 = r9.l;	 Catch:{ SecurityException -> 0x018a }
        r4 = r4.length();	 Catch:{ SecurityException -> 0x018a }
        if (r4 <= 0) goto L_0x0190;
    L_0x011e:
        r4 = new android.content.Intent;	 Catch:{ SecurityException -> 0x018c }
        r5 = com.whatsapp.Conversation.class;
        r4.<init>(r9, r5);	 Catch:{ SecurityException -> 0x018c }
        r9.I = r4;	 Catch:{ SecurityException -> 0x018c }
        r4 = r9.I;	 Catch:{ SecurityException -> 0x018c }
        r5 = Y;	 Catch:{ SecurityException -> 0x018c }
        r6 = 9;
        r5 = r5[r6];	 Catch:{ SecurityException -> 0x018c }
        r4.putExtra(r5, r1);	 Catch:{ SecurityException -> 0x018c }
        r1 = r9.I;	 Catch:{ SecurityException -> 0x018c }
        r4 = Y;	 Catch:{ SecurityException -> 0x018c }
        r5 = 22;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x018c }
        r5 = r9.x;	 Catch:{ SecurityException -> 0x018c }
        r1.putExtra(r4, r5);	 Catch:{ SecurityException -> 0x018c }
        r1 = r9.I;	 Catch:{ SecurityException -> 0x018c }
        r4 = Y;	 Catch:{ SecurityException -> 0x018c }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x018c }
        r5 = r9.l;	 Catch:{ SecurityException -> 0x018c }
        r1.putExtra(r4, r5);	 Catch:{ SecurityException -> 0x018c }
        r1 = r9.I;	 Catch:{ SecurityException -> 0x018c }
        r4 = Y;	 Catch:{ SecurityException -> 0x018c }
        r5 = 24;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x018c }
        r5 = 1;
        r1.putExtra(r4, r5);	 Catch:{ SecurityException -> 0x018c }
        r1 = r9.I;	 Catch:{ SecurityException -> 0x018c }
        r4 = Y;	 Catch:{ SecurityException -> 0x018c }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x018c }
        r5 = r9.N;	 Catch:{ SecurityException -> 0x018c }
        if (r5 != 0) goto L_0x0165;
    L_0x0164:
        r0 = r2;
    L_0x0165:
        r1.putExtra(r4, r0);	 Catch:{ SecurityException -> 0x018e }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x018e }
        r1 = 335544320; // 0x14000000 float:6.4623485E-27 double:1.65780921E-315;
        r0.addFlags(r1);	 Catch:{ SecurityException -> 0x018e }
        r0 = r9.N;	 Catch:{ SecurityException -> 0x018e }
        if (r0 == 0) goto L_0x0179;
    L_0x0173:
        r0 = 1;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x0186 }
        if (r3 == 0) goto L_0x0029;
    L_0x0179:
        r0 = 1;
        com.whatsapp.Conversation.ah = r0;	 Catch:{ SecurityException -> 0x0186 }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x0186 }
        r9.startActivity(r0);	 Catch:{ SecurityException -> 0x0186 }
        r9.finish();	 Catch:{ SecurityException -> 0x0186 }
        goto L_0x0029;
    L_0x0186:
        r0 = move-exception;
        throw r0;
    L_0x0188:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x018a }
    L_0x018a:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x018c }
    L_0x018c:
        r0 = move-exception;
        throw r0;
    L_0x018e:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0186 }
    L_0x0190:
        r0 = r9.D;	 Catch:{ SecurityException -> 0x01e5 }
        if (r0 == 0) goto L_0x01e7;
    L_0x0194:
        r0 = new android.content.Intent;	 Catch:{ SecurityException -> 0x01e5 }
        r3 = com.whatsapp.Conversation.class;
        r0.<init>(r9, r3);	 Catch:{ SecurityException -> 0x01e5 }
        r9.I = r0;	 Catch:{ SecurityException -> 0x01e5 }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x01e5 }
        r3 = Y;	 Catch:{ SecurityException -> 0x01e5 }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ SecurityException -> 0x01e5 }
        r0.putExtra(r3, r1);	 Catch:{ SecurityException -> 0x01e5 }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x01e5 }
        r1 = Y;	 Catch:{ SecurityException -> 0x01e5 }
        r3 = 12;
        r1 = r1[r3];	 Catch:{ SecurityException -> 0x01e5 }
        r3 = r9.D;	 Catch:{ SecurityException -> 0x01e5 }
        r0.putExtra(r1, r3);	 Catch:{ SecurityException -> 0x01e5 }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x01e5 }
        r1 = Y;	 Catch:{ SecurityException -> 0x01e5 }
        r3 = 7;
        r1 = r1[r3];	 Catch:{ SecurityException -> 0x01e5 }
        r3 = r9.m;	 Catch:{ SecurityException -> 0x01e5 }
        r0.putExtra(r1, r3);	 Catch:{ SecurityException -> 0x01e5 }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x01e5 }
        r1 = Y;	 Catch:{ SecurityException -> 0x01e5 }
        r3 = 3;
        r1 = r1[r3];	 Catch:{ SecurityException -> 0x01e5 }
        r3 = r9.x;	 Catch:{ SecurityException -> 0x01e5 }
        r0.putExtra(r1, r3);	 Catch:{ SecurityException -> 0x01e5 }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x01e5 }
        r1 = Y;	 Catch:{ SecurityException -> 0x01e5 }
        r3 = 17;
        r1 = r1[r3];	 Catch:{ SecurityException -> 0x01e5 }
        r3 = 1;
        r0.putExtra(r1, r3);	 Catch:{ SecurityException -> 0x01e5 }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x01e5 }
        r1 = 335544320; // 0x14000000 float:6.4623485E-27 double:1.65780921E-315;
        r0.addFlags(r1);	 Catch:{ SecurityException -> 0x01e5 }
        r0 = 1;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x01e5 }
        goto L_0x0029;
    L_0x01e5:
        r0 = move-exception;
        throw r0;
    L_0x01e7:
        r0 = r9.F;	 Catch:{ SecurityException -> 0x0203 }
        if (r0 == 0) goto L_0x0205;
    L_0x01eb:
        r0 = new android.content.Intent;	 Catch:{ SecurityException -> 0x0203 }
        r0.<init>();	 Catch:{ SecurityException -> 0x0203 }
        r9.I = r0;	 Catch:{ SecurityException -> 0x0203 }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x0203 }
        r3 = Y;	 Catch:{ SecurityException -> 0x0203 }
        r4 = 15;
        r3 = r3[r4];	 Catch:{ SecurityException -> 0x0203 }
        r0.putExtra(r3, r1);	 Catch:{ SecurityException -> 0x0203 }
        r0 = 2;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x0203 }
        goto L_0x0029;
    L_0x0203:
        r0 = move-exception;
        throw r0;
    L_0x0205:
        r0 = r9.r;	 Catch:{ SecurityException -> 0x0221 }
        if (r0 == 0) goto L_0x0223;
    L_0x0209:
        r0 = new android.content.Intent;	 Catch:{ SecurityException -> 0x0221 }
        r0.<init>();	 Catch:{ SecurityException -> 0x0221 }
        r9.I = r0;	 Catch:{ SecurityException -> 0x0221 }
        r0 = r9.I;	 Catch:{ SecurityException -> 0x0221 }
        r3 = Y;	 Catch:{ SecurityException -> 0x0221 }
        r4 = 20;
        r3 = r3[r4];	 Catch:{ SecurityException -> 0x0221 }
        r0.putExtra(r3, r1);	 Catch:{ SecurityException -> 0x0221 }
        r0 = 3;
        r9.showDialog(r0);	 Catch:{ SecurityException -> 0x0221 }
        goto L_0x0029;
    L_0x0221:
        r0 = move-exception;
        throw r0;
    L_0x0223:
        r0 = new android.content.Intent;
        r0.<init>();
        r3 = Y;
        r4 = 6;
        r3 = r3[r4];
        r0.putExtra(r3, r1);
        r9.setResult(r6, r0);
        r9.finish();
        goto L_0x0029;
    L_0x0238:
        r1 = r0;
        goto L_0x00e4;
    L_0x023b:
        r0 = r2;
        goto L_0x00fb;
    L_0x023e:
        r0 = r1;
        goto L_0x00f9;
    L_0x0241:
        r0 = r1;
        goto L_0x00fb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.a(com.whatsapp.m8):boolean");
    }

    static {
        String[] strArr = new String[94];
        String str = "\u001e\u0000j";
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
                        i3 = 116;
                        break;
                    case ay.f /*1*/:
                        i3 = 105;
                        break;
                    case ay.n /*2*/:
                        i3 = 14;
                        break;
                    case ay.p /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 108;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\b\u0011\u001azX\u0003\r";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0003\bQ^\u0015\u0004\f";
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u001e\u0000j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0011\u0011zX\rZ:Zx)5$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0017\u0006`^\r\u0017\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0002\noX\b+\u0007oG\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001c\u001d\neO\bT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001e\u0000j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0007\u0001oX\t+\u0004}M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0007\u0002gZ3\u0004\u001bk\\\u0005\u0011\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0002\noX\b+\u001azX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001e\u0000j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    str = "\u0017\u0006`L\u0005\u0006\u0004";
                    z = true;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "\u0017\u0006`^\r\u0017\u001d";
                    z = true;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0007\u0002gZ3\u0004\u001bk\\\u0005\u0011\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001c\b}u\u001f\u001c\b|O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0006\fz_\u001e\u001aIgD\u0018\u0011\u0007z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u001c\b}u\u001f\u001c\b|O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0017\u0006`^\r\u0017\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0003\bQ^\u0015\u0004\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0003\bQ^\u0015\u0004\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0007\u0002gZ3\u0004\u001bk\\\u0005\u0011\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u001c\b}u\u001f\u001c\b|O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001e\u0011\u001a{F\u0018T\naD\u0018\u0015\nz\n\u0002\u001b\u001d.K\b\u0010\fj";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u001a\u0006#G\r\u0000\nfO\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001a\u0006#G\r\u0000\nfO\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u001a\u0006#G\r\u0000\nfO\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u001e\u0000j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u001d\u0007zO\u0002\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0015\u001cjC\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0000\fv^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0002\u0000jO\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u001d\u0004oM\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0000\fv^C\fDxI\r\u0006\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0017\u0006`^\r\u0017\u001d!O\u001e\u0006\u0006|\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0011\u0004oC\u0000+\u0001gY\u0018\u001b\u001bw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "!=H\u0007T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0007\f`N";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0000\fv^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0011\u0011zX\rZ=Kr8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    str = "\u0002\noX\bN";
                    z = true;
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    strArr2 = strArr3;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0001\u001bg\n";
                    z = true;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0017\u0006`^\r\u0017\u001d!O\u001e\u0006\u0006|\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u001b\nzO\u0018Y\u001azX\t\u0015\u0004.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0017\u0006`^\r\u0017\u001dQZ\u0005\u0017\u0002kXC\u0007\u0001oX\t[\u001azX\t\u0015\u0004!L\bI\u0007{F\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u0017\u0006c\u0004\u001b\u001c\bzY\r\u0004\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0017\u0006c\u0004\u0006\u0001\u000eiO\u001e\u0007\u0006h^B\u0003\u0001o^\u001f\u0015\u0019~L\u0005\u0018\f}O\u0002\u0010\f|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0011\u0011zX\rZ:Zx)5$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0017\b~^\u0005\u001b\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u0007\fzu\u000b\u0006\u0006{Z3\u001d\naD";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0012\u0006|]\r\u0006\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0017\u0006`^\r\u0017\u001d!O\u001e\u0006\u0006|\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0016\u0005aI\u0007\u0011\rQF\u0005\u0007\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0011\u0011zX\rZ:[h&1*Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0017\u0006`^\r\u0017\u001d!O\u001e\u0006\u0006|\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0011\u0011zX\rZ=Kr8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0001\u001bg\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u0016\u0005aI\u0007+\naD\u0018\u0015\nz";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|O3\u0001\u001bgYC\u001a\u001cbFL";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0013\u0000j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0012\u0000bO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0011\u0011zX\rZ:Zx)5$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0017\u0006`^\r\u0017\u001d!O\u001e\u0006\u0006|\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0011\u0011zX\rZ:[h&1*Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0003\u0001o^\u001f\u0015\u0019~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0011\u0011zX\rZ=Kr8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "7\u0006{F\bT\u0007a^L\u0004\b|Y\tT\u001fMK\u001e\u0010IhC\u0000\u0011S.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0017\u0006`^\r\u0017\u001d!L\u0005\u0018\f.N\u0003\u0011\u001a`\r\u0018T\fvC\u001f\u0000I";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0015\nzC\u0003\u001aGMx)5=Ku?<&\\~/!=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0011\u0011zX\rZ:Zx)5$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0001\u001bgYL";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 73;
                    str = "TD.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 74;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0007\u001d|O\r\u0019F";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001c\u0011\u001bcC\u001f\u0007\u0000aDL";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 76;
                    str = "\u0017\u001bkK\u0018\u00116iX\u0003\u0001\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u001b\nzO\u0018Y\u001azX\t\u0015\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 78;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0017\u0006`^\r\u0017\u001d!O\u001e\u0006\u0006|\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0004\bQF\u0005\u0007\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u0018\r\u0019k\u0005\u0002\u0001\u0005b\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0017\bbF<\u001d\neO\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u0017\u0006c\u0004\u001b\u001c\bzY\t\u001a\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u001f\u001c\b|OC\u0016\bjL\u0005\u0018\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 84;
                    str = "\u0015\u0007jX\u0003\u001d\r C\u0002\u0000\f`^B\u0015\nzC\u0003\u001aGXc)#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0017\u0006c\u0004\r\u001a\r|E\u0005\u0010GmE\u0002\u0000\bm^\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u0017\u0006`^\r\u0017\u001dQZ\u0005\u0017\u0002kXC\u001b\u0019zC\u0003\u001a\u001a!Y\u0015\u0007\u001dkGL\u0017\u0006`^\r\u0017\u001d}\n\r\u0004\u0019.I\u0003\u0001\u0005j\n\u0002\u001b\u001d.L\u0003\u0001\u0007j";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 87;
                    str = "4\u001a ]\u0004\u0015\u001d}K\u001c\u0004G`O\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u001a\u0006#G\r\u0000\nfO\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u0017\u0006`^\r\u0017\u001d~C\u000f\u001f\f|\u0005\u000f\u0006\fo^\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0015\u000baX\u0018\u001d\u0007i\n\b\u0001\f.^\u0003T\u0007o^\u0005\u0002\f.F\u0005\u0016\u001boX\u0005\u0011\u001a.G\u0005\u0007\u001agD\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u0019\u0006{D\u0018\u0011\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 92;
                    str = "\u0019\u0006{D\u0018\u0011\rQX\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 93;
                    str = "\u0007\foX\u000f\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    Y = strArr3;
                    M = new m8("");
                    q = new m8("");
                    X = new m8("");
                    C = false;
                default:
                    strArr2[i] = str;
                    str = "\u001d\u0007zO\u0002\u0000";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        try {
            if (App.c(((m8) ((ListView) view).getItemAtPosition(((AdapterContextMenuInfo) contextMenuInfo).position)).e)) {
                contextMenu.add(0, 0, 0, String.format(getString(R.string.block_list_menu_unblock), new Object[]{r0.N}));
                super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    static boolean i(ContactPicker contactPicker) {
        return contactPicker.z;
    }

    static void d(ContactPicker contactPicker) {
        contactPicker.f();
    }

    private void o() {
        this.B.notifyDataSetChanged();
        this.K.notifyDataSetChanged();
        this.p.notifyDataSetChanged();
    }

    static m8 n() {
        return q;
    }

    static ts o(ContactPicker contactPicker) {
        return contactPicker.p;
    }

    static boolean p(ContactPicker contactPicker) {
        return contactPicker.r;
    }

    public void a(String str) {
        m8 a = App.P.a(str);
        if (a != null) {
            try {
                if (m8.a(this.E, new aty(a))) {
                    o();
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
    }

    static fk c(ContactPicker contactPicker) {
        return contactPicker.v;
    }

    static ViewPager t(ContactPicker contactPicker) {
        return contactPicker.P;
    }

    static boolean a(ContactPicker contactPicker, m8 m8Var) {
        return contactPicker.a(m8Var);
    }

    static ts m(ContactPicker contactPicker) {
        return contactPicker.K;
    }

    private static boolean c(m8 m8Var) {
        return Y[88].equals(m8Var.e);
    }

    private void l() {
        startActivity(new Intent(this, ContactPickerHelp.class));
    }

    static ArrayList u(ContactPicker contactPicker) {
        return contactPicker.J;
    }

    static ArrayList f(ContactPicker contactPicker) {
        return contactPicker.T;
    }

    public boolean onSearchRequested() {
        try {
            if (this.R != null) {
                this.R.expandActionView();
            }
            return false;
        } catch (SecurityException e) {
            throw e;
        }
    }

    static boolean x(ContactPicker contactPicker) {
        return contactPicker.t;
    }

    static boolean h(ContactPicker contactPicker) {
        return contactPicker.H;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void d() {
        /*
        r12_this = this;
        r9 = 4;
        r11 = 2;
        r2 = 0;
        r10 = 1;
        r4 = 0;
        r5 = com.whatsapp.App.az;
        r6 = r12.getIntent();
        r0 = r6.getAction();	 Catch:{ Exception -> 0x016e }
        if (r0 == 0) goto L_0x0026;
    L_0x0011:
        r0 = r6.getAction();	 Catch:{ Exception -> 0x016e }
        r1 = Y;	 Catch:{ Exception -> 0x016e }
        r3 = 70;
        r1 = r1[r3];	 Catch:{ Exception -> 0x016e }
        r0 = r0.equals(r1);	 Catch:{ Exception -> 0x016e }
        if (r0 == 0) goto L_0x0026;
    L_0x0021:
        r0 = 1;
        r12.t = r0;	 Catch:{ Exception -> 0x0170 }
        if (r5 == 0) goto L_0x06ff;
    L_0x0026:
        r0 = Y;	 Catch:{ Exception -> 0x0172 }
        r1 = 81;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0172 }
        r1 = 0;
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x0172 }
        if (r0 == 0) goto L_0x0038;
    L_0x0033:
        r0 = 1;
        r12.L = r0;	 Catch:{ Exception -> 0x0174 }
        if (r5 == 0) goto L_0x06ff;
    L_0x0038:
        r0 = Y;	 Catch:{ Exception -> 0x0176 }
        r1 = 52;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0176 }
        r1 = 0;
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x0176 }
        if (r0 == 0) goto L_0x004a;
    L_0x0045:
        r0 = 1;
        r12.F = r0;	 Catch:{ Exception -> 0x0178 }
        if (r5 == 0) goto L_0x06ff;
    L_0x004a:
        r0 = Y;	 Catch:{ Exception -> 0x017a }
        r1 = 51;
        r0 = r0[r1];	 Catch:{ Exception -> 0x017a }
        r1 = 0;
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x017a }
        if (r0 == 0) goto L_0x0066;
    L_0x0057:
        r0 = r12.getSupportActionBar();	 Catch:{ Exception -> 0x017c }
        r1 = 2131624144; // 0x7f0e00d0 float:1.887546E38 double:1.0531622594E-314;
        r0.setTitle(r1);	 Catch:{ Exception -> 0x017c }
        r0 = 1;
        r12.r = r0;	 Catch:{ Exception -> 0x017c }
        if (r5 == 0) goto L_0x06ff;
    L_0x0066:
        r0 = Y;	 Catch:{ Exception -> 0x017e }
        r1 = 76;
        r0 = r0[r1];	 Catch:{ Exception -> 0x017e }
        r1 = 0;
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x017e }
        if (r0 == 0) goto L_0x00a6;
    L_0x0073:
        r12.z = r10;
        r12.N = r4;
        r0 = Y;
        r1 = 79;
        r0 = r0[r1];
        r0 = r6.getStringExtra(r0);
        if (r0 == 0) goto L_0x00a4;
    L_0x0083:
        r1 = r0.length();	 Catch:{ Exception -> 0x0180 }
        if (r1 <= r10) goto L_0x00a4;
    L_0x0089:
        r1 = ",";
        r1 = r0.split(r1);
        r3 = r1.length;
        r0 = r4;
    L_0x0091:
        if (r0 >= r3) goto L_0x00a4;
    L_0x0093:
        r7 = r1[r0];
        r8 = r7.length();	 Catch:{ Exception -> 0x0182 }
        if (r8 <= 0) goto L_0x00a0;
    L_0x009b:
        r8 = r12.n;	 Catch:{ Exception -> 0x0182 }
        r8.add(r7);	 Catch:{ Exception -> 0x0182 }
    L_0x00a0:
        r0 = r0 + 1;
        if (r5 == 0) goto L_0x0091;
    L_0x00a4:
        if (r5 == 0) goto L_0x06ff;
    L_0x00a6:
        r0 = Y;	 Catch:{ Exception -> 0x0184 }
        r1 = 61;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0184 }
        r0 = r6.getStringExtra(r0);	 Catch:{ Exception -> 0x0184 }
        r12.s = r0;	 Catch:{ Exception -> 0x0184 }
        if (r0 == 0) goto L_0x00c8;
    L_0x00b4:
        r0 = 1;
        r12.z = r0;	 Catch:{ Exception -> 0x0186 }
        r0 = 1;
        r12.N = r0;	 Catch:{ Exception -> 0x0186 }
        r0 = r12.s;	 Catch:{ Exception -> 0x0186 }
        r0 = com.whatsapp.bd.i(r0);	 Catch:{ Exception -> 0x0186 }
        r0 = r0.j();	 Catch:{ Exception -> 0x0186 }
        r12.n = r0;	 Catch:{ Exception -> 0x0186 }
        if (r5 == 0) goto L_0x06ff;
    L_0x00c8:
        r0 = Y;	 Catch:{ Exception -> 0x0188 }
        r1 = 37;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0188 }
        r1 = 0;
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x0188 }
        if (r0 == 0) goto L_0x00e4;
    L_0x00d5:
        r0 = r12.getSupportActionBar();	 Catch:{ Exception -> 0x018a }
        r1 = 2131624143; // 0x7f0e00cf float:1.8875457E38 double:1.053162259E-314;
        r0.setTitle(r1);	 Catch:{ Exception -> 0x018a }
        r0 = 1;
        r12.W = r0;	 Catch:{ Exception -> 0x018a }
        if (r5 == 0) goto L_0x06ff;
    L_0x00e4:
        r0 = Y;	 Catch:{ Exception -> 0x018c }
        r1 = 59;
        r0 = r0[r1];	 Catch:{ Exception -> 0x018c }
        r1 = 0;
        r0 = r6.getBooleanExtra(r0, r1);	 Catch:{ Exception -> 0x018c }
        if (r0 == 0) goto L_0x0122;
    L_0x00f1:
        r12.H = r10;
        r0 = Y;
        r1 = 54;
        r0 = r0[r1];
        r0 = r6.getStringExtra(r0);
        if (r0 == 0) goto L_0x0120;
    L_0x00ff:
        r1 = r0.length();	 Catch:{ Exception -> 0x018e }
        if (r1 <= r10) goto L_0x0120;
    L_0x0105:
        r1 = ",";
        r1 = r0.split(r1);
        r3 = r1.length;
        r0 = r4;
    L_0x010d:
        if (r0 >= r3) goto L_0x0120;
    L_0x010f:
        r7 = r1[r0];
        r8 = r7.length();	 Catch:{ Exception -> 0x0190 }
        if (r8 <= 0) goto L_0x011c;
    L_0x0117:
        r8 = r12.n;	 Catch:{ Exception -> 0x0190 }
        r8.add(r7);	 Catch:{ Exception -> 0x0190 }
    L_0x011c:
        r0 = r0 + 1;
        if (r5 == 0) goto L_0x010d;
    L_0x0120:
        if (r5 == 0) goto L_0x06ff;
    L_0x0122:
        r0 = Y;	 Catch:{ Exception -> 0x0192 }
        r1 = 66;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0192 }
        r1 = r6.getScheme();	 Catch:{ Exception -> 0x0192 }
        r0 = r0.equals(r1);	 Catch:{ Exception -> 0x0192 }
        if (r0 == 0) goto L_0x01b5;
    L_0x0132:
        r0 = r6.getData();
        if (r0 == 0) goto L_0x01a2;
    L_0x0138:
        r1 = Y;	 Catch:{ Exception -> 0x0194 }
        r3 = 39;
        r1 = r1[r3];	 Catch:{ Exception -> 0x0194 }
        r3 = r0.getHost();	 Catch:{ Exception -> 0x0194 }
        r1 = r1.equals(r3);	 Catch:{ Exception -> 0x0194 }
        if (r1 == 0) goto L_0x01a2;
    L_0x0148:
        r1 = 0;
        r12.x = r1;	 Catch:{ Exception -> 0x0196 }
        r1 = Y;	 Catch:{ Exception -> 0x0196 }
        r3 = 40;
        r1 = r1[r3];	 Catch:{ Exception -> 0x0196 }
        r0 = r0.getQueryParameter(r1);	 Catch:{ Exception -> 0x0196 }
        r12.l = r0;	 Catch:{ Exception -> 0x0196 }
        r0 = r12.l;	 Catch:{ Exception -> 0x0196 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x0196 }
        if (r0 == 0) goto L_0x019a;
    L_0x015f:
        r0 = r12.getBaseContext();	 Catch:{ Exception -> 0x0198 }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ Exception -> 0x0198 }
        r12.finish();	 Catch:{ Exception -> 0x0198 }
    L_0x016d:
        return;
    L_0x016e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0170 }
    L_0x0170:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0172 }
    L_0x0172:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0174 }
    L_0x0174:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0176 }
    L_0x0176:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0178 }
    L_0x0178:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x017a }
    L_0x017a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x017c }
    L_0x017c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x017e }
    L_0x017e:
        r0 = move-exception;
        throw r0;
    L_0x0180:
        r0 = move-exception;
        throw r0;
    L_0x0182:
        r0 = move-exception;
        throw r0;
    L_0x0184:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0186 }
    L_0x0186:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0188 }
    L_0x0188:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x018a }
    L_0x018a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x018c }
    L_0x018c:
        r0 = move-exception;
        throw r0;
    L_0x018e:
        r0 = move-exception;
        throw r0;
    L_0x0190:
        r0 = move-exception;
        throw r0;
    L_0x0192:
        r0 = move-exception;
        throw r0;
    L_0x0194:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0196 }
    L_0x0196:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0198 }
    L_0x0198:
        r0 = move-exception;
        throw r0;
    L_0x019a:
        r0 = 0;
        r12.N = r0;	 Catch:{ Exception -> 0x01b1 }
        r0 = 1;
        r12.G = r0;	 Catch:{ Exception -> 0x01b1 }
        if (r5 == 0) goto L_0x01b3;
    L_0x01a2:
        r0 = r12.getBaseContext();	 Catch:{ Exception -> 0x01b1 }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ Exception -> 0x01b1 }
        r12.finish();	 Catch:{ Exception -> 0x01b1 }
        goto L_0x016d;
    L_0x01b1:
        r0 = move-exception;
        throw r0;
    L_0x01b3:
        if (r5 == 0) goto L_0x06ff;
    L_0x01b5:
        r0 = r6.getExtras();	 Catch:{ Exception -> 0x0222 }
        if (r0 == 0) goto L_0x06ff;
    L_0x01bb:
        r0 = r12.w;	 Catch:{ Exception -> 0x0224 }
        if (r0 != 0) goto L_0x06ff;
    L_0x01bf:
        r12.N = r10;
        r12.G = r10;
        r0 = r12.getIntent();
        r0 = r0.getType();
        if (r0 != 0) goto L_0x022c;
    L_0x01cd:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0226 }
        r0.<init>();	 Catch:{ Exception -> 0x0226 }
        r1 = Y;	 Catch:{ Exception -> 0x0226 }
        r3 = 80;
        r1 = r1[r3];	 Catch:{ Exception -> 0x0226 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0226 }
        r1 = r6.toString();	 Catch:{ Exception -> 0x0226 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0226 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0226 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0226 }
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x0226 }
        r1 = Y;	 Catch:{ Exception -> 0x0226 }
        r3 = 65;
        r1 = r1[r3];	 Catch:{ Exception -> 0x0226 }
        r0 = r0.hasExtra(r1);	 Catch:{ Exception -> 0x0226 }
        if (r0 != 0) goto L_0x020b;
    L_0x01fb:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x0228 }
        r1 = Y;	 Catch:{ Exception -> 0x0228 }
        r3 = 67;
        r1 = r1[r3];	 Catch:{ Exception -> 0x0228 }
        r0 = r0.hasExtra(r1);	 Catch:{ Exception -> 0x0228 }
        if (r0 == 0) goto L_0x0210;
    L_0x020b:
        r0 = 0;
        r12.x = r0;	 Catch:{ Exception -> 0x022a }
        if (r5 == 0) goto L_0x0237;
    L_0x0210:
        r0 = r12.getBaseContext();	 Catch:{ Exception -> 0x0220 }
        r1 = 2131624909; // 0x7f0e03cd float:1.8877011E38 double:1.0531626374E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ Exception -> 0x0220 }
        r12.finish();	 Catch:{ Exception -> 0x0220 }
        goto L_0x016d;
    L_0x0220:
        r0 = move-exception;
        throw r0;
    L_0x0222:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0224 }
    L_0x0224:
        r0 = move-exception;
        throw r0;
    L_0x0226:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0228 }
    L_0x0228:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x022a }
    L_0x022a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0220 }
    L_0x022c:
        r0 = r12.getIntent();
        r0 = r0.getType();
        r12.h(r0);
    L_0x0237:
        r0 = r12.x;
        if (r0 == 0) goto L_0x0293;
    L_0x023b:
        r0 = com.whatsapp.App.w;	 Catch:{ Exception -> 0x0292 }
        r1 = 4;
        r3 = 1;
        r0 = r0.getRecentTasks(r1, r3);	 Catch:{ Exception -> 0x0292 }
        r1 = r0.iterator();	 Catch:{ Exception -> 0x0292 }
    L_0x0247:
        r0 = r1.hasNext();	 Catch:{ Exception -> 0x0292 }
        if (r0 == 0) goto L_0x0293;
    L_0x024d:
        r0 = r1.next();	 Catch:{ Exception -> 0x0292 }
        r0 = (android.app.ActivityManager.RecentTaskInfo) r0;	 Catch:{ Exception -> 0x0292 }
        r0 = r0.baseIntent;	 Catch:{ Exception -> 0x0292 }
        if (r0 == 0) goto L_0x03a4;
    L_0x0257:
        r0 = r0.getComponent();	 Catch:{ Exception -> 0x0292 }
        if (r0 == 0) goto L_0x03a4;
    L_0x025d:
        r0 = r0.getPackageName();	 Catch:{ Exception -> 0x0292 }
        r3 = Y;	 Catch:{ Exception -> 0x03a2 }
        r7 = 48;
        r3 = r3[r7];	 Catch:{ Exception -> 0x03a2 }
        r3 = r3.equals(r0);	 Catch:{ Exception -> 0x03a2 }
        if (r3 != 0) goto L_0x0279;
    L_0x026d:
        r3 = Y;	 Catch:{ Exception -> 0x03a2 }
        r7 = 82;
        r3 = r3[r7];	 Catch:{ Exception -> 0x03a2 }
        r0 = r3.equals(r0);	 Catch:{ Exception -> 0x03a2 }
        if (r0 == 0) goto L_0x03a4;
    L_0x0279:
        r0 = Y;	 Catch:{ Exception -> 0x0292 }
        r1 = 83;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0292 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x0292 }
        r0 = r12.getBaseContext();	 Catch:{ Exception -> 0x0292 }
        r1 = 2131624064; // 0x7f0e0080 float:1.8875297E38 double:1.05316222E-314;
        r3 = 0;
        com.whatsapp.App.b(r0, r1, r3);	 Catch:{ Exception -> 0x0292 }
        r12.finish();	 Catch:{ Exception -> 0x0292 }
        goto L_0x016d;
    L_0x0292:
        r0 = move-exception;
    L_0x0293:
        r0 = r12.x;
        if (r0 != 0) goto L_0x0301;
    L_0x0297:
        r0 = r12.getIntent();
        r1 = Y;
        r3 = 55;
        r1 = r1[r3];
        r0 = r0.getStringExtra(r1);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x03a8 }
        if (r1 != 0) goto L_0x02ca;
    L_0x02ab:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x03a8 }
        r1.<init>();	 Catch:{ Exception -> 0x03a8 }
        r3 = r12.l;	 Catch:{ Exception -> 0x03a8 }
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x03a8 }
        r0 = r1.append(r0);	 Catch:{ Exception -> 0x03a8 }
        r1 = Y;	 Catch:{ Exception -> 0x03a8 }
        r3 = 73;
        r1 = r1[r3];	 Catch:{ Exception -> 0x03a8 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x03a8 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x03a8 }
        r12.l = r0;	 Catch:{ Exception -> 0x03a8 }
    L_0x02ca:
        r0 = r12.getIntent();
        r1 = Y;
        r3 = 57;
        r1 = r1[r3];
        r0 = r0.getStringExtra(r1);
        if (r0 == 0) goto L_0x02ff;
    L_0x02da:
        r1 = r0.getBytes();
        r3 = r1.length;
        r7 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r3 <= r7) goto L_0x02ea;
    L_0x02e3:
        r0 = new java.lang.String;
        r3 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0.<init>(r1, r4, r3);
    L_0x02ea:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r12.l;
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        r12.l = r0;
    L_0x02ff:
        if (r5 == 0) goto L_0x06ff;
    L_0x0301:
        r0 = r12.x;	 Catch:{ Exception -> 0x03aa }
        if (r0 != r9) goto L_0x04d0;
    L_0x0305:
        r0 = Y;
        r1 = 63;
        r0 = r0[r1];
        r0 = r6.getParcelableExtra(r0);
        r0 = r0.toString();
        r3 = android.net.Uri.parse(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = Y;
        r7 = 74;
        r1 = r1[r7];
        r0 = r0.append(r1);
        r1 = r3.toString();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = -1;
        r1 = r3.getScheme();	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r7 = Y;	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r8 = 62;
        r7 = r7[r8];	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r1 = r1.equals(r7);	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        if (r1 == 0) goto L_0x03cc;
    L_0x0346:
        r7 = new java.io.File;	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r1 = r3.getSchemeSpecificPart();	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r3 = 2;
        r1 = r1.substring(r3);	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r7.<init>(r1);	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r1 = r7.exists();	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        if (r1 == 0) goto L_0x03ac;
    L_0x035a:
        r1 = new java.io.FileInputStream;	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r0 = r7.getAbsolutePath();	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r1.<init>(r0);	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r8 = r7.length();	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r0 = (int) r8;
    L_0x0368:
        r3 = r1;
        r1 = r2;
    L_0x036a:
        if (r0 > 0) goto L_0x0426;
    L_0x036c:
        r0 = r12.getBaseContext();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r3 = 2131624064; // 0x7f0e0080 float:1.8875297E38 double:1.05316222E-314;
        r7 = 0;
        com.whatsapp.App.b(r0, r3, r7);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r12.finish();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        if (r1 == 0) goto L_0x016d;
    L_0x037c:
        r1.close();	 Catch:{ IOException -> 0x0381 }
        goto L_0x016d;
    L_0x0381:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = Y;
        r3 = 36;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x016d;
    L_0x03a2:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0292 }
    L_0x03a4:
        if (r5 == 0) goto L_0x0247;
    L_0x03a6:
        goto L_0x0293;
    L_0x03a8:
        r0 = move-exception;
        throw r0;
    L_0x03aa:
        r0 = move-exception;
        throw r0;
    L_0x03ac:
        r1 = new java.lang.StringBuilder;	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r1.<init>();	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r3 = Y;	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r8 = 69;
        r3 = r3[r8];	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r1 = r1.append(r3);	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r3 = r7.getPath();	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r1 = r1.append(r3);	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r1 = r1.toString();	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r1 = r2;
        goto L_0x0368;
    L_0x03cc:
        r0 = com.whatsapp.App.e;	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        r1 = "r";
        r1 = r0.openAssetFileDescriptor(r3, r1);	 Catch:{ g -> 0x07cc, IOException -> 0x05c7, all -> 0x05f4 }
        if (r1 != 0) goto L_0x041b;
    L_0x03d6:
        r0 = new java.lang.StringBuilder;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0.<init>();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r7 = Y;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r8 = 46;
        r7 = r7[r8];	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.append(r7);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.append(r3);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.toString();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        com.whatsapp.App.c(r12, r0);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r12.finish();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        if (r1 == 0) goto L_0x016d;
    L_0x03f5:
        r1.close();	 Catch:{ IOException -> 0x03fa }
        goto L_0x016d;
    L_0x03fa:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = Y;
        r3 = 44;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x016d;
    L_0x041b:
        r3 = r1.createInputStream();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r8 = r1.getDeclaredLength();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = (int) r8;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        goto L_0x036a;
    L_0x0426:
        r0 = new byte[r0];	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r3 = r3.read(r0);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        if (r3 <= 0) goto L_0x04c9;
    L_0x042e:
        r3 = new java.lang.String;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r3.<init>(r0);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = new java.lang.StringBuilder;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0.<init>();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r7 = Y;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r8 = 42;
        r7 = r7[r8];	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.append(r7);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.append(r3);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.toString();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = new a;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0.<init>();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r7 = new n;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r7.<init>();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r8 = Y;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r9 = 38;
        r8 = r8[r9];	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.a(r3, r8, r7);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        if (r0 != 0) goto L_0x04b0;
    L_0x0463:
        r0 = new java.lang.StringBuilder;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0.<init>();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r7 = Y;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r8 = 68;
        r7 = r7[r8];	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.append(r7);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.append(r3);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.toString();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r12.getBaseContext();	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r3 = 2131625046; // 0x7f0e0456 float:1.8877289E38 double:1.053162705E-314;
        r7 = 0;
        com.whatsapp.App.b(r0, r3, r7);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        if (r1 == 0) goto L_0x016d;
    L_0x048a:
        r1.close();	 Catch:{ IOException -> 0x048f }
        goto L_0x016d;
    L_0x048f:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = Y;
        r3 = 64;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x016d;
    L_0x04b0:
        r0 = 4;
        r12.x = r0;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r12.D = r3;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r7.e;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r7 = 0;
        r0 = r0.get(r7);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = (defpackage.q) r0;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r7 = 0;
        r0 = defpackage.o.a(r0, r7, r3);	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.e;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r0 = r0.d;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
        r12.m = r0;	 Catch:{ g -> 0x07d0, IOException -> 0x07c9 }
    L_0x04c9:
        if (r1 == 0) goto L_0x04ce;
    L_0x04cb:
        r1.close();	 Catch:{ IOException -> 0x05a6, g -> 0x05a4 }
    L_0x04ce:
        if (r5 == 0) goto L_0x06ff;
    L_0x04d0:
        r0 = Y;	 Catch:{ Exception -> 0x061e }
        r1 = 71;
        r0 = r0[r1];	 Catch:{ Exception -> 0x061e }
        r0 = r6.getParcelableArrayListExtra(r0);	 Catch:{ Exception -> 0x061e }
        r12.o = r0;	 Catch:{ Exception -> 0x061e }
        r0 = r12.o;	 Catch:{ Exception -> 0x061e }
        if (r0 != 0) goto L_0x051a;
    L_0x04e0:
        r0 = r6.getExtras();
        r1 = Y;
        r3 = 49;
        r1 = r1[r3];
        r0 = r0.getParcelable(r1);
        r0 = (android.net.Uri) r0;
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0620 }
        r1.<init>();	 Catch:{ Exception -> 0x0620 }
        r3 = Y;	 Catch:{ Exception -> 0x0620 }
        r7 = 58;
        r3 = r3[r7];	 Catch:{ Exception -> 0x0620 }
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x0620 }
        r1 = r1.append(r0);	 Catch:{ Exception -> 0x0620 }
        r1 = r1.toString();	 Catch:{ Exception -> 0x0620 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x0620 }
        if (r0 == 0) goto L_0x0518;
    L_0x050c:
        r1 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0620 }
        r1.<init>();	 Catch:{ Exception -> 0x0620 }
        r12.o = r1;	 Catch:{ Exception -> 0x0620 }
        r1 = r12.o;	 Catch:{ Exception -> 0x0620 }
        r1.add(r0);	 Catch:{ Exception -> 0x0620 }
    L_0x0518:
        if (r5 == 0) goto L_0x0568;
    L_0x051a:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = Y;
        r3 = 72;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r12.o;
        r1 = r1.size();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r12.o;
        r1 = r0.iterator();
    L_0x0540:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0568;
    L_0x0546:
        r0 = r1.next();
        r0 = (android.net.Uri) r0;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r7 = Y;
        r8 = 43;
        r7 = r7[r8];
        r3 = r3.append(r7);
        r0 = r3.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r5 == 0) goto L_0x0540;
    L_0x0568:
        r0 = r12.o;	 Catch:{ Exception -> 0x0622 }
        if (r0 == 0) goto L_0x0574;
    L_0x056c:
        r0 = r12.o;	 Catch:{ Exception -> 0x0622 }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x0622 }
        if (r0 == 0) goto L_0x0624;
    L_0x0574:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x05a2 }
        r0.<init>();	 Catch:{ Exception -> 0x05a2 }
        r1 = Y;	 Catch:{ Exception -> 0x05a2 }
        r2 = 60;
        r1 = r1[r2];	 Catch:{ Exception -> 0x05a2 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x05a2 }
        r1 = r6.toString();	 Catch:{ Exception -> 0x05a2 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x05a2 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x05a2 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x05a2 }
        r0 = r12.getBaseContext();	 Catch:{ Exception -> 0x05a2 }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ Exception -> 0x05a2 }
        r12.finish();	 Catch:{ Exception -> 0x05a2 }
        goto L_0x016d;
    L_0x05a2:
        r0 = move-exception;
        throw r0;
    L_0x05a4:
        r0 = move-exception;
        throw r0;
    L_0x05a6:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = Y;
        r7 = 53;
        r3 = r3[r7];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x04ce;
    L_0x05c7:
        r0 = move-exception;
        r1 = r2;
    L_0x05c9:
        com.whatsapp.util.Log.b(r0);	 Catch:{ all -> 0x07c6 }
        if (r1 == 0) goto L_0x04ce;
    L_0x05ce:
        r1.close();	 Catch:{ IOException -> 0x05d3 }
        goto L_0x04ce;
    L_0x05d3:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = Y;
        r7 = 56;
        r3 = r3[r7];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x04ce;
    L_0x05f4:
        r0 = move-exception;
        r1 = r2;
    L_0x05f6:
        if (r1 == 0) goto L_0x05fb;
    L_0x05f8:
        r1.close();	 Catch:{ IOException -> 0x05fe, g -> 0x05fc }
    L_0x05fb:
        throw r0;
    L_0x05fc:
        r0 = move-exception;
        throw r0;
    L_0x05fe:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = Y;
        r4 = 78;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x05fb;
    L_0x061e:
        r0 = move-exception;
        throw r0;
    L_0x0620:
        r0 = move-exception;
        throw r0;
    L_0x0622:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x05a2 }
    L_0x0624:
        r0 = r12.o;	 Catch:{ Exception -> 0x063e }
        r0 = r0.size();	 Catch:{ Exception -> 0x063e }
        r1 = 10;
        if (r0 <= r1) goto L_0x0640;
    L_0x062e:
        r0 = r12.getBaseContext();	 Catch:{ Exception -> 0x063e }
        r1 = 2131624910; // 0x7f0e03ce float:1.8877013E38 double:1.053162638E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ Exception -> 0x063e }
        r12.finish();	 Catch:{ Exception -> 0x063e }
        goto L_0x016d;
    L_0x063e:
        r0 = move-exception;
        throw r0;
    L_0x0640:
        r0 = r12.o;
        r1 = r0.iterator();
    L_0x0646:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0697;
    L_0x064c:
        r0 = r1.next();
        r0 = (android.net.Uri) r0;
        r3 = r0.toString();	 Catch:{ Exception -> 0x0693 }
        r6 = Y;	 Catch:{ Exception -> 0x0693 }
        r7 = 77;
        r6 = r6[r7];	 Catch:{ Exception -> 0x0693 }
        r3 = r3.contains(r6);	 Catch:{ Exception -> 0x0693 }
        if (r3 == 0) goto L_0x0695;
    L_0x0662:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0693 }
        r1.<init>();	 Catch:{ Exception -> 0x0693 }
        r2 = Y;	 Catch:{ Exception -> 0x0693 }
        r3 = 45;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0693 }
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x0693 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0693 }
        r0 = r1.append(r0);	 Catch:{ Exception -> 0x0693 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0693 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ Exception -> 0x0693 }
        r0 = r12.getBaseContext();	 Catch:{ Exception -> 0x0693 }
        r1 = 2131624909; // 0x7f0e03cd float:1.8877011E38 double:1.0531626374E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ Exception -> 0x0693 }
        r0 = 0;
        r12.o = r0;	 Catch:{ Exception -> 0x0693 }
        r12.finish();	 Catch:{ Exception -> 0x0693 }
        goto L_0x016d;
    L_0x0693:
        r0 = move-exception;
        throw r0;
    L_0x0695:
        if (r5 == 0) goto L_0x0646;
    L_0x0697:
        r0 = r12.o;
        r1 = r0.iterator();
    L_0x069d:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x06b5;
    L_0x06a3:
        r0 = r1.next();
        r0 = (android.net.Uri) r0;
        r3 = Y;	 Catch:{ SecurityException -> 0x07a5 }
        r6 = 47;
        r3 = r3[r6];	 Catch:{ SecurityException -> 0x07a5 }
        r6 = 1;
        r12.grantUriPermission(r3, r0, r6);	 Catch:{ SecurityException -> 0x07a5 }
    L_0x06b3:
        if (r5 == 0) goto L_0x069d;
    L_0x06b5:
        r0 = r12.getIntent();
        r1 = Y;
        r3 = 41;
        r1 = r1[r3];
        r1 = r0.getStringExtra(r1);
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x06ff;
    L_0x06c9:
        r3 = new java.util.ArrayList;
        r0 = r12.o;
        r0 = r0.size();
        r3.<init>(r0);
        r0 = r12.o;
        r6 = r0.iterator();
    L_0x06da:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x06fd;
    L_0x06e0:
        r0 = r6.next();
        r0 = (android.net.Uri) r0;
        r0 = r0.buildUpon();
        r7 = Y;
        r8 = 50;
        r7 = r7[r8];
        r0 = r0.appendQueryParameter(r7, r1);
        r0 = r0.build();
        r3.add(r0);
        if (r5 == 0) goto L_0x06da;
    L_0x06fd:
        r12.o = r3;
    L_0x06ff:
        r0 = r12.t;	 Catch:{ Exception -> 0x07c2 }
        if (r0 != 0) goto L_0x070b;
    L_0x0703:
        r0 = r12.F;	 Catch:{ Exception -> 0x07c4 }
        if (r0 != 0) goto L_0x070b;
    L_0x0707:
        r0 = r12.G;	 Catch:{ Exception -> 0x07c4 }
        if (r0 == 0) goto L_0x0757;
    L_0x070b:
        r0 = r12.getSupportActionBar();
        r0.setNavigationMode(r11);
        r1 = r0.newTab();
        r3 = 2130839056; // 0x7f020610 float:1.7283112E38 double:1.0527743744E-314;
        r1 = r1.setIcon(r3);
        r3 = new com.whatsapp.wl;
        r3.<init>(r12, r4);
        r1 = r1.setTabListener(r3);
        r0.addTab(r1);
        r1 = r0.newTab();
        r3 = 2130838772; // 0x7f0204f4 float:1.7282536E38 double:1.052774234E-314;
        r1 = r1.setIcon(r3);
        r3 = new com.whatsapp.wl;
        r3.<init>(r12, r10);
        r1 = r1.setTabListener(r3);
        r0.addTab(r1);
        r1 = r0.newTab();
        r3 = 2130839005; // 0x7f0205dd float:1.7283008E38 double:1.052774349E-314;
        r1 = r1.setIcon(r3);
        r3 = new com.whatsapp.wl;
        r3.<init>(r12, r11);
        r1 = r1.setTabListener(r3);
        r0.addTab(r1);
    L_0x0757:
        r12.j();
        r1 = new com.whatsapp.iv;
        r1.<init>(r12, r2);
        r0 = 2131427629; // 0x7f0b012d float:1.847688E38 double:1.053065168E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.support.v4.view.ViewPager) r0;
        r12.P = r0;
        r0 = r12.P;
        r2 = 3;
        r0.setOffscreenPageLimit(r2);
        r0 = r12.P;
        r0.setAdapter(r1);
        r0 = r12.P;
        r1 = new com.whatsapp.r9;
        r1.<init>(r12);
        r0.setOnPageChangeListener(r1);
        r0 = new com.whatsapp.ts;
        r1 = r12.u;
        r0.<init>(r12, r12, r1);
        r12.B = r0;
        r0 = new com.whatsapp.tk;
        r1 = r12.T;
        r0.<init>(r12, r12, r1);
        r12.K = r0;
        r0 = new com.whatsapp.tk;
        r1 = r12.J;
        r0.<init>(r12, r12, r1);
        r12.p = r0;
        r0 = com.whatsapp.App.n(r12);
        r12.k = r0;
        com.whatsapp.App.b(r12);
        goto L_0x016d;
    L_0x07a5:
        r0 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r6 = Y;
        r7 = 75;
        r6 = r6[r7];
        r3 = r3.append(r6);
        r0 = r3.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        goto L_0x06b3;
    L_0x07c2:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x07c4 }
    L_0x07c4:
        r0 = move-exception;
        throw r0;
    L_0x07c6:
        r0 = move-exception;
        goto L_0x05f6;
    L_0x07c9:
        r0 = move-exception;
        goto L_0x05c9;
    L_0x07cc:
        r0 = move-exception;
        r1 = r2;
        goto L_0x05c9;
    L_0x07d0:
        r0 = move-exception;
        goto L_0x05c9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.d():void");
    }

    public void onDestroy() {
        Log.i(Y[2]);
        super.onDestroy();
        App.a((anq) this);
        this.v.a();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        String string = bundle.getString(Y[29]);
        if (string != null) {
            try {
                this.V = App.P.a(string);
            } catch (SecurityException e) {
                throw e;
            }
        }
        this.I = (Intent) bundle.getParcelable(Y[30]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(java.lang.String r7) {
        /*
        r6_this = this;
        r1 = com.whatsapp.App.az;
        if (r7 == 0) goto L_0x0008;
    L_0x0004:
        r7 = r7.toLowerCase();
    L_0x0008:
        r2 = r6.S;
        monitor-enter(r2);
        r0 = r6.u;	 Catch:{ all -> 0x0168 }
        r0.clear();	 Catch:{ all -> 0x0168 }
        r0 = r6.T;	 Catch:{ all -> 0x0168 }
        r0.clear();	 Catch:{ all -> 0x0168 }
        r0 = r6.J;	 Catch:{ all -> 0x0168 }
        r0.clear();	 Catch:{ all -> 0x0168 }
        r0 = r6.z;	 Catch:{ all -> 0x0168 }
        if (r0 != 0) goto L_0x0022;
    L_0x001e:
        r0 = r6.H;	 Catch:{ all -> 0x0168 }
        if (r0 == 0) goto L_0x0057;
    L_0x0022:
        r0 = r6.E;	 Catch:{ all -> 0x0168 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0168 }
    L_0x0028:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0168 }
        if (r0 == 0) goto L_0x0055;
    L_0x002e:
        r0 = r3.next();	 Catch:{ all -> 0x0168 }
        r0 = (com.whatsapp.m8) r0;	 Catch:{ all -> 0x0168 }
        r4 = r0.h;	 Catch:{ SecurityException -> 0x0160 }
        if (r4 == 0) goto L_0x0053;
    L_0x0038:
        r4 = r0.w();	 Catch:{ SecurityException -> 0x0160 }
        if (r4 != 0) goto L_0x0053;
    L_0x003e:
        r4 = r0.c(r7);	 Catch:{ SecurityException -> 0x0162 }
        if (r4 == 0) goto L_0x0053;
    L_0x0044:
        r4 = r6.n;	 Catch:{ SecurityException -> 0x0164 }
        r5 = r0.e;	 Catch:{ SecurityException -> 0x0164 }
        r4 = r4.contains(r5);	 Catch:{ SecurityException -> 0x0164 }
        if (r4 != 0) goto L_0x0053;
    L_0x004e:
        r4 = r6.T;	 Catch:{ SecurityException -> 0x0166 }
        r4.add(r0);	 Catch:{ SecurityException -> 0x0166 }
    L_0x0053:
        if (r1 == 0) goto L_0x0028;
    L_0x0055:
        if (r1 == 0) goto L_0x00ec;
    L_0x0057:
        r0 = r6.W;	 Catch:{ SecurityException -> 0x016b }
        if (r0 == 0) goto L_0x0086;
    L_0x005b:
        r0 = r6.E;	 Catch:{ all -> 0x0168 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0168 }
    L_0x0061:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0168 }
        if (r0 == 0) goto L_0x0084;
    L_0x0067:
        r0 = r3.next();	 Catch:{ all -> 0x0168 }
        r0 = (com.whatsapp.m8) r0;	 Catch:{ all -> 0x0168 }
        r4 = com.whatsapp.App.aJ;	 Catch:{ SecurityException -> 0x016d }
        r5 = r0.e;	 Catch:{ SecurityException -> 0x016d }
        r4 = r4.z(r5);	 Catch:{ SecurityException -> 0x016d }
        if (r4 == 0) goto L_0x0082;
    L_0x0077:
        r4 = r0.c(r7);	 Catch:{ SecurityException -> 0x016d }
        if (r4 == 0) goto L_0x0082;
    L_0x007d:
        r4 = r6.u;	 Catch:{ SecurityException -> 0x016f }
        r4.add(r0);	 Catch:{ SecurityException -> 0x016f }
    L_0x0082:
        if (r1 == 0) goto L_0x0061;
    L_0x0084:
        if (r1 == 0) goto L_0x00ec;
    L_0x0086:
        r0 = r6.E;	 Catch:{ all -> 0x0168 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0168 }
    L_0x008c:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0168 }
        if (r0 == 0) goto L_0x00ec;
    L_0x0092:
        r0 = r3.next();	 Catch:{ all -> 0x0168 }
        r0 = (com.whatsapp.m8) r0;	 Catch:{ all -> 0x0168 }
        r4 = r0.c(r7);	 Catch:{ SecurityException -> 0x0171 }
        if (r4 == 0) goto L_0x00ea;
    L_0x009e:
        r4 = r0.w();	 Catch:{ SecurityException -> 0x0171 }
        if (r4 == 0) goto L_0x00b7;
    L_0x00a4:
        r4 = r0.b();	 Catch:{ SecurityException -> 0x0173 }
        if (r4 != 0) goto L_0x00d0;
    L_0x00aa:
        r4 = r0.c(r7);	 Catch:{ SecurityException -> 0x0175 }
        if (r4 == 0) goto L_0x00d0;
    L_0x00b0:
        r4 = r6.u;	 Catch:{ SecurityException -> 0x0177 }
        r4.add(r0);	 Catch:{ SecurityException -> 0x0177 }
        if (r1 == 0) goto L_0x00d0;
    L_0x00b7:
        r4 = com.whatsapp.App.aJ;	 Catch:{ SecurityException -> 0x0179 }
        r5 = r0.e;	 Catch:{ SecurityException -> 0x0179 }
        r4 = r4.z(r5);	 Catch:{ SecurityException -> 0x0179 }
        if (r4 == 0) goto L_0x00d0;
    L_0x00c1:
        r4 = com.whatsapp.App.aJ;	 Catch:{ SecurityException -> 0x017b }
        r5 = r0.e;	 Catch:{ SecurityException -> 0x017b }
        r4 = r4.q(r5);	 Catch:{ SecurityException -> 0x017b }
        if (r4 != 0) goto L_0x00d0;
    L_0x00cb:
        r4 = r6.u;	 Catch:{ SecurityException -> 0x017d }
        r4.add(r0);	 Catch:{ SecurityException -> 0x017d }
    L_0x00d0:
        r4 = r0.h;	 Catch:{ SecurityException -> 0x017f }
        if (r4 == 0) goto L_0x00d9;
    L_0x00d4:
        r4 = r6.T;	 Catch:{ SecurityException -> 0x017f }
        r4.add(r0);	 Catch:{ SecurityException -> 0x017f }
    L_0x00d9:
        r4 = r0.w();	 Catch:{ SecurityException -> 0x0181 }
        if (r4 == 0) goto L_0x00ea;
    L_0x00df:
        r4 = r0.c(r7);	 Catch:{ SecurityException -> 0x0181 }
        if (r4 == 0) goto L_0x00ea;
    L_0x00e5:
        r4 = r6.J;	 Catch:{ SecurityException -> 0x0183 }
        r4.add(r0);	 Catch:{ SecurityException -> 0x0183 }
    L_0x00ea:
        if (r1 == 0) goto L_0x008c;
    L_0x00ec:
        monitor-exit(r2);	 Catch:{ all -> 0x0168 }
        r0 = r6.u;
        r1 = new com.whatsapp.ss;
        r2 = r6.getApplicationContext();
        r1.<init>(r2);
        java.util.Collections.sort(r0, r1);
        r0 = r6.T;
        r1 = new com.whatsapp.kf;
        r2 = r6.getApplicationContext();
        r1.<init>(r2);
        java.util.Collections.sort(r0, r1);
        r0 = r6.J;
        r1 = new com.whatsapp.kf;
        r2 = r6.getApplicationContext();
        r1.<init>(r2);
        java.util.Collections.sort(r0, r1);
        r0 = r6.u;
        r0 = r0.size();
        if (r0 != 0) goto L_0x012f;
    L_0x011f:
        r0 = new com.whatsapp.m8;
        r1 = Y;
        r2 = 26;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = r6.u;
        r1.add(r0);
    L_0x012f:
        r0 = r6.T;
        r0 = r0.size();
        if (r0 != 0) goto L_0x0147;
    L_0x0137:
        r0 = new com.whatsapp.m8;
        r1 = Y;
        r2 = 27;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = r6.T;
        r1.add(r0);
    L_0x0147:
        r0 = r6.J;
        r0 = r0.size();
        if (r0 != 0) goto L_0x015f;
    L_0x014f:
        r0 = new com.whatsapp.m8;
        r1 = Y;
        r2 = 28;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = r6.J;
        r1.add(r0);
    L_0x015f:
        return;
    L_0x0160:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0162 }
    L_0x0162:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0164 }
    L_0x0164:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0166 }
    L_0x0166:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0168 }
    L_0x0168:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0168 }
        throw r0;
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0168 }
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0168 }
    L_0x0171:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0173 }
    L_0x0173:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0175 }
    L_0x0175:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0177 }
    L_0x0177:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0179 }
    L_0x0179:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x017b }
    L_0x017b:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x017d }
    L_0x017d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0168 }
    L_0x017f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0168 }
    L_0x0181:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0183 }
    L_0x0183:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0168 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.g(java.lang.String):void");
    }

    public boolean m() {
        try {
            if (this.y != null) {
                return false;
            }
            try {
                if (this.A == null) {
                    this.A = new akv(this);
                }
                o();
                this.y = startActionMode(this.A);
                return true;
            } catch (SecurityException e) {
                throw e;
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    static void a(ContactPicker contactPicker) {
        contactPicker.o();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.app.Dialog onCreateDialog(int r10) {
        /*
        r9_this = this;
        r8 = 2;
        r7 = 2131624632; // 0x7f0e02b8 float:1.887645E38 double:1.0531625005E-314;
        r6 = 2131624059; // 0x7f0e007b float:1.8875287E38 double:1.0531622174E-314;
        r5 = 0;
        r4 = 1;
        r1 = com.whatsapp.App.az;
        switch(r10) {
            case 0: goto L_0x0013;
            case 1: goto L_0x0067;
            case 2: goto L_0x013d;
            case 3: goto L_0x019f;
            case 4: goto L_0x01e6;
            case 107: goto L_0x0220;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = super.onCreateDialog(r10);
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = 2131624673; // 0x7f0e02e1 float:1.8876532E38 double:1.053162521E-314;
        r1 = new java.lang.Object[r8];
        r2 = r9.V;
        r2 = r2.a(r9);
        r1[r5] = r2;
        r2 = com.whatsapp.App.P;
        r3 = r9.s;
        r2 = r2.f(r3);
        r2 = r2.a(r9);
        r1[r4] = r2;
        r0 = r9.getString(r0, r1);
        r1 = new android.app.AlertDialog$Builder;
        r1.<init>(r9);
        r2 = r9.getBaseContext();
        r0 = com.whatsapp.util.a5.d(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r4);
        r1 = new com.whatsapp.af_;
        r1.<init>(r9);
        r0 = r0.setNegativeButton(r6, r1);
        r1 = new com.whatsapp.a_b;
        r1.<init>(r9);
        r0 = r0.setPositiveButton(r7, r1);
        r1 = new com.whatsapp.l1;
        r1.<init>(r9);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0012;
    L_0x0067:
        r0 = r9.V;	 Catch:{ SecurityException -> 0x0137 }
        r0 = r0.w();	 Catch:{ SecurityException -> 0x0137 }
        if (r0 == 0) goto L_0x00b9;
    L_0x006f:
        r0 = r9.o;	 Catch:{ SecurityException -> 0x0139 }
        if (r0 == 0) goto L_0x00a6;
    L_0x0073:
        r0 = r9.o;	 Catch:{ SecurityException -> 0x0139 }
        r0 = r0.size();	 Catch:{ SecurityException -> 0x0139 }
        if (r0 <= r4) goto L_0x00a6;
    L_0x007b:
        r0 = com.whatsapp.App.aX;
        r2 = 2131558414; // 0x7f0d000e float:1.8742143E38 double:1.0531297845E-314;
        r3 = r9.o;
        r3 = r3.size();
        r0 = r0.a(r2, r3);
        r2 = new java.lang.Object[r8];
        r3 = r9.o;
        r3 = r3.size();
        r3 = java.lang.Integer.valueOf(r3);
        r2[r5] = r3;
        r3 = r9.V;
        r3 = r3.a(r9);
        r2[r4] = r3;
        r0 = java.lang.String.format(r0, r2);
        if (r1 == 0) goto L_0x0101;
    L_0x00a6:
        r0 = 2131624364; // 0x7f0e01ac float:1.8875906E38 double:1.053162368E-314;
        r2 = new java.lang.Object[r4];
        r3 = r9.V;
        r3 = r3.a(r9);
        r2[r5] = r3;
        r0 = r9.getString(r0, r2);
        if (r1 == 0) goto L_0x0101;
    L_0x00b9:
        r0 = r9.o;	 Catch:{ SecurityException -> 0x013b }
        if (r0 == 0) goto L_0x00f0;
    L_0x00bd:
        r0 = r9.o;	 Catch:{ SecurityException -> 0x013b }
        r0 = r0.size();	 Catch:{ SecurityException -> 0x013b }
        if (r0 <= r4) goto L_0x00f0;
    L_0x00c5:
        r0 = com.whatsapp.App.aX;
        r2 = 2131558408; // 0x7f0d0008 float:1.874213E38 double:1.0531297815E-314;
        r3 = r9.o;
        r3 = r3.size();
        r0 = r0.a(r2, r3);
        r2 = new java.lang.Object[r8];
        r3 = r9.o;
        r3 = r3.size();
        r3 = java.lang.Integer.valueOf(r3);
        r2[r5] = r3;
        r3 = r9.V;
        r3 = r3.a(r9);
        r2[r4] = r3;
        r0 = java.lang.String.format(r0, r2);
        if (r1 == 0) goto L_0x0101;
    L_0x00f0:
        r0 = 2131624130; // 0x7f0e00c2 float:1.8875431E38 double:1.0531622525E-314;
        r1 = new java.lang.Object[r4];
        r2 = r9.V;
        r2 = r2.a(r9);
        r1[r5] = r2;
        r0 = r9.getString(r0, r1);
    L_0x0101:
        r1 = new android.app.AlertDialog$Builder;
        r1.<init>(r9);
        r2 = r9.getBaseContext();
        r0 = com.whatsapp.util.a5.d(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r4);
        r1 = new com.whatsapp.as5;
        r1.<init>(r9);
        r0 = r0.setNegativeButton(r6, r1);
        r1 = new com.whatsapp.lm;
        r1.<init>(r9);
        r0 = r0.setPositiveButton(r7, r1);
        r1 = new com.whatsapp.a50;
        r1.<init>(r9);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0012;
    L_0x0137:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0139 }
    L_0x0139:
        r0 = move-exception;
        throw r0;
    L_0x013b:
        r0 = move-exception;
        throw r0;
    L_0x013d:
        r0 = r9.V;
        r0 = r0.w();
        if (r0 == 0) goto L_0x0158;
    L_0x0145:
        r0 = 2131624362; // 0x7f0e01aa float:1.8875902E38 double:1.053162367E-314;
        r2 = new java.lang.Object[r4];
        r3 = r9.V;
        r3 = r3.a(r9);
        r2[r5] = r3;
        r0 = r9.getString(r0, r2);
        if (r1 == 0) goto L_0x0169;
    L_0x0158:
        r0 = 2131624129; // 0x7f0e00c1 float:1.887543E38 double:1.053162252E-314;
        r1 = new java.lang.Object[r4];
        r2 = r9.V;
        r2 = r2.a(r9);
        r1[r5] = r2;
        r0 = r9.getString(r0, r1);
    L_0x0169:
        r1 = new android.app.AlertDialog$Builder;
        r1.<init>(r9);
        r2 = r9.getBaseContext();
        r0 = com.whatsapp.util.a5.d(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r4);
        r1 = new com.whatsapp.za;
        r1.<init>(r9);
        r0 = r0.setNegativeButton(r6, r1);
        r1 = new com.whatsapp.amt;
        r1.<init>(r9);
        r0 = r0.setPositiveButton(r7, r1);
        r1 = new com.whatsapp.ze;
        r1.<init>(r9);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0012;
    L_0x019f:
        r0 = 2131624363; // 0x7f0e01ab float:1.8875904E38 double:1.0531623676E-314;
        r1 = new java.lang.Object[r4];
        r2 = r9.V;
        r2 = r2.a(r9);
        r1[r5] = r2;
        r0 = r9.getString(r0, r1);
        r1 = new android.app.AlertDialog$Builder;
        r1.<init>(r9);
        r2 = r9.getBaseContext();
        r0 = com.whatsapp.util.a5.d(r0, r2);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r4);
        r1 = new com.whatsapp.cd;
        r1.<init>(r9);
        r0 = r0.setNegativeButton(r6, r1);
        r1 = new com.whatsapp.amz;
        r1.<init>(r9);
        r0 = r0.setPositiveButton(r7, r1);
        r1 = new com.whatsapp.b_;
        r1.<init>(r9);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0012;
    L_0x01e6:
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r9);
        r1 = 2131624092; // 0x7f0e009c float:1.8875354E38 double:1.0531622337E-314;
        r2 = new java.lang.Object[r4];
        r3 = 2131624893; // 0x7f0e03bd float:1.8876979E38 double:1.0531626295E-314;
        r3 = r9.getString(r3);
        r2[r5] = r3;
        r1 = r9.getString(r1, r2);
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r4);
        r1 = new com.whatsapp.jv;
        r1.<init>(r9);
        r0 = r0.setNegativeButton(r6, r1);
        r1 = 2131624893; // 0x7f0e03bd float:1.8876979E38 double:1.0531626295E-314;
        r2 = new com.whatsapp.oq;
        r2.<init>(r9);
        r0 = r0.setPositiveButton(r1, r2);
        r0 = r0.create();
        goto L_0x0012;
    L_0x0220:
        r0 = new android.app.ProgressDialog;
        r0.<init>(r9);
        r1 = 2131624785; // 0x7f0e0351 float:1.887676E38 double:1.053162576E-314;
        r1 = r9.getString(r1);
        r0.setMessage(r1);
        r0.setIndeterminate(r4);
        r0.setCancelable(r5);
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.onCreateDialog(int):android.app.Dialog");
    }

    static Handler s(ContactPicker contactPicker) {
        return contactPicker.O;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Resources resources = getResources();
        CharSequence string = getString(R.string.menuitem_refresh);
        if (!this.E.isEmpty()) {
            View a = a_7.a((Context) this, getSherlock(), new a8t(this));
            try {
                this.R = menu.add(0, 4, 0, (int) R.string.search).setActionView(a).setIcon((int) R.drawable.ic_action_search);
                this.R.setShowAsAction(10);
                this.R.setOnActionExpandListener(new yi(this));
                if (!TextUtils.isEmpty(this.w)) {
                    this.R.expandActionView();
                    a_7.a(a, this.w, true);
                    this.w = null;
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
        menu.add(0, 1, 0, (int) R.string.tell_a_friend).setIcon((int) R.drawable.ic_menu_share);
        menu.add(0, 2, 0, (int) R.string.menuitem_contacts).setIcon((int) R.drawable.ic_menu_contacts);
        menu.add(0, 0, 0, string).setIcon(resources.getDrawable(R.drawable.ic_menu_refresh));
        menu.add(0, 3, 0, (int) R.string.settings_help).setIcon((int) R.drawable.ic_menu_help);
        return super.onCreateOptionsMenu(menu);
    }

    static boolean k(ContactPicker contactPicker) {
        return contactPicker.G;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int h(java.lang.String r4) {
        /*
        r3_this = this;
        r0 = com.whatsapp.App.az;
        r1 = -1;
        r3.x = r1;	 Catch:{ SecurityException -> 0x005b }
        r1 = Y;	 Catch:{ SecurityException -> 0x005b }
        r2 = 31;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x005b }
        r1 = r4.startsWith(r1);	 Catch:{ SecurityException -> 0x005b }
        if (r1 == 0) goto L_0x0016;
    L_0x0011:
        r1 = 2;
        r3.x = r1;	 Catch:{ SecurityException -> 0x005d }
        if (r0 == 0) goto L_0x0058;
    L_0x0016:
        r1 = Y;	 Catch:{ SecurityException -> 0x005f }
        r2 = 33;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x005f }
        r1 = r4.startsWith(r1);	 Catch:{ SecurityException -> 0x005f }
        if (r1 == 0) goto L_0x0027;
    L_0x0022:
        r1 = 3;
        r3.x = r1;	 Catch:{ SecurityException -> 0x0061 }
        if (r0 == 0) goto L_0x0058;
    L_0x0027:
        r1 = Y;	 Catch:{ SecurityException -> 0x0063 }
        r2 = 34;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x0063 }
        r1 = r4.startsWith(r1);	 Catch:{ SecurityException -> 0x0063 }
        if (r1 == 0) goto L_0x0038;
    L_0x0033:
        r1 = 1;
        r3.x = r1;	 Catch:{ SecurityException -> 0x0065 }
        if (r0 == 0) goto L_0x0058;
    L_0x0038:
        r1 = Y;	 Catch:{ SecurityException -> 0x0067 }
        r2 = 35;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x0067 }
        r1 = r4.startsWith(r1);	 Catch:{ SecurityException -> 0x0067 }
        if (r1 == 0) goto L_0x0049;
    L_0x0044:
        r1 = 4;
        r3.x = r1;	 Catch:{ SecurityException -> 0x0069 }
        if (r0 == 0) goto L_0x0058;
    L_0x0049:
        r0 = Y;	 Catch:{ SecurityException -> 0x006b }
        r1 = 32;
        r0 = r0[r1];	 Catch:{ SecurityException -> 0x006b }
        r0 = r4.startsWith(r0);	 Catch:{ SecurityException -> 0x006b }
        if (r0 == 0) goto L_0x0058;
    L_0x0055:
        r0 = 0;
        r3.x = r0;	 Catch:{ SecurityException -> 0x006b }
    L_0x0058:
        r0 = r3.x;
        return r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.h(java.lang.String):int");
    }

    private void c(boolean z) {
        try {
            if (App.an == null) {
                App.b((Context) this, (int) R.string.finish_registration_first, 1);
                if (App.az == 0) {
                    return;
                }
            }
            setSupportProgressBarIndeterminateVisibility(true);
            br.a(new bo(this, z));
        } catch (SecurityException e) {
            throw e;
        }
    }

    static void q(ContactPicker contactPicker) {
        contactPicker.j();
    }

    static m8 l(ContactPicker contactPicker) {
        return contactPicker.V;
    }

    static HashMap a(ContactPicker contactPicker, HashMap hashMap) {
        contactPicker.U = hashMap;
        return hashMap;
    }

    static void b(ContactPicker contactPicker) {
        contactPicker.h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onContextItemSelected(android.view.MenuItem r5) {
        /*
        r4_this = this;
        r0 = r5.getMenuInfo();
        r0 = (android.widget.AdapterView.AdapterContextMenuInfo) r0;
        r1 = r4.P;
        r2 = r4.P;
        r2 = r2.getCurrentItem();
        r2 = java.lang.Integer.valueOf(r2);
        r1 = r1.findViewWithTag(r2);
        r1 = (android.widget.ListView) r1;
        r0 = r0.position;
        r0 = r1.getItemAtPosition(r0);
        r0 = (com.whatsapp.m8) r0;
        r1 = r5.getItemId();	 Catch:{ SecurityException -> 0x0050 }
        switch(r1) {
            case 0: goto L_0x002c;
            default: goto L_0x0027;
        };
    L_0x0027:
        r0 = super.onContextItemSelected(r5);
    L_0x002b:
        return r0;
    L_0x002c:
        r1 = com.whatsapp.App.a();	 Catch:{ SecurityException -> 0x0052 }
        if (r1 != 0) goto L_0x0041;
    L_0x0032:
        r1 = r4.getBaseContext();	 Catch:{ SecurityException -> 0x0052 }
        r2 = 2131624620; // 0x7f0e02ac float:1.8876425E38 double:1.0531624946E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ SecurityException -> 0x0052 }
        r1 = com.whatsapp.App.az;	 Catch:{ SecurityException -> 0x0052 }
        if (r1 == 0) goto L_0x004e;
    L_0x0041:
        r1 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r4.showDialog(r1);
        r1 = new com.whatsapp.sv;
        r1.<init>(r4, r0);
        com.whatsapp.util.br.a(r1);
    L_0x004e:
        r0 = 1;
        goto L_0x002b;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.onContextItemSelected(android.view.MenuItem):boolean");
    }

    static boolean j(ContactPicker contactPicker) {
        return contactPicker.W;
    }

    protected void b() {
        try {
            o();
            C = false;
            if (App.n((Context) this) != this.k) {
                this.k = App.n((Context) this);
                a();
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem r6) {
        /*
        r5_this = this;
        r4 = 1;
        r0 = com.whatsapp.App.az;
        r1 = r6.getItemId();	 Catch:{ ActivityNotFoundException -> 0x0010 }
        switch(r1) {
            case 0: goto L_0x000b;
            case 1: goto L_0x0062;
            case 2: goto L_0x0012;
            case 3: goto L_0x0071;
            case 4: goto L_0x006d;
            case 16908332: goto L_0x0075;
            default: goto L_0x000a;
        };	 Catch:{ ActivityNotFoundException -> 0x0010 }
    L_0x000a:
        return r4;
    L_0x000b:
        r0 = 1;
        r5.c(r0);	 Catch:{ ActivityNotFoundException -> 0x0010 }
        goto L_0x000a;
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r1 = new android.content.Intent;
        r2 = Y;
        r3 = 84;
        r2 = r2[r3];
        r3 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r1.<init>(r2, r3);
        r2 = r5.getPackageManager();	 Catch:{ ActivityNotFoundException -> 0x005e }
        r2 = r1.resolveActivity(r2);	 Catch:{ ActivityNotFoundException -> 0x005e }
        r1.setComponent(r2);	 Catch:{ ActivityNotFoundException -> 0x005e }
        r2 = r1.getComponent();	 Catch:{ ActivityNotFoundException -> 0x005e }
        if (r2 == 0) goto L_0x0035;
    L_0x0030:
        r5.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x005e }
        if (r0 == 0) goto L_0x000a;
    L_0x0035:
        r1 = r5.getPackageManager();	 Catch:{ ActivityNotFoundException -> 0x0050 }
        r2 = Y;	 Catch:{ ActivityNotFoundException -> 0x0050 }
        r3 = 85;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0050 }
        r1 = r1.getLaunchIntentForPackage(r2);	 Catch:{ ActivityNotFoundException -> 0x0050 }
        if (r1 != 0) goto L_0x004a;
    L_0x0045:
        com.whatsapp.App.X();	 Catch:{ ActivityNotFoundException -> 0x0060 }
        if (r0 == 0) goto L_0x000a;
    L_0x004a:
        r5.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x004e }
        goto L_0x000a;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        r0 = Y;
        r1 = 86;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        com.whatsapp.App.X();
        goto L_0x000a;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x004e }
    L_0x0062:
        r0 = com.whatsapp.fieldstats.au.TELL_A_FRIEND;
        r1 = com.whatsapp.fieldstats.a7.CONTACTPICKER_MENU;
        com.whatsapp.ak4.a(r0, r1);
        com.whatsapp.App.c(r5);
        goto L_0x000a;
    L_0x006d:
        r5.onSearchRequested();
        goto L_0x000a;
    L_0x0071:
        r5.l();
        goto L_0x000a;
    L_0x0075:
        r5.finish();
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.onOptionsItemSelected(com.actionbarsherlock.view.MenuItem):boolean");
    }

    public void c(String str) {
        m8 a = App.P.a(str);
        if (a != null) {
            try {
                if (m8.a(this.E, new atw(a))) {
                    o();
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
    }

    public void a() {
        try {
            if (!C) {
                j();
                o();
                setSupportProgressBarIndeterminateVisibility(i.d());
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public ContactPicker() {
        this.O = new Handler();
        this.n = new HashSet();
        this.o = null;
        this.l = "";
        this.D = null;
        this.m = null;
        this.E = new ArrayList();
        this.u = new ArrayList();
        this.T = new ArrayList();
        this.J = new ArrayList();
        this.S = new Object();
        this.v = new fk();
    }

    static String v(ContactPicker contactPicker) {
        return contactPicker.Q;
    }

    public void a(Collection collection) {
        o();
    }

    static m8 g() {
        return M;
    }

    static void b(ContactPicker contactPicker, String str) {
        contactPicker.g(str);
    }

    static HashMap e(ContactPicker contactPicker) {
        return contactPicker.U;
    }

    public void onResume() {
        try {
            super.onResume();
            if (!C) {
                b();
            }
        } catch (SecurityException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j() {
        /*
        r4_this = this;
        r0 = com.whatsapp.App.az;
        r1 = r4.E;
        monitor-enter(r1);
        r2 = r4.r;	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x0013;
    L_0x0009:
        r2 = com.whatsapp.App.P;	 Catch:{ SecurityException -> 0x0040 }
        r2 = r2.h();	 Catch:{ SecurityException -> 0x0040 }
        r4.E = r2;	 Catch:{ SecurityException -> 0x0040 }
        if (r0 == 0) goto L_0x002c;
    L_0x0013:
        r2 = r4.E;	 Catch:{ SecurityException -> 0x0040 }
        r2.clear();	 Catch:{ SecurityException -> 0x0040 }
        r2 = r4.L;	 Catch:{ SecurityException -> 0x0040 }
        if (r2 != 0) goto L_0x0025;
    L_0x001c:
        r2 = com.whatsapp.App.P;	 Catch:{ SecurityException -> 0x0042 }
        r3 = r4.E;	 Catch:{ SecurityException -> 0x0042 }
        r2.e(r3);	 Catch:{ SecurityException -> 0x0042 }
        if (r0 == 0) goto L_0x002c;
    L_0x0025:
        r2 = com.whatsapp.App.P;	 Catch:{ SecurityException -> 0x0044 }
        r3 = r4.E;	 Catch:{ SecurityException -> 0x0044 }
        r2.b(r3);	 Catch:{ SecurityException -> 0x0044 }
    L_0x002c:
        r2 = r4.Q;	 Catch:{ SecurityException -> 0x0049 }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ SecurityException -> 0x0049 }
        if (r2 != 0) goto L_0x003b;
    L_0x0034:
        r2 = r4.Q;	 Catch:{ SecurityException -> 0x0049 }
        r4.g(r2);	 Catch:{ SecurityException -> 0x0049 }
        if (r0 == 0) goto L_0x003e;
    L_0x003b:
        r4.k();	 Catch:{ SecurityException -> 0x004b }
    L_0x003e:
        monitor-exit(r1);	 Catch:{ all -> 0x0046 }
        return;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0046 }
        throw r0;
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0046 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.j():void");
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            if (this.V != null) {
                bundle.putCharSequence(Y[0], this.V.e);
            }
            try {
                if (this.I != null) {
                    bundle.putParcelable(Y[1], this.I);
                }
            } catch (SecurityException e) {
                throw e;
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    static void r(ContactPicker contactPicker) {
        contactPicker.k();
    }

    static boolean n(ContactPicker contactPicker) {
        return contactPicker.F;
    }

    static m8 i() {
        return X;
    }

    public void d(String str) {
        m8 a = App.P.a(str);
        if (a != null) {
            try {
                if (m8.a(this.E, new atd(a))) {
                    o();
                }
            } catch (SecurityException e) {
                throw e;
            }
        }
    }

    static void y(ContactPicker contactPicker) {
        contactPicker.l();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case ay.f /*1*/:
                try {
                    if (i2 == -1) {
                        c(false);
                        if (App.az == 0) {
                            return;
                        }
                    }
                    Log.i(Y[25]);
                } catch (SecurityException e) {
                    throw e;
                }
            default:
        }
    }

    public void b(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k() {
        /*
        r5_this = this;
        r1 = com.whatsapp.App.az;
        r0 = r5.u;	 Catch:{ SecurityException -> 0x01af }
        r0.clear();	 Catch:{ SecurityException -> 0x01af }
        r0 = r5.T;	 Catch:{ SecurityException -> 0x01af }
        r0.clear();	 Catch:{ SecurityException -> 0x01af }
        r0 = r5.J;	 Catch:{ SecurityException -> 0x01af }
        r0.clear();	 Catch:{ SecurityException -> 0x01af }
        r0 = r5.z;	 Catch:{ SecurityException -> 0x01af }
        if (r0 != 0) goto L_0x0019;
    L_0x0015:
        r0 = r5.H;	 Catch:{ SecurityException -> 0x01af }
        if (r0 == 0) goto L_0x0048;
    L_0x0019:
        r0 = r5.E;
        r2 = r0.iterator();
    L_0x001f:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0046;
    L_0x0025:
        r0 = r2.next();
        r0 = (com.whatsapp.m8) r0;
        r3 = r5.n;	 Catch:{ SecurityException -> 0x01b1 }
        r4 = r0.e;	 Catch:{ SecurityException -> 0x01b1 }
        r3 = r3.contains(r4);	 Catch:{ SecurityException -> 0x01b1 }
        if (r3 != 0) goto L_0x0044;
    L_0x0035:
        r3 = r0.w();	 Catch:{ SecurityException -> 0x01b3 }
        if (r3 != 0) goto L_0x0044;
    L_0x003b:
        r3 = r0.h;	 Catch:{ SecurityException -> 0x01b5 }
        if (r3 == 0) goto L_0x0044;
    L_0x003f:
        r3 = r5.T;	 Catch:{ SecurityException -> 0x01b5 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01b5 }
    L_0x0044:
        if (r1 == 0) goto L_0x001f;
    L_0x0046:
        if (r1 == 0) goto L_0x00cf;
    L_0x0048:
        r0 = r5.W;	 Catch:{ SecurityException -> 0x01b7 }
        if (r0 == 0) goto L_0x0071;
    L_0x004c:
        r0 = r5.E;
        r2 = r0.iterator();
    L_0x0052:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x006f;
    L_0x0058:
        r0 = r2.next();
        r0 = (com.whatsapp.m8) r0;
        r3 = com.whatsapp.App.aJ;	 Catch:{ SecurityException -> 0x01b9 }
        r4 = r0.e;	 Catch:{ SecurityException -> 0x01b9 }
        r3 = r3.z(r4);	 Catch:{ SecurityException -> 0x01b9 }
        if (r3 == 0) goto L_0x006d;
    L_0x0068:
        r3 = r5.u;	 Catch:{ SecurityException -> 0x01b9 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01b9 }
    L_0x006d:
        if (r1 == 0) goto L_0x0052;
    L_0x006f:
        if (r1 == 0) goto L_0x00cf;
    L_0x0071:
        r0 = r5.E;
        r2 = r0.iterator();
    L_0x0077:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00cf;
    L_0x007d:
        r0 = r2.next();
        r0 = (com.whatsapp.m8) r0;
        r3 = r0.w();	 Catch:{ SecurityException -> 0x01bb }
        if (r3 != 0) goto L_0x0092;
    L_0x0089:
        r3 = r0.h;	 Catch:{ SecurityException -> 0x01bd }
        if (r3 == 0) goto L_0x0092;
    L_0x008d:
        r3 = r5.T;	 Catch:{ SecurityException -> 0x01bd }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01bd }
    L_0x0092:
        r3 = r0.w();	 Catch:{ SecurityException -> 0x01bf }
        if (r3 == 0) goto L_0x00a7;
    L_0x0098:
        r3 = r0.b();	 Catch:{ SecurityException -> 0x01c1 }
        if (r3 != 0) goto L_0x00a7;
    L_0x009e:
        r3 = r0.N;	 Catch:{ SecurityException -> 0x01c3 }
        if (r3 == 0) goto L_0x00a7;
    L_0x00a2:
        r3 = r5.J;	 Catch:{ SecurityException -> 0x01c3 }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01c3 }
    L_0x00a7:
        r3 = r0.w();	 Catch:{ SecurityException -> 0x01c5 }
        if (r3 == 0) goto L_0x00be;
    L_0x00ad:
        r3 = r0.b();	 Catch:{ SecurityException -> 0x01c7 }
        if (r3 != 0) goto L_0x00cd;
    L_0x00b3:
        r3 = r0.N;	 Catch:{ SecurityException -> 0x01c9 }
        if (r3 == 0) goto L_0x00cd;
    L_0x00b7:
        r3 = r5.u;	 Catch:{ SecurityException -> 0x01cb }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01cb }
        if (r1 == 0) goto L_0x00cd;
    L_0x00be:
        r3 = com.whatsapp.App.aJ;	 Catch:{ SecurityException -> 0x01cd }
        r4 = r0.e;	 Catch:{ SecurityException -> 0x01cd }
        r3 = r3.z(r4);	 Catch:{ SecurityException -> 0x01cd }
        if (r3 == 0) goto L_0x00cd;
    L_0x00c8:
        r3 = r5.u;	 Catch:{ SecurityException -> 0x01cd }
        r3.add(r0);	 Catch:{ SecurityException -> 0x01cd }
    L_0x00cd:
        if (r1 == 0) goto L_0x0077;
    L_0x00cf:
        r0 = r5.u;	 Catch:{ SecurityException -> 0x01cf }
        r1 = new com.whatsapp.ss;	 Catch:{ SecurityException -> 0x01cf }
        r2 = r5.getApplicationContext();	 Catch:{ SecurityException -> 0x01cf }
        r1.<init>(r2);	 Catch:{ SecurityException -> 0x01cf }
        java.util.Collections.sort(r0, r1);	 Catch:{ SecurityException -> 0x01cf }
        r0 = r5.T;	 Catch:{ SecurityException -> 0x01cf }
        r1 = new com.whatsapp.kf;	 Catch:{ SecurityException -> 0x01cf }
        r2 = r5.getApplicationContext();	 Catch:{ SecurityException -> 0x01cf }
        r1.<init>(r2);	 Catch:{ SecurityException -> 0x01cf }
        java.util.Collections.sort(r0, r1);	 Catch:{ SecurityException -> 0x01cf }
        r0 = r5.J;	 Catch:{ SecurityException -> 0x01cf }
        r1 = new com.whatsapp.kf;	 Catch:{ SecurityException -> 0x01cf }
        r2 = r5.getApplicationContext();	 Catch:{ SecurityException -> 0x01cf }
        r1.<init>(r2);	 Catch:{ SecurityException -> 0x01cf }
        java.util.Collections.sort(r0, r1);	 Catch:{ SecurityException -> 0x01cf }
        r0 = r5.t;	 Catch:{ SecurityException -> 0x01cf }
        if (r0 != 0) goto L_0x013b;
    L_0x00fd:
        r0 = r5.F;	 Catch:{ SecurityException -> 0x01d1 }
        if (r0 != 0) goto L_0x013b;
    L_0x0101:
        r0 = r5.G;	 Catch:{ SecurityException -> 0x01d3 }
        if (r0 != 0) goto L_0x013b;
    L_0x0105:
        r0 = r5.r;	 Catch:{ SecurityException -> 0x01d5 }
        if (r0 != 0) goto L_0x013b;
    L_0x0109:
        r0 = r5.T;	 Catch:{ SecurityException -> 0x01d7 }
        r0 = r0.isEmpty();	 Catch:{ SecurityException -> 0x01d7 }
        if (r0 != 0) goto L_0x013b;
    L_0x0111:
        r0 = r5.getSupportActionBar();	 Catch:{ SecurityException -> 0x01d7 }
        r1 = com.whatsapp.App.aX;	 Catch:{ SecurityException -> 0x01d7 }
        r2 = 2131558428; // 0x7f0d001c float:1.8742172E38 double:1.0531297914E-314;
        r3 = r5.T;	 Catch:{ SecurityException -> 0x01d7 }
        r3 = r3.size();	 Catch:{ SecurityException -> 0x01d7 }
        r1 = r1.a(r2, r3);	 Catch:{ SecurityException -> 0x01d7 }
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ SecurityException -> 0x01d7 }
        r3 = 0;
        r4 = r5.T;	 Catch:{ SecurityException -> 0x01d7 }
        r4 = r4.size();	 Catch:{ SecurityException -> 0x01d7 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ SecurityException -> 0x01d7 }
        r2[r3] = r4;	 Catch:{ SecurityException -> 0x01d7 }
        r1 = java.lang.String.format(r1, r2);	 Catch:{ SecurityException -> 0x01d7 }
        r0.setSubtitle(r1);	 Catch:{ SecurityException -> 0x01d7 }
    L_0x013b:
        r0 = r5.u;	 Catch:{ SecurityException -> 0x01d9 }
        r0 = r0.size();	 Catch:{ SecurityException -> 0x01d9 }
        if (r0 != 0) goto L_0x014a;
    L_0x0143:
        r0 = r5.u;	 Catch:{ SecurityException -> 0x01d9 }
        r1 = X;	 Catch:{ SecurityException -> 0x01d9 }
        r0.add(r1);	 Catch:{ SecurityException -> 0x01d9 }
    L_0x014a:
        r0 = r5.T;	 Catch:{ SecurityException -> 0x01db }
        r0 = r0.size();	 Catch:{ SecurityException -> 0x01db }
        if (r0 != 0) goto L_0x0159;
    L_0x0152:
        r0 = r5.T;	 Catch:{ SecurityException -> 0x01db }
        r1 = X;	 Catch:{ SecurityException -> 0x01db }
        r0.add(r1);	 Catch:{ SecurityException -> 0x01db }
    L_0x0159:
        r0 = r5.J;	 Catch:{ SecurityException -> 0x01dd }
        r0 = r0.size();	 Catch:{ SecurityException -> 0x01dd }
        if (r0 != 0) goto L_0x0168;
    L_0x0161:
        r0 = r5.J;	 Catch:{ SecurityException -> 0x01dd }
        r1 = X;	 Catch:{ SecurityException -> 0x01dd }
        r0.add(r1);	 Catch:{ SecurityException -> 0x01dd }
    L_0x0168:
        r0 = r5.z;	 Catch:{ SecurityException -> 0x01df }
        if (r0 != 0) goto L_0x01ae;
    L_0x016c:
        r0 = r5.H;	 Catch:{ SecurityException -> 0x01e1 }
        if (r0 != 0) goto L_0x01ae;
    L_0x0170:
        r0 = r5.W;	 Catch:{ SecurityException -> 0x01e3 }
        if (r0 != 0) goto L_0x01ae;
    L_0x0174:
        r0 = r5.t;	 Catch:{ SecurityException -> 0x01e5 }
        if (r0 != 0) goto L_0x01ae;
    L_0x0178:
        r0 = r5.F;	 Catch:{ SecurityException -> 0x01e7 }
        if (r0 != 0) goto L_0x01ae;
    L_0x017c:
        r0 = r5.G;	 Catch:{ SecurityException -> 0x01e9 }
        if (r0 != 0) goto L_0x01ae;
    L_0x0180:
        r0 = r5.Q;	 Catch:{ SecurityException -> 0x01eb }
        if (r0 != 0) goto L_0x01ae;
    L_0x0184:
        r0 = r5.u;	 Catch:{ SecurityException -> 0x01eb }
        r1 = M;	 Catch:{ SecurityException -> 0x01eb }
        r0.add(r1);	 Catch:{ SecurityException -> 0x01eb }
        r0 = r5.u;	 Catch:{ SecurityException -> 0x01eb }
        r1 = q;	 Catch:{ SecurityException -> 0x01eb }
        r0.add(r1);	 Catch:{ SecurityException -> 0x01eb }
        r0 = r5.T;	 Catch:{ SecurityException -> 0x01eb }
        r1 = M;	 Catch:{ SecurityException -> 0x01eb }
        r0.add(r1);	 Catch:{ SecurityException -> 0x01eb }
        r0 = r5.T;	 Catch:{ SecurityException -> 0x01eb }
        r1 = q;	 Catch:{ SecurityException -> 0x01eb }
        r0.add(r1);	 Catch:{ SecurityException -> 0x01eb }
        r0 = r5.J;	 Catch:{ SecurityException -> 0x01eb }
        r1 = M;	 Catch:{ SecurityException -> 0x01eb }
        r0.add(r1);	 Catch:{ SecurityException -> 0x01eb }
        r0 = r5.J;	 Catch:{ SecurityException -> 0x01eb }
        r1 = q;	 Catch:{ SecurityException -> 0x01eb }
        r0.add(r1);	 Catch:{ SecurityException -> 0x01eb }
    L_0x01ae:
        return;
    L_0x01af:
        r0 = move-exception;
        throw r0;
    L_0x01b1:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01b3 }
    L_0x01b3:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01b5 }
    L_0x01b5:
        r0 = move-exception;
        throw r0;
    L_0x01b7:
        r0 = move-exception;
        throw r0;
    L_0x01b9:
        r0 = move-exception;
        throw r0;
    L_0x01bb:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01bd }
    L_0x01bd:
        r0 = move-exception;
        throw r0;
    L_0x01bf:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01c1 }
    L_0x01c1:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01c3 }
    L_0x01c3:
        r0 = move-exception;
        throw r0;
    L_0x01c5:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01c7 }
    L_0x01c7:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01c9 }
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01cb }
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01d1 }
    L_0x01d1:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01d3 }
    L_0x01d3:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01d5 }
    L_0x01d5:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01d7 }
    L_0x01d7:
        r0 = move-exception;
        throw r0;
    L_0x01d9:
        r0 = move-exception;
        throw r0;
    L_0x01db:
        r0 = move-exception;
        throw r0;
    L_0x01dd:
        r0 = move-exception;
        throw r0;
    L_0x01df:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01e1 }
    L_0x01e1:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01e3 }
    L_0x01e3:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01e5 }
    L_0x01e5:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01e7 }
    L_0x01e7:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01e9 }
    L_0x01e9:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01eb }
    L_0x01eb:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.k():void");
    }

    static boolean b(m8 m8Var) {
        return c(m8Var);
    }

    static ActionMode a(ContactPicker contactPicker, ActionMode actionMode) {
        contactPicker.y = actionMode;
        return actionMode;
    }

    public void onPause() {
        super.onPause();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        r5_this = this;
        r4 = 1;
        r0 = com.whatsapp.App.az;
        super.onCreate(r6);
        r2 = 5;
        r5.requestWindowFeature(r2);
        r1 = r5.getSupportActionBar();
        r2 = 1;
        r1.setDisplayHomeAsUpEnabled(r2);	 Catch:{ SecurityException -> 0x003c }
        r2 = 2131625125; // 0x7f0e04a5 float:1.887745E38 double:1.053162744E-314;
        r1.setTitle(r2);	 Catch:{ SecurityException -> 0x003c }
        r1 = 2130903092; // 0x7f030034 float:1.7412992E38 double:1.0528060124E-314;
        r5.setContentView(r1);	 Catch:{ SecurityException -> 0x003c }
        r1 = Y;	 Catch:{ SecurityException -> 0x003c }
        r2 = 89;
        r1 = r1[r2];	 Catch:{ SecurityException -> 0x003c }
        com.whatsapp.util.Log.i(r1);	 Catch:{ SecurityException -> 0x003c }
        r1 = 0;
        r1 = com.whatsapp.util.WhatsAppLibLoader.a(r1);	 Catch:{ SecurityException -> 0x003c }
        if (r1 != 0) goto L_0x003e;
    L_0x002f:
        r0 = Y;	 Catch:{ SecurityException -> 0x003c }
        r1 = 90;
        r0 = r0[r1];	 Catch:{ SecurityException -> 0x003c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SecurityException -> 0x003c }
        r5.finish();	 Catch:{ SecurityException -> 0x003c }
    L_0x003b:
        return;
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r1 = com.whatsapp.App.an;	 Catch:{ SecurityException -> 0x005d }
        if (r1 == 0) goto L_0x0049;
    L_0x0042:
        r1 = com.whatsapp.App.e(r5);	 Catch:{ SecurityException -> 0x005d }
        r2 = 3;
        if (r1 == r2) goto L_0x005f;
    L_0x0049:
        r0 = 2131624335; // 0x7f0e018f float:1.8875847E38 double:1.053162354E-314;
        com.whatsapp.App.b(r5, r0, r4);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r5, r1);
        r5.startActivity(r0);
        r5.finish();
        goto L_0x003b;
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r1 = com.whatsapp.contact.i.d();	 Catch:{ SecurityException -> 0x00b0 }
        r5.setSupportProgressBarIndeterminateVisibility(r1);	 Catch:{ SecurityException -> 0x00b0 }
        if (r6 != 0) goto L_0x0078;
    L_0x0068:
        r1 = r5.getIntent();	 Catch:{ SecurityException -> 0x00b0 }
        r2 = Y;	 Catch:{ SecurityException -> 0x00b0 }
        r3 = 93;
        r2 = r2[r3];	 Catch:{ SecurityException -> 0x00b0 }
        r1 = r1.getStringExtra(r2);	 Catch:{ SecurityException -> 0x00b0 }
        r5.w = r1;	 Catch:{ SecurityException -> 0x00b0 }
    L_0x0078:
        r1 = com.whatsapp.App.aJ;
        r1 = r1.e();
        if (r1 != 0) goto L_0x00aa;
    L_0x0080:
        C = r4;
        r1 = android.os.Environment.getExternalStorageState();
        r2 = Y;	 Catch:{ SecurityException -> 0x00b2 }
        r3 = 91;
        r2 = r2[r3];	 Catch:{ SecurityException -> 0x00b2 }
        r2 = r1.equals(r2);	 Catch:{ SecurityException -> 0x00b2 }
        if (r2 != 0) goto L_0x00a5;
    L_0x0092:
        r2 = Y;	 Catch:{ SecurityException -> 0x00b4 }
        r3 = 92;
        r2 = r2[r3];	 Catch:{ SecurityException -> 0x00b4 }
        r1 = r1.equals(r2);	 Catch:{ SecurityException -> 0x00b4 }
        if (r1 != 0) goto L_0x00a5;
    L_0x009e:
        r1 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r5.showDialog(r1);	 Catch:{ SecurityException -> 0x00b6 }
        if (r0 == 0) goto L_0x00a8;
    L_0x00a5:
        r5.e();	 Catch:{ SecurityException -> 0x00b6 }
    L_0x00a8:
        if (r0 == 0) goto L_0x003b;
    L_0x00aa:
        r5.d();	 Catch:{ SecurityException -> 0x00ae }
        goto L_0x003b;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactPicker.onCreate(android.os.Bundle):void");
    }

    static Intent g(ContactPicker contactPicker) {
        return contactPicker.I;
    }
}
