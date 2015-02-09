package com.whatsapp;

class i7 implements Runnable {
    final EmojiPopupWindow$2 a;

    public void run() {
        this.a.a.setOnDismissListener(null);
        this.a.a.dismiss();
        this.a.a.a(a11.a(this.a.a));
    }

    i7(EmojiPopupWindow$2 emojiPopupWindow$2) {
        this.a = emojiPopupWindow$2;
    }
}
