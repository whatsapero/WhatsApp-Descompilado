package com.whatsapp;

public class azr extends azn {
    public int c(int i) {
        if (i == 0) {
            return 1;
        }
        return (i % 10 != 1 || i % 100 == 11) ? 0 : 2;
    }
}
