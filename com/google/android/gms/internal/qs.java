package com.google.android.gms.internal;

class qs {
    private static final qt ayZ;
    private boolean aza;
    private int[] azb;
    private qt[] azc;
    private int mSize;

    static {
        ayZ = new qt();
    }

    public qs() {
        this(10);
    }

    public qs(int i) {
        this.aza = false;
        int idealIntArraySize = idealIntArraySize(i);
        this.azb = new int[idealIntArraySize];
        this.azc = new qt[idealIntArraySize];
        this.mSize = 0;
    }

    private boolean a(int[] iArr, int[] iArr2, int i) {
        boolean z = qw.a;
        int i2 = 0;
        while (i2 < i) {
            if (iArr[i2] == iArr2[i2]) {
                i2++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    private boolean a(qt[] qtVarArr, qt[] qtVarArr2, int i) {
        boolean z = qw.a;
        int i2 = 0;
        while (i2 < i) {
            if (qtVarArr[i2].equals(qtVarArr2[i2])) {
                i2++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    private void gc() {
        boolean z = qw.a;
        int i = this.mSize;
        int[] iArr = this.azb;
        qt[] qtVarArr = this.azc;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            qt qtVar = qtVarArr[i2];
            if (qtVar != ayZ) {
                if (i2 != i3) {
                    iArr[i3] = iArr[i2];
                    qtVarArr[i3] = qtVar;
                    qtVarArr[i2] = null;
                }
                i3++;
            }
            i2++;
            if (z) {
                break;
            }
        }
        this.aza = false;
        this.mSize = i3;
    }

    private int idealByteArraySize(int i) {
        boolean z = qw.a;
        int i2 = 4;
        while (i2 < 32) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
            i2++;
            if (z) {
                return i;
            }
        }
        return i;
    }

    private int idealIntArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qs)) {
            return false;
        }
        qs qsVar = (qs) obj;
        return size() != qsVar.size() ? false : a(this.azb, qsVar.azb, this.mSize) && a(this.azc, qsVar.azc, this.mSize);
    }

    public int hashCode() {
        boolean z = qw.a;
        if (this.aza) {
            gc();
        }
        int i = 17;
        int i2 = 0;
        while (i2 < this.mSize) {
            i = (((i * 31) + this.azb[i2]) * 31) + this.azc[i2].hashCode();
            i2++;
            if (z) {
                break;
            }
        }
        return i;
    }

    public qt hi(int i) {
        if (this.aza) {
            gc();
        }
        return this.azc[i];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        if (this.aza) {
            gc();
        }
        return this.mSize;
    }
}
