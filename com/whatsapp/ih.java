package com.whatsapp;

final class ih implements gw {
    final String[] a;

    public boolean a(String str) {
        int i = App.az;
        if (str == null) {
            return false;
        }
        String[] strArr = this.a;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (str.startsWith(strArr[i2])) {
                return true;
            }
            i2++;
            if (i != 0) {
                return false;
            }
        }
        return false;
    }

    ih(String[] strArr) {
        this.a = strArr;
    }
}
