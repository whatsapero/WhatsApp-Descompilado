package de.greenrobot.event.util;

import android.app.Activity;
import de.greenrobot.event.g;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class a {
    private g a;
    private Class b;
    private Executor c;

    a(c cVar) {
        this();
    }

    public m a() {
        return a(null);
    }

    public m a(Object obj) {
        if (this.a == null) {
            this.a = g.b();
        }
        if (this.c == null) {
            this.c = Executors.newCachedThreadPool();
        }
        if (this.b == null) {
            this.b = b.class;
        }
        return new m(this.c, this.a, this.b, obj, null);
    }

    private a() {
    }

    public a a(Class cls) {
        this.b = cls;
        return this;
    }

    public a a(Executor executor) {
        this.c = executor;
        return this;
    }

    public m a(Activity activity) {
        return a(activity.getClass());
    }

    public a a(g gVar) {
        this.a = gVar;
        return this;
    }
}
