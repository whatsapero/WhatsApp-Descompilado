package com.whatsapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

class s6 implements w1 {
    File a;

    public s6(File file) {
        this.a = file;
    }

    public long c() {
        return this.a.length();
    }

    public InputStream b() {
        return new FileInputStream(this.a);
    }

    public String a() {
        return this.a.getName();
    }
}
