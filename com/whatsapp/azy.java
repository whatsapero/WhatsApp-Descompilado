package com.whatsapp;

public class azy extends azn {
    public int c(int i) {
        int i2 = i % 100;
        if (i == 1) {
            return 2;
        }
        return (i == 0 || (i2 >= 1 && i2 <= 19)) ? 8 : 0;
    }
}
