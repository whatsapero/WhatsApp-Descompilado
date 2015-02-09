package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class EULA extends UserFeedbackActivity {
    private static final String[] z;
    private n3 j;

    static {
        String[] strArr = new String[12];
        String str = "uK?h";
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
                        i3 = 62;
                        break;
                    case ay.n /*2*/:
                        i3 = 83;
                        break;
                    case ay.p /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 18;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "uK?h=sL6hfu\u0011${}~Y~zfqJ6)p\u007fK=jw0J<)\u007fqW=";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "uF0lbdW<g2gV:ew0I2`fyP4)}~\u001e'ha{\u001e8`~|[!z2dV!lst\u001e'f2vW=`ax\u001e7|`yP4)}~}!lsd[s";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "uK?h=sL6hfu";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "cN2jw^[6mwtw=Kkd[ ";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "cV<~Mb[4`adL2}{\u007fP\fo{bM'Vv|Y";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "sQ>'ex_'zs`N}[wwW }wbn;f|u\u0010!lauJ }sd[";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "b[4`ad[!&weR2&ss]6yf";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = "uF0lbdW<g2gV:ew0I2`fyP4)}~\u001e'ha{\u001e8`~|[!z2dV!lst\u001e'f2vW=`ax\u001e7|`yP4)}~}!lsd[s";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "B[ lf0n2zagQ!m";
                    obj = 9;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "B[ lf0l6j}f[!p";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "uK?h=sR<jy=I!f|w";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public EULA() {
        this.j = n3.AGREE_NONE;
    }

    private void b() {
        Log.i(z[8]);
        App.d((Context) this, 1);
        Intent intent = new Intent(this, RegisterPhone.class);
        intent.putExtra(z[7], true);
        startActivity(intent);
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    public void onResume() {
        super.onResume();
        switch (ig.a[this.j.ordinal()]) {
            case ay.f /*1*/:
                showDialog(6);
                if (App.az == 0) {
                    return;
                }
                break;
            case ay.n /*2*/:
                break;
            default:
                return;
        }
        showDialog(8);
    }

    static void a(EULA eula) {
        eula.b();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                e(z[0]);
                return true;
            case ay.f /*1*/:
                a54.E();
                return true;
            case ay.n /*2*/:
                a54.C();
                return true;
            default:
                return false;
        }
    }

    private void d() {
        a();
        findViewById(R.id.eula_layout).setBackgroundResource(0);
        findViewById(R.id.eula_layout).setBackgroundResource(R.drawable.background);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        r5_this = this;
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r4 = 0;
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r6);
        r0 = 2130903142; // 0x7f030066 float:1.7413094E38 double:1.052806037E-314;
        r5.setContentView(r0);
        r0 = com.whatsapp.App.B();	 Catch:{ Exception -> 0x0058 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0039;
    L_0x001d:
        r0 = new android.content.Intent;	 Catch:{ Exception -> 0x0058 }
        r1 = com.whatsapp.InsufficientStorageSpaceActivity.class;
        r0.<init>(r5, r1);	 Catch:{ Exception -> 0x0058 }
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = r0.setFlags(r1);	 Catch:{ Exception -> 0x0058 }
        r1 = z;	 Catch:{ Exception -> 0x0058 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ Exception -> 0x0058 }
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r0 = r0.putExtra(r1, r2);	 Catch:{ Exception -> 0x0058 }
        r5.startActivity(r0);	 Catch:{ Exception -> 0x0058 }
    L_0x0039:
        r5.d();
        r0 = com.whatsapp.App.e(r5);
        if (r0 == 0) goto L_0x005a;
    L_0x0042:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r5, r1);
        r5.startActivity(r0);
        r5.finish();
    L_0x0057:
        return;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r5.a();
        r0 = com.whatsapp.App.a;	 Catch:{ Exception -> 0x00ee }
        r2 = 10;
        r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ Exception -> 0x00ee }
        r0 = r0.a(r2, r1);	 Catch:{ Exception -> 0x00ee }
    L_0x0067:
        if (r0 == 0) goto L_0x0075;
    L_0x0069:
        r0 = r0.b;	 Catch:{ Exception -> 0x010b }
        if (r0 == 0) goto L_0x0075;
    L_0x006d:
        r0 = 6;
        r5.showDialog(r0);	 Catch:{ Exception -> 0x010d }
        r0 = com.whatsapp.App.az;	 Catch:{ Exception -> 0x010d }
        if (r0 == 0) goto L_0x0080;
    L_0x0075:
        r0 = com.whatsapp.a54.z();	 Catch:{ Exception -> 0x010f }
        if (r0 == 0) goto L_0x0080;
    L_0x007b:
        r0 = 8;
        r5.showDialog(r0);	 Catch:{ Exception -> 0x010f }
    L_0x0080:
        r0 = 2131427807; // 0x7f0b01df float:1.847724E38 double:1.053065256E-314;
        r0 = r5.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new android.text.SpannableString;
        r2 = 2131624305; // 0x7f0e0171 float:1.8875786E38 double:1.053162339E-314;
        r2 = r5.getText(r2);
        r1.<init>(r2);
        r2 = new android.text.style.UnderlineSpan;
        r2.<init>();
        r3 = r1.length();
        r1.setSpan(r2, r4, r3, r4);
        r0.setText(r1);
        r1 = 2131427808; // 0x7f0b01e0 float:1.8477243E38 double:1.0530652565E-314;
        r1 = r5.findViewById(r1);
        r1 = (android.widget.Button) r1;
        r2 = new com.whatsapp.bh;	 Catch:{ Exception -> 0x0111 }
        r2.<init>(r5);	 Catch:{ Exception -> 0x0111 }
        r0.setOnClickListener(r2);	 Catch:{ Exception -> 0x0111 }
        r0 = new com.whatsapp.kk;	 Catch:{ Exception -> 0x0111 }
        r0.<init>(r5);	 Catch:{ Exception -> 0x0111 }
        r1.setOnClickListener(r0);	 Catch:{ Exception -> 0x0111 }
        r0 = r5.getIntent();	 Catch:{ Exception -> 0x0111 }
        r1 = z;	 Catch:{ Exception -> 0x0111 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ Exception -> 0x0111 }
        r2 = 0;
        r0 = r0.getBooleanExtra(r1, r2);	 Catch:{ Exception -> 0x0111 }
        if (r0 == 0) goto L_0x00d1;
    L_0x00cd:
        r0 = 1;
        r5.showDialog(r0);	 Catch:{ Exception -> 0x0111 }
    L_0x00d1:
        r0 = 0;
        com.whatsapp.App.d(r5, r0);	 Catch:{ Exception -> 0x00ec }
        r0 = com.whatsapp.App.p;	 Catch:{ Exception -> 0x00ec }
        r0 = r0.x();	 Catch:{ Exception -> 0x00ec }
        if (r0 == 0) goto L_0x0057;
    L_0x00dd:
        r0 = z;	 Catch:{ Exception -> 0x00ec }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00ec }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x00ec }
        r0 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        com.whatsapp.Conversations.a(r5, r0);	 Catch:{ Exception -> 0x00ec }
        goto L_0x0057;
    L_0x00ec:
        r0 = move-exception;
        throw r0;
    L_0x00ee:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = 0;
        goto L_0x0067;
    L_0x010b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x010d }
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;
    L_0x0111:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.EULA.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, (int) R.string.register_contact_support).setIcon((int) R.drawable.ic_menu_help);
        if (App.aa == 3) {
            menu.add(0, 1, 0, z[10]);
            menu.add(0, 2, 0, z[11]);
        }
        return super.onCreateOptionsMenu(menu);
    }

    private void a() {
        if (getResources().getConfiguration().orientation == 1) {
            findViewById(R.id.logo).setVisibility(0);
            if (App.az == 0) {
                return;
            }
        }
        findViewById(R.id.logo).setVisibility(8);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r8) {
        /*
        r7_this = this;
        r4 = 2131624244; // 0x7f0e0134 float:1.8875662E38 double:1.053162309E-314;
        r6 = 9;
        r5 = 0;
        r1 = 2131623987; // 0x7f0e0033 float:1.887514E38 double:1.053162182E-314;
        r3 = 2131624632; // 0x7f0e02b8 float:1.887645E38 double:1.0531625005E-314;
        r2 = com.whatsapp.App.az;
        switch(r8) {
            case 1: goto L_0x003c;
            case 2: goto L_0x0056;
            case 3: goto L_0x0074;
            case 4: goto L_0x0011;
            case 5: goto L_0x0096;
            case 6: goto L_0x0133;
            case 7: goto L_0x0163;
            case 8: goto L_0x017e;
            case 9: goto L_0x0016;
            default: goto L_0x0011;
        };
    L_0x0011:
        r0 = super.onCreateDialog(r8);
    L_0x0015:
        return r0;
    L_0x0016:
        r0 = new android.app.AlertDialog$Builder;	 Catch:{ Exception -> 0x003a }
        r0.<init>(r7);	 Catch:{ Exception -> 0x003a }
        r1 = 2131623987; // 0x7f0e0033 float:1.887514E38 double:1.053162182E-314;
        r0 = r0.setTitle(r1);	 Catch:{ Exception -> 0x003a }
        r1 = 2131624085; // 0x7f0e0095 float:1.887534E38 double:1.05316223E-314;
        r0 = r0.setMessage(r1);	 Catch:{ Exception -> 0x003a }
        r1 = 2131624632; // 0x7f0e02b8 float:1.887645E38 double:1.0531625005E-314;
        r2 = new com.whatsapp.ati;	 Catch:{ Exception -> 0x003a }
        r2.<init>(r7);	 Catch:{ Exception -> 0x003a }
        r0 = r0.setPositiveButton(r1, r2);	 Catch:{ Exception -> 0x003a }
        r0 = r0.create();	 Catch:{ Exception -> 0x003a }
        goto L_0x0015;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r7);
        r1 = 2131624733; // 0x7f0e031d float:1.8876654E38 double:1.0531625504E-314;
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.av1;
        r1.<init>(r7);
        r0 = r0.setPositiveButton(r3, r1);
        r0 = r0.create();
        goto L_0x0015;
    L_0x0056:
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r7);
        r0 = r0.setTitle(r1);
        r1 = 2131624787; // 0x7f0e0353 float:1.8876764E38 double:1.053162577E-314;
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.tu;
        r1.<init>(r7);
        r0 = r0.setNeutralButton(r3, r1);
        r0 = r0.create();
        goto L_0x0015;
    L_0x0074:
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r7);
        r0 = r0.setTitle(r1);
        r1 = 2131624304; // 0x7f0e0170 float:1.8875784E38 double:1.0531623384E-314;
        r1 = r7.getString(r1);
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.bg;
        r1.<init>(r7);
        r0 = r0.setNeutralButton(r3, r1);
        r0 = r0.create();
        goto L_0x0015;
    L_0x0096:
        r0 = com.whatsapp.App.a;	 Catch:{ Exception -> 0x010e }
        r0 = r0.a();	 Catch:{ Exception -> 0x010e }
        r1 = r0;
    L_0x009d:
        if (r1 == 0) goto L_0x00ab;
    L_0x009f:
        r0 = r1.b;	 Catch:{ Exception -> 0x012b }
        if (r0 == 0) goto L_0x00ab;
    L_0x00a3:
        r0 = r1.b;	 Catch:{ Exception -> 0x012b }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x012b }
        if (r0 == 0) goto L_0x00af;
    L_0x00ab:
        r0 = "";
        if (r2 == 0) goto L_0x01ae;
    L_0x00af:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = r1.b;
        r1 = r0.iterator();
    L_0x00ba:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x00d7;
    L_0x00c0:
        r0 = r1.next();
        r0 = (com.whatsapp.util.a9) r0;
        r4 = r3.append(r6);
        r0 = r0.b;
        r0 = r4.append(r0);
        r4 = 10;
        r0.append(r4);
        if (r2 == 0) goto L_0x00ba;
    L_0x00d7:
        r0 = r3.length();
        r0 = r0 + -1;
        r3.setLength(r0);
        r0 = r3.toString();
        r1 = r0;
    L_0x00e5:
        r2 = new android.app.AlertDialog$Builder;	 Catch:{ Exception -> 0x012d }
        r2.<init>(r7);	 Catch:{ Exception -> 0x012d }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x012d }
        r3 = 7;
        if (r0 > r3) goto L_0x012f;
    L_0x00ef:
        r0 = 2131625013; // 0x7f0e0435 float:1.8877222E38 double:1.0531626887E-314;
    L_0x00f2:
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r3[r5] = r1;
        r0 = r7.getString(r0, r3);
        r0 = r2.setMessage(r0);
        r1 = new com.whatsapp.f4;
        r1.<init>(r7);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0015;
    L_0x010e:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r3 = r3[r6];
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = 0;
        r1 = r0;
        goto L_0x009d;
    L_0x012b:
        r0 = move-exception;
        throw r0;
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r0 = 2131625012; // 0x7f0e0434 float:1.887722E38 double:1.053162688E-314;
        goto L_0x00f2;
    L_0x0133:
        r0 = com.whatsapp.n3.AGREE_1;
        r7.j = r0;
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r7);
        r0 = r0.setTitle(r1);
        r1 = 2131625011; // 0x7f0e0433 float:1.8877218E38 double:1.0531626878E-314;
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r5);
        r1 = new com.whatsapp.yg;
        r1.<init>(r7);
        r0 = r0.setPositiveButton(r4, r1);
        r1 = new com.whatsapp.anb;
        r1.<init>(r7);
        r0 = r0.setNegativeButton(r3, r1);
        r0 = r0.create();
        goto L_0x0015;
    L_0x0163:
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r7);
        r1 = 2131624202; // 0x7f0e010a float:1.8875577E38 double:1.053162288E-314;
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.iq;
        r1.<init>(r7);
        r0 = r0.setOnCancelListener(r1);
        r0 = r0.create();
        goto L_0x0015;
    L_0x017e:
        r0 = com.whatsapp.n3.AGREE_2;
        r7.j = r0;
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r7);
        r0 = r0.setTitle(r1);
        r1 = 2131624201; // 0x7f0e0109 float:1.8875575E38 double:1.0531622876E-314;
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r5);
        r1 = new com.whatsapp.av5;
        r1.<init>(r7);
        r0 = r0.setPositiveButton(r4, r1);
        r1 = new com.whatsapp.az;
        r1.<init>(r7);
        r0 = r0.setNegativeButton(r3, r1);
        r0 = r0.create();
        goto L_0x0015;
    L_0x01ae:
        r1 = r0;
        goto L_0x00e5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.EULA.onCreateDialog(int):android.app.Dialog");
    }

    static n3 a(EULA eula, n3 n3Var) {
        eula.j = n3Var;
        return n3Var;
    }
}
