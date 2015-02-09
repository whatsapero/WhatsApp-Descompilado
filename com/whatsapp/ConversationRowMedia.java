package com.whatsapp;

import android.content.Context;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.ar;

public abstract class ConversationRowMedia extends ConversationRow {
    protected ar J;
    protected ar K;
    protected ar L;
    protected ar M;

    protected abstract void b(b bVar);

    public ConversationRowMedia(Context context, b bVar) {
        super(context, bVar);
        this.K = new qw(this);
        this.J = new qd(this);
        this.M = new qy(this);
        this.L = new qa(this);
    }

    protected int d() {
        return R.layout.conversation_row_media_left;
    }

    protected int l() {
        return R.layout.conversation_row_media_right;
    }
}
