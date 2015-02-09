package de.greenrobot.event;

class n extends ThreadLocal {
    final g a;

    protected l a() {
        return new l();
    }

    n(g gVar) {
        this.a = gVar;
    }

    protected Object initialValue() {
        return a();
    }
}
