package com.whatsapp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.aq;
import com.whatsapp.util.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UnknownFormatConversionException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ContactInfo extends DialogToastActivity implements anq {
    private static final String[] z;
    private m8 j;
    private ImageView k;
    Runnable l;
    private View m;
    private final fc n;
    private ListView o;
    private CharSequence p;
    Handler q;
    private xs r;
    private fk s;
    private a5 t;
    private LinearLayout u;
    private View v;

    static {
        String[] strArr = new String[22];
        String str = "{9kr\u001d{\"lh\u001awypv\u0018y\"`";
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
                        i3 = 24;
                        break;
                    case ay.f /*1*/:
                        i3 = 86;
                        break;
                    case ay.n /*2*/:
                        i3 = 5;
                        break;
                    case ay.p /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "r?a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "r?a";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "t7|i\tl\tlh\u001at7qc\u000e";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    str = "{9kr\u001d{\"lh\u001awyft\u0019y\"`";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    str = "{9kr\u001d{\"lh\u001awywc\u000fm:q)\u001fw8qg\u001flvki\b87ab\u0019|v";
                    i = 6;
                    strArr2 = strArr3;
                    obj = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "{9kr\u001d{\"lh\u001awywc\u000fm:q)\u000fs?u)\u001fw8qg\u001flvki\b87ab\u0019|v";
                    obj = 6;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "r?a";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "y8at\u0013q2+o\u0012l3krRy5qo\u0013vxLH/]\u0004Q";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "y8at\u0013q2+o\u0012l3krRy5qo\u0013vxLH/]\u0004QY3J\t@B5L";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "h>jh\u0019";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "n8a(\u001dv2wi\u0015|xfs\u000ek9w(\u0015l3h)\u001fw8qg\u001fl";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "h>jh\u0019G\"|v\u0019";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "r?a";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "y8at\u0013q2+o\u0012l3krRy5qo\u0013vxSO9O";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "{9kr\u001d{\"lh\u001awyjv\b8%|u\b};%e\u0013v\"de\b8:lu\b85js\u0010|vki\b80js\u0012|";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "h>jh\u0019";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "r?a";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "{9kr\u001d{\"lh\u001awyac\u000fl$j\u007f";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "t7|i\tl\tlh\u001at7qc\u000e";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "r?a";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "r?a";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[5]);
        super.onCreate(bundle);
        requestWindowFeature(5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.contact_info);
        this.o = (ListView) findViewById(16908298);
        this.o.addHeaderView(b7.a((LayoutInflater) getBaseContext().getSystemService(z[4]), R.layout.contact_info_header, this.o, false), null, false);
        this.v = findViewById(R.id.header);
        this.v.setClickable(true);
        this.o.setOnScrollListener(new pa(this));
        this.o.getViewTreeObserver().addOnGlobalLayoutListener(new kp(this));
        this.k = (ImageView) findViewById(R.id.photo_btn);
        this.k.setOnClickListener(new jc(this));
        this.m = findViewById(R.id.photo_progress);
        OnClickListener m_Var = new m_(this);
        findViewById(R.id.media_title).setOnClickListener(m_Var);
        findViewById(R.id.media_info).setOnClickListener(m_Var);
        this.o.setOnItemClickListener(new fo(this));
        am1.b((TextView) findViewById(R.id.media_title));
        am1.b((TextView) findViewById(R.id.status_title));
        am1.b((TextView) findViewById(R.id.groups_title));
        this.r = new xs(this, this, R.layout.participant_list_row);
        this.o.setAdapter(this.r);
        a(null);
        a(null);
        setSupportProgressBarIndeterminateVisibility(true);
        e();
        bo.c(this.j.e);
        App.aJ.b(this.n);
        App.b((anq) this);
    }

    public ContactInfo() {
        this.s = new fk();
        this.q = new Handler();
        this.l = new rd(this);
        this.n = new gv(this);
    }

    static void b(ContactInfo contactInfo, ArrayList arrayList) {
        contactInfo.b(arrayList);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu r8) {
        /*
        r7_this = this;
        r0 = r7.j;	 Catch:{ ActivityNotFoundException -> 0x005d }
        if (r0 == 0) goto L_0x0058;
    L_0x0004:
        r0 = r7.j;	 Catch:{ ActivityNotFoundException -> 0x005f }
        r0 = r0.h;	 Catch:{ ActivityNotFoundException -> 0x005f }
        if (r0 == 0) goto L_0x003e;
    L_0x000a:
        r0 = 0;
        r1 = 1;
        r2 = 0;
        r3 = 2131625075; // 0x7f0e0473 float:1.8877348E38 double:1.0531627194E-314;
        r0 = r8.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r1 = 2130838839; // 0x7f020537 float:1.7282672E38 double:1.052774267E-314;
        r0.setIcon(r1);	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r0 = 0;
        r1 = 2;
        r2 = 0;
        r3 = 2131624647; // 0x7f0e02c7 float:1.887648E38 double:1.053162508E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r5 = 0;
        r6 = r7.j;	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r6 = r6.o();	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r4[r5] = r6;	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r3 = r7.getString(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r0 = r8.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r1 = 2130838853; // 0x7f020545 float:1.72827E38 double:1.052774274E-314;
        r0.setIcon(r1);	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r0 = com.whatsapp.App.az;	 Catch:{ ActivityNotFoundException -> 0x0061 }
        if (r0 == 0) goto L_0x0058;
    L_0x003e:
        r0 = 0;
        r1 = 3;
        r2 = 0;
        r3 = 2131623974; // 0x7f0e0026 float:1.8875115E38 double:1.0531621754E-314;
        r3 = r7.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r8.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r0 = 0;
        r1 = 4;
        r2 = 0;
        r3 = 2131623977; // 0x7f0e0029 float:1.887512E38 double:1.053162177E-314;
        r3 = r7.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r8.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0061 }
    L_0x0058:
        r0 = super.onCreateOptionsMenu(r8);
        return r0;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.onCreateOptionsMenu(com.actionbarsherlock.view.Menu):boolean");
    }

    static fk f(ContactInfo contactInfo) {
        return contactInfo.s;
    }

    static void g(ContactInfo contactInfo) {
        contactInfo.e();
    }

    static void a(ContactInfo contactInfo, ArrayList arrayList) {
        contactInfo.a(arrayList);
    }

    public void a(String str) {
        try {
            if (str.equals(getIntent().getStringExtra(z[18]))) {
                e();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void onResume() {
        super.onResume();
        App.b(this.j);
    }

    static long d(ContactInfo contactInfo) {
        return contactInfo.c();
    }

    private void a(ArrayList arrayList) {
        try {
            String str;
            if (this.j == null) {
                str = null;
            } else {
                str = this.j.e;
            }
            a(arrayList, str, (Activity) this);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void b(ContactInfo contactInfo) {
        contactInfo.d();
    }

    public void b(String str) {
        if (str.equals(getIntent().getStringExtra(z[21]))) {
            ((TextView) findViewById(R.id.conversation_contact_status)).setText(this.j.u());
        }
    }

    static xs c(ContactInfo contactInfo) {
        return contactInfo.r;
    }

    static void a(ContactInfo contactInfo, Bitmap bitmap) {
        contactInfo.a(bitmap);
    }

    private void a(List list) {
        try {
            this.r.a(list);
            if (this.r.getCount() == 0) {
                findViewById(R.id.groups_card).setVisibility(8);
                if (App.az == 0) {
                    return;
                }
            }
            findViewById(R.id.groups_card).setVisibility(0);
            ((TextView) findViewById(R.id.groups_info)).setText(Integer.toString(this.r.getCount()));
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private long c() {
        try {
            if (this.j.c == 0) {
                return 60000;
            }
            long currentTimeMillis = System.currentTimeMillis() - App.c(this.j.c);
            if (currentTimeMillis < 60000) {
                return 500;
            }
            return currentTimeMillis < 3600000 ? 5000 : 20000;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void a(java.util.ArrayList r12, java.lang.String r13, android.app.Activity r14) {
        /*
        r3 = com.whatsapp.App.az;
        r0 = 2131427617; // 0x7f0b0121 float:1.8476855E38 double:1.053065162E-314;
        r0 = r14.findViewById(r0);
        if (r12 == 0) goto L_0x0011;
    L_0x000b:
        r1 = r12.isEmpty();	 Catch:{ ActivityNotFoundException -> 0x013e }
        if (r1 == 0) goto L_0x0018;
    L_0x0011:
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ActivityNotFoundException -> 0x013e }
        if (r3 == 0) goto L_0x013d;
    L_0x0018:
        r1 = 0;
        r0.setVisibility(r1);
        r0 = 2131427622; // 0x7f0b0126 float:1.8476865E38 double:1.0530651646E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r0.removeAllViews();
        r1 = r14.getResources();
        r2 = 2131361865; // 0x7f0a0049 float:1.8343494E38 double:1.0530326764E-314;
        r4 = r1.getDimensionPixelSize(r2);
        r1 = r14.getResources();
        r2 = 2131361864; // 0x7f0a0048 float:1.8343492E38 double:1.053032676E-314;
        r5 = r1.getDimensionPixelSize(r2);
        r1 = r14.getResources();
        r2 = 2131361863; // 0x7f0a0047 float:1.834349E38 double:1.0530326754E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r6 = (float) r1;
        r7 = new android.widget.ImageView;
        r7.<init>(r14);
        r1 = 2130839096; // 0x7f020638 float:1.7283193E38 double:1.052774394E-314;
        r7.setBackgroundResource(r1);	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r1 = new android.view.ViewGroup$LayoutParams;	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r2 = r4 + r5;
        r8 = r4 + r5;
        r1.<init>(r2, r8);	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r7.setLayoutParams(r1);	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r7.setPadding(r5, r5, r5, r5);	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r1 = new com.whatsapp.iz;	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r1.<init>(r14, r13);	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r7.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r1 = new com.whatsapp.util.bd;	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r2 = r14.getResources();	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r8 = 2130838771; // 0x7f0204f3 float:1.7282534E38 double:1.0527742336E-314;
        r2 = r2.getDrawable(r8);	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r1.<init>(r2);	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r7.setImageDrawable(r1);	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r1 = android.widget.ImageView.ScaleType.CENTER;	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r7.setScaleType(r1);	 Catch:{ ActivityNotFoundException -> 0x0140 }
        r1 = com.whatsapp.App.as();	 Catch:{ ActivityNotFoundException -> 0x0140 }
        if (r1 != 0) goto L_0x0095;
    L_0x008a:
        r1 = r12.size();	 Catch:{ ActivityNotFoundException -> 0x0142 }
        r2 = 12;
        if (r1 < r2) goto L_0x0095;
    L_0x0092:
        r0.addView(r7);	 Catch:{ ActivityNotFoundException -> 0x0142 }
    L_0x0095:
        r8 = r12.iterator();
    L_0x0099:
        r1 = r8.hasNext();
        if (r1 == 0) goto L_0x0115;
    L_0x009f:
        r1 = r8.next();
        r1 = (com.whatsapp.protocol.b) r1;
        r9 = new com.whatsapp.ThumbnailTextButton;
        r9.<init>(r14);
        r2 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r9.setScaleType(r2);	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r2 = new android.view.ViewGroup$LayoutParams;	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r10 = r4 + r5;
        r11 = r4 + r5;
        r2.<init>(r10, r11);	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r9.setLayoutParams(r2);	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r9.setPadding(r5, r5, r5, r5);	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r9.setRadius(r6);	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r2 = r4 / 6;
        r2 = (float) r2;	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r9.setTextSize(r2);	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r2 = 5;
        r9.setTextGravity(r2);	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r2 = r1.j;	 Catch:{ ActivityNotFoundException -> 0x0144 }
        r10 = 3;
        if (r2 == r10) goto L_0x00d5;
    L_0x00d0:
        r2 = r1.j;	 Catch:{ ActivityNotFoundException -> 0x0146 }
        r10 = 2;
        if (r2 != r10) goto L_0x0100;
    L_0x00d5:
        r2 = r1.p;	 Catch:{ ActivityNotFoundException -> 0x0146 }
        if (r2 == 0) goto L_0x00e2;
    L_0x00d9:
        r2 = r1.p;
        r10 = (long) r2;
        r2 = android.text.format.DateUtils.formatElapsedTime(r10);
        if (r3 == 0) goto L_0x00ea;
    L_0x00e2:
        r2 = com.whatsapp.App.p;
        r10 = r1.k;
        r2 = android.text.format.Formatter.formatShortFileSize(r2, r10);
    L_0x00ea:
        r9.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x0148 }
        r2 = r1.j;	 Catch:{ ActivityNotFoundException -> 0x0148 }
        r10 = 3;
        if (r2 != r10) goto L_0x0100;
    L_0x00f2:
        r2 = r14.getResources();	 Catch:{ ActivityNotFoundException -> 0x0148 }
        r10 = 2130838938; // 0x7f02059a float:1.7282872E38 double:1.052774316E-314;
        r2 = r2.getDrawable(r10);	 Catch:{ ActivityNotFoundException -> 0x0148 }
        r9.setIcon(r2);	 Catch:{ ActivityNotFoundException -> 0x0148 }
    L_0x0100:
        r2 = new com.whatsapp.rt;
        r2.<init>(r14, r1, r13);
        r9.setOnClickListener(r2);
        r2 = new com.whatsapp.avs;
        r2.<init>(r4);
        com.whatsapp.util.bo.a(r1, r9, r2);
        r0.addView(r9);
        if (r3 == 0) goto L_0x0099;
    L_0x0115:
        r1 = com.whatsapp.App.as();	 Catch:{ ActivityNotFoundException -> 0x014a }
        if (r1 == 0) goto L_0x0128;
    L_0x011b:
        r1 = r12.size();	 Catch:{ ActivityNotFoundException -> 0x014c }
        r2 = 12;
        if (r1 < r2) goto L_0x013d;
    L_0x0123:
        r0.addView(r7);	 Catch:{ ActivityNotFoundException -> 0x014c }
        if (r3 == 0) goto L_0x013d;
    L_0x0128:
        r0 = 2131427621; // 0x7f0b0125 float:1.8476863E38 double:1.053065164E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.HorizontalScrollView) r0;
        r1 = r0.getViewTreeObserver();
        r2 = new com.whatsapp.a3i;
        r2.<init>(r0);
        r1.addOnGlobalLayoutListener(r2);
    L_0x013d:
        return;
    L_0x013e:
        r0 = move-exception;
        throw r0;
    L_0x0140:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0142 }
    L_0x0142:
        r0 = move-exception;
        throw r0;
    L_0x0144:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0146 }
    L_0x0146:
        r0 = move-exception;
        throw r0;
    L_0x0148:
        r0 = move-exception;
        throw r0;
    L_0x014a:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x014c }
    L_0x014c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.a(java.util.ArrayList, java.lang.String, android.app.Activity):void");
    }

    private void a(Bitmap bitmap) {
        try {
            this.m.setVisibility(8);
            if (bitmap != null) {
                this.k.setImageBitmap(bitmap);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void a(ContactInfo contactInfo) {
        contactInfo.b();
    }

    public void c(String str) {
        try {
            if (str.equals(getIntent().getStringExtra(z[3]))) {
                e();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void d(String str) {
        try {
            if (str.equals(getIntent().getStringExtra(z[2]))) {
                e();
                if (App.az == 0) {
                    return;
                }
            }
            m8 a = App.P.a(str);
            if (a != null) {
                ik com_whatsapp_atd = new atd(a);
                try {
                    if (this.r == null) {
                        return;
                    }
                    if (m8.a(this.r.b, com_whatsapp_atd)) {
                        this.r.notifyDataSetChanged();
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
        r5_this = this;
        r4 = -1;
        r0 = com.whatsapp.App.az;
        switch(r6) {
            case 10: goto L_0x0007;
            case 11: goto L_0x0052;
            default: goto L_0x0006;
        };
    L_0x0006:
        return;
    L_0x0007:
        if (r7 != r4) goto L_0x0035;
    L_0x0009:
        r1 = r5.j;	 Catch:{ ActivityNotFoundException -> 0x0089 }
        if (r1 == 0) goto L_0x0035;
    L_0x000d:
        if (r8 == 0) goto L_0x0022;
    L_0x000f:
        r1 = r8.getData();	 Catch:{ ActivityNotFoundException -> 0x008d }
        if (r1 == 0) goto L_0x0022;
    L_0x0015:
        r1 = com.whatsapp.App.P;	 Catch:{ ActivityNotFoundException -> 0x008f }
        r2 = r8.getData();	 Catch:{ ActivityNotFoundException -> 0x008f }
        r3 = r5.j;	 Catch:{ ActivityNotFoundException -> 0x008f }
        r1.a(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x008f }
        if (r0 == 0) goto L_0x0029;
    L_0x0022:
        r1 = com.whatsapp.App.P;	 Catch:{ ActivityNotFoundException -> 0x008f }
        r2 = r5.j;	 Catch:{ ActivityNotFoundException -> 0x008f }
        r1.i(r2);	 Catch:{ ActivityNotFoundException -> 0x008f }
    L_0x0029:
        r5.supportInvalidateOptionsMenu();	 Catch:{ ActivityNotFoundException -> 0x0091 }
        r1 = r5.j;	 Catch:{ ActivityNotFoundException -> 0x0091 }
        r1 = r1.e;	 Catch:{ ActivityNotFoundException -> 0x0091 }
        com.whatsapp.Conversation.i(r1);	 Catch:{ ActivityNotFoundException -> 0x0091 }
        if (r0 == 0) goto L_0x0006;
    L_0x0035:
        r1 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0093 }
        r1.<init>();	 Catch:{ ActivityNotFoundException -> 0x0093 }
        r2 = z;	 Catch:{ ActivityNotFoundException -> 0x0093 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0093 }
        r1 = r1.append(r2);	 Catch:{ ActivityNotFoundException -> 0x0093 }
        r2 = r5.j;	 Catch:{ ActivityNotFoundException -> 0x0093 }
        r1 = r1.append(r2);	 Catch:{ ActivityNotFoundException -> 0x0093 }
        r1 = r1.toString();	 Catch:{ ActivityNotFoundException -> 0x0093 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x0093 }
        if (r0 == 0) goto L_0x0006;
    L_0x0052:
        if (r7 != r4) goto L_0x006b;
    L_0x0054:
        r1 = r5.j;	 Catch:{ ActivityNotFoundException -> 0x0097 }
        if (r1 == 0) goto L_0x006b;
    L_0x0058:
        r1 = com.whatsapp.App.P;	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r2 = r5.j;	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r1.i(r2);	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r5.supportInvalidateOptionsMenu();	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r1 = r5.j;	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r1 = r1.e;	 Catch:{ ActivityNotFoundException -> 0x0087 }
        com.whatsapp.Conversation.i(r1);	 Catch:{ ActivityNotFoundException -> 0x0087 }
        if (r0 == 0) goto L_0x0006;
    L_0x006b:
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r1 = r5.j;	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0087 }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x0087 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x0087 }
        goto L_0x0006;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0093 }
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0087 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.onActivityResult(int, int, android.content.Intent):void");
    }

    public void a(Collection collection) {
    }

    static void a(ContactInfo contactInfo, List list) {
        contactInfo.a(list);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r4_this = this;
        r1 = com.whatsapp.App.az;
        r0 = r4.o;
        r2 = 0;
        r0 = r0.getChildAt(r2);
        if (r0 == 0) goto L_0x0052;
    L_0x000b:
        r2 = r4.o;	 Catch:{ ActivityNotFoundException -> 0x0053 }
        r2 = r2.getWidth();	 Catch:{ ActivityNotFoundException -> 0x0053 }
        r3 = r4.o;	 Catch:{ ActivityNotFoundException -> 0x0053 }
        r3 = r3.getHeight();	 Catch:{ ActivityNotFoundException -> 0x0053 }
        if (r2 <= r3) goto L_0x003e;
    L_0x0019:
        r2 = r4.o;	 Catch:{ ActivityNotFoundException -> 0x0053 }
        r2 = r2.getFirstVisiblePosition();	 Catch:{ ActivityNotFoundException -> 0x0053 }
        if (r2 != 0) goto L_0x0027;
    L_0x0021:
        r0 = r0.getTop();
        if (r1 == 0) goto L_0x0030;
    L_0x0027:
        r0 = r4.v;
        r0 = r0.getHeight();
        r0 = -r0;
        r0 = r0 + 1;
    L_0x0030:
        r2 = r4.v;	 Catch:{ ActivityNotFoundException -> 0x0055 }
        r3 = r4.v;	 Catch:{ ActivityNotFoundException -> 0x0055 }
        r3 = r3.getTop();	 Catch:{ ActivityNotFoundException -> 0x0055 }
        r0 = r0 - r3;
        r2.offsetTopAndBottom(r0);	 Catch:{ ActivityNotFoundException -> 0x0055 }
        if (r1 == 0) goto L_0x0052;
    L_0x003e:
        r0 = r4.v;	 Catch:{ ActivityNotFoundException -> 0x0057 }
        r0 = r0.getTop();	 Catch:{ ActivityNotFoundException -> 0x0057 }
        if (r0 == 0) goto L_0x0052;
    L_0x0046:
        r0 = r4.v;	 Catch:{ ActivityNotFoundException -> 0x0057 }
        r1 = r4.v;	 Catch:{ ActivityNotFoundException -> 0x0057 }
        r1 = r1.getTop();	 Catch:{ ActivityNotFoundException -> 0x0057 }
        r1 = -r1;
        r0.offsetTopAndBottom(r1);	 Catch:{ ActivityNotFoundException -> 0x0057 }
    L_0x0052:
        return;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.b():void");
    }

    private void d() {
        TextView textView = (TextView) findViewById(R.id.status_info);
        try {
            if (this.j.c != 0) {
                try {
                    CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(App.c(this.j.c), System.currentTimeMillis(), 0, 0);
                    if (!TextUtils.equals(this.p, relativeTimeSpanString)) {
                        this.p = relativeTimeSpanString;
                        textView.setText(this.p);
                        return;
                    }
                    return;
                } catch (UnknownFormatConversionException e) {
                    throw e;
                } catch (Throwable e2) {
                    Log.c(e2);
                    textView.setText("");
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            textView.setText("");
        } catch (UnknownFormatConversionException e3) {
            throw e3;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            Intent intent;
            switch (menuItem.getItemId()) {
                case ay.f /*1*/:
                    if (this.j.h == null) {
                        return true;
                    }
                    Uri a = this.j.a(getContentResolver());
                    if (a == null) {
                        return true;
                    }
                    Intent intent2 = new Intent(z[15], a);
                    try {
                        intent2.setComponent(intent2.resolveActivity(getPackageManager()));
                        if (intent2.getComponent() != null) {
                            startActivity(intent2);
                            if (App.az == 0) {
                                return true;
                            }
                        }
                        Log.w(z[16]);
                        App.q();
                        return true;
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                case ay.n /*2*/:
                    intent = new Intent(this, AccountInfoActivity.class);
                    intent.putExtra(z[14], this.j.e);
                    startActivity(intent);
                    return true;
                case ay.p /*3*/:
                    intent = new Intent(z[9], Contacts.CONTENT_URI);
                    intent.putExtra(z[17], this.j.a());
                    try {
                        startActivityForResult(intent, 10);
                        return true;
                    } catch (ActivityNotFoundException e3) {
                        App.q();
                        return true;
                    }
                case aj.i /*4*/:
                    intent = new Intent(z[10]);
                    intent.setType(z[12]);
                    intent.putExtra(z[11], this.j.a((Context) this));
                    intent.putExtra(z[13], 2);
                    intent.setFlags(524288);
                    try {
                        startActivityForResult(intent, 11);
                        return true;
                    } catch (ActivityNotFoundException e4) {
                        App.q();
                        return true;
                    }
                case 16908332:
                    finish();
                    return true;
                default:
                    return false;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    public void onDestroy() {
        try {
            super.onDestroy();
            Log.i(z[19]);
            if (this.t != null) {
                this.t.cancel(true);
            }
            App.a((anq) this);
            App.aJ.a(this.n);
            this.s.a();
            bo.a(this.j.e);
            this.q.removeCallbacks(this.l);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.ArrayList r12) {
        /*
        r11_this = this;
        r4 = com.whatsapp.App.az;
        r0 = r11.getBaseContext();
        r1 = z;
        r2 = 20;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.view.LayoutInflater) r0;
        r1 = r11.u;
        if (r1 != 0) goto L_0x0033;
    L_0x0016:
        r1 = new android.widget.LinearLayout;
        r1.<init>(r11);
        r11.u = r1;
        r1 = r11.u;
        r2 = 1;
        r1.setOrientation(r2);
        r1 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
        r1 = r11.findViewById(r1);
        r1 = (android.widget.ListView) r1;
        r2 = r11.u;
        r3 = 0;
        r5 = 0;
        r1.addFooterView(r2, r3, r5);
    L_0x0033:
        r1 = r11.u;
        r1.removeAllViews();
        r1 = new android.view.View;
        r1.<init>(r11);
        r2 = r11.u;
        r3 = -1;
        r5 = r11.getResources();
        r6 = 2131361814; // 0x7f0a0016 float:1.834339E38 double:1.053032651E-314;
        r5 = r5.getDimensionPixelSize(r6);
        r2.addView(r1, r3, r5);
        r1 = 0;
        r5 = r12.iterator();
        r3 = r1;
    L_0x0054:
        r1 = r5.hasNext();
        if (r1 == 0) goto L_0x0189;
    L_0x005a:
        r1 = r5.next();
        r1 = (com.whatsapp.ash) r1;
        r2 = 2130903089; // 0x7f030031 float:1.7412986E38 double:1.052806011E-314;
        r6 = 0;
        r7 = 0;
        r6 = com.whatsapp.b7.a(r0, r2, r6, r7);
        r2 = r12.size();	 Catch:{ ActivityNotFoundException -> 0x01a0 }
        r7 = 1;
        if (r2 != r7) goto L_0x0078;
    L_0x0070:
        r2 = 2130839000; // 0x7f0205d8 float:1.7282998E38 double:1.0527743467E-314;
        r6.setBackgroundResource(r2);	 Catch:{ ActivityNotFoundException -> 0x01a2 }
        if (r4 == 0) goto L_0x00c8;
    L_0x0078:
        if (r3 != 0) goto L_0x0082;
    L_0x007a:
        r2 = 2130839000; // 0x7f0205d8 float:1.7282998E38 double:1.0527743467E-314;
        r6.setBackgroundResource(r2);	 Catch:{ ActivityNotFoundException -> 0x01a6 }
        if (r4 == 0) goto L_0x00c8;
    L_0x0082:
        r2 = 1;
        if (r3 != r2) goto L_0x00b2;
    L_0x0085:
        r2 = new android.view.View;
        r2.<init>(r11);
        r7 = r11.u;	 Catch:{ ActivityNotFoundException -> 0x01a8 }
        r8 = -1;
        r9 = r11.getResources();	 Catch:{ ActivityNotFoundException -> 0x01a8 }
        r10 = 2131361814; // 0x7f0a0016 float:1.834339E38 double:1.053032651E-314;
        r9 = r9.getDimensionPixelSize(r10);	 Catch:{ ActivityNotFoundException -> 0x01a8 }
        r7.addView(r2, r8, r9);	 Catch:{ ActivityNotFoundException -> 0x01a8 }
        r2 = 2130839004; // 0x7f0205dc float:1.7283006E38 double:1.0527743487E-314;
        r6.setBackgroundResource(r2);	 Catch:{ ActivityNotFoundException -> 0x01a8 }
        r2 = 2131427604; // 0x7f0b0114 float:1.8476829E38 double:1.0530651557E-314;
        r2 = r6.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x01a8 }
        r2 = (android.widget.TextView) r2;	 Catch:{ ActivityNotFoundException -> 0x01a8 }
        r7 = 2131624141; // 0x7f0e00cd float:1.8875453E38 double:1.053162258E-314;
        r2.setText(r7);	 Catch:{ ActivityNotFoundException -> 0x01a8 }
        if (r4 == 0) goto L_0x00c8;
    L_0x00b2:
        r2 = r12.size();	 Catch:{ ActivityNotFoundException -> 0x01aa }
        r2 = r2 + -1;
        if (r3 != r2) goto L_0x00c2;
    L_0x00ba:
        r2 = 2130839001; // 0x7f0205d9 float:1.7283E38 double:1.052774347E-314;
        r6.setBackgroundResource(r2);	 Catch:{ ActivityNotFoundException -> 0x01ac }
        if (r4 == 0) goto L_0x00c8;
    L_0x00c2:
        r2 = 2130839003; // 0x7f0205db float:1.7283004E38 double:1.052774348E-314;
        r6.setBackgroundResource(r2);	 Catch:{ ActivityNotFoundException -> 0x01ac }
    L_0x00c8:
        r2 = r11.u;
        r7 = -1;
        r8 = -2;
        r2.addView(r6, r7, r8);
        r2 = 2131427605; // 0x7f0b0115 float:1.847683E38 double:1.053065156E-314;
        r2 = r6.findViewById(r2);
        r7 = 0;
        r2.setVisibility(r7);
        r2 = 2131427603; // 0x7f0b0113 float:1.8476827E38 double:1.053065155E-314;
        r7 = r6.findViewById(r2);
        r2 = 2131427611; // 0x7f0b011b float:1.8476843E38 double:1.053065159E-314;
        r8 = r6.findViewById(r2);
        r2 = 2131427610; // 0x7f0b011a float:1.8476841E38 double:1.0530651587E-314;
        r9 = r6.findViewById(r2);
        r2 = 2131427604; // 0x7f0b0114 float:1.8476829E38 double:1.0530651557E-314;
        r2 = r6.findViewById(r2);	 Catch:{ ActivityNotFoundException -> 0x01ae }
        r2 = (android.widget.TextView) r2;	 Catch:{ ActivityNotFoundException -> 0x01ae }
        com.whatsapp.am1.b(r2);	 Catch:{ ActivityNotFoundException -> 0x01ae }
        if (r3 == 0) goto L_0x0100;
    L_0x00fd:
        r2 = 1;
        if (r3 != r2) goto L_0x0106;
    L_0x0100:
        r2 = 0;
        r7.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x01b2 }
        if (r4 == 0) goto L_0x010b;
    L_0x0106:
        r2 = 8;
        r7.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x01b2 }
    L_0x010b:
        r2 = 2131427543; // 0x7f0b00d7 float:1.8476705E38 double:1.0530651256E-314;
        r2 = r6.findViewById(r2);
        r7 = r12.size();	 Catch:{ ActivityNotFoundException -> 0x01b4 }
        r7 = r7 + -1;
        if (r3 == r7) goto L_0x011c;
    L_0x011a:
        if (r3 != 0) goto L_0x0123;
    L_0x011c:
        r7 = 8;
        r2.setVisibility(r7);	 Catch:{ ActivityNotFoundException -> 0x01b8 }
        if (r4 == 0) goto L_0x0127;
    L_0x0123:
        r7 = 0;
        r2.setVisibility(r7);	 Catch:{ ActivityNotFoundException -> 0x01b8 }
    L_0x0127:
        r2 = com.whatsapp.ash.d(r1);	 Catch:{ ActivityNotFoundException -> 0x01ba }
        if (r2 != 0) goto L_0x0139;
    L_0x012d:
        r2 = 8;
        r8.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x01bc }
        r2 = 8;
        r9.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x01bc }
        if (r4 == 0) goto L_0x0149;
    L_0x0139:
        r2 = 0;
        r8.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x01bc }
        r2 = 0;
        r9.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x01bc }
        r2 = new com.whatsapp.df;	 Catch:{ ActivityNotFoundException -> 0x01bc }
        r2.<init>(r11, r1);	 Catch:{ ActivityNotFoundException -> 0x01bc }
        r8.setOnClickListener(r2);	 Catch:{ ActivityNotFoundException -> 0x01bc }
    L_0x0149:
        r2 = 2131427608; // 0x7f0b0118 float:1.8476837E38 double:1.0530651577E-314;
        r2 = r6.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r7 = com.whatsapp.ash.c(r1);
        r2.setText(r7);
        r2 = 2131427607; // 0x7f0b0117 float:1.8476835E38 double:1.053065157E-314;
        r2 = r6.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r7 = 2131624048; // 0x7f0e0070 float:1.8875265E38 double:1.053162212E-314;
        r8 = 1;
        r8 = new java.lang.Object[r8];
        r9 = 0;
        r10 = com.whatsapp.ash.b(r1);
        r8[r9] = r10;
        r7 = r11.getString(r7, r8);
        r2.setText(r7);
        r2 = 2131427606; // 0x7f0b0116 float:1.8476833E38 double:1.0530651567E-314;
        r2 = r6.findViewById(r2);
        r6 = new com.whatsapp.nu;
        r6.<init>(r11, r1);
        r2.setOnClickListener(r6);
        r1 = r3 + 1;
        if (r4 == 0) goto L_0x01be;
    L_0x0189:
        r0 = new android.view.View;
        r0.<init>(r11);
        r1 = r11.u;
        r2 = -1;
        r3 = r11.getResources();
        r4 = 2131361814; // 0x7f0a0016 float:1.834339E38 double:1.053032651E-314;
        r3 = r3.getDimensionPixelSize(r4);
        r1.addView(r0, r2, r3);
        return;
    L_0x01a0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01a2 }
    L_0x01a2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01a4 }
    L_0x01a4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01a6 }
    L_0x01a6:
        r0 = move-exception;
        throw r0;
    L_0x01a8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01aa }
    L_0x01aa:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01ac }
    L_0x01ac:
        r0 = move-exception;
        throw r0;
    L_0x01ae:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01b0 }
    L_0x01b0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01b2 }
    L_0x01b2:
        r0 = move-exception;
        throw r0;
    L_0x01b4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01b6 }
    L_0x01b6:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01b8 }
    L_0x01b8:
        r0 = move-exception;
        throw r0;
    L_0x01ba:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01bc }
    L_0x01bc:
        r0 = move-exception;
        throw r0;
    L_0x01be:
        r3 = r1;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.b(java.util.ArrayList):void");
    }

    protected static int a(Context context, String str, n0 n0Var) {
        int i;
        Object obj = null;
        int i2 = App.az;
        ArrayList arrayList = new ArrayList(12);
        Cursor m = App.aJ.m(str);
        if (m != null) {
            Object obj2 = null;
            int i3 = 0;
            while (m.moveToNext()) {
                try {
                    b a = App.aJ.a(m, str);
                    if (a.A != null) {
                        MediaData mediaData = (MediaData) a.A;
                        try {
                            if (a.e.b || mediaData.transferred) {
                                if (mediaData.file != null) {
                                    try {
                                        if (new File(Uri.fromFile(mediaData.file).getPath()).exists()) {
                                            i3++;
                                            if (obj2 == null) {
                                                arrayList.add(a);
                                                if (arrayList.size() == 12) {
                                                    obj2 = 1;
                                                    n0Var.a(arrayList);
                                                }
                                            }
                                        }
                                    } catch (SQLiteDiskIOException e) {
                                        throw e;
                                    } catch (SQLiteDiskIOException e2) {
                                        throw e2;
                                    }
                                }
                            }
                        } catch (SQLiteDiskIOException e22) {
                            throw e22;
                        } catch (SQLiteDiskIOException e222) {
                            throw e222;
                        }
                    }
                    obj = obj2;
                    i = i3;
                    if (i2 != 0) {
                        break;
                    }
                    i3 = i;
                    obj2 = obj;
                } catch (SQLiteDiskIOException e2222) {
                    try {
                        aq.a(context, (int) R.string.error_msgstore_db_diskio);
                        throw e2222;
                    } catch (Throwable th) {
                        if (m != null) {
                            try {
                                m.close();
                            } catch (SQLiteDiskIOException e22222) {
                                throw e22222;
                            }
                        }
                    }
                }
            }
            obj = obj2;
            i = i3;
            if (m != null) {
                try {
                    m.close();
                } catch (SQLiteDiskIOException e222222) {
                    throw e222222;
                }
            }
        }
        i = 0;
        if (obj == null) {
            try {
                n0Var.a(arrayList);
            } catch (SQLiteDiskIOException e2222222) {
                throw e2222222;
            }
        }
        return i;
    }

    public void a() {
        e();
        supportInvalidateOptionsMenu();
    }

    static m8 e(ContactInfo contactInfo) {
        return contactInfo.j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
        r7_this = this;
        r4 = 1;
        r6 = 0;
        r0 = z;
        r0 = r0[r6];
        com.whatsapp.util.Log.i(r0);
        r0 = r7.getIntent();
        r1 = z;
        r1 = r1[r4];
        r0 = r0.getStringExtra(r1);
        r0 = com.whatsapp.v.b(r0);
        r7.j = r0;
        r0 = 2131427624; // 0x7f0b0128 float:1.847687E38 double:1.0530651656E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131624439; // 0x7f0e01f7 float:1.8876058E38 double:1.053162405E-314;
        r2 = new java.lang.Object[r4];
        r3 = r7.j;
        r3 = r3.o();
        r2[r6] = r3;
        r1 = r7.getString(r1, r2);
        r0.setText(r1);
        r0 = r7.getResources();
        r1 = 2131361867; // 0x7f0a004b float:1.8343498E38 double:1.0530326773E-314;
        r0 = r0.getDimensionPixelSize(r1);
        r1 = r7.j;
        r1 = r1.j();
        r0 = android.graphics.Bitmap.createScaledBitmap(r1, r0, r0, r4);
        r7.a(r0);
        r0 = 2131427596; // 0x7f0b010c float:1.8476813E38 double:1.053065152E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r7.j;
        r1 = r1.a(r7);
        r2 = r7.getBaseContext();
        r3 = r0.getPaint();
        r1 = com.whatsapp.util.a5.b(r1, r2, r3);
        r0.setText(r1);
        r0 = 2131427597; // 0x7f0b010d float:1.8476815E38 double:1.0530651523E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r7.j;
        r1 = r1.u();
        r0.setText(r1);
        r0 = 2131427616; // 0x7f0b0120 float:1.8476853E38 double:1.0530651617E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131427612; // 0x7f0b011c float:1.8476845E38 double:1.0530651597E-314;
        r1 = r7.findViewById(r1);
        r2 = r7.j;	 Catch:{ ActivityNotFoundException -> 0x00ea }
        r2 = r2.b;	 Catch:{ ActivityNotFoundException -> 0x00ea }
        if (r2 == 0) goto L_0x00cc;
    L_0x0096:
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r7.d();	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r2 = r7.q;	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r3 = r7.l;	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r2.removeCallbacks(r3);	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r2 = r7.j;	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r2 = r2.c;	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x00b9;
    L_0x00ae:
        r2 = r7.q;	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r3 = r7.l;	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r4 = r7.c();	 Catch:{ ActivityNotFoundException -> 0x00ec }
        r2.postDelayed(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x00ec }
    L_0x00b9:
        r2 = r7.j;	 Catch:{ ActivityNotFoundException -> 0x00ee }
        r2 = r2.b;	 Catch:{ ActivityNotFoundException -> 0x00ee }
        r3 = r7.getBaseContext();	 Catch:{ ActivityNotFoundException -> 0x00ee }
        r2 = com.whatsapp.util.a5.c(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x00ee }
        r0.setText(r2);	 Catch:{ ActivityNotFoundException -> 0x00ee }
        r0 = com.whatsapp.App.az;	 Catch:{ ActivityNotFoundException -> 0x00ee }
        if (r0 == 0) goto L_0x00d1;
    L_0x00cc:
        r0 = 8;
        r1.setVisibility(r0);	 Catch:{ ActivityNotFoundException -> 0x00ee }
    L_0x00d1:
        r0 = r7.t;	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        if (r0 == 0) goto L_0x00db;
    L_0x00d5:
        r0 = r7.t;	 Catch:{ ActivityNotFoundException -> 0x00f0 }
        r1 = 1;
        r0.cancel(r1);	 Catch:{ ActivityNotFoundException -> 0x00f0 }
    L_0x00db:
        r0 = new com.whatsapp.a5;
        r0.<init>(r7);
        r7.t = r0;
        r0 = r7.t;
        r1 = new java.lang.Void[r6];
        com.whatsapp.a5w.a(r0, r1);
        return;
    L_0x00ea:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00ec }
    L_0x00ec:
        r0 = move-exception;
        throw r0;
    L_0x00ee:
        r0 = move-exception;
        throw r0;
    L_0x00f0:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactInfo.e():void");
    }

    public static void a(m8 m8Var, Activity activity) {
        Intent intent = new Intent(activity, ContactInfo.class);
        intent.putExtra(z[8], m8Var.e);
        activity.startActivity(intent);
    }
}
