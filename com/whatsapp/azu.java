package com.whatsapp;

public class azu extends azn {
    public int c(int i) {
        int i2 = i % 100;
        if (i == 1) {
            return 2;
        }
        if (i == 0 || (i2 >= 2 && i2 <= 10)) {
            return 8;
        }
        return (i2 < 11 || i2 > 19) ? 0 : 16;
    }
}
