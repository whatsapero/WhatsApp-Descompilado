package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class HomeActivity extends DialogToastFragmentActivity implements _2, asm {
    private static final String[] z;
    private Menu f;
    private TabsPager g;
    private MenuItem h;
    private il i;
    private int j;
    private View k;
    private a3a l;
    private SimpleOnPageChangeListener m;
    private TextView n;
    private MenuItem o;
    private ActionBar p;

    public class ServiceExpirationWarningDialogFragment extends DialogFragment {
        public Dialog onCreateDialog(Bundle bundle) {
            return a_3.a(getActivity(), ac.a(getActivity(), false));
        }
    }

    public class SoftwareAboutToExpireDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "N`+ \bBf')HA/5*ARx'7B\u000bn$*RR\"2*\nCw6,UC".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 38;
                        break;
                    case ay.f /*1*/:
                        i2 = 15;
                        break;
                    case ay.n /*2*/:
                        i2 = 70;
                        break;
                    case ay.p /*3*/:
                        i2 = 69;
                        break;
                    default:
                        i2 = 39;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public Dialog onCreateDialog(Bundle bundle) {
            Log.i(z);
            return ac.a(getActivity());
        }
    }

    public class TabsPager extends ViewPager {
        private boolean b;

        public TabsPager(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return this.b ? super.onInterceptTouchEvent(motionEvent) : false;
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.b ? super.onTouchEvent(motionEvent) : false;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setCurrentItem(int r5) {
            /*
            r4_this = this;
            r3 = 8;
            r2 = 0;
            r0 = r4.getCurrentItem();
            if (r5 != r0) goto L_0x003a;
        L_0x0009:
            r0 = r4.getContext();
            r0 = (com.whatsapp.HomeActivity) r0;
            r0 = com.whatsapp.HomeActivity.a(r0, r5);
            if (r0 == 0) goto L_0x003a;
        L_0x0015:
            r0 = (android.support.v4.app.Fragment) r0;
            r0 = r0.getView();
            r1 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
            r0 = r0.findViewById(r1);
            r0 = (android.widget.ListView) r0;
            if (r0 == 0) goto L_0x003a;
        L_0x0026:
            r1 = android.os.Build.VERSION.SDK_INT;
            if (r1 < r3) goto L_0x0037;
        L_0x002a:
            r1 = r0.getFirstVisiblePosition();
            if (r1 >= r3) goto L_0x0037;
        L_0x0030:
            r0.smoothScrollToPosition(r2);
            r1 = com.whatsapp.App.az;
            if (r1 == 0) goto L_0x003a;
        L_0x0037:
            r0.setSelection(r2);
        L_0x003a:
            super.setCurrentItem(r5);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.TabsPager.setCurrentItem(int):void");
        }
    }

    static {
        String[] strArr = new String[20];
        String str = "oXr`!wVjvk";
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
                        i3 = 55;
                        break;
                    case ay.n /*2*/:
                        i3 = 31;
                        break;
                    case ay.p /*3*/:
                        i3 = 5;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "oXr`!c^~ia`\u0017l`|q^|`#bOk``t^pk#k^y`znZz";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "oXr`!c^~ia`\u0017l`|q^|`#bOk``t^pk#bOol|bS";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "oXr`!c^~ia`\u0017l`|q^|`#bOk``t^pk#fTklxb";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    str = "oXr`!c^~ia`\u0017l`|q^|`#bOk``t^pk#wVfhkiC";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "bY{ZiuXjuQm^{";
                    obj = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    str = "dXr+yoVkvowG1l`sRqq fTklai\u0019\\DBKd";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "bOvqQ`Epp~X]va";
                    obj = 7;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "oXr`!iRhl`sRqq";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "oXr`!cRlq|hN";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "dXr+yoVkvowG1l`sRqq fTklai\u0019\\DBKd";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "oXr`!t@2`vw^m`j";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "dXqskuD~qghYl%lhBqfk'Cp%cf^q";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    str = "oXr`!d[pfe*@mj``";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "oXr`!dEzdzb";
                    obj = 14;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "oXr`!dEzdzb\u0018qj#jR2j|*Zlb}sXm`#cU";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "oXr`!uRlpcb\u0018qj#jR2j|*Zlb}sXm`#cU";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "dXqskuD~qghYl%lhBqfk'Cp%cf^q";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "oXr`!uRlpcb";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "oXr`!c^~ia`\u0017l`|q^|`#bOk``t^pk#uXsilfTt";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.whatsapp.HomeActivity.a():void
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
	at jadx.core.dex.trycatch.TryCatchBlock.removeWholeBlock(TryCatchBlock.java:76)
	at jadx.core.dex.trycatch.TryCatchBlock.removeHandler(TryCatchBlock.java:60)
	at jadx.core.dex.nodes.MethodNode.initTryCatches(MethodNode.java:286)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 8 more
*/
        /*
        r0_this = this;
        r2 = 0;
        r0 = com.whatsapp.b1.g();
        if (r0 != 0) goto L_0x001d;
        r0 = com.whatsapp.b1.b();
        if (r0 != 0) goto L_0x001d;
        r0 = new com.whatsapp.ir;
        r1 = 0;
        r0.<init>(r3, r1);
        r1 = 0;
        r1 = new java.lang.Void[r1];
        com.whatsapp.a5w.a(r0, r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0024;
        r0 = com.whatsapp.b1.i();
        r3.b(r0);
        return;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        r3.b(r2);
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.a():void");
    }

    public void a(b bVar) {
        cb.j();
    }

    private void e() {
        b1.d();
        a5w.a(new ir(this, null), new Void[0]);
    }

    static void d(HomeActivity homeActivity) {
        homeActivity.f();
    }

    protected Dialog onCreateDialog(int i) {
        Dialog progressDialog;
        switch (i) {
            case PBE.MD5 /*0*/:
                return new Builder(this).setTitle(R.string.initialization_fail_title).setMessage(getString(R.string.initialization_fail_message, new Object[]{getString(R.string.connectivity_self_help_instructions)})).setCancelable(false).setPositiveButton(R.string.initialization_fail_retry, new c6(this)).create();
            case ay.f /*1*/:
                progressDialog = new ProgressDialog(this);
                progressDialog.setTitle(getString(R.string.register_xmpp_title));
                progressDialog.setMessage(getString(R.string.register_wait_message));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case 107:
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_wait_message));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case 117:
                Log.w(z[4]);
                return a_3.b(this);
            case 118:
                Log.w(z[3]);
                return a_3.f(this);
            case 119:
                Log.w(z[5]);
                return a_3.a((Activity) this, false);
            case 120:
                Log.w(z[2]);
                return a_3.d(this);
            case 121:
                Log.w(z[1]);
                return a_3.c(this);
            default:
                return null;
        }
    }

    static void a(HomeActivity homeActivity, boolean z) {
        homeActivity.b(z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    static void e(HomeActivity homeActivity) {
        homeActivity.e();
    }

    public void a(String str, long j) {
        try {
            if (this.k.getVisibility() != 0) {
                this.k.setVisibility(0);
            }
            this.n.setText(DateUtils.formatElapsedTime(j / 1000));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void onStop() {
        super.onStop();
        ac.b(this.l);
    }

    public void b(b bVar) {
        this.k.setVisibility(8);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        try {
            if (this.o != null) {
                if (this.o.isActionViewExpanded()) {
                    this.o.collapseActionView();
                }
            }
            super.startActivityFromFragment(fragment, intent, i);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void g() {
        if (!ChangeNumber.g() && ac.a((Activity) this, false) != null) {
            DialogFragment serviceExpirationWarningDialogFragment = new ServiceExpirationWarningDialogFragment();
            serviceExpirationWarningDialogFragment.setCancelable(false);
            serviceExpirationWarningDialogFragment.show(getSupportFragmentManager(), null);
        }
    }

    public boolean onSearchRequested() {
        try {
            if (this.o != null) {
                this.o.expandActionView();
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a(String str, boolean z) {
    }

    static void c(HomeActivity homeActivity) {
        homeActivity.h();
    }

    private void b(DialogFragment dialogFragment) {
        App.q = true;
        App.p.a7();
        c(dialogFragment);
    }

    public void e(String str) {
        runOnUiThread(new me(this));
    }

    static bt a(HomeActivity homeActivity, int i) {
        return homeActivity.a(i);
    }

    public void b() {
        f();
    }

    public void onStart() {
        super.onStart();
        ac.a(this.l);
    }

    public void onPause() {
        Log.i(z[0]);
        super.onPause();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r6) {
        /*
        r5_this = this;
        r4 = 3;
        r1 = com.whatsapp.App.az;
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = 15;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x0057 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r0 = com.whatsapp.App.G;	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r0 != r4) goto L_0x0013;
    L_0x0010:
        com.whatsapp.util.g.a(r5);	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x0013:
        super.onCreate(r6);	 Catch:{ IllegalArgumentException -> 0x0059 }
        r2 = 5;
        r5.requestWindowFeature(r2);	 Catch:{ IllegalArgumentException -> 0x0059 }
        r0 = 2130903155; // 0x7f030073 float:1.741312E38 double:1.0528060435E-314;
        r5.setContentView(r0);	 Catch:{ IllegalArgumentException -> 0x0059 }
        r0 = 0;
        r5.setSupportProgressBarIndeterminateVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x0059 }
        r0 = com.whatsapp.App.an;	 Catch:{ IllegalArgumentException -> 0x0059 }
        if (r0 == 0) goto L_0x0037;
    L_0x0029:
        r0 = com.whatsapp.App.aJ;	 Catch:{ IllegalArgumentException -> 0x005b }
        r0 = r0.e();	 Catch:{ IllegalArgumentException -> 0x005b }
        if (r0 == 0) goto L_0x0037;
    L_0x0031:
        r0 = com.whatsapp.App.e(r5);	 Catch:{ IllegalArgumentException -> 0x005b }
        if (r0 == r4) goto L_0x005d;
    L_0x0037:
        r0 = z;
        r1 = 16;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 13;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r5, r1);
        r5.startActivity(r0);
        r5.finish();
    L_0x0056:
        return;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r0 = com.whatsapp.App.V;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r0.stop();	 Catch:{ IllegalArgumentException -> 0x0139 }
        r0 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r0 = r0.x();	 Catch:{ IllegalArgumentException -> 0x0139 }
        if (r0 == 0) goto L_0x007d;
    L_0x006a:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x013b }
        r2 = 14;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x013b }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalArgumentException -> 0x013b }
        r0 = new com.whatsapp.DialogToastFragmentActivity$ClockWrongDialogFragment;	 Catch:{ IllegalArgumentException -> 0x013b }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x013b }
        r5.b(r0);	 Catch:{ IllegalArgumentException -> 0x013b }
        if (r1 == 0) goto L_0x00a4;
    L_0x007d:
        r0 = com.whatsapp.App.ax();	 Catch:{ IllegalArgumentException -> 0x013d }
        if (r0 == 0) goto L_0x0096;
    L_0x0083:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x013f }
        r2 = 12;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x013f }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalArgumentException -> 0x013f }
        r0 = new com.whatsapp.DialogToastFragmentActivity$SoftwareExpiredDialogFragment;	 Catch:{ IllegalArgumentException -> 0x013f }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x013f }
        r5.b(r0);	 Catch:{ IllegalArgumentException -> 0x013f }
        if (r1 == 0) goto L_0x00a4;
    L_0x0096:
        r0 = com.whatsapp.App.aQ();	 Catch:{ IllegalArgumentException -> 0x0141 }
        if (r0 == 0) goto L_0x00a4;
    L_0x009c:
        r0 = new com.whatsapp.HomeActivity$SoftwareAboutToExpireDialogFragment;	 Catch:{ IllegalArgumentException -> 0x0141 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0141 }
        r5.c(r0);	 Catch:{ IllegalArgumentException -> 0x0141 }
    L_0x00a4:
        r5.g();	 Catch:{ IllegalArgumentException -> 0x0143 }
        r0 = 2131427629; // 0x7f0b012d float:1.847688E38 double:1.053065168E-314;
        r0 = r5.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0143 }
        r0 = (com.whatsapp.HomeActivity.TabsPager) r0;	 Catch:{ IllegalArgumentException -> 0x0143 }
        r5.g = r0;	 Catch:{ IllegalArgumentException -> 0x0143 }
        r0 = new com.whatsapp.il;	 Catch:{ IllegalArgumentException -> 0x0143 }
        r2 = r5.getSupportFragmentManager();	 Catch:{ IllegalArgumentException -> 0x0143 }
        r0.<init>(r5, r2);	 Catch:{ IllegalArgumentException -> 0x0143 }
        r5.i = r0;	 Catch:{ IllegalArgumentException -> 0x0143 }
        r0 = r5.g;	 Catch:{ IllegalArgumentException -> 0x0143 }
        r2 = r5.i;	 Catch:{ IllegalArgumentException -> 0x0143 }
        r0.setAdapter(r2);	 Catch:{ IllegalArgumentException -> 0x0143 }
        r0 = r5.g;	 Catch:{ IllegalArgumentException -> 0x0143 }
        r2 = 3;
        r0.setOffscreenPageLimit(r2);	 Catch:{ IllegalArgumentException -> 0x0143 }
        r0 = r5.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x0143 }
        r5.p = r0;	 Catch:{ IllegalArgumentException -> 0x0143 }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0143 }
        r2 = 11;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x0143 }
        r2 = r5.getIntent();	 Catch:{ IllegalArgumentException -> 0x0143 }
        r2 = r2.getAction();	 Catch:{ IllegalArgumentException -> 0x0143 }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0143 }
        if (r0 == 0) goto L_0x00f0;
    L_0x00e4:
        r0 = r5.g;	 Catch:{ IllegalArgumentException -> 0x0145 }
        r2 = 0;
        r3 = 0;
        r0.setCurrentItem(r2, r3);	 Catch:{ IllegalArgumentException -> 0x0145 }
        r0 = 0;
        r5.j = r0;	 Catch:{ IllegalArgumentException -> 0x0145 }
        if (r1 == 0) goto L_0x00fa;
    L_0x00f0:
        r0 = r5.g;	 Catch:{ IllegalArgumentException -> 0x0145 }
        r1 = 1;
        r2 = 0;
        r0.setCurrentItem(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0145 }
        r0 = 1;
        r5.j = r0;	 Catch:{ IllegalArgumentException -> 0x0145 }
    L_0x00fa:
        r0 = 2131427853; // 0x7f0b020d float:1.8477334E38 double:1.053065279E-314;
        r0 = r5.findViewById(r0);
        r0 = (com.whatsapp.PagerSlidingTabStrip) r0;
        r1 = r5.g;
        r0.setViewPager(r1);
        r1 = r5.m;
        r0.setOnPageChangeListener(r1);
        r5.f();
        com.whatsapp.App.a(r5);
        com.whatsapp.App.a(r5);
        r0 = 2131427661; // 0x7f0b014d float:1.8476945E38 double:1.053065184E-314;
        r0 = r5.findViewById(r0);
        r5.k = r0;
        r0 = r5.k;
        r1 = new com.whatsapp.zs;
        r1.<init>(r5);
        r0.setOnClickListener(r1);
        r0 = 2131427662; // 0x7f0b014e float:1.8476947E38 double:1.0530651844E-314;
        r0 = r5.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r5.n = r0;
        r5.a();
        goto L_0x0056;
    L_0x0139:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013b }
    L_0x013b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013d }
    L_0x013d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013f }
    L_0x013f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0141 }
    L_0x0141:
        r0 = move-exception;
        throw r0;
    L_0x0143:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0145 }
    L_0x0145:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNewIntent(android.content.Intent r4) {
        /*
        r3_this = this;
        super.onNewIntent(r4);
        r0 = z;
        r1 = 9;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 8;
        r0 = r0[r1];
        r0 = r4.getStringExtra(r0);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x006a }
        if (r1 != 0) goto L_0x0035;
    L_0x001c:
        r1 = com.whatsapp.bd.f(r0);	 Catch:{ IllegalArgumentException -> 0x006c }
        if (r1 != 0) goto L_0x0029;
    L_0x0022:
        com.whatsapp.App.a(r0);	 Catch:{ IllegalArgumentException -> 0x006e }
        r1 = com.whatsapp.App.az;	 Catch:{ IllegalArgumentException -> 0x006e }
        if (r1 == 0) goto L_0x0035;
    L_0x0029:
        r1 = 1;
        com.whatsapp.App.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x006e }
        r1 = new com.whatsapp.kz;	 Catch:{ IllegalArgumentException -> 0x006e }
        r1.<init>(r3, r0);	 Catch:{ IllegalArgumentException -> 0x006e }
        com.whatsapp.util.br.a(r1);	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x0035:
        r0 = z;
        r1 = 6;
        r0 = r0[r1];
        r0 = r4.getStringExtra(r0);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r1 != 0) goto L_0x0050;
    L_0x0044:
        r1 = 1;
        com.whatsapp.App.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1 = new com.whatsapp.es;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1.<init>(r3, r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        com.whatsapp.util.br.a(r1);	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0050:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = r4.getAction();	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0 = r0.equals(r1);	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r0 == 0) goto L_0x0069;
    L_0x005f:
        r0 = r3.g;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r1 = 0;
        r2 = 0;
        r0.setCurrentItem(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0 = 0;
        r3.j = r0;	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x0069:
        return;
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;
    L_0x0072:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onNewIntent(android.content.Intent):void");
    }

    private void d() {
        this.k.setVisibility(0);
        this.n.setText("");
    }

    public HomeActivity() {
        this.m = new n5(this);
        this.l = new a39(this);
    }

    static Menu a(HomeActivity homeActivity) {
        return homeActivity.f;
    }

    public void onDestroy() {
        Log.i(z[10]);
        super.onDestroy();
        App.b((_2) this);
        App.b((asm) this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onPrepareDialog(int r4, android.app.Dialog r5) {
        /*
        r3_this = this;
        r1 = com.whatsapp.App.az;
        switch(r4) {
            case 117: goto L_0x0012;
            case 118: goto L_0x001e;
            case 119: goto L_0x002a;
            case 120: goto L_0x0005;
            case 121: goto L_0x0006;
            default: goto L_0x0005;
        };
    L_0x0005:
        return;
    L_0x0006:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.a();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0005;
    L_0x0012:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.b();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0005;
    L_0x001e:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.c();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0005;
    L_0x002a:
        r5 = (android.app.AlertDialog) r5;
        r0 = com.whatsapp.a_3.d();
        r5.setMessage(r0);
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onPrepareDialog(int, android.app.Dialog):void");
    }

    static int b(HomeActivity homeActivity, int i) {
        homeActivity.j = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r3) {
        /*
        r2_this = this;
        if (r3 != 0) goto L_0x000f;
    L_0x0002:
        r0 = r2.isFinishing();	 Catch:{ IllegalArgumentException -> 0x000d }
        if (r0 != 0) goto L_0x000c;
    L_0x0008:
        r0 = 0;
        r2.showDialog(r0);	 Catch:{ IllegalArgumentException -> 0x000d }
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = com.whatsapp.App.P;	 Catch:{ IllegalArgumentException -> 0x003d }
        r0 = r0.d();	 Catch:{ IllegalArgumentException -> 0x003d }
        r0 = r0.a();	 Catch:{ IllegalArgumentException -> 0x003d }
        r0 = r0.exists();	 Catch:{ IllegalArgumentException -> 0x003d }
        if (r0 != 0) goto L_0x000c;
    L_0x001f:
        r0 = com.whatsapp.App.U;	 Catch:{ IllegalArgumentException -> 0x003f }
        if (r0 == 0) goto L_0x000c;
    L_0x0023:
        r0 = com.whatsapp.ProfilePhotoReminder.m;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r0 != 0) goto L_0x000c;
    L_0x0027:
        r0 = com.whatsapp.App.a();	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r0 == 0) goto L_0x000c;
    L_0x002d:
        r0 = 1;
        com.whatsapp.ProfilePhotoReminder.m = r0;	 Catch:{ IllegalArgumentException -> 0x003b }
        r0 = new android.content.Intent;	 Catch:{ IllegalArgumentException -> 0x003b }
        r1 = com.whatsapp.ProfilePhotoReminder.class;
        r0.<init>(r2, r1);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2.startActivity(r0);	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x000c;
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.b(boolean):void");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case R.id.menuitem_debug:
                    finish();
                    startActivity(new Intent(this, Advanced.class));
                    return true;
                case R.id.menuitem_search:
                    return true;
                case R.id.menuitem_settings:
                    startActivity(new Intent(this, Settings.class));
                    return true;
                case R.id.menuitem_status:
                    startActivity(new Intent(this, SetStatus.class));
                    return true;
                default:
                    return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int b(HomeActivity homeActivity) {
        return homeActivity.j;
    }

    private void f() {
        int i;
        int i2 = App.az;
        Iterator it = v.e().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            try {
                i = App.P.a((String) it.next()).a > 0 ? i3 + 1 : i3;
                if (i2 != 0) {
                    break;
                }
                i3 = i;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        i = i3;
        il.a(this.i, 1).b = i;
        il.a(this.i, 0).b = a5n.c().a().size();
        h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r6_this = this;
        r0 = com.whatsapp.App.az;
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0041 }
        r2 = 19;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0041 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalArgumentException -> 0x0041 }
        super.onResume();	 Catch:{ IllegalArgumentException -> 0x0041 }
        r1 = com.whatsapp.App.an;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r1 == 0) goto L_0x0021;
    L_0x0012:
        r1 = com.whatsapp.App.aJ;	 Catch:{ IllegalArgumentException -> 0x0043 }
        r1 = r1.e();	 Catch:{ IllegalArgumentException -> 0x0043 }
        if (r1 == 0) goto L_0x0021;
    L_0x001a:
        r1 = com.whatsapp.App.e(r6);	 Catch:{ IllegalArgumentException -> 0x0043 }
        r2 = 3;
        if (r1 == r2) goto L_0x0045;
    L_0x0021:
        r0 = z;
        r1 = 17;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 18;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r6.finish();
    L_0x0040:
        return;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        com.whatsapp.notification.t.b();	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1 = com.whatsapp.App.V;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1.stop();	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1 = com.whatsapp.App.al();	 Catch:{ IllegalArgumentException -> 0x00ab }
        if (r1 == 0) goto L_0x0058;
    L_0x0053:
        r6.e();	 Catch:{ IllegalArgumentException -> 0x00ad }
        if (r0 == 0) goto L_0x0082;
    L_0x0058:
        r1 = com.whatsapp.App.X;	 Catch:{ IllegalArgumentException -> 0x00af }
        if (r1 == 0) goto L_0x0066;
    L_0x005c:
        r1 = new com.whatsapp.DialogToastFragmentActivity$ClockWrongDialogFragment;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r6.b(r1);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        if (r0 == 0) goto L_0x0082;
    L_0x0066:
        r1 = com.whatsapp.App.T;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        if (r1 == 0) goto L_0x0074;
    L_0x006a:
        r1 = new com.whatsapp.DialogToastFragmentActivity$SoftwareExpiredDialogFragment;	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r6.b(r1);	 Catch:{ IllegalArgumentException -> 0x00b5 }
        if (r0 == 0) goto L_0x0082;
    L_0x0074:
        r1 = com.whatsapp.App.aQ();	 Catch:{ IllegalArgumentException -> 0x00b7 }
        if (r1 == 0) goto L_0x0082;
    L_0x007a:
        r1 = new com.whatsapp.HomeActivity$SoftwareAboutToExpireDialogFragment;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r6.c(r1);	 Catch:{ IllegalArgumentException -> 0x00b7 }
    L_0x0082:
        r1 = r6.j;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        if (r1 != 0) goto L_0x0096;
    L_0x0086:
        r1 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r1 = r1.U();	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r2 = new com.whatsapp.hb;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r2.<init>(r6);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r1.postDelayed(r2, r4);	 Catch:{ IllegalArgumentException -> 0x00b9 }
    L_0x0096:
        r1 = com.whatsapp.Voip.f();	 Catch:{ IllegalArgumentException -> 0x00bb }
        if (r1 == 0) goto L_0x00a1;
    L_0x009c:
        r6.d();	 Catch:{ IllegalArgumentException -> 0x00a9 }
        if (r0 == 0) goto L_0x0040;
    L_0x00a1:
        r0 = r6.k;	 Catch:{ IllegalArgumentException -> 0x00a9 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x00a9 }
        goto L_0x0040;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        throw r0;
    L_0x00b9:
        r0 = move-exception;
        throw r0;
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a9 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onResume():void");
    }

    public void c(b bVar) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(com.actionbarsherlock.view.Menu r8) {
        /*
        r7_this = this;
        r6 = 3;
        r5 = 1;
        r0 = com.whatsapp.App.az;
        super.onPrepareOptionsMenu(r8);	 Catch:{ IllegalArgumentException -> 0x0138 }
        r7.f = r8;	 Catch:{ IllegalArgumentException -> 0x0138 }
        r1 = r8.size();	 Catch:{ IllegalArgumentException -> 0x0138 }
        if (r1 != 0) goto L_0x0132;
    L_0x000f:
        r1 = new com.whatsapp.er;	 Catch:{ IllegalArgumentException -> 0x013a }
        r1.<init>(r7);	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = r7.a(r8, r1);	 Catch:{ IllegalArgumentException -> 0x013a }
        r7.o = r1;	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = 1;
        r2 = 2131427347; // 0x7f0b0013 float:1.8476308E38 double:1.053065029E-314;
        r3 = 0;
        r4 = 2131624515; // 0x7f0e0243 float:1.8876212E38 double:1.0531624427E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 2130838798; // 0x7f02050e float:1.7282588E38 double:1.052774247E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r1 = r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r7.h = r1;	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = r7.h;	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 2;
        r1.setShowAsAction(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = 1;
        r2 = 2131427334; // 0x7f0b0006 float:1.8476281E38 double:1.0530650223E-314;
        r3 = 0;
        r4 = 2131624082; // 0x7f0e0092 float:1.8875334E38 double:1.053162229E-314;
        r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = 2;
        r2 = 2131427349; // 0x7f0b0015 float:1.8476312E38 double:1.0530650297E-314;
        r3 = 0;
        r4 = 2131624514; // 0x7f0e0242 float:1.887621E38 double:1.053162442E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 2130838784; // 0x7f020500 float:1.728256E38 double:1.05277424E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r1 = r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 2;
        r1.setShowAsAction(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = 2;
        r2 = 2131427350; // 0x7f0b0016 float:1.8476314E38 double:1.05306503E-314;
        r3 = 0;
        r4 = 2131624510; // 0x7f0e023e float:1.8876202E38 double:1.05316244E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 2130838844; // 0x7f02053c float:1.7282682E38 double:1.0527742696E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = 2;
        r2 = 2131427346; // 0x7f0b0012 float:1.8476306E38 double:1.0530650283E-314;
        r3 = 0;
        r4 = 2131624511; // 0x7f0e023f float:1.8876204E38 double:1.0531624407E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 2130838835; // 0x7f020533 float:1.7282664E38 double:1.052774265E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 98;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r1 = com.whatsapp.App.N();	 Catch:{ IllegalArgumentException -> 0x013a }
        if (r1 == 0) goto L_0x00b1;
    L_0x0099:
        r1 = 2;
        r2 = 2131427352; // 0x7f0b0018 float:1.8476318E38 double:1.053065031E-314;
        r3 = 0;
        r4 = 2131624521; // 0x7f0e0249 float:1.8876224E38 double:1.0531624457E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 2130838862; // 0x7f02054e float:1.7282718E38 double:1.0527742785E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
        r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x013a }
    L_0x00b1:
        r1 = 3;
        r2 = 2131427348; // 0x7f0b0014 float:1.847631E38 double:1.0530650293E-314;
        r3 = 0;
        r4 = 2131624516; // 0x7f0e0244 float:1.8876214E38 double:1.053162443E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013c }
        r2 = 2130838776; // 0x7f0204f8 float:1.7282544E38 double:1.052774236E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r1 = r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
        r2 = 2;
        r1.setShowAsAction(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
        r1 = 3;
        r2 = 2131427351; // 0x7f0b0017 float:1.8476316E38 double:1.0530650307E-314;
        r3 = 0;
        r4 = 2131624517; // 0x7f0e0245 float:1.8876216E38 double:1.0531624437E-314;
        r4 = r7.getString(r4);	 Catch:{ IllegalArgumentException -> 0x013c }
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013c }
        r2 = 2130838854; // 0x7f020546 float:1.7282702E38 double:1.0527742746E-314;
        r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
        r1 = 4;
        r2 = 2131427355; // 0x7f0b001b float:1.8476324E38 double:1.0530650327E-314;
        r3 = 0;
        r4 = 2131624520; // 0x7f0e0248 float:1.8876222E38 double:1.053162445E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013c }
        r2 = 2130838861; // 0x7f02054d float:1.7282716E38 double:1.052774278E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
        r1 = 4;
        r2 = 2131427354; // 0x7f0b001a float:1.8476322E38 double:1.053065032E-314;
        r3 = 0;
        r4 = 2131624519; // 0x7f0e0247 float:1.887622E38 double:1.0531624447E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013c }
        r2 = 2130838858; // 0x7f02054a float:1.728271E38 double:1.0527742766E-314;
        r1 = r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
        r2 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r1.setAlphabeticShortcut(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
        r1 = com.whatsapp.App.aa;	 Catch:{ IllegalArgumentException -> 0x013c }
        if (r1 != r6) goto L_0x0132;
    L_0x0118:
        r1 = 4;
        r2 = 2131427345; // 0x7f0b0011 float:1.8476304E38 double:1.053065028E-314;
        r3 = 0;
        r4 = 2131624509; // 0x7f0e023d float:1.88762E38 double:1.0531624397E-314;
        r1 = r8.add(r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x013c }
        r2 = r7.getResources();	 Catch:{ IllegalArgumentException -> 0x013c }
        r3 = 2130838955; // 0x7f0205ab float:1.7282907E38 double:1.0527743245E-314;
        r2 = r2.getDrawable(r3);	 Catch:{ IllegalArgumentException -> 0x013c }
        r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x013c }
    L_0x0132:
        r1 = r7.j;	 Catch:{ IllegalArgumentException -> 0x0172 }
        switch(r1) {
            case 0: goto L_0x013e;
            case 1: goto L_0x014f;
            case 2: goto L_0x0160;
            default: goto L_0x0137;
        };
    L_0x0137:
        return r5;
    L_0x0138:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013a }
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r0 = move-exception;
        throw r0;
    L_0x013e:
        r1 = 1;
        r2 = 1;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0174 }
        r1 = 2;
        r2 = 0;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0174 }
        r1 = 3;
        r2 = 0;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0174 }
        if (r0 == 0) goto L_0x0137;
    L_0x014f:
        r1 = 1;
        r2 = 0;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0170 }
        r1 = 2;
        r2 = 1;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0170 }
        r1 = 3;
        r2 = 0;
        r8.setGroupVisible(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0170 }
        if (r0 == 0) goto L_0x0137;
    L_0x0160:
        r0 = 1;
        r1 = 0;
        r8.setGroupVisible(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0170 }
        r0 = 2;
        r1 = 0;
        r8.setGroupVisible(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0170 }
        r0 = 3;
        r1 = 1;
        r8.setGroupVisible(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0170 }
        goto L_0x0137;
    L_0x0170:
        r0 = move-exception;
        throw r0;
    L_0x0172:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0174 }
    L_0x0174:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0170 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.onPrepareOptionsMenu(com.actionbarsherlock.view.Menu):boolean");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    private MenuItem a(Menu menu, aq aqVar) {
        View a = a_7.a((Context) this, getSherlock(), aqVar);
        MenuItem icon = menu.add(0, (int) R.id.menuitem_search, 0, (int) R.string.search).setActionView(a).setIcon((int) R.drawable.ic_action_search);
        icon.setShowAsAction(10);
        icon.setOnActionExpandListener(new ha(this, a));
        return icon;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
        r5_this = this;
        r0 = 0;
        r1 = com.whatsapp.App.az;
    L_0x0003:
        r2 = 3;
        if (r0 >= r2) goto L_0x002e;
    L_0x0006:
        r2 = r5.i;
        r2 = com.whatsapp.il.a(r2, r0);
        r3 = r2.b;	 Catch:{ IllegalArgumentException -> 0x002f }
        if (r3 <= 0) goto L_0x0023;
    L_0x0010:
        r3 = r2.d;	 Catch:{ IllegalArgumentException -> 0x0031 }
        r4 = 0;
        r3.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0031 }
        r3 = r2.d;	 Catch:{ IllegalArgumentException -> 0x0031 }
        r4 = r2.b;	 Catch:{ IllegalArgumentException -> 0x0031 }
        r4 = java.lang.Integer.toString(r4);	 Catch:{ IllegalArgumentException -> 0x0031 }
        r3.setText(r4);	 Catch:{ IllegalArgumentException -> 0x0031 }
        if (r1 == 0) goto L_0x002a;
    L_0x0023:
        r2 = r2.d;	 Catch:{ IllegalArgumentException -> 0x0031 }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0031 }
    L_0x002a:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0003;
    L_0x002e:
        return;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.HomeActivity.h():void");
    }

    private void c(DialogFragment dialogFragment) {
        try {
            if (getSupportFragmentManager().findFragmentByTag(dialogFragment.getClass().getName()) == null) {
                dialogFragment.show(getSupportFragmentManager(), dialogFragment.getClass().getName());
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private bt a(int i) {
        int i2 = App.az;
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                if (i == 1) {
                    try {
                        if (fragment instanceof ConversationsFragment) {
                            return (bt) fragment;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                if (i == 0) {
                    try {
                        if (fragment instanceof CallsFragment) {
                            return (bt) fragment;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                if (i == 2) {
                    try {
                        if (fragment instanceof ContactsFragment) {
                            return (bt) fragment;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
                if (i2 != 0) {
                    break;
                }
            }
        }
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
