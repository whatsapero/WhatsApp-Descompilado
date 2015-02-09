package com.whatsapp;

import java.util.Vector;

class m7 extends mz {
    final av8 j;

    m7(av8 com_whatsapp_av8, String str, String str2, Vector vector, int i) {
        this.j = com_whatsapp_av8;
        super(str, str2, vector, i);
    }

    public void a(String str) {
        if (NewGroup.a(this.j.a).m().exists()) {
            this.j.a.runOnUiThread(new md(this, str));
        }
        super.a(str);
    }
}
