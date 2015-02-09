package com.whatsapp;

public class azf extends azn {
    public int c(int i) {
        int i2 = i % 100;
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i2 < 3 || i2 > 10) {
            return (i2 < 11 || i2 > 99) ? 0 : 16;
        } else {
            return 8;
        }
    }
}
