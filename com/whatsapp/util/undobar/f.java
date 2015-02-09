package com.whatsapp.util.undobar;

import android.view.View;
import android.view.View.OnClickListener;

class f implements OnClickListener {
    final UndoBarController a;

    f(UndoBarController undoBarController) {
        this.a = undoBarController;
    }

    public void onClick(View view) {
        if (UndoBarController.b(this.a) != null) {
            UndoBarController.b(this.a).b(UndoBarController.a(this.a));
        }
        UndoBarController.a(this.a, false);
    }
}
