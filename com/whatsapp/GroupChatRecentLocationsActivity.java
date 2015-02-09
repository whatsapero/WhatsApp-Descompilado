package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockMapActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView.LayoutParams;
import com.google.android.maps.MyLocationOverlay;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class GroupChatRecentLocationsActivity extends SherlockMapActivity implements on {
    private static final String[] z;
    private int a;
    private OnLongClickListener b;
    private ArrayList c;
    private att d;
    private final fc e;
    private int f;
    private TextView g;
    private String h;
    private MyLocationOverlay i;
    private ArrayList j;
    private GoogleMapView k;
    private m8 l;

    static {
        String[] strArr = new String[7];
        String str = "Z\u001d*nv^\u0007$otX\f urQ\u0000&zrT\u0000+h)O\n6njI@&thI\u000e&o&S\u00001;gY\u000b \u007f";
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
                        i3 = 61;
                        break;
                    case ay.f /*1*/:
                        i3 = 111;
                        break;
                    case ay.n /*2*/:
                        i3 = 69;
                        break;
                    case ay.p /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 6;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "Z\u001d*nv^\u0007$otX\f urQ\u0000&zrT\u0000+h)^\u001d zrX";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "Z\n1AiR\u0002\u0007nrI\u0000+hER\u00011iiQ\u0003 i";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "W\u0006!";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Z\u001d*nv^\u0007$otX\f urQ\u0000&zrT\u0000+h)Y\n6otR\u0016";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Q\u000e<tsI0,u`Q\u000e1~t";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Z\u001d*nv^\u0007$otX\f urQ\u0000&zrT\u0000+h)O\n6njI@6poM@&thI\u000e&o&S\u00001;gY\u000b \u007f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a() {
        int i = App.az;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            this.k.removeView((View) it.next());
            if (i != 0) {
                break;
            }
        }
        double min = ((double) ((Math.min(this.k.getWidth(), this.k.getHeight()) / 10) * 360)) / ((Math.pow(2.0d, (double) this.k.getZoomLevel()) * 256.0d) / 2.0d);
        double d = min / 2.0d;
        HashMap hashMap = new HashMap();
        Point point = new Point();
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            double d2 = bVar.G;
            double d3 = bVar.K;
            GeoPoint geoPoint = new GeoPoint((int) (bVar.K * 1000000.0d), (int) (bVar.G * 1000000.0d));
            this.k.getProjection().toPixels(geoPoint, point);
            String str = ((int) ((d2 + 180.0d) / min)) + " " + ((int) ((90.0d + d3) / d));
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new ArrayList());
            }
            ((ArrayList) hashMap.get(str)).add(bVar);
            if (i != 0) {
                break;
            }
        }
        Object arrayList = new ArrayList(hashMap.values());
        Collections.sort(arrayList, new cx(this));
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList2 = (ArrayList) it2.next();
            View linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(0, 0, 0, (int) (7.0f * am1.a().g));
            View linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            linearLayout.addView(linearLayout2);
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(z[6]);
            Drawable com_whatsapp_a1l = new a1l();
            com_whatsapp_a1l.a((int) (12.0f * am1.a().g));
            linearLayout2.setBackgroundDrawable(com_whatsapp_a1l);
            Iterator it3 = arrayList2.iterator();
            double d4 = 0.0d;
            d = 0.0d;
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                View a = b7.a(layoutInflater, R.layout.contact_map_balloon, null);
                a.setClickable(true);
                a.setBackgroundResource(R.drawable.selector_orange_gradient);
                a(a, bVar2);
                linearLayout2.addView(a);
                a.setOnLongClickListener(this.b);
                d4 += bVar2.K;
                min = bVar2.G + d;
                if (i != 0) {
                    break;
                }
                d = min;
            }
            min = d;
            this.k.addView(linearLayout, new LayoutParams(-2, -2, new GeoPoint((int) ((d4 / ((double) arrayList2.size())) * 1000000.0d), (int) ((min / ((double) arrayList2.size())) * 1000000.0d)), 81));
            this.j.add(linearLayout);
            if (i != 0) {
                return;
            }
        }
    }

    static b a(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity, String str) {
        return groupChatRecentLocationsActivity.a(str);
    }

    protected void onResume() {
        super.onResume();
        this.i.enableMyLocation();
    }

    static void l(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        groupChatRecentLocationsActivity.a();
    }

    public void onDestroy() {
        Log.i(z[5]);
        super.onDestroy();
        App.aJ.a(this.e);
    }

    public GroupChatRecentLocationsActivity() {
        this.c = new ArrayList();
        this.f = -1;
        this.j = new ArrayList();
        this.e = new g3(this);
    }

    protected void onPause() {
        super.onPause();
        this.i.disableMyLocation();
    }

    private b a(String str) {
        int i = App.az;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!str.equals(bVar.F)) {
                if (i != 0) {
                    break;
                }
            }
            return bVar;
        }
        return null;
    }

    static att f(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.d;
    }

    static ArrayList d(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.c;
    }

    static int a(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity, int i) {
        groupChatRecentLocationsActivity.a = i;
        return i;
    }

    static GoogleMapView b(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.k;
    }

    static void h(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        groupChatRecentLocationsActivity.b();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = App.az;
        switch (i) {
            case a6.h /*10*/:
                if (i2 == -1) {
                    if (!(intent == null || intent.getData() == null)) {
                        App.P.a(intent.getData(), this.l);
                        if (i3 == 0) {
                            return;
                        }
                    }
                    App.P.i(this.l);
                    if (i3 == 0) {
                        return;
                    }
                }
                Log.i(z[0]);
                if (i3 == 0) {
                    return;
                }
                break;
            case a6.e /*11*/:
                break;
            default:
                return;
        }
        if (i2 == -1) {
            App.P.i(this.l);
            if (i3 == 0) {
                return;
            }
        }
        Log.i(z[1]);
    }

    protected boolean isRouteDisplayed() {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
        r18_this = this;
        r12 = com.whatsapp.App.az;
        super.onCreate(r19);
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = r18.getSupportActionBar();
        r3 = 1;
        r2.setDisplayHomeAsUpEnabled(r3);
        r2 = 2130903154; // 0x7f030072 float:1.7413118E38 double:1.052806043E-314;
        r0 = r18;
        r0.setContentView(r2);
        r2 = r18.getIntent();
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2 = r2.getStringExtra(r3);
        r0 = r18;
        r0.h = r2;
        r0 = r18;
        r2 = r0.h;
        r2 = com.whatsapp.v.b(r2);
        r3 = r18.getSupportActionBar();
        r0 = r18;
        r2 = r2.a(r0);
        r4 = r18.getBaseContext();
        r2 = com.whatsapp.util.a5.d(r2, r4);
        r3.setTitle(r2);
        r2 = 2131427848; // 0x7f0b0208 float:1.8477324E38 double:1.0530652763E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (com.whatsapp.GoogleMapView) r2;
        r0 = r18;
        r0.k = r2;
        r0 = r18;
        r2 = r0.k;
        r0 = r18;
        r2.setMapListener(r0);
        r0 = r18;
        r2 = r0.k;
        r3 = 1;
        r2.setBuiltInZoomControls(r3);
        r2 = 2131427535; // 0x7f0b00cf float:1.847669E38 double:1.0530651216E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r0 = r18;
        r0.g = r2;
        r2 = new com.whatsapp.e5;
        r0 = r18;
        r3 = r0.k;
        r0 = r18;
        r2.<init>(r0, r3);
        r0 = r18;
        r0.i = r2;
        r0 = r18;
        r2 = r0.k;
        r2 = r2.getOverlays();
        r0 = r18;
        r3 = r0.i;
        r2.add(r3);
        r2 = com.whatsapp.App.aJ;
        r0 = r18;
        r3 = r0.h;
        r2 = r2.g(r3);
        r0 = r18;
        r0.c = r2;
        r0 = r18;
        r2 = r0.c;
        r3 = new com.whatsapp.j4;
        r0 = r18;
        r3.<init>(r0);
        java.util.Collections.sort(r2, r3);
        r2 = new com.whatsapp.avi;
        r0 = r18;
        r2.<init>(r0);
        r0 = r18;
        r0.b = r2;
        r8 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r6 = -4587338432941916160; // 0xc056800000000000 float:0.0 double:-90.0;
        r4 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r2 = -4582834833314545664; // 0xc066800000000000 float:0.0 double:-180.0;
        r0 = r18;
        r10 = r0.c;
        r13 = r10.iterator();
        r10 = r8;
        r8 = r6;
        r6 = r4;
        r4 = r2;
    L_0x00df:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0238;
    L_0x00e5:
        r2 = r13.next();
        r2 = (com.whatsapp.protocol.b) r2;
        r14 = r2.K;
        r10 = java.lang.Math.min(r10, r14);
        r14 = r2.K;
        r8 = java.lang.Math.max(r8, r14);
        r14 = r2.G;
        r6 = java.lang.Math.min(r6, r14);
        r2 = r2.G;
        r2 = java.lang.Math.max(r4, r2);
        if (r12 == 0) goto L_0x0235;
    L_0x0105:
        r4 = new com.google.android.maps.GeoPoint;
        r14 = r10 + r8;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r5 = (int) r14;
        r14 = r6 + r2;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r13 = (int) r14;
        r4.<init>(r5, r13);
        r0 = r18;
        r5 = r0.k;
        r5 = r5.getController();
        r5.setCenter(r4);
        r4 = r8 - r10;
        r8 = 4608533498688228557; // 0x3ff4cccccccccccd float:-1.07374184E8 double:1.3;
        r4 = r4 * r8;
        r8 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r4 = r4 * r8;
        r4 = (int) r4;
        r2 = r2 - r6;
        r6 = 4608533498688228557; // 0x3ff4cccccccccccd float:-1.07374184E8 double:1.3;
        r2 = r2 * r6;
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r2 = r2 * r6;
        r2 = (int) r2;
        r0 = r18;
        r3 = r0.c;	 Catch:{ NoSuchMethodException -> 0x0226 }
        r3 = r3.size();	 Catch:{ NoSuchMethodException -> 0x0226 }
        r5 = 1;
        if (r3 > r5) goto L_0x0168;
    L_0x0159:
        r0 = r18;
        r3 = r0.k;	 Catch:{ NoSuchMethodException -> 0x0226 }
        r3 = r3.getController();	 Catch:{ NoSuchMethodException -> 0x0226 }
        r5 = 17;
        r3.setZoom(r5);	 Catch:{ NoSuchMethodException -> 0x0226 }
        if (r12 == 0) goto L_0x0173;
    L_0x0168:
        r0 = r18;
        r3 = r0.k;	 Catch:{ NoSuchMethodException -> 0x0228 }
        r3 = r3.getController();	 Catch:{ NoSuchMethodException -> 0x0228 }
        r3.zoomToSpan(r4, r2);	 Catch:{ NoSuchMethodException -> 0x0228 }
    L_0x0173:
        r18.a();
        r0 = r18;
        r2 = r0.c;
        r2 = r2.size();
        r2 = r2 + -1;
        r0 = r18;
        r0.a = r2;
        r2 = new com.whatsapp.att;
        r0 = r18;
        r2.<init>(r0);
        r0 = r18;
        r0.d = r2;
        r0 = r18;
        r2 = r0.d;
        r2.a();
        r0 = r18;
        r2 = r0.k;
        r2 = r2.getOverlays();
        r0 = r18;
        r3 = r0.d;
        r2.add(r3);
        r2 = 2131427851; // 0x7f0b020b float:1.847733E38 double:1.053065278E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r3 = new com.whatsapp.ii;
        r0 = r18;
        r3.<init>(r0);
        r2.setOnClickListener(r3);
        r2 = 2131427852; // 0x7f0b020c float:1.8477332E38 double:1.0530652783E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r3 = new com.whatsapp._6;
        r0 = r18;
        r3.<init>(r0);
        r2.setOnClickListener(r3);
        r2 = 2131427850; // 0x7f0b020a float:1.8477328E38 double:1.0530652773E-314;
        r0 = r18;
        r2 = r0.findViewById(r2);
        r3 = new com.whatsapp.az5;
        r0 = r18;
        r3.<init>(r0);
        r2.setOnClickListener(r3);
        r3 = 0;
        r2 = 0;
        r0 = r18;
        r4 = r0.k;	 Catch:{ NoSuchMethodException -> 0x0231 }
        r4 = r4.getClass();	 Catch:{ NoSuchMethodException -> 0x0231 }
        r5 = z;	 Catch:{ NoSuchMethodException -> 0x0231 }
        r6 = 3;
        r5 = r5[r6];	 Catch:{ NoSuchMethodException -> 0x0231 }
        r6 = 0;
        r6 = new java.lang.Class[r6];	 Catch:{ NoSuchMethodException -> 0x0231 }
        r2 = r4.getMethod(r5, r6);	 Catch:{ NoSuchMethodException -> 0x0231 }
    L_0x01f4:
        if (r2 == 0) goto L_0x0233;
    L_0x01f6:
        r4 = 0;
        r0 = r18;
        r5 = r0.k;	 Catch:{ IllegalAccessException -> 0x022a, InvocationTargetException -> 0x022f }
        r6 = 0;
        r6 = new java.lang.Object[r6];	 Catch:{ IllegalAccessException -> 0x022a, InvocationTargetException -> 0x022f }
        r2 = r2.invoke(r5, r6);	 Catch:{ IllegalAccessException -> 0x022a, InvocationTargetException -> 0x022f }
        r2 = (android.widget.ZoomButtonsController) r2;	 Catch:{ IllegalAccessException -> 0x022a, InvocationTargetException -> 0x022f }
    L_0x0204:
        if (r2 == 0) goto L_0x0233;
    L_0x0206:
        r2 = r2.getZoomControls();
    L_0x020a:
        if (r2 == 0) goto L_0x021c;
    L_0x020c:
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = com.whatsapp.am1.a();	 Catch:{ NoSuchMethodException -> 0x022d }
        r6 = r6.g;	 Catch:{ NoSuchMethodException -> 0x022d }
        r7 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r6 = r6 * r7;
        r6 = (int) r6;	 Catch:{ NoSuchMethodException -> 0x022d }
        r2.setPadding(r3, r4, r5, r6);	 Catch:{ NoSuchMethodException -> 0x022d }
    L_0x021c:
        r2 = com.whatsapp.App.aJ;
        r0 = r18;
        r3 = r0.e;
        r2.b(r3);
        return;
    L_0x0226:
        r2 = move-exception;
        throw r2;	 Catch:{ NoSuchMethodException -> 0x0228 }
    L_0x0228:
        r2 = move-exception;
        throw r2;
    L_0x022a:
        r2 = move-exception;
    L_0x022b:
        r2 = r4;
        goto L_0x0204;
    L_0x022d:
        r2 = move-exception;
        throw r2;
    L_0x022f:
        r2 = move-exception;
        goto L_0x022b;
    L_0x0231:
        r4 = move-exception;
        goto L_0x01f4;
    L_0x0233:
        r2 = r3;
        goto L_0x020a;
    L_0x0235:
        r4 = r2;
        goto L_0x00df;
    L_0x0238:
        r2 = r4;
        goto L_0x0105;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatRecentLocationsActivity.onCreate(android.os.Bundle):void");
    }

    static TextView j(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.g;
    }

    static String g(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.h;
    }

    static int c(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        int i = groupChatRecentLocationsActivity.a;
        groupChatRecentLocationsActivity.a = i + 1;
        return i;
    }

    private void b() {
        if (this.a == -1 && this.i.getMyLocation() == null) {
            this.a = 0;
        }
        if (this.a == -1) {
            this.k.getController().animateTo(this.i.getMyLocation());
            this.k.getController().setZoom(17);
            this.g.setText(getString(R.string.my_location));
            if (App.az == 0) {
                return;
            }
        }
        if (this.a < this.c.size()) {
            b bVar = (b) this.c.get(this.a);
            this.k.getController().animateTo(new GeoPoint((int) (bVar.K * 1000000.0d), (int) (bVar.G * 1000000.0d)));
            this.k.getController().setZoom(17);
            this.g.setText(getString(R.string.location_i_of_n, new Object[]{Integer.valueOf(this.a + 1), Integer.valueOf(this.c.size())}));
        }
    }

    public void a(GeoPoint geoPoint, int i, int i2) {
        if (this.f != this.k.getZoomLevel()) {
            this.f = this.k.getZoomLevel();
            a();
        }
    }

    static m8 e(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.l;
    }

    static int a(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        int i = groupChatRecentLocationsActivity.a;
        groupChatRecentLocationsActivity.a = i - 1;
        return i;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z = false;
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                GoogleMapView googleMapView = this.k;
                if (!this.k.isSatellite()) {
                    z = true;
                }
                googleMapView.setSatellite(z);
                return true;
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }

    static int k(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.a;
    }

    static m8 a(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity, m8 m8Var) {
        groupChatRecentLocationsActivity.l = m8Var;
        return m8Var;
    }

    static MyLocationOverlay i(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        return groupChatRecentLocationsActivity.i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.view.View r6, com.whatsapp.protocol.b r7) {
        /*
        r5_this = this;
        r0 = com.whatsapp.App.P;
        r1 = r7.F;
        r1 = r0.a(r1);
        r0 = 2131427627; // 0x7f0b012b float:1.8476876E38 double:1.053065167E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = r1.a(r5);
        r0.setText(r2);
        r0 = 2131427628; // 0x7f0b012c float:1.8476878E38 double:1.0530651676E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r2 = com.whatsapp.App.f(r7);
        r2 = com.whatsapp.util.bm.m(r5, r2);
        r0.setText(r2);
        r0 = 2131427626; // 0x7f0b012a float:1.8476874E38 double:1.0530651666E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r2 = r5.getResources();
        r3 = 2131361881; // 0x7f0a0059 float:1.8343527E38 double:1.0530326843E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r3 = r5.getResources();
        r4 = 2131361880; // 0x7f0a0058 float:1.8343525E38 double:1.053032684E-314;
        r3 = r3.getDimension(r4);
        r4 = 1;
        r2 = r1.a(r2, r3, r4);
        if (r2 == 0) goto L_0x0059;
    L_0x0052:
        r0.setImageBitmap(r2);
        r2 = com.whatsapp.App.az;
        if (r2 == 0) goto L_0x0060;
    L_0x0059:
        r1 = r1.k();
        r0.setImageResource(r1);
    L_0x0060:
        r0 = r7.F;
        r6.setTag(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatRecentLocationsActivity.a(android.view.View, com.whatsapp.protocol.b):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, (int) R.string.map_type).setIcon((int) R.drawable.button_layers).setShowAsAction(2);
        if (App.G == 3) {
            g.b((Activity) this);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.app.Dialog onCreateDialog(int r7) {
        /*
        r6_this = this;
        r5 = 0;
        r4 = 1;
        switch(r7) {
            case 0: goto L_0x0007;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = 0;
    L_0x0006:
        return r0;
    L_0x0007:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 2131624525; // 0x7f0e024d float:1.8876232E38 double:1.0531624476E-314;
        r2 = new java.lang.Object[r4];
        r3 = r6.l;
        r3 = r3.a(r6);
        r2[r5] = r3;
        r1 = r6.getString(r1, r2);
        r0.add(r1);
        r1 = 2131624048; // 0x7f0e0070 float:1.8875265E38 double:1.053162212E-314;
        r2 = new java.lang.Object[r4];
        r3 = r6.l;
        r3 = r3.a(r6);
        r2[r5] = r3;
        r1 = r6.getString(r1, r2);
        r0.add(r1);
        r1 = r6.l;
        r1 = r1.h;
        if (r1 == 0) goto L_0x0052;
    L_0x003a:
        r1 = 2131625076; // 0x7f0e0474 float:1.887735E38 double:1.05316272E-314;
        r2 = new java.lang.Object[r4];
        r3 = r6.l;
        r3 = r3.a(r6);
        r2[r5] = r3;
        r1 = r6.getString(r1, r2);
        r0.add(r1);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0066;
    L_0x0052:
        r1 = 2131623974; // 0x7f0e0026 float:1.8875115E38 double:1.0531621754E-314;
        r1 = r6.getString(r1);
        r0.add(r1);
        r1 = 2131623977; // 0x7f0e0029 float:1.887512E38 double:1.053162177E-314;
        r1 = r6.getString(r1);
        r0.add(r1);
    L_0x0066:
        r1 = r0.size();
        r1 = new java.lang.String[r1];
        r0.toArray(r1);
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r6);
        r2 = new com.whatsapp.dn;
        r2.<init>(r6);
        r0.setItems(r1, r2);
        r0 = r0.create();
        r0.requestWindowFeature(r4);
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatRecentLocationsActivity.onCreateDialog(int):android.app.Dialog");
    }

    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        DialogToastActivity.a(menuItem);
        return super.onMenuItemSelected(i, menuItem);
    }
}
