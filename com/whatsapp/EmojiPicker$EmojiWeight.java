package com.whatsapp;

import java.io.Serializable;

class EmojiPicker$EmojiWeight implements Serializable {
    private static final long serialVersionUID = 1;
    int code;
    float weight;

    public EmojiPicker$EmojiWeight(int i, float f) {
        this.code = i;
        this.weight = f;
    }
}
