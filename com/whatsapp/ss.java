package com.whatsapp;

import android.content.Context;
import com.whatsapp.protocol.b;
import java.text.Collator;
import java.util.Comparator;

public class ss implements Comparator {
    private final Context a;

    public int a(m8 m8Var, m8 m8Var2) {
        b bVar = null;
        b B = App.aJ.z(m8Var.e) ? App.aJ.B(m8Var.e) : null;
        if (App.aJ.z(m8Var2.e)) {
            bVar = App.aJ.B(m8Var2.e);
        }
        if (B == null && bVar == null) {
            Collator instance = Collator.getInstance();
            instance.setStrength(0);
            instance.setDecomposition(1);
            return instance.compare(m8Var.a(this.a), m8Var2.a(this.a));
        } else if (B == null) {
            return 1;
        } else {
            if (bVar == null) {
                return -1;
            }
            if (B.D == bVar.D) {
                return m8Var.a(this.a).compareTo(m8Var2.a(this.a));
            }
            return B.D < bVar.D ? 1 : -1;
        }
    }

    public int compare(Object obj, Object obj2) {
        return a((m8) obj, (m8) obj2);
    }

    public ss(Context context) {
        this.a = context;
    }
}
