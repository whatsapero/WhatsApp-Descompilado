package com.whatsapp;

public class azg extends azn {
    public int c(int i) {
        boolean z = true;
        boolean z2 = azn.a;
        int i2 = i % 100;
        int i3 = i % 10;
        if (i3 == 1 && (i2 < 11 || i2 > 19)) {
            return 2;
        }
        if (i3 >= 2 && i3 <= 9 && (i2 < 11 || i2 > 19)) {
            return 8;
        }
        if (!z2) {
            return 0;
        }
        if (DialogToastActivity.i) {
            z = false;
        }
        DialogToastActivity.i = z;
        return 0;
    }
}
