package com.google;

import java.util.Iterator;

class d5 implements Iterable {
    final long a;
    final a3 b;
    final CharSequence c;
    final c8 d;
    final String e;

    public Iterator iterator() {
        return new fl(this.d, this.c, this.e, this.b, this.a);
    }
}
