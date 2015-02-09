package com.whatsapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.fieldstats.au;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class NewGroup extends DialogToastActivity {
    private static final String[] z;
    private m8 j;
    private tf k;
    private a11 l;
    private TextView m;
    private ImageView n;
    private EditText o;

    static {
        String[] strArr = new String[9];
        String str = "\u0006kB\u0007\u001a\u0007{EO\u000b\u001akT\u0014\r";
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
                        i3 = 104;
                        break;
                    case ay.f /*1*/:
                        i3 = 14;
                        break;
                    case ay.n /*2*/:
                        i3 = 53;
                        break;
                    case ay.p /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 104;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0006kB\u0007\u001a\u0007{EO\u000f\u0007.V\u0012\r\tzP@\u000f\u001aa@\u0010R";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0006kB\u0007\u001a\u0007{EO\u0006\u0007.[\u0005\u001c\u001faG\u000bH\tmV\u0005\u001b\u001b\"\u0015\u0006\t\u0001b\u0015\u0014\u0007HmG\u0005\t\u001ck\u0015\u0007\u001a\u0007{E";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0001}j\u0012\r\u001bkA";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0002gQ\u0013";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0006kB\u0007\u001a\u0007{EO\u0018\u0000aA\u000f\u0018\u0001m^\u0005\f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0006kB\u0007\u001a\u0007{EO\u000b\u001aaE\u0010\u0000\u0007zZ";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0006kB\u0007\u001a\u0007{EO\u001a\r}P\u0014\u0018\u0000aA\u000f";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0006kB\u0007\u001a\u0007{EO\f\r}A\u0012\u0007\u0011";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l.a(configuration);
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[0]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(R.layout.new_group);
        ak4.a(au.NEW_GROUP);
        this.n = (ImageView) findViewById(R.id.change_photo_btn);
        this.n.setOnClickListener(new yc(this));
        if (bundle == null) {
            this.j.m().delete();
            this.j.a().delete();
        }
        this.m = (TextView) findViewById(R.id.subject_counter_tv);
        this.m.setText(Integer.toString(ge.s));
        findViewById(R.id.emoji_btn).setOnClickListener(new am9(this));
        this.l = new a11(this);
        this.l.a(this.k);
        this.n.setImageResource(R.drawable.avatar_group);
        this.o = (EditText) findViewById(R.id.group_name);
        this.o.setFilters(new InputFilter[]{new alk(ge.s)});
        this.o.addTextChangedListener(new u(this));
        bp.a(this, getSupportActionBar(), getString(R.string.next), new rs(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.Vector r7) {
        /*
        r6_this = this;
        r5 = 3;
        r4 = 2;
        r3 = 0;
        r0 = r6.o;
        r0 = r0.getText();
        r0 = r0.toString();
        r0 = com.whatsapp.util.a5.a(r0);
        r1 = r0.length();
        r1 = r0.codePointCount(r3, r1);
        r2 = com.whatsapp.ge.s;
        if (r1 > r2) goto L_0x002e;
    L_0x001d:
        r1 = r7.size();
        if (r1 != 0) goto L_0x0048;
    L_0x0023:
        r0 = 2131624626; // 0x7f0e02b2 float:1.8876437E38 double:1.0531624975E-314;
        r0 = r6.getString(r0);
        com.whatsapp.App.a(r6, r0, r3);
    L_0x002d:
        return;
    L_0x002e:
        r0 = 2131624962; // 0x7f0e0402 float:1.8877119E38 double:1.0531626635E-314;
        r0 = r6.getString(r0);
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = com.whatsapp.ge.s;
        r2 = java.lang.Integer.valueOf(r2);
        r1[r3] = r2;
        r0 = java.lang.String.format(r0, r1);
        com.whatsapp.App.a(r6, r0, r3);
        goto L_0x002d;
    L_0x0048:
        r1 = com.whatsapp.bd.c(r0);
        com.whatsapp.bd.a(r1, r7);
        r2 = com.whatsapp.App.a();
        if (r2 == 0) goto L_0x0082;
    L_0x0055:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = com.whatsapp.App.aJ;
        r3 = com.whatsapp.bd.a(r1, r0, r7, r4);
        r2.f(r3);
        r2 = new com.whatsapp.av8;
        r2.<init>(r6, r1, r0, r7);
        com.whatsapp.util.br.a(r2);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x0092;
    L_0x0082:
        r2 = z;
        r2 = r2[r5];
        com.whatsapp.util.Log.i(r2);
        r2 = com.whatsapp.App.aJ;
        r0 = com.whatsapp.bd.a(r1, r0, r7, r5);
        r2.f(r0);
    L_0x0092:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.b();
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r6.finish();
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.NewGroup.a(java.util.Vector):void");
    }

    public void onDestroy() {
        Log.i(z[1]);
        super.onDestroy();
    }

    static EditText b(NewGroup newGroup) {
        return newGroup.o;
    }

    public NewGroup() {
        this.k = new uf(this);
        this.j = new mm(this);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = App.az;
        switch (i) {
            case ay.f /*1*/:
                break;
            case a6.s /*12*/:
                if (i2 == -1) {
                    if (intent != null && intent.getBooleanExtra(z[4], false)) {
                        Log.i(z[8]);
                        this.j.m().delete();
                        this.j.a().delete();
                        this.n.setImageResource(R.drawable.avatar_group);
                        if (i3 == 0) {
                            return;
                        }
                    }
                    Log.i(z[7]);
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
            Log.i(z[6]);
            this.n.setImageBitmap(this.j.a(getResources().getDimensionPixelSize(R.dimen.registration_profile_photo_size), 0.0f, false));
            if (i3 == 0) {
                return;
            }
        }
        if (i2 == 0 && intent != null) {
            zv.a(intent, (ho) this);
            if (i3 == 0) {
                return;
            }
            if (i2 == -1) {
                a(new Vector(Arrays.asList(intent.getStringExtra(z[5]).split(","))));
            }
        }
    }

    static m8 a(NewGroup newGroup) {
        return newGroup.j;
    }

    static a11 d(NewGroup newGroup) {
        return newGroup.l;
    }

    static TextView c(NewGroup newGroup) {
        return newGroup.m;
    }
}
