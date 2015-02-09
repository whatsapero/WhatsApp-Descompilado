package com.whatsapp;

public class d6 {
    public int a;
    public String b;
    public int c;
    public String d;
    public int e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        d6 d6Var = (d6) obj;
        if (this.b == null) {
            return d6Var.b == null;
        } else {
            return this.b.equals(d6Var.b);
        }
    }
}
