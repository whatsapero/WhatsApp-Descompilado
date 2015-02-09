package com.whatsapp.util;

import android.os.Handler.Callback;
import android.os.Message;

public class ai implements Callback {
    private boolean a;

    public ai() {
        this.a = true;
    }

    public void a() {
        this.a = false;
    }

    public void b() {
        this.a = true;
    }

    public boolean handleMessage(Message message) {
        if (this.a) {
        }
        return this.a;
    }
}
