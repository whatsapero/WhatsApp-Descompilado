package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class gk implements b1 {
    private dQ a;
    private fx b;
    private boolean c;
    private b1 d;
    private List e;
    private E f;
    private List g;
    private boolean h;

    public void a(int i) {
        b();
        this.e.remove(i);
        if (this.g != null) {
            fH fHVar = (fH) this.g.remove(i);
            if (fHVar != null) {
                try {
                    fHVar.d();
                } catch (NullPointerException e) {
                    throw e;
                }
            }
        }
        h();
        d();
    }

    public gk a(Iterable iterable) {
        boolean z = dy.b;
        for (d0 d0Var : iterable) {
            if (d0Var != null) {
                if (z) {
                    break;
                }
            }
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        if (iterable instanceof Collection) {
            try {
            } catch (NullPointerException e2) {
                throw e2;
            }
            if (((Collection) iterable).size() != 0) {
                b();
                for (d0 d0Var2 : iterable) {
                    a(d0Var2);
                    if (z) {
                        break;
                    }
                }
                h();
                d();
            }
        } else {
            b();
            for (d0 d0Var22 : iterable) {
                a(d0Var22);
                if (z) {
                    break;
                }
            }
            h();
            d();
        }
        return this;
    }

    public void e() {
        this.d = null;
    }

    private void h() {
        try {
            try {
                if (!this.c) {
                    return;
                }
                if (this.d != null) {
                    this.d.a();
                    this.c = false;
                }
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    private d0 a(int i, boolean z) {
        try {
            if (this.g == null) {
                return (d0) this.e.get(i);
            }
            fH fHVar = (fH) this.g.get(i);
            if (fHVar == null) {
                try {
                    return (d0) this.e.get(i);
                } catch (NullPointerException e) {
                    throw e;
                }
            } else if (!z) {
                return fHVar.a();
            } else {
                try {
                    return fHVar.c();
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    public int j() {
        return this.e.size();
    }

    public boolean c() {
        return this.e.isEmpty();
    }

    public d0 b(int i) {
        return a(i, false);
    }

    public gk(List list, boolean z, b1 b1Var, boolean z2) {
        this.e = list;
        this.h = z;
        this.d = b1Var;
        this.c = z2;
    }

    public void a() {
        h();
    }

    public gk a(int i, d0 d0Var) {
        if (d0Var == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        b();
        this.e.set(i, d0Var);
        if (this.g != null) {
            fH fHVar = (fH) this.g.set(i, null);
            if (fHVar != null) {
                try {
                    fHVar.d();
                } catch (NullPointerException e2) {
                    throw e2;
                }
            }
        }
        h();
        d();
        return this;
    }

    public List g() {
        boolean z = dy.b;
        try {
            this.c = true;
            if (!this.h) {
                if (this.g == null) {
                    return this.e;
                }
            }
            try {
                int i;
                if (!this.h) {
                    boolean z2;
                    int i2 = 0;
                    boolean z3 = true;
                    while (i2 < this.e.size()) {
                        Object obj = (eb) this.e.get(i2);
                        fH fHVar = (fH) this.g.get(i2);
                        if (fHVar != null) {
                            try {
                            } catch (NullPointerException e) {
                                throw e;
                            }
                            if (fHVar.c() != obj) {
                                if (!z) {
                                    z2 = false;
                                    break;
                                }
                                z2 = false;
                                i = i2 + 1;
                                if (z) {
                                    break;
                                }
                                i2 = i;
                                z3 = z2;
                            }
                        }
                        z2 = z3;
                        i = i2 + 1;
                        if (z) {
                            break;
                        }
                        i2 = i;
                        z3 = z2;
                    }
                    z2 = z3;
                    if (z2) {
                        try {
                            return this.e;
                        } catch (NullPointerException e2) {
                            throw e2;
                        }
                    }
                }
                b();
                i = 0;
                while (i < this.e.size()) {
                    this.e.set(i, a(i, true));
                    i++;
                    if (z) {
                        break;
                    }
                }
                this.e = Collections.unmodifiableList(this.e);
                this.h = false;
                return this.e;
            }
        } catch (NullPointerException e22) {
            throw e22;
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    public void i() {
        boolean z = dy.b;
        this.e = Collections.emptyList();
        this.h = false;
        if (this.g != null) {
            for (fH fHVar : this.g) {
                if (fHVar != null) {
                    try {
                        fHVar.d();
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                if (z) {
                    break;
                }
            }
            this.g = null;
        }
        h();
        d();
    }

    public ax c(int i) {
        f();
        fH fHVar = (fH) this.g.get(i);
        if (fHVar == null) {
            fH fHVar2 = new fH((d0) this.e.get(i), this, this.c);
            this.g.set(i, fHVar2);
            fHVar = fHVar2;
        }
        return fHVar.e();
    }

    public gk a(d0 d0Var) {
        if (d0Var == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            b();
            this.e.add(d0Var);
            if (this.g != null) {
                this.g.add(null);
            }
            h();
            d();
            return this;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public eE d(int i) {
        try {
            if (this.g == null) {
                return (eE) this.e.get(i);
            }
            fH fHVar = (fH) this.g.get(i);
            if (fHVar != null) {
                return fHVar.f();
            }
            try {
                return (eE) this.e.get(i);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    private void d() {
        try {
            if (this.b != null) {
                this.b.a();
            }
            try {
                if (this.f != null) {
                    this.f.a();
                }
                try {
                    if (this.a != null) {
                        this.a.a();
                    }
                } catch (NullPointerException e) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    private void b() {
        try {
            if (!this.h) {
                this.e = new ArrayList(this.e);
                this.h = true;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void f() {
        boolean z = dy.b;
        if (this.g == null) {
            this.g = new ArrayList(this.e.size());
            int i = 0;
            while (i < this.e.size()) {
                this.g.add(null);
                i++;
                if (z) {
                    return;
                }
            }
        }
    }
}
