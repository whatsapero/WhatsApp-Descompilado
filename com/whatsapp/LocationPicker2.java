package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Html;
import android.text.TextUtils;
import android.util.FloatMath;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.whatsapp.fieldstats.a6;
import com.whatsapp.fieldstats.af;
import com.whatsapp.fieldstats.ap;
import com.whatsapp.util.bw;
import com.whatsapp.util.g;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class LocationPicker2 extends DialogToastActivity implements ConnectionCallbacks, OnConnectionFailedListener, LocationListener {
    private static final LocationRequest P;
    private static final String[] bb;
    private static long j;
    private float A;
    private int B;
    private GoogleApiClient C;
    private long D;
    private View E;
    private float F;
    private boolean G;
    private a_q H;
    private View I;
    private TextView J;
    private ProgressBar K;
    private boolean L;
    private View M;
    private Handler N;
    private Location O;
    private TextView Q;
    private atb R;
    private ProgressBar S;
    private BitmapDescriptor T;
    private View U;
    private boolean V;
    private int W;
    private bw X;
    private GoogleMapView2 Y;
    private PlaceInfo Z;
    private String aa;
    private Handler ab;
    private Bitmap ac;
    private ListView k;
    private int l;
    private ImageView m;
    private Bitmap n;
    private nr o;
    private Button p;
    private TextView q;
    private HandlerThread r;
    private boolean s;
    private cm t;
    private PlaceInfo u;
    private af v;
    private View w;
    private GoogleMap x;
    private Runnable y;
    private BitmapDescriptor z;

    class AnonymousClass_3 extends GoogleMapView2 {
        final LocationPicker2 n;

        AnonymousClass_3(LocationPicker2 locationPicker2, Context context, GoogleMapOptions googleMapOptions) {
            this.n = locationPicker2;
            super(context, googleMapOptions);
        }

        public void a(int i) {
            int i2 = App.az;
            switch (i) {
                case PBE.MD5 /*0*/:
                    LocationPicker2.e(this.n).setImageResource(R.drawable.btn_compass_mode_tilt);
                    if (i2 == 0) {
                        return;
                    }
                    break;
                case ay.f /*1*/:
                    break;
                case ay.n /*2*/:
                    break;
                default:
                    return;
            }
            LocationPicker2.e(this.n).setImageResource(R.drawable.btn_compass_mode);
            if (i2 == 0) {
                return;
            }
            LocationPicker2.e(this.n).setImageResource(R.drawable.btn_myl);
        }
    }

    static TextView d(LocationPicker2 locationPicker2) {
        return locationPicker2.J;
    }

    static boolean c(LocationPicker2 locationPicker2, boolean z) {
        locationPicker2.G = z;
        return z;
    }

    static void a(LocationPicker2 locationPicker2, a6 a6Var) {
        locationPicker2.a(a6Var);
    }

    public boolean onSearchRequested() {
        String str;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.map_frame);
        if (viewGroup != null) {
            viewGroup.setLayoutParams(new LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
        }
        if (this.R == null) {
            str = null;
        } else {
            str = this.R.e;
        }
        startSearch(str, true, null, false);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.Y.onSaveInstanceState(bundle);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r11) {
        /*
        r10_this = this;
        r9 = 3;
        r8 = 0;
        r2 = 2;
        r3 = 0;
        r1 = 1;
        r4 = com.whatsapp.App.az;
        super.onCreate(r11);
        r0 = bb;
        r5 = 10;
        r0 = r0[r5];
        com.whatsapp.util.Log.i(r0);
        r0 = r10.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r1);
        r0 = com.whatsapp.util.WhatsAppLibLoader.a(r8);
        if (r0 != 0) goto L_0x002c;
    L_0x0020:
        r0 = bb;
        r1 = 5;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r10.finish();
    L_0x002b:
        return;
    L_0x002c:
        r0 = com.whatsapp.App.an;
        if (r0 != 0) goto L_0x0034;
    L_0x0030:
        r10.finish();
        goto L_0x002b;
    L_0x0034:
        r0 = com.whatsapp.App.af();
        if (r0 == 0) goto L_0x0053;
    L_0x003a:
        r5 = r0.length();
        if (r5 <= r1) goto L_0x0053;
    L_0x0040:
        r5 = r0.length();
        r5 = r5 + -2;
        r0 = r0.charAt(r5);
        r0 = r0 + -48;
        r0 = r0 % 2;
        if (r0 != r1) goto L_0x0324;
    L_0x0050:
        r0 = r1;
    L_0x0051:
        r10.B = r0;
    L_0x0053:
        r0 = new com.google.android.gms.common.api.GoogleApiClient$Builder;
        r0.<init>(r10);
        r5 = com.google.android.gms.location.LocationServices.API;
        r0 = r0.addApi(r5);
        r0 = r0.addConnectionCallbacks(r10);
        r0 = r0.addOnConnectionFailedListener(r10);
        r0 = r0.build();
        r10.C = r0;
        r0 = r10.getIntent();
        r5 = bb;
        r6 = 6;
        r5 = r5[r6];
        r0 = r0.getStringExtra(r5);
        r10.aa = r0;
        r0 = r10.getLastNonConfigurationInstance();
        r0 = (com.whatsapp.atb) r0;
        r10.R = r0;
        r0 = r10.getLayoutInflater();
        r5 = 2130903161; // 0x7f030079 float:1.7413132E38 double:1.0528060465E-314;
        r0 = com.whatsapp.b7.a(r0, r5, r8, r3);
        r10.setContentView(r0);
        r0 = 2131427877; // 0x7f0b0225 float:1.8477383E38 double:1.0530652906E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.q = r0;
        r0 = r10.q;
        com.whatsapp.am1.b(r0);
        r0 = 2131427867; // 0x7f0b021b float:1.8477362E38 double:1.0530652857E-314;
        r0 = r10.findViewById(r0);
        r10.M = r0;
        r0 = 2131427871; // 0x7f0b021f float:1.847737E38 double:1.0530652876E-314;
        r0 = r10.findViewById(r0);
        r10.I = r0;
        r0 = r10.I;
        r5 = new com.whatsapp.a8;
        r5.<init>(r10);
        r0.setOnClickListener(r5);
        r0 = 2131427872; // 0x7f0b0220 float:1.8477373E38 double:1.053065288E-314;
        r0 = r10.findViewById(r0);
        r10.E = r0;
        r0 = 2131427868; // 0x7f0b021c float:1.8477364E38 double:1.053065286E-314;
        r0 = r10.findViewById(r0);
        r10.w = r0;
        r0 = 2131427870; // 0x7f0b021e float:1.8477368E38 double:1.053065287E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.J = r0;
        r0 = r10.J;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = bb;
        r6 = r6[r2];
        r5 = r5.append(r6);
        r6 = 2131624823; // 0x7f0e0377 float:1.8876837E38 double:1.053162595E-314;
        r6 = r10.getString(r6);
        r5 = r5.append(r6);
        r6 = bb;
        r7 = 12;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.toString();
        r5 = android.text.Html.fromHtml(r5);
        r0.setText(r5);
        r0 = r10.J;
        r5 = new com.whatsapp._0;
        r5.<init>(r10);
        r0.setOnClickListener(r5);
        r0 = 2131427876; // 0x7f0b0224 float:1.847738E38 double:1.05306529E-314;
        r0 = r10.findViewById(r0);
        r10.U = r0;
        com.google.android.gms.maps.MapsInitializer.initialize(r10);
        r0 = -16725933; // 0xffffffffff00c853 float:-1.7118133E38 double:NaN;
        r0 = a(r10, r0);
        r10.ac = r0;
        r0 = r10.ac;
        r0 = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(r0);
        r10.z = r0;
        r0 = -769226; // 0xfffffffffff44336 float:NaN double:NaN;
        r0 = a(r10, r0);
        r10.n = r0;
        r0 = r10.n;
        r0 = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(r0);
        r10.T = r0;
        r0 = new com.google.android.gms.maps.GoogleMapOptions;
        r0.<init>();
        r5 = r0.mapType(r1);
        r5 = r5.mapToolbarEnabled(r3);
        r5 = r5.zoomControlsEnabled(r3);
        r5 = r5.zoomGesturesEnabled(r1);
        r5 = r5.compassEnabled(r3);
        r5 = r5.rotateGesturesEnabled(r1);
        r5.tiltGesturesEnabled(r1);
        r5 = new com.whatsapp.LocationPicker2$3;
        r5.<init>(r10, r10, r0);
        r10.Y = r5;
        r0 = 2131427845; // 0x7f0b0205 float:1.8477318E38 double:1.053065275E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r5 = r10.Y;
        r0.addView(r5);
        r0 = r10.Y;
        r0.onCreate(r11);
        r10.f();
        r0 = new android.os.Handler;
        r0.<init>();
        r10.N = r0;
        r0 = new com.whatsapp.u0;
        r0.<init>(r10);
        r10.y = r0;
        r0 = r10.R;
        if (r0 != 0) goto L_0x019b;
    L_0x0190:
        r0 = r10.N;
        r5 = r10.y;
        r6 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        r0.postDelayed(r5, r6);
        if (r4 == 0) goto L_0x01c3;
    L_0x019b:
        r0 = r10.R;
        r0 = r0.e;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x01bb;
    L_0x01a5:
        r0 = r10.q;
        r5 = 2131624680; // 0x7f0e02e8 float:1.8876547E38 double:1.053162524E-314;
        r6 = new java.lang.Object[r1];
        r7 = r10.R;
        r7 = r7.e;
        r6[r3] = r7;
        r5 = r10.getString(r5, r6);
        r0.setText(r5);
        if (r4 == 0) goto L_0x01c3;
    L_0x01bb:
        r0 = r10.q;
        r4 = 2131624678; // 0x7f0e02e6 float:1.8876542E38 double:1.053162523E-314;
        r0.setText(r4);
    L_0x01c3:
        r0 = 2131427875; // 0x7f0b0223 float:1.8477379E38 double:1.0530652896E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r10.p = r0;
        r0 = r10.p;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = bb;
        r5 = r5[r9];
        r4 = r4.append(r5);
        r5 = 2131624824; // 0x7f0e0378 float:1.8876839E38 double:1.0531625954E-314;
        r5 = r10.getString(r5);
        r4 = r4.append(r5);
        r5 = bb;
        r6 = 8;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.toString();
        r4 = android.text.Html.fromHtml(r4);
        r0.setText(r4);
        r0 = r10.p;
        r4 = new com.whatsapp.ml;
        r4.<init>(r10);
        r0.setOnClickListener(r4);
        r0 = new com.whatsapp.nr;
        r0.<init>(r10, r10);
        r10.o = r0;
        r0 = 2131427878; // 0x7f0b0226 float:1.8477385E38 double:1.053065291E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r10.k = r0;
        r0 = new android.widget.TextView;
        r0.<init>(r10);
        r10.Q = r0;
        r0 = r10.Q;
        r4 = android.text.method.LinkMovementMethod.getInstance();
        r0.setMovementMethod(r4);
        r0 = r10.Q;
        r4 = 17;
        r0.setGravity(r4);
        r0 = r10.Q;
        r4 = com.whatsapp.am1.a();
        r4 = r4.C;
        r4 = (int) r4;
        r5 = com.whatsapp.am1.a();
        r5 = r5.C;
        r5 = (int) r5;
        r0.setPadding(r4, r3, r5, r3);
        r0 = r10.k;
        r0.setFooterDividersEnabled(r1);
        r0 = r10.k;
        r4 = r10.Q;
        r0.addFooterView(r4, r8, r1);
        r0 = r10.k;
        r1 = r10.o;
        r0.setAdapter(r1);
        r10.a();
        r0 = r10.k;
        r1 = new com.whatsapp.n6;
        r1.<init>(r10);
        r0.setOnItemClickListener(r1);
        r0 = 2131427741; // 0x7f0b019d float:1.8477107E38 double:1.0530652234E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r10.S = r0;
        r1 = r10.S;
        r0 = r10.R;
        if (r0 != 0) goto L_0x0327;
    L_0x0274:
        r0 = r3;
    L_0x0275:
        r1.setVisibility(r0);
        r0 = 2131427873; // 0x7f0b0221 float:1.8477375E38 double:1.0530652886E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r10.K = r0;
        r0 = com.whatsapp.App.aa;
        if (r0 != r9) goto L_0x0291;
    L_0x0287:
        r0 = r10.p;
        r1 = new com.whatsapp.alh;
        r1.<init>(r10);
        r0.setOnLongClickListener(r1);
    L_0x0291:
        if (r11 != 0) goto L_0x02b9;
    L_0x0293:
        r0 = bb;
        r1 = 13;
        r0 = r0[r1];
        r0 = r10.getSystemService(r0);
        r0 = (android.location.LocationManager) r0;
        r1 = bb;
        r4 = 4;
        r1 = r1[r4];
        r1 = r0.isProviderEnabled(r1);
        if (r1 != 0) goto L_0x02b9;
    L_0x02aa:
        r1 = bb;
        r4 = 9;
        r1 = r1[r4];
        r0 = r0.isProviderEnabled(r1);
        if (r0 != 0) goto L_0x02b9;
    L_0x02b6:
        r10.showDialog(r2);
    L_0x02b9:
        r0 = 2131427874; // 0x7f0b0222 float:1.8477377E38 double:1.053065289E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = new com.whatsapp.f7;
        r1.<init>(r10, r0);
        r0.setOnClickListener(r1);
        r0 = 2131427846; // 0x7f0b0206 float:1.847732E38 double:1.0530652753E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r10.m = r0;
        r0 = r10.m;
        r1 = new com.whatsapp.q8;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
        r0 = new java.io.File;
        r1 = com.whatsapp.App.p;
        r1 = r1.getCacheDir();
        r2 = bb;
        r4 = 11;
        r2 = r2[r4];
        r0.<init>(r1, r2);
        r0.mkdirs();
        r1 = new com.whatsapp.util.bw;
        r2 = com.whatsapp.am1.a();
        r2 = r2.g;
        r4 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r2 = r2 * r4;
        r2 = (int) r2;
        r1.<init>(r3, r3, r2, r0);
        r10.X = r1;
        r0 = new android.os.HandlerThread;
        r1 = bb;
        r2 = 7;
        r1 = r1[r2];
        r0.<init>(r1);
        r10.r = r0;
        r0 = r10.r;
        r0.start();
        r0 = new android.os.Handler;
        r1 = r10.r;
        r1 = r1.getLooper();
        r0.<init>(r1);
        r10.ab = r0;
        goto L_0x002b;
    L_0x0324:
        r0 = r2;
        goto L_0x0051;
    L_0x0327:
        r0 = 8;
        goto L_0x0275;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationPicker2.onCreate(android.os.Bundle):void");
    }

    static void a(LocationPicker2 locationPicker2, Location location, int i, String str, boolean z) {
        locationPicker2.a(location, i, str, z);
    }

    static boolean b(LocationPicker2 locationPicker2, boolean z) {
        locationPicker2.s = z;
        return z;
    }

    static nr r(LocationPicker2 locationPicker2) {
        return locationPicker2.o;
    }

    static ProgressBar u(LocationPicker2 locationPicker2) {
        return locationPicker2.K;
    }

    private Location d() {
        LatLng latLng = this.x.getCameraPosition().target;
        Location location = new Location("");
        location.setLatitude(latLng.latitude);
        location.setLongitude(latLng.longitude);
        return location;
    }

    static cm k(LocationPicker2 locationPicker2) {
        return locationPicker2.t;
    }

    private void e() {
        this.x.setTrafficEnabled(true);
        this.x.setIndoorEnabled(true);
        this.x.setMyLocationEnabled(true);
        this.x.getUiSettings().setMyLocationButtonEnabled(false);
        this.x.setOnMarkerClickListener(new a56(this));
        this.x.setOnInfoWindowClickListener(new u9(this));
        this.x.setOnMapClickListener(new azs(this));
        this.x.setOnCameraChangeListener(new a3_(this));
        if (this.R != null) {
            g();
            if (App.az == 0) {
                return;
            }
        }
        SharedPreferences sharedPreferences = getSharedPreferences(bb[26], 0);
        this.x.moveCamera(CameraUpdateFactory.newLatLng(new LatLng((double) sharedPreferences.getFloat(bb[23], 37.389805f), (double) sharedPreferences.getFloat(bb[25], -122.08141f))));
        this.x.moveCamera(CameraUpdateFactory.zoomTo(sharedPreferences.getFloat(bb[24], 18.0f) - 0.2f));
    }

    protected void onResume() {
        super.onResume();
        this.Y.onResume();
        this.Y.b();
        f();
        this.C.connect();
        this.D = System.currentTimeMillis();
    }

    static Bitmap a(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.map_bullet);
        float dimension = context.getResources().getDimension(R.dimen.map_bullet_shadow);
        int i2 = (dimensionPixelSize / 2) - ((int) dimension);
        int i3 = dimensionPixelSize / 2;
        int ceil = (dimensionPixelSize / 2) + ((int) FloatMath.ceil(dimension));
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, (((int) FloatMath.ceil(dimension)) * 2) + dimensionPixelSize, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        MaskFilter blurMaskFilter = new BlurMaskFilter(dimension, Blur.NORMAL);
        Paint paint = new Paint(1);
        paint.setColor(-6710887);
        paint.setStyle(Style.FILL);
        paint.setMaskFilter(blurMaskFilter);
        canvas.translate(0.0f, dimension);
        canvas.drawCircle((float) i3, (float) ceil, (float) i2, paint);
        canvas.translate(0.0f, -dimension);
        paint.setMaskFilter(null);
        paint.setStrokeWidth(am1.a().g);
        paint.setStyle(Style.STROKE);
        paint.setColor(1711276032);
        canvas.drawCircle((float) i3, (float) ceil, (float) i2, paint);
        paint.setStyle(Style.FILL);
        paint.setColor(i);
        canvas.drawCircle((float) i3, (float) ceil, (float) i2, paint);
        return createBitmap;
    }

    static {
        String[] strArr = new String[28];
        String str = "C2\u0015'%K8_<$V9\u001f!dC?\u0005<%Lr\"\u0010\u000bp\u001f9";
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
                        i3 = 34;
                        break;
                    case ay.f /*1*/:
                        i3 = 92;
                        break;
                    case ay.n /*2*/:
                        i3 = 113;
                        break;
                    case ay.p /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001e>O";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u001e>O";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "E,\u0002";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "C>\u001e'>K2\u0016u.W9Q!%\u00022\u0010!#T9Q9#@.\u0010'#G/Q8#Q/\u0018;-";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "H5\u0015";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "e9\u001e\u0016%F9";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001es\u0013k";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "L9\u0005\"%P7";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "N3\u00124>K3\u001f%#A7\u0014'eA.\u00144>G";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.libaxolotl.a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "r0\u00106/Q";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.libaxolotl.a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001es\u0013k";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.libaxolotl.a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "N3\u00124>K3\u001f";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.libaxolotl.a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Q4\u0010'/}0\u001e6+V5\u001e;\u0015N3\u001f";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.libaxolotl.a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "Q4\u0010'/}0\u001e6+V5\u001e;\u0015N=\u0005";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "A3\u001c{=J=\u0005&+R,.%8G:\u0014'/L?\u0014&";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Q4\u0010'/}0\u001e6+V5\u001e;\u0015X3\u001e8";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u001e>O";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u001es\u0013k";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u001es\u00028+N0O";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u001es\u0013kv@.^kvQ1\u00109&\u001c";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001e>O";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "Q4\u0010'/}0\u001e6+V5\u001e;\u0015N=\u0005";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "Q4\u0010'/}0\u001e6+V5\u001e;\u0015X3\u001e8";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "Q4\u0010'/}0\u001e6+V5\u001e;\u0015N3\u001f";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "A3\u001c{=J=\u0005&+R,.%8G:\u0014'/L?\u0014&";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001e=Q=8G:Lr\"V(\u0001&p\rs\u0017:?P/\u0000 +P9_6%OsVk,M)\u0003&;W=\u00030v\r=O";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    bb = strArr3;
                    j = 0;
                    P = LocationRequest.create().setInterval(5000).setFastestInterval(16).setPriority(100);
                default:
                    strArr2[i] = str;
                    str = "S)\u0014'3";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onConnected(Bundle bundle) {
        LocationServices.FusedLocationApi.requestLocationUpdates(this.C, P, this);
        this.O = LocationServices.FusedLocationApi.getLastLocation(this.C);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, (int) R.string.search).setIcon((int) R.drawable.ic_action_search).setShowAsAction(2);
        menu.add(0, 1, 0, (int) R.string.refresh).setIcon((int) R.drawable.ic_action_refresh).setShowAsAction(1);
        if (App.G == 3) {
            g.b((Activity) this);
        }
        return true;
    }

    static BitmapDescriptor p(LocationPicker2 locationPicker2) {
        return locationPicker2.T;
    }

    private void a() {
        String str;
        if (this.R == null || this.R.isEmpty()) {
            str = null;
        } else if (this.R.j == 2) {
            str = getString(R.string.location_data_provided_by_fousquare, new Object[]{bb[27]});
        } else {
            str = this.R.g;
        }
        this.k.removeFooterView(this.Q);
        if (str != null) {
            this.Q.setText(Html.fromHtml(str));
            this.k.addFooterView(this.Q, null, true);
        }
    }

    private void f() {
        if (this.x == null) {
            this.x = this.Y.getMap();
            if (this.x != null) {
                e();
            }
        }
    }

    public Object onRetainNonConfigurationInstance() {
        return this.R;
    }

    static ImageView e(LocationPicker2 locationPicker2) {
        return locationPicker2.m;
    }

    static PlaceInfo i(LocationPicker2 locationPicker2) {
        return locationPicker2.u;
    }

    static cm a(LocationPicker2 locationPicker2, cm cmVar) {
        locationPicker2.t = cmVar;
        return cmVar;
    }

    private void a(Location location, int i, String str, boolean z) {
        this.N.removeCallbacks(this.y);
        this.S.setVisibility(0);
        if (this.U.getVisibility() != 0) {
            this.K.setVisibility(0);
        }
        findViewById(R.id.places_empty).setVisibility(8);
        if (this.x != null) {
            this.x.clear();
        }
        this.u = null;
        this.k.removeFooterView(this.Q);
        this.R = new atb();
        this.o.notifyDataSetChanged();
        this.v = af.CANCEL;
        this.H = new a_q(this, location, i, str, z);
        a5w.a(this.H, new Void[0]);
    }

    static Location x(LocationPicker2 locationPicker2) {
        return locationPicker2.O;
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
    }

    protected void onPause() {
        this.Y.onPause();
        this.Y.c();
        if (this.C != null && this.C.isConnected()) {
            this.C.disconnect();
        }
        super.onPause();
    }

    static PlaceInfo w(LocationPicker2 locationPicker2) {
        return locationPicker2.Z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
        r10_this = this;
        r8 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r7 = 8;
        r6 = 0;
        r5 = 0;
        r0 = com.whatsapp.App.az;
        r1 = r10.U;
        r1 = r1.getVisibility();
        if (r1 != r7) goto L_0x0017;
    L_0x0010:
        r1 = r11.getAction();
        switch(r1) {
            case 0: goto L_0x001c;
            case 1: goto L_0x0090;
            case 2: goto L_0x002e;
            case 3: goto L_0x0090;
            default: goto L_0x0017;
        };
    L_0x0017:
        r0 = super.dispatchTouchEvent(r11);
        return r0;
    L_0x001c:
        r1 = r10.V;
        if (r1 != 0) goto L_0x0017;
    L_0x0020:
        r1 = r11.getX();
        r10.F = r1;
        r1 = r11.getY();
        r10.A = r1;
        if (r0 == 0) goto L_0x0017;
    L_0x002e:
        r1 = r10.V;
        if (r1 != 0) goto L_0x0017;
    L_0x0032:
        r1 = r11.getX();
        r2 = r11.getY();
        r3 = r10.F;
        r3 = r1 - r3;
        r4 = r10.F;
        r1 = r1 - r4;
        r1 = r1 * r3;
        r3 = r10.A;
        r3 = r2 - r3;
        r4 = r10.A;
        r2 = r2 - r4;
        r2 = r2 * r3;
        r1 = r1 + r2;
        r2 = com.whatsapp.am1.a();
        r2 = r2.g;
        r3 = 1086324736; // 0x40c00000 float:6.0 double:5.367157323E-315;
        r2 = r2 * r3;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 <= 0) goto L_0x008e;
    L_0x0058:
        r1 = 1;
        r10.V = r1;
        r1 = r10.E;
        r1.setVisibility(r6);
        r1 = new android.view.animation.TranslateAnimation;
        r2 = r10.E;
        r2 = r2.getHeight();
        r2 = (float) r2;
        r1.<init>(r5, r5, r2, r5);
        r2 = new android.view.animation.DecelerateInterpolator;
        r2.<init>();
        r1.setInterpolator(r2);
        r1.setDuration(r8);
        r2 = r10.I;
        r2.startAnimation(r1);
        r2 = r10.J;
        r2 = r2.getVisibility();
        if (r2 != 0) goto L_0x0089;
    L_0x0084:
        r2 = r10.J;
        r2.startAnimation(r1);
    L_0x0089:
        r1 = r10.M;
        r1.setVisibility(r6);
    L_0x008e:
        if (r0 == 0) goto L_0x0017;
    L_0x0090:
        r10.F = r5;
        r10.A = r5;
        r0 = r10.V;
        if (r0 == 0) goto L_0x0017;
    L_0x0098:
        r10.V = r6;
        r0 = r10.E;
        r0.setVisibility(r7);
        r0 = new android.view.animation.TranslateAnimation;
        r1 = r10.E;
        r1 = r1.getHeight();
        r1 = -r1;
        r1 = (float) r1;
        r0.<init>(r5, r5, r1, r5);
        r1 = new android.view.animation.DecelerateInterpolator;
        r1.<init>();
        r0.setInterpolator(r1);
        r0.setDuration(r8);
        r1 = r10.I;
        r1.startAnimation(r0);
        r1 = r10.J;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x0017;
    L_0x00c4:
        r1 = r10.J;
        r1.startAnimation(r0);
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationPicker2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public LocationPicker2() {
        this.l = -1;
        this.L = true;
        this.Z = new PlaceInfo();
        this.v = af.DID_NOT_REQUEST;
        this.B = 1;
    }

    static af a(LocationPicker2 locationPicker2, af afVar) {
        locationPicker2.v = afVar;
        return afVar;
    }

    static Bitmap z(LocationPicker2 locationPicker2) {
        return locationPicker2.n;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.Y.onLowMemory();
    }

    static int a(LocationPicker2 locationPicker2, int i) {
        locationPicker2.B = i;
        return i;
    }

    static GoogleMap a(LocationPicker2 locationPicker2) {
        return locationPicker2.x;
    }

    private int c() {
        Location d = d();
        VisibleRegion visibleRegion = this.x.getProjection().getVisibleRegion();
        Location location = new Location("");
        location.setLatitude((visibleRegion.nearLeft.latitude + visibleRegion.nearRight.latitude) / 2.0d);
        location.setLongitude((visibleRegion.nearLeft.longitude + visibleRegion.nearRight.longitude) / 2.0d);
        return (int) d.distanceTo(location);
    }

    static void f(LocationPicker2 locationPicker2) {
        locationPicker2.a();
    }

    static GoogleMapView2 l(LocationPicker2 locationPicker2) {
        return locationPicker2.Y;
    }

    public void onConnectionSuspended(int i) {
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.n /*2*/:
                return new Builder(this).setTitle(R.string.gps_required_title).setMessage(R.string.gps_required_body).setCancelable(true).setPositiveButton(R.string.ok, new al4(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static void a(LocationPicker2 locationPicker2, a6 a6Var, int i) {
        locationPicker2.a(a6Var, i);
    }

    static ListView A(LocationPicker2 locationPicker2) {
        return locationPicker2.k;
    }

    static long b() {
        return j;
    }

    static atb a(LocationPicker2 locationPicker2, atb com_whatsapp_atb) {
        locationPicker2.R = com_whatsapp_atb;
        return com_whatsapp_atb;
    }

    static int m(LocationPicker2 locationPicker2) {
        return locationPicker2.c();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                onSearchRequested();
                return true;
            case ay.f /*1*/:
                this.L = false;
                a(d(), c(), null, false);
                return true;
            case 16908332:
                a(a6.CANCEL);
                finish();
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLocationChanged(android.location.Location r13) {
        /*
        r12_this = this;
        r11 = 2131624824; // 0x7f0e0378 float:1.8876839E38 double:1.0531625954E-314;
        r10 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.App.az;
        if (r13 == 0) goto L_0x0119;
    L_0x000b:
        r0 = r12.O;
        if (r0 != 0) goto L_0x0029;
    L_0x000f:
        r0 = r12.x;
        if (r0 == 0) goto L_0x0029;
    L_0x0013:
        r0 = r12.x;
        r4 = new com.google.android.gms.maps.model.LatLng;
        r6 = r13.getLatitude();
        r8 = r13.getLongitude();
        r4.<init>(r6, r8);
        r4 = com.google.android.gms.maps.CameraUpdateFactory.newLatLng(r4);
        r0.moveCamera(r4);
    L_0x0029:
        r12.O = r13;
        r0 = r13.hasAccuracy();
        if (r0 == 0) goto L_0x003c;
    L_0x0031:
        r0 = r13.getAccuracy();
        r0 = (int) r0;
        r0 = java.lang.Math.max(r1, r0);
        if (r3 == 0) goto L_0x003d;
    L_0x003c:
        r0 = -1;
    L_0x003d:
        r4 = r12.l;
        if (r0 == r4) goto L_0x00c6;
    L_0x0041:
        r12.l = r0;
        if (r0 <= 0) goto L_0x0098;
    L_0x0045:
        r4 = com.whatsapp.App.aX;
        r5 = 2131558419; // 0x7f0d0013 float:1.8742153E38 double:1.053129787E-314;
        r4 = r4.a(r5, r0);
        r5 = new java.lang.Object[r1];
        r0 = java.lang.Integer.valueOf(r0);
        r5[r2] = r0;
        r0 = java.lang.String.format(r4, r5);
        r4 = r12.p;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = bb;
        r7 = 18;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r6 = r12.getString(r11);
        r5 = r5.append(r6);
        r6 = bb;
        r7 = 21;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r0 = r5.append(r0);
        r5 = bb;
        r6 = 20;
        r5 = r5[r6];
        r0 = r0.append(r5);
        r0 = r0.toString();
        r0 = android.text.Html.fromHtml(r0);
        r4.setText(r0);
        if (r3 == 0) goto L_0x00c6;
    L_0x0098:
        r0 = r12.p;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = bb;
        r5 = 22;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = r12.getString(r11);
        r3 = r3.append(r4);
        r4 = bb;
        r5 = 19;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.toString();
        r3 = android.text.Html.fromHtml(r3);
        r0.setText(r3);
    L_0x00c6:
        r0 = r12.R;
        if (r0 == 0) goto L_0x011a;
    L_0x00ca:
        r0 = r12.R;
        r0 = r0.m;
        if (r0 == 0) goto L_0x011a;
    L_0x00d0:
        r0 = r12.L;
        if (r0 == 0) goto L_0x011a;
    L_0x00d4:
        r0 = r13.getAccuracy();
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 >= 0) goto L_0x011a;
    L_0x00dc:
        r0 = r12.R;
        r0 = r0.m;
        r0 = r0.distanceTo(r13);
        r3 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x011a;
    L_0x00ea:
        r12.L = r2;
        r0 = r1;
    L_0x00ed:
        r12.O = r13;
        r1 = r12.R;
        if (r1 == 0) goto L_0x00f5;
    L_0x00f3:
        if (r0 == 0) goto L_0x0119;
    L_0x00f5:
        r1 = r13.getAccuracy();
        r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1));
        if (r1 >= 0) goto L_0x010d;
    L_0x00fd:
        r2 = r13.getTime();
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = r2 + r4;
        r4 = java.lang.System.currentTimeMillis();
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 > 0) goto L_0x0111;
    L_0x010d:
        r1 = r12.s;
        if (r1 == 0) goto L_0x0119;
    L_0x0111:
        r1 = new com.whatsapp.dy;
        r1.<init>(r12, r0);
        r12.runOnUiThread(r1);
    L_0x0119:
        return;
    L_0x011a:
        r0 = r2;
        goto L_0x00ed;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.LocationPicker2.onLocationChanged(android.location.Location):void");
    }

    static PlaceInfo a(LocationPicker2 locationPicker2, PlaceInfo placeInfo) {
        locationPicker2.u = placeInfo;
        return placeInfo;
    }

    static ProgressBar n(LocationPicker2 locationPicker2) {
        return locationPicker2.S;
    }

    static String j(LocationPicker2 locationPicker2) {
        return locationPicker2.aa;
    }

    protected void onDestroy() {
        this.Y.onDestroy();
        if (this.N != null) {
            this.N.removeCallbacks(this.y);
        }
        if (this.H != null) {
            this.H.cancel(true);
            this.H = null;
        }
        if (this.x != null) {
            Editor edit = getSharedPreferences(bb[16], 0).edit();
            CameraPosition cameraPosition = this.x.getCameraPosition();
            edit.putFloat(bb[15], (float) cameraPosition.target.latitude);
            edit.putFloat(bb[14], (float) cameraPosition.target.longitude);
            edit.putFloat(bb[17], cameraPosition.zoom);
            edit.commit();
        }
        this.X.a();
        this.r.quit();
        super.onDestroy();
    }

    static View o(LocationPicker2 locationPicker2) {
        return locationPicker2.M;
    }

    public void onNewIntent(Intent intent) {
        if (bb[0].equals(intent.getAction())) {
            a(d(), Math.max(c(), 1500), intent.getStringExtra(bb[1]), true);
        }
    }

    static View t(LocationPicker2 locationPicker2) {
        return locationPicker2.U;
    }

    private void a(a6 a6Var) {
        a(a6Var, 0);
    }

    static int b(LocationPicker2 locationPicker2, int i) {
        locationPicker2.W = i;
        return i;
    }

    static bw h(LocationPicker2 locationPicker2) {
        return locationPicker2.X;
    }

    static void c(LocationPicker2 locationPicker2) {
        locationPicker2.g();
    }

    static Handler g(LocationPicker2 locationPicker2) {
        return locationPicker2.ab;
    }

    static atb s(LocationPicker2 locationPicker2) {
        return locationPicker2.R;
    }

    static BitmapDescriptor b(LocationPicker2 locationPicker2) {
        return locationPicker2.z;
    }

    static boolean a(LocationPicker2 locationPicker2, boolean z) {
        locationPicker2.L = z;
        return z;
    }

    static Location a(LocationPicker2 locationPicker2, Location location) {
        locationPicker2.O = location;
        return location;
    }

    static long a(long j) {
        j = j;
        return j;
    }

    static TextView y(LocationPicker2 locationPicker2) {
        return locationPicker2.q;
    }

    public void onBackPressed() {
        a(a6.CANCEL);
        super.onBackPressed();
    }

    static int v(LocationPicker2 locationPicker2) {
        return locationPicker2.B;
    }

    private void g() {
        int i = App.az;
        this.x.clear();
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            MarkerOptions position = new MarkerOptions().position(new LatLng(placeInfo.lat, placeInfo.lon));
            if (!TextUtils.isEmpty(placeInfo.name)) {
                position.title(placeInfo.name);
            }
            if (!TextUtils.isEmpty(placeInfo.vicinity)) {
                position.snippet(placeInfo.vicinity);
            }
            position.icon(this.z);
            position.anchor(0.5f, 0.5f);
            placeInfo.tag = this.x.addMarker(position);
            if (i != 0) {
                break;
            }
        }
        new MarkerOptions().position(this.x.getCameraPosition().target).title(getString(R.string.send_this_location));
    }

    static Location q(LocationPicker2 locationPicker2) {
        return locationPicker2.d();
    }

    private void a(a6 a6Var, int i) {
        ap apVar;
        boolean z = true;
        long j = 0;
        if (this.D > 0) {
            j = Math.max(0, System.currentTimeMillis() - this.D);
        }
        if (this.B == 1) {
            apVar = ap.GOOGLE;
        } else {
            apVar = ap.FOURSQUARE;
        }
        af afVar = this.v;
        boolean z2 = this.G;
        if (this.U.getVisibility() == 0) {
            z = false;
        }
        ak4.a(this, apVar, a6Var, afVar, z2, z, this.W, i, j);
    }
}
