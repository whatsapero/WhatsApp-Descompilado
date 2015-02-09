package com.whatsapp;

import com.whatsapp.protocol.b;
import java.util.HashMap;

class s0 implements ams {
    final HashMap a;
    final Conversation b;

    s0(Conversation conversation, HashMap hashMap) {
        this.b = conversation;
        this.a = hashMap;
    }

    public void a() {
        int i = App.az;
        if (Conversation.H(this.b) && Conversation.p(this.b) > 0) {
            int a = a35.a(this.b.aS);
            if (this.b.aS.getCount() > a + 1) {
                b bVar = (b) this.b.aS.getItem(a + 1);
                for (b bVar2 : this.a.values()) {
                    if (bVar2.D >= bVar.D) {
                        Conversation.c(this.b, 0);
                        if (i == 0) {
                            break;
                        }
                    }
                    if (i != 0) {
                        break;
                    }
                }
            }
        }
        Conversation.i(this.b);
    }
}
