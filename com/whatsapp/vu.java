package com.whatsapp;

import java.util.Date;
import org.whispersystems.libaxolotl.b2;

public final class vu {
    private final Date a;
    private final b2 b;

    public vu(b2 b2Var, Date date) {
        this.b = b2Var;
        this.a = date;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode *= 31;
        if (this.a != null) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }

    public Date a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vu vuVar = (vu) obj;
        if (this.a == null ? vuVar.a != null : !this.a.equals(vuVar.a)) {
            return false;
        }
        if (this.b != null) {
            if (this.b.equals(vuVar.b)) {
                return true;
            }
        } else if (vuVar.b == null) {
            return true;
        }
        return false;
    }
}
