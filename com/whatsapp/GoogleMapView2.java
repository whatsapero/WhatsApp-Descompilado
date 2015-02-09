package com.whatsapp;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

@TargetApi(8)
public class GoogleMapView2 extends MapView {
    private static final String[] z;
    private float b;
    private SensorEventListener c;
    private Display d;
    private boolean e;
    private float f;
    private long g;
    private float[] h;
    private float[] i;
    private SensorManager j;
    private int k;
    private float[] l;
    private float m;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "R=\u001b=]R";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "V1\u001b*]W";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 50;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 37;
        goto L_0x0038;
    L_0x0043:
        r2 = 84;
        goto L_0x0038;
    L_0x0046:
        r2 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 89;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GoogleMapView2.<clinit>():void");
    }

    public GoogleMapView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = 2;
        this.l = new float[16];
        this.h = new float[3];
        this.i = new float[3];
        this.c = new as7(this);
        a(context);
    }

    static float[] h(GoogleMapView2 googleMapView2) {
        return googleMapView2.l;
    }

    static float b(GoogleMapView2 googleMapView2, float f) {
        googleMapView2.b = f;
        return f;
    }

    public void a(int i) {
    }

    public GoogleMapView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = 2;
        this.l = new float[16];
        this.h = new float[3];
        this.i = new float[3];
        this.c = new as7(this);
        a(context);
    }

    static float d(GoogleMapView2 googleMapView2) {
        return googleMapView2.b;
    }

    static float[] e(GoogleMapView2 googleMapView2) {
        return googleMapView2.h;
    }

    public void b() {
        if (this.j != null) {
            boolean z;
            Sensor defaultSensor = this.j.getDefaultSensor(11);
            if (defaultSensor != null) {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (defaultSensor != null) {
                this.j.registerListener(this.c, defaultSensor, 16000);
            }
        }
    }

    static float a(GoogleMapView2 googleMapView2, float f) {
        googleMapView2.f = f;
        return f;
    }

    public static LatLng a(LatLng latLng, double d, double d2) {
        double d3 = d / 6378137.0d;
        double toRadians = Math.toRadians(d2);
        double toRadians2 = Math.toRadians(latLng.latitude);
        double toRadians3 = Math.toRadians(latLng.longitude);
        double cos = Math.cos(d3);
        d3 = Math.sin(d3);
        double sin = Math.sin(toRadians2);
        toRadians2 = Math.cos(toRadians2);
        double cos2 = (cos * sin) + ((d3 * toRadians2) * Math.cos(toRadians));
        return new LatLng(Math.toDegrees(Math.asin(cos2)), Math.toDegrees(Math.atan2((d3 * toRadians2) * Math.sin(toRadians), cos - (sin * cos2)) + toRadians3));
    }

    static int g(GoogleMapView2 googleMapView2) {
        return googleMapView2.k;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLocationMode(int r11) {
        /*
        r10_this = this;
        r9 = 2;
        r8 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r10.getMap();
        r2 = r0.getCameraPosition();
        switch(r11) {
            case 0: goto L_0x0010;
            case 1: goto L_0x0083;
            case 2: goto L_0x00cf;
            default: goto L_0x000f;
        };
    L_0x000f:
        return;
    L_0x0010:
        r0 = r10.e;
        if (r0 == 0) goto L_0x000f;
    L_0x0014:
        r0 = r2.zoom;
        r10.m = r0;
        r0 = 0;
        r10.a(r0);
        r0 = r10.getMap();
        r3 = r0.getMyLocation();
        if (r3 == 0) goto L_0x0035;
    L_0x0026:
        r0 = new com.google.android.gms.maps.model.LatLng;
        r4 = r3.getLatitude();
        r6 = r3.getLongitude();
        r0.<init>(r4, r6);
        if (r1 == 0) goto L_0x0037;
    L_0x0035:
        r0 = r2.target;
    L_0x0037:
        if (r0 == 0) goto L_0x0077;
    L_0x0039:
        r4 = 4632233691727265792; // 0x4049000000000000 float:0.0 double:50.0;
        r3 = r10.b;
        r6 = (double) r3;
        r0 = a(r0, r4, r6);
        r3 = com.google.android.gms.maps.model.CameraPosition.builder();
        r4 = r10.f;
        r5 = 1116143616; // 0x42870000 float:67.5 double:5.514482165E-315;
        r4 = a(r4, r8, r5);
        r3 = r3.tilt(r4);
        r4 = r10.b;
        r3 = r3.bearing(r4);
        r4 = r10.m;
        r5 = 1097859072; // 0x41700000 float:15.0 double:5.424144515E-315;
        r4 = java.lang.Math.max(r4, r5);
        r3 = r3.zoom(r4);
        r0 = r3.target(r0);
        r0 = r0.build();
        r3 = r10.getMap();
        r0 = com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(r0);
        r3.animateCamera(r0);
    L_0x0077:
        r0 = new com.whatsapp.vd;
        r0.<init>(r10);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r10.postDelayed(r0, r4);
        if (r1 == 0) goto L_0x000f;
    L_0x0083:
        r0 = r10.getMap();
        r3 = r0.getMyLocation();
        if (r3 == 0) goto L_0x009f;
    L_0x008d:
        r0 = new com.google.android.gms.maps.model.LatLng;
        r4 = r3.getLatitude();
        r6 = r3.getLongitude();
        r0.<init>(r4, r6);
        r3 = 1;
        r10.k = r3;
        if (r1 == 0) goto L_0x00a3;
    L_0x009f:
        r0 = r2.target;
        r10.k = r9;
    L_0x00a3:
        r3 = com.google.android.gms.maps.model.CameraPosition.builder();
        r0 = r3.target(r0);
        r2 = r2.zoom;
        r0 = r0.zoom(r2);
        r0 = r0.tilt(r8);
        r0 = r0.bearing(r8);
        r0 = r0.build();
        r2 = r10.getMap();
        r0 = com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(r0);
        r2.animateCamera(r0);
        r0 = r10.k;
        r10.a(r0);
        if (r1 == 0) goto L_0x000f;
    L_0x00cf:
        r10.k = r9;
        r10.a(r9);
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GoogleMapView2.setLocationMode(int):void");
    }

    public GoogleMapView2(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        this.k = 2;
        this.l = new float[16];
        this.h = new float[3];
        this.i = new float[3];
        this.c = new as7(this);
        a(context);
    }

    public GoogleMapView2(Context context) {
        super(context);
        this.k = 2;
        this.l = new float[16];
        this.h = new float[3];
        this.i = new float[3];
        this.c = new as7(this);
        a(context);
    }

    static float[] c(GoogleMapView2 googleMapView2) {
        return googleMapView2.i;
    }

    private void a(Context context) {
        this.j = (SensorManager) context.getSystemService(z[1]);
        this.d = ((WindowManager) context.getSystemService(z[0])).getDefaultDisplay();
    }

    static Display b(GoogleMapView2 googleMapView2) {
        return googleMapView2.d;
    }

    public static float a(float f, float f2, float f3) {
        return Math.max(Math.min(f, f3), f2);
    }

    static float a(GoogleMapView2 googleMapView2, float f, float f2) {
        return googleMapView2.a(f, f2);
    }

    static float a(GoogleMapView2 googleMapView2) {
        return googleMapView2.f;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.k != 2) {
            this.k = 2;
            a(this.k);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    static int a(GoogleMapView2 googleMapView2, int i) {
        googleMapView2.k = i;
        return i;
    }

    public void a() {
        int i = App.az;
        switch (this.k) {
            case PBE.MD5 /*0*/:
                setLocationMode(1);
                if (i == 0) {
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
        setLocationMode(0);
        if (i == 0) {
            return;
        }
        setLocationMode(1);
    }

    public void c() {
        if (this.j != null) {
            this.j.unregisterListener(this.c);
        }
    }

    static float f(GoogleMapView2 googleMapView2) {
        return googleMapView2.m;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float a(float r10, float r11) {
        /*
        r9_this = this;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r2 = com.whatsapp.App.az;
        r4 = java.lang.System.currentTimeMillis();
        r6 = r9.g;
        r6 = r4 - r6;
        r1 = (float) r6;
        r3 = 1137180672; // 0x43c80000 float:400.0 double:5.61841903E-315;
        r1 = r1 / r3;
        r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0068;
    L_0x0016:
        r9.g = r4;
        r1 = r10 - r11;
        r1 = java.lang.Math.abs(r1);
        r3 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 >= 0) goto L_0x0038;
    L_0x0024:
        r1 = r10 - r11;
        r1 = java.lang.Math.abs(r1);
        r3 = 1114636288; // 0x42700000 float:60.0 double:5.507034975E-315;
        r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r1 <= 0) goto L_0x0032;
    L_0x0030:
        if (r2 == 0) goto L_0x0065;
    L_0x0032:
        r1 = r10 - r11;
        r1 = r1 * r0;
        r1 = r1 + r11;
        if (r2 == 0) goto L_0x0066;
    L_0x0038:
        r4 = 4645040803167600640; // 0x4076800000000000 float:0.0 double:360.0;
        r1 = r10 - r11;
        r1 = java.lang.Math.abs(r1);
        r6 = (double) r1;
        r4 = r4 - r6;
        r6 = 4633641066610819072; // 0x404e000000000000 float:0.0 double:60.0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x004d;
    L_0x004b:
        if (r2 == 0) goto L_0x0065;
    L_0x004d:
        r1 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1));
        if (r1 <= 0) goto L_0x005b;
    L_0x0051:
        r1 = r8 + r10;
        r1 = r1 - r11;
        r1 = r1 % r8;
        r1 = r1 * r0;
        r1 = r1 + r11;
        r1 = r1 + r8;
        r1 = r1 % r8;
        if (r2 == 0) goto L_0x0066;
    L_0x005b:
        r1 = r8 - r10;
        r1 = r1 + r11;
        r1 = r1 % r8;
        r0 = r0 * r1;
        r0 = r11 - r0;
        r0 = r0 + r8;
        r10 = r0 % r8;
    L_0x0065:
        return r10;
    L_0x0066:
        r10 = r1;
        goto L_0x0065;
    L_0x0068:
        r0 = r1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GoogleMapView2.a(float, float):float");
    }
}
