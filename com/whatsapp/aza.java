package com.whatsapp;

public class aza extends azn {
    public int c(int i) {
        int i2 = i % 100;
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 4;
        }
        return (i2 < 3 || i2 > 4) ? 0 : 8;
    }
}
