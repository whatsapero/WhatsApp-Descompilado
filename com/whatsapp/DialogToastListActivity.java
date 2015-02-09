package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.util.Log;
import com.whatsapp.util.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class DialogToastListActivity extends SherlockListActivity implements ho {
    private static final String[] z;
    private asc b;
    private b9 c;
    private int d;
    private int e;
    private boolean f;
    private String g;
    private int h;

    static {
        String[] strArr = new String[12];
        String str = "\u0013X\u0001\u0003?\u0010\u001e\u0013\u00006\u0003F\u0001\u001d5ZT\u0018\u001f9\u0005T\u0004";
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
                        i3 = 119;
                        break;
                    case ay.f /*1*/:
                        i3 = 49;
                        break;
                    case ay.n /*2*/:
                        i3 = 96;
                        break;
                    case ay.p /*3*/:
                        i3 = 111;
                        break;
                    default:
                        i3 = 80;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0013X\u0001\u0003?\u0010\u001e\u0003\u0003?\u0014ZM\u0018\"\u0018_\u0007";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0013X\u0001\u0003?\u0010E\u000f\u000e#\u0003]\t\u001c$\u0016R\u0014\u0006&\u001eE\u0019@?\u0019S\u0001\f;\u0007C\u0005\u001c#\u0012UO\u000e3\u0003X\u0016\u0006$\u000e\u0011\u000e\u0000p\u0016R\u0014\u0006&\u0012";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u001au\t\u000e<\u0018V4\u00001\u0004E3\u001b\"\u001e_\u0007";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001aa\u0012\u00007\u0005T\u0013\u001c\u0003\u0007X\u000e\u00015\u0005e\t\u001b<\u0012x\u0004";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001au\t\u000e<\u0018V4\u00001\u0004E3\u001b\"\u001e_\u0007&4";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001aa\u0012\u00007\u0005T\u0013\u001c\u0003\u0007X\u000e\u00015\u0005|\u0005\u001c#\u0016V\u0005&4";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001au\t\u000e<\u0018V4\u00001\u0004E3\u001b\"\u001e_\u0007&4";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001aa\u0012\u00007\u0005T\u0013\u001c\u0003\u0007X\u000e\u00015\u0005|\u0005\u001c#\u0016V\u0005&4";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001aa\u0012\u00007\u0005T\u0013\u001c\u0003\u0007X\u000e\u00015\u0005e\t\u001b<\u0012x\u0004";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001au\t\u000e<\u0018V4\u00001\u0004E3\u001b\"\u001e_\u0007";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0013X\u0001\u0003?\u0010\u001e\f\u00007\u001e_M\t1\u001e]\u0005\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
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

    public boolean a() {
        try {
            if (isFinishing()) {
                return false;
            }
            showDialog(114);
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static asc a(DialogToastListActivity dialogToastListActivity) {
        return dialogToastListActivity.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
        r2_this = this;
        r0 = r2.f;	 Catch:{ NullPointerException -> 0x001a }
        if (r0 != 0) goto L_0x000a;
    L_0x0004:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NullPointerException -> 0x001c }
        r1 = 11;
        if (r0 >= r1) goto L_0x0011;
    L_0x000a:
        super.onBackPressed();	 Catch:{ NullPointerException -> 0x001e }
        r0 = com.whatsapp.App.az;	 Catch:{ NullPointerException -> 0x001e }
        if (r0 == 0) goto L_0x0019;
    L_0x0011:
        r0 = z;	 Catch:{ NullPointerException -> 0x001e }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x001e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x001e }
    L_0x0019:
        return;
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastListActivity.onBackPressed():void");
    }

    public void setContentView(int i) {
        setContentView(b7.a(getLayoutInflater(), i, null, false));
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

    public void a(int i, int i2) {
        try {
            this.h = i;
            this.e = i2;
            if (!isFinishing()) {
                showDialog(501);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void c() {
        removeDialog(501);
    }

    public void a(int i, asc com_whatsapp_asc) {
        try {
            this.b = com_whatsapp_asc;
            this.g = getString(i);
            if (!isFinishing()) {
                showDialog(500);
            }
        } catch (NullPointerException e) {
            throw e;
        }
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
        r1 = r2.g;	 Catch:{ NullPointerException -> 0x0014 }
        r0.setMessage(r1);	 Catch:{ NullPointerException -> 0x0014 }
        r0 = com.whatsapp.App.az;	 Catch:{ NullPointerException -> 0x0014 }
        if (r0 == 0) goto L_0x0006;
    L_0x0013:
        goto L_0x0003;
    L_0x0014:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastListActivity.onPrepareDialog(int, android.app.Dialog):void");
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        DialogToastActivity.a(menuItem);
        return super.onMenuItemSelected(i, menuItem);
    }

    public boolean d() {
        try {
            if (isFinishing()) {
                return false;
            }
            showDialog(113);
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(z[4], this.g);
        bundle.putInt(z[6], this.d);
        bundle.putInt(z[5], this.h);
        bundle.putInt(z[7], this.e);
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuItem) {
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

    public DialogToastListActivity() {
        this.f = true;
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 110:
                Log.w(z[1]);
                return new Builder(this).setMessage(R.string.login_failure_password).setCancelable(false).setNeutralButton(R.string.overlay_reregister, new a5v(this)).create();
            case 113:
                Log.w(z[2]);
                return a_3.a(this);
            case 114:
                Log.w(z[0]);
                return a_3.e(this);
            case 500:
                try {
                    return new Builder(this).setMessage(this.g).setNeutralButton(R.string.ok, new alf(this)).create();
                } catch (NullPointerException e) {
                    throw e;
                }
            case 501:
                Dialog progressDialog = new ProgressDialog(this);
                try {
                    if (this.h != 0) {
                        progressDialog.setTitle(this.h);
                    }
                    progressDialog.setMessage(getString(this.e));
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

    public void onPause() {
        try {
            App.a((ho) this);
            super.onPause();
            if (this.c.hasMessages(0)) {
                this.c.removeMessages(0);
            }
            App.r();
            this.f = false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void a(int i) {
        try {
            this.b = null;
            this.g = getString(i);
            if (!isFinishing()) {
                showDialog(500);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void f(String str) {
        try {
            this.b = null;
            this.g = str;
            if (!isFinishing()) {
                showDialog(500);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = new b9();
    }

    public void onResume() {
        App.b((ho) this);
        super.onResume();
        this.c.sendEmptyMessageDelayed(0, 3000);
        this.f = true;
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Throwable e) {
            Log.b(e);
        }
        try {
            this.g = bundle.getString(z[11]);
            this.d = bundle.getInt(z[8], 0);
            if (this.d != 0) {
                this.g = getString(this.d);
            }
            this.h = bundle.getInt(z[10], 0);
            this.e = bundle.getInt(z[9], 0);
        } catch (NullPointerException e2) {
            throw e2;
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

    public boolean e() {
        try {
            if (isFinishing()) {
                return false;
            }
            showDialog(110);
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
