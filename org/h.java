package org;

public class h extends Exception {
    public static int a = 0;
    private static final long serialVersionUID = 1;

    public h(String str, Throwable th) {
        super(str, th);
    }

    public h(String str) {
        super(str);
    }

    public h(Throwable th) {
        super(th);
    }
}
