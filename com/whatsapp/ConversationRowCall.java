package com.whatsapp;

import android.content.Context;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;

public class ConversationRowCall extends ConversationRow {
    public void a(b bVar, boolean z) {
        if (this.w != bVar || z) {
            b(bVar);
        }
        super.a(bVar, z);
    }

    public ConversationRowCall(Context context, b bVar) {
        super(context, bVar);
    }

    private void b(b bVar) {
    }

    protected int l() {
        return R.layout.conversation_row_right_call;
    }

    protected int d() {
        return R.layout.conversation_row_left_call;
    }
}
