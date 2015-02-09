package com.whatsapp;

class f8 implements Runnable {
    final MultipleContactPicker a;

    public void run() {
        this.a.getListView().setSelection(0);
    }

    f8(MultipleContactPicker multipleContactPicker) {
        this.a = multipleContactPicker;
    }
}
