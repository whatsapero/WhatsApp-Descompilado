package com.whatsapp;

class bv implements Runnable {
    final avo a;

    public void run() {
        LocationPicker.e(this.a.a).a(LocationPicker.l(this.a.a).getMyLocation());
        LocationPicker.e(this.a.a).getController().setZoom(18);
    }

    bv(avo com_whatsapp_avo) {
        this.a = com_whatsapp_avo;
    }
}
