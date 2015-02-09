package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.protocol.b;
import java.util.List;

class ra implements OnClickListener {
    final ConversationRow a;
    final Conversation b;
    final m8 c;
    final b d;
    final List e;

    ra(ConversationRow conversationRow, Conversation conversation, List list, m8 m8Var, b bVar) {
        this.a = conversationRow;
        this.b = conversation;
        this.e = list;
        this.c = m8Var;
        this.d = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.a(((asr) this.e.get(i)).a, this.c.a(), this.d);
    }
}
