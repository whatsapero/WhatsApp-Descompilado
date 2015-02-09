package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.location.LocationServices.a;

public final class LocationRequest implements SafeParcelable {
    public static final d CREATOR;
    private final int CK;
    boolean Wg;
    long age;
    long agr;
    long ags;
    int agt;
    float agu;
    long agv;
    int mPriority;

    static {
        CREATOR = new d();
    }

    public LocationRequest() {
        this.CK = 1;
        this.mPriority = 102;
        this.agr = 3600000;
        this.ags = 600000;
        this.Wg = false;
        this.age = Long.MAX_VALUE;
        this.agt = Integer.MAX_VALUE;
        this.agu = 0.0f;
        this.agv = 0;
    }

    LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f, long j4) {
        this.CK = i;
        this.mPriority = i2;
        this.agr = j;
        this.ags = j2;
        this.Wg = z;
        this.age = j3;
        this.agt = i3;
        this.agu = f;
        this.agv = j4;
    }

    private static void a(float f) {
        if (f < 0.0f) {
            try {
                throw new IllegalArgumentException("invalid displacement: " + f);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static LocationRequest create() {
        return new LocationRequest();
    }

    private static void ey(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
            default:
                throw new IllegalArgumentException("invalid quality: " + i);
        }
    }

    public static String ez(int i) {
        switch (i) {
            case 100:
                try {
                    return "PRIORITY_HIGH_ACCURACY";
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case 102:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case 104:
                return "PRIORITY_LOW_POWER";
            case 105:
                return "PRIORITY_NO_POWER";
            default:
                return "???";
        }
    }

    private static void v(long j) {
        if (j < 0) {
            try {
                throw new IllegalArgumentException("invalid interval: " + j);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
        r6_this = this;
        r0 = 1;
        r1 = 0;
        if (r6 != r7) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = r7 instanceof com.google.android.gms.location.LocationRequest;	 Catch:{ IllegalArgumentException -> 0x000b }
        if (r2 != 0) goto L_0x000d;
    L_0x0009:
        r0 = r1;
        goto L_0x0004;
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r7 = (com.google.android.gms.location.LocationRequest) r7;
        r2 = r6.mPriority;	 Catch:{ IllegalArgumentException -> 0x0043 }
        r3 = r7.mPriority;	 Catch:{ IllegalArgumentException -> 0x0043 }
        if (r2 != r3) goto L_0x0041;
    L_0x0015:
        r2 = r6.agr;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r4 = r7.agr;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0041;
    L_0x001d:
        r2 = r6.ags;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = r7.ags;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0041;
    L_0x0025:
        r2 = r6.Wg;	 Catch:{ IllegalArgumentException -> 0x0049 }
        r3 = r7.Wg;	 Catch:{ IllegalArgumentException -> 0x0049 }
        if (r2 != r3) goto L_0x0041;
    L_0x002b:
        r2 = r6.age;	 Catch:{ IllegalArgumentException -> 0x004b }
        r4 = r7.age;	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0041;
    L_0x0033:
        r2 = r6.agt;	 Catch:{ IllegalArgumentException -> 0x004d }
        r3 = r7.agt;	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r2 != r3) goto L_0x0041;
    L_0x0039:
        r2 = r6.agu;	 Catch:{ IllegalArgumentException -> 0x004f }
        r3 = r7.agu;	 Catch:{ IllegalArgumentException -> 0x004f }
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 == 0) goto L_0x0004;
    L_0x0041:
        r0 = r1;
        goto L_0x0004;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.equals(java.lang.Object):boolean");
    }

    int getVersionCode() {
        return this.CK;
    }

    public int hashCode() {
        return jv.hashCode(new Object[]{Integer.valueOf(this.mPriority), Long.valueOf(this.agr), Long.valueOf(this.ags), Boolean.valueOf(this.Wg), Long.valueOf(this.age), Integer.valueOf(this.agt), Float.valueOf(this.agu)});
    }

    public LocationRequest setFastestInterval(long j) {
        v(j);
        this.Wg = true;
        this.ags = j;
        return this;
    }

    public LocationRequest setInterval(long j) {
        try {
            v(j);
            this.agr = j;
            if (!this.Wg) {
                this.ags = (long) (((double) this.agr) / 6.0d);
            }
            return this;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public LocationRequest setPriority(int i) {
        ey(i);
        this.mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f) {
        a(f);
        this.agu = f;
        return this;
    }

    public String toString() {
        int i = LocationServices.a;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append("Request[").append(ez(this.mPriority));
            if (this.mPriority != 105) {
                stringBuilder.append(" requested=");
                stringBuilder.append(this.agr + "ms");
            }
            stringBuilder.append(" fastest=");
            stringBuilder.append(this.ags + "ms");
            if (this.age != Long.MAX_VALUE) {
                long elapsedRealtime = this.age - SystemClock.elapsedRealtime();
                stringBuilder.append(" expireIn=");
                stringBuilder.append(elapsedRealtime + "ms");
            }
            try {
                if (this.agt != Integer.MAX_VALUE) {
                    stringBuilder.append(" num=").append(this.agt);
                }
                try {
                    stringBuilder.append(']');
                    String toString = stringBuilder.toString();
                    if (a.a != 0) {
                        LocationServices.a = i + 1;
                    }
                    return toString;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
