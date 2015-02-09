package com.whatsapp;

public class azd extends azn {
    public int c(int i) {
        int i2 = i % 100;
        int i3 = i % 10;
        if (i == 1) {
            return 2;
        }
        return (i3 < 2 || i3 > 4 || ((i2 >= 12 && i2 <= 14) || (i2 >= 22 && i2 <= 24))) ? 0 : 8;
    }
}
