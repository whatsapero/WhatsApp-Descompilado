package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.WallpaperManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.f;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import com.whatsapp.wallpaper.WallPaperView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class Conversation extends DialogToastListActivity implements anq, asm {
    private static boolean Q;
    static boolean T;
    public static HashMap a1;
    private static boolean a4;
    public static String a8;
    public static boolean a9;
    private static Conversation aD;
    protected static m aU;
    public static boolean ah;
    public static Display al;
    static ArrayList bc;
    private static final String[] cb;
    public static boolean k;
    static HashMap t;
    private boolean A;
    final OnScrollListener B;
    private final TextWatcher C;
    private View D;
    private boolean E;
    private boolean F;
    private Handler G;
    boolean H;
    private boolean I;
    private String J;
    final OnEditorActionListener K;
    private WallpaperManager L;
    private Runnable M;
    private View N;
    private View O;
    private TextView P;
    private Cursor R;
    private Handler S;
    private zb U;
    private TextView V;
    private am1 W;
    private boolean X;
    private nc Y;
    private ViewGroup Z;
    private int a0;
    private ConversationTextEntry a2;
    private ActionMode a3;
    boolean a5;
    private ImageButton a6;
    private Callback a7;
    String aA;
    private ImageButton aB;
    private a3a aC;
    private View aE;
    boolean aF;
    private MenuItem aG;
    private WallPaperView aH;
    private Boolean aI;
    private ActionMode aJ;
    private boolean aK;
    private ArrayList aL;
    private TextView aM;
    private HashMap aN;
    private boolean aO;
    private ImageButton aP;
    private boolean aQ;
    private View aR;
    public a35 aS;
    private final DataSetObserver aT;
    private boolean aV;
    final InputMethodManager aW;
    private ee aX;
    private int aY;
    private int aZ;
    public HashMap a_;
    private Handler aa;
    private ImageButton ab;
    private amr ac;
    private View ad;
    private Callback ae;
    private boolean af;
    boolean ag;
    private boolean ai;
    private ArrayList aj;
    private boolean ak;
    private final fc am;
    private boolean an;
    private boolean ao;
    private String ap;
    private boolean aq;
    final OnClickListener ar;
    private MenuItem as;
    private int at;
    OnMenuVisibilityListener au;
    private String av;
    private String aw;
    private MenuItem ax;
    tf ay;
    private boolean az;
    private dz ba;
    private View bb;
    public ListView bd;
    private ArrayList be;
    private int i;
    private boolean j;
    private HashSet l;
    private ViewGroup m;
    private Handler n;
    private int o;
    private final mi p;
    public boolean q;
    public m8 r;
    private ImageView s;
    public String u;
    private String v;
    private TextView w;
    private boolean x;
    private View y;
    private int z;

    private void a(boolean z) {
        try {
            if (TextUtils.isEmpty(a8)) {
                a8 = null;
                return;
            }
            this.J = a8;
            g();
            int firstVisiblePosition = this.bd.getFirstVisiblePosition();
            b bVar = (b) this.aS.getItem(firstVisiblePosition);
            if (bVar != null) {
                try {
                    if (bVar.e.c == null) {
                        bVar = (b) this.aS.getItem(firstVisiblePosition + 1);
                    }
                    if (bVar != null) {
                        try {
                            if (this.ac != null) {
                                this.ac.cancel(true);
                            }
                            this.ac = new amr(this, a8, z, bVar);
                            a5w.a(this.ac, new Void[0]);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    static void ae(Conversation conversation) {
        conversation.g();
    }

    static boolean j(Conversation conversation, boolean z) {
        conversation.az = z;
        return z;
    }

    static boolean f(Conversation conversation, boolean z) {
        conversation.ai = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean a(int r7, java.lang.String r8, com.whatsapp.protocol.b r9) {
        /*
        r6_this = this;
        r1 = 0;
        r0 = 1;
        r2 = com.whatsapp.App.az;
        switch(r7) {
            case 0: goto L_0x0013;
            case 1: goto L_0x000f;
            case 2: goto L_0x0009;
            case 3: goto L_0x0017;
            case 4: goto L_0x0023;
            case 5: goto L_0x0027;
            case 6: goto L_0x001f;
            case 7: goto L_0x002b;
            case 8: goto L_0x006e;
            case 9: goto L_0x009a;
            case 10: goto L_0x00a1;
            case 11: goto L_0x0007;
            case 12: goto L_0x0007;
            case 13: goto L_0x0007;
            case 14: goto L_0x00a8;
            case 15: goto L_0x001b;
            case 16: goto L_0x00f1;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = r1;
    L_0x0008:
        return r0;
    L_0x0009:
        r6.l();	 Catch:{ ActivityNotFoundException -> 0x000d }
        goto L_0x0008;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r6.i();
        goto L_0x0008;
    L_0x0013:
        r6.n();
        goto L_0x0008;
    L_0x0017:
        r6.i(r9);
        goto L_0x0008;
    L_0x001b:
        r6.k(r9);
        goto L_0x0008;
    L_0x001f:
        r6.j(r9);
        goto L_0x0008;
    L_0x0023:
        r6.f(r9);
        goto L_0x0008;
    L_0x0027:
        r6.g(r9);
        goto L_0x0008;
    L_0x002b:
        r1 = r9.F;	 Catch:{ ActivityNotFoundException -> 0x0051 }
        r2 = 0;
        r3 = r9.F;	 Catch:{ ActivityNotFoundException -> 0x0051 }
        r4 = "@";
        r3 = r3.indexOf(r4);	 Catch:{ ActivityNotFoundException -> 0x0051 }
        r1 = r1.substring(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0051 }
        r6.aw = r1;	 Catch:{ ActivityNotFoundException -> 0x0051 }
        r1 = r6.aw;	 Catch:{ ActivityNotFoundException -> 0x0051 }
        if (r1 != 0) goto L_0x0053;
    L_0x0040:
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x0051 }
        r2 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0051 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ ActivityNotFoundException -> 0x0051 }
        r1 = 2131624360; // 0x7f0e01a8 float:1.8875898E38 double:1.053162366E-314;
        r2 = 0;
        com.whatsapp.App.b(r6, r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0051 }
        goto L_0x0008;
    L_0x0051:
        r0 = move-exception;
        throw r0;
    L_0x0053:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "+";
        r1 = r1.append(r2);
        r2 = r6.aw;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r6.a(r1, r0);
        r6.j = r0;
        goto L_0x0008;
    L_0x006e:
        r2 = r9.F;
        r3 = r9.F;
        r4 = "@";
        r3 = r3.indexOf(r4);
        r1 = r2.substring(r1, r3);
        r6.aw = r1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "+";
        r1 = r1.append(r2);
        r2 = r6.aw;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r6.b(r1, r0);
        r6.j = r0;
        goto L_0x0008;
    L_0x009a:
        r1 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r6.a(r8, r1);
        goto L_0x0008;
    L_0x00a1:
        r1 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r6.a(r8, r1);
        goto L_0x0008;
    L_0x00a8:
        r1 = r9.F;
        if (r1 == 0) goto L_0x00e0;
    L_0x00ac:
        r1 = com.whatsapp.App.P;
        r3 = r9.F;
        r1 = r1.a(r3);
        if (r1 == 0) goto L_0x00c2;
    L_0x00b6:
        r1 = a(r1);	 Catch:{ ActivityNotFoundException -> 0x00ed }
        r6.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x00ed }
        r6.finish();	 Catch:{ ActivityNotFoundException -> 0x00ed }
        if (r2 == 0) goto L_0x00de;
    L_0x00c2:
        r1 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x00ef }
        r1.<init>();	 Catch:{ ActivityNotFoundException -> 0x00ef }
        r3 = cb;	 Catch:{ ActivityNotFoundException -> 0x00ef }
        r4 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x00ef }
        r1 = r1.append(r3);	 Catch:{ ActivityNotFoundException -> 0x00ef }
        r3 = r9.F;	 Catch:{ ActivityNotFoundException -> 0x00ef }
        r1 = r1.append(r3);	 Catch:{ ActivityNotFoundException -> 0x00ef }
        r1 = r1.toString();	 Catch:{ ActivityNotFoundException -> 0x00ef }
        com.whatsapp.util.Log.e(r1);	 Catch:{ ActivityNotFoundException -> 0x00ef }
    L_0x00de:
        if (r2 == 0) goto L_0x0008;
    L_0x00e0:
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x00eb }
        r2 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x00eb }
        com.whatsapp.util.Log.e(r1);	 Catch:{ ActivityNotFoundException -> 0x00eb }
        goto L_0x0008;
    L_0x00eb:
        r0 = move-exception;
        throw r0;
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00ef }
    L_0x00ef:
        r0 = move-exception;
        throw r0;
    L_0x00f1:
        r1 = com.whatsapp.App.aR();	 Catch:{ ActivityNotFoundException -> 0x016d }
        if (r1 == 0) goto L_0x0133;
    L_0x00f7:
        r1 = r9.F;	 Catch:{ ActivityNotFoundException -> 0x016d }
        if (r1 == 0) goto L_0x0128;
    L_0x00fb:
        r1 = com.whatsapp.App.P;
        r3 = r9.F;
        r1 = r1.a(r3);
        if (r1 == 0) goto L_0x010a;
    L_0x0105:
        com.whatsapp.App.b(r1, r6);	 Catch:{ ActivityNotFoundException -> 0x016f }
        if (r2 == 0) goto L_0x0126;
    L_0x010a:
        r1 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0171 }
        r1.<init>();	 Catch:{ ActivityNotFoundException -> 0x0171 }
        r3 = cb;	 Catch:{ ActivityNotFoundException -> 0x0171 }
        r4 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0171 }
        r1 = r1.append(r3);	 Catch:{ ActivityNotFoundException -> 0x0171 }
        r3 = r9.F;	 Catch:{ ActivityNotFoundException -> 0x0171 }
        r1 = r1.append(r3);	 Catch:{ ActivityNotFoundException -> 0x0171 }
        r1 = r1.toString();	 Catch:{ ActivityNotFoundException -> 0x0171 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ ActivityNotFoundException -> 0x0171 }
    L_0x0126:
        if (r2 == 0) goto L_0x0008;
    L_0x0128:
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x0173 }
        r3 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r1 = r1[r3];	 Catch:{ ActivityNotFoundException -> 0x0173 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ ActivityNotFoundException -> 0x0173 }
        if (r2 == 0) goto L_0x0008;
    L_0x0133:
        r1 = new android.content.Intent;
        r2 = cb;
        r3 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r2 = r2[r3];
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = cb;
        r5 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r8);
        r3 = r3.toString();
        r3 = android.net.Uri.parse(r3);
        r1.<init>(r2, r3);
        r6.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x015e }
        goto L_0x0008;
    L_0x015e:
        r1 = move-exception;
        r1 = cb;
        r2 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
        com.whatsapp.App.X();
        goto L_0x0008;
    L_0x016d:
        r0 = move-exception;
        throw r0;
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        throw r0;
    L_0x0173:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.a(int, java.lang.String, com.whatsapp.protocol.b):boolean");
    }

    private void v() {
        try {
            if (!this.aW.isFullscreenMode()) {
                this.aW.toggleSoftInput(2, 0);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static int w(Conversation conversation) {
        return conversation.o;
    }

    static int p(Conversation conversation) {
        return conversation.a0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onStart() {
        /*
        r10_this = this;
        r9 = 100;
        r1 = 1;
        r2 = 0;
        r4 = com.whatsapp.App.az;
        r5 = new com.whatsapp.util.y;
        r0 = cb;
        r3 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r0 = r0[r3];
        r5.<init>(r0);
        super.onStart();
        r0 = r10.aC;
        com.whatsapp.ac.a(r0);
        r0 = cb;
        r3 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r0 = r0[r3];
        r3 = com.whatsapp.App.p;
        r0 = r3.getSharedPreferences(r0, r2);
        r3 = cb;	 Catch:{ RuntimeException -> 0x01b6 }
        r6 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r3 = r3[r6];	 Catch:{ RuntimeException -> 0x01b6 }
        r6 = "0";
        r0 = r0.getString(r3, r6);	 Catch:{ RuntimeException -> 0x01b6 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ RuntimeException -> 0x01b6 }
        com.whatsapp.preference.WaFontListPreference.b = r0;	 Catch:{ RuntimeException -> 0x01b6 }
        r0 = T;	 Catch:{ RuntimeException -> 0x01b6 }
        if (r0 == 0) goto L_0x003e;
    L_0x003b:
        D(r10);	 Catch:{ RuntimeException -> 0x01b6 }
    L_0x003e:
        r0 = r10.aS;	 Catch:{ RuntimeException -> 0x01b8 }
        r0 = r0.getCursor();	 Catch:{ RuntimeException -> 0x01b8 }
        if (r0 != 0) goto L_0x01ba;
    L_0x0046:
        r0 = r1;
    L_0x0047:
        if (r0 == 0) goto L_0x005f;
    L_0x0049:
        r3 = r10.o;	 Catch:{ RuntimeException -> 0x01bd }
        r6 = 90;
        if (r3 <= r6) goto L_0x005f;
    L_0x004f:
        r3 = com.whatsapp.App.aJ;
        r6 = r10.u;
        r7 = r10.o;
        r7 = r7 + 10;
        r8 = r10.p;
        r3 = r3.a(r6, r7, r8);
        if (r4 == 0) goto L_0x01ed;
    L_0x005f:
        r3 = com.whatsapp.App.aJ;
        r6 = r10.u;
        r2 = r10.b(r2);
        r7 = r10.p;
        r2 = r3.a(r6, r2, r7);
    L_0x006d:
        r10.a(r2);	 Catch:{ RuntimeException -> 0x01bf }
        r3 = r10.aS;	 Catch:{ RuntimeException -> 0x01bf }
        r3.changeCursor(r2);	 Catch:{ RuntimeException -> 0x01bf }
        r2 = r10.aL;	 Catch:{ RuntimeException -> 0x01bf }
        r2.clear();	 Catch:{ RuntimeException -> 0x01bf }
        r2 = r10.aN;	 Catch:{ RuntimeException -> 0x01bf }
        r2.clear();	 Catch:{ RuntimeException -> 0x01bf }
        if (r0 == 0) goto L_0x01a9;
    L_0x0081:
        r0 = r10.aQ;	 Catch:{ RuntimeException -> 0x01c1 }
        if (r0 == 0) goto L_0x00a9;
    L_0x0085:
        r0 = r10.o;	 Catch:{ RuntimeException -> 0x01c3 }
        r2 = r10.aS;	 Catch:{ RuntimeException -> 0x01c3 }
        r2 = r2.getCursor();	 Catch:{ RuntimeException -> 0x01c3 }
        r2 = r2.getCount();	 Catch:{ RuntimeException -> 0x01c3 }
        if (r0 == r2) goto L_0x00a9;
    L_0x0093:
        r0 = r10.h();	 Catch:{ RuntimeException -> 0x01c5 }
        if (r0 != 0) goto L_0x00a9;
    L_0x0099:
        r0 = r10.o;	 Catch:{ RuntimeException -> 0x01c7 }
        r10.a0 = r0;	 Catch:{ RuntimeException -> 0x01c7 }
        r0 = r10.a0;	 Catch:{ RuntimeException -> 0x01c7 }
        if (r0 <= 0) goto L_0x00dd;
    L_0x00a1:
        r10.H();	 Catch:{ RuntimeException -> 0x01c9 }
        r0 = 1;
        r10.az = r0;	 Catch:{ RuntimeException -> 0x01c9 }
        if (r4 == 0) goto L_0x00dd;
    L_0x00a9:
        r0 = r10.o;	 Catch:{ RuntimeException -> 0x01cb }
        r2 = r10.aS;	 Catch:{ RuntimeException -> 0x01cb }
        r2 = r2.getCursor();	 Catch:{ RuntimeException -> 0x01cb }
        r2 = r2.getCount();	 Catch:{ RuntimeException -> 0x01cb }
        if (r0 != r2) goto L_0x00dd;
    L_0x00b7:
        r0 = r10.o;	 Catch:{ RuntimeException -> 0x01cd }
        if (r0 <= r9) goto L_0x00db;
    L_0x00bb:
        r0 = r10.o;	 Catch:{ RuntimeException -> 0x01cd }
        r10.aY = r0;	 Catch:{ RuntimeException -> 0x01cd }
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x01cd }
        r0.<init>();	 Catch:{ RuntimeException -> 0x01cd }
        r2 = cb;	 Catch:{ RuntimeException -> 0x01cd }
        r3 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x01cd }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x01cd }
        r2 = r10.aY;	 Catch:{ RuntimeException -> 0x01cd }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x01cd }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x01cd }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x01cd }
    L_0x00db:
        r10.ai = r1;
    L_0x00dd:
        r0 = r10.az;	 Catch:{ RuntimeException -> 0x01cf }
        if (r0 == 0) goto L_0x00ee;
    L_0x00e1:
        r0 = r10.bd;	 Catch:{ RuntimeException -> 0x01d1 }
        r1 = r10.aS;	 Catch:{ RuntimeException -> 0x01d1 }
        r1 = com.whatsapp.a35.a(r1);	 Catch:{ RuntimeException -> 0x01d1 }
        r0.setSelection(r1);	 Catch:{ RuntimeException -> 0x01d1 }
        if (r4 == 0) goto L_0x00ff;
    L_0x00ee:
        r0 = r10.ai;	 Catch:{ RuntimeException -> 0x01d3 }
        if (r0 != 0) goto L_0x00ff;
    L_0x00f2:
        r0 = r10.bd;	 Catch:{ RuntimeException -> 0x01d3 }
        r1 = r10.aS;	 Catch:{ RuntimeException -> 0x01d3 }
        r1 = r1.getCount();	 Catch:{ RuntimeException -> 0x01d3 }
        r1 = r1 + -1;
        r0.setSelection(r1);	 Catch:{ RuntimeException -> 0x01d3 }
    L_0x00ff:
        r0 = com.whatsapp.App.aJ;
        r1 = r10.u;
        r0 = r0.h(r1);
        if (r0 != 0) goto L_0x0123;
    L_0x0109:
        r0 = r10.aR;	 Catch:{ RuntimeException -> 0x01d5 }
        if (r0 == 0) goto L_0x0123;
    L_0x010d:
        r0 = r10.aR;	 Catch:{ RuntimeException -> 0x01d5 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ RuntimeException -> 0x01d5 }
        r0 = r10.bd;	 Catch:{ RuntimeException -> 0x01d5 }
        r1 = r10.aR;	 Catch:{ RuntimeException -> 0x01d5 }
        r0.removeHeaderView(r1);	 Catch:{ RuntimeException -> 0x01d5 }
        r0 = 0;
        r10.aR = r0;	 Catch:{ RuntimeException -> 0x01d5 }
        r0 = r10.aS;	 Catch:{ RuntimeException -> 0x01d5 }
        r0.notifyDataSetChanged();	 Catch:{ RuntimeException -> 0x01d5 }
    L_0x0123:
        r0 = r10.aR;	 Catch:{ RuntimeException -> 0x01d7 }
        if (r0 != 0) goto L_0x0145;
    L_0x0127:
        r0 = r10.r;	 Catch:{ RuntimeException -> 0x01d9 }
        r0 = r0.w();	 Catch:{ RuntimeException -> 0x01d9 }
        if (r0 != 0) goto L_0x0145;
    L_0x012f:
        r0 = r10.r;	 Catch:{ RuntimeException -> 0x01db }
        r0 = r0.l();	 Catch:{ RuntimeException -> 0x01db }
        if (r0 != 0) goto L_0x0145;
    L_0x0137:
        r0 = r10.r;	 Catch:{ RuntimeException -> 0x01dd }
        r0 = r0.h;	 Catch:{ RuntimeException -> 0x01dd }
        if (r0 != 0) goto L_0x0145;
    L_0x013d:
        r0 = r10.aS;	 Catch:{ RuntimeException -> 0x01df }
        r0 = r0.getCount();	 Catch:{ RuntimeException -> 0x01df }
        if (r0 < r9) goto L_0x0156;
    L_0x0145:
        r0 = r10.bd;	 Catch:{ RuntimeException -> 0x01e1 }
        r1 = r10.O;	 Catch:{ RuntimeException -> 0x01e1 }
        r0.removeHeaderView(r1);	 Catch:{ RuntimeException -> 0x01e1 }
        r0 = 0;
        r10.O = r0;	 Catch:{ RuntimeException -> 0x01e1 }
        r0 = r10.aS;	 Catch:{ RuntimeException -> 0x01e1 }
        r0.notifyDataSetChanged();	 Catch:{ RuntimeException -> 0x01e1 }
        if (r4 == 0) goto L_0x0159;
    L_0x0156:
        r10.D();	 Catch:{ RuntimeException -> 0x01e1 }
    L_0x0159:
        r0 = r10.getIntent();
        r1 = cb;	 Catch:{ RuntimeException -> 0x01e3 }
        r2 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x01e3 }
        r2 = r0.getAction();	 Catch:{ RuntimeException -> 0x01e3 }
        r1 = r1.equals(r2);	 Catch:{ RuntimeException -> 0x01e3 }
        if (r1 == 0) goto L_0x01a7;
    L_0x016d:
        r1 = r10.E;	 Catch:{ RuntimeException -> 0x01e5 }
        if (r1 != 0) goto L_0x01a7;
    L_0x0171:
        r1 = r10.aS;	 Catch:{ RuntimeException -> 0x01e5 }
        r1 = r1.getCount();	 Catch:{ RuntimeException -> 0x01e5 }
        if (r1 <= 0) goto L_0x01a7;
    L_0x0179:
        r1 = cb;
        r2 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r1 = r1[r2];
        r0 = r0.getParcelableExtra(r1);
        r0 = (com.whatsapp.w4) r0;
        if (r0 == 0) goto L_0x01a7;
    L_0x0187:
        r1 = com.whatsapp.App.aJ;
        r0 = r0.a;
        r0 = r1.b(r0);
        if (r0 == 0) goto L_0x01a7;
    L_0x0191:
        r1 = r0.j;	 Catch:{ RuntimeException -> 0x01e7 }
        r2 = 2;
        if (r1 != r2) goto L_0x019c;
    L_0x0196:
        r1 = r0.e;	 Catch:{ RuntimeException -> 0x01e9 }
        aU = r1;	 Catch:{ RuntimeException -> 0x01e9 }
        if (r4 == 0) goto L_0x01a7;
    L_0x019c:
        r1 = r0.e;	 Catch:{ RuntimeException -> 0x01e9 }
        r1 = r1.c;	 Catch:{ RuntimeException -> 0x01e9 }
        r0 = com.whatsapp.MediaView.a(r0, r1, r10);	 Catch:{ RuntimeException -> 0x01e9 }
        r10.startActivity(r0);	 Catch:{ RuntimeException -> 0x01e9 }
    L_0x01a7:
        if (r4 == 0) goto L_0x01b2;
    L_0x01a9:
        r0 = r10.aS;	 Catch:{ RuntimeException -> 0x01eb }
        r0 = r0.getCursor();	 Catch:{ RuntimeException -> 0x01eb }
        r0.requery();	 Catch:{ RuntimeException -> 0x01eb }
    L_0x01b2:
        r5.c();
        return;
    L_0x01b6:
        r0 = move-exception;
        throw r0;
    L_0x01b8:
        r0 = move-exception;
        throw r0;
    L_0x01ba:
        r0 = r2;
        goto L_0x0047;
    L_0x01bd:
        r0 = move-exception;
        throw r0;
    L_0x01bf:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01c1 }
    L_0x01c1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01c3 }
    L_0x01c3:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01c5 }
    L_0x01c5:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01c7 }
    L_0x01c7:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01c9 }
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01cb }
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01cd }
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01d1 }
    L_0x01d1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01d3 }
    L_0x01d3:
        r0 = move-exception;
        throw r0;
    L_0x01d5:
        r0 = move-exception;
        throw r0;
    L_0x01d7:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01d9 }
    L_0x01d9:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01db }
    L_0x01db:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01dd }
    L_0x01dd:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01df }
    L_0x01df:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01e1 }
    L_0x01e1:
        r0 = move-exception;
        throw r0;
    L_0x01e3:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01e5 }
    L_0x01e5:
        r0 = move-exception;
        throw r0;
    L_0x01e7:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01e9 }
    L_0x01e9:
        r0 = move-exception;
        throw r0;
    L_0x01eb:
        r0 = move-exception;
        throw r0;
    L_0x01ed:
        r2 = r3;
        goto L_0x006d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onStart():void");
    }

    static int a(Conversation conversation, int i) {
        conversation.i = i;
        return i;
    }

    private void B() {
        try {
            if (Environment.getExternalStorageState().equals(cb[259])) {
                try {
                    if (App.aP() < ((long) ((ge.k * 1024) * 1024))) {
                        a(R.string.error_no_disc_space);
                        return;
                    }
                    try {
                        if (App.c(this.u)) {
                            showDialog(106);
                            return;
                        }
                        Intent intent = new Intent(this, CameraActivity.class);
                        intent.putExtra(cb[258], this.u);
                        startActivity(intent);
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
            showDialog(15);
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean h(java.lang.String r18) {
        /*
        r17_this = this;
        r12 = com.whatsapp.App.az;
        r13 = new com.whatsapp.util.y;
        r2 = cb;
        r3 = 49;
        r2 = r2[r3];
        r13.<init>(r2);
        if (r18 == 0) goto L_0x003a;
    L_0x000f:
        r2 = 0;
        r0 = r17;
        r0.a0 = r2;	 Catch:{ IOException -> 0x00b7 }
        r0 = r18;
        r1 = r17;
        r1.u = r0;	 Catch:{ IOException -> 0x00b7 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00b7 }
        r2.<init>();	 Catch:{ IOException -> 0x00b7 }
        r3 = cb;	 Catch:{ IOException -> 0x00b7 }
        r4 = 37;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00b7 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x00b7 }
        r0 = r17;
        r3 = r0.u;	 Catch:{ IOException -> 0x00b7 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x00b7 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x00b7 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x00b7 }
        if (r12 == 0) goto L_0x0064;
    L_0x003a:
        r2 = r17.getIntent();	 Catch:{ IOException -> 0x00b9 }
        r3 = cb;	 Catch:{ IOException -> 0x00b9 }
        r4 = 27;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00b9 }
        r2 = r2.getStringExtra(r3);	 Catch:{ IOException -> 0x00b9 }
        r0 = r17;
        r0.u = r2;	 Catch:{ IOException -> 0x00b9 }
        r0 = r17;
        r2 = r0.u;	 Catch:{ IOException -> 0x00b9 }
        if (r2 != 0) goto L_0x0064;
    L_0x0052:
        r2 = r17.getIntent();	 Catch:{ IOException -> 0x00bb }
        r3 = cb;	 Catch:{ IOException -> 0x00bb }
        r4 = 24;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00bb }
        r2 = r2.getStringExtra(r3);	 Catch:{ IOException -> 0x00bb }
        r0 = r17;
        r0.u = r2;	 Catch:{ IOException -> 0x00bb }
    L_0x0064:
        r2 = 1;
        r0 = r17;
        r3 = r0.u;
        if (r3 != 0) goto L_0x01b5;
    L_0x006b:
        r2 = r17.getIntent();
        r3 = r2.getData();	 Catch:{ IOException -> 0x00bd }
        if (r3 == 0) goto L_0x01a6;
    L_0x0075:
        r3 = r2.getData();	 Catch:{ IOException -> 0x00bd }
        r3 = r3.getScheme();	 Catch:{ IOException -> 0x00bd }
        if (r3 == 0) goto L_0x01a6;
    L_0x007f:
        r3 = r2.getData();	 Catch:{ IOException -> 0x00bf }
        r3 = r3.getScheme();	 Catch:{ IOException -> 0x00bf }
        r4 = cb;	 Catch:{ IOException -> 0x00bf }
        r5 = 41;
        r4 = r4[r5];	 Catch:{ IOException -> 0x00bf }
        r3 = r3.equals(r4);	 Catch:{ IOException -> 0x00bf }
        if (r3 != 0) goto L_0x00a7;
    L_0x0093:
        r2 = r2.getData();	 Catch:{ IOException -> 0x00c1 }
        r2 = r2.getScheme();	 Catch:{ IOException -> 0x00c1 }
        r3 = cb;	 Catch:{ IOException -> 0x00c1 }
        r4 = 25;
        r3 = r3[r4];	 Catch:{ IOException -> 0x00c1 }
        r2 = r2.equals(r3);	 Catch:{ IOException -> 0x00c1 }
        if (r2 == 0) goto L_0x01a6;
    L_0x00a7:
        r2 = r17.getIntent();
        r2 = r2.getData();
        r4 = r2.toString();
        if (r4 != 0) goto L_0x00c3;
    L_0x00b5:
        r2 = 0;
    L_0x00b6:
        return r2;
    L_0x00b7:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x00b9 }
    L_0x00b9:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x00bb }
    L_0x00bb:
        r2 = move-exception;
        throw r2;
    L_0x00bd:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x00bf }
    L_0x00bf:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x00c1 }
    L_0x00c1:
        r2 = move-exception;
        throw r2;
    L_0x00c3:
        r2 = ":";
        r2 = r4.split(r2);
        if (r2 == 0) goto L_0x0196;
    L_0x00cb:
        r3 = r2.length;	 Catch:{ IOException -> 0x018c }
        r5 = 2;
        if (r3 != r5) goto L_0x0196;
    L_0x00cf:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = cb;
        r6 = 38;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r5 = 1;
        r5 = r2[r5];
        r3 = r3.append(r5);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = 1;
        r2 = r2[r3];
        r2 = java.net.URLDecoder.decode(r2);
        r2 = android.telephony.PhoneNumberUtils.stripSeparators(r2);
        r3 = r2.length();	 Catch:{ IOException -> 0x018e }
        if (r3 <= 0) goto L_0x010d;
    L_0x00fd:
        r3 = 0;
        r3 = r2.charAt(r3);	 Catch:{ IOException -> 0x018e }
        r3 = java.lang.Character.isDigit(r3);	 Catch:{ IOException -> 0x018e }
        if (r3 != 0) goto L_0x010d;
    L_0x0108:
        r3 = 1;
        r2 = r2.substring(r3);
    L_0x010d:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = cb;
        r5 = 19;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = 0;
        r5 = com.whatsapp.App.P;
        r5 = r5.c(r2);
        r2 = r5.size();	 Catch:{ IOException -> 0x0190 }
        if (r2 <= 0) goto L_0x0171;
    L_0x0131:
        r2 = 0;
        r2 = r5.get(r2);	 Catch:{ IOException -> 0x0190 }
        r2 = (com.whatsapp.m8) r2;	 Catch:{ IOException -> 0x0190 }
        r2 = r2.q;	 Catch:{ IOException -> 0x0190 }
        if (r2 == 0) goto L_0x0171;
    L_0x013c:
        r2 = 0;
        r2 = r5.get(r2);	 Catch:{ IOException -> 0x0192 }
        r2 = (com.whatsapp.m8) r2;	 Catch:{ IOException -> 0x0192 }
        r0 = r17;
        r0.r = r2;	 Catch:{ IOException -> 0x0192 }
        r0 = r17;
        r2 = r0.r;	 Catch:{ IOException -> 0x0192 }
        r2 = r2.e;	 Catch:{ IOException -> 0x0192 }
        r0 = r17;
        r0.u = r2;	 Catch:{ IOException -> 0x0192 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0192 }
        r2.<init>();	 Catch:{ IOException -> 0x0192 }
        r5 = cb;	 Catch:{ IOException -> 0x0192 }
        r6 = 44;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0192 }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x0192 }
        r0 = r17;
        r5 = r0.u;	 Catch:{ IOException -> 0x0192 }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x0192 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0192 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x0192 }
        if (r12 == 0) goto L_0x0194;
    L_0x0171:
        r2 = new android.content.Intent;
        r3 = com.whatsapp.SmsDefaultAppWarning.class;
        r0 = r17;
        r2.<init>(r0, r3);
        r3 = android.net.Uri.parse(r4);
        r2.setData(r3);
        r0 = r17;
        r0.startActivity(r2);
        r17.finish();
        r2 = 0;
        goto L_0x00b6;
    L_0x018c:
        r2 = move-exception;
        throw r2;
    L_0x018e:
        r2 = move-exception;
        throw r2;
    L_0x0190:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0192 }
    L_0x0192:
        r2 = move-exception;
        throw r2;
    L_0x0194:
        if (r12 == 0) goto L_0x01a4;
    L_0x0196:
        r2 = cb;	 Catch:{ IOException -> 0x01a2 }
        r3 = 43;
        r2 = r2[r3];	 Catch:{ IOException -> 0x01a2 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x01a2 }
        r2 = 0;
        goto L_0x00b6;
    L_0x01a2:
        r2 = move-exception;
        throw r2;
    L_0x01a4:
        if (r12 == 0) goto L_0x01b4;
    L_0x01a6:
        r2 = cb;	 Catch:{ IOException -> 0x01b2 }
        r3 = 48;
        r2 = r2[r3];	 Catch:{ IOException -> 0x01b2 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x01b2 }
        r2 = 0;
        goto L_0x00b6;
    L_0x01b2:
        r2 = move-exception;
        throw r2;
    L_0x01b4:
        r2 = r3;
    L_0x01b5:
        r0 = r17;
        r3 = r0.ba;	 Catch:{ IOException -> 0x0210 }
        r0 = r17;
        r4 = r0.u;	 Catch:{ IOException -> 0x0210 }
        r3.a(r4);	 Catch:{ IOException -> 0x0210 }
        if (r2 == 0) goto L_0x01ce;
    L_0x01c2:
        r0 = r17;
        r2 = r0.u;	 Catch:{ IOException -> 0x0210 }
        r2 = com.whatsapp.v.b(r2);	 Catch:{ IOException -> 0x0210 }
        r0 = r17;
        r0.r = r2;	 Catch:{ IOException -> 0x0210 }
    L_0x01ce:
        r0 = r17;
        r2 = r0.r;	 Catch:{ IOException -> 0x0212 }
        r2 = r2.w();	 Catch:{ IOException -> 0x0212 }
        r0 = r17;
        r0.aQ = r2;	 Catch:{ IOException -> 0x0212 }
        r0 = r17;
        r2 = r0.r;	 Catch:{ IOException -> 0x0212 }
        r2 = r2.l();	 Catch:{ IOException -> 0x0212 }
        r0 = r17;
        r0.an = r2;	 Catch:{ IOException -> 0x0212 }
        D(r17);	 Catch:{ IOException -> 0x0212 }
        r0 = r17;
        r2 = r0.r;	 Catch:{ IOException -> 0x0212 }
        if (r2 != 0) goto L_0x0214;
    L_0x01ef:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0212 }
        r2.<init>();	 Catch:{ IOException -> 0x0212 }
        r3 = cb;	 Catch:{ IOException -> 0x0212 }
        r4 = 50;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0212 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0212 }
        r0 = r17;
        r3 = r0.u;	 Catch:{ IOException -> 0x0212 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0212 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0212 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0212 }
        r2 = 0;
        goto L_0x00b6;
    L_0x0210:
        r2 = move-exception;
        throw r2;
    L_0x0212:
        r2 = move-exception;
        throw r2;
    L_0x0214:
        r0 = r17;
        r2 = r0.r;
        r2 = r2.a;
        r0 = r17;
        r0.o = r2;
        r2 = new java.util.HashMap;
        r2.<init>();
        r0 = r17;
        r0.aN = r2;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = r17;
        r0.aL = r2;
        r2 = new java.util.HashSet;
        r2.<init>();
        r0 = r17;
        r0.l = r2;
        r2 = 1;
        r0 = r17;
        r0.aK = r2;
        r2 = new com.whatsapp.a35;
        r0 = r17;
        r3 = r0.R;
        r4 = 0;
        r0 = r17;
        r1 = r17;
        r2.<init>(r0, r1, r3, r4);
        r0 = r17;
        r0.aS = r2;
        r0 = r17;
        r2 = r0.aS;
        r0 = r17;
        r3 = r0.aT;
        r2.registerDataSetObserver(r3);
        r0 = r17;
        r2 = r0.bd;
        r0 = r17;
        r3 = r0.aS;
        r2.setAdapter(r3);
        r0 = r17;
        r2 = r0.r;
        r3 = 0;
        r4 = 1;
        com.whatsapp.App.a(r2, r3, r4);
        r2 = com.whatsapp.notification.q.c();
        r2.a();
        r2 = com.whatsapp.notification.AndroidWear.b();
        if (r2 == 0) goto L_0x02a3;
    L_0x027c:
        r2 = com.whatsapp.v.b();
        r3 = r2.iterator();
    L_0x0284:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x02a3;
    L_0x028a:
        r2 = r3.next();
        r2 = (java.lang.String) r2;
        r4 = com.whatsapp.App.P;	 Catch:{ IOException -> 0x04d9 }
        r4 = r4.a(r2);	 Catch:{ IOException -> 0x04d9 }
        r4 = r4.a;	 Catch:{ IOException -> 0x04d9 }
        if (r4 <= 0) goto L_0x02a1;
    L_0x029a:
        r4 = com.whatsapp.notification.q.c();	 Catch:{ IOException -> 0x04d9 }
        r4.c(r2);	 Catch:{ IOException -> 0x04d9 }
    L_0x02a1:
        if (r12 == 0) goto L_0x0284;
    L_0x02a3:
        r2 = 0;
        r0 = r17;
        r0.aO = r2;	 Catch:{ IOException -> 0x04db }
        r0 = r17;
        r2 = r0.af;	 Catch:{ IOException -> 0x04db }
        if (r2 != 0) goto L_0x02bc;
    L_0x02ae:
        r2 = com.whatsapp.App.aJ;	 Catch:{ IOException -> 0x04db }
        r0 = r17;
        r3 = r0.am;	 Catch:{ IOException -> 0x04db }
        r2.b(r3);	 Catch:{ IOException -> 0x04db }
        r2 = 1;
        r0 = r17;
        r0.af = r2;	 Catch:{ IOException -> 0x04db }
    L_0x02bc:
        r14 = r17.getIntent();
        r2 = cb;	 Catch:{ IOException -> 0x04dd }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ IOException -> 0x04dd }
        r3 = 0;
        r2 = r14.getBooleanExtra(r2, r3);	 Catch:{ IOException -> 0x04dd }
        if (r2 == 0) goto L_0x042a;
    L_0x02cd:
        r0 = r17;
        r2 = r0.E;	 Catch:{ IOException -> 0x04dd }
        if (r2 != 0) goto L_0x042a;
    L_0x02d3:
        r2 = ah;	 Catch:{ IOException -> 0x04df }
        if (r2 == 0) goto L_0x042a;
    L_0x02d7:
        r2 = cb;	 Catch:{ IOException -> 0x04e1 }
        r3 = 47;
        r2 = r2[r3];	 Catch:{ IOException -> 0x04e1 }
        r3 = 0;
        r14.putExtra(r2, r3);	 Catch:{ IOException -> 0x04e1 }
        r2 = 0;
        ah = r2;	 Catch:{ IOException -> 0x04e1 }
        r2 = 1;
        r0 = r17;
        r0.F = r2;	 Catch:{ IOException -> 0x04e1 }
        if (r18 != 0) goto L_0x042a;
    L_0x02eb:
        r2 = r14.getExtras();
        r3 = cb;
        r4 = 45;
        r3 = r3[r4];
        r11 = r2.getByte(r3);
        r2 = cb;
        r3 = 40;
        r2 = r2[r3];
        r2 = r14.getParcelableArrayListExtra(r2);
        if (r2 == 0) goto L_0x03d7;
    L_0x0305:
        r15 = new java.util.ArrayList;
        r15.<init>();
        r16 = r2.iterator();
    L_0x030e:
        r2 = r16.hasNext();
        if (r2 == 0) goto L_0x0351;
    L_0x0314:
        r2 = r16.next();
        r10 = r2;
        r10 = (android.net.Uri) r10;
        if (r11 >= 0) goto L_0x0617;
    L_0x031d:
        r2 = com.whatsapp.util.f.a(r10);	 Catch:{ IOException -> 0x0568, OutOfMemoryError -> 0x05c8 }
    L_0x0321:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r3.<init>();	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r4 = cb;	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r5 = 29;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r3 = r3.append(r2);	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r4 = cb;	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r3 = r3.append(r10);	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        switch(r2) {
            case 1: goto L_0x0542;
            case 2: goto L_0x04e3;
            case 3: goto L_0x04f6;
            case 4: goto L_0x0547;
            default: goto L_0x034c;
        };
    L_0x034c:
        r17.finish();	 Catch:{ IOException -> 0x05c6, OutOfMemoryError -> 0x05c8 }
    L_0x034f:
        if (r12 == 0) goto L_0x030e;
    L_0x0351:
        r2 = r15.isEmpty();	 Catch:{ IOException -> 0x05fd }
        if (r2 != 0) goto L_0x03d5;
    L_0x0357:
        r2 = cb;	 Catch:{ IOException -> 0x05ff }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ IOException -> 0x05ff }
        r3 = 0;
        r2 = r14.getBooleanExtra(r2, r3);	 Catch:{ IOException -> 0x05ff }
        if (r2 == 0) goto L_0x036b;
    L_0x0364:
        r0 = r17;
        r0.a(r15);	 Catch:{ IOException -> 0x05ff }
        if (r12 == 0) goto L_0x03d5;
    L_0x036b:
        r3 = new android.content.Intent;
        r2 = com.whatsapp.gallerypicker.ImagePreview.class;
        r0 = r17;
        r3.<init>(r0, r2);
        r0 = r17;
        r2 = r0.r;
        r2 = r2.w();
        if (r2 == 0) goto L_0x0399;
    L_0x037e:
        r2 = 2131624364; // 0x7f0e01ac float:1.8875906E38 double:1.053162368E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r0 = r17;
        r6 = r0.r;
        r0 = r17;
        r6 = r6.a(r0);
        r4[r5] = r6;
        r0 = r17;
        r2 = r0.getString(r2, r4);
        if (r12 == 0) goto L_0x03b2;
    L_0x0399:
        r2 = 2131624827; // 0x7f0e037b float:1.8876845E38 double:1.053162597E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r0 = r17;
        r6 = r0.r;
        r0 = r17;
        r6 = r6.a(r0);
        r4[r5] = r6;
        r0 = r17;
        r2 = r0.getString(r2, r4);
    L_0x03b2:
        r4 = cb;
        r5 = 34;
        r4 = r4[r5];
        r3.putExtra(r4, r2);
        r2 = cb;
        r4 = 39;
        r2 = r2[r4];
        r4 = 0;
        r3.putExtra(r2, r4);
        r2 = cb;
        r4 = 23;
        r2 = r2[r4];
        r3.putExtra(r2, r15);
        r2 = 14;
        r0 = r17;
        r0.startActivityForResult(r3, r2);
    L_0x03d5:
        if (r12 == 0) goto L_0x042a;
    L_0x03d7:
        r2 = 4;
        if (r11 != r2) goto L_0x03f7;
    L_0x03da:
        r0 = r17;
        r2 = r0.u;	 Catch:{ IOException -> 0x0601 }
        r3 = cb;	 Catch:{ IOException -> 0x0601 }
        r4 = 35;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0601 }
        r3 = r14.getStringExtra(r3);	 Catch:{ IOException -> 0x0601 }
        r4 = cb;	 Catch:{ IOException -> 0x0601 }
        r5 = 30;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0601 }
        r4 = r14.getStringExtra(r4);	 Catch:{ IOException -> 0x0601 }
        com.whatsapp.App.d(r2, r3, r4);	 Catch:{ IOException -> 0x0601 }
        if (r12 == 0) goto L_0x042a;
    L_0x03f7:
        r2 = cb;
        r3 = 46;
        r2 = r2[r3];
        r2 = r14.getStringExtra(r2);
        if (r2 == 0) goto L_0x042a;
    L_0x0403:
        r3 = r2.length();	 Catch:{ IOException -> 0x0603 }
        if (r3 <= 0) goto L_0x042a;
    L_0x0409:
        r3 = cb;	 Catch:{ IOException -> 0x0605 }
        r4 = 36;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0605 }
        r4 = 0;
        r3 = r14.getBooleanExtra(r3, r4);	 Catch:{ IOException -> 0x0605 }
        if (r3 == 0) goto L_0x0423;
    L_0x0416:
        r3 = a1;	 Catch:{ IOException -> 0x0607 }
        r0 = r17;
        r4 = r0.r;	 Catch:{ IOException -> 0x0607 }
        r4 = r4.e;	 Catch:{ IOException -> 0x0607 }
        r3.put(r4, r2);	 Catch:{ IOException -> 0x0607 }
        if (r12 == 0) goto L_0x042a;
    L_0x0423:
        r0 = r17;
        r3 = r0.r;	 Catch:{ IOException -> 0x0607 }
        com.whatsapp.App.a(r3, r2);	 Catch:{ IOException -> 0x0607 }
    L_0x042a:
        r2 = a1;
        r0 = r17;
        r3 = r0.r;
        r3 = r3.e;
        r2 = r2.get(r3);
        r2 = (java.lang.String) r2;
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IOException -> 0x0609 }
        if (r3 != 0) goto L_0x046f;
    L_0x043e:
        r0 = r17;
        r3 = r0.a2;	 Catch:{ IOException -> 0x060b }
        r4 = r17.getBaseContext();	 Catch:{ IOException -> 0x060b }
        r2 = com.whatsapp.util.a5.d(r2, r4);	 Catch:{ IOException -> 0x060b }
        r3.setText(r2);	 Catch:{ IOException -> 0x060b }
        r0 = r17;
        r2 = r0.ab;	 Catch:{ IOException -> 0x060b }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IOException -> 0x060b }
        r2 = com.whatsapp.App.G();	 Catch:{ IOException -> 0x060b }
        if (r2 == 0) goto L_0x0465;
    L_0x045c:
        r0 = r17;
        r2 = r0.a6;	 Catch:{ IOException -> 0x060b }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IOException -> 0x060b }
    L_0x0465:
        r0 = r17;
        r2 = r0.aP;	 Catch:{ IOException -> 0x060d }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IOException -> 0x060d }
        if (r12 == 0) goto L_0x0496;
    L_0x046f:
        r0 = r17;
        r2 = r0.a2;	 Catch:{ IOException -> 0x060f }
        r3 = 0;
        r2.setText(r3);	 Catch:{ IOException -> 0x060f }
        r0 = r17;
        r2 = r0.ab;	 Catch:{ IOException -> 0x060f }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IOException -> 0x060f }
        r2 = com.whatsapp.App.G();	 Catch:{ IOException -> 0x060f }
        if (r2 == 0) goto L_0x048d;
    L_0x0485:
        r0 = r17;
        r2 = r0.a6;	 Catch:{ IOException -> 0x060f }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IOException -> 0x060f }
    L_0x048d:
        r0 = r17;
        r2 = r0.aP;
        r3 = 8;
        r2.setVisibility(r3);
    L_0x0496:
        r17.e();	 Catch:{ IOException -> 0x0611 }
        r0 = r17;
        r2 = r0.aW;	 Catch:{ IOException -> 0x0611 }
        r0 = r17;
        r3 = r0.a2;	 Catch:{ IOException -> 0x0611 }
        r3 = r3.getWindowToken();	 Catch:{ IOException -> 0x0611 }
        r4 = 0;
        r2.hideSoftInputFromWindow(r3, r4);	 Catch:{ IOException -> 0x0611 }
        r0 = r17;
        r2 = r0.a2;	 Catch:{ IOException -> 0x0611 }
        r2.requestFocus();	 Catch:{ IOException -> 0x0611 }
        if (r18 == 0) goto L_0x04bf;
    L_0x04b2:
        r17.E();	 Catch:{ IOException -> 0x0611 }
        r0 = r17;
        r2 = r0.aS;	 Catch:{ IOException -> 0x0611 }
        r2.notifyDataSetChanged();	 Catch:{ IOException -> 0x0611 }
        r17.q();	 Catch:{ IOException -> 0x0611 }
    L_0x04bf:
        r2 = com.whatsapp.Voip.f();	 Catch:{ IOException -> 0x0613 }
        if (r2 == 0) goto L_0x04ca;
    L_0x04c5:
        r17.z();	 Catch:{ IOException -> 0x0615 }
        if (r12 == 0) goto L_0x04d3;
    L_0x04ca:
        r0 = r17;
        r2 = r0.y;	 Catch:{ IOException -> 0x0615 }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IOException -> 0x0615 }
    L_0x04d3:
        r13.c();
        r2 = 1;
        goto L_0x00b6;
    L_0x04d9:
        r2 = move-exception;
        throw r2;
    L_0x04db:
        r2 = move-exception;
        throw r2;
    L_0x04dd:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x04df }
    L_0x04df:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x04e1 }
    L_0x04e1:
        r2 = move-exception;
        throw r2;
    L_0x04e3:
        r0 = r17;
        r4 = r0.u;	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r5 = com.whatsapp.util.f.e(r10);	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        r6 = 2;
        r7 = 1;
        r2 = r17;
        r3 = r17;
        com.whatsapp.util.f.a(r2, r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x0566, OutOfMemoryError -> 0x05c8 }
        if (r12 == 0) goto L_0x034f;
    L_0x04f6:
        r5 = com.whatsapp.util.f.e(r10);	 Catch:{ IOException -> 0x0568, OutOfMemoryError -> 0x05c8 }
        r2 = cb;	 Catch:{ IOException -> 0x0568, OutOfMemoryError -> 0x05c8 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0568, OutOfMemoryError -> 0x05c8 }
        r9 = r10.getQueryParameter(r2);	 Catch:{ IOException -> 0x0568, OutOfMemoryError -> 0x05c8 }
        r2 = cb;	 Catch:{ IOException -> 0x05ba, OutOfMemoryError -> 0x05c8 }
        r3 = 42;
        r2 = r2[r3];	 Catch:{ IOException -> 0x05ba, OutOfMemoryError -> 0x05c8 }
        r3 = 0;
        r2 = r14.getBooleanExtra(r2, r3);	 Catch:{ IOException -> 0x05ba, OutOfMemoryError -> 0x05c8 }
        if (r2 == 0) goto L_0x0521;
    L_0x0511:
        r0 = r17;
        r4 = r0.u;	 Catch:{ IOException -> 0x05ba, OutOfMemoryError -> 0x05c8 }
        r6 = 3;
        r7 = 0;
        r8 = 1;
        r2 = r17;
        r3 = r17;
        com.whatsapp.util.f.a(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ IOException -> 0x05ba, OutOfMemoryError -> 0x05c8 }
        if (r12 == 0) goto L_0x034f;
    L_0x0521:
        r2 = com.whatsapp.id.a(r5);	 Catch:{ IOException -> 0x05bc, OutOfMemoryError -> 0x05c8 }
        if (r2 == 0) goto L_0x0532;
    L_0x0527:
        r0 = r17;
        r2 = r0.r;	 Catch:{ IOException -> 0x05be, OutOfMemoryError -> 0x05c8 }
        r0 = r17;
        com.whatsapp.VideoPreviewActivity.a(r0, r2, r5);	 Catch:{ IOException -> 0x05be, OutOfMemoryError -> 0x05c8 }
        if (r12 == 0) goto L_0x034f;
    L_0x0532:
        r0 = r17;
        r4 = r0.u;	 Catch:{ IOException -> 0x05c0, OutOfMemoryError -> 0x05c8 }
        r6 = 3;
        r7 = 0;
        r8 = 1;
        r2 = r17;
        r3 = r17;
        com.whatsapp.util.f.a(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ IOException -> 0x05c0, OutOfMemoryError -> 0x05c8 }
        if (r12 == 0) goto L_0x034f;
    L_0x0542:
        r15.add(r10);	 Catch:{ IOException -> 0x05c2, OutOfMemoryError -> 0x05c8 }
        if (r12 == 0) goto L_0x034f;
    L_0x0547:
        r0 = r17;
        r2 = r0.u;	 Catch:{ IOException -> 0x05c4, OutOfMemoryError -> 0x05c8 }
        r3 = cb;	 Catch:{ IOException -> 0x05c4, OutOfMemoryError -> 0x05c8 }
        r4 = 28;
        r3 = r3[r4];	 Catch:{ IOException -> 0x05c4, OutOfMemoryError -> 0x05c8 }
        r3 = r14.getStringExtra(r3);	 Catch:{ IOException -> 0x05c4, OutOfMemoryError -> 0x05c8 }
        r4 = cb;	 Catch:{ IOException -> 0x05c4, OutOfMemoryError -> 0x05c8 }
        r5 = 32;
        r4 = r4[r5];	 Catch:{ IOException -> 0x05c4, OutOfMemoryError -> 0x05c8 }
        r4 = r14.getStringExtra(r4);	 Catch:{ IOException -> 0x05c4, OutOfMemoryError -> 0x05c8 }
        com.whatsapp.App.d(r2, r3, r4);	 Catch:{ IOException -> 0x05c4, OutOfMemoryError -> 0x05c8 }
        if (r12 == 0) goto L_0x034f;
    L_0x0564:
        goto L_0x034c;
    L_0x0566:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0568, OutOfMemoryError -> 0x05c8 }
    L_0x0568:
        r2 = move-exception;
        r3 = r2.getMessage();	 Catch:{ IOException -> 0x05f7 }
        if (r3 == 0) goto L_0x058f;
    L_0x056f:
        r3 = r2.getMessage();	 Catch:{ IOException -> 0x05f9 }
        r4 = cb;	 Catch:{ IOException -> 0x05f9 }
        r5 = 26;
        r4 = r4[r5];	 Catch:{ IOException -> 0x05f9 }
        r3 = r3.contains(r4);	 Catch:{ IOException -> 0x05f9 }
        if (r3 == 0) goto L_0x058f;
    L_0x057f:
        r3 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x05fb }
        r4 = 2131624285; // 0x7f0e015d float:1.8875745E38 double:1.053162329E-314;
        r3 = r3.getString(r4);	 Catch:{ IOException -> 0x05fb }
        r0 = r17;
        com.whatsapp.App.a(r0, r3);	 Catch:{ IOException -> 0x05fb }
        if (r12 == 0) goto L_0x059a;
    L_0x058f:
        r3 = r17.getBaseContext();	 Catch:{ IOException -> 0x05fb }
        r4 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r5 = 0;
        com.whatsapp.App.b(r3, r4, r5);	 Catch:{ IOException -> 0x05fb }
    L_0x059a:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = cb;
        r5 = 33;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r2.toString();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        goto L_0x0351;
    L_0x05ba:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05bc, OutOfMemoryError -> 0x05c8 }
    L_0x05bc:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05be, OutOfMemoryError -> 0x05c8 }
    L_0x05be:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05c0, OutOfMemoryError -> 0x05c8 }
    L_0x05c0:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05c2, OutOfMemoryError -> 0x05c8 }
    L_0x05c2:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05c4, OutOfMemoryError -> 0x05c8 }
    L_0x05c4:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05c6, OutOfMemoryError -> 0x05c8 }
    L_0x05c6:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0568, OutOfMemoryError -> 0x05c8 }
    L_0x05c8:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = cb;
        r5 = 21;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r2.toString();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r2 = com.whatsapp.App.p;
        r3 = 2131624289; // 0x7f0e0161 float:1.8875754E38 double:1.053162331E-314;
        r2 = r2.getString(r3);
        r0 = r17;
        com.whatsapp.App.a(r0, r2);
        goto L_0x0351;
    L_0x05f7:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05f9 }
    L_0x05f9:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05fb }
    L_0x05fb:
        r2 = move-exception;
        throw r2;
    L_0x05fd:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05ff }
    L_0x05ff:
        r2 = move-exception;
        throw r2;
    L_0x0601:
        r2 = move-exception;
        throw r2;
    L_0x0603:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0605 }
    L_0x0605:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0607 }
    L_0x0607:
        r2 = move-exception;
        throw r2;
    L_0x0609:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x060b }
    L_0x060b:
        r2 = move-exception;
        throw r2;
    L_0x060d:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x060f }
    L_0x060f:
        r2 = move-exception;
        throw r2;
    L_0x0611:
        r2 = move-exception;
        throw r2;
    L_0x0613:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0615 }
    L_0x0615:
        r2 = move-exception;
        throw r2;
    L_0x0617:
        r2 = r11;
        goto L_0x0321;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.h(java.lang.String):boolean");
    }

    private void d(b bVar) {
        this.bd.post(new _i(this, bVar));
    }

    static void c(Conversation conversation, String str) {
        conversation.g(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r3, android.view.KeyEvent r4) {
        /*
        r2_this = this;
        r0 = r4.isPrintingKey();	 Catch:{ RuntimeException -> 0x0020 }
        if (r0 == 0) goto L_0x0026;
    L_0x0006:
        r0 = r2.a2;	 Catch:{ RuntimeException -> 0x0022 }
        r0 = r0.isShown();	 Catch:{ RuntimeException -> 0x0022 }
        if (r0 == 0) goto L_0x004d;
    L_0x000e:
        r0 = r2.a2;	 Catch:{ RuntimeException -> 0x0024 }
        r0 = r0.hasFocus();	 Catch:{ RuntimeException -> 0x0024 }
        if (r0 != 0) goto L_0x004d;
    L_0x0016:
        r0 = r2.a2;	 Catch:{ RuntimeException -> 0x0024 }
        r0.requestFocus();	 Catch:{ RuntimeException -> 0x0024 }
        r2.dispatchKeyEvent(r4);	 Catch:{ RuntimeException -> 0x0024 }
        r0 = 1;
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = 82;
        if (r3 != r0) goto L_0x004d;
    L_0x002a:
        r0 = r2.aG;	 Catch:{ RuntimeException -> 0x0052 }
        if (r0 == 0) goto L_0x004d;
    L_0x002e:
        r0 = r2.aI;	 Catch:{ RuntimeException -> 0x0054 }
        if (r0 != 0) goto L_0x0042;
    L_0x0032:
        r0 = com.whatsapp.App.aJ;	 Catch:{ RuntimeException -> 0x0054 }
        r1 = r2.r;	 Catch:{ RuntimeException -> 0x0054 }
        r1 = r1.e;	 Catch:{ RuntimeException -> 0x0054 }
        r0 = r0.s(r1);	 Catch:{ RuntimeException -> 0x0054 }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ RuntimeException -> 0x0054 }
        r2.aI = r0;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x0042:
        r0 = r2.aG;
        r1 = r2.aI;
        r1 = r1.booleanValue();
        r0.setEnabled(r1);
    L_0x004d:
        r0 = super.onKeyDown(r3, r4);
        goto L_0x001f;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    static View a(Conversation conversation, View view) {
        conversation.aR = view;
        return view;
    }

    static Handler G(Conversation conversation) {
        return conversation.S;
    }

    static ViewGroup I(Conversation conversation) {
        return conversation.Z;
    }

    static ImageView f(Conversation conversation) {
        return conversation.s;
    }

    static int c(Conversation conversation, int i) {
        conversation.a0 = i;
        return i;
    }

    static void ad(Conversation conversation) {
        conversation.B();
    }

    public void d(String str) {
        try {
            if (str.equals(this.u)) {
                findViewById(R.id.change_photo_progress).setVisibility(8);
                this.s.setVisibility(0);
                E();
            }
            this.bd.post(new yd(this, str));
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static void y() {
        a4 = true;
    }

    static boolean d(Conversation conversation, boolean z) {
        conversation.ao = z;
        return z;
    }

    static void d(Conversation conversation, b bVar) {
        conversation.k(bVar);
    }

    static MenuItem n(Conversation conversation) {
        return conversation.aG;
    }

    private boolean c(boolean z) {
        try {
            this.aA = ac.a((Activity) this, z);
            if (this.aA != null) {
                showDialog(116);
            }
            try {
                return this.aA != null;
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static boolean g(Conversation conversation) {
        return conversation.I;
    }

    private void c(String str, int i) {
        Intent intent = new Intent(cb[248]);
        try {
            intent.setType(cb[249]);
            switch (i) {
                case 102:
                    intent.putExtra(cb[247], str);
                    break;
            }
            intent.setFlags(524288);
            startActivity(intent);
            T = false;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private void w() {
        View findViewById = findViewById(R.id.emoji_ancor);
        int[] iArr = new int[2];
        findViewById.getLocationOnScreen(iArr);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        try {
            if (((float) (defaultDisplay.getHeight() - (findViewById.getHeight() + iArr[1]))) > 128.0f * this.W.g) {
                this.aX.a(findViewById(R.id.emoji_ancor), this.aB, this.aP, true);
                if (App.az == 0) {
                    return;
                }
            }
            int a = this.aX.a();
            Log.i(cb[51] + a);
            if (a == 0) {
                a = (defaultDisplay.getHeight() * 2) / 5;
            }
            a = Math.max(a, this.W.f * 4);
            this.bd.setTranscriptMode(2);
            this.bd.setFastScrollEnabled(false);
            this.n.sendEmptyMessageDelayed(0, 1000);
            this.aX.a(findViewById(R.id.emoji_ancor), this.aB, this.aP, false);
            this.Z.getLayoutParams().height = a;
            this.Z.setVisibility(0);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static ConversationRow a(Context context, b bVar) {
        try {
            switch (bVar.j) {
                case PBE.MD5 /*0*/:
                    return bVar.a == 6 ? new ConversationRowDivider(context, bVar) : new ConversationRowText(context, bVar);
                case ay.f /*1*/:
                    return new ConversationRowImage(context, bVar);
                case ay.n /*2*/:
                    try {
                        return bVar.w == 1 ? new ConversationRowVoiceNote(context, bVar) : new ConversationRowAudio(context, bVar);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                case ay.p /*3*/:
                    return new ConversationRowVideo(context, bVar);
                case aj.i /*4*/:
                    return new ConversationRowContact(context, bVar);
                case aV.r /*5*/:
                    return new ConversationRowLocation(context, bVar);
                case a8.n /*8*/:
                    return new ConversationRowCall(context, bVar);
                default:
                    try {
                        if (bVar.a == -1) {
                            if (bVar.j == (byte) -1) {
                                return new ConversationRowDivider(context, bVar);
                            }
                        }
                        return null;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (RuntimeException e22) {
                        throw e22;
                    }
            }
        } catch (RuntimeException e222) {
            throw e222;
        } catch (RuntimeException e2222) {
            throw e2222;
        }
        throw e2222;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        try {
            if (this.aK) {
                try {
                    if (!cb.s()) {
                        try {
                            z = super.dispatchTouchEvent(motionEvent);
                        } catch (ActivityNotFoundException e) {
                            Log.e(cb[60] + e.toString());
                            App.b((Context) this, (int) R.string.activity_not_found, 0);
                        } catch (IllegalArgumentException e2) {
                            Log.e(cb[61] + e2.toString());
                        }
                    }
                } catch (ActivityNotFoundException e3) {
                    throw e3;
                }
            }
            return z;
        } catch (ActivityNotFoundException e32) {
            throw e32;
        }
    }

    static void a(Activity activity, ho hoVar, m8 m8Var, boolean z) {
        hoVar.a(R.string.register_xmpp_title, R.string.register_wait_message);
        br.a(new yp(m8Var, z, new Handler(), hoVar, activity));
    }

    public static void C() {
        Conversation conversation = null;
        if (r()) {
            conversation = t();
        } else {
            try {
                if (!(aD == null || aD.isFinishing())) {
                    conversation = aD;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        if (conversation != null) {
            Cursor a = App.aJ.a(conversation.u, conversation.b(false), conversation.p);
            conversation.a(a);
            conversation.aS.changeCursor(a);
            conversation.aS.getCursor().requery();
        }
    }

    static void a(Conversation conversation, String str, boolean z) {
        conversation.a(str, z);
    }

    private boolean G() {
        return getSharedPreferences(cb[256], 0).getBoolean(cb[257], false);
    }

    static ArrayList e(Conversation conversation) {
        return conversation.aL;
    }

    static int a(b bVar) {
        return h(bVar);
    }

    static boolean t(Conversation conversation) {
        return conversation.A;
    }

    static void b(Conversation conversation, b bVar) {
        conversation.j(bVar);
    }

    static void a(Conversation conversation, boolean z) {
        conversation.a(z);
    }

    private boolean a(int i, String str, int i2) {
        int i3 = App.az;
        switch (i) {
            case a6.s /*12*/:
                try {
                    switch (i2) {
                        case 101:
                            a(str, false);
                            if (i3 == 0) {
                                return true;
                            }
                            break;
                        case 102:
                            break;
                        default:
                            return true;
                    }
                    b(str, 102);
                    return true;
                } catch (RuntimeException e) {
                    throw e;
                }
            case a6.z /*13*/:
                try {
                    switch (i2) {
                        case 101:
                            b(str, false);
                            if (i3 == 0) {
                                return true;
                            }
                            break;
                        case 102:
                            break;
                        default:
                            return true;
                    }
                    c(str, 102);
                    return true;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            default:
                return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(com.actionbarsherlock.view.Menu r6) {
        /*
        r5_this = this;
        r4 = 0;
        r3 = 1;
        r0 = com.whatsapp.App.az;
        r1 = cb;	 Catch:{ RuntimeException -> 0x0108 }
        r2 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0108 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0108 }
        r1 = r5.r;	 Catch:{ RuntimeException -> 0x0108 }
        if (r1 == 0) goto L_0x0103;
    L_0x0011:
        r1 = r5.aQ;	 Catch:{ RuntimeException -> 0x010a }
        if (r1 != 0) goto L_0x007a;
    L_0x0015:
        r1 = r5.an;	 Catch:{ RuntimeException -> 0x010a }
        if (r1 != 0) goto L_0x007a;
    L_0x0019:
        r1 = r6.findItem(r3);
        r2 = r5.r;	 Catch:{ RuntimeException -> 0x010c }
        r2 = r2.h;	 Catch:{ RuntimeException -> 0x010c }
        if (r2 == 0) goto L_0x0034;
    L_0x0023:
        r2 = 0;
        r5.ag = r2;	 Catch:{ RuntimeException -> 0x010e }
        r2 = 2131625074; // 0x7f0e0472 float:1.8877346E38 double:1.053162719E-314;
        r1.setTitle(r2);	 Catch:{ RuntimeException -> 0x010e }
        r2 = 2130838839; // 0x7f020537 float:1.7282672E38 double:1.052774267E-314;
        r1.setIcon(r2);	 Catch:{ RuntimeException -> 0x010e }
        if (r0 == 0) goto L_0x0043;
    L_0x0034:
        r2 = 1;
        r5.ag = r2;	 Catch:{ RuntimeException -> 0x010e }
        r2 = 2131623974; // 0x7f0e0026 float:1.8875115E38 double:1.0531621754E-314;
        r1.setTitle(r2);	 Catch:{ RuntimeException -> 0x010e }
        r2 = 2130838832; // 0x7f020530 float:1.7282657E38 double:1.0527742637E-314;
        r1.setIcon(r2);	 Catch:{ RuntimeException -> 0x010e }
    L_0x0043:
        r1 = 4;
        r1 = r6.findItem(r1);
        r2 = r5.r;
        r2 = r2.e;
        r2 = com.whatsapp.App.c(r2);
        if (r2 == 0) goto L_0x0066;
    L_0x0052:
        r5.a5 = r4;
        r2 = 2131625034; // 0x7f0e044a float:1.8877265E38 double:1.053162699E-314;
        r2 = r5.getString(r2);
        r1.setTitle(r2);
        r2 = 17301555; // 0x1080033 float:2.4979398E-38 double:8.548104E-317;
        r1.setIcon(r2);
        if (r0 == 0) goto L_0x0078;
    L_0x0066:
        r5.a5 = r3;
        r2 = 2131624027; // 0x7f0e005b float:1.8875222E38 double:1.0531622016E-314;
        r2 = r5.getString(r2);
        r1.setTitle(r2);
        r2 = 2130838834; // 0x7f020532 float:1.7282662E38 double:1.0527742647E-314;
        r1.setIcon(r2);
    L_0x0078:
        if (r0 == 0) goto L_0x00a6;
    L_0x007a:
        r1 = r5.aQ;	 Catch:{ RuntimeException -> 0x0110 }
        if (r1 == 0) goto L_0x00a6;
    L_0x007e:
        r1 = 10;
        r1 = r6.findItem(r1);
        r2 = r5.u;	 Catch:{ RuntimeException -> 0x0112 }
        r2 = com.whatsapp.notification.t.e(r5, r2);	 Catch:{ RuntimeException -> 0x0112 }
        if (r2 == 0) goto L_0x009a;
    L_0x008c:
        r2 = 2131624513; // 0x7f0e0241 float:1.8876208E38 double:1.0531624417E-314;
        r1.setTitle(r2);	 Catch:{ RuntimeException -> 0x0114 }
        r2 = 2130838850; // 0x7f020542 float:1.7282694E38 double:1.0527742726E-314;
        r1.setIcon(r2);	 Catch:{ RuntimeException -> 0x0114 }
        if (r0 == 0) goto L_0x00a6;
    L_0x009a:
        r2 = 2131624512; // 0x7f0e0240 float:1.8876206E38 double:1.053162441E-314;
        r1.setTitle(r2);	 Catch:{ RuntimeException -> 0x0114 }
        r2 = 2130838849; // 0x7f020541 float:1.7282692E38 double:1.052774272E-314;
        r1.setIcon(r2);	 Catch:{ RuntimeException -> 0x0114 }
    L_0x00a6:
        r1 = r5.aS;	 Catch:{ RuntimeException -> 0x0116 }
        r1 = r1.getCount();	 Catch:{ RuntimeException -> 0x0116 }
        if (r1 <= 0) goto L_0x00cd;
    L_0x00ae:
        r1 = 7;
        r1 = r6.findItem(r1);	 Catch:{ RuntimeException -> 0x0118 }
        r2 = 1;
        r1.setVisible(r2);	 Catch:{ RuntimeException -> 0x0118 }
        r1 = 8;
        r1 = r6.findItem(r1);	 Catch:{ RuntimeException -> 0x0118 }
        r2 = 1;
        r1.setVisible(r2);	 Catch:{ RuntimeException -> 0x0118 }
        r1 = 14;
        r1 = r6.findItem(r1);	 Catch:{ RuntimeException -> 0x0118 }
        r2 = 1;
        r1.setVisible(r2);	 Catch:{ RuntimeException -> 0x0118 }
        if (r0 == 0) goto L_0x00ea;
    L_0x00cd:
        r1 = 7;
        r1 = r6.findItem(r1);	 Catch:{ RuntimeException -> 0x0118 }
        r2 = 0;
        r1.setVisible(r2);	 Catch:{ RuntimeException -> 0x0118 }
        r1 = 8;
        r1 = r6.findItem(r1);	 Catch:{ RuntimeException -> 0x0118 }
        r2 = 0;
        r1.setVisible(r2);	 Catch:{ RuntimeException -> 0x0118 }
        r1 = 14;
        r1 = r6.findItem(r1);	 Catch:{ RuntimeException -> 0x0118 }
        r2 = 0;
        r1.setVisible(r2);	 Catch:{ RuntimeException -> 0x0118 }
    L_0x00ea:
        r1 = 3;
        r1 = r6.findItem(r1);
        r2 = r1.getSubMenu();
        r2 = r2.hasVisibleItems();	 Catch:{ RuntimeException -> 0x011a }
        if (r2 == 0) goto L_0x00ff;
    L_0x00f9:
        r2 = 1;
        r1.setVisible(r2);	 Catch:{ RuntimeException -> 0x011c }
        if (r0 == 0) goto L_0x0103;
    L_0x00ff:
        r0 = 0;
        r1.setVisible(r0);	 Catch:{ RuntimeException -> 0x011c }
    L_0x0103:
        r0 = super.onPrepareOptionsMenu(r6);
        return r0;
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x010a }
    L_0x010a:
        r0 = move-exception;
        throw r0;
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x010e }
    L_0x010e:
        r0 = move-exception;
        throw r0;
    L_0x0110:
        r0 = move-exception;
        throw r0;
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        throw r0;
    L_0x0116:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x011c }
    L_0x011c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onPrepareOptionsMenu(com.actionbarsherlock.view.Menu):boolean");
    }

    static void f(Conversation conversation, b bVar) {
        conversation.e(bVar);
    }

    static HashMap y(Conversation conversation) {
        return conversation.aN;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.ArrayList r6) {
        /*
        r5_this = this;
        r4 = 0;
        r1 = com.whatsapp.App.az;
        r2 = r6.iterator();	 Catch:{ IOException -> 0x001b, bx -> 0x006b, OutOfMemoryError -> 0x0093, SecurityException -> 0x00bc }
    L_0x0007:
        r0 = r2.hasNext();	 Catch:{ IOException -> 0x001b, bx -> 0x006b, OutOfMemoryError -> 0x0093, SecurityException -> 0x00bc }
        if (r0 == 0) goto L_0x001a;
    L_0x000d:
        r0 = r2.next();	 Catch:{ IOException -> 0x001b, bx -> 0x006b, OutOfMemoryError -> 0x0093, SecurityException -> 0x00bc }
        r0 = (android.net.Uri) r0;	 Catch:{ IOException -> 0x001b, bx -> 0x006b, OutOfMemoryError -> 0x0093, SecurityException -> 0x00bc }
        r3 = r5.u;	 Catch:{ IOException -> 0x001b, bx -> 0x006b, OutOfMemoryError -> 0x0093, SecurityException -> 0x00bc }
        com.whatsapp.util.f.a(r3, r0);	 Catch:{ IOException -> 0x001b, bx -> 0x006b, OutOfMemoryError -> 0x0093, SecurityException -> 0x00bc }
        if (r1 == 0) goto L_0x0007;
    L_0x001a:
        return;
    L_0x001b:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0067 }
        r2.<init>();	 Catch:{ IOException -> 0x0067 }
        r3 = cb;	 Catch:{ IOException -> 0x0067 }
        r4 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0067 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0067 }
        r3 = r0.toString();	 Catch:{ IOException -> 0x0067 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0067 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0067 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0067 }
        r2 = r0.getMessage();	 Catch:{ IOException -> 0x0067 }
        if (r2 == 0) goto L_0x005b;
    L_0x0040:
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x0069 }
        r2 = cb;	 Catch:{ IOException -> 0x0069 }
        r3 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0069 }
        r0 = r0.contains(r2);	 Catch:{ IOException -> 0x0069 }
        if (r0 == 0) goto L_0x005b;
    L_0x0050:
        r0 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0065 }
        r2 = 2131624285; // 0x7f0e015d float:1.8875745E38 double:1.053162329E-314;
        r3 = 0;
        com.whatsapp.App.a(r0, r2, r3);	 Catch:{ IOException -> 0x0065 }
        if (r1 == 0) goto L_0x001a;
    L_0x005b:
        r0 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0065 }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ IOException -> 0x0065 }
        goto L_0x001a;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0065 }
    L_0x006b:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = cb;
        r3 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.App.p;
        r1 = 2131624279; // 0x7f0e0157 float:1.8875733E38 double:1.053162326E-314;
        com.whatsapp.App.a(r0, r1, r4);
        goto L_0x001a;
    L_0x0093:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = cb;
        r3 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.App.p;
        r1 = 2131624289; // 0x7f0e0161 float:1.8875754E38 double:1.053162331E-314;
        com.whatsapp.App.a(r0, r1, r4);
        goto L_0x001a;
    L_0x00bc:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = cb;
        r3 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.App.p;
        r1 = 2131624611; // 0x7f0e02a3 float:1.8876407E38 double:1.05316249E-314;
        com.whatsapp.App.a(r0, r1, r4);
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.a(java.util.ArrayList):void");
    }

    public void b(String str) {
        try {
            if (str.equals(this.u)) {
                A();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private void k(b bVar) {
        Intent intent = new Intent(this, MessageDetailsActivity.class);
        intent.putExtra(MessageDetailsActivity.j, bVar.e.a);
        intent.putExtra(MessageDetailsActivity.n, bVar.e.c);
        startActivity(intent);
    }

    public Conversation() {
        this.aW = (InputMethodManager) App.p.getSystemService(cb[246]);
        this.aj = new ArrayList();
        this.aN = null;
        this.aL = null;
        this.l = null;
        this.ao = false;
        this.aK = false;
        this.aq = true;
        this.ak = false;
        this.x = false;
        this.o = 0;
        this.a0 = 0;
        this.be = new ArrayList();
        this.i = 0;
        this.p = new ak0(this);
        this.aC = new a3e(this);
        this.aO = false;
        this.I = true;
        this.j = false;
        this.ap = null;
        this.X = true;
        this.q = true;
        this.n = new k0(this);
        this.aa = new alm(this);
        this.H = false;
        this.K = new al1(this);
        this.S = new Handler();
        this.M = new e2(this);
        this.B = new av3(this);
        this.C = new lp(this);
        this.ar = new wq(this);
        this.aT = new hz(this);
        this.af = false;
        this.am = new gt(this);
        this.aI = null;
        this.aA = null;
        this.au = new dc(this);
        this.ay = new alj(this);
        this.ai = false;
        this.aY = 0;
        this.v = null;
    }

    public static void m() {
        if (r()) {
            t().finish();
            return;
        }
        try {
            if (aD == null) {
                return;
            }
            if (!aD.isFinishing()) {
                aD.finish();
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private void j() {
        try {
            if (this.Z.isShown()) {
                this.Z.setVisibility(8);
            }
            try {
                if (this.aX.isShowing()) {
                    this.aX.dismiss();
                }
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private static void F(Conversation conversation) {
        try {
            if (aD == conversation) {
                aD = null;
                Q = false;
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(com.whatsapp.protocol.b r6) {
        /*
        r5_this = this;
        r1 = com.whatsapp.App.az;
        if (r6 == 0) goto L_0x00b1;
    L_0x0004:
        r0 = r6.A;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0073;
    L_0x000a:
        r2 = r0.downloader;	 Catch:{ RuntimeException -> 0x00bb }
        if (r2 == 0) goto L_0x0015;
    L_0x000e:
        r2 = r0.downloader;	 Catch:{ RuntimeException -> 0x00bd }
        r2.a();	 Catch:{ RuntimeException -> 0x00bd }
        if (r1 == 0) goto L_0x00af;
    L_0x0015:
        r2 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00bf }
        r2.<init>();	 Catch:{ RuntimeException -> 0x00bf }
        r3 = cb;	 Catch:{ RuntimeException -> 0x00bf }
        r4 = 13;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x00bf }
        r3 = r6.j;	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x00bf }
        r3 = cb;	 Catch:{ RuntimeException -> 0x00bf }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x00bf }
        r3 = r6.a;	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x00bf }
        r3 = cb;	 Catch:{ RuntimeException -> 0x00bf }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x00bf }
        r3 = r0.transferring;	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x00bf }
        r3 = cb;	 Catch:{ RuntimeException -> 0x00bf }
        r4 = 16;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.transferred;	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r2.append(r0);	 Catch:{ RuntimeException -> 0x00bf }
        r2 = cb;	 Catch:{ RuntimeException -> 0x00bf }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r6.e;	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x00bf }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x00bf }
        if (r1 == 0) goto L_0x00af;
    L_0x0073:
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00bf }
        r0.<init>();	 Catch:{ RuntimeException -> 0x00bf }
        r2 = cb;	 Catch:{ RuntimeException -> 0x00bf }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r6.j;	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x00bf }
        r2 = cb;	 Catch:{ RuntimeException -> 0x00bf }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r6.a;	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x00bf }
        r2 = cb;	 Catch:{ RuntimeException -> 0x00bf }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x00bf }
        r2 = r6.e;	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.append(r2);	 Catch:{ RuntimeException -> 0x00bf }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x00bf }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x00bf }
    L_0x00af:
        if (r1 == 0) goto L_0x00ba;
    L_0x00b1:
        r0 = cb;	 Catch:{ RuntimeException -> 0x00c1 }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x00c1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x00c1 }
    L_0x00ba:
        return;
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.g(com.whatsapp.protocol.b):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r8_this = this;
        r3 = 1;
        r4 = 0;
        r5 = com.whatsapp.App.az;
        r0 = r8.a_;	 Catch:{ RuntimeException -> 0x001a }
        if (r0 == 0) goto L_0x0010;
    L_0x0008:
        r0 = r8.a_;	 Catch:{ RuntimeException -> 0x001c }
        r0 = r0.isEmpty();	 Catch:{ RuntimeException -> 0x001c }
        if (r0 == 0) goto L_0x001e;
    L_0x0010:
        r0 = cb;	 Catch:{ RuntimeException -> 0x001c }
        r1 = 63;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x001c }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x001c }
    L_0x0019:
        return;
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r0 = r8.a_;
        r0 = r0.values();
        r6 = r0.iterator();
        r2 = r3;
    L_0x0029:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x00ae;
    L_0x002f:
        r0 = r6.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r1 = r0.A;	 Catch:{ RuntimeException -> 0x009a }
        r1 = r1 instanceof com.whatsapp.MediaData;	 Catch:{ RuntimeException -> 0x009a }
        if (r1 == 0) goto L_0x009c;
    L_0x003b:
        r1 = r0.A;	 Catch:{ RuntimeException -> 0x009a }
        r1 = (com.whatsapp.MediaData) r1;	 Catch:{ RuntimeException -> 0x009a }
    L_0x003f:
        if (r1 == 0) goto L_0x00ac;
    L_0x0041:
        r1 = r1.transferred;	 Catch:{ RuntimeException -> 0x009e }
        if (r1 != 0) goto L_0x00ac;
    L_0x0045:
        r1 = r0.j;	 Catch:{ RuntimeException -> 0x00a0 }
        r7 = 4;
        if (r1 == r7) goto L_0x00ac;
    L_0x004a:
        r1 = r0.j;	 Catch:{ RuntimeException -> 0x00a2 }
        r7 = 5;
        if (r1 == r7) goto L_0x00ac;
    L_0x004f:
        r1 = r0.e;	 Catch:{ RuntimeException -> 0x00a2 }
        r1 = r1.b;	 Catch:{ RuntimeException -> 0x00a2 }
        if (r1 == 0) goto L_0x00ac;
    L_0x0055:
        r1 = cb;
        r2 = 64;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
        r1 = 2131624523; // 0x7f0e024b float:1.8876228E38 double:1.0531624466E-314;
        com.whatsapp.App.b(r8, r1, r4);
        if (r5 == 0) goto L_0x00a8;
    L_0x0066:
        r1 = r4;
    L_0x0067:
        r0 = r0.j;	 Catch:{ RuntimeException -> 0x00a4 }
        r2 = 8;
        if (r0 != r2) goto L_0x00aa;
    L_0x006d:
        r0 = cb;
        r1 = 65;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r0 = 2131624522; // 0x7f0e024a float:1.8876226E38 double:1.053162446E-314;
        com.whatsapp.App.b(r8, r0, r4);
        if (r5 == 0) goto L_0x00a8;
    L_0x007e:
        r0 = r4;
    L_0x007f:
        if (r5 == 0) goto L_0x00a6;
    L_0x0081:
        if (r0 == 0) goto L_0x0019;
    L_0x0083:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ContactPicker.class;
        r0.<init>(r8, r1);
        r1 = cb;
        r2 = 62;
        r1 = r1[r2];
        r0.putExtra(r1, r3);
        r1 = 2;
        r8.startActivityForResult(r0, r1);
        T = r4;
        goto L_0x0019;
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r1 = 0;
        goto L_0x003f;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r2 = r0;
        goto L_0x0029;
    L_0x00a8:
        r0 = r4;
        goto L_0x0081;
    L_0x00aa:
        r0 = r1;
        goto L_0x007f;
    L_0x00ac:
        r1 = r2;
        goto L_0x0067;
    L_0x00ae:
        r0 = r2;
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.i():void");
    }

    private boolean h() {
        Cursor cursor = this.aS.getCursor();
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    do {
                        b a = App.aJ.a(cursor, this.u);
                        if (a.e.b) {
                            try {
                                if (a.a != 6) {
                                }
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        }
                        return false;
                    } while (cursor.moveToNext());
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            try {
                if (this.aX.isShowing()) {
                    this.aX.dismiss();
                    return false;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    private static void P(Conversation conversation) {
        try {
            if (aD == conversation) {
                Q = false;
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void a(Collection collection) {
        try {
            if (this.O != null) {
                D();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static View S(Conversation conversation) {
        return conversation.aR;
    }

    static ArrayList W(Conversation conversation) {
        return conversation.be;
    }

    static String N(Conversation conversation) {
        return conversation.J;
    }

    public static void i(String str) {
        try {
            if (aD != null) {
                aD.ap = str;
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static View Q(Conversation conversation) {
        return conversation.aE;
    }

    static String l(Conversation conversation) {
        return conversation.ap;
    }

    static boolean k(Conversation conversation, boolean z) {
        conversation.ak = z;
        return z;
    }

    private void a(Cursor cursor) {
        boolean z;
        if (cursor != null) {
            z = true;
        } else {
            z = false;
        }
        Log.b(z);
        this.R = cursor;
    }

    public MenuItem a(Menu menu, int i, int i2, int i3) {
        MenuItem add = menu.add(0, i, 0, i2);
        add.setIcon(i3);
        return add;
    }

    static boolean H(Conversation conversation) {
        return conversation.aQ;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r5, boolean r6) {
        /*
        r4_this = this;
        r3 = 12;
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r2 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r0.<init>(r1);	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x0044 }
        r2 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0044 }
        r0.setType(r1);	 Catch:{ ActivityNotFoundException -> 0x0044 }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x0044 }
        r2 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0044 }
        r0.putExtra(r1, r5);	 Catch:{ ActivityNotFoundException -> 0x0044 }
        r1 = cb;	 Catch:{ ActivityNotFoundException -> 0x0044 }
        r2 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0044 }
        r2 = 2;
        r0.putExtra(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0044 }
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0.setFlags(r1);	 Catch:{ ActivityNotFoundException -> 0x0044 }
        if (r6 == 0) goto L_0x0039;
    L_0x0030:
        r1 = 13;
        r4.startActivityForResult(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x0044 }
        r1 = com.whatsapp.App.az;	 Catch:{ ActivityNotFoundException -> 0x0044 }
        if (r1 == 0) goto L_0x0040;
    L_0x0039:
        r4.v = r5;	 Catch:{ ActivityNotFoundException -> 0x0046 }
        r1 = 12;
        r4.startActivityForResult(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x0046 }
    L_0x0040:
        r0 = 0;
        T = r0;	 Catch:{ ActivityNotFoundException -> 0x0048 }
    L_0x0043:
        return;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        r4.showDialog(r3);
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.b(java.lang.String, boolean):void");
    }

    static TextView X(Conversation conversation) {
        return conversation.w;
    }

    static boolean U(Conversation conversation) {
        return conversation.p();
    }

    public static boolean r() {
        return Q;
    }

    static void ac(Conversation conversation) {
        conversation.d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r6_this = this;
        r4 = 0;
        r1 = com.whatsapp.App.az;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = cb;
        r3 = 8;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r6.r;
        r2 = r2.e;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r2 = new com.whatsapp.util.y;
        r0 = cb;
        r3 = 6;
        r0 = r0[r3];
        r2.<init>(r0);
        super.onResume();
        com.whatsapp.notification.t.b();
        r0 = com.whatsapp.wallpaper.p.a;
        if (r0 == 0) goto L_0x0044;
    L_0x0035:
        r0 = r6.aq;
        if (r0 == 0) goto L_0x016d;
    L_0x0039:
        r0 = com.whatsapp.wallpaper.p.f(r6);
    L_0x003d:
        if (r0 == 0) goto L_0x0042;
    L_0x003f:
        r6.a(r0);	 Catch:{ IllegalStateException -> 0x0177 }
    L_0x0042:
        com.whatsapp.wallpaper.p.a = r4;
    L_0x0044:
        r0 = com.whatsapp.ChangeNumber.g();	 Catch:{ IllegalStateException -> 0x0179 }
        if (r0 != 0) goto L_0x004e;
    L_0x004a:
        r0 = 0;
        r6.c(r0);	 Catch:{ IllegalStateException -> 0x0179 }
    L_0x004e:
        r0 = r6.r;	 Catch:{ IllegalStateException -> 0x017b }
        r0 = r0.e;	 Catch:{ IllegalStateException -> 0x017b }
        r0 = com.whatsapp.v.b(r0);	 Catch:{ IllegalStateException -> 0x017b }
        r6.r = r0;	 Catch:{ IllegalStateException -> 0x017b }
        r0 = r6.r;	 Catch:{ IllegalStateException -> 0x017b }
        r3 = 0;
        r4 = 1;
        com.whatsapp.App.a(r0, r3, r4);	 Catch:{ IllegalStateException -> 0x017b }
        r6.E();	 Catch:{ IllegalStateException -> 0x017b }
        r0 = r6.r;	 Catch:{ IllegalStateException -> 0x017b }
        r0 = r0.w();	 Catch:{ IllegalStateException -> 0x017b }
        if (r0 != 0) goto L_0x006f;
    L_0x006a:
        r0 = r6.r;	 Catch:{ IllegalStateException -> 0x017b }
        com.whatsapp.App.b(r0);	 Catch:{ IllegalStateException -> 0x017b }
    L_0x006f:
        r0 = r6.O;	 Catch:{ IllegalStateException -> 0x017d }
        if (r0 == 0) goto L_0x0076;
    L_0x0073:
        r6.D();	 Catch:{ IllegalStateException -> 0x017d }
    L_0x0076:
        r0 = a4;	 Catch:{ IllegalStateException -> 0x017f }
        if (r0 == 0) goto L_0x0089;
    L_0x007a:
        r0 = r6.aF;	 Catch:{ IllegalStateException -> 0x017f }
        if (r0 != 0) goto L_0x0089;
    L_0x007e:
        r0 = r6.aO;	 Catch:{ IllegalStateException -> 0x0181 }
        if (r0 != 0) goto L_0x0089;
    L_0x0082:
        r0 = com.whatsapp.notification.q.c();	 Catch:{ IllegalStateException -> 0x0183 }
        r0.a();	 Catch:{ IllegalStateException -> 0x0183 }
    L_0x0089:
        r0 = 0;
        a4 = r0;	 Catch:{ IllegalStateException -> 0x0185 }
        r0 = bc;	 Catch:{ IllegalStateException -> 0x0185 }
        r3 = r6.r;	 Catch:{ IllegalStateException -> 0x0185 }
        r3 = r3.e;	 Catch:{ IllegalStateException -> 0x0185 }
        r0 = r0.remove(r3);	 Catch:{ IllegalStateException -> 0x0185 }
        if (r0 == 0) goto L_0x009c;
    L_0x0098:
        r0 = 2;
        r6.showDialog(r0);	 Catch:{ IllegalStateException -> 0x0185 }
    L_0x009c:
        r0 = com.whatsapp.App.V;	 Catch:{ IllegalStateException -> 0x0187 }
        r0.stop();	 Catch:{ IllegalStateException -> 0x0187 }
    L_0x00a1:
        r0 = r6.bd;	 Catch:{ IllegalStateException -> 0x0192 }
        r3 = 0;
        r0.setFastScrollEnabled(r3);	 Catch:{ IllegalStateException -> 0x0192 }
        r0 = r6.aF;	 Catch:{ IllegalStateException -> 0x0192 }
        if (r0 == 0) goto L_0x00b0;
    L_0x00ab:
        r0 = 0;
        r6.aF = r0;	 Catch:{ IllegalStateException -> 0x0194 }
        if (r1 == 0) goto L_0x00c4;
    L_0x00b0:
        r0 = r6.aO;	 Catch:{ IllegalStateException -> 0x0196 }
        if (r0 == 0) goto L_0x00c4;
    L_0x00b4:
        r0 = new com.whatsapp.k7;	 Catch:{ IllegalStateException -> 0x0196 }
        r3 = 0;
        r0.<init>(r6, r3);	 Catch:{ IllegalStateException -> 0x0196 }
        r6.G = r0;	 Catch:{ IllegalStateException -> 0x0196 }
        r0 = r6.G;	 Catch:{ IllegalStateException -> 0x0196 }
        r3 = 0;
        r4 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r0.sendEmptyMessageDelayed(r3, r4);	 Catch:{ IllegalStateException -> 0x0196 }
    L_0x00c4:
        r0 = r6.az;
        if (r0 == 0) goto L_0x00ed;
    L_0x00c8:
        r0 = al;
        r0 = r0.getHeight();
        r3 = r6.getResources();
        r4 = 2131361853; // 0x7f0a003d float:1.834347E38 double:1.0530326704E-314;
        r3 = r3.getDimensionPixelSize(r4);
        r3 = r3 * 2;
        r0 = r0 - r3;
        r0 = r0 / 4;
        r3 = r6.bd;	 Catch:{ IllegalStateException -> 0x0198 }
        r4 = new com.whatsapp.amv;	 Catch:{ IllegalStateException -> 0x0198 }
        r4.<init>(r6, r0);	 Catch:{ IllegalStateException -> 0x0198 }
        r3.post(r4);	 Catch:{ IllegalStateException -> 0x0198 }
        r0 = 1;
        r6.ak = r0;	 Catch:{ IllegalStateException -> 0x0198 }
        if (r1 == 0) goto L_0x0111;
    L_0x00ed:
        r0 = r6.ai;	 Catch:{ IllegalStateException -> 0x019a }
        if (r0 == 0) goto L_0x00ff;
    L_0x00f1:
        r0 = r6.bd;	 Catch:{ IllegalStateException -> 0x019c }
        r3 = 0;
        r0.setSelection(r3);	 Catch:{ IllegalStateException -> 0x019c }
        r0 = 1;
        r6.ak = r0;	 Catch:{ IllegalStateException -> 0x019c }
        r0 = 1;
        r6.az = r0;	 Catch:{ IllegalStateException -> 0x019c }
        if (r1 == 0) goto L_0x0111;
    L_0x00ff:
        r0 = r6.q;	 Catch:{ IllegalStateException -> 0x019e }
        if (r0 == 0) goto L_0x0108;
    L_0x0103:
        r6.q();	 Catch:{ IllegalStateException -> 0x01a0 }
        if (r1 == 0) goto L_0x0111;
    L_0x0108:
        r0 = r6.bd;	 Catch:{ IllegalStateException -> 0x01a0 }
        r3 = r6.z;	 Catch:{ IllegalStateException -> 0x01a0 }
        r4 = r6.aZ;	 Catch:{ IllegalStateException -> 0x01a0 }
        r0.setSelectionFromTop(r3, r4);	 Catch:{ IllegalStateException -> 0x01a0 }
    L_0x0111:
        r0 = r6.w;	 Catch:{ IllegalStateException -> 0x01a2 }
        r3 = 1;
        r0.setSelected(r3);	 Catch:{ IllegalStateException -> 0x01a2 }
        r0 = r6.aS;	 Catch:{ IllegalStateException -> 0x01a2 }
        r0 = r0.getCount();	 Catch:{ IllegalStateException -> 0x01a2 }
        if (r0 != 0) goto L_0x0129;
    L_0x011f:
        r0 = r6.aa;	 Catch:{ IllegalStateException -> 0x01a4 }
        r3 = 0;
        r4 = 100;
        r0.sendEmptyMessageDelayed(r3, r4);	 Catch:{ IllegalStateException -> 0x01a4 }
        if (r1 == 0) goto L_0x0131;
    L_0x0129:
        r0 = r6.aa;	 Catch:{ IllegalStateException -> 0x01a4 }
        r3 = 1;
        r4 = 100;
        r0.sendEmptyMessageDelayed(r3, r4);	 Catch:{ IllegalStateException -> 0x01a4 }
    L_0x0131:
        r0 = r6.x;	 Catch:{ IllegalStateException -> 0x01a6 }
        if (r0 == 0) goto L_0x0143;
    L_0x0135:
        r0 = r6.bd;	 Catch:{ IllegalStateException -> 0x01a8 }
        r3 = new com.whatsapp.pe;	 Catch:{ IllegalStateException -> 0x01a8 }
        r3.<init>(r6);	 Catch:{ IllegalStateException -> 0x01a8 }
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0.postDelayed(r3, r4);	 Catch:{ IllegalStateException -> 0x01a8 }
        if (r1 == 0) goto L_0x0153;
    L_0x0143:
        r0 = r6.ap;	 Catch:{ IllegalStateException -> 0x01aa }
        if (r0 == 0) goto L_0x0153;
    L_0x0147:
        r0 = r6.bd;	 Catch:{ IllegalStateException -> 0x01aa }
        r1 = new com.whatsapp.ath;	 Catch:{ IllegalStateException -> 0x01aa }
        r1.<init>(r6);	 Catch:{ IllegalStateException -> 0x01aa }
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0.postDelayed(r1, r4);	 Catch:{ IllegalStateException -> 0x01aa }
    L_0x0153:
        r0 = com.whatsapp.App.aQ();	 Catch:{ IllegalStateException -> 0x01ac }
        if (r0 == 0) goto L_0x015e;
    L_0x0159:
        r0 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r6.showDialog(r0);	 Catch:{ IllegalStateException -> 0x01ac }
    L_0x015e:
        r0 = com.whatsapp.App.al();	 Catch:{ IllegalStateException -> 0x01ae }
        if (r0 == 0) goto L_0x0169;
    L_0x0164:
        r0 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r6.showDialog(r0);	 Catch:{ IllegalStateException -> 0x01ae }
    L_0x0169:
        r2.c();
        return;
    L_0x016d:
        r0 = r6.r;
        r0 = r0.e;
        r0 = com.whatsapp.wallpaper.p.a(r6, r0);
        goto L_0x003d;
    L_0x0177:
        r0 = move-exception;
        throw r0;
    L_0x0179:
        r0 = move-exception;
        throw r0;
    L_0x017b:
        r0 = move-exception;
        throw r0;
    L_0x017d:
        r0 = move-exception;
        throw r0;
    L_0x017f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0181 }
    L_0x0181:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0183 }
    L_0x0183:
        r0 = move-exception;
        throw r0;
    L_0x0185:
        r0 = move-exception;
        throw r0;
    L_0x0187:
        r0 = move-exception;
        r0 = cb;
        r3 = 7;
        r0 = r0[r3];
        com.whatsapp.util.Log.e(r0);
        goto L_0x00a1;
    L_0x0192:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0194 }
    L_0x0194:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0196 }
    L_0x0196:
        r0 = move-exception;
        throw r0;
    L_0x0198:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x019a }
    L_0x019a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x019c }
    L_0x019c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x019e }
    L_0x019e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01a0 }
    L_0x01a0:
        r0 = move-exception;
        throw r0;
    L_0x01a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01a4 }
    L_0x01a4:
        r0 = move-exception;
        throw r0;
    L_0x01a6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01a8 }
    L_0x01a8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01aa }
    L_0x01aa:
        r0 = move-exception;
        throw r0;
    L_0x01ac:
        r0 = move-exception;
        throw r0;
    L_0x01ae:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onResume():void");
    }

    static Boolean a(Conversation conversation, Boolean bool) {
        conversation.aI = bool;
        return bool;
    }

    static mi q(Conversation conversation) {
        return conversation.p;
    }

    static Boolean V(Conversation conversation) {
        return conversation.aI;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x() {
        /*
        r1_this = this;
        r0 = r1.aJ;	 Catch:{ RuntimeException -> 0x0019 }
        if (r0 == 0) goto L_0x0018;
    L_0x0004:
        r0 = r1.a_;	 Catch:{ RuntimeException -> 0x001b }
        r0 = r0.size();	 Catch:{ RuntimeException -> 0x001b }
        if (r0 != 0) goto L_0x0013;
    L_0x000c:
        r1.b();	 Catch:{ RuntimeException -> 0x001d }
        r0 = com.whatsapp.App.az;	 Catch:{ RuntimeException -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r1.aJ;	 Catch:{ RuntimeException -> 0x001d }
        r0.invalidate();	 Catch:{ RuntimeException -> 0x001d }
    L_0x0018:
        return;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.x():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void E() {
        /*
        r8_this = this;
        r0 = 1;
        r7 = 0;
        r1 = 0;
        r2 = com.whatsapp.App.az;
        r3 = r8.r;	 Catch:{ RuntimeException -> 0x00d4 }
        r3 = r3.e;	 Catch:{ RuntimeException -> 0x00d4 }
        r3 = com.whatsapp.v.b(r3);	 Catch:{ RuntimeException -> 0x00d4 }
        r8.r = r3;	 Catch:{ RuntimeException -> 0x00d4 }
        r3 = r8.P;	 Catch:{ RuntimeException -> 0x00d4 }
        r4 = r8.r;	 Catch:{ RuntimeException -> 0x00d4 }
        r4 = r4.a(r8);	 Catch:{ RuntimeException -> 0x00d4 }
        r5 = r8.getBaseContext();	 Catch:{ RuntimeException -> 0x00d4 }
        r6 = r8.P;	 Catch:{ RuntimeException -> 0x00d4 }
        r6 = r6.getPaint();	 Catch:{ RuntimeException -> 0x00d4 }
        r4 = com.whatsapp.util.a5.b(r4, r5, r6);	 Catch:{ RuntimeException -> 0x00d4 }
        r3.setText(r4);	 Catch:{ RuntimeException -> 0x00d4 }
        r3 = r8.w;	 Catch:{ RuntimeException -> 0x00d4 }
        r4 = 0;
        r3.setVisibility(r4);	 Catch:{ RuntimeException -> 0x00d4 }
        r3 = r8.U;	 Catch:{ RuntimeException -> 0x00d4 }
        if (r3 != 0) goto L_0x00d6;
    L_0x0032:
        r3 = r8.U;	 Catch:{ RuntimeException -> 0x00d9 }
        if (r3 == 0) goto L_0x003e;
    L_0x0036:
        r3 = r8.U;	 Catch:{ RuntimeException -> 0x00d9 }
        r3.a();	 Catch:{ RuntimeException -> 0x00d9 }
        r3 = 0;
        r8.U = r3;	 Catch:{ RuntimeException -> 0x00d9 }
    L_0x003e:
        r8.A();	 Catch:{ RuntimeException -> 0x00db }
        r3 = r8.aQ;	 Catch:{ RuntimeException -> 0x00db }
        if (r3 != 0) goto L_0x0049;
    L_0x0045:
        r3 = r8.an;	 Catch:{ RuntimeException -> 0x00dd }
        if (r3 == 0) goto L_0x005e;
    L_0x0049:
        r3 = new com.whatsapp.zb;	 Catch:{ RuntimeException -> 0x00df }
        r4 = r8.r;	 Catch:{ RuntimeException -> 0x00df }
        r4 = r4.e;	 Catch:{ RuntimeException -> 0x00df }
        r3.<init>(r8, r4, r0);	 Catch:{ RuntimeException -> 0x00df }
        r8.U = r3;	 Catch:{ RuntimeException -> 0x00df }
        r0 = r8.U;	 Catch:{ RuntimeException -> 0x00df }
        r3 = 0;
        r3 = new java.lang.Void[r3];	 Catch:{ RuntimeException -> 0x00df }
        com.whatsapp.a5w.a(r0, r3);	 Catch:{ RuntimeException -> 0x00df }
        if (r2 == 0) goto L_0x0077;
    L_0x005e:
        r0 = r8.r;	 Catch:{ RuntimeException -> 0x00e1 }
        r0 = r0.h;	 Catch:{ RuntimeException -> 0x00e1 }
        if (r0 == 0) goto L_0x0077;
    L_0x0064:
        r0 = r8.O;	 Catch:{ RuntimeException -> 0x00e3 }
        if (r0 == 0) goto L_0x0077;
    L_0x0068:
        r0 = r8.bd;	 Catch:{ RuntimeException -> 0x00e3 }
        r3 = r8.O;	 Catch:{ RuntimeException -> 0x00e3 }
        r0.removeHeaderView(r3);	 Catch:{ RuntimeException -> 0x00e3 }
        r0 = 0;
        r8.O = r0;	 Catch:{ RuntimeException -> 0x00e3 }
        r0 = r8.aS;	 Catch:{ RuntimeException -> 0x00e3 }
        r0.notifyDataSetChanged();	 Catch:{ RuntimeException -> 0x00e3 }
    L_0x0077:
        r0 = r8.aQ;	 Catch:{ RuntimeException -> 0x00e5 }
        if (r0 == 0) goto L_0x00a8;
    L_0x007b:
        r0 = r8.r;	 Catch:{ RuntimeException -> 0x00e7 }
        r0 = r0.e;	 Catch:{ RuntimeException -> 0x00e7 }
        r0 = com.whatsapp.bd.f(r0);	 Catch:{ RuntimeException -> 0x00e7 }
        if (r0 != 0) goto L_0x00a8;
    L_0x0085:
        r0 = 2131427681; // 0x7f0b0161 float:1.8476985E38 double:1.053065194E-314;
        r0 = r8.findViewById(r0);	 Catch:{ RuntimeException -> 0x00e9 }
        r3 = 8;
        r0.setVisibility(r3);	 Catch:{ RuntimeException -> 0x00e9 }
        r0 = 2131427680; // 0x7f0b0160 float:1.8476983E38 double:1.0530651933E-314;
        r0 = r8.findViewById(r0);	 Catch:{ RuntimeException -> 0x00e9 }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ RuntimeException -> 0x00e9 }
        r0 = r8.ax;	 Catch:{ RuntimeException -> 0x00e9 }
        if (r0 == 0) goto L_0x00c9;
    L_0x00a0:
        r0 = r8.ax;	 Catch:{ RuntimeException -> 0x00eb }
        r3 = 0;
        r0.setVisible(r3);	 Catch:{ RuntimeException -> 0x00eb }
        if (r2 == 0) goto L_0x00c9;
    L_0x00a8:
        r0 = 2131427681; // 0x7f0b0161 float:1.8476985E38 double:1.053065194E-314;
        r0 = r8.findViewById(r0);	 Catch:{ RuntimeException -> 0x00ed }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ RuntimeException -> 0x00ed }
        r0 = 2131427680; // 0x7f0b0160 float:1.8476983E38 double:1.0530651933E-314;
        r0 = r8.findViewById(r0);	 Catch:{ RuntimeException -> 0x00ed }
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ RuntimeException -> 0x00ed }
        r0 = r8.ax;	 Catch:{ RuntimeException -> 0x00ed }
        if (r0 == 0) goto L_0x00c9;
    L_0x00c3:
        r0 = r8.ax;	 Catch:{ RuntimeException -> 0x00ed }
        r2 = 1;
        r0.setVisible(r2);	 Catch:{ RuntimeException -> 0x00ed }
    L_0x00c9:
        r0 = new com.whatsapp.a53;
        r0.<init>(r8, r7);
        r1 = new java.lang.Void[r1];
        com.whatsapp.a5w.a(r0, r1);
        return;
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r0 = r1;
        goto L_0x0032;
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00dd }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00e1 }
    L_0x00e1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00eb }
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ed }
    L_0x00ed:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.E():void");
    }

    private void D() {
        try {
            ((Button) this.O.findViewById(R.id.block_btn)).setText(App.c(this.r.e) ? R.string.unblock : R.string.block);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public boolean u() {
        try {
            if (this.aJ != null) {
                return false;
            }
            try {
                if (this.a3 != null) {
                    this.a3.finish();
                }
                try {
                    Log.i(cb[55]);
                    if (this.ae == null) {
                        this.ae = new as3(this);
                    }
                    this.aS.notifyDataSetChanged();
                    this.aJ = startActionMode(this.ae);
                    return true;
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    private void H() {
        int i;
        int i2 = 0;
        int i3 = App.az;
        Cursor cursor = this.aS.getCursor();
        if (cursor != null) {
            try {
            } catch (RuntimeException e) {
                throw e;
            }
            if (cursor.moveToFirst()) {
                i = 0;
                do {
                    b a = App.aJ.a(cursor, this.u);
                    if (a.e.b) {
                        try {
                            if (a.a == 6) {
                                if (!bd.a(a)) {
                                    i++;
                                }
                            }
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (RuntimeException e22) {
                            throw e22;
                        }
                    }
                    i2++;
                    try {
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    } catch (RuntimeException e222) {
                        throw e222;
                    }
                } while (i2 < this.a0 + i);
                i2 = cursor.getCount();
                try {
                    if (this.a0 + i >= i2) {
                        if (this.a0 + i > i2) {
                            Log.e(cb[58] + this.a0 + cb[59] + i + cb[56] + i2 + cb[57] + this.o);
                        }
                        this.a0 = 0;
                        if (i3 == 0) {
                            return;
                        }
                    }
                    this.a0 += i;
                } catch (RuntimeException e2222) {
                    throw e2222;
                }
            }
        }
        i = 0;
        i2 = cursor.getCount();
        try {
            if (this.a0 + i >= i2) {
                if (this.a0 + i > i2) {
                    Log.e(cb[58] + this.a0 + cb[59] + i + cb[56] + i2 + cb[57] + this.o);
                }
                this.a0 = 0;
                if (i3 == 0) {
                    return;
                }
            }
            this.a0 += i;
        } catch (RuntimeException e22222) {
            throw e22222;
        } catch (RuntimeException e222222) {
            throw e222222;
        }
    }

    static void R(Conversation conversation) {
        conversation.n();
    }

    private void l() {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r11_this = this;
        r10 = 1;
        r9 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r11.a_;	 Catch:{ NullPointerException -> 0x001a }
        if (r0 == 0) goto L_0x0010;	 Catch:{ NullPointerException -> 0x001a }
    L_0x0008:
        r0 = r11.a_;	 Catch:{ NullPointerException -> 0x001a }
        r0 = r0.isEmpty();	 Catch:{ NullPointerException -> 0x001a }
        if (r0 == 0) goto L_0x001e;
    L_0x0010:
        r0 = cb;	 Catch:{ NullPointerException -> 0x001c }
        r1 = 149; // 0x95 float:2.09E-43 double:7.36E-322;	 Catch:{ NullPointerException -> 0x001c }
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x001c }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x001c }
    L_0x0019:
        return;	 Catch:{ NullPointerException -> 0x001c }
    L_0x001a:
        r0 = move-exception;	 Catch:{ NullPointerException -> 0x001c }
        throw r0;	 Catch:{ NullPointerException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r11.f();
        r4 = r3.iterator();
    L_0x002b:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00ab;
    L_0x0031:
        r0 = r4.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r5 = r0.j;	 Catch:{ NullPointerException -> 0x0106 }
        if (r5 != 0) goto L_0x00a9;	 Catch:{ NullPointerException -> 0x0106 }
    L_0x003b:
        r5 = r2.length();	 Catch:{ NullPointerException -> 0x0106 }
        if (r5 == 0) goto L_0x0046;
    L_0x0041:
        r5 = 10;
        r2.append(r5);	 Catch:{ NullPointerException -> 0x0108 }
    L_0x0046:
        r5 = r3.size();	 Catch:{ NullPointerException -> 0x010a }
        if (r5 <= r10) goto L_0x00a2;	 Catch:{ NullPointerException -> 0x010a }
    L_0x004c:
        r5 = 91;	 Catch:{ NullPointerException -> 0x010a }
        r5 = r2.append(r5);	 Catch:{ NullPointerException -> 0x010a }
        r6 = r0.D;	 Catch:{ NullPointerException -> 0x010a }
        r8 = 655377; // 0xa0011 float:9.18379E-40 double:3.237993E-318;	 Catch:{ NullPointerException -> 0x010a }
        r6 = android.text.format.DateUtils.formatDateTime(r11, r6, r8);	 Catch:{ NullPointerException -> 0x010a }
        r5 = r5.append(r6);	 Catch:{ NullPointerException -> 0x010a }
        r6 = cb;	 Catch:{ NullPointerException -> 0x010a }
        r7 = 147; // 0x93 float:2.06E-43 double:7.26E-322;	 Catch:{ NullPointerException -> 0x010a }
        r6 = r6[r7];	 Catch:{ NullPointerException -> 0x010a }
        r5.append(r6);	 Catch:{ NullPointerException -> 0x010a }
        r5 = r0.e;	 Catch:{ NullPointerException -> 0x010a }
        r5 = r5.b;	 Catch:{ NullPointerException -> 0x010a }
        if (r5 == 0) goto L_0x0077;
    L_0x006e:
        r5 = com.whatsapp.App.p(r11);	 Catch:{ NullPointerException -> 0x010c }
        r2.append(r5);	 Catch:{ NullPointerException -> 0x010c }
        if (r1 == 0) goto L_0x0099;
    L_0x0077:
        r5 = r11.r;	 Catch:{ NullPointerException -> 0x010e }
        r5 = r5.w();	 Catch:{ NullPointerException -> 0x010e }
        if (r5 == 0) goto L_0x0090;
    L_0x007f:
        r5 = com.whatsapp.App.P;
        r6 = r0.F;
        r5 = r5.a(r6);
        r5 = r5.a(r11);	 Catch:{ NullPointerException -> 0x0110 }
        r2.append(r5);	 Catch:{ NullPointerException -> 0x0110 }
        if (r1 == 0) goto L_0x0099;	 Catch:{ NullPointerException -> 0x0110 }
    L_0x0090:
        r5 = r11.r;	 Catch:{ NullPointerException -> 0x0110 }
        r5 = r5.a(r11);	 Catch:{ NullPointerException -> 0x0110 }
        r2.append(r5);	 Catch:{ NullPointerException -> 0x0110 }
    L_0x0099:
        r5 = cb;
        r6 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r5 = r5[r6];
        r2.append(r5);
    L_0x00a2:
        r0 = r0.f();
        r2.append(r0);
    L_0x00a9:
        if (r1 == 0) goto L_0x002b;
    L_0x00ab:
        r0 = cb;
        r4 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0 = r0[r4];
        r0 = r11.getSystemService(r0);
        r0 = (android.text.ClipboardManager) r0;
        r2 = r2.toString();	 Catch:{ NullPointerException -> 0x0112 }
        r0.setText(r2);	 Catch:{ NullPointerException -> 0x0112 }
        r0 = r3.size();	 Catch:{ NullPointerException -> 0x0112 }
        if (r0 != r10) goto L_0x00cd;	 Catch:{ NullPointerException -> 0x0112 }
    L_0x00c4:
        r0 = 2131624526; // 0x7f0e024e float:1.8876234E38 double:1.053162448E-314;	 Catch:{ NullPointerException -> 0x0112 }
        r2 = 0;	 Catch:{ NullPointerException -> 0x0112 }
        com.whatsapp.App.b(r11, r0, r2);	 Catch:{ NullPointerException -> 0x0112 }
        if (r1 == 0) goto L_0x0019;
    L_0x00cd:
        r0 = com.whatsapp.App.aX;	 Catch:{ NullPointerException -> 0x00f2 }
        r1 = 2131558420; // 0x7f0d0014 float:1.8742155E38 double:1.0531297874E-314;	 Catch:{ NullPointerException -> 0x00f2 }
        r2 = r3.size();	 Catch:{ NullPointerException -> 0x00f2 }
        r0 = r0.a(r1, r2);	 Catch:{ NullPointerException -> 0x00f2 }
        r1 = 1;	 Catch:{ NullPointerException -> 0x00f2 }
        r1 = new java.lang.Object[r1];	 Catch:{ NullPointerException -> 0x00f2 }
        r2 = 0;	 Catch:{ NullPointerException -> 0x00f2 }
        r3 = r3.size();	 Catch:{ NullPointerException -> 0x00f2 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NullPointerException -> 0x00f2 }
        r1[r2] = r3;	 Catch:{ NullPointerException -> 0x00f2 }
        r0 = java.lang.String.format(r0, r1);	 Catch:{ NullPointerException -> 0x00f2 }
        r1 = 0;	 Catch:{ NullPointerException -> 0x00f2 }
        com.whatsapp.App.a(r11, r0, r1);	 Catch:{ NullPointerException -> 0x00f2 }
        goto L_0x0019;
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        r0 = cb;
        r1 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = 2131625077; // 0x7f0e0475 float:1.8877352E38 double:1.0531627204E-314;
        com.whatsapp.App.b(r11, r0, r9);
        goto L_0x0019;
    L_0x0106:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0108 }
    L_0x0108:
        r0 = move-exception;
        throw r0;
    L_0x010a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x010c }
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x010e }
    L_0x010e:
        r0 = move-exception;
        throw r0;
    L_0x0110:
        r0 = move-exception;
        throw r0;
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00f2 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.l():void");
    }

    private void e(String str) {
        try {
            startActivity(new Intent(cb[1], Uri.parse(cb[0] + str)));
        } catch (ActivityNotFoundException e) {
            App.b((Context) this, (int) R.string.activity_not_found, 0);
        }
    }

    static ImageButton k(Conversation conversation) {
        return conversation.aP;
    }

    static dz K(Conversation conversation) {
        return conversation.ba;
    }

    static View ab(Conversation conversation) {
        return conversation.bb;
    }

    static void ah(Conversation conversation) {
        conversation.E();
    }

    static ImageButton Y(Conversation conversation) {
        return conversation.ab;
    }

    static boolean g(Conversation conversation, boolean z) {
        conversation.aV = z;
        return z;
    }

    protected void onStop() {
        try {
            super.onStop();
            ac.b(this.aC);
            if (T) {
                P(this);
            }
            try {
                Log.i(cb[145] + SQLiteDatabase.releaseMemory() + cb[144] + this.u);
                if (this.R != null) {
                    this.R.deactivate();
                }
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static void r(Conversation conversation) {
        conversation.w();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r7) {
        /*
        r6_this = this;
        r3 = 1;
        r0 = com.whatsapp.App.az;
        super.onConfigurationChanged(r7);
        r6.e();
        r1 = r6.aW;
        r1 = r1.isFullscreenMode();
        if (r1 == 0) goto L_0x0025;
    L_0x0011:
        r1 = r7.orientation;	 Catch:{ RuntimeException -> 0x0098 }
        if (r1 != r3) goto L_0x0025;
    L_0x0015:
        r1 = r6.bd;	 Catch:{ RuntimeException -> 0x009a }
        r2 = 2;
        r1.setTranscriptMode(r2);	 Catch:{ RuntimeException -> 0x009a }
        r1 = r6.n;	 Catch:{ RuntimeException -> 0x009a }
        r2 = 0;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1.sendEmptyMessageDelayed(r2, r4);	 Catch:{ RuntimeException -> 0x009a }
        if (r0 == 0) goto L_0x0040;
    L_0x0025:
        r1 = r6.X;	 Catch:{ RuntimeException -> 0x009c }
        if (r1 == 0) goto L_0x0039;
    L_0x0029:
        r1 = r6.bd;	 Catch:{ RuntimeException -> 0x009e }
        r2 = 2;
        r1.setTranscriptMode(r2);	 Catch:{ RuntimeException -> 0x009e }
        r1 = r6.n;	 Catch:{ RuntimeException -> 0x009e }
        r2 = 1;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1.sendEmptyMessageDelayed(r2, r4);	 Catch:{ RuntimeException -> 0x009e }
        if (r0 == 0) goto L_0x0040;
    L_0x0039:
        r1 = r6.bd;	 Catch:{ RuntimeException -> 0x009e }
        r2 = r6.at;	 Catch:{ RuntimeException -> 0x009e }
        r1.setSelection(r2);	 Catch:{ RuntimeException -> 0x009e }
    L_0x0040:
        r1 = r7.orientation;	 Catch:{ RuntimeException -> 0x00a0 }
        if (r1 != r3) goto L_0x004d;
    L_0x0044:
        r1 = r6.W;	 Catch:{ RuntimeException -> 0x00a2 }
        r2 = r6.a2;	 Catch:{ RuntimeException -> 0x00a2 }
        r1.a(r2);	 Catch:{ RuntimeException -> 0x00a2 }
        if (r0 == 0) goto L_0x0053;
    L_0x004d:
        r0 = r6.a2;	 Catch:{ RuntimeException -> 0x00a2 }
        r1 = 2;
        r0.setMaxLines(r1);	 Catch:{ RuntimeException -> 0x00a2 }
    L_0x0053:
        r0 = r6.aX;	 Catch:{ RuntimeException -> 0x00a4 }
        r0 = r0.isShowing();	 Catch:{ RuntimeException -> 0x00a4 }
        if (r0 == 0) goto L_0x0097;
    L_0x005b:
        r0 = r6.aX;	 Catch:{ RuntimeException -> 0x00a4 }
        r0.a(r7);	 Catch:{ RuntimeException -> 0x00a4 }
        r0 = r6.Z;	 Catch:{ RuntimeException -> 0x00a4 }
        r0 = r0.getVisibility();	 Catch:{ RuntimeException -> 0x00a4 }
        if (r0 != 0) goto L_0x0097;
    L_0x0068:
        r0 = r6.aX;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0080;
    L_0x0070:
        r0 = r6.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getHeight();
        r0 = r0 * 2;
        r0 = r0 / 5;
    L_0x0080:
        r1 = r6.W;
        r1 = r1.f;
        r1 = r1 * 4;
        r0 = java.lang.Math.max(r0, r1);
        r1 = r6.Z;
        r1 = r1.getLayoutParams();
        r1.height = r0;
        r0 = r6.Z;
        r0.requestLayout();
    L_0x0097:
        return;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009e }
    L_0x009e:
        r0 = move-exception;
        throw r0;
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onConfigurationChanged(android.content.res.Configuration):void");
    }

    private void n() {
        try {
            if (this.a_ != null) {
                if (!this.a_.isEmpty()) {
                    try {
                        showDialog(13);
                        return;
                    }
                }
            }
            Log.e(cb[255]);
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private void a(android.net.Uri r9, int r10, int r11, int r12) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r8_this = this;
        r3 = 0;
        r1 = 1;
        r7 = 0;
        r6 = com.whatsapp.App.az;
        r0 = r8.aq;	 Catch:{ RuntimeException -> 0x0046 }
        if (r0 == 0) goto L_0x0021;
    L_0x0009:
        if (r9 != 0) goto L_0x0015;
    L_0x000b:
        r0 = r8;
        r2 = r10;
        r4 = r11;
        r5 = r12;
        r0 = com.whatsapp.wallpaper.p.a(r0, r1, r2, r3, r4, r5);
        if (r6 == 0) goto L_0x003f;
    L_0x0015:
        r2 = -1;
        r0 = r8;
        r1 = r7;
        r3 = r9;
        r4 = r7;
        r5 = r7;
        r0 = com.whatsapp.wallpaper.p.a(r0, r1, r2, r3, r4, r5);
        if (r6 == 0) goto L_0x003f;
    L_0x0021:
        if (r9 != 0) goto L_0x002e;
    L_0x0023:
        r0 = r8.r;	 Catch:{ RuntimeException -> 0x0048 }
        r0 = r0.e;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 1;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = 0;	 Catch:{ RuntimeException -> 0x0048 }
        com.whatsapp.wallpaper.p.a(r8, r0, r1, r10, r2);	 Catch:{ RuntimeException -> 0x0048 }
        if (r6 == 0) goto L_0x0037;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x002e:
        r0 = r8.r;	 Catch:{ RuntimeException -> 0x0048 }
        r0 = r0.e;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = 0;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = 0;	 Catch:{ RuntimeException -> 0x0048 }
        com.whatsapp.wallpaper.p.a(r8, r0, r1, r2, r9);	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0037:
        r0 = r8.r;
        r0 = r0.e;
        r0 = com.whatsapp.wallpaper.p.a(r8, r0);
    L_0x003f:
        r8.a(r0);
        com.whatsapp.util.f.a(r8, r9);
        return;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.a(android.net.Uri, int, int, int):void");
    }

    static void c(Conversation conversation, b bVar) {
        conversation.d(bVar);
    }

    static boolean aa(Conversation conversation) {
        return conversation.ak;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
        r8_this = this;
        r7 = 3;
        r2 = 1;
        r3 = 0;
        r4 = com.whatsapp.App.az;
        r0 = cb;
        r1 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.App.a5();
        r5 = new com.whatsapp.util.y;
        r0 = cb;
        r1 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r0 = r0[r1];
        r5.<init>(r0);
        r0 = com.whatsapp.App.G;	 Catch:{ RuntimeException -> 0x005c }
        if (r0 != r7) goto L_0x0023;
    L_0x0020:
        com.whatsapp.util.g.a(r8);	 Catch:{ RuntimeException -> 0x005c }
    L_0x0023:
        r0 = r8.getWindow();	 Catch:{ RuntimeException -> 0x005e }
        r1 = new android.graphics.drawable.ColorDrawable;	 Catch:{ RuntimeException -> 0x005e }
        r6 = 0;
        r1.<init>(r6);	 Catch:{ RuntimeException -> 0x005e }
        r0.setBackgroundDrawable(r1);	 Catch:{ RuntimeException -> 0x005e }
        super.onCreate(r9);	 Catch:{ RuntimeException -> 0x005e }
        r0 = r8.getSupportActionBar();	 Catch:{ RuntimeException -> 0x005e }
        r1 = r8.au;	 Catch:{ RuntimeException -> 0x005e }
        r0.addOnMenuVisibilityListener(r1);	 Catch:{ RuntimeException -> 0x005e }
        if (r9 == 0) goto L_0x0060;
    L_0x003e:
        r0 = r2;
    L_0x003f:
        r8.E = r0;	 Catch:{ RuntimeException -> 0x0062 }
        r0 = r8.E;	 Catch:{ RuntimeException -> 0x0062 }
        if (r0 != 0) goto L_0x0048;
    L_0x0045:
        com.whatsapp.ConversationRowVoiceNote.a();	 Catch:{ RuntimeException -> 0x0062 }
    L_0x0048:
        r0 = 0;
        r0 = com.whatsapp.util.WhatsAppLibLoader.a(r0);	 Catch:{ RuntimeException -> 0x0064 }
        if (r0 != 0) goto L_0x0066;
    L_0x004f:
        r0 = cb;	 Catch:{ RuntimeException -> 0x0064 }
        r1 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0064 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0064 }
        r8.finish();	 Catch:{ RuntimeException -> 0x0064 }
    L_0x005b:
        return;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = r3;
        goto L_0x003f;
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = com.whatsapp.App.an;	 Catch:{ RuntimeException -> 0x0098 }
        if (r0 == 0) goto L_0x0078;
    L_0x006a:
        r0 = com.whatsapp.App.aJ;	 Catch:{ RuntimeException -> 0x009a }
        r0 = r0.e();	 Catch:{ RuntimeException -> 0x009a }
        if (r0 == 0) goto L_0x0078;
    L_0x0072:
        r0 = com.whatsapp.App.e(r8);	 Catch:{ RuntimeException -> 0x009a }
        if (r0 == r7) goto L_0x009c;
    L_0x0078:
        r0 = cb;
        r1 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = cb;
        r1 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r8, r1);
        r8.startActivity(r0);
        r8.finish();
        goto L_0x005b;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = r8.getIntent();
        r1 = cb;
        r6 = 238; // 0xee float:3.34E-43 double:1.176E-321;
        r1 = r1[r6];
        r0 = r0.getStringExtra(r1);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ RuntimeException -> 0x013f }
        if (r1 == 0) goto L_0x00dd;
    L_0x00b0:
        r1 = r8.getIntent();	 Catch:{ RuntimeException -> 0x013f }
        r1 = r1.getData();	 Catch:{ RuntimeException -> 0x013f }
        r1 = com.whatsapp.contact.ContactProvider.a(r1);	 Catch:{ RuntimeException -> 0x013f }
        if (r1 == 0) goto L_0x00dd;
    L_0x00be:
        r1 = com.whatsapp.App.P;
        r6 = r8.getIntent();
        r6 = r6.getData();
        r1 = r1.a(r6);
        if (r1 == 0) goto L_0x00dd;
    L_0x00ce:
        r0 = r1.e;
        r1 = r8.getIntent();
        r6 = cb;
        r7 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r6 = r6[r7];
        r1.putExtra(r6, r0);
    L_0x00dd:
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x0149;
    L_0x00e3:
        r1 = com.whatsapp.App.P;
        r0 = r1.a(r0);
        if (r0 == 0) goto L_0x00fb;
    L_0x00eb:
        r1 = r0.w();	 Catch:{ RuntimeException -> 0x0141 }
        if (r1 != 0) goto L_0x00f7;
    L_0x00f1:
        r1 = r0.b();	 Catch:{ RuntimeException -> 0x0143 }
        if (r1 == 0) goto L_0x0149;
    L_0x00f7:
        r1 = r0.N;	 Catch:{ RuntimeException -> 0x0145 }
        if (r1 != 0) goto L_0x0149;
    L_0x00fb:
        if (r0 == 0) goto L_0x0102;
    L_0x00fd:
        r1 = 0;
        r6 = 1;
        com.whatsapp.App.a(r0, r1, r6);	 Catch:{ RuntimeException -> 0x0147 }
    L_0x0102:
        r0 = r8.getIntent();
        r1 = cb;
        r6 = 239; // 0xef float:3.35E-43 double:1.18E-321;
        r1 = r1[r6];
        r0 = r0.getStringExtra(r1);
        if (r0 == 0) goto L_0x0149;
    L_0x0112:
        r1 = cb;	 Catch:{ RuntimeException -> 0x013d }
        r2 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x013d }
        com.whatsapp.util.Log.w(r1);	 Catch:{ RuntimeException -> 0x013d }
        r1 = 2131624413; // 0x7f0e01dd float:1.8876005E38 double:1.0531623923E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ RuntimeException -> 0x013d }
        r3 = 0;
        r2[r3] = r0;	 Catch:{ RuntimeException -> 0x013d }
        r0 = r8.getString(r1, r2);	 Catch:{ RuntimeException -> 0x013d }
        r1 = 1;
        com.whatsapp.App.a(r8, r0, r1);	 Catch:{ RuntimeException -> 0x013d }
        r0 = new android.content.Intent;	 Catch:{ RuntimeException -> 0x013d }
        r1 = com.whatsapp.Main.b();	 Catch:{ RuntimeException -> 0x013d }
        r0.<init>(r8, r1);	 Catch:{ RuntimeException -> 0x013d }
        r8.startActivity(r0);	 Catch:{ RuntimeException -> 0x013d }
        r8.finish();	 Catch:{ RuntimeException -> 0x013d }
        goto L_0x005b;
    L_0x013d:
        r0 = move-exception;
        throw r0;
    L_0x013f:
        r0 = move-exception;
        throw r0;
    L_0x0141:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0143 }
    L_0x0143:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0145 }
    L_0x0145:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0147 }
    L_0x0147:
        r0 = move-exception;
        throw r0;
    L_0x0149:
        r0 = r8.getIntent();	 Catch:{ RuntimeException -> 0x02fa }
        r1 = cb;	 Catch:{ RuntimeException -> 0x02fa }
        r6 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r1 = r1[r6];	 Catch:{ RuntimeException -> 0x02fa }
        r6 = 0;
        r0 = r0.getBooleanExtra(r1, r6);	 Catch:{ RuntimeException -> 0x02fa }
        if (r0 == 0) goto L_0x0161;
    L_0x015a:
        r0 = com.whatsapp.a5n.c();	 Catch:{ RuntimeException -> 0x02fa }
        r0.b();	 Catch:{ RuntimeException -> 0x02fa }
    L_0x0161:
        r8.aF = r2;
        r0 = 2130903099; // 0x7f03003b float:1.7413006E38 double:1.052806016E-314;
        r8.setContentView(r0);
        r0 = new com.whatsapp.dq;
        r0.<init>(r8, r8, r8);
        r8.ba = r0;
        r0 = 2131427661; // 0x7f0b014d float:1.8476945E38 double:1.053065184E-314;
        r0 = r8.findViewById(r0);
        r8.y = r0;
        r0 = r8.y;
        r1 = new com.whatsapp.afh;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = 2131427662; // 0x7f0b014e float:1.8476947E38 double:1.0530651844E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r8.aM = r0;
        r0 = 2131427651; // 0x7f0b0143 float:1.8476924E38 double:1.053065179E-314;
        r0 = r8.findViewById(r0);
        r8.ad = r0;
        r0 = 2131427681; // 0x7f0b0161 float:1.8476985E38 double:1.053065194E-314;
        r0 = r8.findViewById(r0);
        r8.N = r0;
        r0 = r8.N;
        r1 = -1;
        r0.setBackgroundColor(r1);
        r0 = 2131427654; // 0x7f0b0146 float:1.847693E38 double:1.0530651804E-314;
        r0 = r8.findViewById(r0);
        r8.bb = r0;
        r0 = r8.getWindowManager();
        r0 = r0.getDefaultDisplay();
        al = r0;
        r0 = com.whatsapp.am1.a();
        r8.W = r0;
        r0 = 2131427655; // 0x7f0b0147 float:1.8476932E38 double:1.053065181E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r8.V = r0;
        r0 = r8.aq;
        if (r0 == 0) goto L_0x02fc;
    L_0x01ce:
        r0 = com.whatsapp.wallpaper.p.f(r8);
        r1 = r0;
    L_0x01d3:
        r0 = 2131427653; // 0x7f0b0145 float:1.8476928E38 double:1.05306518E-314;
        r0 = r8.findViewById(r0);
        r0 = (com.whatsapp.wallpaper.WallPaperView) r0;
        r8.aH = r0;
        r0 = r8.aH;
        r6 = new com.whatsapp.ame;
        r6.<init>(r8);
        r0.setOnSizeChangedListener(r6);
        r8.a(r1);
        r0 = cb;
        r1 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r0 = r0[r1];
        r1 = com.whatsapp.App.p;
        r0 = r1.getSharedPreferences(r0, r3);
        r1 = cb;
        r6 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r1 = r1[r6];
        r1 = r0.getBoolean(r1, r2);
        a9 = r1;
        r1 = cb;
        r6 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r1 = r1[r6];
        r0 = r0.getBoolean(r1, r2);
        k = r0;
        r0 = r8.getListView();
        r8.bd = r0;
        r0 = r8.bd;
        r0.setDividerHeight(r3);
        r0 = 2131427688; // 0x7f0b0168 float:1.8477E38 double:1.053065197E-314;
        r0 = r8.findViewById(r0);
        r0 = (com.whatsapp.ConversationTextEntry) r0;
        r8.a2 = r0;
        r0 = 2131427684; // 0x7f0b0164 float:1.8476991E38 double:1.0530651953E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r8.aP = r0;
        r0 = r8.aP;
        r1 = new com.whatsapp.util.bd;
        r6 = r8.getResources();
        r7 = 2130839100; // 0x7f02063c float:1.7283201E38 double:1.052774396E-314;
        r6 = r6.getDrawable(r7);
        r1.<init>(r6);
        r0.setImageDrawable(r1);
        r0 = 2131427687; // 0x7f0b0167 float:1.8476997E38 double:1.0530651967E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r8.aB = r0;
        r0 = 2131427685; // 0x7f0b0165 float:1.8476993E38 double:1.053065196E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r8.ab = r0;
        r0 = 2131427689; // 0x7f0b0169 float:1.8477001E38 double:1.0530651977E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r8.a6 = r0;
        r0 = r8.a6;
        r1 = new com.whatsapp.z8;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = r8.a6;
        r1 = new com.whatsapp.q5;
        r1.<init>(r8);
        r0.setOnLongClickListener(r1);
        r0 = r8.getBaseContext();
        r1 = cb;
        r6 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r1 = r1[r6];
        r0 = r0.getSystemService(r1);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 2130903101; // 0x7f03003d float:1.741301E38 double:1.052806017E-314;
        r6 = r8.bd;	 Catch:{ RuntimeException -> 0x02f8 }
        r7 = 0;
        r1 = com.whatsapp.b7.a(r0, r1, r6, r7);	 Catch:{ RuntimeException -> 0x02f8 }
        r8.O = r1;	 Catch:{ RuntimeException -> 0x02f8 }
        r1 = r8.bd;	 Catch:{ RuntimeException -> 0x02f8 }
        r6 = r8.O;	 Catch:{ RuntimeException -> 0x02f8 }
        r1.addHeaderView(r6);	 Catch:{ RuntimeException -> 0x02f8 }
        r1 = r8.O;	 Catch:{ RuntimeException -> 0x02f8 }
        r6 = 2131427668; // 0x7f0b0154 float:1.8476959E38 double:1.0530651874E-314;
        r1 = r1.findViewById(r6);	 Catch:{ RuntimeException -> 0x02f8 }
        r6 = new com.whatsapp.e8;	 Catch:{ RuntimeException -> 0x02f8 }
        r6.<init>(r8);	 Catch:{ RuntimeException -> 0x02f8 }
        r1.setOnClickListener(r6);	 Catch:{ RuntimeException -> 0x02f8 }
        r1 = r8.O;	 Catch:{ RuntimeException -> 0x02f8 }
        r6 = 2131427669; // 0x7f0b0155 float:1.847696E38 double:1.053065188E-314;
        r1 = r1.findViewById(r6);	 Catch:{ RuntimeException -> 0x02f8 }
        r6 = new com.whatsapp.afe;	 Catch:{ RuntimeException -> 0x02f8 }
        r6.<init>(r8);	 Catch:{ RuntimeException -> 0x02f8 }
        r1.setOnClickListener(r6);	 Catch:{ RuntimeException -> 0x02f8 }
        r1 = 2130903106; // 0x7f030042 float:1.741302E38 double:1.0528060193E-314;
        r6 = r8.bd;	 Catch:{ RuntimeException -> 0x02f8 }
        r7 = 0;
        r0 = com.whatsapp.b7.a(r0, r1, r6, r7);	 Catch:{ RuntimeException -> 0x02f8 }
        r8.aR = r0;	 Catch:{ RuntimeException -> 0x02f8 }
        r0 = r8.bd;	 Catch:{ RuntimeException -> 0x02f8 }
        r1 = r8.aR;	 Catch:{ RuntimeException -> 0x02f8 }
        r0.addHeaderView(r1);	 Catch:{ RuntimeException -> 0x02f8 }
        r0 = r8.aR;	 Catch:{ RuntimeException -> 0x02f8 }
        r1 = 2131427701; // 0x7f0b0175 float:1.8477026E38 double:1.0530652037E-314;
        r0 = r0.findViewById(r1);	 Catch:{ RuntimeException -> 0x02f8 }
        r1 = new com.whatsapp.aft;	 Catch:{ RuntimeException -> 0x02f8 }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x02f8 }
        r0.setOnClickListener(r1);	 Catch:{ RuntimeException -> 0x02f8 }
        r0 = 0;
        r0 = r8.h(r0);	 Catch:{ RuntimeException -> 0x02f8 }
        if (r0 != 0) goto L_0x0307;
    L_0x02ea:
        r0 = cb;	 Catch:{ RuntimeException -> 0x02f8 }
        r1 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x02f8 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x02f8 }
        r8.finish();	 Catch:{ RuntimeException -> 0x02f8 }
        goto L_0x005b;
    L_0x02f8:
        r0 = move-exception;
        throw r0;
    L_0x02fa:
        r0 = move-exception;
        throw r0;
    L_0x02fc:
        r0 = r8.r;
        r0 = r0.e;
        r0 = com.whatsapp.wallpaper.p.a(r8, r0);
        r1 = r0;
        goto L_0x01d3;
    L_0x0307:
        r0 = r8.bd;
        r0.setScrollbarFadingEnabled(r2);
        r0 = r8.bd;
        r1 = r8.B;
        r0.setOnScrollListener(r1);
        r0 = r8.bd;
        r1 = new com.whatsapp.anh;
        r1.<init>(r8);
        r0.setOnTouchListener(r1);
        r0 = r8.bd;
        r8.registerForContextMenu(r0);
        r0 = r8.a2;
        r0.setScrollbarFadingEnabled(r2);
        r0 = r8.a2;
        r1 = r8.C;
        r0.addTextChangedListener(r1);
        r0 = r8.a2;
        r1 = r8.K;
        r0.setOnEditorActionListener(r1);
        r0 = r8.a2;
        r1 = r8.ar;
        r0.setOnClickListener(r1);
        r0 = r8.a2;
        r1 = a9;
        r0.setInputEnterSend(r1);
        r0 = r8.a2;
        com.whatsapp.b7.a(r0);
        r0 = r8.a2;
        r1 = new com.whatsapp.a3v;
        r1.<init>(r8);
        r0.setOnKeyListener(r1);
        r0 = r8.aP;
        r1 = new com.whatsapp.a1k;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = r8.a2;
        r0 = r0.getText();
        r0 = r0.toString();
        r1 = r8.aP;	 Catch:{ RuntimeException -> 0x0518 }
        r0 = r0.trim();	 Catch:{ RuntimeException -> 0x0518 }
        r0 = r0.length();	 Catch:{ RuntimeException -> 0x0518 }
        if (r0 <= 0) goto L_0x051a;
    L_0x0372:
        r0 = r2;
    L_0x0373:
        r1.setEnabled(r0);	 Catch:{ RuntimeException -> 0x051d }
        r0 = 2131427697; // 0x7f0b0171 float:1.8477018E38 double:1.0530652017E-314;
        r0 = r8.findViewById(r0);	 Catch:{ RuntimeException -> 0x051d }
        r0 = (android.view.ViewGroup) r0;	 Catch:{ RuntimeException -> 0x051d }
        r8.Z = r0;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.aB;	 Catch:{ RuntimeException -> 0x051d }
        r1 = new com.whatsapp.vb;	 Catch:{ RuntimeException -> 0x051d }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r0.setOnClickListener(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = new com.whatsapp.ee;	 Catch:{ RuntimeException -> 0x051d }
        r0.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r8.aX = r0;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.aX;	 Catch:{ RuntimeException -> 0x051d }
        r1 = r8.ay;	 Catch:{ RuntimeException -> 0x051d }
        r0.a(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.aX;	 Catch:{ RuntimeException -> 0x051d }
        r1 = new com.whatsapp.t3;	 Catch:{ RuntimeException -> 0x051d }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r0.setOnDismissListener(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = new com.whatsapp.nc;	 Catch:{ RuntimeException -> 0x051d }
        r0.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r8.Y = r0;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.Y;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r0.getContentView();	 Catch:{ RuntimeException -> 0x051d }
        r1 = 2131427502; // 0x7f0b00ae float:1.8476622E38 double:1.0530651053E-314;
        r0 = r0.findViewById(r1);	 Catch:{ RuntimeException -> 0x051d }
        r1 = new com.whatsapp.rw;	 Catch:{ RuntimeException -> 0x051d }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r0.setOnClickListener(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.Y;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r0.getContentView();	 Catch:{ RuntimeException -> 0x051d }
        r1 = 2131427502; // 0x7f0b00ae float:1.8476622E38 double:1.0530651053E-314;
        r0 = r0.findViewById(r1);	 Catch:{ RuntimeException -> 0x051d }
        r1 = new com.whatsapp.pr;	 Catch:{ RuntimeException -> 0x051d }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r0.setOnLongClickListener(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.Y;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r0.getContentView();	 Catch:{ RuntimeException -> 0x051d }
        r1 = 2131427503; // 0x7f0b00af float:1.8476624E38 double:1.053065106E-314;
        r0 = r0.findViewById(r1);	 Catch:{ RuntimeException -> 0x051d }
        r1 = new com.whatsapp.kv;	 Catch:{ RuntimeException -> 0x051d }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r0.setOnClickListener(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.Y;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r0.getContentView();	 Catch:{ RuntimeException -> 0x051d }
        r1 = 2131427504; // 0x7f0b00b0 float:1.8476626E38 double:1.0530651063E-314;
        r0 = r0.findViewById(r1);	 Catch:{ RuntimeException -> 0x051d }
        r1 = new com.whatsapp.ps;	 Catch:{ RuntimeException -> 0x051d }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r0.setOnClickListener(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.Y;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r0.getContentView();	 Catch:{ RuntimeException -> 0x051d }
        r1 = 2131427505; // 0x7f0b00b1 float:1.8476628E38 double:1.053065107E-314;
        r0 = r0.findViewById(r1);	 Catch:{ RuntimeException -> 0x051d }
        r1 = new com.whatsapp.un;	 Catch:{ RuntimeException -> 0x051d }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r0.setOnClickListener(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.Y;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r0.getContentView();	 Catch:{ RuntimeException -> 0x051d }
        r1 = 2131427506; // 0x7f0b00b2 float:1.847663E38 double:1.0530651073E-314;
        r0 = r0.findViewById(r1);	 Catch:{ RuntimeException -> 0x051d }
        r1 = new com.whatsapp.rg;	 Catch:{ RuntimeException -> 0x051d }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r0.setOnClickListener(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.Y;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r0.getContentView();	 Catch:{ RuntimeException -> 0x051d }
        r1 = 2131427507; // 0x7f0b00b3 float:1.8476632E38 double:1.053065108E-314;
        r0 = r0.findViewById(r1);	 Catch:{ RuntimeException -> 0x051d }
        r1 = new com.whatsapp.py;	 Catch:{ RuntimeException -> 0x051d }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r0.setOnClickListener(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.W;	 Catch:{ RuntimeException -> 0x051d }
        r1 = r8.a2;	 Catch:{ RuntimeException -> 0x051d }
        r0.a(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = 2131427659; // 0x7f0b014b float:1.847694E38 double:1.053065183E-314;
        r0 = r8.findViewById(r0);	 Catch:{ RuntimeException -> 0x051d }
        r8.D = r0;	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.D;	 Catch:{ RuntimeException -> 0x051d }
        if (r0 == 0) goto L_0x0462;
    L_0x0451:
        r0 = r8.D;	 Catch:{ RuntimeException -> 0x051d }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ RuntimeException -> 0x051d }
        r0 = r8.D;	 Catch:{ RuntimeException -> 0x051d }
        r1 = new com.whatsapp.ux;	 Catch:{ RuntimeException -> 0x051d }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051d }
        r0.setOnClickListener(r1);	 Catch:{ RuntimeException -> 0x051d }
    L_0x0462:
        r0 = 2131427658; // 0x7f0b014a float:1.8476938E38 double:1.0530651824E-314;
        r0 = r8.findViewById(r0);	 Catch:{ RuntimeException -> 0x051f }
        r8.aE = r0;	 Catch:{ RuntimeException -> 0x051f }
        r0 = r8.aE;	 Catch:{ RuntimeException -> 0x051f }
        if (r0 == 0) goto L_0x0480;
    L_0x046f:
        r0 = r8.aE;	 Catch:{ RuntimeException -> 0x051f }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ RuntimeException -> 0x051f }
        r0 = r8.aE;	 Catch:{ RuntimeException -> 0x051f }
        r1 = new com.whatsapp.pk;	 Catch:{ RuntimeException -> 0x051f }
        r1.<init>(r8);	 Catch:{ RuntimeException -> 0x051f }
        r0.setOnClickListener(r1);	 Catch:{ RuntimeException -> 0x051f }
    L_0x0480:
        r0 = r8.u;	 Catch:{ RuntimeException -> 0x0521 }
        com.whatsapp.util.bo.c(r0);	 Catch:{ RuntimeException -> 0x0521 }
        com.whatsapp.App.b(r8);	 Catch:{ RuntimeException -> 0x0521 }
        com.whatsapp.App.a(r8);	 Catch:{ RuntimeException -> 0x0521 }
        r0 = com.whatsapp.App.p;	 Catch:{ RuntimeException -> 0x0521 }
        r0 = r0.x();	 Catch:{ RuntimeException -> 0x0521 }
        if (r0 == 0) goto L_0x04a3;
    L_0x0493:
        r0 = cb;	 Catch:{ RuntimeException -> 0x0523 }
        r1 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0523 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ RuntimeException -> 0x0523 }
        r0 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        com.whatsapp.Conversations.a(r8, r0);	 Catch:{ RuntimeException -> 0x0523 }
        if (r4 == 0) goto L_0x04cd;
    L_0x04a3:
        r0 = com.whatsapp.App.ax();	 Catch:{ RuntimeException -> 0x0525 }
        if (r0 == 0) goto L_0x04b9;
    L_0x04a9:
        r0 = cb;	 Catch:{ RuntimeException -> 0x0527 }
        r1 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0527 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ RuntimeException -> 0x0527 }
        r0 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        com.whatsapp.Conversations.a(r8, r0);	 Catch:{ RuntimeException -> 0x0527 }
        if (r4 == 0) goto L_0x04cd;
    L_0x04b9:
        r0 = com.whatsapp.App.aQ();	 Catch:{ RuntimeException -> 0x0529 }
        if (r0 == 0) goto L_0x04cd;
    L_0x04bf:
        r0 = cb;	 Catch:{ RuntimeException -> 0x0529 }
        r1 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0529 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ RuntimeException -> 0x0529 }
        r0 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r8.showDialog(r0);	 Catch:{ RuntimeException -> 0x0529 }
    L_0x04cd:
        if (r9 == 0) goto L_0x050b;
    L_0x04cf:
        r0 = cb;
        r1 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r0 = r0[r1];
        r0 = r9.getParcelableArrayList(r0);
        if (r0 == 0) goto L_0x050b;
    L_0x04db:
        r1 = new java.util.HashMap;
        r1.<init>();
        r8.a_ = r1;
        r1 = r0.iterator();
    L_0x04e6:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0505;
    L_0x04ec:
        r0 = r1.next();
        r0 = (android.os.Parcelable) r0;
        r0 = (com.whatsapp.w4) r0;
        r2 = r8.a_;
        r3 = r0.a;
        r6 = com.whatsapp.App.aJ;
        r0 = r0.a;
        r0 = r6.b(r0);
        r2.put(r3, r0);
        if (r4 == 0) goto L_0x04e6;
    L_0x0505:
        r8.u();
        r8.x();
    L_0x050b:
        r5.c();
        r0 = new com.whatsapp.vn;
        r0.<init>(r8);
        com.whatsapp.util.br.a(r0);
        goto L_0x005b;
    L_0x0518:
        r0 = move-exception;
        throw r0;
    L_0x051a:
        r0 = r3;
        goto L_0x0373;
    L_0x051d:
        r0 = move-exception;
        throw r0;
    L_0x051f:
        r0 = move-exception;
        throw r0;
    L_0x0521:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0523 }
    L_0x0523:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0525 }
    L_0x0525:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0527 }
    L_0x0527:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0529 }
    L_0x0529:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onCreate(android.os.Bundle):void");
    }

    static TextView ai(Conversation conversation) {
        return conversation.V;
    }

    public void a(String str) {
        try {
            if (str.equals(this.u)) {
                E();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu r9) {
        /*
        r8_this = this;
        r7 = 3;
        r6 = 2131624015; // 0x7f0e004f float:1.8875198E38 double:1.0531621957E-314;
        r5 = 15;
        r0 = com.whatsapp.App.az;
        r1 = cb;	 Catch:{ RuntimeException -> 0x0209 }
        r2 = 245; // 0xf5 float:3.43E-43 double:1.21E-321;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0209 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0209 }
        r1 = r8.r;	 Catch:{ RuntimeException -> 0x0209 }
        if (r1 == 0) goto L_0x0204;
    L_0x0015:
        r1 = r8.aQ;	 Catch:{ RuntimeException -> 0x020b }
        if (r1 == 0) goto L_0x00a7;
    L_0x0019:
        r1 = 15;
        r2 = 2131624015; // 0x7f0e004f float:1.8875198E38 double:1.0531621957E-314;
        r3 = 2130838777; // 0x7f0204f9 float:1.7282546E38 double:1.0527742365E-314;
        r1 = r8.a(r9, r1, r2, r3);	 Catch:{ RuntimeException -> 0x020d }
        r8.ax = r1;	 Catch:{ RuntimeException -> 0x020d }
        r1 = 9;
        r2 = 2131624410; // 0x7f0e01da float:1.8875999E38 double:1.053162391E-314;
        r3 = 2130838846; // 0x7f02053e float:1.7282686E38 double:1.0527742706E-314;
        r8.a(r9, r1, r2, r3);	 Catch:{ RuntimeException -> 0x020d }
        r1 = 12;
        r2 = 2131625079; // 0x7f0e0477 float:1.8877356E38 double:1.0531627213E-314;
        r3 = 2130838847; // 0x7f02053f float:1.7282688E38 double:1.052774271E-314;
        r1 = r8.a(r9, r1, r2, r3);	 Catch:{ RuntimeException -> 0x020d }
        r8.aG = r1;	 Catch:{ RuntimeException -> 0x020d }
        r1 = 14;
        r2 = 2131624804; // 0x7f0e0364 float:1.8876798E38 double:1.0531625855E-314;
        r3 = 2130838857; // 0x7f020549 float:1.7282708E38 double:1.052774276E-314;
        r8.a(r9, r1, r2, r3);	 Catch:{ RuntimeException -> 0x020d }
        r1 = r8.u;	 Catch:{ RuntimeException -> 0x020d }
        r1 = com.whatsapp.notification.t.e(r8, r1);	 Catch:{ RuntimeException -> 0x020d }
        if (r1 != 0) goto L_0x0060;
    L_0x0053:
        r1 = 10;
        r2 = 2131624512; // 0x7f0e0240 float:1.8876206E38 double:1.053162441E-314;
        r3 = 2130838849; // 0x7f020541 float:1.7282692E38 double:1.052774272E-314;
        r8.a(r9, r1, r2, r3);	 Catch:{ RuntimeException -> 0x020f }
        if (r0 == 0) goto L_0x006b;
    L_0x0060:
        r1 = 10;
        r2 = 2131624513; // 0x7f0e0241 float:1.8876208E38 double:1.0531624417E-314;
        r3 = 2130838850; // 0x7f020542 float:1.7282694E38 double:1.0527742726E-314;
        r8.a(r9, r1, r2, r3);	 Catch:{ RuntimeException -> 0x020f }
    L_0x006b:
        r1 = 11;
        r2 = 2131625107; // 0x7f0e0493 float:1.8877413E38 double:1.053162735E-314;
        r3 = 2130838863; // 0x7f02054f float:1.728272E38 double:1.052774279E-314;
        r8.a(r9, r1, r2, r3);
        r1 = 2131624545; // 0x7f0e0261 float:1.8876273E38 double:1.0531624575E-314;
        r2 = 2130838848; // 0x7f020540 float:1.728269E38 double:1.0527742716E-314;
        r1 = r8.b(r9, r7, r1, r2);
        r2 = 7;
        r3 = 2131624221; // 0x7f0e011d float:1.8875616E38 double:1.0531622974E-314;
        r4 = 2130838842; // 0x7f02053a float:1.7282678E38 double:1.0527742687E-314;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x0211 }
        r2 = 8;
        r3 = 2131624258; // 0x7f0e0142 float:1.887569E38 double:1.0531623157E-314;
        r4 = 2130838859; // 0x7f02054b float:1.7282712E38 double:1.052774277E-314;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x0211 }
        r2 = com.whatsapp.App.ag();	 Catch:{ RuntimeException -> 0x0211 }
        if (r2 != 0) goto L_0x00a5;
    L_0x009b:
        r2 = 6;
        r3 = 2131623983; // 0x7f0e002f float:1.8875133E38 double:1.05316218E-314;
        r4 = 2130838860; // 0x7f02054c float:1.7282714E38 double:1.0527742775E-314;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x0211 }
    L_0x00a5:
        if (r0 == 0) goto L_0x01d3;
    L_0x00a7:
        r1 = r8.an;	 Catch:{ RuntimeException -> 0x0213 }
        if (r1 == 0) goto L_0x0114;
    L_0x00ab:
        r1 = 2130838777; // 0x7f0204f9 float:1.7282546E38 double:1.0527742365E-314;
        r1 = r8.a(r9, r5, r6, r1);
        r8.ax = r1;
        r1 = 9;
        r2 = 2131624475; // 0x7f0e021b float:1.887613E38 double:1.053162423E-314;
        r3 = 2130838846; // 0x7f02053e float:1.7282686E38 double:1.0527742706E-314;
        r8.a(r9, r1, r2, r3);
        r1 = 12;
        r2 = 2131625081; // 0x7f0e0479 float:1.887736E38 double:1.0531627223E-314;
        r3 = 2130838847; // 0x7f02053f float:1.7282688E38 double:1.052774271E-314;
        r1 = r8.a(r9, r1, r2, r3);
        r8.aG = r1;
        r1 = 14;
        r2 = 2131624804; // 0x7f0e0364 float:1.8876798E38 double:1.0531625855E-314;
        r3 = 2130838857; // 0x7f020549 float:1.7282708E38 double:1.052774276E-314;
        r8.a(r9, r1, r2, r3);
        r1 = 11;
        r2 = 2131625107; // 0x7f0e0493 float:1.8877413E38 double:1.053162735E-314;
        r3 = 2130838863; // 0x7f02054f float:1.728272E38 double:1.052774279E-314;
        r8.a(r9, r1, r2, r3);
        r1 = 2131624545; // 0x7f0e0261 float:1.8876273E38 double:1.0531624575E-314;
        r2 = 2130838848; // 0x7f020540 float:1.728269E38 double:1.0527742716E-314;
        r1 = r8.b(r9, r7, r1, r2);
        r2 = 7;
        r3 = 2131624221; // 0x7f0e011d float:1.8875616E38 double:1.0531622974E-314;
        r4 = 2130838842; // 0x7f02053a float:1.7282678E38 double:1.0527742687E-314;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x0215 }
        r2 = 8;
        r3 = 2131624258; // 0x7f0e0142 float:1.887569E38 double:1.0531623157E-314;
        r4 = 2130838859; // 0x7f02054b float:1.7282712E38 double:1.052774277E-314;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x0215 }
        r2 = com.whatsapp.App.ag();	 Catch:{ RuntimeException -> 0x0215 }
        if (r2 != 0) goto L_0x0112;
    L_0x0108:
        r2 = 6;
        r3 = 2131623983; // 0x7f0e002f float:1.8875133E38 double:1.05316218E-314;
        r4 = 2130838860; // 0x7f02054c float:1.7282714E38 double:1.0527742775E-314;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x0215 }
    L_0x0112:
        if (r0 == 0) goto L_0x01d3;
    L_0x0114:
        r1 = com.whatsapp.App.aR();	 Catch:{ RuntimeException -> 0x0217 }
        if (r1 == 0) goto L_0x013e;
    L_0x011a:
        r1 = 16;
        r2 = 2131624044; // 0x7f0e006c float:1.8875257E38 double:1.05316221E-314;
        r3 = 2130838780; // 0x7f0204fc float:1.7282552E38 double:1.052774238E-314;
        r1 = r8.a(r9, r1, r2, r3);	 Catch:{ RuntimeException -> 0x0219 }
        r8.as = r1;	 Catch:{ RuntimeException -> 0x0219 }
        r1 = r8.as;	 Catch:{ RuntimeException -> 0x0219 }
        r2 = 2;
        r1.setShowAsAction(r2);	 Catch:{ RuntimeException -> 0x0219 }
        r1 = 15;
        r2 = 2131624015; // 0x7f0e004f float:1.8875198E38 double:1.0531621957E-314;
        r3 = 2130838778; // 0x7f0204fa float:1.7282548E38 double:1.052774237E-314;
        r1 = r8.a(r9, r1, r2, r3);	 Catch:{ RuntimeException -> 0x0219 }
        r8.ax = r1;	 Catch:{ RuntimeException -> 0x0219 }
        if (r0 == 0) goto L_0x0159;
    L_0x013e:
        r1 = 0;
        r2 = 2131624044; // 0x7f0e006c float:1.8875257E38 double:1.05316221E-314;
        r3 = 2130838836; // 0x7f020534 float:1.7282666E38 double:1.0527742657E-314;
        r1 = r8.a(r9, r1, r2, r3);	 Catch:{ RuntimeException -> 0x0219 }
        r8.as = r1;	 Catch:{ RuntimeException -> 0x0219 }
        r1 = 15;
        r2 = 2131624015; // 0x7f0e004f float:1.8875198E38 double:1.0531621957E-314;
        r3 = 2130838777; // 0x7f0204f9 float:1.7282546E38 double:1.0527742365E-314;
        r1 = r8.a(r9, r1, r2, r3);	 Catch:{ RuntimeException -> 0x0219 }
        r8.ax = r1;	 Catch:{ RuntimeException -> 0x0219 }
    L_0x0159:
        r1 = 1;
        r2 = 2131625074; // 0x7f0e0472 float:1.8877346E38 double:1.053162719E-314;
        r3 = 2130838839; // 0x7f020537 float:1.7282672E38 double:1.052774267E-314;
        r8.a(r9, r1, r2, r3);
        r1 = 12;
        r2 = 2131625078; // 0x7f0e0476 float:1.8877354E38 double:1.053162721E-314;
        r3 = 2130838847; // 0x7f02053f float:1.7282688E38 double:1.052774271E-314;
        r1 = r8.a(r9, r1, r2, r3);
        r8.aG = r1;
        r1 = 14;
        r2 = 2131624804; // 0x7f0e0364 float:1.8876798E38 double:1.0531625855E-314;
        r3 = 2130838857; // 0x7f020549 float:1.7282708E38 double:1.052774276E-314;
        r8.a(r9, r1, r2, r3);
        r1 = 11;
        r2 = 2131625107; // 0x7f0e0493 float:1.8877413E38 double:1.053162735E-314;
        r3 = 2130838863; // 0x7f02054f float:1.728272E38 double:1.052774279E-314;
        r8.a(r9, r1, r2, r3);
        r1 = 2131624545; // 0x7f0e0261 float:1.8876273E38 double:1.0531624575E-314;
        r2 = 2130838848; // 0x7f020540 float:1.728269E38 double:1.0527742716E-314;
        r1 = r8.b(r9, r7, r1, r2);
        r1.clearHeader();	 Catch:{ RuntimeException -> 0x021b }
        r2 = r8.r;	 Catch:{ RuntimeException -> 0x021b }
        r2 = r2.h;	 Catch:{ RuntimeException -> 0x021b }
        if (r2 != 0) goto L_0x01a4;
    L_0x019a:
        r2 = 5;
        r3 = 2131623977; // 0x7f0e0029 float:1.887512E38 double:1.053162177E-314;
        r4 = 17301555; // 0x1080033 float:2.4979398E-38 double:8.548104E-317;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x021b }
    L_0x01a4:
        r2 = 4;
        r3 = 2131624027; // 0x7f0e005b float:1.8875222E38 double:1.0531622016E-314;
        r4 = 2130838834; // 0x7f020532 float:1.7282662E38 double:1.0527742647E-314;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x021d }
        r2 = 7;
        r3 = 2131624221; // 0x7f0e011d float:1.8875616E38 double:1.0531622974E-314;
        r4 = 2130838842; // 0x7f02053a float:1.7282678E38 double:1.0527742687E-314;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x021d }
        r2 = 8;
        r3 = 2131624258; // 0x7f0e0142 float:1.887569E38 double:1.0531623157E-314;
        r4 = 2130838859; // 0x7f02054b float:1.7282712E38 double:1.052774277E-314;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x021d }
        r2 = com.whatsapp.App.ag();	 Catch:{ RuntimeException -> 0x021d }
        if (r2 != 0) goto L_0x01d3;
    L_0x01c9:
        r2 = 6;
        r3 = 2131623983; // 0x7f0e002f float:1.8875133E38 double:1.05316218E-314;
        r4 = 2130838860; // 0x7f02054c float:1.7282714E38 double:1.0527742775E-314;
        r8.a(r1, r2, r3, r4);	 Catch:{ RuntimeException -> 0x021d }
    L_0x01d3:
        r1 = r8.ax;	 Catch:{ RuntimeException -> 0x021f }
        r2 = 2;
        r1.setShowAsAction(r2);	 Catch:{ RuntimeException -> 0x021f }
        r1 = r8.aQ;	 Catch:{ RuntimeException -> 0x021f }
        if (r1 == 0) goto L_0x01ed;
    L_0x01dd:
        r1 = r8.r;	 Catch:{ RuntimeException -> 0x0221 }
        r1 = r1.e;	 Catch:{ RuntimeException -> 0x0221 }
        r1 = com.whatsapp.bd.f(r1);	 Catch:{ RuntimeException -> 0x0221 }
        if (r1 != 0) goto L_0x01ed;
    L_0x01e7:
        r1 = r8.ax;	 Catch:{ RuntimeException -> 0x0221 }
        r2 = 0;
        r1.setVisible(r2);	 Catch:{ RuntimeException -> 0x0221 }
    L_0x01ed:
        r1 = r8.aI;	 Catch:{ RuntimeException -> 0x0223 }
        if (r1 == 0) goto L_0x01fe;
    L_0x01f1:
        r1 = r8.aG;	 Catch:{ RuntimeException -> 0x0225 }
        r2 = r8.aI;	 Catch:{ RuntimeException -> 0x0225 }
        r2 = r2.booleanValue();	 Catch:{ RuntimeException -> 0x0225 }
        r1.setEnabled(r2);	 Catch:{ RuntimeException -> 0x0225 }
        if (r0 == 0) goto L_0x0204;
    L_0x01fe:
        r0 = r8.aG;	 Catch:{ RuntimeException -> 0x0225 }
        r1 = 0;
        r0.setEnabled(r1);	 Catch:{ RuntimeException -> 0x0225 }
    L_0x0204:
        r0 = super.onCreateOptionsMenu(r9);
        return r0;
    L_0x0209:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x020b }
    L_0x020b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x020d }
    L_0x020d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x020f }
    L_0x020f:
        r0 = move-exception;
        throw r0;
    L_0x0211:
        r0 = move-exception;
        throw r0;
    L_0x0213:
        r0 = move-exception;
        throw r0;
    L_0x0215:
        r0 = move-exception;
        throw r0;
    L_0x0217:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0219 }
    L_0x0219:
        r0 = move-exception;
        throw r0;
    L_0x021b:
        r0 = move-exception;
        throw r0;
    L_0x021d:
        r0 = move-exception;
        throw r0;
    L_0x021f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0221 }
    L_0x0221:
        r0 = move-exception;
        throw r0;
    L_0x0223:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0225 }
    L_0x0225:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onCreateOptionsMenu(com.actionbarsherlock.view.Menu):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
        r9_this = this;
        r8 = com.whatsapp.App.az;
        if (r11 != 0) goto L_0x006c;
    L_0x0004:
        if (r12 == 0) goto L_0x006c;
    L_0x0006:
        r0 = cb;	 Catch:{ IOException -> 0x0077 }
        r1 = 79;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0077 }
        r1 = 0;
        r0 = r12.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x0077 }
        if (r0 == 0) goto L_0x0028;
    L_0x0013:
        r0 = cb;	 Catch:{ IOException -> 0x0079 }
        r1 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0079 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0079 }
        r0 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0079 }
        r1 = 2131624289; // 0x7f0e0161 float:1.8875754E38 double:1.053162331E-314;
        r0 = r0.getString(r1);	 Catch:{ IOException -> 0x0079 }
        com.whatsapp.App.a(r9, r0);	 Catch:{ IOException -> 0x0079 }
    L_0x0028:
        r0 = cb;	 Catch:{ IOException -> 0x007b }
        r1 = 71;
        r0 = r0[r1];	 Catch:{ IOException -> 0x007b }
        r1 = 0;
        r0 = r12.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x007b }
        if (r0 == 0) goto L_0x004a;
    L_0x0035:
        r0 = cb;	 Catch:{ IOException -> 0x007b }
        r1 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x007b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x007b }
        r0 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x007b }
        r1 = 2131624285; // 0x7f0e015d float:1.8875745E38 double:1.053162329E-314;
        r0 = r0.getString(r1);	 Catch:{ IOException -> 0x007b }
        com.whatsapp.App.a(r9, r0);	 Catch:{ IOException -> 0x007b }
    L_0x004a:
        r0 = cb;	 Catch:{ IOException -> 0x007d }
        r1 = 66;
        r0 = r0[r1];	 Catch:{ IOException -> 0x007d }
        r1 = 0;
        r0 = r12.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x007d }
        if (r0 == 0) goto L_0x006c;
    L_0x0057:
        r0 = cb;	 Catch:{ IOException -> 0x007d }
        r1 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x007d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x007d }
        r0 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x007d }
        r1 = 2131624280; // 0x7f0e0158 float:1.8875735E38 double:1.0531623266E-314;
        r0 = r0.getString(r1);	 Catch:{ IOException -> 0x007d }
        com.whatsapp.App.a(r9, r0);	 Catch:{ IOException -> 0x007d }
    L_0x006c:
        r0 = -1;
        if (r11 == r0) goto L_0x0081;
    L_0x006f:
        r0 = 14;
        if (r10 != r0) goto L_0x0081;
    L_0x0073:
        r9.finish();	 Catch:{ IOException -> 0x007f }
    L_0x0076:
        return;
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        switch(r10) {
            case 2: goto L_0x0088;
            case 3: goto L_0x0084;
            case 4: goto L_0x04f6;
            case 5: goto L_0x0297;
            case 6: goto L_0x0084;
            case 7: goto L_0x059e;
            case 8: goto L_0x0596;
            case 9: goto L_0x0084;
            case 10: goto L_0x019d;
            case 11: goto L_0x00f4;
            case 12: goto L_0x01ce;
            case 13: goto L_0x0153;
            case 14: goto L_0x0206;
            case 15: goto L_0x0084;
            case 16: goto L_0x0084;
            case 17: goto L_0x06b7;
            case 18: goto L_0x067d;
            case 19: goto L_0x0927;
            case 20: goto L_0x095a;
            case 21: goto L_0x0206;
            case 22: goto L_0x0206;
            case 23: goto L_0x01ec;
            case 24: goto L_0x0468;
            default: goto L_0x0084;
        };
    L_0x0084:
        r0 = 1;
        T = r0;
        goto L_0x0076;
    L_0x0088:
        r0 = -1;
        if (r11 != r0) goto L_0x0084;
    L_0x008b:
        r0 = r9.a_;	 Catch:{ IOException -> 0x0342 }
        if (r0 == 0) goto L_0x00df;
    L_0x008f:
        r0 = cb;
        r1 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r0 = r0[r1];
        r0 = r12.getStringExtra(r0);
        r1 = com.whatsapp.App.P;
        r1 = r1.a(r0);
        if (r1 == 0) goto L_0x00cd;
    L_0x00a1:
        r0 = r9.f();
        r2 = r0.iterator();
    L_0x00a9:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00ba;
    L_0x00af:
        r0 = r2.next();
        r0 = (com.whatsapp.protocol.b) r0;
        com.whatsapp.App.b(r0, r1);
        if (r8 == 0) goto L_0x00a9;
    L_0x00ba:
        r0 = r9.u;	 Catch:{ IOException -> 0x0344 }
        r2 = r1.e;	 Catch:{ IOException -> 0x0344 }
        r0 = r0.equals(r2);	 Catch:{ IOException -> 0x0344 }
        if (r0 != 0) goto L_0x00dd;
    L_0x00c4:
        r0 = a(r1);	 Catch:{ IOException -> 0x0344 }
        r9.startActivity(r0);	 Catch:{ IOException -> 0x0344 }
        if (r8 == 0) goto L_0x00dd;
    L_0x00cd:
        r0 = cb;	 Catch:{ IOException -> 0x0346 }
        r1 = 97;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0346 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0346 }
        r0 = 2131624462; // 0x7f0e020e float:1.8876104E38 double:1.0531624165E-314;
        r1 = 0;
        com.whatsapp.App.b(r9, r0, r1);	 Catch:{ IOException -> 0x0346 }
    L_0x00dd:
        if (r8 == 0) goto L_0x00ef;
    L_0x00df:
        r0 = cb;	 Catch:{ IOException -> 0x0348 }
        r1 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0348 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0348 }
        r0 = 2131624531; // 0x7f0e0253 float:1.8876244E38 double:1.0531624506E-314;
        r1 = 0;
        com.whatsapp.App.b(r9, r0, r1);	 Catch:{ IOException -> 0x0348 }
    L_0x00ef:
        r9.b();	 Catch:{ IOException -> 0x034a }
        if (r8 == 0) goto L_0x0084;
    L_0x00f4:
        r0 = -1;
        if (r11 != r0) goto L_0x0148;
    L_0x00f7:
        r0 = r9.j;	 Catch:{ IOException -> 0x034c }
        if (r0 == 0) goto L_0x012a;
    L_0x00fb:
        r0 = new com.whatsapp.m8;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r9.aw;
        r1 = r1.append(r2);
        r2 = cb;
        r3 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r1 = com.whatsapp.App.P;	 Catch:{ IOException -> 0x034e }
        r1.i(r0);	 Catch:{ IOException -> 0x034e }
        r0 = r0.e;	 Catch:{ IOException -> 0x034e }
        i(r0);	 Catch:{ IOException -> 0x034e }
        r0 = r9.aS;	 Catch:{ IOException -> 0x034e }
        r0.notifyDataSetChanged();	 Catch:{ IOException -> 0x034e }
        if (r8 == 0) goto L_0x0084;
    L_0x012a:
        if (r12 == 0) goto L_0x013f;
    L_0x012c:
        r0 = r12.getData();	 Catch:{ IOException -> 0x0350 }
        if (r0 == 0) goto L_0x013f;
    L_0x0132:
        r0 = com.whatsapp.App.P;	 Catch:{ IOException -> 0x0352 }
        r1 = r12.getData();	 Catch:{ IOException -> 0x0352 }
        r2 = r9.r;	 Catch:{ IOException -> 0x0352 }
        r0.a(r1, r2);	 Catch:{ IOException -> 0x0352 }
        if (r8 == 0) goto L_0x0084;
    L_0x013f:
        r0 = com.whatsapp.App.P;	 Catch:{ IOException -> 0x0354 }
        r1 = r9.r;	 Catch:{ IOException -> 0x0354 }
        r0.i(r1);	 Catch:{ IOException -> 0x0354 }
        if (r8 == 0) goto L_0x0084;
    L_0x0148:
        r0 = cb;	 Catch:{ IOException -> 0x0356 }
        r1 = 99;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0356 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0356 }
        if (r8 == 0) goto L_0x0084;
    L_0x0153:
        r0 = -1;
        if (r11 != r0) goto L_0x0192;
    L_0x0156:
        r0 = r9.j;	 Catch:{ IOException -> 0x035a }
        if (r0 == 0) goto L_0x0189;
    L_0x015a:
        r0 = new com.whatsapp.m8;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r9.aw;
        r1 = r1.append(r2);
        r2 = cb;
        r3 = 100;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r1 = com.whatsapp.App.P;	 Catch:{ IOException -> 0x035c }
        r1.i(r0);	 Catch:{ IOException -> 0x035c }
        r0 = r0.e;	 Catch:{ IOException -> 0x035c }
        i(r0);	 Catch:{ IOException -> 0x035c }
        r0 = r9.aS;	 Catch:{ IOException -> 0x035c }
        r0.notifyDataSetChanged();	 Catch:{ IOException -> 0x035c }
        if (r8 == 0) goto L_0x0084;
    L_0x0189:
        r0 = com.whatsapp.App.P;	 Catch:{ IOException -> 0x035c }
        r1 = r9.r;	 Catch:{ IOException -> 0x035c }
        r0.i(r1);	 Catch:{ IOException -> 0x035c }
        if (r8 == 0) goto L_0x0084;
    L_0x0192:
        r0 = cb;	 Catch:{ IOException -> 0x035e }
        r1 = 69;
        r0 = r0[r1];	 Catch:{ IOException -> 0x035e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x035e }
        if (r8 == 0) goto L_0x0084;
    L_0x019d:
        r0 = -1;
        if (r11 != r0) goto L_0x01c0;
    L_0x01a0:
        r0 = r9.v;	 Catch:{ IOException -> 0x0362 }
        if (r0 == 0) goto L_0x01ab;
    L_0x01a4:
        r0 = com.whatsapp.App.P;	 Catch:{ IOException -> 0x0364 }
        r1 = r9.v;	 Catch:{ IOException -> 0x0364 }
        r0.i(r1);	 Catch:{ IOException -> 0x0364 }
    L_0x01ab:
        r0 = r9.O;	 Catch:{ IOException -> 0x0366 }
        if (r0 == 0) goto L_0x01c9;
    L_0x01af:
        r0 = r9.bd;	 Catch:{ IOException -> 0x0366 }
        r1 = r9.O;	 Catch:{ IOException -> 0x0366 }
        r0.removeHeaderView(r1);	 Catch:{ IOException -> 0x0366 }
        r0 = 0;
        r9.O = r0;	 Catch:{ IOException -> 0x0366 }
        r0 = r9.aS;	 Catch:{ IOException -> 0x0366 }
        r0.notifyDataSetChanged();	 Catch:{ IOException -> 0x0366 }
        if (r8 == 0) goto L_0x01c9;
    L_0x01c0:
        r0 = cb;	 Catch:{ IOException -> 0x0368 }
        r1 = 82;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0368 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0368 }
    L_0x01c9:
        r0 = 0;
        r9.v = r0;	 Catch:{ IOException -> 0x036a }
        if (r8 == 0) goto L_0x0084;
    L_0x01ce:
        r0 = -1;
        if (r11 != r0) goto L_0x01de;
    L_0x01d1:
        r0 = r9.v;	 Catch:{ IOException -> 0x036c }
        if (r0 == 0) goto L_0x01e7;
    L_0x01d5:
        r0 = com.whatsapp.App.P;	 Catch:{ IOException -> 0x036e }
        r1 = r9.v;	 Catch:{ IOException -> 0x036e }
        r0.i(r1);	 Catch:{ IOException -> 0x036e }
        if (r8 == 0) goto L_0x01e7;
    L_0x01de:
        r0 = cb;	 Catch:{ IOException -> 0x0370 }
        r1 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0370 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0370 }
    L_0x01e7:
        r0 = 0;
        r9.v = r0;	 Catch:{ IOException -> 0x0372 }
        if (r8 == 0) goto L_0x0084;
    L_0x01ec:
        r0 = -1;
        if (r11 != r0) goto L_0x01ff;
    L_0x01ef:
        r0 = com.whatsapp.util.f.c(r9);
        r0 = android.net.Uri.fromFile(r0);
        com.whatsapp.util.f.a(r9, r0);	 Catch:{ IOException -> 0x0374 }
        r9.a(r0);	 Catch:{ IOException -> 0x0374 }
        if (r8 == 0) goto L_0x0084;
    L_0x01ff:
        if (r11 != 0) goto L_0x0084;
    L_0x0201:
        com.whatsapp.util.f.b(r9);	 Catch:{ IOException -> 0x0376 }
        if (r8 == 0) goto L_0x0084;
    L_0x0206:
        if (r12 == 0) goto L_0x0084;
    L_0x0208:
        r0 = cb;
        r1 = 88;
        r0 = r0[r1];
        r1 = 0;
        r0 = r12.getBooleanExtra(r0, r1);
        if (r0 == 0) goto L_0x0400;
    L_0x0215:
        r0 = -1;
        if (r11 != r0) goto L_0x0275;
    L_0x0218:
        r0 = r12.getData();
        if (r0 == 0) goto L_0x0395;
    L_0x021e:
        r1 = r0.toString();	 Catch:{ IOException -> 0x037a }
        r2 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;	 Catch:{ IOException -> 0x037a }
        r2 = r2.toString();	 Catch:{ IOException -> 0x037a }
        r1 = r1.startsWith(r2);	 Catch:{ IOException -> 0x037a }
        if (r1 != 0) goto L_0x023e;
    L_0x022e:
        r1 = r0.toString();	 Catch:{ IOException -> 0x037c }
        r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;	 Catch:{ IOException -> 0x037c }
        r2 = r2.toString();	 Catch:{ IOException -> 0x037c }
        r1 = r1.startsWith(r2);	 Catch:{ IOException -> 0x037c }
        if (r1 == 0) goto L_0x0254;
    L_0x023e:
        r1 = cb;	 Catch:{ IOException -> 0x037e }
        r2 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x037e }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x037e }
        r1 = r9.getBaseContext();	 Catch:{ IOException -> 0x037e }
        r2 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ IOException -> 0x037e }
        if (r8 == 0) goto L_0x0273;
    L_0x0254:
        r3 = com.whatsapp.util.f.e(r0);	 Catch:{ IOException -> 0x0384 }
        r0 = com.whatsapp.id.a(r3);	 Catch:{ IOException -> 0x0380 }
        if (r0 == 0) goto L_0x0265;
    L_0x025e:
        r0 = r9.r;	 Catch:{ IOException -> 0x0380 }
        com.whatsapp.VideoPreviewActivity.a(r9, r0, r3);	 Catch:{ IOException -> 0x0380 }
        if (r8 == 0) goto L_0x0273;
    L_0x0265:
        r0 = r9.r;	 Catch:{ IOException -> 0x0382 }
        r2 = r0.e;	 Catch:{ IOException -> 0x0382 }
        r4 = 3;
        r5 = 1;
        r0 = r9;
        r1 = r9;
        com.whatsapp.util.f.a(r0, r1, r2, r3, r4, r5);	 Catch:{ IOException -> 0x0382 }
        r0 = 1;
        r9.F = r0;	 Catch:{ IOException -> 0x0382 }
    L_0x0273:
        if (r8 == 0) goto L_0x0295;
    L_0x0275:
        r0 = 1;
        if (r11 != r0) goto L_0x0295;
    L_0x0278:
        r0 = 1;
        r9.F = r0;	 Catch:{ g -> 0x03ed }
        r0 = r9.r;	 Catch:{ IOException -> 0x03ef }
        r2 = r0.e;	 Catch:{ IOException -> 0x03ef }
        r3 = new java.io.File;	 Catch:{ IOException -> 0x03ef }
        r0 = cb;	 Catch:{ IOException -> 0x03ef }
        r1 = 89;
        r0 = r0[r1];	 Catch:{ IOException -> 0x03ef }
        r0 = r12.getStringExtra(r0);	 Catch:{ IOException -> 0x03ef }
        r3.<init>(r0);	 Catch:{ IOException -> 0x03ef }
        r4 = 3;
        r5 = 1;
        r0 = r9;
        r1 = r9;
        com.whatsapp.util.f.a(r0, r1, r2, r3, r4, r5);	 Catch:{ IOException -> 0x03ef }
    L_0x0295:
        if (r8 == 0) goto L_0x0084;
    L_0x0297:
        r0 = -1;
        if (r11 != r0) goto L_0x0084;
    L_0x029a:
        r0 = r12.getData();	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0457 }
        if (r0 != 0) goto L_0x02b6;
    L_0x02a0:
        r1 = cb;	 Catch:{ IOException -> 0x0455, FileNotFoundException -> 0x0331 }
        r2 = 74;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0455, FileNotFoundException -> 0x0331 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x0455, FileNotFoundException -> 0x0331 }
        r1 = r9.getBaseContext();	 Catch:{ IOException -> 0x0455, FileNotFoundException -> 0x0331 }
        r2 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ IOException -> 0x0455, FileNotFoundException -> 0x0331 }
        if (r8 == 0) goto L_0x0084;
    L_0x02b6:
        r3 = com.whatsapp.util.f.e(r0);	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0457 }
        r0 = android.os.Build.MANUFACTURER;	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0457 }
        r1 = 32;
        r2 = 95;
        r0 = r0.replace(r1, r2);	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0457 }
        r1 = cb;	 Catch:{ IOException -> 0x0746, FileNotFoundException -> 0x0331 }
        r2 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0746, FileNotFoundException -> 0x0331 }
        r0 = r0.equalsIgnoreCase(r1);	 Catch:{ IOException -> 0x0746, FileNotFoundException -> 0x0331 }
        if (r0 == 0) goto L_0x0317;
    L_0x02d0:
        r0 = cb;	 Catch:{ IOException -> 0x0746, FileNotFoundException -> 0x0331 }
        r1 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0746, FileNotFoundException -> 0x0331 }
        r1 = 1;
        r0 = r12.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x0746, FileNotFoundException -> 0x0331 }
        if (r0 == 0) goto L_0x0317;
    L_0x02dd:
        r0 = new android.content.Intent;	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0457 }
        r1 = com.whatsapp.RecordAudio.class;
        r0.<init>(r9, r1);	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0457 }
        r1 = cb;	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r2 = 1;
        r0.putExtra(r1, r2);	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r1 = cb;	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r2 = 1;
        r0.putExtra(r1, r2);	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r1 = cb;	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r2 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r2 = r9.r;	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r2 = r2.e;	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r0.putExtra(r1, r2);	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r1 = cb;	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r2 = 87;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r2 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r0.putExtra(r1, r2);	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r9.startActivity(r0);	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        if (r8 == 0) goto L_0x032c;
    L_0x0317:
        r0 = r9.r;	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r2 = r0.e;	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r4 = 2;
        r0 = cb;	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r1 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r1 = 1;
        r5 = r12.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
        r0 = r9;
        r1 = r9;
        com.whatsapp.util.f.a(r0, r1, r2, r3, r4, r5);	 Catch:{ IOException -> 0x0748, FileNotFoundException -> 0x0331 }
    L_0x032c:
        r0 = 1;
        r9.F = r0;	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0457 }
        goto L_0x0084;
    L_0x0331:
        r0 = move-exception;
        r1 = r9.getBaseContext();
        r2 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);
        com.whatsapp.util.Log.c(r0);
        goto L_0x0084;
    L_0x0342:
        r0 = move-exception;
        throw r0;
    L_0x0344:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0346 }
    L_0x0346:
        r0 = move-exception;
        throw r0;
    L_0x0348:
        r0 = move-exception;
        throw r0;
    L_0x034a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x034c }
    L_0x034c:
        r0 = move-exception;
        throw r0;
    L_0x034e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0350 }
    L_0x0350:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0352 }
    L_0x0352:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0354 }
    L_0x0354:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0356 }
    L_0x0356:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0358 }
    L_0x0358:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x035a }
    L_0x035a:
        r0 = move-exception;
        throw r0;
    L_0x035c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x035e }
    L_0x035e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0360 }
    L_0x0360:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0362 }
    L_0x0362:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0364 }
    L_0x0364:
        r0 = move-exception;
        throw r0;
    L_0x0366:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0368 }
    L_0x0368:
        r0 = move-exception;
        throw r0;
    L_0x036a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x036c }
    L_0x036c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x036e }
    L_0x036e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0370 }
    L_0x0370:
        r0 = move-exception;
        throw r0;
    L_0x0372:
        r0 = move-exception;
        throw r0;
    L_0x0374:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0376 }
    L_0x0376:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0378 }
    L_0x0378:
        r0 = move-exception;
        throw r0;
    L_0x037a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x037c }
    L_0x037c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x037e }
    L_0x037e:
        r0 = move-exception;
        throw r0;
    L_0x0380:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0382 }
    L_0x0382:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0384 }
    L_0x0384:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        r0 = r9.getBaseContext();
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);
        if (r8 == 0) goto L_0x0273;
    L_0x0395:
        r2 = new com.whatsapp.MediaData;
        r2.<init>();
        r0 = new java.io.File;
        r1 = cb;
        r3 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r1 = r1[r3];
        r1 = r12.getStringExtra(r1);
        r0.<init>(r1);
        r2.file = r0;
        r0 = cb;
        r1 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r0 = r0[r1];
        r4 = 0;
        r0 = r12.getLongExtra(r0, r4);
        r2.trimFrom = r0;
        r0 = cb;
        r1 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r0 = r0[r1];
        r4 = 0;
        r0 = r12.getLongExtra(r0, r4);
        r2.trimTo = r0;
        r0 = r9.u;
        r1 = r2.file;
        r1 = r1.getAbsolutePath();
        r4 = r2.trimFrom;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r1 = com.whatsapp.util.f.a(r1, r4);
        r3 = 3;
        r4 = 0;
        r5 = cb;
        r6 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r5 = r5[r6];
        r5 = r12.getStringExtra(r5);
        r6 = 0;
        com.whatsapp.App.a(r0, r1, r2, r3, r4, r5, r6);
        r0 = 1;
        r9.F = r0;
        goto L_0x0273;
    L_0x03ed:
        r0 = move-exception;
        throw r0;
    L_0x03ef:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ IOException -> 0x044d }
        r0 = r9.getBaseContext();	 Catch:{ IOException -> 0x044d }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ IOException -> 0x044d }
        if (r8 == 0) goto L_0x0295;
    L_0x0400:
        r0 = -1;
        if (r11 != r0) goto L_0x0435;
    L_0x0403:
        r0 = r12.getData();
        if (r0 == 0) goto L_0x040e;
    L_0x0409:
        r9.a(r0);	 Catch:{ IOException -> 0x044f }
        if (r8 == 0) goto L_0x0433;
    L_0x040e:
        r0 = cb;
        r1 = 98;
        r0 = r0[r1];
        r0 = r12.getParcelableArrayListExtra(r0);
        if (r0 == 0) goto L_0x041f;
    L_0x041a:
        r9.a(r0);	 Catch:{ IOException -> 0x0451 }
        if (r8 == 0) goto L_0x0433;
    L_0x041f:
        r0 = cb;	 Catch:{ IOException -> 0x0453 }
        r1 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0453 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0453 }
        r0 = r9.getBaseContext();	 Catch:{ IOException -> 0x0453 }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ IOException -> 0x0453 }
    L_0x0433:
        if (r8 == 0) goto L_0x0295;
    L_0x0435:
        r0 = cb;	 Catch:{ IOException -> 0x044b }
        r1 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x044b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x044b }
        r0 = r9.getBaseContext();	 Catch:{ IOException -> 0x044b }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ IOException -> 0x044b }
        goto L_0x0295;
    L_0x044b:
        r0 = move-exception;
        throw r0;
    L_0x044d:
        r0 = move-exception;
        throw r0;
    L_0x044f:
        r0 = move-exception;
        throw r0;
    L_0x0451:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0453 }
    L_0x0453:
        r0 = move-exception;
        throw r0;
    L_0x0455:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0457 }
    L_0x0457:
        r0 = move-exception;
        r1 = r9.getBaseContext();	 Catch:{ IOException -> 0x074a }
        r2 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ IOException -> 0x074a }
        com.whatsapp.util.Log.c(r0);	 Catch:{ IOException -> 0x074a }
        if (r8 == 0) goto L_0x0084;
    L_0x0468:
        r0 = -1;
        if (r11 != r0) goto L_0x04c3;
    L_0x046b:
        r2 = new com.whatsapp.MediaData;
        r2.<init>();
        r0 = new java.io.File;	 Catch:{ IOException -> 0x074c }
        r1 = cb;	 Catch:{ IOException -> 0x074c }
        r3 = 75;
        r1 = r1[r3];	 Catch:{ IOException -> 0x074c }
        r1 = r12.getStringExtra(r1);	 Catch:{ IOException -> 0x074c }
        r0.<init>(r1);	 Catch:{ IOException -> 0x074c }
        r2.file = r0;	 Catch:{ IOException -> 0x074c }
        r0 = cb;	 Catch:{ IOException -> 0x074c }
        r1 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x074c }
        r4 = 0;
        r0 = r12.getLongExtra(r0, r4);	 Catch:{ IOException -> 0x074c }
        r2.trimFrom = r0;	 Catch:{ IOException -> 0x074c }
        r0 = cb;	 Catch:{ IOException -> 0x074c }
        r1 = 77;
        r0 = r0[r1];	 Catch:{ IOException -> 0x074c }
        r4 = 0;
        r0 = r12.getLongExtra(r0, r4);	 Catch:{ IOException -> 0x074c }
        r2.trimTo = r0;	 Catch:{ IOException -> 0x074c }
        r0 = r9.u;	 Catch:{ IOException -> 0x074c }
        r1 = r2.file;	 Catch:{ IOException -> 0x074c }
        r1 = r1.getAbsolutePath();	 Catch:{ IOException -> 0x074c }
        r4 = r2.trimFrom;	 Catch:{ IOException -> 0x074c }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r1 = com.whatsapp.util.f.a(r1, r4);	 Catch:{ IOException -> 0x074c }
        r3 = 3;
        r4 = 0;
        r5 = cb;	 Catch:{ IOException -> 0x074c }
        r6 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r5 = r5[r6];	 Catch:{ IOException -> 0x074c }
        r5 = r12.getStringExtra(r5);	 Catch:{ IOException -> 0x074c }
        r6 = 0;
        com.whatsapp.App.a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x074c }
        r0 = 1;
        r9.F = r0;	 Catch:{ IOException -> 0x074c }
        if (r8 == 0) goto L_0x0084;
    L_0x04c3:
        r0 = 1;
        if (r11 != r0) goto L_0x0084;
    L_0x04c6:
        r0 = 1;
        r9.F = r0;	 Catch:{ g -> 0x074e }
        r0 = r9.r;	 Catch:{ IOException -> 0x04e5 }
        r2 = r0.e;	 Catch:{ IOException -> 0x04e5 }
        r3 = new java.io.File;	 Catch:{ IOException -> 0x04e5 }
        r0 = cb;	 Catch:{ IOException -> 0x04e5 }
        r1 = 81;
        r0 = r0[r1];	 Catch:{ IOException -> 0x04e5 }
        r0 = r12.getStringExtra(r0);	 Catch:{ IOException -> 0x04e5 }
        r3.<init>(r0);	 Catch:{ IOException -> 0x04e5 }
        r4 = 3;
        r5 = 1;
        r0 = r9;
        r1 = r9;
        com.whatsapp.util.f.a(r0, r1, r2, r3, r4, r5);	 Catch:{ IOException -> 0x04e5 }
        goto L_0x0084;
    L_0x04e5:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ IOException -> 0x0750 }
        r0 = r9.getBaseContext();	 Catch:{ IOException -> 0x0750 }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ IOException -> 0x0750 }
        if (r8 == 0) goto L_0x0084;
    L_0x04f6:
        r0 = -1;
        if (r11 != r0) goto L_0x0589;
    L_0x04f9:
        r5 = 0;
        r0 = 0;
        if (r12 == 0) goto L_0x0754;
    L_0x04fd:
        r1 = r12.getData();	 Catch:{ IOException -> 0x0752 }
        if (r1 == 0) goto L_0x0754;
    L_0x0503:
        r0 = r12.getData();	 Catch:{ IOException -> 0x0578 }
        r5 = 1;
    L_0x0508:
        if (r0 != 0) goto L_0x0520;
    L_0x050a:
        r1 = cb;	 Catch:{ IOException -> 0x0783 }
        r2 = 90;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0783 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x0783 }
        r1 = r9.getBaseContext();	 Catch:{ IOException -> 0x0783 }
        r2 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ IOException -> 0x0783 }
        if (r8 == 0) goto L_0x0084;
    L_0x0520:
        r1 = r0.toString();	 Catch:{ IOException -> 0x0785 }
        r2 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;	 Catch:{ IOException -> 0x0785 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0785 }
        r1 = r1.startsWith(r2);	 Catch:{ IOException -> 0x0785 }
        if (r1 != 0) goto L_0x0540;
    L_0x0530:
        r1 = r0.toString();	 Catch:{ IOException -> 0x0787 }
        r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;	 Catch:{ IOException -> 0x0787 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0787 }
        r1 = r1.startsWith(r2);	 Catch:{ IOException -> 0x0787 }
        if (r1 == 0) goto L_0x0556;
    L_0x0540:
        r1 = cb;	 Catch:{ IOException -> 0x0789 }
        r2 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0789 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x0789 }
        r1 = r9.getBaseContext();	 Catch:{ IOException -> 0x0789 }
        r2 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);	 Catch:{ IOException -> 0x0789 }
        if (r8 == 0) goto L_0x0084;
    L_0x0556:
        r3 = com.whatsapp.util.f.e(r0);	 Catch:{ IOException -> 0x0578 }
        r0 = com.whatsapp.id.a(r3);	 Catch:{ IOException -> 0x078b }
        if (r0 == 0) goto L_0x0567;
    L_0x0560:
        r0 = r9.r;	 Catch:{ IOException -> 0x078b }
        com.whatsapp.VideoPreviewActivity.a(r9, r0, r3);	 Catch:{ IOException -> 0x078b }
        if (r8 == 0) goto L_0x0084;
    L_0x0567:
        r0 = 1;
        r9.F = r0;	 Catch:{ IOException -> 0x0576 }
        r0 = r9.r;	 Catch:{ IOException -> 0x0576 }
        r2 = r0.e;	 Catch:{ IOException -> 0x0576 }
        r4 = 3;
        r0 = r9;
        r1 = r9;
        com.whatsapp.util.f.a(r0, r1, r2, r3, r4, r5);	 Catch:{ IOException -> 0x0576 }
        goto L_0x0084;
    L_0x0576:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0578 }
    L_0x0578:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ IOException -> 0x078d }
        r0 = r9.getBaseContext();	 Catch:{ IOException -> 0x078d }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ IOException -> 0x078d }
        if (r8 == 0) goto L_0x0084;
    L_0x0589:
        if (r11 != 0) goto L_0x0084;
    L_0x058b:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x078f }
        r1 = 18;
        if (r0 < r1) goto L_0x0084;
    L_0x0591:
        com.whatsapp.util.f.b(r9);	 Catch:{ IOException -> 0x0791 }
        if (r8 == 0) goto L_0x0084;
    L_0x0596:
        r0 = -1;
        if (r11 != r0) goto L_0x0084;
    L_0x0599:
        r0 = 1;
        r9.F = r0;	 Catch:{ IOException -> 0x0795 }
        if (r8 == 0) goto L_0x0084;
    L_0x059e:
        r0 = -1;
        if (r11 != r0) goto L_0x0084;
    L_0x05a1:
        r1 = r12.getData();
        r0 = 3;
        r2 = new java.lang.String[r0];
        r0 = 0;
        r3 = cb;
        r4 = 93;
        r3 = r3[r4];
        r2[r0] = r3;
        r0 = 1;
        r3 = cb;
        r4 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r3 = r3[r4];
        r2[r0] = r3;
        r0 = 2;
        r3 = cb;
        r4 = 85;
        r3 = r3[r4];
        r2[r0] = r3;
        r6 = 0;
        r7 = 0;
        r0 = com.whatsapp.App.e;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r0.query(r1, r2, r3, r4, r5);
        r2 = new o;
        r2.<init>(r9);
        r0 = r1.moveToNext();
        if (r0 == 0) goto L_0x099d;
    L_0x05d9:
        r0 = cb;
        r3 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r0 = r0[r3];
        r0 = r1.getColumnIndex(r0);
        r0 = r1.getString(r0);
        r3 = r2.e;	 Catch:{ IOException -> 0x0799 }
        r4 = cb;	 Catch:{ IOException -> 0x0799 }
        r5 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0799 }
        r4 = r1.getColumnIndex(r4);	 Catch:{ IOException -> 0x0799 }
        r4 = r1.getString(r4);	 Catch:{ IOException -> 0x0799 }
        r3.d = r4;	 Catch:{ IOException -> 0x0799 }
        r2.b(r0);	 Catch:{ IOException -> 0x0799 }
        r3 = cb;	 Catch:{ IOException -> 0x0799 }
        r4 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0799 }
        r3 = r1.getColumnIndex(r3);	 Catch:{ IOException -> 0x0799 }
        r3 = r1.getString(r3);	 Catch:{ IOException -> 0x0799 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ IOException -> 0x0799 }
        if (r3 <= 0) goto L_0x0613;
    L_0x0610:
        r2.d(r0);	 Catch:{ IOException -> 0x0799 }
    L_0x0613:
        r2.e(r0);
        r2.h(r0);
        r2.f(r0);
        r2.c(r0);
        r2.g(r0);
        r2.i(r0);
    L_0x0625:
        r1.close();
        r1 = new b;
        r1.<init>();
        r3 = 2;
        r1 = r1.a(r9, r2, r3);	 Catch:{ g -> 0x079b }
    L_0x0632:
        if (r1 != 0) goto L_0x0646;
    L_0x0634:
        r2 = cb;	 Catch:{ IOException -> 0x07a9 }
        r3 = 95;
        r2 = r2[r3];	 Catch:{ IOException -> 0x07a9 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x07a9 }
        r2 = 2131625028; // 0x7f0e0444 float:1.8877252E38 double:1.053162696E-314;
        r3 = 0;
        com.whatsapp.App.b(r9, r2, r3);	 Catch:{ IOException -> 0x07a9 }
        if (r8 == 0) goto L_0x067b;
    L_0x0646:
        r2 = new android.content.Intent;
        r3 = com.whatsapp.ViewSharedContactActivity.class;
        r2.<init>(r9, r3);
        r3 = cb;
        r4 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r3 = r3[r4];
        r4 = 1;
        r2.putExtra(r3, r4);
        r3 = cb;
        r4 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r3 = r3[r4];
        r4 = r9.r;
        r4 = r4.e;
        r2.putExtra(r3, r4);
        r3 = cb;
        r4 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r3 = r3[r4];
        r2.putExtra(r3, r1);
        r1 = cb;
        r3 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r1 = r1[r3];
        r2.putExtra(r1, r0);
        r0 = 8;
        r9.startActivityForResult(r2, r0);
    L_0x067b:
        if (r8 == 0) goto L_0x0084;
    L_0x067d:
        r0 = -1;
        if (r11 != r0) goto L_0x0699;
    L_0x0680:
        if (r12 == 0) goto L_0x0084;
    L_0x0682:
        r0 = r12.getData();	 Catch:{ IOException -> 0x07ab }
        if (r0 == 0) goto L_0x0084;
    L_0x0688:
        r0 = r9.aH;	 Catch:{ IOException -> 0x07ad }
        r0.a();	 Catch:{ IOException -> 0x07ad }
        r0 = r12.getData();	 Catch:{ IOException -> 0x07ad }
        r1 = -1;
        r2 = 0;
        r3 = 0;
        r9.a(r0, r1, r2, r3);	 Catch:{ IOException -> 0x07ad }
        if (r8 == 0) goto L_0x0084;
    L_0x0699:
        if (r12 == 0) goto L_0x0084;
    L_0x069b:
        r0 = cb;	 Catch:{ IOException -> 0x07b1 }
        r1 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x07b1 }
        r1 = 1;
        r0 = r12.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x07b1 }
        if (r0 == 0) goto L_0x0084;
    L_0x06a8:
        r0 = cb;	 Catch:{ IOException -> 0x07b3 }
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r0[r1];	 Catch:{ IOException -> 0x07b3 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x07b3 }
        r0 = 7;
        r9.showDialog(r0);	 Catch:{ IOException -> 0x07b3 }
        if (r8 == 0) goto L_0x0084;
    L_0x06b7:
        r0 = -1;
        if (r11 != r0) goto L_0x0922;
    L_0x06ba:
        if (r12 == 0) goto L_0x0922;
    L_0x06bc:
        r6 = com.whatsapp.wallpaper.p.c(r9);
        r0 = r12.getData();
        if (r0 == 0) goto L_0x085c;
    L_0x06c6:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = cb;
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r12.getData();
        r1 = r1.toString();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.e;
        r1 = r12.getData();
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x07c6;
    L_0x06f8:
        r1.moveToFirst();	 Catch:{ all -> 0x07bb }
        r0 = cb;	 Catch:{ all -> 0x07bb }
        r2 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r0 = r0[r2];	 Catch:{ all -> 0x07bb }
        r0 = r1.getColumnIndex(r0);	 Catch:{ all -> 0x07bb }
        if (r0 < 0) goto L_0x07c6;
    L_0x0707:
        r0 = r1.getString(r0);	 Catch:{ IOException -> 0x07b9 }
        r2 = com.whatsapp.yf.l;	 Catch:{ IOException -> 0x07b9 }
        r0 = r0.equals(r2);	 Catch:{ IOException -> 0x07b9 }
        if (r0 == 0) goto L_0x07c6;
    L_0x0713:
        r0 = new android.graphics.BitmapFactory$Options;	 Catch:{ all -> 0x07bb }
        r0.<init>();	 Catch:{ all -> 0x07bb }
        r2 = 1;
        r0.inJustDecodeBounds = r2;	 Catch:{ all -> 0x07bb }
        r2 = com.whatsapp.App.e;	 Catch:{ FileNotFoundException -> 0x07c2 }
        r3 = r12.getData();	 Catch:{ FileNotFoundException -> 0x07c2 }
        r2 = r2.openInputStream(r3);	 Catch:{ FileNotFoundException -> 0x07c2 }
        r3 = 0;
        android.graphics.BitmapFactory.decodeStream(r2, r3, r0);	 Catch:{ FileNotFoundException -> 0x07c2 }
        r2 = r0.outWidth;	 Catch:{ FileNotFoundException -> 0x07c2 }
        r3 = r6.x;	 Catch:{ FileNotFoundException -> 0x07c2 }
        if (r2 != r3) goto L_0x07c6;
    L_0x072f:
        r0 = r0.outHeight;	 Catch:{ FileNotFoundException -> 0x07c2 }
        r2 = r6.y;	 Catch:{ FileNotFoundException -> 0x07c2 }
        if (r0 != r2) goto L_0x07c6;
    L_0x0735:
        r0 = r12.getData();	 Catch:{ FileNotFoundException -> 0x07c2 }
        r2 = -1;
        r3 = 0;
        r4 = 0;
        r9.a(r0, r2, r3, r4);	 Catch:{ FileNotFoundException -> 0x07c2 }
        if (r1 == 0) goto L_0x0076;
    L_0x0741:
        r1.close();
        goto L_0x0076;
    L_0x0746:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0457 }
    L_0x0748:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0457 }
    L_0x074a:
        r0 = move-exception;
        throw r0;
    L_0x074c:
        r0 = move-exception;
        throw r0;	 Catch:{ g -> 0x074e }
    L_0x074e:
        r0 = move-exception;
        throw r0;
    L_0x0750:
        r0 = move-exception;
        throw r0;
    L_0x0752:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0578 }
    L_0x0754:
        r1 = com.whatsapp.util.f.c(r9);	 Catch:{ IOException -> 0x0578 }
        r2 = r1.exists();	 Catch:{ IOException -> 0x0578 }
        if (r2 == 0) goto L_0x0767;
    L_0x075e:
        r0 = android.net.Uri.fromFile(r1);	 Catch:{ IOException -> 0x0578 }
        com.whatsapp.util.f.a(r9, r0);	 Catch:{ IOException -> 0x0578 }
        goto L_0x0508;
    L_0x0767:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0578 }
        r2.<init>();	 Catch:{ IOException -> 0x0578 }
        r3 = cb;	 Catch:{ IOException -> 0x0578 }
        r4 = 80;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0578 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0578 }
        r1 = r2.append(r1);	 Catch:{ IOException -> 0x0578 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0578 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IOException -> 0x0578 }
        goto L_0x0508;
    L_0x0783:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0785 }
    L_0x0785:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0787 }
    L_0x0787:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0789 }
    L_0x0789:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0578 }
    L_0x078b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0576 }
    L_0x078d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x078f }
    L_0x078f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0791 }
    L_0x0791:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0793 }
    L_0x0793:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0795 }
    L_0x0795:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0797 }
    L_0x0797:
        r0 = move-exception;
        throw r0;
    L_0x0799:
        r0 = move-exception;
        throw r0;
    L_0x079b:
        r1 = move-exception;
        com.whatsapp.util.Log.c(r1);
        r1 = 2131624575; // 0x7f0e027f float:1.8876334E38 double:1.0531624723E-314;
        r2 = 0;
        com.whatsapp.App.b(r9, r1, r2);
        r1 = r7;
        goto L_0x0632;
    L_0x07a9:
        r0 = move-exception;
        throw r0;
    L_0x07ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x07ad }
    L_0x07ad:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x07af }
    L_0x07af:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x07b1 }
    L_0x07b1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x07b3 }
    L_0x07b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x07b5 }
    L_0x07b5:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x07b7 }
    L_0x07b7:
        r0 = move-exception;
        throw r0;
    L_0x07b9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x07bb }
    L_0x07bb:
        r0 = move-exception;
        if (r1 == 0) goto L_0x07c1;
    L_0x07be:
        r1.close();	 Catch:{ IOException -> 0x0983 }
    L_0x07c1:
        throw r0;
    L_0x07c2:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x07bb }
    L_0x07c6:
        if (r1 == 0) goto L_0x07cb;
    L_0x07c8:
        r1.close();	 Catch:{ IOException -> 0x0981 }
    L_0x07cb:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = cb;
        r2 = 94;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r6.x;
        r0 = r0.append(r1);
        r1 = cb;
        r2 = 91;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r6.y;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.wallpaper.CropImage.class;
        r0.<init>(r9, r1);
        r1 = cb;
        r2 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r1 = r1[r2];
        r2 = r6.x;
        r0.putExtra(r1, r2);
        r1 = cb;
        r2 = 72;
        r1 = r1[r2];
        r2 = r6.y;
        r0.putExtra(r1, r2);
        r1 = cb;
        r2 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r1 = r1[r2];
        r2 = 1;
        r0.putExtra(r1, r2);
        r1 = cb;
        r2 = 70;
        r1 = r1[r2];
        r2 = 1;
        r0.putExtra(r1, r2);
        r1 = cb;
        r2 = 67;
        r1 = r1[r2];
        r2 = 1;
        r0.putExtra(r1, r2);
        r1 = r12.getData();
        r0.setData(r1);
        r1 = cb;
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r1 = r1[r2];
        r2 = com.whatsapp.wallpaper.p.a();
        r0.putExtra(r1, r2);
        r1 = cb;
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r1 = r1[r2];
        r2 = android.graphics.Bitmap.CompressFormat.JPEG;
        r2 = r2.toString();
        r0.putExtra(r1, r2);
        r1 = 18;
        r9.startActivityForResult(r0, r1);
        if (r8 == 0) goto L_0x0922;
    L_0x085c:
        r0 = r9.aH;
        r0.a();
        r0 = cb;
        r1 = 96;
        r0 = r0[r1];
        r1 = 0;
        r0 = r12.getIntExtra(r0, r1);
        if (r0 == 0) goto L_0x08b4;
    L_0x086e:
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0985 }
        r1.<init>();	 Catch:{ IOException -> 0x0985 }
        r2 = cb;	 Catch:{ IOException -> 0x0985 }
        r3 = 92;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0985 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0985 }
        r1 = r1.append(r0);	 Catch:{ IOException -> 0x0985 }
        r2 = cb;	 Catch:{ IOException -> 0x0985 }
        r3 = 68;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0985 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0985 }
        r2 = r6.x;	 Catch:{ IOException -> 0x0985 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0985 }
        r2 = ",";
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0985 }
        r2 = r6.y;	 Catch:{ IOException -> 0x0985 }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0985 }
        r2 = "]";
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x0985 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0985 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x0985 }
        r1 = 0;
        r2 = r6.x;	 Catch:{ IOException -> 0x0985 }
        r3 = r6.y;	 Catch:{ IOException -> 0x0985 }
        r9.a(r1, r0, r2, r3);	 Catch:{ IOException -> 0x0985 }
        if (r8 == 0) goto L_0x0922;
    L_0x08b4:
        r0 = cb;	 Catch:{ IOException -> 0x0987 }
        r1 = 73;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0987 }
        r1 = 0;
        r0 = r12.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x0987 }
        if (r0 == 0) goto L_0x08d3;
    L_0x08c1:
        com.whatsapp.wallpaper.p.a(r9);	 Catch:{ IOException -> 0x0989 }
        r0 = 0;
        r9.a(r0);	 Catch:{ IOException -> 0x0989 }
        r0 = cb;	 Catch:{ IOException -> 0x0989 }
        r1 = 76;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0989 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0989 }
        if (r8 == 0) goto L_0x0922;
    L_0x08d3:
        r0 = cb;	 Catch:{ IOException -> 0x098b }
        r1 = 78;
        r0 = r0[r1];	 Catch:{ IOException -> 0x098b }
        r1 = 0;
        r0 = r12.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x098b }
        if (r0 == 0) goto L_0x08f5;
    L_0x08e0:
        com.whatsapp.wallpaper.p.e(r9);	 Catch:{ IOException -> 0x098d }
        r0 = com.whatsapp.wallpaper.p.f(r9);	 Catch:{ IOException -> 0x098d }
        r9.a(r0);	 Catch:{ IOException -> 0x098d }
        r0 = cb;	 Catch:{ IOException -> 0x098d }
        r1 = 83;
        r0 = r0[r1];	 Catch:{ IOException -> 0x098d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x098d }
        if (r8 == 0) goto L_0x0922;
    L_0x08f5:
        r0 = r9.getBaseContext();	 Catch:{ IOException -> 0x098d }
        r1 = 2131624300; // 0x7f0e016c float:1.8875776E38 double:1.0531623365E-314;
        r1 = r9.getString(r1);	 Catch:{ IOException -> 0x098d }
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ IOException -> 0x098d }
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x098d }
        r0.<init>();	 Catch:{ IOException -> 0x098d }
        r1 = cb;	 Catch:{ IOException -> 0x098d }
        r2 = 86;
        r1 = r1[r2];	 Catch:{ IOException -> 0x098d }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x098d }
        r1 = r12.toString();	 Catch:{ IOException -> 0x098d }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x098d }
        r0 = r0.toString();	 Catch:{ IOException -> 0x098d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x098d }
    L_0x0922:
        r9.q();	 Catch:{ IOException -> 0x098f }
        if (r8 == 0) goto L_0x0084;
    L_0x0927:
        r0 = -1;
        if (r11 != r0) goto L_0x0084;
    L_0x092a:
        if (r12 == 0) goto L_0x0951;
    L_0x092c:
        r0 = cb;	 Catch:{ IOException -> 0x0995 }
        r1 = 84;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0995 }
        r1 = 0;
        r0 = r12.getBooleanExtra(r0, r1);	 Catch:{ IOException -> 0x0995 }
        if (r0 == 0) goto L_0x0951;
    L_0x0939:
        r0 = 2131427666; // 0x7f0b0152 float:1.8476955E38 double:1.0530651864E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IOException -> 0x0997 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IOException -> 0x0997 }
        r0 = r9.s;	 Catch:{ IOException -> 0x0997 }
        r1 = 4;
        r0.setVisibility(r1);	 Catch:{ IOException -> 0x0997 }
        r0 = r9.r;	 Catch:{ IOException -> 0x0997 }
        com.whatsapp.zv.a(r0, r9);	 Catch:{ IOException -> 0x0997 }
        if (r8 == 0) goto L_0x0084;
    L_0x0951:
        r0 = r9.r;	 Catch:{ IOException -> 0x0999 }
        r1 = 20;
        com.whatsapp.zv.a(r12, r0, r9, r1, r9);	 Catch:{ IOException -> 0x0999 }
        if (r8 == 0) goto L_0x0084;
    L_0x095a:
        r0 = com.whatsapp.zv.b();	 Catch:{ IOException -> 0x099b }
        r0.delete();	 Catch:{ IOException -> 0x099b }
        r0 = -1;
        if (r11 != r0) goto L_0x0084;
    L_0x0964:
        r0 = r9.r;	 Catch:{ IOException -> 0x097f }
        r0 = com.whatsapp.zv.b(r0, r9);	 Catch:{ IOException -> 0x097f }
        if (r0 == 0) goto L_0x0084;
    L_0x096c:
        r0 = 2131427666; // 0x7f0b0152 float:1.8476955E38 double:1.0530651864E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IOException -> 0x097f }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IOException -> 0x097f }
        r0 = r9.s;	 Catch:{ IOException -> 0x097f }
        r1 = 4;
        r0.setVisibility(r1);	 Catch:{ IOException -> 0x097f }
        goto L_0x0084;
    L_0x097f:
        r0 = move-exception;
        throw r0;
    L_0x0981:
        r0 = move-exception;
        throw r0;
    L_0x0983:
        r0 = move-exception;
        throw r0;
    L_0x0985:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0987 }
    L_0x0987:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0989 }
    L_0x0989:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x098b }
    L_0x098b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x098d }
    L_0x098d:
        r0 = move-exception;
        throw r0;
    L_0x098f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0991 }
    L_0x0991:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0993 }
    L_0x0993:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0995 }
    L_0x0995:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0997 }
    L_0x0997:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0999 }
    L_0x0999:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x099b }
    L_0x099b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x097f }
    L_0x099d:
        r0 = r6;
        goto L_0x0625;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onActivityResult(int, int, android.content.Intent):void");
    }

    static Runnable s(Conversation conversation) {
        return conversation.M;
    }

    public void b(b bVar) {
        this.y.setVisibility(8);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F() {
        /*
        r3_this = this;
        r0 = 1;
        r0 = r3.c(r0);	 Catch:{ RuntimeException -> 0x0008 }
        if (r0 == 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = r3.r;	 Catch:{ RuntimeException -> 0x001a }
        r0 = r0.e;	 Catch:{ RuntimeException -> 0x001a }
        r0 = com.whatsapp.App.c(r0);	 Catch:{ RuntimeException -> 0x001a }
        if (r0 == 0) goto L_0x001c;
    L_0x0014:
        r0 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r3.showDialog(r0);	 Catch:{ RuntimeException -> 0x001a }
        goto L_0x0007;
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r1 = new java.lang.StringBuilder;
        r0 = r3.a2;
        r0 = r0.getText();
        r1.<init>(r0);
        monitor-enter(r1);
        r0 = r1.toString();	 Catch:{ all -> 0x00aa }
        r0 = r0.trim();	 Catch:{ all -> 0x00aa }
        r2 = r0.length();	 Catch:{ RuntimeException -> 0x00a8 }
        if (r2 <= 0) goto L_0x0058;
    L_0x0036:
        r2 = r3.r;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = com.whatsapp.util.a5.a(r0);	 Catch:{ RuntimeException -> 0x00a8 }
        com.whatsapp.App.a(r2, r0);	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r3.a2;	 Catch:{ RuntimeException -> 0x00a8 }
        r2 = "";
        r0.setText(r2);	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r3.a2;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0.getText();	 Catch:{ RuntimeException -> 0x00a8 }
        android.text.method.TextKeyListener.clear(r0);	 Catch:{ RuntimeException -> 0x00a8 }
        r3.j();	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r3.bd;	 Catch:{ RuntimeException -> 0x00a8 }
        r2 = 0;
        r0.setFastScrollEnabled(r2);	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x0058:
        monitor-exit(r1);	 Catch:{ all -> 0x00aa }
        r0 = r3.aW;	 Catch:{ RuntimeException -> 0x00ad }
        r0 = r0.isFullscreenMode();	 Catch:{ RuntimeException -> 0x00ad }
        if (r0 != 0) goto L_0x008b;
    L_0x0061:
        r0 = r3.a2;	 Catch:{ RuntimeException -> 0x00af }
        r0 = r0.getHeight();	 Catch:{ RuntimeException -> 0x00af }
        r1 = r3.bd;	 Catch:{ RuntimeException -> 0x00af }
        r1 = r1.getHeight();	 Catch:{ RuntimeException -> 0x00af }
        r0 = r0 + r1;
        r0 = r0 * 4;
        r1 = r3.getWindow();	 Catch:{ RuntimeException -> 0x00af }
        r1 = r1.getDecorView();	 Catch:{ RuntimeException -> 0x00af }
        r1 = r1.getHeight();	 Catch:{ RuntimeException -> 0x00af }
        if (r0 >= r1) goto L_0x0007;
    L_0x007e:
        r0 = r3.getResources();	 Catch:{ RuntimeException -> 0x00b1 }
        r0 = r0.getConfiguration();	 Catch:{ RuntimeException -> 0x00b1 }
        r0 = r0.orientation;	 Catch:{ RuntimeException -> 0x00b1 }
        r1 = 2;
        if (r0 != r1) goto L_0x0007;
    L_0x008b:
        r0 = r3.aW;	 Catch:{ RuntimeException -> 0x00a6 }
        r1 = r3.a2;	 Catch:{ RuntimeException -> 0x00a6 }
        r1 = r1.getWindowToken();	 Catch:{ RuntimeException -> 0x00a6 }
        r2 = 0;
        r0.hideSoftInputFromWindow(r1, r2);	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = r3.aX;	 Catch:{ RuntimeException -> 0x00a6 }
        r0 = r0.isShowing();	 Catch:{ RuntimeException -> 0x00a6 }
        if (r0 == 0) goto L_0x0007;
    L_0x009f:
        r0 = r3.aX;	 Catch:{ RuntimeException -> 0x00a6 }
        r0.dismiss();	 Catch:{ RuntimeException -> 0x00a6 }
        goto L_0x0007;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00aa }
    L_0x00aa:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00aa }
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a6 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.F():void");
    }

    static String b(Conversation conversation, String str) {
        conversation.J = str;
        return str;
    }

    static am1 L(Conversation conversation) {
        return conversation.W;
    }

    static ConversationTextEntry A(Conversation conversation) {
        return conversation.a2;
    }

    static void a(Conversation conversation, b bVar) {
        conversation.f(bVar);
    }

    static boolean c(Conversation conversation, boolean z) {
        conversation.j = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(java.lang.String r3) {
        /*
        r2_this = this;
        r0 = de.greenrobot.event.g.b();
        r1 = com.whatsapp.bz.class;
        r0 = r0.b(r1);
        r0 = (com.whatsapp.bz) r0;
        r0 = r0.a();	 Catch:{ RuntimeException -> 0x0025 }
        if (r0 == 0) goto L_0x0024;
    L_0x0012:
        r0 = 1;
        r2.aO = r0;	 Catch:{ RuntimeException -> 0x0027 }
        if (r3 == 0) goto L_0x0021;
    L_0x0017:
        if (r3 == 0) goto L_0x0024;
    L_0x0019:
        r0 = r2.u;	 Catch:{ RuntimeException -> 0x002b }
        r0 = r3.equals(r0);	 Catch:{ RuntimeException -> 0x002b }
        if (r0 != 0) goto L_0x0024;
    L_0x0021:
        r0 = 0;
        r2.I = r0;	 Catch:{ RuntimeException -> 0x002b }
    L_0x0024:
        return;
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.j(java.lang.String):void");
    }

    static boolean h(Conversation conversation, boolean z) {
        conversation.A = z;
        return z;
    }

    static boolean E(Conversation conversation) {
        return conversation.az;
    }

    private void a(Drawable drawable) {
        try {
            if (drawable != null) {
                this.aH.setDrawable(drawable);
                this.ad.setBackgroundResource(0);
                this.bb.setVisibility(0);
                this.N.setBackgroundColor(-1057688332);
                if (App.az == 0) {
                    return;
                }
            }
            this.aH.a();
            this.ad.setBackgroundResource(R.color.conversation_background);
            this.bb.setVisibility(0);
            this.N.setBackgroundColor(-1);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static int d(Conversation conversation) {
        return conversation.i;
    }

    static void T(Conversation conversation) {
        conversation.o();
    }

    static ActionMode a(Conversation conversation, ActionMode actionMode) {
        conversation.a3 = actionMode;
        return actionMode;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.net.Uri r8) {
        /*
        r7_this = this;
        r6 = 1;
        r5 = 0;
        r1 = com.whatsapp.App.az;
        if (r8 == 0) goto L_0x0060;
    L_0x0006:
        r2 = new android.content.Intent;
        r0 = com.whatsapp.gallerypicker.ImagePreview.class;
        r2.<init>(r7, r0);
        r0 = r7.r;
        r0 = r0.w();
        if (r0 == 0) goto L_0x0028;
    L_0x0015:
        r0 = 2131624364; // 0x7f0e01ac float:1.8875906E38 double:1.053162368E-314;
        r3 = new java.lang.Object[r6];
        r4 = r7.r;
        r4 = r4.a(r7);
        r3[r5] = r4;
        r0 = r7.getString(r0, r3);
        if (r1 == 0) goto L_0x0039;
    L_0x0028:
        r0 = 2131624827; // 0x7f0e037b float:1.8876845E38 double:1.053162597E-314;
        r3 = new java.lang.Object[r6];
        r4 = r7.r;
        r4 = r4.a(r7);
        r3[r5] = r4;
        r0 = r7.getString(r0, r3);
    L_0x0039:
        r3 = cb;
        r4 = 5;
        r3 = r3[r4];
        r2.putExtra(r3, r0);
        r0 = cb;
        r3 = 2;
        r0 = r0[r3];
        r2.putExtra(r0, r5);
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0.add(r8);	 Catch:{ RuntimeException -> 0x0074 }
        r3 = cb;	 Catch:{ RuntimeException -> 0x0074 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x0074 }
        r2.putExtra(r3, r0);	 Catch:{ RuntimeException -> 0x0074 }
        r0 = 22;
        r7.startActivityForResult(r2, r0);	 Catch:{ RuntimeException -> 0x0074 }
        if (r1 == 0) goto L_0x0073;
    L_0x0060:
        r0 = cb;	 Catch:{ RuntimeException -> 0x0074 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0074 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x0074 }
        r0 = r7.getBaseContext();	 Catch:{ RuntimeException -> 0x0074 }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r2 = 0;
        com.whatsapp.App.b(r0, r1, r2);	 Catch:{ RuntimeException -> 0x0074 }
    L_0x0073:
        return;
    L_0x0074:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.a(android.net.Uri):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r5, boolean r6) {
        /*
        r4_this = this;
        r0 = com.whatsapp.App.az;
        r1 = new android.content.Intent;
        r2 = cb;
        r3 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        r2 = r2[r3];
        r3 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r1.<init>(r2, r3);
        r2 = cb;	 Catch:{ RuntimeException -> 0x004b }
        r3 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x004b }
        r1.putExtra(r2, r5);	 Catch:{ RuntimeException -> 0x004b }
        r2 = r4.getPackageManager();	 Catch:{ RuntimeException -> 0x004b }
        r2 = r1.resolveActivity(r2);	 Catch:{ RuntimeException -> 0x004b }
        r1.setComponent(r2);	 Catch:{ RuntimeException -> 0x004b }
        r2 = r1.getComponent();	 Catch:{ RuntimeException -> 0x004b }
        if (r2 == 0) goto L_0x003e;
    L_0x0029:
        if (r6 == 0) goto L_0x0032;
    L_0x002b:
        r2 = 11;
        r4.startActivityForResult(r1, r2);	 Catch:{ RuntimeException -> 0x004f }
        if (r0 == 0) goto L_0x0039;
    L_0x0032:
        r4.v = r5;	 Catch:{ RuntimeException -> 0x004f }
        r2 = 10;
        r4.startActivityForResult(r1, r2);	 Catch:{ RuntimeException -> 0x004f }
    L_0x0039:
        r1 = 0;
        T = r1;	 Catch:{ RuntimeException -> 0x0051 }
        if (r0 == 0) goto L_0x004a;
    L_0x003e:
        r0 = cb;	 Catch:{ RuntimeException -> 0x0051 }
        r1 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0051 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ RuntimeException -> 0x0051 }
        com.whatsapp.App.q();	 Catch:{ RuntimeException -> 0x0051 }
    L_0x004a:
        return;
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.a(java.lang.String, boolean):void");
    }

    public void a(b bVar) {
        cb.j();
    }

    public void onBackPressed() {
        try {
            T = true;
            if (isTaskRoot()) {
                startActivity(new Intent(this, Main.b()));
            }
            super.onBackPressed();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static Animation e(boolean z) {
        Animation animationSet = new AnimationSet(true);
        if (z) {
            try {
                Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        try {
            alphaAnimation.setDuration(100);
            animationSet.addAnimation(alphaAnimation);
            if (z) {
                float f;
                if (App.as()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                alphaAnimation = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, f, 1, 0.5f);
            } else {
                try {
                    alphaAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, App.as() ? 1.0f : 0.0f, 1, 0.5f);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
            alphaAnimation.setDuration(100);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setDuration(100);
            return animationSet;
        } catch (RuntimeException e22) {
            throw e22;
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    private void f(b bVar) {
        int i = App.az;
        try {
            if (f.a(bVar.a, 2) >= 0) {
                App.b(getBaseContext(), (int) R.string.file_uploaded, 0);
                return;
            }
            MediaData mediaData = (MediaData) bVar.A;
            try {
                if (mediaData != null) {
                    try {
                        if (mediaData.uploader != null) {
                            mediaData.uploader.a();
                            if (i == 0) {
                                return;
                            }
                        }
                        Log.e(cb[160] + bVar.j + cb[156] + bVar.a + cb[161] + mediaData.transferring + cb[155] + mediaData.transferred + cb[159] + bVar.e);
                        if (i == 0) {
                            return;
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                }
                Log.e(cb[157] + bVar.j + cb[158] + bVar.a + cb[162] + bVar.e);
            } catch (RuntimeException e22) {
                throw e22;
            }
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    static View ag(Conversation conversation) {
        return conversation.N;
    }

    private void g() {
        this.aW.hideSoftInputFromWindow(this.a2.getWindowToken(), 0);
    }

    static ActionMode u(Conversation conversation) {
        return conversation.aJ;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
        r8_this = this;
        r7 = 16;
        r2 = 0;
        r3 = 0;
        r5 = com.whatsapp.App.az;
        r0 = r8.getLayoutInflater();
        r1 = 2130903100; // 0x7f03003c float:1.7413008E38 double:1.0528060163E-314;
        r0 = com.whatsapp.b7.a(r0, r1, r3, r2);
        r0 = (android.view.ViewGroup) r0;
        r1 = r8.P;
        if (r1 == 0) goto L_0x0147;
    L_0x0017:
        r1 = r8.P;
        r1 = r1.getText();
        r2 = r1;
    L_0x001e:
        r1 = r8.w;
        if (r1 == 0) goto L_0x0144;
    L_0x0022:
        r1 = r8.w;
        r1 = r1.getText();
        r4 = r1;
    L_0x0029:
        r1 = r8.s;
        if (r1 == 0) goto L_0x0033;
    L_0x002d:
        r1 = r8.s;
        r3 = r1.getDrawable();
    L_0x0033:
        r1 = 2131427667; // 0x7f0b0153 float:1.8476957E38 double:1.053065187E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.view.ViewGroup) r1;
        r8.m = r1;
        r1 = r8.m;
        r6 = 2131427596; // 0x7f0b010c float:1.8476813E38 double:1.053065152E-314;
        r1 = r1.findViewById(r6);
        r1 = (android.widget.TextView) r1;
        r8.P = r1;
        r1 = r8.m;
        r6 = 2131427597; // 0x7f0b010d float:1.8476815E38 double:1.0530651523E-314;
        r1 = r1.findViewById(r6);
        r1 = (android.widget.TextView) r1;
        r8.w = r1;
        r1 = 2131427665; // 0x7f0b0151 float:1.8476953E38 double:1.053065186E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r8.s = r1;
        r1 = com.whatsapp.App.as();
        if (r1 != 0) goto L_0x0088;
    L_0x0069:
        r1 = 2131427333; // 0x7f0b0005 float:1.847628E38 double:1.053065022E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r6 = 2130837539; // 0x7f020023 float:1.7280035E38 double:1.052773625E-314;
        r1.setImageResource(r6);	 Catch:{ RuntimeException -> 0x0129 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0129 }
        r6 = 11;
        if (r1 < r6) goto L_0x0088;
    L_0x007e:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x012b }
        if (r1 >= r7) goto L_0x0088;
    L_0x0082:
        r1 = r8.m;	 Catch:{ RuntimeException -> 0x012b }
        r6 = 0;
        r1.setLayoutTransition(r6);	 Catch:{ RuntimeException -> 0x012b }
    L_0x0088:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x012d }
        r6 = 17;
        if (r1 < r6) goto L_0x0099;
    L_0x008e:
        r1 = r8.w;	 Catch:{ RuntimeException -> 0x012d }
        r1 = r1.getLayoutParams();	 Catch:{ RuntimeException -> 0x012d }
        r1 = (android.widget.LinearLayout.LayoutParams) r1;	 Catch:{ RuntimeException -> 0x012d }
        r6 = 0;
        r1.bottomMargin = r6;	 Catch:{ RuntimeException -> 0x012d }
    L_0x0099:
        r1 = r8.m;	 Catch:{ RuntimeException -> 0x012f }
        r6 = 1;
        r1.setClickable(r6);	 Catch:{ RuntimeException -> 0x012f }
        r1 = r8.aQ;	 Catch:{ RuntimeException -> 0x012f }
        if (r1 != 0) goto L_0x00a7;
    L_0x00a3:
        r1 = r8.an;	 Catch:{ RuntimeException -> 0x0131 }
        if (r1 == 0) goto L_0x00c6;
    L_0x00a7:
        r6 = r8.w;	 Catch:{ RuntimeException -> 0x0133 }
        r1 = r8.aQ;	 Catch:{ RuntimeException -> 0x0133 }
        if (r1 == 0) goto L_0x0135;
    L_0x00ad:
        r1 = 2131625006; // 0x7f0e042e float:1.8877208E38 double:1.0531626853E-314;
    L_0x00b0:
        r1 = r8.getString(r1);	 Catch:{ RuntimeException -> 0x013a }
        r6.setText(r1);	 Catch:{ RuntimeException -> 0x013a }
        r1 = r8.w;	 Catch:{ RuntimeException -> 0x013a }
        r6 = 0;
        r1.setHorizontalFadingEdgeEnabled(r6);	 Catch:{ RuntimeException -> 0x013a }
        r1 = r8.w;	 Catch:{ RuntimeException -> 0x013a }
        r6 = android.text.TextUtils.TruncateAt.END;	 Catch:{ RuntimeException -> 0x013a }
        r1.setEllipsize(r6);	 Catch:{ RuntimeException -> 0x013a }
        if (r5 == 0) goto L_0x00d9;
    L_0x00c6:
        r1 = r8.w;	 Catch:{ RuntimeException -> 0x013a }
        r6 = 1;
        r1.setHorizontalFadingEdgeEnabled(r6);	 Catch:{ RuntimeException -> 0x013a }
        r1 = r8.w;	 Catch:{ RuntimeException -> 0x013a }
        r6 = android.text.TextUtils.TruncateAt.MARQUEE;	 Catch:{ RuntimeException -> 0x013a }
        r1.setEllipsize(r6);	 Catch:{ RuntimeException -> 0x013a }
        r1 = r8.w;	 Catch:{ RuntimeException -> 0x013a }
        r6 = 1;
        r1.setMarqueeRepeatLimit(r6);	 Catch:{ RuntimeException -> 0x013a }
    L_0x00d9:
        if (r2 == 0) goto L_0x00e0;
    L_0x00db:
        r1 = r8.P;	 Catch:{ RuntimeException -> 0x013c }
        r1.setText(r2);	 Catch:{ RuntimeException -> 0x013c }
    L_0x00e0:
        if (r3 == 0) goto L_0x00e7;
    L_0x00e2:
        r1 = r8.s;	 Catch:{ RuntimeException -> 0x013e }
        r1.setImageDrawable(r3);	 Catch:{ RuntimeException -> 0x013e }
    L_0x00e7:
        r1 = android.text.TextUtils.isEmpty(r4);	 Catch:{ RuntimeException -> 0x0140 }
        if (r1 != 0) goto L_0x00fa;
    L_0x00ed:
        r1 = r8.w;	 Catch:{ RuntimeException -> 0x0142 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ RuntimeException -> 0x0142 }
        r1 = r8.w;	 Catch:{ RuntimeException -> 0x0142 }
        r1.setText(r4);	 Catch:{ RuntimeException -> 0x0142 }
        if (r5 == 0) goto L_0x0101;
    L_0x00fa:
        r1 = r8.w;	 Catch:{ RuntimeException -> 0x0142 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ RuntimeException -> 0x0142 }
    L_0x0101:
        r1 = 2131427663; // 0x7f0b014f float:1.8476949E38 double:1.053065185E-314;
        r1 = r0.findViewById(r1);
        r2 = new com.whatsapp.alb;
        r2.<init>(r8);
        r1.setOnClickListener(r2);
        r1 = r8.m;
        r2 = new com.whatsapp.a5f;
        r2.<init>(r8);
        r1.setOnClickListener(r2);
        r1 = r8.getSupportActionBar();
        r1.setDisplayOptions(r7);
        r1 = r8.getSupportActionBar();
        r1.setCustomView(r0);
        return;
    L_0x0129:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        throw r0;
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0131 }
    L_0x0131:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        throw r0;
    L_0x0135:
        r1 = 2131625007; // 0x7f0e042f float:1.887721E38 double:1.053162686E-314;
        goto L_0x00b0;
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r0 = move-exception;
        throw r0;
    L_0x013e:
        r0 = move-exception;
        throw r0;
    L_0x0140:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0142 }
    L_0x0142:
        r0 = move-exception;
        throw r0;
    L_0x0144:
        r4 = r3;
        goto L_0x0029;
    L_0x0147:
        r2 = r3;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.e():void");
    }

    private ArrayList f() {
        Object arrayList = new ArrayList(this.a_.values());
        Collections.sort(arrayList, new sq(this));
        return arrayList;
    }

    static void h(Conversation conversation) {
        conversation.i();
    }

    public void c(b bVar) {
    }

    private void i(b bVar) {
        Handler handler = new Handler();
        handler.post(new vs(this, bVar, handler));
    }

    static void b(Conversation conversation) {
        conversation.j();
    }

    static String d(Conversation conversation, String str) {
        conversation.av = str;
        return str;
    }

    static boolean m(Conversation conversation, boolean z) {
        conversation.aK = z;
        return z;
    }

    static ActionMode z(Conversation conversation) {
        return conversation.a3;
    }

    static void j(Conversation conversation) {
        conversation.l();
    }

    static View M(Conversation conversation) {
        return conversation.D;
    }

    static void C(Conversation conversation) {
        conversation.k();
    }

    public Dialog onCreateDialog(int i) {
        try {
            if (s()) {
                this.ba.a(i);
                return null;
            }
            switch (i) {
                case PBE.MD5 /*0*/:
                    return new Builder(this).setMessage(R.string.delete_all_messages_ask).setPositiveButton(R.string.ok, new eb(this)).setNeutralButton(R.string.cancel, null).create();
                case ay.f /*1*/:
                    return new Builder(this).setMessage(R.string.block_ask).setPositiveButton(R.string.ok, new ff(this)).setNeutralButton(R.string.cancel, null).create();
                case ay.n /*2*/:
                    return new Builder(this).setTitle(R.string.gps_required_title).setMessage(R.string.gps_required_body).setPositiveButton(R.string.ok, new g6(this)).create();
                case a8.s /*7*/:
                    Log.w(cb[201]);
                    return new Builder(this).setMessage(R.string.error_out_of_memory).setNeutralButton(R.string.ok, new a8z(this)).create();
                case a8.n /*8*/:
                    Log.e(cb[214]);
                    return new Builder(this).setMessage(R.string.error_file_is_not_a_image).setNeutralButton(R.string.ok, new s5(this)).create();
                case a6.D /*9*/:
                    Log.i(cb[202]);
                    return new Builder(this).setMessage(R.string.call_charges).setPositiveButton(R.string.call, new t4(this)).setNegativeButton(R.string.cancel, new y1(this)).create();
                case a6.h /*10*/:
                    return new Builder(this).setMessage(R.string.email_conversation_ask_about_media).setPositiveButton(R.string.attach_media, new rh(this)).setNeutralButton(R.string.without_media, new du(this)).create();
                case a6.e /*11*/:
                    Log.i(cb[205]);
                    return new Builder(this).setMessage(R.string.add_contact_as_new_or_existing).setPositiveButton(R.string.new_contact, new m9(this)).setNegativeButton(R.string.existing_contact, new avj(this)).create();
                case a6.s /*12*/:
                    Log.w(cb[198]);
                    return new Builder(this).setMessage(R.string.activity_not_found).setNeutralButton(R.string.ok, new hk(this)).create();
                case a6.z /*13*/:
                    try {
                        if (this.a_ != null) {
                            if (!this.a_.isEmpty()) {
                                Log.i(cb[203] + this.a_.size());
                                return uw.a(this, this.a_.values(), this.r.e, 13, new s0(this, this.a_));
                            }
                        }
                        Log.e(cb[199]);
                        return super.onCreateDialog(i);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    try {
                        try {
                            return new Builder(this).setTitle(App.aT() ? R.string.record_need_sd_card_title : R.string.record_need_sd_card_title_shared_storage).setMessage(App.aT() ? R.string.record_need_sd_card_message : R.string.record_need_sd_card_message_shared_storage).setNeutralButton(R.string.ok, new a3d(this)).create();
                        } catch (RuntimeException e22) {
                            throw e22;
                        }
                    } catch (RuntimeException e222) {
                        throw e222;
                    }
                case 101:
                    Log.w(cb[215]);
                    return new Builder(this).setTitle(R.string.download_failed).setMessage(R.string.unable_to_finish_download).setNeutralButton(R.string.ok, new n8(this)).create();
                case 102:
                    try {
                        Log.w(cb[213]);
                        return new Builder(this).setTitle(R.string.download_failed).setMessage(App.aT() ? R.string.insufficient_space_for_download : R.string.insufficient_space_for_download_shared_storage).setNeutralButton(R.string.ok, new l4(this)).create();
                    } catch (RuntimeException e2222) {
                        throw e2222;
                    }
                case 103:
                    try {
                        Log.w(cb[204]);
                        return new Builder(this).setTitle(R.string.download_failed).setMessage(App.aT() ? R.string.conversation_cannot_download_media_no_media_card : R.string.conversation_cannot_download_media_no_media_card_shared_storage).setNeutralButton(R.string.ok, new a_6(this)).create();
                    } catch (RuntimeException e22222) {
                        throw e22222;
                    }
                case 104:
                    try {
                        Log.w(cb[211]);
                        return new Builder(this).setTitle(R.string.download_failed).setMessage(App.aT() ? R.string.conversation_cannot_download_media_read_only_media_card : R.string.conversation_cannot_download_media_read_only_media_card_shared_storage).setNeutralButton(R.string.ok, new k9(this)).create();
                    } catch (RuntimeException e222222) {
                        throw e222222;
                    }
                case 106:
                    return new Builder(this).setMessage(getString(R.string.cannot_send_to_blocked_contact_1, new Object[]{this.r.a((Context) this)})).setPositiveButton(R.string.unblock, new a_o(this)).setNegativeButton(R.string.cancel, new atg(this)).create();
                case 107:
                    Dialog progressDialog = new ProgressDialog(this);
                    progressDialog.setMessage(getString(R.string.register_wait_message));
                    progressDialog.setIndeterminate(true);
                    progressDialog.setCancelable(false);
                    return progressDialog;
                case 111:
                    Log.w(cb[207]);
                    return new Builder(this).setTitle(R.string.download_failed).setMessage(getString(R.string.too_old_for_download, new Object[]{this.r.a((Context) this)})).setNeutralButton(R.string.ok, new o1(this)).create();
                case 112:
                    Log.w(cb[208]);
                    return new Builder(this).setTitle(R.string.download_failed).setMessage(R.string.invalid_url_for_download).setNeutralButton(R.string.ok, new mk(this)).create();
                case 115:
                    Log.i(cb[212]);
                    return ac.a((Activity) this);
                case 116:
                    return a_3.a((Activity) this, this.aA);
                case 117:
                    Log.w(cb[210]);
                    return a_3.b(this);
                case 118:
                    Log.w(cb[206]);
                    return a_3.f(this);
                case 119:
                    Log.w(cb[209]);
                    return a_3.a((Activity) this, false);
                case 120:
                    Log.w(cb[216]);
                    return a_3.d(this);
                case 121:
                    Log.w(cb[200]);
                    return a_3.c(this);
                default:
                    return super.onCreateDialog(i);
            }
        } catch (RuntimeException e2222222) {
            throw e2222222;
        }
    }

    public SubMenu b(Menu menu, int i, int i2, int i3) {
        SubMenu addSubMenu = menu.addSubMenu(0, i, 0, i2);
        addSubMenu.clearHeader();
        addSubMenu.getItem().setIcon(i3);
        return addSubMenu;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(java.lang.String r8) {
        /*
        r7_this = this;
        r0 = 0;
        r4 = com.whatsapp.App.az;
        r1 = r7.aQ;
        if (r1 == 0) goto L_0x0083;
    L_0x0007:
        r1 = r7.bd;
        r2 = r1.getFirstVisiblePosition();
        r1 = r7.bd;
        r1 = r1.getLastVisiblePosition();
        if (r2 <= 0) goto L_0x0017;
    L_0x0015:
        r2 = r2 + -1;
    L_0x0017:
        r3 = r1 + 1;
        r5 = r7.bd;	 Catch:{ RuntimeException -> 0x0084 }
        r5 = r5.getCount();	 Catch:{ RuntimeException -> 0x0084 }
        if (r3 >= r5) goto L_0x00a0;
    L_0x0021:
        r1 = r1 + 1;
        r3 = r1;
    L_0x0024:
        if (r8 != 0) goto L_0x0086;
    L_0x0026:
        r0 = 1;
        r1 = r0;
    L_0x0028:
        r0 = r7.isFinishing();	 Catch:{ RuntimeException -> 0x0088 }
        if (r0 != 0) goto L_0x0083;
    L_0x002e:
        r0 = r();	 Catch:{ RuntimeException -> 0x0088 }
        if (r0 == 0) goto L_0x0083;
    L_0x0034:
        if (r2 > r3) goto L_0x0076;
    L_0x0036:
        r0 = r7.aS;
        r0 = r0.getItem(r2);
        r0 = (com.whatsapp.protocol.b) r0;
        if (r0 == 0) goto L_0x0072;
    L_0x0040:
        r5 = r0.e;	 Catch:{ RuntimeException -> 0x008a }
        r5 = r5.b;	 Catch:{ RuntimeException -> 0x008a }
        if (r5 != 0) goto L_0x0054;
    L_0x0046:
        if (r1 != 0) goto L_0x006d;
    L_0x0048:
        r5 = r0.F;	 Catch:{ RuntimeException -> 0x008e }
        if (r5 == 0) goto L_0x0054;
    L_0x004c:
        r5 = r0.F;	 Catch:{ RuntimeException -> 0x0090 }
        r5 = r5.equals(r8);	 Catch:{ RuntimeException -> 0x0090 }
        if (r5 != 0) goto L_0x006d;
    L_0x0054:
        r5 = r0.e;	 Catch:{ RuntimeException -> 0x0092 }
        r5 = r5.b;	 Catch:{ RuntimeException -> 0x0092 }
        if (r5 == 0) goto L_0x0072;
    L_0x005a:
        r5 = r0.a;	 Catch:{ RuntimeException -> 0x0094 }
        r6 = 6;
        if (r5 != r6) goto L_0x0072;
    L_0x005f:
        if (r1 != 0) goto L_0x006d;
    L_0x0061:
        r5 = r0.F;	 Catch:{ RuntimeException -> 0x0098 }
        if (r5 == 0) goto L_0x0072;
    L_0x0065:
        r5 = r0.F;	 Catch:{ RuntimeException -> 0x009a }
        r5 = r5.equals(r8);	 Catch:{ RuntimeException -> 0x009a }
        if (r5 == 0) goto L_0x0072;
    L_0x006d:
        r5 = r7.l;	 Catch:{ RuntimeException -> 0x009a }
        r5.add(r0);	 Catch:{ RuntimeException -> 0x009a }
    L_0x0072:
        r0 = r2 + 1;
        if (r4 == 0) goto L_0x009e;
    L_0x0076:
        r0 = r7.aS;	 Catch:{ RuntimeException -> 0x009c }
        r0.notifyDataSetChanged();	 Catch:{ RuntimeException -> 0x009c }
        r0 = 0;
        r7.ap = r0;	 Catch:{ RuntimeException -> 0x009c }
        if (r8 != 0) goto L_0x0083;
    L_0x0080:
        r0 = 0;
        r7.x = r0;	 Catch:{ RuntimeException -> 0x009c }
    L_0x0083:
        return;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r1 = r0;
        goto L_0x0028;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r2 = r0;
        goto L_0x0034;
    L_0x00a0:
        r3 = r1;
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.g(java.lang.String):void");
    }

    static {
        String[] strArr = new String[262];
        String str = "\u0003Y\u001d\u0016";
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
                        i3 = 119;
                        break;
                    case ay.f /*1*/:
                        i3 = 60;
                        break;
                    case ay.n /*2*/:
                        i3 = 113;
                        break;
                    case ay.p /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 75;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u001a]\ts\"\u0003Y\u001c_";
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0012D\u0005^*Yo%~\u000e6q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_.\u0003I\u0001\\9\u0012J\u0018I<XO\u0019M9\u0012\u0011\u0017M\"\u001bY\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0005Y\u0012E;\u001eY\u001fX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^^.\u0004I\u001cI";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M;XO\u0005M?\u0012Y\u0003^$\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^^.\u0004I\u001cIk";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "WO\u0005M?\u0002OK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C%\u0014]\u001fO.\u001bQ\u0014H\"\u0016X\u001e[%\u001bS\u0010Hk\u001aY\u0002_*\u0010YQE8WR\u0004@'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "WH\u0003M%\u0004Z\u0014^9\u001eR\u0016\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C%\u0014]\u001fO.\u001bQ\u0014H\"\u0016X\u001e[%\u001bS\u0010Hk\u001aY\u0015E*(X\u0010X*WU\u0002\f%\u0002P\u001d\f&\u0012X\u0018M\u0014\u0000].X2\u0007YK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C%\u0014]\u001fO.\u001bQ\u0014H\"\u0016X\u001e[%\u001bS\u0010Hk\u0013S\u0006B'\u0018]\u0015I9WU\u0002\f%\u0002P\u001d\f&\u0012X\u0018M\u0014\u0000].X2\u0007YK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "WO\u0005M?\u0002OK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "WW\u0014Uq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "WH\u0003M%\u0004Z\u0014^9\u0012XK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "WW\u0014Uq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u001f]\u0002s8\u001f]\u0003I";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "7O_[#\u0016H\u0002M;\u0007\u0012\u001fI?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "WI\u0003Eq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C%\u0014N\u0014M?\u0012_\u001eB=XS\u001eAf\u0012N\u0003C9W";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0014]\u0001X\"\u0018R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0012D\u0005^*Yo%~\u000e6q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0014S\u001c\u0002*\u001a]\u000bC%YX\u0014Z\"\u0014Y_D$\u001aY_I3\u0003N\u0010\u0002\u00032n>s\u001c>x6i\u001f(x0x\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0004Q\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "9SQ_;\u0016_\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001dU\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0001_\u0010^/(R\u0010A.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_?\u0016N\u0005\u0003<\u0016c\u0005U;\u0012\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0001_\u0010^/(O\u0005^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0004W\u0018\\\u0014\u0007N\u0014Z\"\u0012K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0001_\u0010^/(O\u0005^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C%\u0014N\u0014M?\u0012_\u001eB=XU\u001eI9\u0005S\u0003\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0005Y\u0012E;\u001eY\u001fX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0001_\u0010^/(R\u0010A.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0014S\u001fJ\"\u0005Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_?\u0016N\u0005\u00039\u0012O\u0014Xd\u001dU\u0015\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0004Q\u0002\u0001!\u001eX^^*\u0000\u0011\u001fY&\u0015Y\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u001a]\ts\"\u0003Y\u001c_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0012D\u0005^*Yo%~\u000e6q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0004Q\u0002X$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0004W\u0018\\\u0014\u0007N\u0014Z\"\u0012K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_&\u0004\u0013\u001fCk\u001dU\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_&\u0004\u0011\u001bE/M";
                    z = true;
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    strArr2 = strArr3;
                    str = "\u0000].X2\u0007Y";
                    z = true;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0004T\u0010^.(Q\u0002K";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u001f]\u0002s8\u001f]\u0003I";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_?\u0016N\u0005\f%\u0018\u001c\u001bE/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O9\u0012]\u0005I(\u0018R\u0007I9\u0004]\u0005E$\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_?\u0016N\u0005\f%\u0018\u001c\u0018O$\u0019H\u0010O?WZ\u001e^k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^I&\u0018V\u0018\\$\u0007I\u0001D.\u001e[\u0019Xk";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M/\u0013N\u0014O.\u001eJ\u0014Hd\u0004W\u0018\\yX";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M/\u0013N\u0014O.\u001eJ\u0014Hd\u0004H\u0010@.\u0013]\u0005Mk";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M/\u0013N\u0014O.\u001eJ\u0014Hd\u0004W\u0018\\d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_.\u001bY\u0012X\"\u0018R\u0003I:\u0002Y\u0002X.\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "W_\u0004^8\u0018N2C>\u0019HK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "WQ>^\"\u0010U\u001fM'\"R\u0002I.\u0019\u007f\u001eY%\u0003\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M/\u001dI\u0002X>\u0019O\u0014I%\u0014S\u0004B?XI\u001fI3\u0007Y\u0012X.\u0013\u0013QY%\u0004Y\u0014B\b\u0018I\u001fXq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "WO\u0019E-\u0003\u007f\u001eY%\u0003\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0004L\u0010X(\u001f\u0011\u0005C>\u0014T\\I=\u0012R\u0005\f";
                    z = true;
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    strArr2 = strArr3;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0004L\u0010X(\u001f\u0011\u0005C>\u0014T\\I=\u0012R\u0005\f";
                    z = true;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0011S\u0003[*\u0005X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^J$\u0005K\u0010^/\u0004Y\u001dI(\u0003Y\u0015I8\u0004]\u0016I8XR\u001eX#\u001eR\u0016_.\u001bY\u0012X.\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^J$\u0005K\u0010^/XZ\u0010E'XI\u001fJ\"\u0019O\u0019I/ZI\u0001@$\u0016X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^J$\u0005K\u0010^/XZ\u0010E'X_\u0010@'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u001eS\\I9\u0005S\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0014N\u001e\\\t\u000es\u0004X;\u0002H\"E1\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "Wg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R\u0002\u00039\u0012O\u0004@?XO\u001aE;X_\u001eB?\u0016_\u0005\f%\u0018HQM/\u0013Y\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u0004_\u0010@.\"L8J\u0005\u0012Y\u0015I/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u0019S\\_;\u0016_\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u0018I\u0005\\>\u0003e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 73;
                    str = "\u001eO.^.\u0004Y\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 74;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M>\u0013U\u001e\u00038\u001f]\u0003Id\u0011]\u0018@.\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    str = "\u0011U\u001dI\u0014\u0007]\u0005D";
                    z = true;
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 76;
                    strArr2 = strArr3;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^[*\u001bP\u0001M;\u0012N^^.\u0004Y\u0005";
                    z = true;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u0003U\u001cI\u0014\u0003S";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 78;
                    str = "\u001eO.H.\u0011]\u0004@?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0018S\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^Z\"\u0013Y\u001e\u00038\u001f]\u0003Id\u0019S\u0012M;\u0003I\u0003I-\u001eP\u0014\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0011U\u001dI\u0014\u0007]\u0005D";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R\u0002\u00039\u0012O\u0004@?W_\u001eB?\u0016_\u0005\f%\u0018HQM/\u0013Y\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^[*\u001bP\u0001M;\u0012N^H.\u0011]\u0004@?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 84;
                    str = "\u001eO.^.\u0004Y\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u001f]\u0002s;\u001fS\u001fI\u0014\u0019I\u001cN.\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^[*\u001bP\u0001M;\u0012N^E%\u0001]\u001dE/(Z\u0018@.M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u0011U\u001dI;\u0016H\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u0001U\u0015I$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u0011U\u001dI\u0014\u0007]\u0005D";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^Z\"\u0013Y\u001e\u00038\u001f]\u0003Id\u0011]\u0018@.\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 91;
                    str = "W@Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 92;
                    str = "\u0000]\u001d@;\u0016L\u0014^k\u0011N\u001eAk\u0007[\u001a\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 93;
                    str = "(U\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u0000]\u001d@;\u0016L\u0014^d\u0014N\u001e\\d\u001fY\u0018K#\u0003\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 95;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003N\u0014_>\u001bH^Z(\u0016N\u0015\f\"\u0004\u001c\u001fY'\u001b\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 96;
                    str = "\u0005Y\u0015e/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 97;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^J$\u0005K\u0010^/XU\u001fZ*\u001bU\u0015\u0001&\u0012O\u0002M,\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 98;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0012D\u0005^*Yo%~\u000e6q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 99;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R\u0002\u00039\u0012O\u0004@?W_\u001eB?\u0016_\u0005\f%\u0018HQM/\u0013Y\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 100;
                    str = "7O_[#\u0016H\u0002M;\u0007\u0012\u001fI?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 101;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^J$\u0005K\u0010^/XZ\u0010E'\u0012X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 102;
                    str = "\u0018I\u0005\\>\u0003d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 103;
                    str = "\u001eO.\\9\u0012J\u0018I<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 104;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003U\u0007E?\u000eN\u0014_>\u001bH^O9\u0018L\u0018A*\u0010Y^C$\u001a\u0011\u0014^9\u0018N";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 105;
                    str = "\u0003U\u001cI\u0014\u0003S";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 106;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003U\u0007E?\u000eN\u0014_d\u0018S\u001c\u0001.\u0005N\u001e^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 107;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^Z\"\u0013Y\u001e\u00038\u001f]\u0003Id\u0011]\u0018@.\u0013\u0013\u0018A*\u0010Y\u0003I?\u0002N\u001fI/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 108;
                    str = "\u0018I\u0005\\>\u0003z\u001e^&\u0016H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 109;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003U\u0007E?\u000eN\u0014_d\u0004T\u0010^.ZZ\u0010E'\u0012X^E%\u0003Y\u001fXf\u001eO\\B>\u001bP";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 110;
                    str = "\u0013U\u0002\\'\u0016E.B*\u001aY";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 111;
                    str = "\u0014S\u001fX*\u0014H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "\u0007P\u0010U)\u0016_\u001as$\u0019P\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "\u001f]\u0002s;\u0005Y\u0007E.\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003U\u0007E?\u000eN\u0014_d\u0011]\u0018@d\u001bS\u0010Hf\u001eQ\u0010K.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = "\u0013U\u0002\\'\u0016E.B*\u001aY";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "\u001f]\u0002s;\u001fS\u001fI\u0014\u0019I\u001cN.\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "\u001dU\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "\u0004]\u001c_>\u0019[";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "\u0012N\u0003C9ZS\u001eA";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = "7O_[#\u0016H\u0002M;\u0007\u0012\u001fI?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "\u0014]\u0001X\"\u0018R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u0018I\u0005\\>\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "\u0014S\u001fX*\u0014H.E/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^Z\"\u0013Y\u001e\u00038\u001f]\u0003Id\u0011]\u0018@.\u0013\u0013\u0018A*\u0010Y\u0003I?\u0002N\u001fI/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "\u0003U\u001cI\u0014\u0011N\u001eA";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "\u0003U\u001cI\u0014\u0011N\u001eA";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "\u0015I\u0012G.\u0003c\u0015E8\u0007P\u0010U\u0014\u0019]\u001cI";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "\u0000]\u001d@;\u0016L\u0014^d\u0004Y\u0005Y;XO\u0003Oq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "(U\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "\u0012X\u0018X\u0014\u0014S\u001fX*\u0014H.E%\u0011S";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "\u0001_\u0010^/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "\u0014]\u0001X\"\u0018R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R\u0002\u00039\u0012O\u0004@?XO\u001aE;X_\u001eB?\u0016_\u0005\f%\u0018HQM/\u0013Y\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "\u0011U\u001dI\u0014\u0007]\u0005D";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003U\u0007E?\u000eN\u0014_d\u0004T\u0010^.ZZ\u0010E'\u0012X^B$\u0003T\u0018B,ZH\u001e\u00018\u001f]\u0003I";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003U\u0007E?\u000eN\u0014_d\u0019S\\_;\u0016_\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "\u001dU\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "\u0004_\u0010@.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "\u001f]\u0002s;\u0005Y\u0007E.\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "\u0007]\u0016Ik\u0004U\u000bIq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C;\u0003\u001c\u0002U8\u0003Y\u001c\f(\u0018R\u0005M(\u0003\u001c\u001dE8\u0003\u001c\u0012C>\u001bXQB$\u0003\u001c\u0017C>\u0019X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u00128b\u00182n%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "\u0012Q\u0010E'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "WV\u0018Hv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_?\u0018L^^.\u001bY\u0010_.W";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "\u0004Y\u001dI(\u0003Y\u0015s&\u0012O\u0002M,\u0012O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = "*\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = "M\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O$\u0007E\u0002I'\u0012_\u0005I/\u0012O\u0002M,\u0012O^B$\u0003T\u0018B,\u0004Y\u001dI(\u0003Y\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = "\u0014P\u0018\\)\u0018]\u0003H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 151;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O$\u0007E\u001cI8\u0004]\u0016Id\u0019L\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 152;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C%\u0007N\u0014\\*\u0005Y\u001e\\?\u001eS\u001f_&\u0012R\u0004";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 153;
                    str = "\u001dU\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 154;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H.\u0004H\u0003C2";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 155;
                    str = "WH\u0003M%\u0004Z\u0014^9\u0012XK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 156;
                    str = "WO\u0005M?\u0002OK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 157;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C%\u0014]\u001fO.\u001bQ\u0014H\"\u0016I\u0001@$\u0016XQA.\u0013U\u0010s/\u0016H\u0010\f\"\u0004\u001c\u001fY'\u001b\u001c\u001cI/\u001e].[*(H\b\\.M";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 158;
                    str = "WO\u0005M?\u0002OK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 159;
                    str = "WW\u0014Uq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 160;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C%\u0014]\u001fO.\u001bQ\u0014H\"\u0016I\u0001@$\u0016XQY;\u001bS\u0010H.\u0005\u001c\u0018_k\u0019I\u001d@k\u001aY\u0015E*(K\u0010s?\u000eL\u0014\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 161;
                    str = "WH\u0003M%\u0004Z\u0014^9\u001eR\u0016\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 162;
                    str = "WW\u0014Uq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 163;
                    str = "\u0014S\u001c\u0002<\u001f]\u0005_*\u0007L.\\9\u0012Z\u0014^.\u0019_\u0014_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 164;
                    str = "\u0000]\u0003B.\u0013c\u0010N$\u0002H.O*\u001bP.O#\u0016N\u0016I8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 165;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_.\u0003K\u0010^%\u0012X^J*\u001eP\u0014H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 166;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u00125e\n;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 167;
                    str = "\u0003Y\u001d\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 168;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M/\u0013\u0011\u0012C%\u0003]\u0012Xf\u0011]\u0018@.\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 169;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O*\u001bP\\O$\u0019H\u0010O?XY\u0003^$\u0005\u001c\u001bE/J";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 170;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^A.\u0004O\u0010K.Z_\u001eB?\u0016_\u0005\u0003.\u0005N\u001e^k\u0019S\\^.\u0004S\u0004^(\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 171;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016PQH\"\u0016P\u0014^k\u0016L\u0001\f%\u0018HQJ$\u0002R\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 172;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^A.\u0004O\u0010K.Z_\u001eB?\u0016_\u0005\u0003.\u0005N\u001e^k\u001dU\u0015\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 173;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O*\u001bP\\O$\u0019H\u0010O?XY\u0003^$\u0005\u001c\u001fCf\u0005Y\u0002C>\u0005_\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 174;
                    str = "\u0007T\u001eB.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 175;
                    str = "\u0001R\u0015\u0002*\u0019X\u0003C\"\u0013\u0012\u0012Y9\u0004S\u0003\u0002\"\u0003Y\u001c\u0003(\u0018R\u0005M(\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 176;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u00128b\u00182n%s\u0004%c4h\u0002#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 177;
                    str = "\u0007T\u001eB.(H\b\\.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 178;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^A*\u0019]\u0016I/ZX\u0018M'\u0018[\\M'\u0005Y\u0010H2Z]\u0015H.\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 179;
                    str = "W@Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 180;
                    str = "\u0014S\u001c\u0002<\u001f]\u0005_*\u0007L.\\9\u0012Z\u0014^.\u0019_\u0014_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 181;
                    str = "W@Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 182;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^I&\u0016U\u001d\u0001*\u0003H\u0010O#\u001aY\u001fXd\u0019Y\u0014Hf\u0004X\\O*\u0005X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 183;
                    str = "\u0014S\u001c\u0002#\u0003__M'\u0015I\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 184;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u00126i\u001f(\u007f>b\u001f2r%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 185;
                    str = "\u0018N\u0018I%\u0003]\u0005E$\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 186;
                    str = "\u0018N\u0018I%\u0003]\u0005E$\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 187;
                    str = "0]\u001d@.\u0005E";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 188;
                    str = "\u0014S\u001c\u0002<\u001f]\u0005_*\u0007L_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u0012#i\u00182h.{\n;p!m\u001b2n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 189;
                    str = "\u0014S\u001e@\"\u0005U\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 190;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0012D\u0005^*Yu?e\u001f>}=s\u00029h4b\u001f$";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 191;
                    str = "\u001eQ\u0010K.X\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 192;
                    str = "\u0014S\u001c\u0002<\u001f]\u0005_*\u0007L_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u00125i\r6i=x\u0014 }=`\u001b6l4~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 193;
                    str = "\u001dU\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 194;
                    str = "\u001b]\u0002X\u0014\u001aI\u0005I\u0014\u0004Y\u001dI(\u0003U\u001eB";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 195;
                    str = "\u0014S\u001c\u0002<\u001f]\u0005_*\u0007L_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u0012\"i\u001f(k0`\u0007'}!i\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 196;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^\\*\u0002O\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 197;
                    str = "\u0007S\u0006I9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 198;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M/\u0013\u001c\u0014T\"\u0004H\u0018B,W_\u001eB?\u0016_\u0005\u0016k\u0016_\u0005E=\u001eH\b\f%\u0018HQJ$\u0002R\u0015\u0000k\u0007N\u001eN*\u0015P\b\f?\u0016^\u001dI?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 199;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKd\u0013Y\u001dI?\u0012\u001c\u001fCk\u001aY\u0002_*\u0010Y\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 200;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKk\u0004Y\u0003Z\"\u0014Y\\I3\u0003Y\u001f_\"\u0018R\\^$\u001bP\u0013M(\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 201;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKd\u0018S\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 202;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^[*\u0005R\u0014Hf\u0016^\u001eY?Z_\u0010@'Z_\u0019M9\u0010Y\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 203;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKd\u0013Y\u001dI?\u0012\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 204;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKd\u0013S\u0006B'\u0018]\u0015\u0003%\u0018\u0011\u001cI/\u001e]\\O*\u0005X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 205;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKf\u0016X\u0015\u0001(\u0018R\u0005M(\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 206;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKk\u0004Y\u0003Z\"\u0014Y\\I3\u0003Y\u001f_\"\u0018R\\I3\u0007U\u0003I/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 207;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKd\u001aY\u0015E*ZX\u001e[%\u001bS\u0010Hf\u0011]\u0018@.\u0013\u0013\u0005C$ZS\u001dH";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 208;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKd\u001aY\u0015E*ZX\u001e[%\u001bS\u0010Hf\u0011]\u0018@.\u0013\u0013\u0018B=\u0016P\u0018Hf\u0002N\u001d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 209;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKk\u0004Y\u0003Z\"\u0014Y\\I3\u0003Y\u001f_\"\u0018R\\\\*\u000eQ\u0014B?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 210;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKk\u0004Y\u0003Z\"\u0014Y\\I3\u0003Y\u001f_\"\u0018R\\M(\u0003U\u0007I";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 211;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKd\u0013S\u0006B'\u0018]\u0015\u00039\u0012]\u0015\u0001$\u0019P\b\u0001&\u0012X\u0018Mf\u0014]\u0003H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 212;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKk\u0004S\u0017X<\u0016N\u0014\u0001*\u0015S\u0004Xf\u0003S\\I3\u0007U\u0003I";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 213;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKd\u001aY\u0015E*ZX\u001e[%\u001bS\u0010Hf\u0011]\u0018@.\u0013\u0013\u0018B8\u0002Z\u0017E(\u001eY\u001fXf\u0004L\u0010O.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 214;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKd\u0019S\u0005\u0001*\u0019\u0011\u0018A*\u0010Y";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 215;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKd\u001aY\u0015E*ZX\u001e[%\u001bS\u0010Hf\u0011]\u0018@.\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 216;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H\"\u0016P\u001eKk\u0004Y\u0003Z\"\u0014Y\\I3\u0003Y\u001f_\"\u0018R\\@\"\u0011Y\u0005E&\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 217;
                    str = "\u0014S\u001c\u0002<\u001f]\u0005_*\u0007L_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u0012!`\n.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 218;
                    str = "\u001cY\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 219;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_?\u0016N\u0005";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 220;
                    str = "\u0014S\u001c\u0002<\u001f]\u0005_*\u0007L.\\9\u0012Z\u0014^.\u0019_\u0014_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 221;
                    str = "\u001eR\u0005I9\u0011]\u0012I\u0014\u0011S\u001fX\u0014\u0004U\u000bI";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 222;
                    str = "\u0014T\u0010B,\u0012\u001c\u0001M,\u0012\u001c\u0002E1\u0012\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 223;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O'\u0018_\u001a\u0001<\u0005S\u001fK";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 224;
                    str = "\u0011N\u001eA\b\u0016P\u001db$\u0003U\u0017E(\u0016H\u0018C%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 225;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O9\u0012]\u0005Id\u0019S\\A.ZS\u0003\u0001&\u0004[\u0002X$\u0005Y\\H)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 226;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O9\u0012]\u0005I";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 227;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018RQN$\u0002R\u0012Ik\u0003SQA*\u001eR";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 228;
                    str = "\u0004Y\u001dI(\u0003Y\u0015s&\u0012O\u0002M,\u0012O";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 229;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_$\u0011H\u0006M9\u0012\u0011\u0014T;\u001eN\u0014H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 230;
                    str = "\u001dU\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 231;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O9\u0012]\u0005I";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 232;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O9\u0012]\u0005Id\u0010N\u001eY;ZO\u0019C9\u0003_\u0004Xf\u0005Y\u001cC=\u0012X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 233;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^O9\u0012]\u0005Ik\u0011]\u0018@.\u0013\u001c\u0005Ck\u0004H\u0010^?WR\u0014[k\u0014S\u001fZ.\u0005O\u0010X\"\u0018R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 234;
                    str = "\u001eR\u0001Y?(Y\u001fX.\u0005c\u0002I%\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 235;
                    str = "\u0016^\u001e^?\u001eR\u0016\f/\u0002YQX$WR\u0010X\"\u0001YQ@\"\u0015N\u0010^\"\u0012OQA\"\u0004O\u0018B,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 236;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R._$\u0002R\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 237;
                    str = "\u0014S\u001c\u0002<\u001f]\u0005_*\u0007L.\\9\u0012Z\u0014^.\u0019_\u0014_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 238;
                    str = "\u001dU\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 239;
                    str = "\u0013U\u0002\\'\u0016E\u001fM&\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 240;
                    str = "\u001b]\bC>\u0003c\u0018B-\u001b]\u0005I9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 241;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_$\u0011H\u0006M9\u0012\u0011\u0010N$\u0002H\\X$ZY\t\\\"\u0005Y";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 242;
                    str = "\u0007T\u001eB.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 243;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C;\u0003\u001c\u0002U8\u0003Y\u001c\f(\u0018R\u0005M(\u0003\u001c\u001dE8\u0003\u001c\u0012C>\u001bXQB$\u0003\u001c\u0017C>\u0019X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 244;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u00128b\u00182n%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 245;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^C%\u0014N\u0014M?\u0012S\u0001X\"\u0018R\u0002A.\u0019I";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 246;
                    str = "\u001eR\u0001Y?(Q\u0014X#\u0018X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 247;
                    str = "\u0012Q\u0010E'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 248;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u00128b\u00182n%s\u0004%c4h\u0002#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 249;
                    str = "\u0001R\u0015\u0002*\u0019X\u0003C\"\u0013\u0012\u0012Y9\u0004S\u0003\u0002\"\u0003Y\u001c\u0003(\u0018R\u0005M(\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 250;
                    str = "9SQ_;\u0016_\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 251;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003U\u0007E?\u000eN\u0014_d\u0004T\u0010^.ZZ\u0010E'\u0012X^\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 252;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003U\u0007E?\u000eN\u0014_d\u0004T\u0010^.ZZ\u0010E'\u0012X^\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 253;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003U\u0007E?\u000eN\u0014_d\u0004T\u0010^.ZZ\u0010E'\u0012X^\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 254;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^M(\u0003U\u0007E?\u000eN\u0014_d\u0004T\u0010^.ZZ\u0010E'\u0012X^\f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 255;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^H.\u001bY\u0005I8\u0012P\u0014O?\u0012X\u0014_8\u0016[\u0014_d\u0019S\u0005D\"\u0019[\u0002I'\u0012_\u0005I/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 256;
                    str = "\u0014S\u001c\u0002<\u001f]\u0005_*\u0007L.\\9\u0012Z\u0014^.\u0019_\u0014_";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 257;
                    str = "\u0000]\u0003B.\u0013c\u0010N$\u0002H.O*\u001bP.O#\u0016N\u0016I8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 258;
                    str = "\u001dU\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 259;
                    str = "\u001aS\u0004B?\u0012X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 260;
                    str = "\u0019SQM(\u0003U\u0007Ik\u0004Y\u0002_\"\u0018R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 261;
                    str = "\u0014S\u001fZ.\u0005O\u0010X\"\u0018R^_#\u0016N\u0014\u0003&\u0012X\u0018Mf\u0013S\u0014_f\u0019S\u0005\u0001.\u000fU\u0002X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    cb = strArr3;
                    bc = new ArrayList();
                    t = new HashMap();
                    a1 = new HashMap();
                    T = true;
                    a9 = true;
                    k = true;
                    a4 = false;
                    Q = false;
                default:
                    strArr2[i] = str;
                    str = "\u0016R\u0015^$\u001eX_E%\u0003Y\u001fXe\u0016_\u0005E$\u0019\u00125e\n;";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
        r4_this = this;
        r1 = com.whatsapp.App.az;
        r0 = cb;	 Catch:{ RuntimeException -> 0x00ad }
        r2 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r0 = r0[r2];	 Catch:{ RuntimeException -> 0x00ad }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x00ad }
        super.onDestroy();	 Catch:{ RuntimeException -> 0x00ad }
        r0 = r4.ba;	 Catch:{ RuntimeException -> 0x00ad }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r4.ba;	 Catch:{ RuntimeException -> 0x00ad }
        r2 = 0;
        r0.b(r2);	 Catch:{ RuntimeException -> 0x00ad }
    L_0x0018:
        r0 = r4.getSupportActionBar();	 Catch:{ RuntimeException -> 0x00af }
        r2 = r4.au;	 Catch:{ RuntimeException -> 0x00af }
        r0.removeOnMenuVisibilityListener(r2);	 Catch:{ RuntimeException -> 0x00af }
        r0 = r4.af;	 Catch:{ RuntimeException -> 0x00af }
        if (r0 == 0) goto L_0x002f;
    L_0x0025:
        r0 = com.whatsapp.App.aJ;	 Catch:{ RuntimeException -> 0x00af }
        r2 = r4.am;	 Catch:{ RuntimeException -> 0x00af }
        r0.a(r2);	 Catch:{ RuntimeException -> 0x00af }
        r0 = 0;
        r4.af = r0;	 Catch:{ RuntimeException -> 0x00af }
    L_0x002f:
        r0 = 1;
        T = r0;	 Catch:{ RuntimeException -> 0x00b1 }
        r0 = r4.aS;	 Catch:{ RuntimeException -> 0x00b1 }
        if (r0 == 0) goto L_0x0041;
    L_0x0036:
        r0 = r4.aT;	 Catch:{ RuntimeException -> 0x00b3 }
        if (r0 == 0) goto L_0x0041;
    L_0x003a:
        r0 = r4.aS;	 Catch:{ RuntimeException -> 0x00b3 }
        r2 = r4.aT;	 Catch:{ RuntimeException -> 0x00b3 }
        r0.unregisterDataSetObserver(r2);	 Catch:{ RuntimeException -> 0x00b3 }
    L_0x0041:
        P(r4);	 Catch:{ RuntimeException -> 0x00b5 }
        F(r4);	 Catch:{ RuntimeException -> 0x00b5 }
        r0 = r4.R;	 Catch:{ RuntimeException -> 0x00b5 }
        if (r0 == 0) goto L_0x0050;
    L_0x004b:
        r0 = r4.R;	 Catch:{ RuntimeException -> 0x00b5 }
        r0.close();	 Catch:{ RuntimeException -> 0x00b5 }
    L_0x0050:
        r0 = r4.ac;	 Catch:{ RuntimeException -> 0x00b7 }
        if (r0 == 0) goto L_0x005a;
    L_0x0054:
        r0 = r4.ac;	 Catch:{ RuntimeException -> 0x00b7 }
        r2 = 1;
        r0.cancel(r2);	 Catch:{ RuntimeException -> 0x00b7 }
    L_0x005a:
        r0 = r4.u;	 Catch:{ RuntimeException -> 0x00b9 }
        if (r0 == 0) goto L_0x006d;
    L_0x005e:
        r0 = r4.J;	 Catch:{ RuntimeException -> 0x00bb }
        if (r0 != 0) goto L_0x0066;
    L_0x0062:
        r0 = r4.aV;	 Catch:{ RuntimeException -> 0x00bd }
        if (r0 != 0) goto L_0x006d;
    L_0x0066:
        r0 = com.whatsapp.App.aJ;	 Catch:{ RuntimeException -> 0x00bd }
        r2 = r4.u;	 Catch:{ RuntimeException -> 0x00bd }
        r0.l(r2);	 Catch:{ RuntimeException -> 0x00bd }
    L_0x006d:
        r0 = r4.aj;
        r2 = r0.iterator();
    L_0x0073:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x008a;
    L_0x0079:
        r0 = r2.next();
        r0 = (android.app.Dialog) r0;
        r3 = r0.isShowing();	 Catch:{ RuntimeException -> 0x00bf }
        if (r3 == 0) goto L_0x0088;
    L_0x0085:
        r0.dismiss();	 Catch:{ RuntimeException -> 0x00bf }
    L_0x0088:
        if (r1 == 0) goto L_0x0073;
    L_0x008a:
        r0 = r4.aj;	 Catch:{ RuntimeException -> 0x00c1 }
        r0.clear();	 Catch:{ RuntimeException -> 0x00c1 }
        com.whatsapp.App.a(r4);	 Catch:{ RuntimeException -> 0x00c1 }
        com.whatsapp.App.b(r4);	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = r4.U;	 Catch:{ RuntimeException -> 0x00c1 }
        if (r0 == 0) goto L_0x00a1;
    L_0x0099:
        r0 = r4.U;	 Catch:{ RuntimeException -> 0x00c1 }
        r0.a();	 Catch:{ RuntimeException -> 0x00c1 }
        r0 = 0;
        r4.U = r0;	 Catch:{ RuntimeException -> 0x00c1 }
    L_0x00a1:
        r0 = r4.u;
        com.whatsapp.util.bo.a(r0);
        com.whatsapp.cb.j();
        com.whatsapp.App.a5();
        return;
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        throw r0;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onDestroy():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A() {
        /*
        r4_this = this;
        r0 = com.whatsapp.App.az;
        r1 = r4.aQ;	 Catch:{ RuntimeException -> 0x0074 }
        if (r1 == 0) goto L_0x0037;
    L_0x0006:
        r1 = com.whatsapp.ge.q;	 Catch:{ RuntimeException -> 0x0074 }
        if (r1 == 0) goto L_0x002a;
    L_0x000a:
        r1 = r4.r;
        r1 = r1.g();
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ RuntimeException -> 0x0076 }
        if (r2 != 0) goto L_0x001d;
    L_0x0016:
        r2 = r4.w;	 Catch:{ RuntimeException -> 0x0078 }
        r2.setText(r1);	 Catch:{ RuntimeException -> 0x0078 }
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r1 = r4.av;	 Catch:{ RuntimeException -> 0x007a }
        if (r1 == 0) goto L_0x0028;
    L_0x0021:
        r1 = r4.w;	 Catch:{ RuntimeException -> 0x007a }
        r2 = r4.av;	 Catch:{ RuntimeException -> 0x007a }
        r1.setText(r2);	 Catch:{ RuntimeException -> 0x007a }
    L_0x0028:
        if (r0 == 0) goto L_0x0073;
    L_0x002a:
        r1 = r4.av;	 Catch:{ RuntimeException -> 0x007c }
        if (r1 == 0) goto L_0x0073;
    L_0x002e:
        r1 = r4.w;	 Catch:{ RuntimeException -> 0x007e }
        r2 = r4.av;	 Catch:{ RuntimeException -> 0x007e }
        r1.setText(r2);	 Catch:{ RuntimeException -> 0x007e }
        if (r0 == 0) goto L_0x0073;
    L_0x0037:
        r1 = r4.an;	 Catch:{ RuntimeException -> 0x007e }
        if (r1 != 0) goto L_0x0073;
    L_0x003b:
        r1 = r4.r;
        r1 = r1.u();
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ RuntimeException -> 0x0080 }
        if (r2 != 0) goto L_0x006c;
    L_0x0047:
        r2 = r4.w;	 Catch:{ RuntimeException -> 0x0082 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ RuntimeException -> 0x0082 }
        r2 = r4.w;	 Catch:{ RuntimeException -> 0x0082 }
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0082 }
        r3.<init>();	 Catch:{ RuntimeException -> 0x0082 }
        r1 = r3.append(r1);	 Catch:{ RuntimeException -> 0x0082 }
        r3 = " ";
        r1 = r1.append(r3);	 Catch:{ RuntimeException -> 0x0082 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0082 }
        r2.setText(r1);	 Catch:{ RuntimeException -> 0x0082 }
        r1 = r4.w;	 Catch:{ RuntimeException -> 0x0082 }
        r1.requestLayout();	 Catch:{ RuntimeException -> 0x0082 }
        if (r0 == 0) goto L_0x0073;
    L_0x006c:
        r0 = r4.w;	 Catch:{ RuntimeException -> 0x0082 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ RuntimeException -> 0x0082 }
    L_0x0073:
        return;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.A():void");
    }

    public void a(String str, long j) {
        try {
            if (this.y.getVisibility() != 0) {
                this.y.setVisibility(0);
            }
            this.aM.setText(DateUtils.formatElapsedTime(j / 1000));
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private void q() {
        try {
            if (this.ak) {
                this.az = false;
                this.ai = false;
            }
            try {
                if (!this.ai) {
                    this.X = true;
                    this.bd.post(new at_(this));
                }
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static void J(Conversation conversation) {
        conversation.q();
    }

    static void a(Conversation conversation, Cursor cursor) {
        conversation.a(cursor);
    }

    static void Z(Conversation conversation) {
        conversation.F();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onPrepareDialog(int r4, android.app.Dialog r5) {
        /*
        r3_this = this;
        r1 = com.whatsapp.App.az;
        switch(r4) {
            case 117: goto L_0x0015;
            case 118: goto L_0x0021;
            case 119: goto L_0x002d;
            case 120: goto L_0x0005;
            case 121: goto L_0x0009;
            default: goto L_0x0005;
        };
    L_0x0005:
        super.onPrepareDialog(r4, r5);	 Catch:{ RuntimeException -> 0x003a }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.a();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0008;
    L_0x0015:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.b();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0008;
    L_0x0021:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.c();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0008;
    L_0x002d:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.d();	 Catch:{ RuntimeException -> 0x003a }
        r0.setMessage(r2);	 Catch:{ RuntimeException -> 0x003a }
        if (r1 == 0) goto L_0x0008;
    L_0x0039:
        goto L_0x0005;
    L_0x003a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onPrepareDialog(int, android.app.Dialog):void");
    }

    static nc o(Conversation conversation) {
        return conversation.Y;
    }

    private int b(boolean z) {
        if (z) {
            return 100;
        }
        try {
            if (this.a0 > 90) {
                Log.e(cb[140] + (this.a0 + 10));
                return this.a0 + 10;
            }
            try {
                return this.aY > 0 ? this.aY : 100;
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private void b() {
        try {
            if (this.aJ != null) {
                this.aJ.finish();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static ImageButton O(Conversation conversation) {
        return conversation.a6;
    }

    public static Conversation t() {
        try {
            if (Q) {
                return aD;
            }
            throw new RuntimeException(cb[260]);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static boolean b(Conversation conversation, boolean z) {
        conversation.X = z;
        return z;
    }

    public static Intent a(Context context, m8 m8Var) {
        return new Intent(null, m8Var.n(), context, Conversation.class).addFlags(335544320);
    }

    static ActionMode b(Conversation conversation, ActionMode actionMode) {
        conversation.aJ = actionMode;
        return actionMode;
    }

    static boolean m(Conversation conversation) {
        return conversation.an;
    }

    private void a(String str, int i) {
        CharSequence[] charSequenceArr = new CharSequence[]{getString(R.string.add_info_to_new_contact), getString(R.string.add_info_to_existing_contact)};
        int[] iArr = new int[]{12, 13};
        Builder builder = new Builder(this);
        builder.setTitle(getResources().getString(R.string.choose_action));
        builder.setItems(charSequenceArr, new nw(this, iArr, str, i));
        a(builder.create());
    }

    static boolean l(Conversation conversation, boolean z) {
        conversation.aO = z;
        return z;
    }

    static int b(Conversation conversation, int i) {
        conversation.at = i;
        return i;
    }

    static boolean x(Conversation conversation) {
        return conversation.ao;
    }

    private void k() {
        this.bd.post(new h5(this));
    }

    public void a(Dialog dialog) {
        int i = App.az;
        try {
            if (this.aj.contains(dialog)) {
                Log.e(cb[178]);
                dialog.show();
                return;
            }
            Collection arrayList = new ArrayList();
            Iterator it = this.aj.iterator();
            while (it.hasNext()) {
                Dialog dialog2 = (Dialog) it.next();
                try {
                    if (!dialog2.isShowing()) {
                        arrayList.add(dialog2);
                        continue;
                    }
                    if (i != 0) {
                        break;
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            this.aj.removeAll(arrayList);
            this.aj.add(dialog);
            dialog.show();
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        int i = App.az;
        super.onSaveInstanceState(bundle);
        ArrayList arrayList = new ArrayList();
        if (this.a_ != null) {
            for (b bVar : this.a_.values()) {
                arrayList.add(new w4(bVar.e));
                if (i != 0) {
                    break;
                }
            }
            bundle.putParcelableArrayList(cb[146], arrayList);
        }
    }

    static amr a(Conversation conversation, amr com_whatsapp_amr) {
        conversation.ac = com_whatsapp_amr;
        return com_whatsapp_amr;
    }

    static int c(Conversation conversation) {
        return conversation.at;
    }

    public void c(String str) {
        try {
            if (str.equals(this.u)) {
                E();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static void e(Conversation conversation, b bVar) {
        conversation.g(bVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(com.whatsapp.protocol.b r6) {
        /*
        r5_this = this;
        r1 = com.whatsapp.App.az;
        r0 = r5.aL;
        r0 = r0.size();
        if (r0 != 0) goto L_0x00c1;
    L_0x000a:
        r0 = r5.aS;	 Catch:{ StaleDataException -> 0x009b }
        r0 = r0.getCursor();	 Catch:{ StaleDataException -> 0x009b }
        r2 = r0.getCount();	 Catch:{ StaleDataException -> 0x009b }
        if (r2 <= 0) goto L_0x004c;
    L_0x0016:
        r0 = r5.aK;	 Catch:{ StaleDataException -> 0x008b }
        if (r0 == 0) goto L_0x004c;
    L_0x001a:
        r0 = r5.aS;	 Catch:{ StaleDataException -> 0x008d }
        r3 = r2 + -1;
        r0 = r0.getItem(r3);	 Catch:{ StaleDataException -> 0x008d }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ StaleDataException -> 0x008d }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ StaleDataException -> 0x008d }
        r0 = r0.equals(r6);	 Catch:{ StaleDataException -> 0x008d }
        if (r0 == 0) goto L_0x004c;
    L_0x002c:
        r0 = new java.lang.StringBuilder;	 Catch:{ StaleDataException -> 0x008f }
        r0.<init>();	 Catch:{ StaleDataException -> 0x008f }
        r3 = cb;	 Catch:{ StaleDataException -> 0x008f }
        r4 = 54;
        r3 = r3[r4];	 Catch:{ StaleDataException -> 0x008f }
        r0 = r0.append(r3);	 Catch:{ StaleDataException -> 0x008f }
        r3 = com.whatsapp.util.Log.a(r6);	 Catch:{ StaleDataException -> 0x008f }
        r0 = r0.append(r3);	 Catch:{ StaleDataException -> 0x008f }
        r0 = r0.toString();	 Catch:{ StaleDataException -> 0x008f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ StaleDataException -> 0x008f }
        if (r1 == 0) goto L_0x008a;
    L_0x004c:
        r0 = 1;
        if (r2 <= r0) goto L_0x0085;
    L_0x004f:
        r0 = r5.aK;	 Catch:{ StaleDataException -> 0x0093 }
        if (r0 == 0) goto L_0x0085;
    L_0x0053:
        r0 = r5.aS;	 Catch:{ StaleDataException -> 0x0095 }
        r2 = r2 + -2;
        r0 = r0.getItem(r2);	 Catch:{ StaleDataException -> 0x0095 }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ StaleDataException -> 0x0095 }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ StaleDataException -> 0x0095 }
        r0 = r0.equals(r6);	 Catch:{ StaleDataException -> 0x0095 }
        if (r0 == 0) goto L_0x0085;
    L_0x0065:
        r0 = new java.lang.StringBuilder;	 Catch:{ StaleDataException -> 0x0097 }
        r0.<init>();	 Catch:{ StaleDataException -> 0x0097 }
        r2 = cb;	 Catch:{ StaleDataException -> 0x0097 }
        r3 = 52;
        r2 = r2[r3];	 Catch:{ StaleDataException -> 0x0097 }
        r0 = r0.append(r2);	 Catch:{ StaleDataException -> 0x0097 }
        r2 = com.whatsapp.util.Log.a(r6);	 Catch:{ StaleDataException -> 0x0097 }
        r0 = r0.append(r2);	 Catch:{ StaleDataException -> 0x0097 }
        r0 = r0.toString();	 Catch:{ StaleDataException -> 0x0097 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ StaleDataException -> 0x0097 }
        if (r1 == 0) goto L_0x008a;
    L_0x0085:
        r0 = r5.aL;	 Catch:{ StaleDataException -> 0x0099 }
        r0.add(r6);	 Catch:{ StaleDataException -> 0x0099 }
    L_0x008a:
        return;
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ StaleDataException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ StaleDataException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ StaleDataException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ StaleDataException -> 0x0093 }
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ StaleDataException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ StaleDataException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ StaleDataException -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ StaleDataException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ StaleDataException -> 0x00c7 }
        r2.<init>();	 Catch:{ StaleDataException -> 0x00c7 }
        r3 = cb;	 Catch:{ StaleDataException -> 0x00c7 }
        r4 = 53;
        r3 = r3[r4];	 Catch:{ StaleDataException -> 0x00c7 }
        r2 = r2.append(r3);	 Catch:{ StaleDataException -> 0x00c7 }
        r0 = r0.toString();	 Catch:{ StaleDataException -> 0x00c7 }
        r0 = r2.append(r0);	 Catch:{ StaleDataException -> 0x00c7 }
        r0 = r0.toString();	 Catch:{ StaleDataException -> 0x00c7 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ StaleDataException -> 0x00c7 }
        r0 = r5.aL;	 Catch:{ StaleDataException -> 0x00c7 }
        r0.add(r6);	 Catch:{ StaleDataException -> 0x00c7 }
        if (r1 == 0) goto L_0x008a;
    L_0x00c1:
        r0 = r5.aL;	 Catch:{ StaleDataException -> 0x00c7 }
        r0.add(r6);	 Catch:{ StaleDataException -> 0x00c7 }
        goto L_0x008a;
    L_0x00c7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.e(com.whatsapp.protocol.b):void");
    }

    static int e(Conversation conversation, boolean z) {
        return conversation.b(z);
    }

    static void b(Conversation conversation, String str, boolean z) {
        conversation.b(str, z);
    }

    private void b(String str, int i) {
        Intent intent = new Intent(cb[142], Contacts.CONTENT_URI);
        switch (i) {
            case 102:
                try {
                    intent.putExtra(cb[143], str);
                    break;
                } catch (RuntimeException e) {
                    throw e;
                }
        }
        try {
            intent.setComponent(intent.resolveActivity(getPackageManager()));
            if (intent.getComponent() != null) {
                startActivity(intent);
                T = false;
                if (App.az == 0) {
                    return;
                }
            }
            Log.w(cb[141]);
            App.q();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    private static void D(Conversation conversation) {
        aD = conversation;
        Q = true;
    }

    static HashSet a(Conversation conversation) {
        return conversation.l;
    }

    static void a(Conversation conversation, String str) {
        conversation.e(str);
    }

    static void i(Conversation conversation) {
        conversation.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem r13) {
        /*
        r12_this = this;
        r11 = 0;
        r2 = 0;
        r1 = 1;
        r4 = com.whatsapp.App.az;
        r0 = r13.getItemId();	 Catch:{ RuntimeException -> 0x002a }
        switch(r0) {
            case 0: goto L_0x000e;
            case 1: goto L_0x0030;
            case 2: goto L_0x000c;
            case 3: goto L_0x000c;
            case 4: goto L_0x0056;
            case 5: goto L_0x0049;
            case 6: goto L_0x00f9;
            case 7: goto L_0x0080;
            case 8: goto L_0x00ae;
            case 9: goto L_0x0103;
            case 10: goto L_0x011a;
            case 11: goto L_0x01bc;
            case 12: goto L_0x02fe;
            case 13: goto L_0x000c;
            case 14: goto L_0x0085;
            case 15: goto L_0x008a;
            case 16: goto L_0x031a;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = r2;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = r12.G();	 Catch:{ RuntimeException -> 0x002c }
        if (r0 == 0) goto L_0x001f;
    L_0x0014:
        r0 = r12.r;	 Catch:{ RuntimeException -> 0x002e }
        r0 = r0.a();	 Catch:{ RuntimeException -> 0x002e }
        r12.e(r0);	 Catch:{ RuntimeException -> 0x002e }
        if (r4 == 0) goto L_0x0028;
    L_0x001f:
        r0 = 1;
        r12.d(r0);	 Catch:{ RuntimeException -> 0x002e }
        r0 = 9;
        r12.showDialog(r0);	 Catch:{ RuntimeException -> 0x002e }
    L_0x0028:
        r0 = r1;
        goto L_0x000d;
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;
    L_0x0030:
        r0 = r12.ag;	 Catch:{ RuntimeException -> 0x0045 }
        if (r0 == 0) goto L_0x003e;
    L_0x0034:
        r0 = 0;
        r12.j = r0;	 Catch:{ RuntimeException -> 0x0047 }
        r0 = 11;
        r12.showDialog(r0);	 Catch:{ RuntimeException -> 0x0047 }
        if (r4 == 0) goto L_0x0043;
    L_0x003e:
        r0 = r12.r;	 Catch:{ RuntimeException -> 0x0047 }
        com.whatsapp.ContactInfo.a(r0, r12);	 Catch:{ RuntimeException -> 0x0047 }
    L_0x0043:
        r0 = r1;
        goto L_0x000d;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r0 = r12.r;
        r0 = r0.a(r12);
        r12.b(r0, r1);
        r12.j = r2;
        r0 = r1;
        goto L_0x000d;
    L_0x0056:
        r0 = r12.a5;	 Catch:{ RuntimeException -> 0x0078 }
        if (r0 == 0) goto L_0x0060;
    L_0x005a:
        r0 = 1;
        r12.showDialog(r0);	 Catch:{ RuntimeException -> 0x007a }
        if (r4 == 0) goto L_0x0076;
    L_0x0060:
        r0 = com.whatsapp.App.a();	 Catch:{ RuntimeException -> 0x007c }
        if (r0 != 0) goto L_0x0073;
    L_0x0066:
        r0 = r12.getBaseContext();	 Catch:{ RuntimeException -> 0x007e }
        r2 = 2131624620; // 0x7f0e02ac float:1.8876425E38 double:1.0531624946E-314;
        r3 = 0;
        com.whatsapp.App.b(r0, r2, r3);	 Catch:{ RuntimeException -> 0x007e }
        if (r4 == 0) goto L_0x0076;
    L_0x0073:
        r12.d();	 Catch:{ RuntimeException -> 0x007e }
    L_0x0076:
        r0 = r1;
        goto L_0x000d;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r12.showDialog(r2);
        r0 = r1;
        goto L_0x000d;
    L_0x0085:
        r12.onSearchRequested();
        r0 = r1;
        goto L_0x000d;
    L_0x008a:
        r0 = r12.r;	 Catch:{ RuntimeException -> 0x00aa }
        r0 = r0.e;	 Catch:{ RuntimeException -> 0x00aa }
        r0 = com.whatsapp.App.c(r0);	 Catch:{ RuntimeException -> 0x00aa }
        if (r0 == 0) goto L_0x009b;
    L_0x0094:
        r0 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r12.showDialog(r0);	 Catch:{ RuntimeException -> 0x00ac }
        if (r4 == 0) goto L_0x00a7;
    L_0x009b:
        r0 = r12.Y;	 Catch:{ RuntimeException -> 0x00ac }
        r2 = 2131427652; // 0x7f0b0144 float:1.8476926E38 double:1.0530651794E-314;
        r2 = r12.findViewById(r2);	 Catch:{ RuntimeException -> 0x00ac }
        r0.a(r2);	 Catch:{ RuntimeException -> 0x00ac }
    L_0x00a7:
        r0 = r1;
        goto L_0x000d;
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r0 = com.whatsapp.App.d;	 Catch:{ RuntimeException -> 0x00e9 }
        if (r0 != 0) goto L_0x00b6;
    L_0x00b2:
        r0 = com.whatsapp.App.aF;	 Catch:{ RuntimeException -> 0x00eb }
        if (r0 == 0) goto L_0x00cd;
    L_0x00b6:
        r0 = cb;	 Catch:{ RuntimeException -> 0x00ed }
        r2 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r0 = r0[r2];	 Catch:{ RuntimeException -> 0x00ed }
        com.whatsapp.util.Log.w(r0);	 Catch:{ RuntimeException -> 0x00ed }
        r0 = com.whatsapp.App.aT();	 Catch:{ RuntimeException -> 0x00ed }
        if (r0 == 0) goto L_0x00ef;
    L_0x00c5:
        r0 = 2131624582; // 0x7f0e0286 float:1.8876348E38 double:1.053162476E-314;
    L_0x00c8:
        r12.a(r0);	 Catch:{ RuntimeException -> 0x00f3 }
        if (r4 == 0) goto L_0x00e6;
    L_0x00cd:
        r0 = com.whatsapp.App.aJ;	 Catch:{ RuntimeException -> 0x00f5 }
        r2 = r12.r;	 Catch:{ RuntimeException -> 0x00f5 }
        r2 = r2.e;	 Catch:{ RuntimeException -> 0x00f5 }
        r0 = r0.s(r2);	 Catch:{ RuntimeException -> 0x00f5 }
        if (r0 == 0) goto L_0x00e0;
    L_0x00d9:
        r0 = 10;
        r12.showDialog(r0);	 Catch:{ RuntimeException -> 0x00f7 }
        if (r4 == 0) goto L_0x00e6;
    L_0x00e0:
        r0 = r12.r;	 Catch:{ RuntimeException -> 0x00f7 }
        r2 = 0;
        a(r12, r12, r0, r2);	 Catch:{ RuntimeException -> 0x00f7 }
    L_0x00e6:
        r0 = r1;
        goto L_0x000d;
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00eb }
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ed }
    L_0x00ed:
        r0 = move-exception;
        throw r0;
    L_0x00ef:
        r0 = 2131624583; // 0x7f0e0287 float:1.887635E38 double:1.0531624763E-314;
        goto L_0x00c8;
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00f7 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r0 = com.whatsapp.App.P;
        r2 = r12.r;
        r0.g(r2);
        r0 = r1;
        goto L_0x000d;
    L_0x0103:
        r0 = r12.an;	 Catch:{ RuntimeException -> 0x0116 }
        if (r0 == 0) goto L_0x010e;
    L_0x0107:
        r0 = r12.r;	 Catch:{ RuntimeException -> 0x0118 }
        com.whatsapp.ListChatInfo.a(r0, r12);	 Catch:{ RuntimeException -> 0x0118 }
        if (r4 == 0) goto L_0x0113;
    L_0x010e:
        r0 = r12.r;	 Catch:{ RuntimeException -> 0x0118 }
        com.whatsapp.GroupChatInfo.a(r0, r12);	 Catch:{ RuntimeException -> 0x0118 }
    L_0x0113:
        r0 = r1;
        goto L_0x000d;
    L_0x0116:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;
    L_0x011a:
        r0 = r12.u;	 Catch:{ RuntimeException -> 0x01b8 }
        r0 = com.whatsapp.notification.t.e(r12, r0);	 Catch:{ RuntimeException -> 0x01b8 }
        if (r0 == 0) goto L_0x0129;
    L_0x0122:
        r0 = r12.u;	 Catch:{ RuntimeException -> 0x01b8 }
        com.whatsapp.notification.t.d(r12, r0);	 Catch:{ RuntimeException -> 0x01b8 }
        if (r4 == 0) goto L_0x01b5;
    L_0x0129:
        r0 = r12.getResources();
        r3 = 2131165196; // 0x7f07000c float:1.7944602E38 double:1.052935509E-314;
        r3 = r0.getStringArray(r3);
        r0 = r12.getResources();
        r4 = 2131165197; // 0x7f07000d float:1.7944604E38 double:1.0529355095E-314;
        r4 = r0.getIntArray(r4);
        r5 = new android.app.AlertDialog$Builder;
        r5.<init>(r12);
        r0 = 2131624580; // 0x7f0e0284 float:1.8876344E38 double:1.053162475E-314;
        r0 = r12.getString(r0);
        r5.setTitle(r0);
        r0 = r12.getLayoutInflater();
        r6 = 2130903182; // 0x7f03008e float:1.7413175E38 double:1.052806057E-314;
        r6 = com.whatsapp.b7.a(r0, r6, r11, r2);
        r0 = 2131427925; // 0x7f0b0255 float:1.847748E38 double:1.0530653143E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r7 = new int[r1];
        r8 = 0;
        r9 = com.whatsapp.App.p;	 Catch:{ RuntimeException -> 0x01ba }
        r10 = cb;	 Catch:{ RuntimeException -> 0x01ba }
        r11 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r10 = r10[r11];	 Catch:{ RuntimeException -> 0x01ba }
        r11 = 0;
        r9 = r9.getSharedPreferences(r10, r11);	 Catch:{ RuntimeException -> 0x01ba }
        r10 = cb;	 Catch:{ RuntimeException -> 0x01ba }
        r11 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r10 = r10[r11];	 Catch:{ RuntimeException -> 0x01ba }
        r11 = 0;
        r9 = r9.getInt(r10, r11);	 Catch:{ RuntimeException -> 0x01ba }
        r7[r8] = r9;	 Catch:{ RuntimeException -> 0x01ba }
        r8 = 0;
        r8 = r7[r8];	 Catch:{ RuntimeException -> 0x01ba }
        r9 = r3.length;	 Catch:{ RuntimeException -> 0x01ba }
        if (r8 < r9) goto L_0x0189;
    L_0x0185:
        r8 = 0;
        r9 = 0;
        r7[r8] = r9;	 Catch:{ RuntimeException -> 0x01ba }
    L_0x0189:
        r2 = r7[r2];
        r8 = new com.whatsapp.f0;
        r8.<init>(r12, r7);
        r2 = r5.setSingleChoiceItems(r3, r2, r8);
        r3 = 2131624632; // 0x7f0e02b8 float:1.887645E38 double:1.0531625005E-314;
        r8 = new com.whatsapp.ly;
        r8.<init>(r12, r7, r4, r0);
        r0 = r2.setPositiveButton(r3, r8);
        r2 = 2131624059; // 0x7f0e007b float:1.8875287E38 double:1.0531622174E-314;
        r3 = new com.whatsapp.xw;
        r3.<init>(r12);
        r0.setNegativeButton(r2, r3);
        r5.setView(r6);
        r0 = r5.create();
        r12.a(r0);
    L_0x01b5:
        r0 = r1;
        goto L_0x000d;
    L_0x01b8:
        r0 = move-exception;
        throw r0;
    L_0x01ba:
        r0 = move-exception;
        throw r0;
    L_0x01bc:
        r0 = r12.L;	 Catch:{ RuntimeException -> 0x02f4 }
        if (r0 != 0) goto L_0x01c6;
    L_0x01c0:
        r0 = android.app.WallpaperManager.getInstance(r12);	 Catch:{ RuntimeException -> 0x02f4 }
        r12.L = r0;	 Catch:{ RuntimeException -> 0x02f4 }
    L_0x01c6:
        r0 = new android.graphics.Rect;
        r0.<init>();
        r3 = r12.bd;
        r3.getDrawingRect(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = r12.aH;
        r3 = r3.getWidth();
        r0 = r0.append(r3);
        r3 = cb;
        r5 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r3 = r3[r5];
        r0 = r0.append(r3);
        r3 = r12.aH;
        r3 = r3.getHeight();
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r5 = new android.content.Intent;
        r0 = cb;
        r3 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r0 = r0[r3];
        r5.<init>(r0, r11);
        r0 = cb;
        r3 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        r0 = r0[r3];
        r5.setType(r0);
        r0 = r12.getPackageManager();
        r6 = r0.queryIntentActivities(r5, r2);
        r7 = r6.size();
        r3 = r2;
    L_0x021b:
        if (r3 >= r7) goto L_0x029a;
    L_0x021d:
        r0 = r6.get(r3);
        r0 = (android.content.pm.ResolveInfo) r0;
        r0 = r0.activityInfo;
        r8 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x02f6 }
        r8.<init>();	 Catch:{ RuntimeException -> 0x02f6 }
        r9 = r0.applicationInfo;	 Catch:{ RuntimeException -> 0x02f6 }
        r9 = r9.packageName;	 Catch:{ RuntimeException -> 0x02f6 }
        r8 = r8.append(r9);	 Catch:{ RuntimeException -> 0x02f6 }
        r9 = cb;	 Catch:{ RuntimeException -> 0x02f6 }
        r10 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r9 = r9[r10];	 Catch:{ RuntimeException -> 0x02f6 }
        r8 = r8.append(r9);	 Catch:{ RuntimeException -> 0x02f6 }
        r9 = r0.name;	 Catch:{ RuntimeException -> 0x02f6 }
        r8 = r8.append(r9);	 Catch:{ RuntimeException -> 0x02f6 }
        r8 = r8.toString();	 Catch:{ RuntimeException -> 0x02f6 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ RuntimeException -> 0x02f6 }
        r8 = r0.name;	 Catch:{ RuntimeException -> 0x02f6 }
        r9 = cb;	 Catch:{ RuntimeException -> 0x02f6 }
        r10 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        r9 = r9[r10];	 Catch:{ RuntimeException -> 0x02f6 }
        r8 = r8.contains(r9);	 Catch:{ RuntimeException -> 0x02f6 }
        if (r8 == 0) goto L_0x0265;
    L_0x0257:
        r8 = r0.name;	 Catch:{ RuntimeException -> 0x02f8 }
        r9 = cb;	 Catch:{ RuntimeException -> 0x02f8 }
        r10 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        r9 = r9[r10];	 Catch:{ RuntimeException -> 0x02f8 }
        r8 = r8.contains(r9);	 Catch:{ RuntimeException -> 0x02f8 }
        if (r8 != 0) goto L_0x0273;
    L_0x0265:
        r8 = r0.name;	 Catch:{ RuntimeException -> 0x02fa }
        r9 = cb;	 Catch:{ RuntimeException -> 0x02fa }
        r10 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r9 = r9[r10];	 Catch:{ RuntimeException -> 0x02fa }
        r8 = r8.contains(r9);	 Catch:{ RuntimeException -> 0x02fa }
        if (r8 == 0) goto L_0x0296;
    L_0x0273:
        r8 = new android.content.ComponentName;	 Catch:{ RuntimeException -> 0x02fc }
        r9 = r0.applicationInfo;	 Catch:{ RuntimeException -> 0x02fc }
        r9 = r9.packageName;	 Catch:{ RuntimeException -> 0x02fc }
        r0 = r0.name;	 Catch:{ RuntimeException -> 0x02fc }
        r8.<init>(r9, r0);	 Catch:{ RuntimeException -> 0x02fc }
        r5.setComponent(r8);	 Catch:{ RuntimeException -> 0x02fc }
        r0 = cb;	 Catch:{ RuntimeException -> 0x02fc }
        r8 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        r0 = r0[r8];	 Catch:{ RuntimeException -> 0x02fc }
        r8 = r12.getResources();	 Catch:{ RuntimeException -> 0x02fc }
        r8 = r8.getConfiguration();	 Catch:{ RuntimeException -> 0x02fc }
        r8 = r8.orientation;	 Catch:{ RuntimeException -> 0x02fc }
        r5.putExtra(r0, r8);	 Catch:{ RuntimeException -> 0x02fc }
        if (r4 == 0) goto L_0x029a;
    L_0x0296:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x0322;
    L_0x029a:
        r0 = new android.content.Intent;
        r3 = cb;
        r4 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r3 = r3[r4];
        r0.<init>(r3, r11);
        r3 = cb;
        r4 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        r3 = r3[r4];
        r4 = r12.getResources();
        r4 = r4.getConfiguration();
        r4 = r4.orientation;
        r0.putExtra(r3, r4);
        r3 = new android.content.Intent;
        r4 = cb;
        r6 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r4 = r4[r6];
        r3.<init>(r4, r11);
        r4 = 3;
        r4 = new android.os.Parcelable[r4];
        r4[r2] = r5;
        r4[r1] = r0;
        r0 = 2;
        r4[r0] = r3;
        r0 = new android.content.Intent;
        r2 = cb;
        r3 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r2 = r2[r3];
        r0.<init>(r2, r11);
        r2 = 2131624676; // 0x7f0e02e4 float:1.8876538E38 double:1.053162522E-314;
        r2 = r12.getString(r2);
        r0 = android.content.Intent.createChooser(r0, r2);
        r2 = cb;
        r3 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        r2 = r2[r3];
        r0.putExtra(r2, r4);
        r2 = 17;
        r12.startActivityForResult(r0, r2);
        r0 = r1;
        goto L_0x000d;
    L_0x02f4:
        r0 = move-exception;
        throw r0;
    L_0x02f6:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x02f8 }
    L_0x02f8:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x02fa }
    L_0x02fa:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x02fc }
    L_0x02fc:
        r0 = move-exception;
        throw r0;
    L_0x02fe:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.MediaGallery.class;
        r0.<init>(r12, r2);
        r2 = cb;
        r3 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r2 = r2[r3];
        r3 = r12.r;
        r3 = r3.e;
        r0.putExtra(r2, r3);
        r12.startActivity(r0);
        T = r1;
        r0 = r1;
        goto L_0x000d;
    L_0x031a:
        r0 = r12.r;
        com.whatsapp.App.b(r0, r12);
        r0 = r1;
        goto L_0x000d;
    L_0x0322:
        r3 = r0;
        goto L_0x021b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onOptionsItemSelected(com.actionbarsherlock.view.MenuItem):boolean");
    }

    private void d() {
        this.A = false;
        showDialog(107);
        br.a(new sx(this));
    }

    private void j(b bVar) {
        MediaData mediaData = (MediaData) bVar.A;
        try {
            try {
                if (mediaData.file == null) {
                    Log.w(cb[261]);
                    App.b(getBaseContext(), App.aT() ? R.string.gallery_media_not_exist : R.string.gallery_media_not_exist_shared_storage, 0);
                    if (App.az == 0) {
                        return;
                    }
                }
                App.a((Context) this, mediaData.file, bVar.j);
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        r1_this = this;
        r0 = r1.isFinishing();	 Catch:{ RuntimeException -> 0x0028 }
        if (r0 != 0) goto L_0x0024;
    L_0x0006:
        r0 = r();	 Catch:{ RuntimeException -> 0x002a }
        if (r0 == 0) goto L_0x0024;
    L_0x000c:
        r0 = 0;
        r1.g(r0);	 Catch:{ RuntimeException -> 0x002c }
        r0 = r1.r;	 Catch:{ RuntimeException -> 0x002c }
        r0 = r0.w();	 Catch:{ RuntimeException -> 0x002c }
        if (r0 == 0) goto L_0x001d;
    L_0x0018:
        r0 = r1.aS;	 Catch:{ RuntimeException -> 0x002c }
        r0.notifyDataSetChanged();	 Catch:{ RuntimeException -> 0x002c }
    L_0x001d:
        r1.E();	 Catch:{ RuntimeException -> 0x002e }
        r0 = com.whatsapp.App.az;	 Catch:{ RuntimeException -> 0x002e }
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0 = 1;
        r1.x = r0;	 Catch:{ RuntimeException -> 0x002e }
    L_0x0027:
        return;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.a():void");
    }

    private boolean p() {
        try {
            if (!this.Z.isShown()) {
                if (!this.aX.isShowing()) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public boolean onSearchRequested() {
        try {
            if (this.a3 == null) {
                try {
                    if (this.aJ != null) {
                        this.aJ.finish();
                    }
                    try {
                        if (this.a7 == null) {
                            this.a7 = new ms(this);
                        }
                        this.N.setVisibility(8);
                        this.bb.setVisibility(8);
                        this.a3 = startActionMode(this.a7);
                        this.aW.toggleSoftInput(0, 0);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
            return false;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    private void d(boolean z) {
        Editor edit = getSharedPreferences(cb[163], 0).edit();
        try {
            edit.putBoolean(cb[164], z);
            if (!edit.commit()) {
                Log.e(cb[165]);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static void af(Conversation conversation) {
        conversation.A();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int h(com.whatsapp.protocol.b r5) {
        /*
        r1 = 15;
        r2 = 1;
        r0 = 6;
        r3 = -1;
        r4 = r5.j;	 Catch:{ RuntimeException -> 0x0025 }
        switch(r4) {
            case 0: goto L_0x0019;
            case 1: goto L_0x0058;
            case 2: goto L_0x0038;
            case 3: goto L_0x0065;
            case 4: goto L_0x007f;
            case 5: goto L_0x0072;
            case 6: goto L_0x000a;
            case 7: goto L_0x000a;
            case 8: goto L_0x008c;
            default: goto L_0x000a;
        };
    L_0x000a:
        r2 = r5.a;	 Catch:{ RuntimeException -> 0x009b }
        if (r2 != r3) goto L_0x00a4;
    L_0x000e:
        r2 = r5.j;	 Catch:{ RuntimeException -> 0x009d }
        if (r2 != r3) goto L_0x00a4;
    L_0x0012:
        r2 = r5.e;	 Catch:{ RuntimeException -> 0x009f }
        r2 = r2.b;	 Catch:{ RuntimeException -> 0x009f }
        if (r2 == 0) goto L_0x00a1;
    L_0x0018:
        return r0;
    L_0x0019:
        r2 = r5.a;	 Catch:{ RuntimeException -> 0x0027 }
        if (r2 != r0) goto L_0x002b;
    L_0x001d:
        r2 = r5.e;	 Catch:{ RuntimeException -> 0x0029 }
        r2 = r2.b;	 Catch:{ RuntimeException -> 0x0029 }
        if (r2 != 0) goto L_0x0018;
    L_0x0023:
        r0 = r1;
        goto L_0x0018;
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = r5.e;	 Catch:{ RuntimeException -> 0x0033 }
        r0 = r0.b;	 Catch:{ RuntimeException -> 0x0033 }
        if (r0 == 0) goto L_0x0035;
    L_0x0031:
        r0 = 0;
        goto L_0x0018;
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r0 = 9;
        goto L_0x0018;
    L_0x0038:
        r0 = r5.w;	 Catch:{ RuntimeException -> 0x0044 }
        if (r0 != r2) goto L_0x004b;
    L_0x003c:
        r0 = r5.e;	 Catch:{ RuntimeException -> 0x0046 }
        r0 = r0.b;	 Catch:{ RuntimeException -> 0x0046 }
        if (r0 == 0) goto L_0x0048;
    L_0x0042:
        r0 = 7;
        goto L_0x0018;
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = 16;
        goto L_0x0018;
    L_0x004b:
        r0 = r5.e;	 Catch:{ RuntimeException -> 0x0053 }
        r0 = r0.b;	 Catch:{ RuntimeException -> 0x0053 }
        if (r0 == 0) goto L_0x0055;
    L_0x0051:
        r0 = 2;
        goto L_0x0018;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = 11;
        goto L_0x0018;
    L_0x0058:
        r0 = r5.e;	 Catch:{ RuntimeException -> 0x0060 }
        r0 = r0.b;	 Catch:{ RuntimeException -> 0x0060 }
        if (r0 == 0) goto L_0x0062;
    L_0x005e:
        r0 = r2;
        goto L_0x0018;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = 10;
        goto L_0x0018;
    L_0x0065:
        r0 = r5.e;	 Catch:{ RuntimeException -> 0x006d }
        r0 = r0.b;	 Catch:{ RuntimeException -> 0x006d }
        if (r0 == 0) goto L_0x006f;
    L_0x006b:
        r0 = 3;
        goto L_0x0018;
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r0 = 12;
        goto L_0x0018;
    L_0x0072:
        r0 = r5.e;	 Catch:{ RuntimeException -> 0x007a }
        r0 = r0.b;	 Catch:{ RuntimeException -> 0x007a }
        if (r0 == 0) goto L_0x007c;
    L_0x0078:
        r0 = 4;
        goto L_0x0018;
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r0 = 13;
        goto L_0x0018;
    L_0x007f:
        r0 = r5.e;	 Catch:{ RuntimeException -> 0x0087 }
        r0 = r0.b;	 Catch:{ RuntimeException -> 0x0087 }
        if (r0 == 0) goto L_0x0089;
    L_0x0085:
        r0 = 5;
        goto L_0x0018;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = 14;
        goto L_0x0018;
    L_0x008c:
        r0 = r5.e;	 Catch:{ RuntimeException -> 0x0095 }
        r0 = r0.b;	 Catch:{ RuntimeException -> 0x0095 }
        if (r0 == 0) goto L_0x0097;
    L_0x0092:
        r0 = 8;
        goto L_0x0018;
    L_0x0095:
        r0 = move-exception;
        throw r0;
    L_0x0097:
        r0 = 17;
        goto L_0x0018;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r0 = r1;
        goto L_0x0018;
    L_0x00a4:
        r0 = r3;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.h(com.whatsapp.protocol.b):int");
    }

    public boolean s() {
        return this.ba.i();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
        r4_this = this;
        r3 = 0;
        r0 = cb;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0096 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0096 }
        super.onPause();	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r4.ba;	 Catch:{ RuntimeException -> 0x0096 }
        if (r0 == 0) goto L_0x0017;
    L_0x0011:
        r0 = r4.ba;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = 0;
        r0.b(r1);	 Catch:{ RuntimeException -> 0x0096 }
    L_0x0017:
        r0 = a1;	 Catch:{ RuntimeException -> 0x0098 }
        r1 = r4.r;	 Catch:{ RuntimeException -> 0x0098 }
        r1 = r1.e;	 Catch:{ RuntimeException -> 0x0098 }
        r2 = r4.a2;	 Catch:{ RuntimeException -> 0x0098 }
        r2 = r2.getText();	 Catch:{ RuntimeException -> 0x0098 }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x0098 }
        r0.put(r1, r2);	 Catch:{ RuntimeException -> 0x0098 }
        r0 = 1;
        r4.ao = r0;	 Catch:{ RuntimeException -> 0x0098 }
        r0 = r4.G;	 Catch:{ RuntimeException -> 0x0098 }
        if (r0 == 0) goto L_0x0058;
    L_0x0031:
        r0 = r4.G;	 Catch:{ RuntimeException -> 0x009a }
        r1 = 0;
        r0 = r0.hasMessages(r1);	 Catch:{ RuntimeException -> 0x009a }
        if (r0 == 0) goto L_0x0058;
    L_0x003a:
        r0 = r4.G;	 Catch:{ RuntimeException -> 0x009c }
        r1 = 0;
        r0.removeMessages(r1);	 Catch:{ RuntimeException -> 0x009c }
        r0 = cb;	 Catch:{ RuntimeException -> 0x009c }
        r1 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x009c }
        r0 = r4.getSystemService(r0);	 Catch:{ RuntimeException -> 0x009c }
        r0 = (android.os.PowerManager) r0;	 Catch:{ RuntimeException -> 0x009c }
        r0 = r0.isScreenOn();	 Catch:{ RuntimeException -> 0x009c }
        if (r0 == 0) goto L_0x0058;
    L_0x0052:
        r0 = r4.G;	 Catch:{ RuntimeException -> 0x009c }
        r1 = 0;
        r0.sendEmptyMessage(r1);	 Catch:{ RuntimeException -> 0x009c }
    L_0x0058:
        r0 = r4.bd;	 Catch:{ RuntimeException -> 0x009e }
        r0 = r0.getHeight();	 Catch:{ RuntimeException -> 0x009e }
        if (r0 == 0) goto L_0x0092;
    L_0x0060:
        r0 = r4.bd;	 Catch:{ RuntimeException -> 0x00a0 }
        r0 = r0.getLastVisiblePosition();	 Catch:{ RuntimeException -> 0x00a0 }
        r1 = r4.bd;	 Catch:{ RuntimeException -> 0x00a0 }
        r1 = r1.getCount();	 Catch:{ RuntimeException -> 0x00a0 }
        r1 = r1 + -1;
        if (r0 != r1) goto L_0x0077;
    L_0x0070:
        r0 = 1;
        r4.q = r0;	 Catch:{ RuntimeException -> 0x00a0 }
        r0 = com.whatsapp.App.az;	 Catch:{ RuntimeException -> 0x00a0 }
        if (r0 == 0) goto L_0x0092;
    L_0x0077:
        r0 = r4.bd;
        r0 = r0.getFirstVisiblePosition();
        r4.z = r0;
        r0 = r4.bd;
        r0 = r0.getChildAt(r3);
        r1 = 0;
        r4.aZ = r1;	 Catch:{ RuntimeException -> 0x00a2 }
        if (r0 == 0) goto L_0x0090;
    L_0x008a:
        r0 = r0.getTop();	 Catch:{ RuntimeException -> 0x00a2 }
        r4.aZ = r0;	 Catch:{ RuntimeException -> 0x00a2 }
    L_0x0090:
        r4.q = r3;
    L_0x0092:
        r4.g();
        return;
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.onPause():void");
    }

    static boolean a(Conversation conversation, int i, String str, int i2) {
        return conversation.a(i, str, i2);
    }

    static void B(Conversation conversation) {
        conversation.v();
    }

    static boolean i(Conversation conversation, boolean z) {
        conversation.I = z;
        return z;
    }

    static boolean v(Conversation conversation) {
        return conversation.aK;
    }

    public static Intent a(m8 m8Var) {
        return new Intent(App.p.getApplicationContext(), Conversation.class).putExtra(cb[153], m8Var.e).addFlags(335544320);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o() {
        /*
        r4_this = this;
        r0 = com.whatsapp.App.az;
        r1 = r4.F;	 Catch:{ RuntimeException -> 0x0042 }
        if (r1 == 0) goto L_0x000e;
    L_0x0006:
        r4.q();	 Catch:{ RuntimeException -> 0x0044 }
        r1 = 0;
        r4.F = r1;	 Catch:{ RuntimeException -> 0x0044 }
        if (r0 == 0) goto L_0x0041;
    L_0x000e:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0046 }
        r2 = 8;
        if (r1 < r2) goto L_0x003e;
    L_0x0014:
        r1 = r4.bd;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = r1.getLastVisiblePosition();	 Catch:{ RuntimeException -> 0x0048 }
        r2 = r4.bd;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = r2.getCount();	 Catch:{ RuntimeException -> 0x0048 }
        r2 = r2 + -2;
        if (r1 < r2) goto L_0x0029;
    L_0x0024:
        r4.q();	 Catch:{ RuntimeException -> 0x004a }
        if (r0 == 0) goto L_0x0041;
    L_0x0029:
        r1 = r4.bd;	 Catch:{ RuntimeException -> 0x004c }
        r2 = r4.getResources();	 Catch:{ RuntimeException -> 0x004c }
        r3 = 2131361839; // 0x7f0a002f float:1.8343442E38 double:1.0530326635E-314;
        r2 = r2.getDimension(r3);	 Catch:{ RuntimeException -> 0x004c }
        r2 = (int) r2;	 Catch:{ RuntimeException -> 0x004c }
        r3 = 100;
        r1.smoothScrollBy(r2, r3);	 Catch:{ RuntimeException -> 0x004c }
        if (r0 == 0) goto L_0x0041;
    L_0x003e:
        r4.q();	 Catch:{ RuntimeException -> 0x004c }
    L_0x0041:
        return;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.o():void");
    }

    private void z() {
        this.y.setVisibility(0);
        this.aM.setText("");
    }
}
