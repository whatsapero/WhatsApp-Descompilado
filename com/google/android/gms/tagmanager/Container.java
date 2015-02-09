package com.google.android.gms.tagmanager;

public class Container {
    private final String aqm;
    private ct aqo;

    private synchronized ct pk() {
        return this.aqo;
    }

    void cr(String str) {
        pk().cr(str);
    }

    public String getContainerId() {
        return this.aqm;
    }

    void release() {
        this.aqo = null;
    }
}
