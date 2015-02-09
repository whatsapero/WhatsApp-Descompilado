package com.whatsapp;

import com.whatsapp.protocol.b9;
import java.util.Vector;

class mu extends mz {
    final GroupChatInfo j;

    mu(GroupChatInfo groupChatInfo, String str, String str2, Vector vector, int i, b9 b9Var) {
        this.j = groupChatInfo;
        super(str, str2, vector, i, b9Var);
    }

    public void a() {
        super.a();
        if (!this.j.isFinishing()) {
            GroupChatInfo.f(this.j).postDelayed(new afy(this), 300);
        }
    }

    public void a(int i) {
        this.j.runOnUiThread(new at9(this, i));
    }
}
