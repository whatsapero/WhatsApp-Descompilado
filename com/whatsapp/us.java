package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class us extends AsyncTask {
    public static int g;
    private static final String[] z;
    private final MediaData a;
    protected final b b;
    LocationListener c;
    Location d;
    Location e;
    private final LocationManager f;
    LocationListener h;
    int i;
    boolean j;
    public int k;
    private byte[] l;
    private Location m;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean a(java.lang.Void[] r6) {
        /*
        r5_this = this;
        r0 = 0;
        r1 = com.whatsapp.App.az;
        r2 = r5.m;	 Catch:{ InterruptedException -> 0x005b }
        if (r2 != 0) goto L_0x0067;
    L_0x0007:
        r2 = r5.j;	 Catch:{ InterruptedException -> 0x005b }
        if (r2 != 0) goto L_0x0018;
    L_0x000b:
        r2 = 40;
        if (r0 >= r2) goto L_0x0018;
    L_0x000f:
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x0081, IllegalArgumentException -> 0x005d }
    L_0x0014:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0007;
    L_0x0018:
        r0 = r5.j;	 Catch:{ InterruptedException -> 0x005f }
        if (r0 == 0) goto L_0x0022;
    L_0x001c:
        r0 = r5.d;	 Catch:{ InterruptedException -> 0x0061 }
        r5.m = r0;	 Catch:{ InterruptedException -> 0x0061 }
        if (r1 == 0) goto L_0x0067;
    L_0x0022:
        r0 = r5.e;	 Catch:{ InterruptedException -> 0x0063 }
        if (r0 == 0) goto L_0x004c;
    L_0x0026:
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0065 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x0065 }
        r2 = z;	 Catch:{ InterruptedException -> 0x0065 }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ InterruptedException -> 0x0065 }
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x0065 }
        r2 = r5.e;	 Catch:{ InterruptedException -> 0x0065 }
        r2 = r2.toString();	 Catch:{ InterruptedException -> 0x0065 }
        r0 = r0.append(r2);	 Catch:{ InterruptedException -> 0x0065 }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x0065 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0065 }
        r0 = r5.e;	 Catch:{ InterruptedException -> 0x0065 }
        r5.m = r0;	 Catch:{ InterruptedException -> 0x0065 }
        if (r1 == 0) goto L_0x0067;
    L_0x004c:
        r0 = z;	 Catch:{ InterruptedException -> 0x0065 }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ InterruptedException -> 0x0065 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x0065 }
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ InterruptedException -> 0x0065 }
    L_0x005a:
        return r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = r5.m;
        r0 = r0.getLatitude();
        r2 = r5.m;
        r2 = r2.getLongitude();
        r4 = r5.k;
        r0 = b(r0, r2, r4);
        r5.l = r0;
        r0 = 1;
        r0 = java.lang.Boolean.valueOf(r0);
        goto L_0x005a;
    L_0x0081:
        r2 = move-exception;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.us.a(java.lang.Void[]):java.lang.Boolean");
    }

    public static byte[] b(double d, double d2, int i) {
        Bitmap a = a(d, d2, i);
        if (a == null) {
            return null;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        a.recycle();
        return toByteArray;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Boolean r6) {
        /*
        r5_this = this;
        r3 = 1;
        r2 = 0;
        r1 = com.whatsapp.App.az;
        r0 = r5.a;
        r0.transferring = r2;
        r0 = r6.booleanValue();
        if (r0 == 0) goto L_0x0047;
    L_0x000e:
        r0 = r5.a;
        r0.transferred = r3;
        r0 = r5.b;
        r0 = r0.A;
        r0 = (com.whatsapp.MediaData) r0;
        r2 = r5.b;	 Catch:{ IllegalArgumentException -> 0x008e }
        r3 = 1;
        r2.O = r3;	 Catch:{ IllegalArgumentException -> 0x008e }
        r2 = r5.b;	 Catch:{ IllegalArgumentException -> 0x008e }
        r3 = r5.l;	 Catch:{ IllegalArgumentException -> 0x008e }
        r2.b(r3);	 Catch:{ IllegalArgumentException -> 0x008e }
        r2 = r5.b;	 Catch:{ IllegalArgumentException -> 0x008e }
        r2.A = r0;	 Catch:{ IllegalArgumentException -> 0x008e }
        r0 = r5.m;	 Catch:{ IllegalArgumentException -> 0x008e }
        if (r0 == 0) goto L_0x0040;
    L_0x002c:
        r0 = r5.b;	 Catch:{ IllegalArgumentException -> 0x008e }
        r2 = r5.m;	 Catch:{ IllegalArgumentException -> 0x008e }
        r2 = r2.getLatitude();	 Catch:{ IllegalArgumentException -> 0x008e }
        r0.K = r2;	 Catch:{ IllegalArgumentException -> 0x008e }
        r0 = r5.b;	 Catch:{ IllegalArgumentException -> 0x008e }
        r2 = r5.m;	 Catch:{ IllegalArgumentException -> 0x008e }
        r2 = r2.getLongitude();	 Catch:{ IllegalArgumentException -> 0x008e }
        r0.G = r2;	 Catch:{ IllegalArgumentException -> 0x008e }
    L_0x0040:
        r0 = r5.b;	 Catch:{ IllegalArgumentException -> 0x0090 }
        com.whatsapp.App.c(r0);	 Catch:{ IllegalArgumentException -> 0x0090 }
        if (r1 == 0) goto L_0x008a;
    L_0x0047:
        r0 = com.whatsapp.App.aJ;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2 = r5.b;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r3 = 0;
        r4 = -1;
        r0.a(r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x0092 }
        r0 = r5.f;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0092 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0092 }
        r0 = r0.isProviderEnabled(r2);	 Catch:{ IllegalArgumentException -> 0x0092 }
        if (r0 != 0) goto L_0x008a;
    L_0x005d:
        r0 = com.whatsapp.Conversation.r();	 Catch:{ IllegalArgumentException -> 0x0094 }
        if (r0 == 0) goto L_0x007f;
    L_0x0063:
        r0 = com.whatsapp.Conversation.t();	 Catch:{ IllegalArgumentException -> 0x0096 }
        r0 = r0.u;	 Catch:{ IllegalArgumentException -> 0x0096 }
        r2 = r5.b;	 Catch:{ IllegalArgumentException -> 0x0096 }
        r2 = r2.e;	 Catch:{ IllegalArgumentException -> 0x0096 }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0096 }
        r0 = r0.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0096 }
        if (r0 == 0) goto L_0x007f;
    L_0x0075:
        r0 = com.whatsapp.Conversation.t();	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = 2;
        r0.showDialog(r2);	 Catch:{ IllegalArgumentException -> 0x0098 }
        if (r1 == 0) goto L_0x008a;
    L_0x007f:
        r0 = com.whatsapp.Conversation.bc;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r1 = r5.b;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r1 = r1.e;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r1 = r1.c;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r0.add(r1);	 Catch:{ IllegalArgumentException -> 0x0098 }
    L_0x008a:
        r5.a();
        return;
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.us.a(java.lang.Boolean):void");
    }

    public us(Context context, b bVar) {
        this.k = g;
        this.l = null;
        this.i = 0;
        this.d = null;
        this.e = null;
        this.b = bVar;
        this.a = (MediaData) bVar.A;
        this.f = (LocationManager) context.getSystemService(z[18]);
        if (bVar.K != 0.0d) {
            try {
                if (bVar.G != 0.0d) {
                    this.m = new Location("");
                    this.m.setLatitude(bVar.K);
                    this.m.setLongitude(bVar.G);
                    this.j = true;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public void a() {
        try {
            if (this.f != null) {
                if (this.c != null) {
                    this.f.removeUpdates(this.c);
                    this.c = null;
                }
                try {
                    if (this.h != null) {
                        this.f.removeUpdates(this.h);
                        this.h = null;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    void b() {
        try {
            if (this.c == null) {
                this.c = new zz(this);
            }
            try {
                if (this.h == null) {
                    this.h = new ek(this);
                }
                try {
                    this.f.requestLocationUpdates(z[17], 1000, 1.0f, this.c);
                } catch (IllegalArgumentException e) {
                    Log.w(z[16] + e.toString());
                    this.c = null;
                }
                try {
                    this.f.requestLocationUpdates(z[14], 1000, 1.0f, this.h);
                } catch (IllegalArgumentException e2) {
                    Log.w(z[15] + e2.toString());
                    this.h = null;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public static byte[] a(double d, double d2) {
        return b(d, d2, g);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(double r10, double r12, int r14) {
        /*
        r9 = 100;
        r2 = 1;
        r4 = 0;
        r1 = 0;
        r0 = new org.apache.http.params.BasicHttpParams;
        r0.<init>();
        r3 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r0, r3);
        r3 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r0, r3);
        r6 = new org.apache.http.impl.client.DefaultHttpClient;
        r6.<init>(r0);
        r0 = new org.apache.http.client.methods.HttpGet;	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3.<init>();	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r5 = z;	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r7 = 9;
        r5 = r5[r7];	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3 = r3.append(r10);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r5 = ",";
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3 = r3.append(r12);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r5 = z;	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r7 = 10;
        r5 = r5[r7];	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r5 = 21;
        r7 = 1;
        r7 = java.lang.Math.max(r7, r14);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r5 = java.lang.Math.min(r5, r7);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r5 = z;	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r7 = 4;
        r5 = r5[r7];	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3 = r3.append(r10);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r5 = ",";
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3 = r3.append(r12);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r0.<init>(r3);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r0 = r6.execute(r0);	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r0 = r0.getEntity();	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r5 = r0.getContent();	 Catch:{ IOException -> 0x01ff, all -> 0x01c6 }
        r0 = 0;
        r3 = com.whatsapp.util.f.c;	 Catch:{ IOException -> 0x0204, all -> 0x01f6 }
        r3 = android.graphics.BitmapFactory.decodeStream(r5, r0, r3);	 Catch:{ IOException -> 0x0204, all -> 0x01f6 }
        if (r3 == 0) goto L_0x0094;
    L_0x0084:
        r0 = r3.getWidth();	 Catch:{ IOException -> 0x018f, all -> 0x01f8 }
        r7 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        if (r0 != r7) goto L_0x0094;
    L_0x008c:
        r0 = r3.getHeight();	 Catch:{ IOException -> 0x0191, all -> 0x01f8 }
        r7 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        if (r0 == r7) goto L_0x0198;
    L_0x0094:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x00a0, all -> 0x01f8 }
        r1 = z;	 Catch:{ IOException -> 0x00a0, all -> 0x01f8 }
        r7 = 11;
        r1 = r1[r7];	 Catch:{ IOException -> 0x00a0, all -> 0x01f8 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00a0, all -> 0x01f8 }
        throw r0;	 Catch:{ IOException -> 0x00a0, all -> 0x01f8 }
    L_0x00a0:
        r0 = move-exception;
        r1 = r2;
        r2 = r3;
        r3 = r5;
    L_0x00a4:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01fb }
        r5.<init>();	 Catch:{ all -> 0x01fb }
        r7 = z;	 Catch:{ all -> 0x01fb }
        r8 = 3;
        r7 = r7[r8];	 Catch:{ all -> 0x01fb }
        r5 = r5.append(r7);	 Catch:{ all -> 0x01fb }
        r0 = r0.toString();	 Catch:{ all -> 0x01fb }
        r0 = r5.append(r0);	 Catch:{ all -> 0x01fb }
        r0 = r0.toString();	 Catch:{ all -> 0x01fb }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x01fb }
        if (r2 == 0) goto L_0x00c8;
    L_0x00c3:
        if (r2 == 0) goto L_0x00c8;
    L_0x00c5:
        r2.recycle();	 Catch:{ IOException -> 0x01bd }
    L_0x00c8:
        if (r3 == 0) goto L_0x00cd;
    L_0x00ca:
        r3.close();	 Catch:{ IllegalArgumentException -> 0x01bf }
    L_0x00cd:
        r0 = r4;
        r2 = r3;
    L_0x00cf:
        if (r0 != 0) goto L_0x018e;
    L_0x00d1:
        if (r1 == 0) goto L_0x018e;
    L_0x00d3:
        r1 = new org.apache.http.client.methods.HttpGet;	 Catch:{ IOException -> 0x016b }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x016b }
        r3.<init>();	 Catch:{ IOException -> 0x016b }
        r4 = z;	 Catch:{ IOException -> 0x016b }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ IOException -> 0x016b }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x016b }
        r3 = r3.append(r10);	 Catch:{ IOException -> 0x016b }
        r4 = ",";
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x016b }
        r3 = r3.append(r12);	 Catch:{ IOException -> 0x016b }
        r4 = "/";
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x016b }
        r4 = 21;
        r5 = 1;
        r5 = java.lang.Math.max(r5, r14);	 Catch:{ IOException -> 0x016b }
        r4 = java.lang.Math.min(r4, r5);	 Catch:{ IOException -> 0x016b }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x016b }
        r4 = z;	 Catch:{ IOException -> 0x016b }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ IOException -> 0x016b }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x016b }
        r3 = r3.append(r10);	 Catch:{ IOException -> 0x016b }
        r4 = ",";
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x016b }
        r3 = r3.append(r12);	 Catch:{ IOException -> 0x016b }
        r4 = z;	 Catch:{ IOException -> 0x016b }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ IOException -> 0x016b }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x016b }
        r4 = z;	 Catch:{ IOException -> 0x016b }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ IOException -> 0x016b }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x016b }
        r4 = com.whatsapp.ce.e;	 Catch:{ IOException -> 0x016b }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x016b }
        r3 = r3.toString();	 Catch:{ IOException -> 0x016b }
        r1.<init>(r3);	 Catch:{ IOException -> 0x016b }
        r1 = r6.execute(r1);	 Catch:{ IOException -> 0x016b }
        r1 = r1.getEntity();	 Catch:{ IOException -> 0x016b }
        r2 = r1.getContent();	 Catch:{ IOException -> 0x016b }
        r1 = 0;
        r3 = com.whatsapp.util.f.c;	 Catch:{ IOException -> 0x016b }
        r0 = android.graphics.BitmapFactory.decodeStream(r2, r1, r3);	 Catch:{ IOException -> 0x016b }
        if (r0 == 0) goto L_0x015e;
    L_0x0152:
        r1 = r0.getWidth();	 Catch:{ IOException -> 0x01db }
        if (r1 != r9) goto L_0x015e;
    L_0x0158:
        r1 = r0.getHeight();	 Catch:{ IOException -> 0x01dd }
        if (r1 == r9) goto L_0x01e6;
    L_0x015e:
        r1 = new java.io.IOException;	 Catch:{ IOException -> 0x0169 }
        r3 = z;	 Catch:{ IOException -> 0x0169 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0169 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x0169 }
        throw r1;	 Catch:{ IOException -> 0x0169 }
    L_0x0169:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x016b }
    L_0x016b:
        r1 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01df }
        r3.<init>();	 Catch:{ all -> 0x01df }
        r4 = z;	 Catch:{ all -> 0x01df }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ all -> 0x01df }
        r3 = r3.append(r4);	 Catch:{ all -> 0x01df }
        r1 = r1.toString();	 Catch:{ all -> 0x01df }
        r1 = r3.append(r1);	 Catch:{ all -> 0x01df }
        r1 = r1.toString();	 Catch:{ all -> 0x01df }
        com.whatsapp.util.Log.w(r1);	 Catch:{ all -> 0x01df }
        if (r2 == 0) goto L_0x018e;
    L_0x018b:
        r2.close();	 Catch:{ IOException -> 0x01f4 }
    L_0x018e:
        return r0;
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0191, all -> 0x01f8 }
    L_0x0191:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0193, all -> 0x01f8 }
    L_0x0193:
        r0 = move-exception;
        r2 = r3;
        r3 = r5;
        goto L_0x00a4;
    L_0x0198:
        r0 = 35;
        r2 = 35;
        r7 = 100;
        r8 = 100;
        r4 = android.graphics.Bitmap.createBitmap(r3, r0, r2, r7, r8);	 Catch:{ IOException -> 0x0193, all -> 0x01f8 }
        if (r3 == 0) goto L_0x01ab;
    L_0x01a6:
        if (r3 == r4) goto L_0x01ab;
    L_0x01a8:
        r3.recycle();	 Catch:{ IOException -> 0x01b4 }
    L_0x01ab:
        if (r5 == 0) goto L_0x01b0;
    L_0x01ad:
        r5.close();	 Catch:{ IllegalArgumentException -> 0x01b6 }
    L_0x01b0:
        r0 = r4;
        r2 = r5;
        goto L_0x00cf;
    L_0x01b4:
        r0 = move-exception;
        throw r0;
    L_0x01b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01b8 }
    L_0x01b8:
        r0 = move-exception;
        r0 = r4;
        r2 = r5;
        goto L_0x00cf;
    L_0x01bd:
        r0 = move-exception;
        throw r0;
    L_0x01bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01c1 }
    L_0x01c1:
        r0 = move-exception;
        r0 = r4;
        r2 = r3;
        goto L_0x00cf;
    L_0x01c6:
        r0 = move-exception;
        r5 = r4;
    L_0x01c8:
        if (r4 == 0) goto L_0x01cf;
    L_0x01ca:
        if (r4 == 0) goto L_0x01cf;
    L_0x01cc:
        r4.recycle();	 Catch:{ IOException -> 0x01d5 }
    L_0x01cf:
        if (r5 == 0) goto L_0x01d4;
    L_0x01d1:
        r5.close();	 Catch:{ IllegalArgumentException -> 0x01d7 }
    L_0x01d4:
        throw r0;
    L_0x01d5:
        r0 = move-exception;
        throw r0;
    L_0x01d7:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x01d9 }
    L_0x01d9:
        r1 = move-exception;
        goto L_0x01d4;
    L_0x01db:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x01dd }
    L_0x01dd:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0169 }
    L_0x01df:
        r0 = move-exception;
        if (r2 == 0) goto L_0x01e5;
    L_0x01e2:
        r2.close();	 Catch:{ IllegalArgumentException -> 0x01f0 }
    L_0x01e5:
        throw r0;
    L_0x01e6:
        if (r2 == 0) goto L_0x018e;
    L_0x01e8:
        r2.close();	 Catch:{ IllegalArgumentException -> 0x01ec }
        goto L_0x018e;
    L_0x01ec:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x01ee }
    L_0x01ee:
        r1 = move-exception;
        goto L_0x018e;
    L_0x01f0:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x01f2 }
    L_0x01f2:
        r1 = move-exception;
        goto L_0x01e5;
    L_0x01f4:
        r1 = move-exception;
        goto L_0x018e;
    L_0x01f6:
        r0 = move-exception;
        goto L_0x01c8;
    L_0x01f8:
        r0 = move-exception;
        r4 = r3;
        goto L_0x01c8;
    L_0x01fb:
        r0 = move-exception;
        r4 = r2;
        r5 = r3;
        goto L_0x01c8;
    L_0x01ff:
        r0 = move-exception;
        r2 = r4;
        r3 = r4;
        goto L_0x00a4;
    L_0x0204:
        r0 = move-exception;
        r2 = r4;
        r3 = r5;
        goto L_0x00a4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.us.a(double, double, int):android.graphics.Bitmap");
    }

    public void onPreExecute() {
        b();
        this.a.transferring = true;
        App.aJ.a(this.b, false, -1);
    }

    static {
        String[] strArr = new String[19];
        String str = "C\u000eQ";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 36;
                        break;
                    case ay.f /*1*/:
                        i4 = 126;
                        break;
                    case ay.n /*2*/:
                        i4 = 34;
                        break;
                    case ay.p /*3*/:
                        i4 = 97;
                        break;
                    default:
                        i4 = 80;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "I\u001fR\u0005?S\u0010N\u000e1@QK\u000e5V\fM\u0013p";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "I\u001fR\u0005?S\u0010N\u000e1@QK\u000e5V\fM\u0013p";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "\u0002\rK\u001b5\u0019O\u0015Q(\u0015I\u0012G#A\u0010Q\u000e\"\u0019\nP\u00145\u0002\u0018M\u0013=E\n\u001f\u0011>CF\u0004\f?F\u0017N\u0004mP\fW\u0004vI\u001fP\n5V\r\u001f\u0002?H\u0011P[\"A\u001a\u0007V\u0013W\u0017X\u0004jI\u0017FDgg";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "F\u001fFA2M\nO\u0000 \u0004\fG\u00025M\bG\u0005";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u001b\u0013C\u0011\u0003M\u0004G\\a\u0014N\u000eP`\u0014XR\u0011m";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "L\nV\u0011#\u001eQ\r\u00055RPT\b\"P\u000bC\r5E\fV\t~J\u001bVN\u0002a-vN&\u0015Qk\f1C\u001bP\u0018\u007fi\u001fRN\u0002K\u001fFN";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0002\u0015G\u0018m";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "L\nV\u0011#\u001eQ\r\f1T\r\f\u0006?K\u0019N\u00041T\u0017QO3K\u0013\r\f1T\r\r\u0000 MQQ\u00151P\u0017A\f1TAA\u0004>P\u001bP\\";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0002\u0004M\u000e=\u0019";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "F\u001fFA2M\nO\u0000 \u0004\fG\u00025M\bG\u0005";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "I\u001fR\u0005?S\u0010N\u000e1@QA\u000e1V\rG-?G\u001fV\b?J^";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "I\u001fR\u0005?S\u0010N\u000e1@QD\u00009H\u001bFN\"A\nP\u0018";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "J\u001bV\u0016?V\u0015";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    str = "I\u001fR\u0005?S\u0010N\u000e1@QA\u000e1V\rGN5V\fM\u0013p";
                    i = 14;
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    strArr2 = strArr3;
                    str = "I\u001fR\u0005?S\u0010N\u000e1@QD\b>AQG\u0013\"K\f\u0002";
                    i = 15;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "C\u000eQ";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "H\u0011A\u0000$M\u0011L";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    g = 15;
                default:
                    strArr2[i2] = str;
                    str = "\u001fK\u0016Z";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
