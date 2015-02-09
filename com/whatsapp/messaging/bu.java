package com.whatsapp.messaging;

class bu implements Runnable {
    final AnonymousClass_1 a;

    bu(AnonymousClass_1 anonymousClass_1) {
        this.a = anonymousClass_1;
    }

    public void run() {
        MessageService.b(this.a.a, false);
    }
}
