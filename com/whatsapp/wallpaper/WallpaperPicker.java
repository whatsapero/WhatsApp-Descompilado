package com.whatsapp.wallpaper;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import com.actionbarsherlock.R;
import com.whatsapp.CustomVelocityGallery;
import com.whatsapp.a5w;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class WallpaperPicker extends Activity implements OnItemSelectedListener, OnClickListener {
    private static final String[] z;
    private ArrayList a;
    private i b;
    Resources c;
    private ImageView d;
    private CustomVelocityGallery e;
    private s f;
    private boolean g;
    private ArrayList h;
    private Bitmap i;
    PackageManager j;

    static {
        String[] strArr = new String[12];
        String str = "eo\u0004B6V";
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
                        i3 = 58;
                        break;
                    case ay.f /*1*/:
                        i3 = 28;
                        break;
                    case ay.n /*2*/:
                        i3 = 105;
                        break;
                    case ay.p /*3*/:
                        i3 = 35;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "^n\bT;Xp\f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "M}\u0005O*[l\fQuHy\u001aL/H\u007f\f|4Uh6E5Or\r";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "Un\u0000F4N}\u001dJ5T";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Hy\rj>";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Un\u0000F4N}\u001dJ5T";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Ys\u0004\r-R}\u001dP;JlGT;Vp\u0019B*_n";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "[r\rQ5SxGP?Nh\u0000M=I2:f\u0019oN w\u0003eO,w\u000esR.p";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "[r\rQ5SxGP?Nh\u0000M=I2(s\nvU*b\u000esS'|\t\u007fH=j\u0014}O";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "M}\u0005O*[l\fQ\u0005Ju\nH?H";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "Ys\u0004\r-R}\u001dP;JlGT;Vp\u0019B*_n";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "^n\bT;Xp\f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        try {
            if (this.g) {
                a(this.e.getSelectedItemPosition());
                try {
                    if (ImageViewTouchBase.e == 0) {
                        return;
                    }
                }
            }
            finish();
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.res.Resources r10, java.lang.String r11) {
        /*
        r9_this = this;
        r0 = 0;
        r8 = 1;
        r1 = com.whatsapp.wallpaper.ImageViewTouchBase.e;
        r2 = 2131034112; // 0x7f050000 float:1.7678732E38 double:1.052870745E-314;
        r2 = r10.getStringArray(r2);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r3 = r2.length;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
    L_0x000b:
        if (r0 >= r3) goto L_0x0051;
    L_0x000d:
        r4 = r2[r0];	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r5 = z;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r6 = 1;
        r5 = r5[r6];	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r5 = r10.getIdentifier(r4, r5, r11);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        if (r5 == 0) goto L_0x004d;
    L_0x001a:
        r6 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r6.<init>();	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r4 = r6.append(r4);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r6 = z;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r7 = 0;
        r6 = r6[r7];	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r4 = r4.append(r6);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r4 = r4.toString();	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r6 = z;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r7 = 2;
        r6 = r6[r7];	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r4 = r10.getIdentifier(r4, r6, r11);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        if (r4 == 0) goto L_0x004d;
    L_0x003b:
        r6 = r9.a;	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
        r6.add(r4);	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
        r4 = r9.h;	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
        r4.add(r5);	 Catch:{ NotFoundException -> 0x005e, NullPointerException -> 0x0075 }
    L_0x004d:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000b;
    L_0x0051:
        r0 = r9.h;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r0 = r0.size();	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        if (r0 != 0) goto L_0x006d;
    L_0x0059:
        r0 = 1;
        r9.showDialog(r0);	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
    L_0x005d:
        return;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
    L_0x0060:
        r0 = move-exception;
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r9.showDialog(r8);
        goto L_0x005d;
    L_0x006d:
        r0 = r9.b;	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r0.notifyDataSetChanged();	 Catch:{ NotFoundException -> 0x0060, NullPointerException -> 0x0075 }
        r9.g = r8;
        goto L_0x005d;
    L_0x0075:
        r0 = move-exception;
        r9.showDialog(r8);
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.WallpaperPicker.a(android.content.res.Resources, java.lang.String):void");
    }

    public WallpaperPicker() {
        this.a = new ArrayList(24);
        this.h = new ArrayList(24);
        this.g = false;
        this.c = null;
    }

    static ArrayList c(WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.h;
    }

    static Bitmap a(WallpaperPicker wallpaperPicker, Bitmap bitmap) {
        wallpaperPicker.i = bitmap;
        return bitmap;
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    private void a() {
        a(this.c, z[7]);
    }

    static s a(WallpaperPicker wallpaperPicker, s sVar) {
        wallpaperPicker.f = sVar;
        return sVar;
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.f /*1*/:
                return new Builder(this).setMessage(R.string.download_from_market).setPositiveButton(R.string.ok, new k(this)).setNegativeButton(R.string.cancel, new o(this)).setOnCancelListener(new d(this)).create();
            case ay.n /*2*/:
                try {
                    String str;
                    if (VERSION.SDK_INT >= 14) {
                        str = z[8];
                    } else {
                        str = z[9];
                    }
                    return new Builder(this).setTitle(getString(R.string.wallpaper)).setMessage(getString(R.string.install_app_ineligible)).setPositiveButton(getString(R.string.yes), new b(this, str)).setNegativeButton(getString(R.string.no), new q(this)).create();
                } catch (NotFoundException e) {
                    throw e;
                }
            default:
                return null;
        }
    }

    static Bitmap a(WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        this.j = getPackageManager();
        setContentView(R.layout.wallpaper_picker);
        this.e = (CustomVelocityGallery) findViewById(R.id.gallery);
        this.e.setVelocityTransformer(new h(this));
        this.b = new i(this, this);
        this.e.setAdapter(this.b);
        this.e.setOnItemSelectedListener(this);
        this.e.setCallbackDuringFling(false);
        findViewById(R.id.set_wallpaper).setOnClickListener(this);
        this.d = (ImageView) findViewById(R.id.wallpaper);
        try {
            this.c = this.j.getResourcesForApplication(z[11]);
        } catch (NameNotFoundException e) {
            Log.e(z[10] + e.toString());
        }
    }

    protected void onResume() {
        super.onResume();
        a();
    }

    private void a(int i) {
        Intent intent = new Intent();
        intent.putExtra(z[5], (Serializable) this.h.get(i));
        intent.putExtra(z[6], getIntent().getIntExtra(z[4], 1));
        setResult(-1, intent);
        finish();
    }

    static ArrayList b(WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.a;
    }

    protected void onDestroy() {
        try {
            super.onDestroy();
            try {
                if (this.f == null) {
                    return;
                }
                if (this.f.getStatus() != Status.FINISHED) {
                    this.f.cancel(true);
                    this.f = null;
                }
            }
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        try {
            if (this.f != null) {
                if (this.f.getStatus() != Status.FINISHED) {
                    this.f.a();
                }
            }
            this.f = new s(this);
            a5w.a(this.f, new Integer[]{Integer.valueOf(i)});
        } catch (NotFoundException e) {
            throw e;
        } catch (NotFoundException e2) {
            throw e2;
        }
    }

    static ImageView d(WallpaperPicker wallpaperPicker) {
        return wallpaperPicker.d;
    }
}
