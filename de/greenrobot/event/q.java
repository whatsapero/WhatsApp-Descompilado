package de.greenrobot.event;

import java.lang.reflect.Method;

final class q {
    String a;
    final Class b;
    final p c;
    final Method d;

    public int hashCode() {
        return this.d.hashCode();
    }

    private synchronized void a() {
        if (this.a == null) {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append(this.d.getDeclaringClass().getName());
            stringBuilder.append('#').append(this.d.getName());
            stringBuilder.append('(').append(this.b.getName());
            this.a = stringBuilder.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        a();
        q qVar = (q) obj;
        qVar.a();
        return this.a.equals(qVar.a);
    }

    q(Method method, p pVar, Class cls) {
        this.d = method;
        this.c = pVar;
        this.b = cls;
    }
}
