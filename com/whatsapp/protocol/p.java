package com.whatsapp.protocol;

public class p {
    public int a;
    public String b;

    public p(String str, int i) {
        if (str == null || !(i == 1 || i == 2 || i == 3 || i == 4)) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.b = str;
        this.a = i;
    }
}
