package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Point;
import android.location.Location;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import com.whatsapp.protocol.cn;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.g;
import java.util.HashMap;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class GroupChatLiveLocationsActivity2 extends DialogToastActivity implements ConnectionCallbacks, OnConnectionFailedListener, LocationListener {
    private static final String[] z;
    private HashMap j;
    private boolean k;
    private cn l;
    private MenuItem m;
    private ImageView n;
    private HashMap o;
    private GoogleMapView2 p;
    private am q;
    private GoogleMap r;
    private float s;

    class AnonymousClass_2 extends GoogleMapView2 {
        final GroupChatLiveLocationsActivity2 n;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            GroupChatLiveLocationsActivity2.b(this.n, true);
            GroupChatLiveLocationsActivity2.a(this.n, null);
            return super.dispatchTouchEvent(motionEvent);
        }

        AnonymousClass_2(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, Context context, GoogleMapOptions googleMapOptions) {
            this.n = groupChatLiveLocationsActivity2;
            super(context, googleMapOptions);
        }

        public void a(int i) {
            int i2 = App.az;
            GroupChatLiveLocationsActivity2.b(this.n, true);
            switch (i) {
                case PBE.MD5 /*0*/:
                    GroupChatLiveLocationsActivity2.j(this.n).setImageResource(R.drawable.btn_compass_mode_tilt);
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
            GroupChatLiveLocationsActivity2.j(this.n).setImageResource(R.drawable.btn_compass_mode);
            if (i2 == 0) {
                return;
            }
            GroupChatLiveLocationsActivity2.j(this.n).setImageResource(R.drawable.btn_myl);
        }
    }

    static {
        String[] strArr = new String[24];
        String str = "6[h|-u\\ht";
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
                        i3 = 22;
                        break;
                    case ay.f /*1*/:
                        i3 = 40;
                        break;
                    case ay.n /*2*/:
                        i3 = 13;
                        break;
                    case ay.p /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 72;
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
                    str = "uG`>?~Iyc)fXR`:sNhb-xKhc";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "zA{u\u0017zGnq<\u007fGcO$w\\";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "zA{u\u0017zGnq<\u007fGcO2yG`";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "zA{u\u0017zGnq<\u007fGcO$yF";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "zA{u\u0017zGnq<\u007fGcO;~GzO<dIkv!u";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "uG`>?~Iyc)fXR`:sNhb-xKhc";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "zA{u\u0017zGnq<\u007fGcO%wXRd1fM";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "uG`>?~Iyc)fXR`:sNhb-xKhc";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "qZbe8zGnq<\u007fGccguZhq<s";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "|Ai";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "zA{u\u0017zGnq<\u007fGcO2yG`";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = "uG`>?~Iyc)fXR`:sNhb-xKhc";
                    obj = 12;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    strArr2 = strArr3;
                    str = "zA{u\u0017zGnq<\u007fGcO$yF";
                    obj = 13;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "zA{u\u0017zGnq<\u007fGcO$w\\";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    str = "zA{u\u0017zGnq<\u007fGcO%wXRd1fM";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "zA{u\u0017zGnq<\u007fGcO;~GzO<dIkv!u";
                    obj = 16;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "uG`>?~Iyc)fXR`:sNhb-xKhc";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "zA{u\u0017zGnq<\u007fGcO%wXRd1fM";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "uG`>?~Iyc)fXR`:sNhb-xKhc";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "uG`>?~Iyc)fXR`:sNhb-xKhc";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    str = "zA{u\u0017zGnq<\u007fGcO%wXRd1fM";
                    obj = 21;
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    strArr2 = strArr3;
                    str = "uG`>?~Iyc)fXR`:sNhb-xKhc";
                    obj = 22;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "qZbe8zGnq<\u007fGccg{I\u007f{-dK\u007fu)bMi0";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.p.onSaveInstanceState(bundle);
    }

    private void e() {
        boolean z = getSharedPreferences(z[7], 0).getBoolean(z[6], false);
        this.r.setTrafficEnabled(z);
        if (this.m != null) {
            this.m.setChecked(z);
        }
        this.r.setMapType(getSharedPreferences(z[2], 0).getInt(z[8], 1));
        this.r.setIndoorEnabled(true);
        this.r.setMyLocationEnabled(true);
        this.r.getUiSettings().setCompassEnabled(true);
        this.r.getUiSettings().setZoomControlsEnabled(false);
        this.r.getUiSettings().setMyLocationButtonEnabled(false);
        this.r.setOnMarkerClickListener(new y5(this));
        this.r.setOnCameraChangeListener(new bn(this));
        this.r.setOnMapClickListener(new a14(this));
        d();
        if (this.q.i.isEmpty()) {
            SharedPreferences sharedPreferences = getSharedPreferences(z[9], 0);
            this.r.moveCamera(CameraUpdateFactory.newLatLng(new LatLng((double) sharedPreferences.getFloat(z[3], 37.389805f), (double) sharedPreferences.getFloat(z[5], -122.08141f))));
            this.r.moveCamera(CameraUpdateFactory.zoomTo(sharedPreferences.getFloat(z[4], 17.0f) - 0.2f));
            if (App.az == 0) {
                return;
            }
        }
        a(false);
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
    }

    private Point a(int i, Point point) {
        return new Point(i % point.x, i / point.x);
    }

    static cn a(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, cn cnVar) {
        groupChatLiveLocationsActivity2.l = cnVar;
        return cnVar;
    }

    private void b() {
        if (this.r == null) {
            this.r = this.p.getMap();
            if (this.r != null) {
                e();
            }
        }
    }

    protected void onResume() {
        super.onResume();
        this.p.onResume();
        this.p.b();
        this.q.c();
        b();
        f();
    }

    static ImageView j(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.n;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.p.onLowMemory();
    }

    static boolean b(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, boolean z) {
        groupChatLiveLocationsActivity2.k = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.gms.maps.model.MarkerOptions a(java.util.Collection r27, boolean r28, int r29) {
        /*
        r26_this = this;
        r7 = com.whatsapp.App.az;
        r5 = r27.size();
        r0 = r26;
        r8 = r0.a(r5);
        r5 = 1107296256; // 0x42000000 float:32.0 double:5.4707704E-315;
        r6 = com.whatsapp.am1.a();
        r6 = r6.g;
        r5 = r5 * r6;
        r9 = (int) r5;
        r5 = 1080033280; // 0x40600000 float:3.5 double:5.3360734E-315;
        r6 = com.whatsapp.am1.a();
        r6 = r6.g;
        r5 = r5 * r6;
        r10 = (int) r5;
        r5 = r9 + r10;
        r6 = r8.x;
        r5 = r5 * r6;
        r11 = r5 + r10;
        r5 = r9 + r10;
        r6 = r8.y;
        r5 = r5 * r6;
        r12 = r5 + r10;
        r5 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;
        r6 = com.whatsapp.am1.a();
        r6 = r6.g;
        r5 = r5 * r6;
        r5 = (int) r5;
        r6 = com.whatsapp.am1.a();
        r6 = r6.g;
        r13 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r6 = r6 * r13;
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 / r13;
        r13 = r9 / 5;
        r14 = (int) r6;
        r13 = r13 - r14;
        r14 = new com.whatsapp.a1l;
        r14.<init>();
        if (r28 == 0) goto L_0x005c;
    L_0x004f:
        r15 = 1;
        r15 = new int[r15];
        r16 = 0;
        r17 = 16842913; // 0x10100a1 float:2.369401E-38 double:8.3215047E-317;
        r15[r16] = r17;
        r14.setState(r15);
    L_0x005c:
        r14.a(r5);
        r15 = new android.graphics.Rect;
        r15.<init>();
        r14.getPadding(r15);
        r5 = 0;
        r16 = 0;
        r0 = r15.left;
        r17 = r0;
        r17 = r17 + r11;
        r0 = r15.right;
        r18 = r0;
        r17 = r17 + r18;
        r0 = r15.top;
        r18 = r0;
        r18 = r18 + r12;
        r0 = r15.bottom;
        r19 = r0;
        r18 = r18 + r19;
        r0 = r16;
        r1 = r17;
        r2 = r18;
        r14.setBounds(r5, r0, r1, r2);
        r5 = r15.left;
        r5 = r5 + r11;
        r0 = r15.right;
        r16 = r0;
        r5 = r5 + r16;
        r0 = r15.top;
        r16 = r0;
        r16 = r16 + r12;
        r0 = r15.bottom;
        r17 = r0;
        r16 = r16 + r17;
        r17 = r13 * 2;
        r0 = r17;
        r0 = (float) r0;
        r17 = r0;
        r17 = r17 + r6;
        r0 = r17;
        r0 = (int) r0;
        r17 = r0;
        r16 = r16 + r17;
        r17 = android.graphics.Bitmap.Config.ARGB_8888;
        r0 = r16;
        r1 = r17;
        r16 = android.graphics.Bitmap.createBitmap(r5, r0, r1);
        r17 = new android.graphics.Canvas;
        r0 = r17;
        r1 = r16;
        r0.<init>(r1);
        r5 = r15.left;
        r18 = r11 / 2;
        r5 = r5 + r18;
        r0 = r15.top;
        r18 = r0;
        r18 = r18 + r12;
        r0 = r15.bottom;
        r19 = r0;
        r18 = r18 + r19;
        r0 = (float) r13;
        r19 = r0;
        r19 = r19 - r6;
        r0 = r19;
        r0 = (int) r0;
        r19 = r0;
        r18 = r18 + r19;
        r19 = new android.graphics.BlurMaskFilter;
        r20 = android.graphics.BlurMaskFilter.Blur.NORMAL;
        r0 = r19;
        r1 = r20;
        r0.<init>(r6, r1);
        r20 = new android.graphics.Paint;
        r21 = 1;
        r20.<init>(r21);
        r21 = -6710887; // 0xffffffffff999999 float:NaN double:NaN;
        r20.setColor(r21);
        r21 = android.graphics.Paint.Style.FILL;
        r20.setStyle(r21);
        r0 = r20;
        r1 = r19;
        r0.setMaskFilter(r1);
        r19 = 0;
        r0 = r17;
        r1 = r19;
        r0.translate(r1, r6);
        r0 = (float) r5;
        r19 = r0;
        r0 = r18;
        r0 = (float) r0;
        r21 = r0;
        r0 = (float) r13;
        r22 = r0;
        r0 = r17;
        r1 = r19;
        r2 = r21;
        r3 = r22;
        r4 = r20;
        r0.drawCircle(r1, r2, r3, r4);
        r19 = 0;
        r6 = -r6;
        r0 = r17;
        r1 = r19;
        r0.translate(r1, r6);
        r6 = 0;
        r0 = r20;
        r0.setMaskFilter(r6);
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r20;
        r0.setStrokeWidth(r6);
        r6 = android.graphics.Paint.Style.STROKE;
        r0 = r20;
        r0.setStyle(r6);
        r6 = -1728053248; // 0xffffffff99000000 float:-6.617445E-24 double:NaN;
        r0 = r20;
        r0.setColor(r6);
        r6 = (float) r5;
        r0 = r18;
        r0 = (float) r0;
        r19 = r0;
        r0 = (float) r13;
        r21 = r0;
        r0 = r17;
        r1 = r19;
        r2 = r21;
        r3 = r20;
        r0.drawCircle(r6, r1, r2, r3);
        r6 = android.graphics.Paint.Style.FILL;
        r0 = r20;
        r0.setStyle(r6);
        r0 = r20;
        r1 = r29;
        r0.setColor(r1);
        r5 = (float) r5;
        r0 = r18;
        r6 = (float) r0;
        r0 = (float) r13;
        r18 = r0;
        r0 = r17;
        r1 = r18;
        r2 = r20;
        r0.drawCircle(r5, r6, r1, r2);
        r0 = r17;
        r14.draw(r0);
        r14 = new android.graphics.Paint;
        r14.<init>();
        r5 = 1;
        r14.setAntiAlias(r5);
        r5 = 1;
        r14.setFilterBitmap(r5);
        r5 = 1;
        r14.setDither(r5);
        r5 = 0;
        r18 = r27.iterator();
        r6 = r5;
    L_0x0199:
        r5 = r18.hasNext();
        if (r5 == 0) goto L_0x0248;
    L_0x019f:
        r5 = r18.next();
        r5 = (java.lang.String) r5;
        r19 = com.whatsapp.App.P;
        r0 = r19;
        r19 = r0.a(r5);
        r5 = r26.getResources();
        r21 = 2131361881; // 0x7f0a0059 float:1.8343527E38 double:1.0530326843E-314;
        r0 = r21;
        r5 = r5.getDimensionPixelSize(r0);
        r21 = r26.getResources();
        r22 = 2131361880; // 0x7f0a0058 float:1.8343525E38 double:1.053032684E-314;
        r21 = r21.getDimension(r22);
        r22 = 1;
        r0 = r19;
        r1 = r21;
        r2 = r22;
        r5 = r0.a(r5, r1, r2);
        if (r5 != 0) goto L_0x01d7;
    L_0x01d3:
        r5 = r19.j();
    L_0x01d7:
        r0 = r26;
        r19 = r0.a(r6, r8);
        r21 = new android.graphics.Rect;
        r0 = r15.left;
        r22 = r0;
        r22 = r22 + r10;
        r0 = r15.top;
        r23 = r0;
        r23 = r23 + r10;
        r0 = r15.left;
        r24 = r0;
        r24 = r24 + r10;
        r24 = r24 + r9;
        r0 = r15.top;
        r25 = r0;
        r25 = r25 + r10;
        r25 = r25 + r9;
        r21.<init>(r22, r23, r24, r25);
        r0 = r19;
        r0 = r0.x;
        r22 = r0;
        r23 = r10 + r9;
        r22 = r22 * r23;
        r0 = r19;
        r0 = r0.y;
        r19 = r0;
        r23 = r10 + r9;
        r19 = r19 * r23;
        r0 = r21;
        r1 = r22;
        r2 = r19;
        r0.offset(r1, r2);
        r19 = new android.graphics.Rect;
        r22 = 0;
        r23 = 0;
        r24 = r5.getWidth();
        r25 = r5.getHeight();
        r0 = r19;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r25;
        r0.<init>(r1, r2, r3, r4);
        r0 = r17;
        r1 = r19;
        r2 = r21;
        r0.drawBitmap(r5, r1, r2, r14);
        r5 = r6 + 1;
        r6 = 4;
        if (r5 < r6) goto L_0x0246;
    L_0x0244:
        if (r7 == 0) goto L_0x0248;
    L_0x0246:
        if (r7 == 0) goto L_0x02ef;
    L_0x0248:
        r5 = r27.size();
        r6 = 4;
        if (r5 <= r6) goto L_0x02d0;
    L_0x024f:
        r5 = r15.left;
        r6 = r11 / 2;
        r5 = r5 + r6;
        r5 = (float) r5;
        r6 = r15.top;
        r7 = r12 / 2;
        r6 = r6 + r7;
        r6 = (float) r6;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r20;
        r0.setStrokeWidth(r7);
        r7 = android.graphics.Paint.Style.STROKE;
        r0 = r20;
        r0.setStyle(r7);
        r7 = -1728053248; // 0xffffffff99000000 float:-6.617445E-24 double:NaN;
        r0 = r20;
        r0.setColor(r7);
        r7 = android.graphics.Paint.Style.FILL;
        r0 = r20;
        r0.setStyle(r7);
        r7 = -1;
        r0 = r20;
        r0.setColor(r7);
        r7 = r13 * 2;
        r7 = (float) r7;
        r0 = r17;
        r1 = r20;
        r0.drawCircle(r5, r6, r7, r1);
        r7 = new android.text.TextPaint;
        r8 = 1;
        r7.<init>(r8);
        r8 = r13 * 2;
        r8 = (float) r8;
        r9 = 1067869798; // 0x3fa66666 float:1.3 double:5.275977814E-315;
        r8 = r8 * r9;
        r7.setTextSize(r8);
        r8 = -16737844; // 0xffffffffff0099cc float:-1.7093974E38 double:NaN;
        r7.setColor(r8);
        r8 = android.graphics.Paint.Align.CENTER;
        r7.setTextAlign(r8);
        r8 = 1;
        r7.setFakeBoldText(r8);
        r8 = new android.graphics.Rect;
        r8.<init>();
        r9 = r27.size();
        r9 = java.lang.Integer.toString(r9);
        r10 = 0;
        r11 = r9.length();
        r7.getTextBounds(r9, r10, r11, r8);
        r9 = r27.size();
        r9 = java.lang.Integer.toString(r9);
        r8 = r8.height();
        r8 = r8 / 2;
        r8 = (float) r8;
        r6 = r6 + r8;
        r0 = r17;
        r0.drawText(r9, r5, r6, r7);
    L_0x02d0:
        r5 = new com.google.android.gms.maps.model.MarkerOptions;
        r5.<init>();
        r6 = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(r16);
        r6 = r5.icon(r6);
        r7 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r8 = r16.getHeight();
        r8 = r8 - r13;
        r8 = (float) r8;
        r9 = r16.getHeight();
        r9 = (float) r9;
        r8 = r8 / r9;
        r6.anchor(r7, r8);
        return r5;
    L_0x02ef:
        r6 = r5;
        goto L_0x0199;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatLiveLocationsActivity2.a(java.util.Collection, boolean, int):com.google.android.gms.maps.model.MarkerOptions");
    }

    public GroupChatLiveLocationsActivity2() {
        this.o = new HashMap();
        this.j = new HashMap();
        this.s = -1.0f;
        this.q = new af(this);
    }

    static void h(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        groupChatLiveLocationsActivity2.a();
    }

    static float a(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, float f) {
        groupChatLiveLocationsActivity2.s = f;
        return f;
    }

    private void f() {
    }

    static am a(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.q;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
        r20_this = this;
        r12 = com.whatsapp.App.az;
        r0 = r20;
        r2 = r0.r;
        if (r2 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r0 = r20;
        r2 = r0.p;
        r2 = r2.getWidth();
        r0 = r20;
        r3 = r0.p;
        r3 = r3.getHeight();
        if (r2 == 0) goto L_0x0008;
    L_0x001b:
        if (r3 == 0) goto L_0x0008;
    L_0x001d:
        r0 = r20;
        r2 = r0.o;
        r2.clear();
        r0 = r20;
        r2 = r0.j;
        r2 = r2.values();
        r3 = r2.iterator();
    L_0x0030:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x0042;
    L_0x0036:
        r2 = r3.next();
        r2 = (com.google.android.gms.maps.model.Marker) r2;
        r4 = 0;
        r2.setVisible(r4);
        if (r12 == 0) goto L_0x0030;
    L_0x0042:
        r0 = r20;
        r2 = r0.r;
        r3 = r2.getProjection();
        r2 = com.whatsapp.am1.a();
        r2 = r2.g;
        r4 = 1107296256; // 0x42000000 float:32.0 double:5.4707704E-315;
        r5 = r2 * r4;
        r2 = com.whatsapp.am1.a();
        r2 = r2.g;
        r4 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r6 = r2 * r4;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r20;
        r2 = r0.q;
        r2 = r2.i;
        r7 = r2.iterator();
    L_0x006d:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0090;
    L_0x0073:
        r2 = r7.next();
        r2 = (com.whatsapp.protocol.cn) r2;
        r8 = new com.google.android.gms.maps.model.LatLng;
        r10 = r2.b;
        r14 = r2.e;
        r8.<init>(r10, r14);
        r8 = r3.toScreenLocation(r8);
        r9 = new android.util.Pair;
        r9.<init>(r2, r8);
        r4.add(r9);
        if (r12 == 0) goto L_0x006d;
    L_0x0090:
        r2 = new com.whatsapp.a5a;
        r0 = r20;
        r2.<init>(r0);
        java.util.Collections.sort(r4, r2);
        r7 = new java.util.ArrayList;
        r7.<init>();
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r8 = r4.iterator();
        r4 = r2;
    L_0x00a6:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x0115;
    L_0x00ac:
        r2 = r8.next();
        r2 = (android.util.Pair) r2;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r3 = r2.first;
        r3 = (com.whatsapp.protocol.cn) r3;
        r3 = r3.h;
        r3 = r9.append(r3);
        r9 = " ";
        r3 = r3.append(r9);
        r3 = r3.append(r4);
        r9 = " ";
        r9 = r3.append(r9);
        r3 = r2.second;
        r3 = (android.graphics.Point) r3;
        r3 = r3.x;
        r3 = r9.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = (float) r4;
        r9 = r3 + r5;
        r3 = r2.second;
        r3 = (android.graphics.Point) r3;
        r3 = r3.x;
        r3 = (float) r3;
        r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r3 >= 0) goto L_0x0103;
    L_0x00f0:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3.add(r2);
        r7.add(r3);
        r3 = r2.second;
        r3 = (android.graphics.Point) r3;
        r4 = r3.x;
        if (r12 == 0) goto L_0x0112;
    L_0x0103:
        r3 = r7.size();
        r3 = r3 + -1;
        r3 = r7.get(r3);
        r3 = (java.util.ArrayList) r3;
        r3.add(r2);
    L_0x0112:
        r2 = r4;
        if (r12 == 0) goto L_0x02d1;
    L_0x0115:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r7 = r7.iterator();
    L_0x011e:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x017c;
    L_0x0124:
        r2 = r7.next();
        r2 = (java.util.ArrayList) r2;
        r3 = new com.whatsapp.ani;
        r0 = r20;
        r3.<init>(r0);
        java.util.Collections.sort(r2, r3);
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r8 = r2.iterator();
        r4 = r3;
    L_0x013b:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x017a;
    L_0x0141:
        r2 = r8.next();
        r2 = (android.util.Pair) r2;
        r3 = (float) r4;
        r9 = r3 + r6;
        r3 = r2.second;
        r3 = (android.graphics.Point) r3;
        r3 = r3.y;
        r3 = (float) r3;
        r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r3 >= 0) goto L_0x0168;
    L_0x0155:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3.add(r2);
        r5.add(r3);
        r3 = r2.second;
        r3 = (android.graphics.Point) r3;
        r4 = r3.y;
        if (r12 == 0) goto L_0x0177;
    L_0x0168:
        r3 = r5.size();
        r3 = r3 + -1;
        r3 = r5.get(r3);
        r3 = (java.util.ArrayList) r3;
        r3.add(r2);
    L_0x0177:
        r2 = r4;
        if (r12 == 0) goto L_0x02ce;
    L_0x017a:
        if (r12 == 0) goto L_0x011e;
    L_0x017c:
        r13 = r5.iterator();
    L_0x0180:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0008;
    L_0x0186:
        r2 = r13.next();
        r2 = (java.util.ArrayList) r2;
        r8 = 0;
        r6 = 0;
        r3 = 0;
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r14 = new java.util.ArrayList;
        r14.<init>();
        r15 = new java.util.ArrayList;
        r15.<init>();
        r16 = r2.iterator();
        r10 = r8;
        r8 = r6;
        r6 = r3;
    L_0x01a7:
        r3 = r16.hasNext();
        if (r3 == 0) goto L_0x01e4;
    L_0x01ad:
        r3 = r16.next();
        r3 = (android.util.Pair) r3;
        r3 = r3.first;
        r3 = (com.whatsapp.protocol.cn) r3;
        r0 = r3.b;
        r18 = r0;
        r10 = r10 + r18;
        r0 = r3.e;
        r18 = r0;
        r8 = r8 + r18;
        r7 = r3.h;
        r14.add(r7);
        r15.add(r3);
        r0 = r20;
        r7 = r0.q;
        r7 = r7.f;
        r7 = r7.contains(r3);
        if (r7 == 0) goto L_0x01d8;
    L_0x01d7:
        r6 = 1;
    L_0x01d8:
        r0 = r3.d;
        r18 = r0;
        r7 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1));
        if (r7 >= 0) goto L_0x01e2;
    L_0x01e0:
        r4 = r3.d;
    L_0x01e2:
        if (r12 == 0) goto L_0x01a7;
    L_0x01e4:
        java.util.Collections.sort(r14);
        r3 = "";
        r16 = r14.iterator();
        r7 = r3;
    L_0x01ee:
        r3 = r16.hasNext();
        if (r3 == 0) goto L_0x02cb;
    L_0x01f4:
        r3 = r16.next();
        r3 = (java.lang.String) r3;
        r17 = new java.lang.StringBuilder;
        r17.<init>();
        r0 = r17;
        r7 = r0.append(r7);
        r17 = " ";
        r0 = r17;
        r7 = r7.append(r0);
        r3 = r7.append(r3);
        r3 = r3.toString();
        if (r12 == 0) goto L_0x02c8;
    L_0x0217:
        r16 = 1800000; // 0x1b7740 float:2.522337E-39 double:8.89318E-318;
        r4 = r4 + r16;
        r16 = java.lang.System.currentTimeMillis();
        r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1));
        if (r4 <= 0) goto L_0x02c3;
    L_0x0224:
        r4 = -1728001024; // 0xffffffff9900cc00 float:-6.658642E-24 double:NaN;
    L_0x0227:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r3 = r5.append(r3);
        r5 = " ";
        r3 = r3.append(r5);
        r5 = java.lang.Integer.toString(r4);
        r3 = r3.append(r5);
        r3 = r3.toString();
        if (r6 == 0) goto L_0x025a;
    L_0x0244:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r3 = r5.append(r3);
        r5 = z;
        r7 = 0;
        r5 = r5[r7];
        r3 = r3.append(r5);
        r3 = r3.toString();
    L_0x025a:
        r5 = new com.google.android.gms.maps.model.LatLng;
        r7 = r2.size();
        r0 = (double) r7;
        r16 = r0;
        r10 = r10 / r16;
        r2 = r2.size();
        r0 = (double) r2;
        r16 = r0;
        r8 = r8 / r16;
        r5.<init>(r10, r8);
        r0 = r20;
        r2 = r0.j;
        r2 = r2.get(r3);
        r2 = (com.google.android.gms.maps.model.Marker) r2;
        if (r2 != 0) goto L_0x02b1;
    L_0x027d:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 1;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r0 = r20;
        r2 = r0.a(r14, r6, r4);
        r0 = r20;
        r4 = r0.r;
        r2 = r2.position(r5);
        r2 = r4.addMarker(r2);
        r0 = r20;
        r4 = r0.j;
        r4.put(r3, r2);
        if (r12 == 0) goto L_0x02b8;
    L_0x02b1:
        r3 = 1;
        r2.setVisible(r3);
        r2.setPosition(r5);
    L_0x02b8:
        r0 = r20;
        r3 = r0.o;
        r3.put(r2, r15);
        if (r12 == 0) goto L_0x0180;
    L_0x02c1:
        goto L_0x0008;
    L_0x02c3:
        r4 = -1718012980; // 0xffffffff999933cc float:-1.584075E-23 double:NaN;
        goto L_0x0227;
    L_0x02c8:
        r7 = r3;
        goto L_0x01ee;
    L_0x02cb:
        r3 = r7;
        goto L_0x0217;
    L_0x02ce:
        r4 = r2;
        goto L_0x013b;
    L_0x02d1:
        r4 = r2;
        goto L_0x00a6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatLiveLocationsActivity2.d():void");
    }

    static float b(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, float f) {
        return groupChatLiveLocationsActivity2.a(f);
    }

    static boolean f(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.k;
    }

    static void g(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        groupChatLiveLocationsActivity2.d();
    }

    static GoogleMap e(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.r;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater().inflate(R.menu.map_layers, menu);
        this.m = menu.findItem(R.id.map_traffic);
        if (!(this.m == null || this.r == null)) {
            this.m.setChecked(this.r.isTrafficEnabled());
        }
        if (App.G == 3) {
            g.b((Activity) this);
        }
        return true;
    }

    static HashMap i(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.o;
    }

    private void a() {
        a(true);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[10]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.groupchat_live_locations);
        getSupportActionBar().setTitle(a5.d(v.b(getIntent().getStringExtra(z[11])).a((Context) this), this));
        this.q.a((Activity) this);
        MapsInitializer.initialize(this);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.mapType(1).zoomControlsEnabled(false).zoomGesturesEnabled(true).compassEnabled(true).rotateGesturesEnabled(true).tiltGesturesEnabled(true);
        this.p = new AnonymousClass_2(this, this, googleMapOptions);
        ((ViewGroup) findViewById(R.id.map_holder)).addView(this.p);
        this.p.onCreate(bundle);
        b();
        this.n = (ImageView) findViewById(R.id.my_location);
        this.n.setOnClickListener(new km(this));
    }

    protected void onPause() {
        super.onPause();
        this.p.onPause();
        this.p.c();
        this.q.b();
    }

    private float a(float f) {
        if (f <= 0.0f) {
            return 17.0f;
        }
        VisibleRegion visibleRegion = this.r.getProjection().getVisibleRegion();
        Location location = new Location("");
        location.setLatitude(visibleRegion.nearLeft.latitude);
        location.setLongitude(visibleRegion.nearLeft.longitude);
        Location location2 = new Location("");
        location2.setLatitude(visibleRegion.nearRight.latitude);
        location2.setLongitude(visibleRegion.nearRight.longitude);
        double distanceTo = (double) location2.distanceTo(location);
        if (distanceTo <= 0.0d) {
            return 17.0f;
        }
        float log = (float) ((Math.log((distanceTo / ((double) f)) / 30.0d) / Math.log(2.0d)) + ((double) this.r.getCameraPosition().zoom));
        return log > 17.0f ? 17.0f : log;
    }

    public void onLocationChanged(Location location) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            case R.id.map_type_normal:
                this.r.setMapType(1);
                getSharedPreferences(z[20], 0).edit().putInt(z[22], 1).commit();
                return true;
            case R.id.map_type_satellite:
                this.r.setMapType(4);
                getSharedPreferences(z[23], 0).edit().putInt(z[16], 4).commit();
                return true;
            case R.id.map_type_terrain:
                this.r.setMapType(3);
                getSharedPreferences(z[21], 0).edit().putInt(z[19], 3).commit();
                return true;
            case R.id.map_traffic:
                boolean z;
                if (this.r.isTrafficEnabled()) {
                    z = false;
                } else {
                    z = true;
                }
                this.r.setTrafficEnabled(z);
                this.m.setChecked(z);
                getSharedPreferences(z[18], 0).edit().putBoolean(z[17], z).commit();
                return true;
            default:
                return false;
        }
    }

    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        DialogToastActivity.a(menuItem);
        return super.onMenuItemSelected(i, menuItem);
    }

    static void a(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, boolean z) {
        groupChatLiveLocationsActivity2.a(z);
    }

    static GoogleMapView2 b(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.p;
    }

    private void a(boolean z) {
        int i = App.az;
        if (this.r != null && !this.q.i.isEmpty()) {
            if (this.p.getWidth() <= 0 || this.p.getHeight() <= 0) {
                this.p.getViewTreeObserver().addOnGlobalLayoutListener(new j0(this));
                return;
            }
            cn cnVar;
            double max;
            double d;
            Iterator it = this.q.i.iterator();
            double d2 = 90.0d;
            double d3 = -90.0d;
            double d4 = 180.0d;
            double d5 = -180.0d;
            while (it.hasNext()) {
                cnVar = (cn) it.next();
                d2 = Math.min(d2, cnVar.b);
                d3 = Math.max(d3, cnVar.b);
                d4 = Math.min(d4, cnVar.e);
                max = Math.max(d5, cnVar.e);
                if (i != 0) {
                    d = d2;
                    d2 = d3;
                    break;
                }
                d5 = max;
            }
            max = d5;
            d = d2;
            d2 = d3;
            if (max - d4 > 180.0d) {
                Iterator it2 = this.q.i.iterator();
                d4 = 360.0d;
                d5 = 0.0d;
                while (it2.hasNext()) {
                    cnVar = (cn) it2.next();
                    if (cnVar.e < 0.0d) {
                        d3 = cnVar.e + 360.0d;
                    } else {
                        d3 = cnVar.e;
                    }
                    d4 = Math.min(d4, d3);
                    if (cnVar.e < 0.0d) {
                        max = cnVar.e + 360.0d;
                    } else {
                        max = cnVar.e;
                    }
                    max = Math.max(d5, max);
                    if (i != 0) {
                        break;
                    }
                    d5 = max;
                }
                max = d5;
            }
            if (this.q.i.size() > 1) {
                d5 = ((d2 - d) / 10.0d) + d2;
                if (z) {
                    this.r.animateCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(d, d4), new LatLng(d5, max)), (int) (am1.a().g * 64.0f)));
                    if (i == 0) {
                        return;
                    }
                }
                this.r.moveCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(d, d4), new LatLng(d5, max)), (int) (am1.a().g * 64.0f)));
                if (i == 0) {
                    return;
                }
            }
            d5 = d2;
            if (z) {
                this.r.animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(new LatLng((d + d5) / 2.0d, (d4 + max) / 2.0d)).zoom(17.0f).build()));
                if (i == 0) {
                    return;
                }
            }
            this.r.moveCamera(CameraUpdateFactory.newLatLng(new LatLng((d5 + d) / 2.0d, (max + d4) / 2.0d)));
            this.r.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
        }
    }

    static cn d(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.l;
    }

    protected void onDestroy() {
        super.onDestroy();
        this.p.onDestroy();
        this.q.g();
        if (this.r != null) {
            Editor edit = getSharedPreferences(z[13], 0).edit();
            CameraPosition cameraPosition = this.r.getCameraPosition();
            edit.putFloat(z[15], (float) cameraPosition.target.latitude);
            edit.putFloat(z[14], (float) cameraPosition.target.longitude);
            edit.putFloat(z[12], cameraPosition.zoom);
            edit.commit();
        }
    }

    static float c(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        return groupChatLiveLocationsActivity2.s;
    }

    private Point a(int i) {
        return i < 4 ? new Point(i, 1) : new Point(2, 2);
    }
}
