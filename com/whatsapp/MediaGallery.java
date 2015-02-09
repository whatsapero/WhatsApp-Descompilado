package com.whatsapp;

import android.app.Dialog;
import android.content.res.Configuration;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.bo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class MediaGallery extends DialogToastListActivity {
    public static MediaGallery A;
    private static final String[] G;
    private static am1 v;
    private static SimpleDateFormat z;
    private avt B;
    private ArrayList C;
    private MenuItem D;
    private OnClickListener E;
    private int F;
    private OnLongClickListener i;
    private int j;
    protected ListView k;
    private String l;
    private HashMap m;
    private PinnedHeaderLayout n;
    private Calendar o;
    private ActionMode p;
    private ni q;
    private Display r;
    private ni s;
    private TreeMap t;
    private TextView u;
    private ni w;
    private TextView x;
    private Callback y;

    class PinnedHeaderLayout extends LinearLayout {
        final MediaGallery a;
        View b;

        public void a() {
            int i = App.az;
            View childAt = this.a.k.getChildAt(1);
            int height = this.b.getHeight();
            if (childAt != null && childAt.getTag() == null) {
                if (childAt.getTop() < height) {
                    this.b.offsetTopAndBottom((childAt.getTop() - height) - this.b.getTop());
                    if (i == 0) {
                        return;
                    }
                }
                this.b.offsetTopAndBottom(-this.b.getTop());
                if (i == 0) {
                    return;
                }
            }
            this.b.offsetTopAndBottom(-this.b.getTop());
        }

        PinnedHeaderLayout(MediaGallery mediaGallery) {
            this.a = mediaGallery;
            super(mediaGallery);
            this.b = mediaGallery.getLayoutInflater().inflate(R.layout.media_gallery_section_row, null, true);
            this.b.setClickable(false);
            addView(this.b, new LayoutParams(-1, -2));
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            a();
        }
    }

    static ActionMode e(MediaGallery mediaGallery) {
        return mediaGallery.p;
    }

    static String j(MediaGallery mediaGallery) {
        return mediaGallery.l;
    }

    static PinnedHeaderLayout a(MediaGallery mediaGallery) {
        return mediaGallery.n;
    }

    static HashMap n(MediaGallery mediaGallery) {
        return mediaGallery.m;
    }

    public void onPause() {
        super.onPause();
    }

    static SimpleDateFormat e() {
        return z;
    }

    public void onResume() {
        super.onResume();
    }

    static TreeMap b(MediaGallery mediaGallery) {
        return mediaGallery.t;
    }

    static Callback o(MediaGallery mediaGallery) {
        return mediaGallery.y;
    }

    static avt f(MediaGallery mediaGallery) {
        return mediaGallery.B;
    }

    static OnClickListener k(MediaGallery mediaGallery) {
        return mediaGallery.E;
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
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int h(MediaGallery mediaGallery) {
        return mediaGallery.j;
    }

    public MediaGallery() {
        this.j = 4;
        this.t = new TreeMap();
        this.m = new HashMap();
        this.y = new fp(this);
    }

    static am1 a() {
        return v;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = App.az;
        super.onConfigurationChanged(configuration);
        b();
        this.B.a();
        this.B.notifyDataSetChanged();
        int firstVisiblePosition = this.k.getFirstVisiblePosition();
        int size = avt.a(this.B).size() - 1;
        while (size >= 0) {
            int keyAt = avt.a(this.B).keyAt(size);
            if (keyAt <= firstVisiblePosition) {
                try {
                    this.x.setText(((ni) avt.a(this.B).get(keyAt)).toString());
                    if (i == 0) {
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            keyAt = size - 1;
            if (i == 0) {
                size = keyAt;
            } else {
                return;
            }
        }
    }

    static void a(MediaGallery mediaGallery, b bVar, int i, MediaGalleryImageView mediaGalleryImageView) {
        mediaGallery.a(bVar, i, mediaGalleryImageView);
    }

    static void a(MediaGallery mediaGallery, b bVar, View view) {
        mediaGallery.a(bVar, view);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
        r7_this = this;
        r3 = 1;
        r6 = -2;
        r4 = 6;
        r5 = 0;
        r1 = com.whatsapp.App.az;
        r0 = G;	 Catch:{ IllegalArgumentException -> 0x0198 }
        r2 = 8;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x0198 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x0198 }
        super.onCreate(r8);	 Catch:{ IllegalArgumentException -> 0x0198 }
        com.whatsapp.App.a5();	 Catch:{ IllegalArgumentException -> 0x0198 }
        r0 = r7.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x0198 }
        r2 = 1;
        r0.setDisplayHomeAsUpEnabled(r2);	 Catch:{ IllegalArgumentException -> 0x0198 }
        r0 = 2130903165; // 0x7f03007d float:1.741314E38 double:1.0528060484E-314;
        r7.setContentView(r0);	 Catch:{ IllegalArgumentException -> 0x0198 }
        r0 = v;	 Catch:{ IllegalArgumentException -> 0x0198 }
        if (r0 != 0) goto L_0x002d;
    L_0x0027:
        r0 = com.whatsapp.am1.a();	 Catch:{ IllegalArgumentException -> 0x0198 }
        v = r0;	 Catch:{ IllegalArgumentException -> 0x0198 }
    L_0x002d:
        A = r7;
        r0 = new com.whatsapp.ni;
        r2 = java.util.Calendar.getInstance();
        r0.<init>(r7, r3, r2);
        r7.w = r0;
        r0 = r7.w;
        r0.add(r4, r6);
        r0 = new com.whatsapp.ni;
        r2 = 2;
        r3 = java.util.Calendar.getInstance();
        r0.<init>(r7, r2, r3);
        r7.q = r0;
        r0 = r7.q;
        r2 = -7;
        r0.add(r4, r2);
        r0 = new com.whatsapp.ni;
        r2 = 3;
        r3 = java.util.Calendar.getInstance();
        r0.<init>(r7, r2, r3);
        r7.s = r0;
        r0 = r7.s;
        r2 = -28;
        r0.add(r4, r2);
        r0 = java.util.Calendar.getInstance();
        r7.o = r0;
        r0 = r7.o;
        r2 = -366; // 0xfffffffffffffe92 float:NaN double:NaN;
        r0.add(r4, r2);
        r0 = r7.getIntent();
        r2 = G;
        r2 = r2[r4];
        r0 = r0.getStringExtra(r2);
        r7.l = r0;
        r0 = r7.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r7.r = r0;
        r0 = com.whatsapp.App.P;
        r2 = r7.l;
        r0 = r0.a(r2);
        r2 = r0.w();	 Catch:{ IllegalArgumentException -> 0x019a }
        if (r2 == 0) goto L_0x00b0;
    L_0x0097:
        r2 = r0.N;	 Catch:{ IllegalArgumentException -> 0x019a }
        if (r2 == 0) goto L_0x00bf;
    L_0x009b:
        r0 = r0.a(r7);
        r2 = r7.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x019c }
        r3 = r7.getBaseContext();	 Catch:{ IllegalArgumentException -> 0x019c }
        r0 = com.whatsapp.util.a5.d(r0, r3);	 Catch:{ IllegalArgumentException -> 0x019c }
        r2.setTitle(r0);	 Catch:{ IllegalArgumentException -> 0x019c }
        if (r1 == 0) goto L_0x00bf;
    L_0x00b0:
        r0 = 2131427886; // 0x7f0b022e float:1.84774E38 double:1.053065295E-314;
        r0 = r7.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x019c }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalArgumentException -> 0x019c }
        r2 = 2131624345; // 0x7f0e0199 float:1.8875867E38 double:1.0531623587E-314;
        r0.setText(r2);	 Catch:{ IllegalArgumentException -> 0x019c }
    L_0x00bf:
        r0 = com.whatsapp.App.aJ;	 Catch:{ IllegalArgumentException -> 0x019e }
        r2 = r7.l;	 Catch:{ IllegalArgumentException -> 0x019e }
        r0 = r0.e(r2);	 Catch:{ IllegalArgumentException -> 0x019e }
        r7.C = r0;	 Catch:{ IllegalArgumentException -> 0x019e }
        r0 = r7.getListView();	 Catch:{ IllegalArgumentException -> 0x019e }
        r7.k = r0;	 Catch:{ IllegalArgumentException -> 0x019e }
        r0 = r7.k;	 Catch:{ IllegalArgumentException -> 0x019e }
        r2 = 0;
        r0.setClickable(r2);	 Catch:{ IllegalArgumentException -> 0x019e }
        r7.b();	 Catch:{ IllegalArgumentException -> 0x019e }
        r0 = r7.C;	 Catch:{ IllegalArgumentException -> 0x019e }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x019e }
        if (r0 != 0) goto L_0x00eb;
    L_0x00e0:
        r0 = 2131427886; // 0x7f0b022e float:1.84774E38 double:1.053065295E-314;
        r0 = r7.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x019e }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x019e }
    L_0x00eb:
        r0 = new com.whatsapp.MediaGallery$PinnedHeaderLayout;
        r0.<init>(r7);
        r7.n = r0;
        r0 = r7.n;
        r2 = 2131427887; // 0x7f0b022f float:1.8477403E38 double:1.0530652956E-314;
        r0 = r0.findViewById(r2);
        r0 = (android.widget.TextView) r0;
        r7.x = r0;
        r0 = 2131427885; // 0x7f0b022d float:1.8477399E38 double:1.0530652946E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r2 = r7.n;
        r3 = new android.widget.LinearLayout$LayoutParams;
        r4 = -1;
        r3.<init>(r4, r6);
        r0.addView(r2, r3);
        r7.d();
        r0 = r7.k;
        r0.setDividerHeight(r5);
        r0 = new com.whatsapp.avt;
        r0.<init>(r7);
        r7.B = r0;
        r0 = r7.k;
        r2 = r7.B;
        r0.setAdapter(r2);
        r0 = r7.k;
        r0.setClickable(r5);
        r0 = new com.whatsapp.a8p;
        r0.<init>(r7);
        r7.E = r0;
        r0 = new com.whatsapp.j3;
        r0.<init>(r7);
        r7.i = r0;
        r0 = r7.getIntent();
        r2 = G;
        r3 = 9;
        r2 = r2[r3];
        r0 = r0.getBooleanExtra(r2, r5);
        if (r0 == 0) goto L_0x017b;
    L_0x014c:
        r0 = android.os.Environment.getExternalStorageState();
        r2 = G;	 Catch:{ IllegalArgumentException -> 0x01a0 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x01a0 }
        r2 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x01a0 }
        if (r2 != 0) goto L_0x0175;
    L_0x015b:
        r2 = G;	 Catch:{ IllegalArgumentException -> 0x01a2 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x01a2 }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x01a2 }
        if (r0 != 0) goto L_0x0175;
    L_0x0167:
        r0 = com.whatsapp.App.aT();	 Catch:{ IllegalArgumentException -> 0x01a4 }
        if (r0 == 0) goto L_0x01a6;
    L_0x016d:
        r0 = 2131624582; // 0x7f0e0286 float:1.8876348E38 double:1.053162476E-314;
    L_0x0170:
        r7.a(r0);	 Catch:{ IllegalArgumentException -> 0x01aa }
        if (r1 == 0) goto L_0x017b;
    L_0x0175:
        r0 = 2131624348; // 0x7f0e019c float:1.8875873E38 double:1.05316236E-314;
        r7.a(r0);	 Catch:{ IllegalArgumentException -> 0x01aa }
    L_0x017b:
        r0 = r7.k;
        r1 = r7.B;
        r1 = r1.getCount();
        r1 = r1 + -1;
        r0.setSelection(r1);
        r0 = r7.k;
        r1 = new com.whatsapp.a17;
        r1.<init>(r7);
        r0.setOnScrollListener(r1);
        r0 = r7.l;
        com.whatsapp.util.bo.c(r0);
        return;
    L_0x0198:
        r0 = move-exception;
        throw r0;
    L_0x019a:
        r0 = move-exception;
        throw r0;
    L_0x019c:
        r0 = move-exception;
        throw r0;
    L_0x019e:
        r0 = move-exception;
        throw r0;
    L_0x01a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01a2 }
    L_0x01a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x01a4 }
    L_0x01a4:
        r0 = move-exception;
        throw r0;
    L_0x01a6:
        r0 = 2131624583; // 0x7f0e0287 float:1.887635E38 double:1.0531624763E-314;
        goto L_0x0170;
    L_0x01aa:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaGallery.onCreate(android.os.Bundle):void");
    }

    public void f() {
        Log.i(G[2]);
        this.k.removeAllViewsInLayout();
    }

    static ActionMode a(MediaGallery mediaGallery, ActionMode actionMode) {
        mediaGallery.p = actionMode;
        return actionMode;
    }

    static TextView a(MediaGallery mediaGallery, TextView textView) {
        mediaGallery.u = textView;
        return textView;
    }

    static OnLongClickListener l(MediaGallery mediaGallery) {
        return mediaGallery.i;
    }

    static int g(MediaGallery mediaGallery) {
        return mediaGallery.F;
    }

    private void a(b bVar, int i, MediaGalleryImageView mediaGalleryImageView) {
        if (bVar == null) {
            try {
                Log.e(G[5]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            switch (bVar.j) {
                case ay.f /*1*/:
                case ay.p /*3*/:
                    break;
                case ay.n /*2*/:
                    mediaGalleryImageView.setImageResource(R.drawable.media_audio);
                    if (App.az == 0) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            bo.a(bVar, mediaGalleryImageView, null);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.b r7, android.view.View r8) {
        /*
        r6_this = this;
        r1 = 1;
        r2 = 0;
        r0 = r6.m;	 Catch:{ IllegalArgumentException -> 0x005d }
        r3 = r7.e;	 Catch:{ IllegalArgumentException -> 0x005d }
        r0 = r0.containsKey(r3);	 Catch:{ IllegalArgumentException -> 0x005d }
        if (r0 == 0) goto L_0x001b;
    L_0x000c:
        r0 = r6.m;	 Catch:{ IllegalArgumentException -> 0x005f }
        r3 = r7.e;	 Catch:{ IllegalArgumentException -> 0x005f }
        r0.remove(r3);	 Catch:{ IllegalArgumentException -> 0x005f }
        r0 = 0;
        r8.setSelected(r0);	 Catch:{ IllegalArgumentException -> 0x005f }
        r0 = com.whatsapp.App.az;	 Catch:{ IllegalArgumentException -> 0x005f }
        if (r0 == 0) goto L_0x0026;
    L_0x001b:
        r0 = r6.m;	 Catch:{ IllegalArgumentException -> 0x005f }
        r3 = r7.e;	 Catch:{ IllegalArgumentException -> 0x005f }
        r0.put(r3, r7);	 Catch:{ IllegalArgumentException -> 0x005f }
        r0 = 1;
        r8.setSelected(r0);	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x0026:
        r3 = r6.D;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r0 = r6.m;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = 10;
        if (r0 > r4) goto L_0x0063;
    L_0x0032:
        r0 = r1;
    L_0x0033:
        r3.setVisible(r0);
        r0 = r6.u;
        r3 = com.whatsapp.App.aX;
        r4 = 2131558430; // 0x7f0d001e float:1.8742176E38 double:1.0531297924E-314;
        r5 = r6.m;
        r5 = r5.size();
        r3 = r3.a(r4, r5);
        r1 = new java.lang.Object[r1];
        r4 = r6.m;
        r4 = r4.size();
        r4 = java.lang.Integer.valueOf(r4);
        r1[r2] = r4;
        r1 = java.lang.String.format(r3, r1);
        r0.setText(r1);
        return;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = r2;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaGallery.a(com.whatsapp.protocol.b, android.view.View):void");
    }

    public void onDestroy() {
        Log.i(G[11]);
        super.onDestroy();
        A = null;
        f();
        bo.a(this.l);
        App.a5();
    }

    static MenuItem a(MediaGallery mediaGallery, MenuItem menuItem) {
        mediaGallery.D = menuItem;
        return menuItem;
    }

    private int b() {
        this.j = this.r.getWidth() / ((v.q + (v.l * 2)) + ((int) v.o));
        Log.i(G[4] + this.j);
        this.F = (this.r.getWidth() - (((int) v.o) * (this.j + 2))) / this.j;
        Log.i(G[3] + ((this.r.getWidth() - (this.F * this.j)) - (((int) v.o) * (this.j - 1))));
        return this.F;
    }

    static {
        String[] strArr = new String[14];
        String str = ",\u001e_dh&\u001aWal3\u0002\u0014i` \u0017Tj&%\u001eWh}$[Ub),\u001eH~h&\u001eH";
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
                        i3 = 65;
                        break;
                    case ay.f /*1*/:
                        i3 = 123;
                        break;
                    case ay.n /*2*/:
                        i3 = 59;
                        break;
                    case ay.p /*3*/:
                        i3 = 13;
                        break;
                    default:
                        i3 = 9;
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
                    str = ",\u001e_dh&\u001aWal3\u0002\u0014\u007fl\"\u0002Xal\u0003\u0012O`h1\b";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = ",\u001e_dh&\u001aWal3\u0002\u0014\u007fl2\u001eONf/\u001dRj|3\u001aOdf/\b\u0001";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = ",\u001e_dh&\u001aWal3\u0002\u0014nf-5N`k$\tH7";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "/\u000eWa";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "+\u0012_";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ",\u0014Nc}$\u001f";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ",\u001e_dh&\u001aWal3\u0002\u0014n{$\u001aOh";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = " \u0017^\u007f}";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = ",\u0014Nc}$\u001fd\u007ff";
                    obj = 9;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ",\u001e_dh&\u001aWal3\u0002\u0014il2\u000fIbp";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    str = "\r7wA";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = "\f6v@";
                    i = 13;
                    strArr2 = strArr3;
                    obj = 12;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    G = strArr3;
                    try {
                        z = new SimpleDateFormat(G[12]);
                    } catch (IllegalArgumentException e) {
                        z = new SimpleDateFormat(G[13]);
                    }
                default:
                    strArr2[i] = str;
                    str = ",\u001e_dh&\u001aWal3\u0002\u0014i` \u0017Tj&%\u001eWh}$T";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static MenuItem i(MediaGallery mediaGallery) {
        return mediaGallery.D;
    }

    public void d() {
        int i = App.az;
        this.t.clear();
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            ni a = a(bVar.D);
            ArrayList arrayList = (ArrayList) this.t.get(a);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.t.put(a, arrayList);
            }
            arrayList.add(bVar);
            if (i != 0) {
                return;
            }
        }
    }

    static TextView c(MediaGallery mediaGallery) {
        return mediaGallery.x;
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.f /*1*/:
                try {
                    if (this.m != null) {
                        if (!this.m.isEmpty()) {
                            Log.i(G[1] + this.m.size());
                            Collection arrayList = new ArrayList(this.m.values());
                            return uw.a(this, arrayList, this.l, 1, new qj(this, arrayList));
                        }
                    }
                    Log.e(G[0]);
                    return super.onCreateDialog(i);
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            default:
                return super.onCreateDialog(i);
        }
    }

    static TextView d(MediaGallery mediaGallery) {
        return mediaGallery.u;
    }

    static ArrayList m(MediaGallery mediaGallery) {
        return mediaGallery.C;
    }

    public ni a(long j) {
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(new Date(j));
            if (instance.after(this.w)) {
                return this.w;
            }
            try {
                if (instance.after(this.q)) {
                    return this.q;
                }
                try {
                    if (instance.after(this.s)) {
                        return this.s;
                    }
                    try {
                        return instance.after(this.o) ? new ni(this, 4, new GregorianCalendar(instance.get(1), instance.get(2), 1)) : new ni(this, 5, new GregorianCalendar(instance.get(1), 1, 1));
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }
}
