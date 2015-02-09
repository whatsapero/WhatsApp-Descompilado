package com.google.android.gms.internal;

public interface d {

    public final class a extends qq {
        private static volatile com.google.android.gms.internal.d.a[] gu;
        public String gA;
        public long gB;
        public boolean gC;
        public com.google.android.gms.internal.d.a[] gD;
        public int[] gE;
        public boolean gF;
        public String gv;
        public com.google.android.gms.internal.d.a[] gw;
        public com.google.android.gms.internal.d.a[] gx;
        public com.google.android.gms.internal.d.a[] gy;
        public String gz;
        public int type;

        public a() {
            s();
        }

        public static com.google.android.gms.internal.d.a[] r() {
            if (gu == null) {
                synchronized (qu.azg) {
                    if (gu == null) {
                        gu = new com.google.android.gms.internal.d.a[0];
                    }
                }
            }
            return gu;
        }

        public void a(qp qpVar) {
            int i;
            qw qwVar;
            int i2 = 0;
            boolean z = qw.a;
            qpVar.t(1, this.type);
            if (!this.gv.equals("")) {
                qpVar.b(2, this.gv);
            }
            if (this.gw != null && this.gw.length > 0) {
                i = 0;
                while (i < this.gw.length) {
                    qwVar = this.gw[i];
                    if (qwVar != null) {
                        qpVar.a(3, qwVar);
                    }
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
            if (this.gx != null && this.gx.length > 0) {
                i = 0;
                while (i < this.gx.length) {
                    qwVar = this.gx[i];
                    if (qwVar != null) {
                        qpVar.a(4, qwVar);
                    }
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
            if (this.gy != null && this.gy.length > 0) {
                i = 0;
                while (i < this.gy.length) {
                    qwVar = this.gy[i];
                    if (qwVar != null) {
                        qpVar.a(5, qwVar);
                    }
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
            if (!this.gz.equals("")) {
                qpVar.b(6, this.gz);
            }
            if (!this.gA.equals("")) {
                qpVar.b(7, this.gA);
            }
            if (this.gB != 0) {
                qpVar.b(8, this.gB);
            }
            if (this.gF) {
                qpVar.b(9, this.gF);
            }
            if (this.gE != null && this.gE.length > 0) {
                i = 0;
                while (i < this.gE.length) {
                    qpVar.t(10, this.gE[i]);
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
            if (this.gD != null && this.gD.length > 0) {
                while (i2 < this.gD.length) {
                    qw qwVar2 = this.gD[i2];
                    if (qwVar2 != null) {
                        qpVar.a(11, qwVar2);
                    }
                    i2++;
                    if (z) {
                        break;
                    }
                }
            }
            if (this.gC) {
                qpVar.b(12, this.gC);
            }
            super.a(qpVar);
        }

        protected int c() {
            int i;
            qw qwVar;
            boolean z = false;
            boolean z2 = qw.a;
            int c = super.c() + qp.v(1, this.type);
            if (!this.gv.equals("")) {
                c += qp.j(2, this.gv);
            }
            if (this.gw != null && this.gw.length > 0) {
                i = c;
                c = 0;
                while (c < this.gw.length) {
                    qwVar = this.gw[c];
                    if (qwVar != null) {
                        i += qp.c(3, qwVar);
                    }
                    c++;
                    if (z2) {
                        break;
                    }
                }
            }
            i = c;
            if (this.gx != null && this.gx.length > 0) {
                c = 0;
                while (c < this.gx.length) {
                    qwVar = this.gx[c];
                    if (qwVar != null) {
                        i += qp.c(4, qwVar);
                    }
                    c++;
                    if (z2) {
                        break;
                    }
                }
            }
            if (this.gy != null && this.gy.length > 0) {
                c = 0;
                while (c < this.gy.length) {
                    qwVar = this.gy[c];
                    if (qwVar != null) {
                        i += qp.c(5, qwVar);
                    }
                    c++;
                    if (z2) {
                        break;
                    }
                }
            }
            if (!this.gz.equals("")) {
                i += qp.j(6, this.gz);
            }
            if (!this.gA.equals("")) {
                i += qp.j(7, this.gA);
            }
            if (this.gB != 0) {
                i += qp.d(8, this.gB);
            }
            if (this.gF) {
                i += qp.c(9, this.gF);
            }
            if (this.gE != null && this.gE.length > 0) {
                c = 0;
                int i2 = 0;
                while (c < this.gE.length) {
                    i2 += qp.gZ(this.gE[c]);
                    c++;
                    if (z2) {
                        break;
                    }
                }
                i = (this.gE.length * 1) + (i + i2);
            }
            if (this.gD != null && this.gD.length > 0) {
                c = 0;
                while (c < this.gD.length) {
                    qwVar = this.gD[c];
                    if (qwVar != null) {
                        i += qp.c(11, qwVar);
                    }
                    c++;
                    if (z2) {
                        break;
                    }
                }
            }
            if (this.gC) {
                i += qp.c(12, this.gC);
            }
            if (jx.a != 0) {
                if (!z2) {
                    z = true;
                }
                qw.a = z;
            }
            return i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.android.gms.internal.d.a)) {
                return false;
            }
            com.google.android.gms.internal.d.a aVar = (com.google.android.gms.internal.d.a) obj;
            if (this.type != aVar.type) {
                return false;
            }
            if (this.gv == null) {
                if (aVar.gv != null) {
                    return false;
                }
            } else if (!this.gv.equals(aVar.gv)) {
                return false;
            }
            if (!qu.equals(this.gw, aVar.gw) || !qu.equals(this.gx, aVar.gx) || !qu.equals(this.gy, aVar.gy)) {
                return false;
            }
            if (this.gz == null) {
                if (aVar.gz != null) {
                    return false;
                }
            } else if (!this.gz.equals(aVar.gz)) {
                return false;
            }
            if (this.gA == null) {
                if (aVar.gA != null) {
                    return false;
                }
            } else if (!this.gA.equals(aVar.gA)) {
                return false;
            }
            return (this.gB == aVar.gB && this.gC == aVar.gC && qu.equals(this.gD, aVar.gD) && qu.equals(this.gE, aVar.gE) && this.gF == aVar.gF) ? a(aVar) : false;
        }

        public int hashCode() {
            int i = 1231;
            int i2 = 0;
            boolean z = qw.a;
            int hashCode = ((this.gz == null ? 0 : this.gz.hashCode()) + (((((((((this.gv == null ? 0 : this.gv.hashCode()) + ((this.type + 527) * 31)) * 31) + qu.hashCode(this.gw)) * 31) + qu.hashCode(this.gx)) * 31) + qu.hashCode(this.gy)) * 31)) * 31;
            if (this.gA != null) {
                i2 = this.gA.hashCode();
            }
            hashCode = ((((((this.gC ? 1231 : 1237) + ((((hashCode + i2) * 31) + ((int) (this.gB ^ (this.gB >>> 32)))) * 31)) * 31) + qu.hashCode(this.gD)) * 31) + qu.hashCode(this.gE)) * 31;
            if (!this.gF) {
                i = 1237;
            }
            hashCode = ((hashCode + i) * 31) + rQ();
            if (z) {
                jx.a++;
            }
            return hashCode;
        }

        public com.google.android.gms.internal.d.a s() {
            this.type = 1;
            this.gv = "";
            this.gw = r();
            this.gx = r();
            this.gy = r();
            this.gz = "";
            this.gA = "";
            this.gB = 0;
            this.gC = false;
            this.gD = r();
            this.gE = qz.azj;
            this.gF = false;
            this.ayW = null;
            this.azh = -1;
            return this;
        }
    }
}
