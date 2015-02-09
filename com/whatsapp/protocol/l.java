package com.whatsapp.protocol;

public class l extends Exception {
    private static final long serialVersionUID = 1;
    String a;

    public l(String str) {
        super(str);
    }

    public String a() {
        return this.a;
    }

    public l(String str, String str2) {
        super(str);
        this.a = str2;
    }
}
