package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class DialogToastPreferenceActivity extends SherlockPreferenceActivity implements ho {
    private static final String[] z;
    private int a;
    private int b;
    private boolean c;
    private int d;
    private asc e;
    private String f;
    private b9 g;

    static {
        String[] strArr = new String[10];
        String str = "`+z~=})}%&v={g1<9|e:tc}~5g+.";
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
                        i3 = 19;
                        break;
                    case ay.f /*1*/:
                        i3 = 78;
                        break;
                    case ay.n /*2*/:
                        i3 = 14;
                        break;
                    case ay.p /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 84;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "~\ngk8|)Ze5`:]~&z iC0";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "~\ngk8|)Ze5`:]~&z i";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "~\u001e|e3a+}y\u0007c'`d1a\u001ag~8v\u0007j";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "~\u001e|e3a+}y\u0007c'`d1a\u001ag~8v\u0007j";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "~\ngk8|)Ze5`:]~&z iC0";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "~\ngk8|)Ze5`:]~&z i";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "~\u001e|e3a+}y\u0007c'`d1a\u0003ky'r)kC0";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "w'of;t:ak'g:|o2v<kd7v/m~=e'zs{| lk7x>|o'`+j%5p:g|=g7.d;3/m~=e+";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "~\u001e|e3a+}y\u0007c'`d1a\u0003ky'r)kC0";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public DialogToastPreferenceActivity() {
        this.c = true;
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 500:
                try {
                    return new Builder(this).setMessage(this.f).setNeutralButton(R.string.ok, new ang(this)).create();
                } catch (NullPointerException e) {
                    throw e;
                }
            case 501:
                Dialog progressDialog = new ProgressDialog(this);
                try {
                    if (this.a != 0) {
                        progressDialog.setTitle(this.a);
                    }
                    progressDialog.setMessage(getString(this.d));
                    progressDialog.setIndeterminate(true);
                    progressDialog.setCancelable(false);
                    return progressDialog;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            default:
                return super.onCreateDialog(i);
        }
    }

    public void a(int i, int i2) {
        try {
            this.a = i;
            this.d = i2;
            if (!isFinishing()) {
                showDialog(501);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean e() {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
        r2_this = this;
        r0 = r2.c;	 Catch:{ NullPointerException -> 0x001b }
        if (r0 != 0) goto L_0x000a;
    L_0x0004:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x001d }
        r1 = 11;
        if (r0 >= r1) goto L_0x0011;
    L_0x000a:
        super.onBackPressed();	 Catch:{ NullPointerException -> 0x001f }
        r0 = com.whatsapp.App.az;	 Catch:{ NullPointerException -> 0x001f }
        if (r0 == 0) goto L_0x001a;
    L_0x0011:
        r0 = z;	 Catch:{ NullPointerException -> 0x001f }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x001f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x001f }
    L_0x001a:
        return;
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastPreferenceActivity.onBackPressed():void");
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = new b9();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (VERSION.SDK_INT >= 11) {
            View findViewById = findViewById(16908298);
            if (findViewById != null) {
                int paddingLeft = findViewById.getPaddingLeft();
                int paddingLeft2 = findViewById.getPaddingLeft();
                ViewParent parent = findViewById.getParent();
                if (parent instanceof View) {
                    View view = (View) parent;
                    paddingLeft += view.getPaddingLeft();
                    paddingLeft2 += view.getPaddingRight();
                    view.setPadding(0, 0, 0, 0);
                }
                findViewById.setPadding(paddingLeft, 0, paddingLeft2, 0);
                findViewById.setScrollBarStyle(33554432);
            }
        }
    }

    public boolean a() {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onPrepareDialog(int r3, android.app.Dialog r4) {
        /*
        r2_this = this;
        switch(r3) {
            case 500: goto L_0x0007;
            default: goto L_0x0003;
        };
    L_0x0003:
        super.onPrepareDialog(r3, r4);	 Catch:{ NullPointerException -> 0x0014 }
    L_0x0006:
        return;
    L_0x0007:
        r0 = r4;
        r0 = (android.app.AlertDialog) r0;
        r1 = r2.f;	 Catch:{ NullPointerException -> 0x0014 }
        r0.setMessage(r1);	 Catch:{ NullPointerException -> 0x0014 }
        r0 = com.whatsapp.App.az;	 Catch:{ NullPointerException -> 0x0014 }
        if (r0 == 0) goto L_0x0006;
    L_0x0013:
        goto L_0x0003;
    L_0x0014:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastPreferenceActivity.onPrepareDialog(int, android.app.Dialog):void");
    }

    public void f(String str) {
        try {
            this.e = null;
            this.f = str;
            if (!isFinishing()) {
                showDialog(500);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    protected void onResume() {
        App.b((ho) this);
        super.onResume();
        this.g.sendEmptyMessageDelayed(0, 3000);
        this.c = true;
        if (App.e((Context) this) != 3) {
            Log.i(z[0] + App.e((Context) this));
            startActivity(new Intent(this, Main.class));
            finish();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (App.G == 3) {
                switch (i) {
                    case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                        g.c(this).show();
                        return true;
                    case vk.SherlockTheme_textAppearanceSmall /*25*/:
                        g.b();
                        return true;
                    case 84:
                        g.a((Activity) this, false);
                        return true;
                }
            }
            return super.onKeyDown(i, keyEvent);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(z[3], this.f);
        bundle.putInt(z[2], this.b);
        bundle.putInt(z[4], this.a);
        bundle.putInt(z[1], this.d);
    }

    public void c() {
        removeDialog(501);
    }

    static asc a(DialogToastPreferenceActivity dialogToastPreferenceActivity) {
        return dialogToastPreferenceActivity.e;
    }

    protected void onPause() {
        try {
            App.a((ho) this);
            super.onPause();
            if (this.g.hasMessages(0)) {
                this.g.removeMessages(0);
            }
            App.r();
            this.c = false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Throwable e) {
            Log.b(e);
        }
        try {
            this.f = bundle.getString(z[7]);
            this.b = bundle.getInt(z[6], 0);
            if (this.b != 0) {
                this.f = getString(this.b);
            }
            this.a = bundle.getInt(z[5], 0);
            this.d = bundle.getInt(z[8], 0);
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        try {
            if (App.G == 3) {
                g.b((Activity) this);
            }
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    finish();
                    return true;
                default:
                    return false;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean d() {
        return false;
    }

    public void a(int i) {
        try {
            this.e = null;
            this.f = getString(i);
            if (!isFinishing()) {
                showDialog(500);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (App.G == 3) {
                g.b((Activity) this);
            }
            return super.onCreateOptionsMenu(menu);
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
