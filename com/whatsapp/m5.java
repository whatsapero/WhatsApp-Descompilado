package com.whatsapp;

import java.util.Comparator;

class m5 implements Comparator {
    final c_ a;

    m5(c_ c_Var) {
        this.a = c_Var;
    }

    public int compare(Object obj, Object obj2) {
        return a((EmojiPicker$EmojiWeight) obj, (EmojiPicker$EmojiWeight) obj2);
    }

    public int a(EmojiPicker$EmojiWeight emojiPicker$EmojiWeight, EmojiPicker$EmojiWeight emojiPicker$EmojiWeight2) {
        return Float.compare(emojiPicker$EmojiWeight2.weight, emojiPicker$EmojiWeight.weight);
    }
}
