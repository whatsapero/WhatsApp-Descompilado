package de.greenrobot.event;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class f {
    private static final ExecutorService b;
    boolean a;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    List g;
    ExecutorService h;
    boolean i;

    f() {
        this.f = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.i = true;
        this.h = b;
    }

    static {
        b = Executors.newCachedThreadPool();
    }
}
