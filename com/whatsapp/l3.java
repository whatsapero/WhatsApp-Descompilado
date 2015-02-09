package com.whatsapp;

import android.os.ConditionVariable;

final class l3 {
    final ConditionVariable a;
    final ConditionVariable b;
    final int c;

    public void b() {
        if (this.a != null) {
            this.a.block(180000);
        }
        if (this.b != null && 1 == this.c) {
            this.b.block(180000);
        }
    }

    public void a() {
        if (this.b != null && this.c == 0) {
            this.b.open();
        }
    }

    l3(ConditionVariable conditionVariable, ConditionVariable conditionVariable2, int i) {
        this.a = conditionVariable;
        this.b = conditionVariable2;
        this.c = i;
    }
}
