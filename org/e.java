package org;

public class e extends Exception {
    public static boolean a = false;
    private static final long serialVersionUID = 1;

    public e(String str, Throwable th) {
        super(str, th);
    }

    public e(String str) {
        super(str);
    }

    public e(Throwable th) {
        super(th);
    }
}
