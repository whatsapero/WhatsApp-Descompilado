package com.whatsapp.protocol;

public final class k {
    public final String a;
    public final String b;

    public k(String str, String str2) {
        if (str2 == null || str == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.b = str;
        this.a = str2;
    }
}
