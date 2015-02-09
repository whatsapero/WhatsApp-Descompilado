package com.whatsapp;

public class az1 extends azn {
    public int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 8;
        }
        return i == 6 ? 16 : 0;
    }
}
