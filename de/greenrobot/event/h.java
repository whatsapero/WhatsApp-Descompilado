package de.greenrobot.event;

final class h {
    final Object a;
    volatile boolean b;
    final q c;
    final int d;

    h(Object obj, q qVar, int i) {
        this.a = obj;
        this.c = qVar;
        this.d = i;
        this.b = true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.c.equals(hVar.c);
    }

    public int hashCode() {
        return this.a.hashCode() + this.c.a.hashCode();
    }
}
