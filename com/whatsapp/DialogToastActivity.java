package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.Spanned;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.View;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class DialogToastActivity extends SherlockActivity implements ho {
    public static boolean i;
    private static final String[] z;
    private int b;
    private int c;
    private int d;
    private String e;
    private boolean f;
    private b9 g;
    private asc h;

    static {
        String[] strArr = new String[12];
        String str = "R\"y\u000f\fQ?w\u0002\u0010B*{\u0017\n@\"l\u001aLY%z\u0002\u0000];j\u0006\u0010E.|L\u0002U?q\u0015\nB28\r\f\u0016*{\u0017\n@.";
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
                        i3 = 54;
                        break;
                    case ay.f /*1*/:
                        i3 = 75;
                        break;
                    case ay.n /*2*/:
                        i3 = 24;
                        break;
                    case ay.p /*3*/:
                        i3 = 99;
                        break;
                    default:
                        i3 = 99;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "R\"y\u000f\fQdt\f\u0004_%5\u0005\u0002_'}\u0007";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "R\"y\u000f\fQd{\u000f\fU 5\u0014\u0011Y%\u007f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "[\u001bj\f\u0004D.k\u00100F\"v\r\u0006D\u001fq\u0017\u000fS\u0002|";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "[\u001bj\f\u0004D.k\u00100F\"v\r\u0006D\u0006}\u0010\u0010W,}*\u0007";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "[\u000fq\u0002\u000fY,L\f\u0002E?K\u0017\u0011_%\u007f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "[\u000fq\u0002\u000fY,L\f\u0002E?K\u0017\u0011_%\u007f*\u0007";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "[\u000fq\u0002\u000fY,L\f\u0002E?K\u0017\u0011_%\u007f";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "[\u001bj\f\u0004D.k\u00100F\"v\r\u0006D\u001fq\u0017\u000fS\u0002|";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "[\u000fq\u0002\u000fY,L\f\u0002E?K\u0017\u0011_%\u007f*\u0007";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "[\u001bj\f\u0004D.k\u00100F\"v\r\u0006D\u0006}\u0010\u0010W,}*\u0007";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "R\"y\u000f\fQdk\f\u0005B<y\u0011\u0006\u001b.`\u0013\nD.|";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void c() {
        removeDialog(501);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 110:
                Log.w(z[2]);
                return new Builder(this).setMessage(R.string.login_failure_password).setCancelable(false).setNeutralButton(R.string.overlay_reregister, new r0(this)).create();
            case 113:
                Log.w(z[3]);
                return a_3.a(this);
            case 114:
                Log.w(z[1]);
                return a_3.e(this);
            case 500:
                try {
                    return new Builder(this).setMessage(this.e).setNeutralButton(R.string.ok, new bq(this)).create();
                } catch (NullPointerException e) {
                    throw e;
                }
            case 501:
                Dialog progressDialog = new ProgressDialog(this);
                try {
                    if (this.d != 0) {
                        progressDialog.setTitle(this.d);
                    }
                    progressDialog.setMessage(getString(this.b));
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

    public void b(int i) {
        a(0, i);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    finish();
                    return true;
                default:
                    return super.onOptionsItemSelected(menuItem);
            }
        } catch (NullPointerException e) {
            throw e;
        }
        throw e;
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
        r1 = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastActivity.onBackPressed():void");
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
            this.d = i;
            this.b = i2;
            if (!isFinishing()) {
                showDialog(501);
            }
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

    static asc a(DialogToastActivity dialogToastActivity) {
        return dialogToastActivity.h;
    }

    public void setContentView(int i) {
        setContentView(b7.a(getLayoutInflater(), i, null, false));
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Throwable e) {
            Log.b(e);
        }
        try {
            this.e = bundle.getString(z[6]);
            this.c = bundle.getInt(z[7], 0);
            if (this.c != 0) {
                this.e = getString(this.c);
            }
            this.d = bundle.getInt(z[4], 0);
            this.b = bundle.getInt(z[5], 0);
        } catch (NullPointerException e2) {
            throw e2;
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

    protected void onPause() {
        try {
            App.a((ho) this);
            super.onPause();
            if (this.g.hasMessages(0)) {
                this.g.removeMessages(0);
            }
            App.r();
            this.f = false;
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
        r1 = r2.e;	 Catch:{ NullPointerException -> 0x0014 }
        r0.setMessage(r1);	 Catch:{ NullPointerException -> 0x0014 }
        r0 = com.whatsapp.App.az;	 Catch:{ NullPointerException -> 0x0014 }
        if (r0 == 0) goto L_0x0006;
    L_0x0013:
        goto L_0x0003;
    L_0x0014:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastActivity.onPrepareDialog(int, android.app.Dialog):void");
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
        bundle.putCharSequence(z[8], this.e);
        bundle.putInt(z[10], this.c);
        bundle.putInt(z[9], this.d);
        bundle.putInt(z[11], this.b);
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

    public DialogToastActivity() {
        this.f = true;
    }

    public void a(int i, asc com_whatsapp_asc) {
        a(com_whatsapp_asc, getString(i), i);
    }

    public void a(int i) {
        a(null, getString(i), i);
    }

    private void a(asc com_whatsapp_asc, String str, int i) {
        try {
            this.h = com_whatsapp_asc;
            this.e = str;
            this.c = i;
            if (!isFinishing()) {
                showDialog(500);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void a(String str, asc com_whatsapp_asc) {
        a(com_whatsapp_asc, str, 0);
    }

    public void f(String str) {
        a(null, str, 0);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = new b9();
    }

    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        a(menuItem);
        return super.onMenuItemSelected(i, menuItem);
    }

    public static void a(android.view.MenuItem menuItem) {
        try {
            if (menuItem != null) {
                try {
                    if (menuItem.getItemId() != 16908332) {
                        return;
                    }
                    if (menuItem.getTitleCondensed() instanceof Spanned) {
                        menuItem.setTitleCondensed(menuItem.getTitle().toString());
                    }
                } catch (NullPointerException e) {
                    throw e;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
        }
    }

    protected void onResume() {
        App.b((ho) this);
        super.onResume();
        this.g.sendEmptyMessageDelayed(0, 3000);
        this.f = true;
    }
}
