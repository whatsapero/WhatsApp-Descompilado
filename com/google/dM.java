package com.google;

import java.util.NoSuchElementException;

class dm implements cR {
    private final int a;
    private int b;
    final gX c;

    private dm(gX gXVar) {
        this.c = gXVar;
        this.b = 0;
        this.a = gXVar.e();
    }

    public boolean hasNext() {
        try {
            return this.b < this.a;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public Byte a() {
        return Byte.valueOf(a());
    }

    dm(gX gXVar, ci ciVar) {
        this(gXVar);
    }

    public Object next() {
        return a();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public byte a() {
        try {
            byte[] bArr = this.c.c;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
