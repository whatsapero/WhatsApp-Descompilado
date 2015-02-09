package com.whatsapp;

import android.location.Location;
import android.os.AsyncTask;

class ak1 extends AsyncTask {
    private int a;
    private String b;
    final LocationPicker c;
    private boolean d;
    private Location e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.atb r19) {
        /*
        r18_this = this;
        r12 = com.whatsapp.App.az;
        r2 = r18.isCancelled();
        if (r2 != 0) goto L_0x01d1;
    L_0x0008:
        if (r19 == 0) goto L_0x0022;
    L_0x000a:
        r0 = r18;
        r2 = r0.c;
        r0 = r19;
        com.whatsapp.LocationPicker.a(r2, r0);
        r0 = r18;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker.p(r2);
        r0 = r18;
        r3 = r0.e;
        r2.a(r3);
    L_0x0022:
        r0 = r18;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker.h(r2);
        r3 = 8;
        r2.setVisibility(r3);
        r0 = r18;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker.p(r2);
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0069;
    L_0x003d:
        r0 = r18;
        r2 = r0.c;
        r2 = r2.getApplicationContext();
        r0 = r18;
        r3 = r0.c;
        r4 = 2131624621; // 0x7f0e02ad float:1.8876427E38 double:1.053162495E-314;
        r3 = r3.getString(r4);
        r4 = 1;
        r2 = android.widget.Toast.makeText(r2, r3, r4);
        r2.show();
        r0 = r18;
        r2 = r0.c;
        r3 = 2131427879; // 0x7f0b0227 float:1.8477387E38 double:1.0530652916E-314;
        r2 = r2.findViewById(r3);
        r3 = 0;
        r2.setVisibility(r3);
        if (r12 == 0) goto L_0x0079;
    L_0x0069:
        r0 = r18;
        r2 = r0.c;
        r3 = 2131427879; // 0x7f0b0227 float:1.8477387E38 double:1.0530652916E-314;
        r2 = r2.findViewById(r3);
        r3 = 8;
        r2.setVisibility(r3);
    L_0x0079:
        r0 = r18;
        r2 = r0.c;
        com.whatsapp.LocationPicker.k(r2);
        r0 = r18;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker.n(r2);
        r2.notifyDataSetChanged();
        r0 = r18;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker.m(r2);
        r2.a();
        r0 = r18;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker.e(r2);
        r2.invalidate();
        r0 = r18;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker.p(r2);
        r2 = r2.e;
        if (r2 == 0) goto L_0x00e7;
    L_0x00ad:
        r2 = "";
        r0 = r18;
        r3 = r0.c;
        r3 = com.whatsapp.LocationPicker.p(r3);
        r3 = r3.e;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x00e7;
    L_0x00bf:
        r0 = r18;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker.g(r2);
        r0 = r18;
        r3 = r0.c;
        r4 = 2131624680; // 0x7f0e02e8 float:1.8876547E38 double:1.053162524E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r0 = r18;
        r7 = r0.c;
        r7 = com.whatsapp.LocationPicker.p(r7);
        r7 = r7.e;
        r5[r6] = r7;
        r3 = r3.getString(r4, r5);
        r2.setText(r3);
        if (r12 == 0) goto L_0x00f5;
    L_0x00e7:
        r0 = r18;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker.g(r2);
        r3 = 2131624678; // 0x7f0e02e6 float:1.8876542E38 double:1.053162523E-314;
        r2.setText(r3);
    L_0x00f5:
        r0 = r18;
        r2 = r0.d;
        if (r2 == 0) goto L_0x01d1;
    L_0x00fb:
        r0 = r18;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker.p(r2);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x01d1;
    L_0x0109:
        r8 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r6 = -4587338432941916160; // 0xc056800000000000 float:0.0 double:-90.0;
        r4 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r2 = -4582834833314545664; // 0xc066800000000000 float:0.0 double:-180.0;
        r0 = r18;
        r10 = r0.c;
        r10 = com.whatsapp.LocationPicker.p(r10);
        r13 = r10.iterator();
        r10 = r8;
        r8 = r6;
        r6 = r4;
        r4 = r2;
    L_0x012d:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x01d5;
    L_0x0133:
        r2 = r13.next();
        r2 = (com.whatsapp.PlaceInfo) r2;
        r14 = r2.lat;
        r10 = java.lang.Math.min(r10, r14);
        r14 = r2.lat;
        r8 = java.lang.Math.max(r8, r14);
        r14 = r2.lon;
        r6 = java.lang.Math.min(r6, r14);
        r2 = r2.lon;
        r2 = java.lang.Math.max(r4, r2);
        if (r12 == 0) goto L_0x01d2;
    L_0x0153:
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
        r5 = r0.c;
        r5 = com.whatsapp.LocationPicker.e(r5);
        r5 = r5.getController();
        r5.setCenter(r4);
        r4 = r8 - r10;
        r8 = 4608083138725491507; // 0x3ff3333333333333 float:4.172325E-8 double:1.2;
        r4 = r4 * r8;
        r8 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r4 = r4 * r8;
        r4 = (int) r4;
        r2 = r2 - r6;
        r6 = 4608083138725491507; // 0x3ff3333333333333 float:4.172325E-8 double:1.2;
        r2 = r2 * r6;
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r2 = r2 * r6;
        r2 = (int) r2;
        r0 = r18;
        r3 = r0.c;
        r3 = com.whatsapp.LocationPicker.p(r3);
        r3 = r3.size();
        r5 = 1;
        if (r3 > r5) goto L_0x01c2;
    L_0x01af:
        r0 = r18;
        r3 = r0.c;
        r3 = com.whatsapp.LocationPicker.e(r3);
        r3 = r3.getController();
        r5 = 18;
        r3.setZoom(r5);
        if (r12 == 0) goto L_0x01d1;
    L_0x01c2:
        r0 = r18;
        r3 = r0.c;
        r3 = com.whatsapp.LocationPicker.e(r3);
        r3 = r3.getController();
        r3.zoomToSpan(r4, r2);
    L_0x01d1:
        return;
    L_0x01d2:
        r4 = r2;
        goto L_0x012d;
    L_0x01d5:
        r2 = r4;
        goto L_0x0153;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ak1.a(com.whatsapp.atb):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.whatsapp.atb a(java.lang.Void[] r8) {
        /*
        r7_this = this;
        r1 = 0;
        r2 = com.whatsapp.LocationPicker.c();	 Catch:{ IOException -> 0x0047, JSONException -> 0x0063 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0047, JSONException -> 0x0063 }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0057;
    L_0x000d:
        r0 = com.whatsapp.LocationPicker.b();	 Catch:{ IOException -> 0x0047, JSONException -> 0x0063 }
        if (r0 != 0) goto L_0x0057;
    L_0x0013:
        r0 = com.whatsapp.App.t();	 Catch:{ IOException -> 0x0049, JSONException -> 0x0063 }
        if (r0 == 0) goto L_0x0057;
    L_0x0019:
        r0 = r7.e;	 Catch:{ IOException -> 0x004b, JSONException -> 0x0063 }
        r2 = r7.a;	 Catch:{ IOException -> 0x004b, JSONException -> 0x0063 }
        r3 = 0;
        r4 = r7.b;	 Catch:{ IOException -> 0x004b, JSONException -> 0x0063 }
        r0 = com.whatsapp.atb.b(r0, r2, r3, r4);	 Catch:{ IOException -> 0x004b, JSONException -> 0x0063 }
        r1 = r0.isEmpty();	 Catch:{ IOException -> 0x0053, JSONException -> 0x006b }
        if (r1 == 0) goto L_0x0046;
    L_0x002a:
        r1 = r0.a();	 Catch:{ IOException -> 0x0053, JSONException -> 0x006b }
        if (r1 == 0) goto L_0x0046;
    L_0x0030:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0055, JSONException -> 0x006b }
        r4 = 14400000; // 0xdbba00 float:2.0178698E-38 double:7.1145453E-317;
        r2 = r2 + r4;
        com.whatsapp.LocationPicker.a(r2);	 Catch:{ IOException -> 0x0055, JSONException -> 0x006b }
        r1 = r7.e;	 Catch:{ IOException -> 0x0055, JSONException -> 0x006b }
        r2 = r7.a;	 Catch:{ IOException -> 0x0055, JSONException -> 0x006b }
        r3 = 0;
        r4 = r7.b;	 Catch:{ IOException -> 0x0055, JSONException -> 0x006b }
        r0 = com.whatsapp.atb.a(r1, r2, r3, r4);	 Catch:{ IOException -> 0x0055, JSONException -> 0x006b }
    L_0x0046:
        return r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0049, JSONException -> 0x0063 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x004b, JSONException -> 0x0063 }
    L_0x004b:
        r0 = move-exception;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x004f:
        com.whatsapp.util.Log.c(r1);
        goto L_0x0046;
    L_0x0053:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0055, JSONException -> 0x006b }
    L_0x0055:
        r1 = move-exception;
        goto L_0x004f;
    L_0x0057:
        r0 = r7.e;	 Catch:{ IOException -> 0x004b, JSONException -> 0x0063 }
        r2 = r7.a;	 Catch:{ IOException -> 0x004b, JSONException -> 0x0063 }
        r3 = 0;
        r4 = r7.b;	 Catch:{ IOException -> 0x004b, JSONException -> 0x0063 }
        r0 = com.whatsapp.atb.a(r0, r2, r3, r4);	 Catch:{ IOException -> 0x004b, JSONException -> 0x0063 }
        goto L_0x0046;
    L_0x0063:
        r0 = move-exception;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x0067:
        com.whatsapp.util.Log.c(r1);
        goto L_0x0046;
    L_0x006b:
        r1 = move-exception;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ak1.a(java.lang.Void[]):com.whatsapp.atb");
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected ak1(LocationPicker locationPicker, Location location, int i, String str, boolean z) {
        this.c = locationPicker;
        this.e = location;
        this.b = str;
        this.a = i;
        this.d = z;
    }

    protected void onPostExecute(Object obj) {
        a((atb) obj);
    }
}
