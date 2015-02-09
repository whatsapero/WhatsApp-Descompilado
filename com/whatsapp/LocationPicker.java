package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockMapActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MyLocationOverlay;
import com.whatsapp.util.bw;
import com.whatsapp.util.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class LocationPicker extends SherlockMapActivity implements on {
    private static long j;
    private static boolean o;
    private static final String[] z;
    private Location a;
    private TextView b;
    private TextView c;
    private boolean d;
    private MyLocationOverlay e;
    private as4 f;
    private atb g;
    private ak1 h;
    private Runnable i;
    private bw k;
    private Handler l;
    private String m;
    private sj n;
    private ProgressBar p;
    private GoogleMapView q;
    private boolean r;
    private PlaceInfo s;
    private ListView t;
    private Button u;

    static boolean f(LocationPicker locationPicker) {
        return locationPicker.r;
    }

    static PlaceInfo a(LocationPicker locationPicker, PlaceInfo placeInfo) {
        locationPicker.s = placeInfo;
        return placeInfo;
    }

    static long c() {
        return j;
    }

    static long a(long j) {
        j = j;
        return j;
    }

    static PlaceInfo d(LocationPicker locationPicker) {
        return locationPicker.s;
    }

    static Button a(LocationPicker locationPicker) {
        return locationPicker.u;
    }

    protected void onPause() {
        super.onPause();
        this.e.disableMyLocation();
    }

    static as4 m(LocationPicker locationPicker) {
        return locationPicker.f;
    }

    static void k(LocationPicker locationPicker) {
        locationPicker.a();
    }

    static TextView g(LocationPicker locationPicker) {
        return locationPicker.c;
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.n /*2*/:
                return new Builder(this).setTitle(R.string.gps_required_title).setMessage(R.string.gps_required_body).setCancelable(true).setPositiveButton(R.string.ok, new i9(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static boolean i(LocationPicker locationPicker) {
        return locationPicker.d;
    }

    public void a(GeoPoint geoPoint, int i, int i2) {
    }

    private void a(Location location, int i, String str, boolean z) {
        this.l.removeCallbacks(this.i);
        this.p.setVisibility(0);
        findViewById(R.id.places_empty).setVisibility(8);
        this.t.removeFooterView(this.b);
        this.g = new atb();
        this.n.notifyDataSetChanged();
        this.h = new ak1(this, location, i, str, z);
        a5w.a(this.h, new Void[0]);
    }

    static ListView o(LocationPicker locationPicker) {
        return locationPicker.t;
    }

    static sj n(LocationPicker locationPicker) {
        return locationPicker.n;
    }

    public void onNewIntent(Intent intent) {
        if (z[15].equals(intent.getAction())) {
            a(this.q.c(), Math.max(this.q.b(), 1500), intent.getStringExtra(z[16]), true);
        }
    }

    static boolean a(LocationPicker locationPicker, boolean z) {
        locationPicker.r = z;
        return z;
    }

    static boolean b() {
        return o;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, (int) R.string.search).setIcon((int) R.drawable.ic_action_search).setShowAsAction(2);
        menu.add(0, 1, 0, (int) R.string.refresh).setIcon((int) R.drawable.ic_action_refresh).setShowAsAction(1);
        if (App.G == 3) {
            g.b((Activity) this);
        }
        return true;
    }

    static atb p(LocationPicker locationPicker) {
        return locationPicker.g;
    }

    static boolean b(LocationPicker locationPicker, boolean z) {
        locationPicker.d = z;
        return z;
    }

    static String b(LocationPicker locationPicker) {
        return locationPicker.m;
    }

    protected boolean isRouteDisplayed() {
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                onSearchRequested();
                return true;
            case ay.f /*1*/:
                this.d = false;
                a(this.q.c(), this.q.b(), null, false);
                return true;
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }

    static boolean a(boolean z) {
        o = z;
        return z;
    }

    static Location a(LocationPicker locationPicker, Location location) {
        locationPicker.a = location;
        return location;
    }

    static {
        String[] strArr = new String[18];
        String str = "\u007f\u0011:";
        boolean z = true;
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
                        i3 = 97;
                        break;
                    case ay.n /*2*/:
                        i3 = 73;
                        break;
                    case ay.p /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 81;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "$\u0003w";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "t\u000e*\u001f%q\u000e'";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "b\u000e&\u0013";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "t\u000e'";
                    z = true;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "y\u0003&\f%q\u000f.^5m\u0004i\n>8\u000f(\n8n\u0004i\u00128z\u0013(\f8}\u0012i\u00138k\u0012 \u00106";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "t\u0000=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "t\u000e*\u001f%q\u000e'\u000e8{\n,\f~{\u0013,\u001f%}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "$N+@";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "v\u0004=\t>j\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "r\b-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "t\u0000=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "b\u000e&\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "t\u000e'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "y\u000f-\f>q\u0005g\u0017?l\u0004'\n\u007fy\u0002=\u0017>vO\u001a;\u0010J\"\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "i\u0014,\f(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "$\u0000i\u0016#}\u0007tY9l\u00159\rk7N/\u0011$j\u00128\u000b0j\u0004g\u001d>uNn@7w\u0014;\r m\u0000;\u001bm7\u0000w";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    z = strArr3;
                    j = 0;
                    o = false;
                default:
                    strArr2[i] = str;
                    str = "H\r(\u001d4k";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    static GoogleMapView e(LocationPicker locationPicker) {
        return locationPicker.q;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        GeoPoint mapCenter = this.q.getMapCenter();
        bundle.putInt(z[12], mapCenter.getLatitudeE6());
        bundle.putInt(z[14], mapCenter.getLongitudeE6());
        bundle.putInt(z[13], this.q.getZoomLevel());
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.l != null) {
            this.l.removeCallbacks(this.i);
        }
        if (this.h != null) {
            this.h.cancel(true);
            this.h = null;
        }
        this.k.a();
    }

    static ProgressBar h(LocationPicker locationPicker) {
        return locationPicker.p;
    }

    static Location c(LocationPicker locationPicker) {
        return locationPicker.a;
    }

    protected void onResume() {
        super.onResume();
        this.e.enableMyLocation();
    }

    static atb a(LocationPicker locationPicker, atb com_whatsapp_atb) {
        locationPicker.g = com_whatsapp_atb;
        return com_whatsapp_atb;
    }

    public LocationPicker() {
        this.d = true;
    }

    public Object onRetainNonConfigurationInstance() {
        return this.g;
    }

    static void a(LocationPicker locationPicker, Location location, int i, String str, boolean z) {
        locationPicker.a(location, i, str, z);
    }

    static bw j(LocationPicker locationPicker) {
        return locationPicker.k;
    }

    private void a() {
        String str;
        if (this.g == null) {
            str = null;
        } else if (this.g.j == 2) {
            str = getString(R.string.location_data_provided_by_fousquare, new Object[]{z[17]});
        } else {
            str = this.g.g;
        }
        this.t.removeFooterView(this.b);
        if (str != null) {
            this.b.setText(Html.fromHtml(str));
            this.t.addFooterView(this.b, null, true);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
        r11_this = this;
        r10 = 2;
        r9 = 0;
        r2 = 8;
        r8 = 1;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        super.onCreate(r12);
        r0 = z;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r11.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r8);
        r0 = com.whatsapp.util.WhatsAppLibLoader.a(r9);
        if (r0 != 0) goto L_0x002b;
    L_0x001f:
        r0 = z;
        r1 = 6;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r11.finish();
    L_0x002a:
        return;
    L_0x002b:
        r0 = com.whatsapp.App.an;
        if (r0 != 0) goto L_0x0033;
    L_0x002f:
        r11.finish();
        goto L_0x002a;
    L_0x0033:
        r0 = r11.getIntent();
        r4 = z;
        r5 = 11;
        r4 = r4[r5];
        r0 = r0.getStringExtra(r4);
        r11.m = r0;
        r0 = r11.getLastNonConfigurationInstance();
        r0 = (com.whatsapp.atb) r0;
        r11.g = r0;
        r0 = r11.getLayoutInflater();
        r4 = 2130903161; // 0x7f030079 float:1.7413132E38 double:1.0528060465E-314;
        r0 = com.whatsapp.b7.a(r0, r4, r9, r1);
        r11.setContentView(r0);
        r0 = 2131427877; // 0x7f0b0225 float:1.8477383E38 double:1.0530652906E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r11.c = r0;
        r0 = new com.whatsapp.GoogleMapView;
        r0.<init>(r11);
        r11.q = r0;
        r0 = r11.q;
        r0.setClickable(r8);
        r0 = r11.q;
        r0.setEnabled(r8);
        r0 = r11.q;
        r0.setMapListener(r11);
        r0 = r11.q;
        r0.setBuiltInZoomControls(r1);
        r0 = r11.q;
        r0 = r0.getController();
        r4 = 18;
        r0.setZoom(r4);
        r0 = 2131427845; // 0x7f0b0205 float:1.8477318E38 double:1.053065275E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r4 = r11.q;
        r0.addView(r4);
        r0 = new com.whatsapp.ev;
        r4 = r11.q;
        r0.<init>(r11, r11, r4);
        r11.e = r0;
        r0 = new android.os.Handler;
        r0.<init>();
        r11.l = r0;
        r0 = new com.whatsapp.x3;
        r0.<init>(r11);
        r11.i = r0;
        r0 = r11.g;
        if (r0 != 0) goto L_0x00c8;
    L_0x00b3:
        r0 = r11.e;
        r4 = new com.whatsapp.bj;
        r4.<init>(r11);
        r0.runOnFirstFix(r4);
        r0 = r11.l;
        r4 = r11.i;
        r6 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        r0.postDelayed(r4, r6);
        if (r3 == 0) goto L_0x0143;
    L_0x00c8:
        if (r12 == 0) goto L_0x0100;
    L_0x00ca:
        r0 = z;
        r4 = 4;
        r0 = r0[r4];
        r0 = r12.getInt(r0);
        if (r0 <= 0) goto L_0x00fe;
    L_0x00d5:
        r4 = new com.google.android.maps.GeoPoint;
        r5 = z;
        r6 = 7;
        r5 = r5[r6];
        r5 = r12.getInt(r5);
        r6 = z;
        r7 = 5;
        r6 = r6[r7];
        r6 = r12.getInt(r6);
        r4.<init>(r5, r6);
        r5 = r11.q;
        r5 = r5.getController();
        r5.setCenter(r4);
        r4 = r11.q;
        r4 = r4.getController();
        r4.setZoom(r0);
    L_0x00fe:
        if (r3 == 0) goto L_0x0113;
    L_0x0100:
        r0 = r11.g;
        r0 = r0.m;
        if (r0 == 0) goto L_0x0113;
    L_0x0106:
        r0 = r11.q;
        r4 = r11.g;
        r4 = r4.m;
        r4 = com.whatsapp.GoogleMapView.a(r4);
        r0.a(r4);
    L_0x0113:
        r0 = r11.g;
        r0 = r0.e;
        if (r0 == 0) goto L_0x013b;
    L_0x0119:
        r0 = "";
        r4 = r11.g;
        r4 = r4.e;
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x013b;
    L_0x0125:
        r0 = r11.c;
        r4 = 2131624680; // 0x7f0e02e8 float:1.8876547E38 double:1.053162524E-314;
        r5 = new java.lang.Object[r8];
        r6 = r11.g;
        r6 = r6.e;
        r5[r1] = r6;
        r4 = r11.getString(r4, r5);
        r0.setText(r4);
        if (r3 == 0) goto L_0x0143;
    L_0x013b:
        r0 = r11.c;
        r3 = 2131624678; // 0x7f0e02e6 float:1.8876542E38 double:1.053162523E-314;
        r0.setText(r3);
    L_0x0143:
        r0 = new com.whatsapp.as4;
        r0.<init>(r11);
        r11.f = r0;
        r0 = r11.f;
        r0.a();
        r0 = r11.q;
        r0 = r0.getOverlays();
        r3 = r11.f;
        r0.add(r3);
        r0 = r11.q;
        r0 = r0.getOverlays();
        r3 = r11.e;
        r0.add(r3);
        r0 = 2131427875; // 0x7f0b0223 float:1.8477379E38 double:1.0530652896E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r11.u = r0;
        r0 = r11.u;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r4 = r4[r10];
        r3 = r3.append(r4);
        r4 = 2131624824; // 0x7f0e0378 float:1.8876839E38 double:1.0531625954E-314;
        r4 = r11.getString(r4);
        r3 = r3.append(r4);
        r4 = z;
        r5 = 9;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.toString();
        r3 = android.text.Html.fromHtml(r3);
        r0.setText(r3);
        r0 = r11.u;
        r3 = new com.whatsapp.u1;
        r3.<init>(r11);
        r0.setOnClickListener(r3);
        r0 = new com.whatsapp.sj;
        r0.<init>(r11, r11);
        r11.n = r0;
        r0 = 2131427878; // 0x7f0b0226 float:1.8477385E38 double:1.053065291E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r11.t = r0;
        r0 = new android.widget.TextView;
        r0.<init>(r11);
        r11.b = r0;
        r0 = r11.b;
        r3 = android.text.method.LinkMovementMethod.getInstance();
        r0.setMovementMethod(r3);
        r0 = r11.b;
        r3 = 17;
        r0.setGravity(r3);
        r0 = r11.b;
        r3 = com.whatsapp.am1.a();
        r3 = r3.C;
        r3 = (int) r3;
        r4 = com.whatsapp.am1.a();
        r4 = r4.C;
        r4 = (int) r4;
        r0.setPadding(r3, r1, r4, r1);
        r0 = r11.t;
        r0.setFooterDividersEnabled(r8);
        r0 = r11.t;
        r3 = r11.b;
        r0.addFooterView(r3, r9, r8);
        r0 = r11.t;
        r3 = r11.n;
        r0.setAdapter(r3);
        r11.a();
        r0 = r11.t;
        r3 = new com.whatsapp.a8m;
        r3.<init>(r11);
        r0.setOnItemClickListener(r3);
        r0 = 2131427741; // 0x7f0b019d float:1.8477107E38 double:1.0530652234E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r11.p = r0;
        r3 = r11.p;
        r0 = r11.g;
        if (r0 != 0) goto L_0x0295;
    L_0x0216:
        r0 = r1;
    L_0x0217:
        r3.setVisibility(r0);
        r0 = 2131427874; // 0x7f0b0222 float:1.8477377E38 double:1.053065289E-314;
        r0 = r11.findViewById(r0);
        r0.setVisibility(r2);
        r0 = 2131427846; // 0x7f0b0206 float:1.847732E38 double:1.0530652753E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r2 = 2130837724; // 0x7f0200dc float:1.728041E38 double:1.0527737163E-314;
        r0.setImageResource(r2);
        r2 = new com.whatsapp.avo;
        r2.<init>(r11);
        r0.setOnClickListener(r2);
        r0 = com.whatsapp.App.aa;
        r2 = 3;
        if (r0 != r2) goto L_0x024a;
    L_0x0240:
        r0 = r11.u;
        r2 = new com.whatsapp.kd;
        r2.<init>(r11);
        r0.setOnLongClickListener(r2);
    L_0x024a:
        if (r12 != 0) goto L_0x0270;
    L_0x024c:
        r0 = z;
        r2 = 3;
        r0 = r0[r2];
        r0 = r11.getSystemService(r0);
        r0 = (android.location.LocationManager) r0;
        r2 = z;
        r2 = r2[r1];
        r2 = r0.isProviderEnabled(r2);
        if (r2 != 0) goto L_0x0270;
    L_0x0261:
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r0 = r0.isProviderEnabled(r2);
        if (r0 != 0) goto L_0x0270;
    L_0x026d:
        r11.showDialog(r10);
    L_0x0270:
        r0 = new java.io.File;
        r2 = com.whatsapp.App.p;
        r2 = r2.getCacheDir();
        r3 = z;
        r3 = r3[r8];
        r0.<init>(r2, r3);
        r0.mkdirs();
        r2 = new com.whatsapp.util.bw;
        r3 = com.whatsapp.am1.a();
        r3 = r3.g;
        r4 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r3 = r3 * r4;
        r3 = (int) r3;
        r2.<init>(r1, r1, r3, r0);
        r11.k = r2;
        goto L_0x002a;
    L_0x0295:
        r0 = r2;
        goto L_0x0217;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationPicker.onCreate(android.os.Bundle):void");
    }

    public boolean onSearchRequested() {
        String str;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.map_frame);
        if (viewGroup != null) {
            viewGroup.setLayoutParams(new LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
        }
        if (this.g == null) {
            str = null;
        } else {
            str = this.g.e;
        }
        startSearch(str, true, null, false);
        return true;
    }

    static MyLocationOverlay l(LocationPicker locationPicker) {
        return locationPicker.e;
    }
}
