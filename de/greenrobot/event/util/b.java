package de.greenrobot.event.util;

public class b implements e {
    protected final Throwable a;
    protected final boolean b;
    private Object c;

    public b(Throwable th, boolean z) {
        this.a = th;
        this.b = z;
    }

    public b(Throwable th) {
        this.a = th;
        this.b = false;
    }

    public boolean a() {
        return this.b;
    }

    public Object a() {
        return this.c;
    }

    public void a(Object obj) {
        this.c = obj;
    }

    public Throwable b() {
        return this.a;
    }
}
