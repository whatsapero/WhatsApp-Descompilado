package com.whatsapp;

import android.location.Location;
import android.os.AsyncTask;

class a_q extends AsyncTask {
    private int a;
    final LocationPicker2 b;
    private String c;
    private Location d;
    private boolean e;

    protected void onPostExecute(Object obj) {
        a((atb) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.atb r21) {
        /*
        r20_this = this;
        r12 = com.whatsapp.App.az;
        r2 = r20.isCancelled();
        if (r2 != 0) goto L_0x01e6;
    L_0x0008:
        if (r21 == 0) goto L_0x0022;
    L_0x000a:
        r0 = r20;
        r2 = r0.b;
        r0 = r21;
        com.whatsapp.LocationPicker2.a(r2, r0);
        r0 = r20;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker2.s(r2);
        r0 = r20;
        r3 = r0.d;
        r2.a(r3);
    L_0x0022:
        if (r21 == 0) goto L_0x003a;
    L_0x0024:
        r0 = r20;
        r2 = r0.b;
        r3 = com.whatsapp.fieldstats.af.OK;
        com.whatsapp.LocationPicker2.a(r2, r3);
        r0 = r20;
        r2 = r0.b;
        r3 = r21.size();
        com.whatsapp.LocationPicker2.b(r2, r3);
        if (r12 == 0) goto L_0x004b;
    L_0x003a:
        r0 = r20;
        r2 = r0.b;
        r3 = com.whatsapp.fieldstats.af.FAILED;
        com.whatsapp.LocationPicker2.a(r2, r3);
        r0 = r20;
        r2 = r0.b;
        r3 = 0;
        com.whatsapp.LocationPicker2.b(r2, r3);
    L_0x004b:
        r0 = r20;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker2.n(r2);
        r3 = 8;
        r2.setVisibility(r3);
        r0 = r20;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker2.u(r2);
        r3 = 8;
        r2.setVisibility(r3);
        r0 = r20;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker2.s(r2);
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x009f;
    L_0x0073:
        r0 = r20;
        r2 = r0.b;
        r2 = r2.getApplicationContext();
        r0 = r20;
        r3 = r0.b;
        r4 = 2131624621; // 0x7f0e02ad float:1.8876427E38 double:1.053162495E-314;
        r3 = r3.getString(r4);
        r4 = 1;
        r2 = android.widget.Toast.makeText(r2, r3, r4);
        r2.show();
        r0 = r20;
        r2 = r0.b;
        r3 = 2131427879; // 0x7f0b0227 float:1.8477387E38 double:1.0530652916E-314;
        r2 = r2.findViewById(r3);
        r3 = 0;
        r2.setVisibility(r3);
        if (r12 == 0) goto L_0x00af;
    L_0x009f:
        r0 = r20;
        r2 = r0.b;
        r3 = 2131427879; // 0x7f0b0227 float:1.8477387E38 double:1.0530652916E-314;
        r2 = r2.findViewById(r3);
        r3 = 8;
        r2.setVisibility(r3);
    L_0x00af:
        r0 = r20;
        r2 = r0.b;
        com.whatsapp.LocationPicker2.f(r2);
        r0 = r20;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker2.r(r2);
        r2.notifyDataSetChanged();
        r0 = r20;
        r2 = r0.b;
        com.whatsapp.LocationPicker2.c(r2);
        r0 = r20;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker2.s(r2);
        r2 = r2.e;
        if (r2 == 0) goto L_0x010e;
    L_0x00d4:
        r2 = "";
        r0 = r20;
        r3 = r0.b;
        r3 = com.whatsapp.LocationPicker2.s(r3);
        r3 = r3.e;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x010e;
    L_0x00e6:
        r0 = r20;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker2.y(r2);
        r0 = r20;
        r3 = r0.b;
        r4 = 2131624680; // 0x7f0e02e8 float:1.8876547E38 double:1.053162524E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r0 = r20;
        r7 = r0.b;
        r7 = com.whatsapp.LocationPicker2.s(r7);
        r7 = r7.e;
        r5[r6] = r7;
        r3 = r3.getString(r4, r5);
        r2.setText(r3);
        if (r12 == 0) goto L_0x011c;
    L_0x010e:
        r0 = r20;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker2.y(r2);
        r3 = 2131624678; // 0x7f0e02e6 float:1.8876542E38 double:1.053162523E-314;
        r2.setText(r3);
    L_0x011c:
        r0 = r20;
        r2 = r0.e;
        if (r2 == 0) goto L_0x01e6;
    L_0x0122:
        r0 = r20;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker2.s(r2);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x01e6;
    L_0x0130:
        r8 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r6 = -4587338432941916160; // 0xc056800000000000 float:0.0 double:-90.0;
        r4 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r2 = -4582834833314545664; // 0xc066800000000000 float:0.0 double:-180.0;
        r0 = r20;
        r10 = r0.b;
        r10 = com.whatsapp.LocationPicker2.s(r10);
        r13 = r10.iterator();
        r10 = r8;
        r8 = r6;
        r6 = r4;
        r4 = r2;
    L_0x0154:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x01ea;
    L_0x015a:
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
        if (r12 == 0) goto L_0x01e7;
    L_0x017a:
        r0 = r20;
        r4 = r0.b;
        r4 = com.whatsapp.LocationPicker2.s(r4);
        r4 = r4.size();
        r5 = 1;
        if (r4 > r5) goto L_0x01be;
    L_0x0189:
        r0 = r20;
        r4 = r0.b;
        r4 = com.whatsapp.LocationPicker2.a(r4);
        r5 = new com.google.android.gms.maps.model.LatLng;
        r14 = r10 + r8;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r16 = r6 + r2;
        r18 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r16 = r16 / r18;
        r0 = r16;
        r5.<init>(r14, r0);
        r5 = com.google.android.gms.maps.CameraUpdateFactory.newLatLng(r5);
        r4.animateCamera(r5);
        r0 = r20;
        r4 = r0.b;
        r4 = com.whatsapp.LocationPicker2.a(r4);
        r5 = 1099956224; // 0x41900000 float:18.0 double:5.43450582E-315;
        r5 = com.google.android.gms.maps.CameraUpdateFactory.zoomTo(r5);
        r4.animateCamera(r5);
        if (r12 == 0) goto L_0x01e6;
    L_0x01be:
        r0 = r20;
        r4 = r0.b;
        r4 = com.whatsapp.LocationPicker2.a(r4);
        r5 = new com.google.android.gms.maps.model.LatLngBounds;
        r12 = new com.google.android.gms.maps.model.LatLng;
        r12.<init>(r10, r6);
        r6 = new com.google.android.gms.maps.model.LatLng;
        r6.<init>(r8, r2);
        r5.<init>(r12, r6);
        r2 = com.whatsapp.am1.a();
        r2 = r2.g;
        r3 = 1098907648; // 0x41800000 float:16.0 double:5.42932517E-315;
        r2 = r2 * r3;
        r2 = (int) r2;
        r2 = com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(r5, r2);
        r4.animateCamera(r2);
    L_0x01e6:
        return;
    L_0x01e7:
        r4 = r2;
        goto L_0x0154;
    L_0x01ea:
        r2 = r4;
        goto L_0x017a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a_q.a(com.whatsapp.atb):void");
    }

    protected a_q(LocationPicker2 locationPicker2, Location location, int i, String str, boolean z) {
        this.b = locationPicker2;
        this.d = location;
        this.c = str;
        this.a = i;
        this.e = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.whatsapp.atb a(java.lang.Void[] r9) {
        /*
        r8_this = this;
        r6 = 1;
        r1 = 0;
        r2 = com.whatsapp.LocationPicker2.b();	 Catch:{ IOException -> 0x0050, JSONException -> 0x009a }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0050, JSONException -> 0x009a }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x005e;
    L_0x000e:
        r0 = r8.b;	 Catch:{ IOException -> 0x0050, JSONException -> 0x009a }
        r0 = com.whatsapp.LocationPicker2.v(r0);	 Catch:{ IOException -> 0x0050, JSONException -> 0x009a }
        if (r0 != r6) goto L_0x005e;
    L_0x0016:
        r0 = r8.d;	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
        r2 = r8.a;	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
        r3 = 0;
        r4 = r8.c;	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
        r0 = com.whatsapp.atb.b(r0, r2, r3, r4);	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
        r1 = r0.isEmpty();	 Catch:{ IOException -> 0x005a, JSONException -> 0x0093 }
        if (r1 == 0) goto L_0x004f;
    L_0x0027:
        r1 = r0.a();	 Catch:{ IOException -> 0x005a, JSONException -> 0x0093 }
        if (r1 == 0) goto L_0x004f;
    L_0x002d:
        r1 = r8.b;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r2 = 1;
        com.whatsapp.LocationPicker2.c(r1, r2);	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r4 = 14400000; // 0xdbba00 float:2.0178698E-38 double:7.1145453E-317;
        r2 = r2 + r4;
        com.whatsapp.LocationPicker2.a(r2);	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r1 = r8.d;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r2 = r8.a;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r3 = 0;
        r4 = r8.c;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r0 = com.whatsapp.atb.a(r1, r2, r3, r4);	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r1 = r8.b;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r2 = 2;
        com.whatsapp.LocationPicker2.a(r1, r2);	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
    L_0x004f:
        return r0;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
    L_0x0052:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
    L_0x0056:
        com.whatsapp.util.Log.c(r1);
        goto L_0x004f;
    L_0x005a:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
    L_0x005c:
        r1 = move-exception;
        goto L_0x0056;
    L_0x005e:
        r0 = r8.b;	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
        r2 = 2;
        com.whatsapp.LocationPicker2.a(r0, r2);	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
        r0 = r8.d;	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
        r2 = r8.a;	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
        r3 = 0;
        r4 = r8.c;	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
        r0 = com.whatsapp.atb.a(r0, r2, r3, r4);	 Catch:{ IOException -> 0x0052, JSONException -> 0x009a }
        r1 = r0.isEmpty();	 Catch:{ IOException -> 0x0098, JSONException -> 0x0093 }
        if (r1 == 0) goto L_0x004f;
    L_0x0075:
        r1 = r0.a();	 Catch:{ IOException -> 0x0098, JSONException -> 0x0093 }
        if (r1 == 0) goto L_0x004f;
    L_0x007b:
        r1 = r8.b;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r2 = 1;
        com.whatsapp.LocationPicker2.c(r1, r2);	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r1 = r8.d;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r2 = r8.a;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r3 = 0;
        r4 = r8.c;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r0 = com.whatsapp.atb.b(r1, r2, r3, r4);	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r1 = r8.b;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        r2 = 1;
        com.whatsapp.LocationPicker2.a(r1, r2);	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
        goto L_0x004f;
    L_0x0093:
        r1 = move-exception;
    L_0x0094:
        com.whatsapp.util.Log.c(r1);
        goto L_0x004f;
    L_0x0098:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x005c, JSONException -> 0x0093 }
    L_0x009a:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a_q.a(java.lang.Void[]):com.whatsapp.atb");
    }
}
