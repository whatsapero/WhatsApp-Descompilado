package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockMapActivity;
import com.actionbarsherlock.view.Menu;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MyLocationOverlay;
import com.whatsapp.protocol.cn;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.g;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class GroupChatLiveLocationsActivity extends SherlockMapActivity implements on {
    private static final String[] z;
    private int a;
    private GoogleMapView b;
    private ArrayList c;
    private vi d;
    private am e;
    private cn f;
    private MyLocationOverlay g;

    class AnonymousClass_2 extends GoogleMapView {
        final GroupChatLiveLocationsActivity f;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            GroupChatLiveLocationsActivity.a(this.f, null);
            return super.dispatchTouchEvent(motionEvent);
        }

        AnonymousClass_2(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, Context context) {
            this.f = groupChatLiveLocationsActivity;
            super(context);
        }
    }

    static {
        String[] strArr = new String[8];
        String str = "/@\u000fJ\f7~\u001fK\u001f/@\u0002@\u000b";
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
                        i3 = 67;
                        break;
                    case ay.f /*1*/:
                        i3 = 33;
                        break;
                    case ay.n /*2*/:
                        i3 = 118;
                        break;
                    case ay.p /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ")H\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "$S\u0019P\t/N\u0015D\r*N\u0018VV'D\u0005Q\u000b,X";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "o\u0001";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "f\u0010R\tWrG";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "f\u0010R\tWrG";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "o\u0001";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "$S\u0019P\t/N\u0015D\r*N\u0018VV S\u0013D\r&";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        DialogToastActivity.a(menuItem);
        return super.onMenuItemSelected(i, menuItem);
    }

    static void e(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        groupChatLiveLocationsActivity.b();
    }

    static void h(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        groupChatLiveLocationsActivity.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.view.View r19, com.whatsapp.protocol.cn r20) {
        /*
        r18_this = this;
        r11 = com.whatsapp.App.az;
        r2 = com.whatsapp.App.P;
        r0 = r20;
        r3 = r0.h;
        r12 = r2.a(r3);
        r2 = 2131427627; // 0x7f0b012b float:1.8476876E38 double:1.053065167E-314;
        r0 = r19;
        r2 = r0.findViewById(r2);
        r9 = r2;
        r9 = (android.widget.TextView) r9;
        r0 = r18;
        r2 = r12.a(r0);
        r9.setText(r2);
        r2 = 2131427628; // 0x7f0b012c float:1.8476878E38 double:1.0530651676E-314;
        r0 = r19;
        r2 = r0.findViewById(r2);
        r10 = r2;
        r10 = (android.widget.TextView) r10;
        r2 = java.lang.System.currentTimeMillis();
        r0 = r20;
        r4 = r0.d;
        r2 = r2 - r4;
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x0048;
    L_0x003d:
        r2 = 2131624485; // 0x7f0e0225 float:1.8876151E38 double:1.053162428E-314;
        r0 = r18;
        r2 = r0.getString(r2);
        if (r11 == 0) goto L_0x005c;
    L_0x0048:
        r0 = r20;
        r2 = r0.d;
        r4 = java.lang.System.currentTimeMillis();
        r6 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r8 = 0;
        r2 = android.text.format.DateUtils.getRelativeTimeSpanString(r2, r4, r6, r8);
        r2 = r2.toString();
    L_0x005c:
        r0 = r20;
        r3 = r0.g;
        if (r3 == 0) goto L_0x0093;
    L_0x0062:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = 2131624482; // 0x7f0e0222 float:1.8876145E38 double:1.0531624264E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r0 = r20;
        r6 = r0.g;
        r6 = java.lang.Integer.valueOf(r6);
        r4[r5] = r6;
        r0 = r18;
        r3 = r0.getString(r3, r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x0093:
        r0 = r20;
        r3 = r0.i;
        r4 = (double) r3;
        r6 = 4601724776627584746; // 0x3fdc9c4da9003eea float:-2.847628E-14 double:0.44704;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x0143;
    L_0x00a1:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = java.util.Locale.US;
        r4 = java.util.Locale.getDefault();
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0104;
    L_0x00c3:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = 2131624490; // 0x7f0e022a float:1.8876161E38 double:1.0531624303E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = z;
        r7 = 5;
        r6 = r6[r7];
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r0 = r20;
        r13 = r0.i;
        r14 = (double) r13;
        r16 = 4612219559875242487; // 0x4001e540cc78e9f7 float:-6.5251292E7 double:2.23694;
        r14 = r14 * r16;
        r13 = java.lang.Double.valueOf(r14);
        r7[r8] = r13;
        r6 = java.lang.String.format(r6, r7);
        r4[r5] = r6;
        r0 = r18;
        r3 = r0.getString(r3, r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        if (r11 == 0) goto L_0x0143;
    L_0x0104:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r2 = r3.append(r2);
        r3 = 2131624489; // 0x7f0e0229 float:1.887616E38 double:1.05316243E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = z;
        r7 = 6;
        r6 = r6[r7];
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r0 = r20;
        r13 = r0.i;
        r14 = (double) r13;
        r16 = 4615288898129284301; // 0x400ccccccccccccd float:-1.07374184E8 double:3.6;
        r14 = r14 * r16;
        r13 = java.lang.Double.valueOf(r14);
        r7[r8] = r13;
        r6 = java.lang.String.format(r6, r7);
        r4[r5] = r6;
        r0 = r18;
        r3 = r0.getString(r3, r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x0143:
        r10.setText(r2);
        r2 = 2131427626; // 0x7f0b012a float:1.8476874E38 double:1.0530651666E-314;
        r0 = r19;
        r2 = r0.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r3 = r18.getResources();
        r4 = 2131361881; // 0x7f0a0059 float:1.8343527E38 double:1.0530326843E-314;
        r3 = r3.getDimensionPixelSize(r4);
        r4 = r18.getResources();
        r5 = 2131361880; // 0x7f0a0058 float:1.8343525E38 double:1.053032684E-314;
        r4 = r4.getDimension(r5);
        r5 = 1;
        r3 = r12.a(r3, r4, r5);
        if (r3 == 0) goto L_0x0173;
    L_0x016e:
        r2.setImageBitmap(r3);
        if (r11 == 0) goto L_0x017a;
    L_0x0173:
        r3 = r12.k();
        r2.setImageResource(r3);
    L_0x017a:
        r2 = 8;
        r9.setVisibility(r2);
        r2 = 8;
        r10.setVisibility(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatLiveLocationsActivity.a(android.view.View, com.whatsapp.protocol.cn):void");
    }

    public void onDestroy() {
        Log.i(z[3]);
        super.onDestroy();
        this.e.g();
    }

    public void a(GeoPoint geoPoint, int i, int i2) {
        int zoomLevel = this.b.getZoomLevel();
        if (zoomLevel <= 1) {
            zoomLevel = 2;
            this.b.getController().setZoom(2);
        }
        if (this.a != zoomLevel) {
            this.a = zoomLevel;
            b();
        }
    }

    protected void onPause() {
        super.onPause();
        this.g.disableMyLocation();
        this.e.b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[1]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.groupchat_live_locations);
        getSupportActionBar().setTitle(a5.d(v.b(getIntent().getStringExtra(z[2])).a((Context) this), this));
        this.e.a((Activity) this);
        this.b = new AnonymousClass_2(this, this);
        this.b.setClickable(true);
        this.b.setEnabled(true);
        this.b.setMapListener(this);
        this.b.setBuiltInZoomControls(false);
        this.b.getController().setZoom(17);
        ((ViewGroup) findViewById(R.id.map_holder)).addView(this.b);
        this.g = new el(this, this, this.b);
        this.b.getOverlays().add(this.g);
        this.d = new vi(this);
        this.d.a();
        this.b.getOverlays().add(this.d);
        this.b.getViewTreeObserver().addOnPreDrawListener(new alt(this));
        findViewById(R.id.my_location).setOnClickListener(new anc(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r22_this = this;
        r10 = com.whatsapp.App.az;
        r0 = r22;
        r2 = r0.c;
        r3 = r2.iterator();
    L_0x000a:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x001f;
    L_0x0010:
        r2 = r3.next();
        r2 = (android.view.View) r2;
        r0 = r22;
        r4 = r0.b;
        r4.removeView(r2);
        if (r10 == 0) goto L_0x000a;
    L_0x001f:
        r0 = r22;
        r2 = r0.b;
        r2 = r2.getWidth();
        r0 = r22;
        r3 = r0.b;
        r3 = r3.getHeight();
        if (r2 == 0) goto L_0x0033;
    L_0x0031:
        if (r3 != 0) goto L_0x0034;
    L_0x0033:
        return;
    L_0x0034:
        r2 = java.lang.Math.min(r2, r3);
        r2 = r2 / 10;
        r0 = r22;
        r3 = r0.b;
        r3 = r3.getZoomLevel();
        r4 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r6 = (double) r3;
        r4 = java.lang.Math.pow(r4, r6);
        r6 = 4643211215818981376; // 0x4070000000000000 float:0.0 double:256.0;
        r4 = r4 * r6;
        r6 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r4 = r4 / r6;
        r2 = r2 * 360;
        r2 = (double) r2;
        r4 = r2 / r4;
        r2 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r6 = r4 / r2;
        r8 = new java.util.HashMap;
        r8.<init>();
        r9 = new android.graphics.Point;
        r9.<init>();
        r0 = r22;
        r2 = r0.e;
        r2 = r2.i;
        r11 = r2.iterator();
    L_0x006c:
        r2 = r11.hasNext();
        if (r2 == 0) goto L_0x00f5;
    L_0x0072:
        r2 = r11.next();
        r2 = (com.whatsapp.protocol.cn) r2;
        r12 = r2.e;
        r14 = r2.b;
        r3 = new com.google.android.maps.GeoPoint;
        r0 = r2.b;
        r16 = r0;
        r18 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r16 = r16 * r18;
        r0 = r16;
        r0 = (int) r0;
        r16 = r0;
        r0 = r2.e;
        r18 = r0;
        r20 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r18 = r18 * r20;
        r0 = r18;
        r0 = (int) r0;
        r17 = r0;
        r0 = r16;
        r1 = r17;
        r3.<init>(r0, r1);
        r0 = r22;
        r0 = r0.b;
        r16 = r0;
        r16 = r16.getProjection();
        r0 = r16;
        r0.toPixels(r3, r9);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r16 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r12 = r12 + r16;
        r12 = r12 / r4;
        r12 = (int) r12;
        r3 = r3.append(r12);
        r12 = " ";
        r3 = r3.append(r12);
        r12 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r12 = r12 + r14;
        r12 = r12 / r6;
        r12 = (int) r12;
        r3 = r3.append(r12);
        r3 = r3.toString();
        r12 = r8.containsKey(r3);
        if (r12 != 0) goto L_0x00ea;
    L_0x00e2:
        r12 = new java.util.ArrayList;
        r12.<init>();
        r8.put(r3, r12);
    L_0x00ea:
        r3 = r8.get(r3);
        r3 = (java.util.ArrayList) r3;
        r3.add(r2);
        if (r10 == 0) goto L_0x006c;
    L_0x00f5:
        r2 = new java.util.ArrayList;
        r3 = r8.values();
        r2.<init>(r3);
        r3 = new com.whatsapp.lw;
        r0 = r22;
        r3.<init>(r0);
        java.util.Collections.sort(r2, r3);
        r11 = new java.util.ArrayList;
        r11.<init>();
        r12 = new java.util.ArrayList;
        r12.<init>();
        r13 = r2.iterator();
    L_0x0116:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0222;
    L_0x011c:
        r2 = r13.next();
        r2 = (java.util.ArrayList) r2;
        r14 = new android.widget.LinearLayout;
        r0 = r22;
        r14.<init>(r0);
        r3 = 0;
        r14.setOrientation(r3);
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 1088421888; // 0x40e00000 float:7.0 double:5.37751863E-315;
        r7 = com.whatsapp.am1.a();
        r7 = r7.g;
        r6 = r6 * r7;
        r6 = (int) r6;
        r14.setPadding(r3, r4, r5, r6);
        r15 = new android.widget.LinearLayout;
        r0 = r22;
        r15.<init>(r0);
        r3 = 1;
        r15.setOrientation(r3);
        r14.addView(r15);
        r3 = 1;
        r15.setClickable(r3);
        r3 = 1;
        r15.setFocusable(r3);
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r0 = r22;
        r3 = r0.getSystemService(r3);
        r3 = (android.view.LayoutInflater) r3;
        r4 = new com.whatsapp.a1l;
        r4.<init>();
        r5 = 1094713344; // 0x41400000 float:12.0 double:5.408602553E-315;
        r6 = com.whatsapp.am1.a();
        r6 = r6.g;
        r5 = r5 * r6;
        r5 = (int) r5;
        r4.a(r5);
        r15.setBackgroundDrawable(r4);
        r8 = 0;
        r6 = 0;
        r4 = 0;
        r16 = r2.iterator();
        r5 = r4;
    L_0x017f:
        r4 = r16.hasNext();
        if (r4 == 0) goto L_0x0252;
    L_0x0185:
        r4 = r16.next();
        r4 = (com.whatsapp.protocol.cn) r4;
        r17 = 2130903091; // 0x7f030033 float:1.741299E38 double:1.052806012E-314;
        r18 = 0;
        r0 = r17;
        r1 = r18;
        r17 = com.whatsapp.b7.a(r3, r0, r1);
        r0 = r22;
        r1 = r17;
        r0.a(r1, r4);
        r0 = r17;
        r15.addView(r0);
        r0 = r17;
        r0.setTag(r4);
        r0 = r4.b;
        r18 = r0;
        r8 = r8 + r18;
        r0 = r4.e;
        r18 = r0;
        r6 = r6 + r18;
        r0 = r22;
        r0 = r0.e;
        r17 = r0;
        r0 = r17;
        r0 = r0.f;
        r17 = r0;
        r0 = r17;
        r4 = r0.contains(r4);
        if (r4 == 0) goto L_0x024f;
    L_0x01c9:
        r4 = 1;
    L_0x01ca:
        if (r10 == 0) goto L_0x024c;
    L_0x01cc:
        r3 = new com.google.android.maps.GeoPoint;
        r5 = r2.size();
        r0 = (double) r5;
        r16 = r0;
        r8 = r8 / r16;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r8 = r8 * r16;
        r5 = (int) r8;
        r8 = r2.size();
        r8 = (double) r8;
        r6 = r6 / r8;
        r8 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r6 = r6 * r8;
        r6 = (int) r6;
        r3.<init>(r5, r6);
        r15.setTag(r2);
        r15.setSelected(r4);
        r5 = new com.whatsapp.ask;
        r0 = r22;
        r5.<init>(r0, r2, r3);
        r15.setOnClickListener(r5);
        if (r4 == 0) goto L_0x0209;
    L_0x0201:
        r11.add(r14);
        r12.add(r3);
        if (r10 == 0) goto L_0x0219;
    L_0x0209:
        r0 = r22;
        r2 = r0.b;
        r4 = new com.google.android.maps.MapView$LayoutParams;
        r5 = -2;
        r6 = -2;
        r7 = 81;
        r4.<init>(r5, r6, r3, r7);
        r2.addView(r14, r4);
    L_0x0219:
        r0 = r22;
        r2 = r0.c;
        r2.add(r14);
        if (r10 == 0) goto L_0x0116;
    L_0x0222:
        r2 = 0;
        r4 = r2;
    L_0x0224:
        r2 = r11.size();
        if (r4 >= r2) goto L_0x0033;
    L_0x022a:
        r0 = r22;
        r5 = r0.b;
        r2 = r11.get(r4);
        r2 = (android.view.View) r2;
        r6 = new com.google.android.maps.MapView$LayoutParams;
        r7 = -2;
        r8 = -2;
        r3 = r12.get(r4);
        r3 = (com.google.android.maps.GeoPoint) r3;
        r9 = 81;
        r6.<init>(r7, r8, r3, r9);
        r5.addView(r2, r6);
        r2 = r4 + 1;
        if (r10 != 0) goto L_0x0033;
    L_0x024a:
        r4 = r2;
        goto L_0x0224;
    L_0x024c:
        r5 = r4;
        goto L_0x017f;
    L_0x024f:
        r4 = r5;
        goto L_0x01ca;
    L_0x0252:
        r4 = r5;
        goto L_0x01cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatLiveLocationsActivity.b():void");
    }

    static cn a(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.f;
    }

    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem menuItem) {
        boolean z = false;
        switch (menuItem.getItemId()) {
            case PBE.MD5 /*0*/:
                GoogleMapView googleMapView = this.b;
                if (!this.b.isSatellite()) {
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

    static MyLocationOverlay b(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r18_this = this;
        r12 = com.whatsapp.App.az;
        r8 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r6 = -4587338432941916160; // 0xc056800000000000 float:0.0 double:-90.0;
        r4 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r2 = -4582834833314545664; // 0xc066800000000000 float:0.0 double:-180.0;
        r0 = r18;
        r10 = r0.e;
        r10 = r10.i;
        r13 = r10.iterator();
        r10 = r8;
        r8 = r6;
        r6 = r4;
        r4 = r2;
    L_0x0024:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0100;
    L_0x002a:
        r2 = r13.next();
        r2 = (com.whatsapp.protocol.cn) r2;
        r14 = r2.b;
        r10 = java.lang.Math.min(r10, r14);
        r14 = r2.b;
        r8 = java.lang.Math.max(r8, r14);
        r14 = r2.e;
        r6 = java.lang.Math.min(r6, r14);
        r2 = r2.e;
        r2 = java.lang.Math.max(r4, r2);
        if (r12 == 0) goto L_0x00fd;
    L_0x004a:
        r4 = new com.google.android.maps.GeoPoint;
        r14 = r10 + r8;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r5 = (int) r14;
        r14 = r8 - r10;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4618441417868443648; // 0x4018000000000000 float:0.0 double:6.0;
        r14 = r14 / r16;
        r13 = (int) r14;
        r5 = r5 + r13;
        r14 = r6 + r2;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r13 = (int) r14;
        r4.<init>(r5, r13);
        r0 = r18;
        r5 = r0.e;
        r5 = r5.i;
        r5 = r5.size();
        if (r5 <= 0) goto L_0x0093;
    L_0x0086:
        r0 = r18;
        r5 = r0.b;
        r5 = r5.getController();
        r5.setCenter(r4);
        if (r12 == 0) goto L_0x00a1;
    L_0x0093:
        r0 = r18;
        r4 = r0.g;
        r5 = new com.whatsapp.p_;
        r0 = r18;
        r5.<init>(r0);
        r4.runOnFirstFix(r5);
    L_0x00a1:
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
        r3 = r0.e;
        r3 = r3.i;
        r3 = r3.size();
        r5 = 1;
        if (r3 > r5) goto L_0x00da;
    L_0x00cb:
        r0 = r18;
        r3 = r0.b;
        r3 = r3.getController();
        r5 = 17;
        r3.setZoom(r5);
        if (r12 == 0) goto L_0x00e5;
    L_0x00da:
        r0 = r18;
        r3 = r0.b;
        r3 = r3.getController();
        r3.zoomToSpan(r4, r2);
    L_0x00e5:
        r0 = r18;
        r2 = r0.b;
        r2 = r2.getZoomLevel();
        r3 = 1;
        if (r2 > r3) goto L_0x00fc;
    L_0x00f0:
        r0 = r18;
        r2 = r0.b;
        r2 = r2.getController();
        r3 = 2;
        r2.setZoom(r3);
    L_0x00fc:
        return;
    L_0x00fd:
        r4 = r2;
        goto L_0x0024;
    L_0x0100:
        r2 = r4;
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GroupChatLiveLocationsActivity.a():void");
    }

    protected boolean isRouteDisplayed() {
        return false;
    }

    static am g(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.e;
    }

    static cn a(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, cn cnVar) {
        groupChatLiveLocationsActivity.f = cnVar;
        return cnVar;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, (int) R.string.map_type).setIcon((int) R.drawable.button_layers).setShowAsAction(2);
        if (App.G == 3) {
            g.b((Activity) this);
        }
        return true;
    }

    public GroupChatLiveLocationsActivity() {
        this.c = new ArrayList();
        this.a = -1;
        this.e = new an(this);
    }

    static GoogleMapView c(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.b;
    }

    static vi d(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.d;
    }

    protected void onResume() {
        super.onResume();
        this.g.enableMyLocation();
        this.e.c();
    }

    static ArrayList f(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        return groupChatLiveLocationsActivity.c;
    }
}
