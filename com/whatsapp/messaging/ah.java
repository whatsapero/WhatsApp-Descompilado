package com.whatsapp.messaging;

class ah implements Runnable {
    final MessageService a;

    public void run() {
        MessageService.b(this.a, false);
    }

    ah(MessageService messageService) {
        this.a = messageService;
    }
}
