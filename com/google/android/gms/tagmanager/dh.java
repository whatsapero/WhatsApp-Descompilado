package com.google.android.gms.tagmanager;

class dh extends Number implements Comparable {
    private double atZ;
    private long aua;
    private boolean aub;

    private dh(double d) {
        this.atZ = d;
        this.aub = false;
    }

    private dh(long j) {
        this.aua = j;
        this.aub = true;
    }

    public static dh a(Double d) {
        return new dh(d.doubleValue());
    }

    public static dh cY(String str) {
        try {
            return new dh(Long.parseLong(str));
        } catch (NumberFormatException e) {
            try {
                return new dh(Double.parseDouble(str));
            } catch (NumberFormatException e2) {
                throw new NumberFormatException(str + " is not a valid TypedNumber");
            }
        }
    }

    public static dh z(long j) {
        return new dh(j);
    }

    public int a(dh dhVar) {
        try {
            if (qR()) {
                if (dhVar.qR()) {
                    return new Long(this.aua).compareTo(Long.valueOf(dhVar.aua));
                }
            }
            try {
                return Double.compare(doubleValue(), dhVar.doubleValue());
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public byte byteValue() {
        return (byte) ((int) longValue());
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((dh) obj);
    }

    public double doubleValue() {
        try {
            return qR() ? (double) this.aua : this.atZ;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public boolean equals(Object obj) {
        try {
            if (obj instanceof dh) {
                if (a((dh) obj) == 0) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public int intValue() {
        return qT();
    }

    public long longValue() {
        return qS();
    }

    public boolean qQ() {
        try {
            return !qR();
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public boolean qR() {
        return this.aub;
    }

    public long qS() {
        try {
            return qR() ? this.aua : (long) this.atZ;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public int qT() {
        return (int) longValue();
    }

    public short qU() {
        return (short) ((int) longValue());
    }

    public short shortValue() {
        return qU();
    }

    public String toString() {
        try {
            return qR() ? Long.toString(this.aua) : Double.toString(this.atZ);
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
