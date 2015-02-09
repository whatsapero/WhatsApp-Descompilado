package com.whatsapp.util.undobar;

class e implements Runnable {
    final UndoBarController a;

    public void run() {
        if (UndoBarController.b(this.a) instanceof b) {
            ((b) UndoBarController.b(this.a)).a(UndoBarController.a(this.a));
        }
        UndoBarController.a(this.a, false);
    }

    e(UndoBarController undoBarController) {
        this.a = undoBarController;
    }
}
