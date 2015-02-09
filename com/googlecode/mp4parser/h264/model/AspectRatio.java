package com.googlecode.mp4parser.h264.model;

public class AspectRatio {
    public static final AspectRatio Extended_SAR;
    private int value;

    static {
        Extended_SAR = new AspectRatio(255);
    }

    private AspectRatio(int value) {
        this.value = value;
    }

    public static AspectRatio fromValue(int value) {
        return value == Extended_SAR.value ? Extended_SAR : new AspectRatio(value);
    }

    public int getValue() {
        return this.value;
    }
}
