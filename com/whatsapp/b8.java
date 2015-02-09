package com.whatsapp;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.whatsapp.util.Log;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class b8 {
    private static final String[] z;
    private HashMap a;
    private LocationManager b;
    private y6 c;
    private GoogleApiClient d;

    static {
        String[] strArr = new String[7];
        String str = "NZ$\u00077KZ)";
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
                        i3 = 53;
                        break;
                    case ay.n /*2*/:
                        i3 = 71;
                        break;
                    case ay.p /*3*/:
                        i3 = 102;
                        break;
                    default:
                        i3 = 67;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "EE4";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "LP3\u0011,P^";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "D@4\u0003'NZ$\u00077KZ)\u00161MC.\u0002&P";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "D@4\u0003'NZ$\u00077KZ)\u00161MC.\u0002&P";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "EE4";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "LP3\u0011,P^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static GoogleApiClient b(b8 b8Var) {
        return b8Var.d;
    }

    public Location a(int i) {
        try {
            if (this.d != null) {
                if (this.d.isConnected()) {
                    return LocationServices.FusedLocationApi.getLastLocation(this.d);
                }
            }
            try {
                if (i != 1) {
                    return this.b.getLastKnownLocation(z[1]);
                }
                try {
                    return this.b.getLastKnownLocation(z[2]);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    static HashMap a(b8 b8Var) {
        return b8Var.a;
    }

    public void a(long j, float f, LocationListener locationListener) {
        a(3, j, f, locationListener);
    }

    public void a(int i, long j, float f, LocationListener locationListener) {
        try {
            if (this.d != null) {
                if (this.a.isEmpty()) {
                    this.d.connect();
                }
                try {
                    boolean z;
                    if ((i & 1) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.google.android.gms.location.LocationListener xqVar = new xq(j, f, z, locationListener);
                    this.a.put(locationListener, xqVar);
                    if (this.d.isConnected()) {
                        LocationRequest create = LocationRequest.create();
                        try {
                            int i2;
                            if (xq.c(xqVar)) {
                                i2 = 100;
                            } else {
                                i2 = 102;
                            }
                            create.setPriority(i2);
                            create.setInterval(xq.a(xqVar));
                            create.setFastestInterval(1000);
                            create.setSmallestDisplacement(xq.b(xqVar));
                            LocationServices.FusedLocationApi.requestLocationUpdates(this.d, create, xqVar);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    try {
                        if (App.az == 0) {
                            return;
                        }
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                } catch (RuntimeException e22) {
                    throw e22;
                }
            }
            if ((i & 1) != 0) {
                try {
                    this.b.requestLocationUpdates(z[6], j, f, locationListener);
                } catch (Throwable e3) {
                    Log.b(z[5], e3);
                }
            }
            if ((i & 2) != 0) {
                try {
                    this.b.requestLocationUpdates(z[3], j, f, locationListener);
                } catch (Throwable e32) {
                    Log.b(z[4], e32);
                }
            }
        } catch (RuntimeException e222) {
            throw e222;
        } catch (RuntimeException e2222) {
            throw e2222;
        }
    }

    public void a(LocationListener locationListener) {
        try {
            if (this.d != null) {
                xq xqVar = (xq) this.a.remove(locationListener);
                if (xqVar != null) {
                    try {
                        if (this.d.isConnected()) {
                            LocationServices.FusedLocationApi.removeLocationUpdates(this.d, xqVar);
                        }
                        try {
                            if (this.a.isEmpty()) {
                                this.d.disconnect();
                            }
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                }
                if (App.az == 0) {
                    return;
                }
            }
            this.b.removeUpdates(locationListener);
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    public b8(Context context) {
        if (VERSION.SDK_INT >= 8) {
            try {
                if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
                    this.c = new y6(this);
                    this.a = new HashMap();
                    this.d = new Builder(context).addApi(LocationServices.API).addConnectionCallbacks(this.c).addOnConnectionFailedListener(this.c).build();
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
        this.b = (LocationManager) context.getSystemService(z[0]);
    }
}
