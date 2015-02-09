package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcelable;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ViewProfilePhoto extends DialogToastActivity implements anq {
    private static final String[] z;
    private m8 j;
    private Handler k;

    public class SavePhoto extends Activity {
        private static final String[] z;

        static {
            String[] strArr = new String[5];
            String str = "~`*\u001d";
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
                            i3 = 16;
                            break;
                        case ay.f /*1*/:
                            i3 = 1;
                            break;
                        case ay.n /*2*/:
                            i3 = 71;
                            break;
                        case ay.p /*3*/:
                            i3 = 120;
                            break;
                        default:
                            i3 = 82;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = ">k7\u001f";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "ix>\u0001\u001f]e#'\u001aXl*\u000b!";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "K>}$}:#{F.M";
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "qo#\n=yei\u0011<dd)\f|uy3\n3>R\u0013*\u0017QL";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            Uri uri = (Uri) getIntent().getParcelableExtra(z[1]);
            File file = new File(yf.c(), getIntent().getStringExtra(z[0]).replaceAll(z[4], "") + " " + new SimpleDateFormat(z[3], Locale.US).format(new Date()) + z[2]);
            try {
                f.a(new File(uri.getPath()), file);
                f.a((Context) this, Uri.fromFile(file));
                App.b(getApplicationContext(), (int) R.string.photo_saved_to_gallery, 0);
            } catch (FileNotFoundException e) {
                App.b(getApplicationContext(), (int) R.string.photo_faled_save_to_gallery, 1);
            } catch (IOException e2) {
                App.b(getApplicationContext(), (int) R.string.photo_faled_save_to_gallery, 1);
            }
            finish();
        }
    }

    static {
        String[] strArr = new String[21];
        String str = " tZ=a*";
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
                        i3 = 77;
                        break;
                    case ay.f /*1*/:
                        i3 = 17;
                        break;
                    case ay.n /*2*/:
                        i3 = 116;
                        break;
                    case ay.p /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 17;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ",\u007f\u0010%~$uZ>\u007f9t\u001a#?(i\u0000%pcX:\u001eE\u0004P8\bX\u0003E1\u0019E\u001e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = ",\u007f\u0010%~$uZ>\u007f9t\u001a#?(i\u0000%pcB \u0005T\f\\";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ".~\u0019yf%p\u0000$p=aZ>\u007f9t\u001a#?,r\u0000>~#?'\u0016G\bN$\u001f^\u0019^";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "#p\u00192";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ",\u007f\u0010%~$uZ>\u007f9t\u001a#?,r\u0000>~#?'\u0012_\t";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ",\u007f\u0010%~$uZ>\u007f9t\u001a#?(i\u0000%pcB \u0005T\f\\";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = " ~\u00019e(u+%~";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = " ~\u00019e(u";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ";x\u0011 a?~\u0012>}(a\u001c8e\">\u001b9a?~\u0012>}(a\u001c8e\"r\u001c6\u007f*t\u0010wa%~\u00008N+d\u0018;N$uN";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "$b+%t>t\u0000";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ";x\u0011 a?~\u0012>}(a\u001c8e\">\u00102b9c\u001b.";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = " ~\u00019e(u+%~";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ".~\u001a!t?b\u0015#x\"\u007f\u0007ws\"d\u001a4tme\u001bw|,x\u001a";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = " ~\u00019e(u";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "'x\u0010";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    str = ";x\u0011 a?~\u0012>}(a\u001c8e\">\u0017%t,e\u0011w";
                    obj = 16;
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    strArr2 = strArr3;
                    str = ";x\u0011 a?~\u0012>}(a\u001c8e\">\u0017%t,e\u0011";
                    obj = 17;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "ma\u001c8e\"N\u0012\"}!N\u001d3+";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = ";x\u0011 a?~\u0012>}(a\u001c8e\">\u0017%t,e\u0011x\u007f\"<\u00192";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "$|\u00150tb;";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = App.az;
        switch (i) {
            case a6.s /*12*/:
                if (i2 == -1) {
                    if (intent != null && intent.getBooleanExtra(z[11], false)) {
                        zv.a(this.j, (Activity) this);
                        finish();
                        if (i3 == 0) {
                            return;
                        }
                    }
                    zv.a(intent, this.j, this, 13, this);
                    if (i3 == 0) {
                        return;
                    }
                }
                return;
                break;
            case a6.z /*13*/:
                break;
            default:
                return;
        }
        zv.b().delete();
        if (i2 == -1) {
            if (zv.b(this.j, this)) {
                b();
                if (i3 == 0) {
                    return;
                }
            }
            return;
        }
        if (i2 == 0 && intent != null) {
            zv.a(intent, (ho) this);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(1).setVisible(this.j.m().exists());
        return super.onPrepareOptionsMenu(menu);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
        r10_this = this;
        r8 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r1 = 1;
        r2 = 0;
        r0 = com.whatsapp.App.az;
        super.onCreate(r11);
        r3 = z;
        r4 = 18;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r3 = r10.getSupportActionBar();
        r3.setDisplayHomeAsUpEnabled(r1);
        r3 = 2130903213; // 0x7f0300ad float:1.7413238E38 double:1.052806072E-314;
        r10.setContentView(r3);
        r3 = r10.getIntent();
        r4 = z;
        r5 = 16;
        r4 = r4[r5];
        r3 = r3.getStringExtra(r4);
        r4 = com.whatsapp.App.P;
        r4 = r4.a(r3);
        r10.j = r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 17;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r3);
        r5 = z;
        r6 = 19;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = r10.j;
        r5 = r5.M;
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        com.whatsapp.App.b(r10);
        r4 = com.whatsapp.App.P;
        r4 = r4.d();
        if (r4 != 0) goto L_0x008c;
    L_0x006c:
        r0 = z;
        r1 = 20;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 14;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r10, r1);
        r10.startActivity(r0);
        r10.finish();
    L_0x008b:
        return;
    L_0x008c:
        r5 = r10.getSupportActionBar();
        r5.setDisplayHomeAsUpEnabled(r1);
        r6 = r10.j;
        r6 = r6.w();
        if (r6 == 0) goto L_0x00a3;
    L_0x009b:
        r6 = 2131624430; // 0x7f0e01ee float:1.887604E38 double:1.0531624007E-314;
        r5.setTitle(r6);
        if (r0 == 0) goto L_0x00c0;
    L_0x00a3:
        r6 = r4.e;
        r6 = r3.equals(r6);
        if (r6 == 0) goto L_0x00b3;
    L_0x00ab:
        r6 = 2131624695; // 0x7f0e02f7 float:1.8876577E38 double:1.0531625316E-314;
        r5.setTitle(r6);
        if (r0 == 0) goto L_0x00c0;
    L_0x00b3:
        r6 = r10.j;
        r6 = r6.a(r10);
        r6 = com.whatsapp.util.a5.d(r6, r10);
        r5.setTitle(r6);
    L_0x00c0:
        r4 = r4.e;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00f0;
    L_0x00c8:
        r3 = r10.j;
        r3 = r3.M;
        if (r3 <= 0) goto L_0x013b;
    L_0x00ce:
        r3 = r10.j;
        r3 = r3.m();
        r3 = r3.exists();
        if (r3 != 0) goto L_0x013b;
    L_0x00da:
        r3 = r10.j;
        r3.M = r2;
        r3 = r10.j;
        r3 = r3.e;
        r4 = r10.j;
        r4 = r4.M;
        com.whatsapp.App.a(r3, r4, r1);
        r3 = r10.k;
        r3.sendEmptyMessageDelayed(r2, r8);
        if (r0 == 0) goto L_0x013b;
    L_0x00f0:
        r0 = android.os.Environment.getExternalStorageState();
        r3 = z;
        r4 = 15;
        r3 = r3[r4];
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0140;
    L_0x0100:
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r0 = r0.equals(r3);
        if (r0 != 0) goto L_0x0140;
    L_0x010c:
        r0 = r1;
    L_0x010d:
        if (r0 == 0) goto L_0x013b;
    L_0x010f:
        r0 = r10.j;
        r0 = r0.M;
        if (r0 <= 0) goto L_0x0125;
    L_0x0115:
        r0 = r10.j;
        r0 = r0.m();
        r0 = r0.exists();
        if (r0 != 0) goto L_0x0125;
    L_0x0121:
        r0 = r10.j;
        r0.M = r2;
    L_0x0125:
        r0 = r10.j;
        r0 = r0.e;
        r3 = r10.j;
        r3 = r3.M;
        com.whatsapp.App.a(r0, r3, r1);
        r0 = r10.j;
        r0 = r0.M;
        if (r0 != 0) goto L_0x013b;
    L_0x0136:
        r0 = r10.k;
        r0.sendEmptyMessageDelayed(r2, r8);
    L_0x013b:
        r10.b();
        goto L_0x008b;
    L_0x0140:
        r0 = r2;
        goto L_0x010d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewProfilePhoto.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case PBE.MD5 /*0*/:
                    zv.a(this.j, (Activity) this, 12);
                    return true;
                case ay.f /*1*/:
                    File t;
                    Intent intent = new Intent(z[6]);
                    intent.setType(z[1]);
                    if (this.j.equals(App.P.d())) {
                        t = App.t(z[0]);
                        try {
                            f.a(this.j.m(), t);
                        } catch (IOException e) {
                            App.b(getApplicationContext(), (int) R.string.photo_faled_save_to_gallery, 1);
                            return true;
                        }
                    }
                    t = this.j.m();
                    intent.putExtra(z[3], Uri.fromFile(t));
                    intent = Intent.createChooser(intent, null);
                    Intent intent2 = new Intent(z[4], null);
                    intent2.putExtra(z[7], Uri.fromFile(t));
                    intent2.putExtra(z[5], this.j.a((Context) this));
                    intent.putExtra(z[2], new Parcelable[]{intent2});
                    startActivity(intent);
                    return true;
                case 16908332:
                    finish();
                    return true;
                default:
                    return false;
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    public void a(String str) {
    }

    public void b(String str) {
    }

    public void a(Collection collection) {
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.j.w() || this.j.equals(App.P.d())) {
            menu.add(0, 0, 0, (int) R.string.edit_photo).setIcon((int) R.drawable.ic_action_edit).setShowAsAction(2);
        }
        menu.add(0, 1, 0, (int) R.string.share).setIcon((int) R.drawable.ic_action_share).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public void c(String str) {
    }

    public void d(String str) {
        this.j = App.P.a(this.j.e);
        if (str.equals(this.j.e)) {
            int i;
            Log.i(z[10] + this.j.M);
            String externalStorageState = Environment.getExternalStorageState();
            if (!externalStorageState.equals(z[9]) || externalStorageState.equals(z[8])) {
                i = 0;
            } else {
                i = 1;
            }
            this.k.removeMessages(0);
            if (i != 0 && this.j.M == 0) {
                App.a(this.j.e, this.j.M, 1);
                this.k.sendEmptyMessageDelayed(0, 32000);
            }
            b();
            invalidateOptionsMenu();
        }
    }

    public void a() {
        this.j = App.P.a(this.j.e);
        if (this.j.w()) {
            getSupportActionBar().setTitle((int) R.string.group_photo);
            if (App.az == 0) {
                return;
            }
        }
        getSupportActionBar().setTitle(a5.d(this.j.a((Context) this), this));
    }

    public ViewProfilePhoto() {
        this.k = new n4(this);
    }

    static m8 a(ViewProfilePhoto viewProfilePhoto) {
        return viewProfilePhoto.j;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[12]);
        this.k.removeMessages(0);
        App.a((anq) this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r7_this = this;
        r2 = com.whatsapp.App.az;
        r0 = 2131427464; // 0x7f0b0088 float:1.8476545E38 double:1.0530650866E-314;
        r3 = r7.findViewById(r0);
        r0 = 2131427676; // 0x7f0b015c float:1.8476975E38 double:1.0530651913E-314;
        r0 = r7.findViewById(r0);
        r0 = (com.whatsapp.wallpaper.ImageViewTouchBase) r0;
        r1 = 2131427766; // 0x7f0b01b6 float:1.8477158E38 double:1.053065236E-314;
        r1 = r7.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r4 = r7.j;	 Catch:{ IOException -> 0x00b0 }
        r4 = r4.e;	 Catch:{ IOException -> 0x00b0 }
        r4 = com.whatsapp.a89.a(r4);	 Catch:{ IOException -> 0x00b0 }
        if (r4 == 0) goto L_0x0035;
    L_0x0025:
        r4 = 0;
        r3.setVisibility(r4);	 Catch:{ IOException -> 0x00b0 }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IOException -> 0x00b0 }
        r4 = 8;
        r1.setVisibility(r4);	 Catch:{ IOException -> 0x00b0 }
        if (r2 == 0) goto L_0x00af;
    L_0x0035:
        r4 = r7.j;
        r5 = 1;
        r4 = r4.c(r5);
        r5 = r7.j;	 Catch:{ IOException -> 0x00b2 }
        r5 = r5.M;	 Catch:{ IOException -> 0x00b2 }
        r6 = -1;
        if (r5 != r6) goto L_0x006b;
    L_0x0043:
        if (r4 != 0) goto L_0x006b;
    L_0x0045:
        r5 = 8;
        r0.setVisibility(r5);	 Catch:{ IOException -> 0x00b4 }
        r5 = 8;
        r3.setVisibility(r5);	 Catch:{ IOException -> 0x00b4 }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ IOException -> 0x00b4 }
        r5 = r7.j;	 Catch:{ IOException -> 0x00b4 }
        r5 = r5.w();	 Catch:{ IOException -> 0x00b4 }
        if (r5 == 0) goto L_0x0063;
    L_0x005b:
        r5 = 2131624616; // 0x7f0e02a8 float:1.8876417E38 double:1.0531624926E-314;
        r1.setText(r5);	 Catch:{ IOException -> 0x00b6 }
        if (r2 == 0) goto L_0x00aa;
    L_0x0063:
        r5 = 2131624622; // 0x7f0e02ae float:1.8876429E38 double:1.0531624956E-314;
        r1.setText(r5);	 Catch:{ IOException -> 0x00b8 }
        if (r2 == 0) goto L_0x00aa;
    L_0x006b:
        r5 = 0;
        r0.setVisibility(r5);	 Catch:{ IOException -> 0x00ba }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ IOException -> 0x00ba }
        r1 = r7.j;	 Catch:{ IOException -> 0x00ba }
        r1 = r1.M;	 Catch:{ IOException -> 0x00ba }
        if (r1 != 0) goto L_0x0080;
    L_0x007a:
        r1 = 0;
        r3.setVisibility(r1);	 Catch:{ IOException -> 0x00bc }
        if (r2 == 0) goto L_0x0085;
    L_0x0080:
        r1 = 8;
        r3.setVisibility(r1);	 Catch:{ IOException -> 0x00be }
    L_0x0085:
        r1 = new android.graphics.BitmapFactory$Options;	 Catch:{ all -> 0x00c0 }
        r1.<init>();	 Catch:{ all -> 0x00c0 }
        r3 = 0;
        r1 = android.graphics.BitmapFactory.decodeStream(r4, r3, r1);	 Catch:{ all -> 0x00c0 }
        r3 = r7.j;	 Catch:{ IOException -> 0x00c7 }
        r3 = r3.M;	 Catch:{ IOException -> 0x00c7 }
        if (r3 > 0) goto L_0x009b;
    L_0x0095:
        r3 = r7.j;	 Catch:{ IOException -> 0x00c7 }
        r3 = r3.A;	 Catch:{ IOException -> 0x00c7 }
        if (r3 <= 0) goto L_0x00a2;
    L_0x009b:
        r3 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;
        r0.setMaxProperScale(r3);	 Catch:{ IOException -> 0x00c9 }
        if (r2 == 0) goto L_0x00a7;
    L_0x00a2:
        r2 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r0.setMaxProperScale(r2);	 Catch:{ IOException -> 0x00cb }
    L_0x00a7:
        r0.setImageBitmap(r1);	 Catch:{ all -> 0x00c0 }
    L_0x00aa:
        if (r4 == 0) goto L_0x00af;
    L_0x00ac:
        r4.close();	 Catch:{ IOException -> 0x00cd }
    L_0x00af:
        return;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        if (r4 == 0) goto L_0x00c6;
    L_0x00c3:
        r4.close();	 Catch:{ IOException -> 0x00cf }
    L_0x00c6:
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00c0 }
    L_0x00cd:
        r0 = move-exception;
        goto L_0x00af;
    L_0x00cf:
        r1 = move-exception;
        goto L_0x00c6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewProfilePhoto.b():void");
    }
}
