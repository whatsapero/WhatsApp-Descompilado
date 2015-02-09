package com.whatsapp.fieldstats;

public enum a2 {
    A(0),
    B(1);
    public static final a2 A;
    public static final a2 B;
    private static final a2[] b;
    private final int a;

    private a2(int i) {
        this.a = i;
    }

    static {
        A = new a2("A", 0, 0);
        B = new a2("B", 1, 1);
        b = new a2[]{A, B};
    }

    public int getCode() {
        return this.a;
    }
}
